package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http2.ConnectionShutdownException;

public final class RetryAndFollowUpInterceptor implements Interceptor {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private final boolean forWebSocket;
    private volatile StreamAllocation streamAllocation;

    static {
        Covode.recordClassIndex(106237);
    }

    private boolean needRedirectToPost(int i2) {
        return i2 == 308 || i2 == 307;
    }

    public final boolean isCanceled() {
        return this.canceled;
    }

    public final StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }

    public final void cancel() {
        this.canceled = true;
        StreamAllocation streamAllocation2 = this.streamAllocation;
        if (streamAllocation2 != null) {
            streamAllocation2.cancel();
        }
    }

    public final void setCallStackTrace(Object obj) {
        this.callStackTrace = obj;
    }

    private Address createAddress(HttpUrl httpUrl) {
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        SSLSocketFactory sSLSocketFactory = null;
        if (httpUrl.isHttps()) {
            sSLSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        boolean z;
        Request request = chain.request();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Call call = realInterceptorChain.call();
        EventListener eventListener = realInterceptorChain.eventListener();
        StreamAllocation streamAllocation2 = new StreamAllocation(this.client.connectionPool(), createAddress(request.url()), call, eventListener, this.callStackTrace);
        this.streamAllocation = streamAllocation2;
        Response response = null;
        int i2 = 0;
        while (!this.canceled) {
            try {
                Response proceed = realInterceptorChain.proceed(request, streamAllocation2, null, null);
                if (response != null) {
                    proceed = proceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                }
                try {
                    request = followUpRequest(proceed, streamAllocation2.route());
                    if (request == null) {
                        streamAllocation2.release();
                        return proceed;
                    }
                    Util.closeQuietly(proceed.body());
                    i2++;
                    if (i2 > 20) {
                        streamAllocation2.release();
                        throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(i2)));
                    } else if (!(request.body() instanceof UnrepeatableRequestBody)) {
                        if (!sameConnection(proceed, request.url())) {
                            streamAllocation2.release();
                            streamAllocation2 = new StreamAllocation(this.client.connectionPool(), createAddress(request.url()), call, eventListener, this.callStackTrace);
                            this.streamAllocation = streamAllocation2;
                        } else if (streamAllocation2.codec() != null) {
                            throw new IllegalStateException("Closing the body of " + proceed + " didn't close its backing stream. Bad interceptor?");
                        }
                        response = proceed;
                    } else {
                        streamAllocation2.release();
                        throw new HttpRetryException("Cannot retry streamed HTTP body", proceed.code());
                    }
                } catch (IOException e2) {
                    streamAllocation2.release();
                    throw e2;
                }
            } catch (RouteException e3) {
                if (!recover(e3.getLastConnectException(), streamAllocation2, false, request)) {
                    throw e3.getFirstConnectException();
                }
            } catch (IOException e4) {
                if (!(e4 instanceof ConnectionShutdownException)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!recover(e4, streamAllocation2, z, request)) {
                    throw e4;
                }
            } catch (Throwable th) {
                streamAllocation2.streamFailed(null);
                streamAllocation2.release();
                throw th;
            }
        }
        streamAllocation2.release();
        throw new IOException("Canceled");
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient, boolean z) {
        this.client = okHttpClient;
        this.forWebSocket = z;
    }

    private boolean requestIsUnrepeatable(IOException iOException, Request request) {
        if ((request.body() instanceof UnrepeatableRequestBody) || (iOException instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    private int retryAfter(Response response, int i2) {
        String header = response.header("Retry-After");
        if (header == null) {
            return i2;
        }
        if (header.matches("\\d+")) {
            return Integer.valueOf(header).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean sameConnection(Response response, HttpUrl httpUrl) {
        HttpUrl url = response.request().url();
        if (!url.host().equals(httpUrl.host()) || url.port() != httpUrl.port() || !url.scheme().equals(httpUrl.scheme())) {
            return false;
        }
        return true;
    }

    private Request followUpRequest(Response response, Route route) {
        String header;
        HttpUrl resolve;
        if (response != null) {
            int code = response.code();
            String method = response.request().method();
            boolean z = false;
            RequestBody requestBody = null;
            if (!(code == 307 || code == 308)) {
                if (code == 401) {
                    return this.client.authenticator().authenticate(route, response);
                }
                if (code != 503) {
                    if (code != 407) {
                        if (code != 408) {
                            switch (code) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    break;
                                default:
                                    return null;
                            }
                        } else if (!this.client.retryOnConnectionFailure() || (response.request().body() instanceof UnrepeatableRequestBody)) {
                            return null;
                        } else {
                            if ((response.priorResponse() == null || response.priorResponse().code() != 408) && retryAfter(response, 0) <= 0) {
                                return response.request();
                            }
                            return null;
                        }
                    } else if (route.proxy().type() == Proxy.Type.HTTP) {
                        return this.client.proxyAuthenticator().authenticate(route, response);
                    } else {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                } else if ((response.priorResponse() == null || response.priorResponse().code() != 503) && retryAfter(response, Integer.MAX_VALUE) == 0) {
                    return response.request();
                } else {
                    return null;
                }
            }
            if (!this.client.followRedirects() || (header = response.header(q.f30918b)) == null || (resolve = response.request().url().resolve(header)) == null) {
                return null;
            }
            if (!resolve.scheme().equals(response.request().url().scheme()) && !this.client.followSslRedirects()) {
                return null;
            }
            Request.Builder newBuilder = response.request().newBuilder();
            if (HttpMethod.permitsRequestBody(method)) {
                if (HttpMethod.redirectsWithBody(method) || needRedirectToPost(code)) {
                    z = true;
                }
                if (needRedirectToPost(code) || !HttpMethod.redirectsToGet(method)) {
                    if (z) {
                        requestBody = response.request().body();
                    }
                    newBuilder.method(method, requestBody);
                } else {
                    newBuilder.method("GET", null);
                }
                if (!z) {
                    newBuilder.removeHeader("Transfer-Encoding");
                    newBuilder.removeHeader("Content-Length");
                    newBuilder.removeHeader("Content-Type");
                }
            }
            if (!sameConnection(response, resolve)) {
                newBuilder.removeHeader("Authorization");
            }
            return newBuilder.url(resolve).build();
        }
        throw new IllegalStateException();
    }

    private boolean recover(IOException iOException, StreamAllocation streamAllocation2, boolean z, Request request) {
        streamAllocation2.streamFailed(iOException);
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((!z || !requestIsUnrepeatable(iOException, request)) && isRecoverable(iOException, z) && streamAllocation2.hasMoreRoutes()) {
            return true;
        }
        return false;
    }
}
