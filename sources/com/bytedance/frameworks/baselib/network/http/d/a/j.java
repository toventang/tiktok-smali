package com.bytedance.frameworks.baselib.network.http.d.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

public class j extends EventListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f29245a;

    /* renamed from: b  reason: collision with root package name */
    private final EventListener f29246b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29247c = j.class.getSimpleName();

    static {
        Covode.recordClassIndex(17084);
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        super.callEnd(call);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.callEnd(call);
        }
        this.f29245a.p = System.currentTimeMillis();
        this.f29245a.K = d.IDLE;
        this.f29245a.N = p.SUCCESS;
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        super.callStart(call);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.callStart(call);
        }
        this.f29245a.f29248a = System.currentTimeMillis();
        this.f29245a.N = p.IO_PENDING;
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        super.requestBodyStart(call);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.requestBodyStart(call);
        }
        this.f29245a.f29257j = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        super.requestHeadersStart(call);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.requestHeadersStart(call);
        }
        this.f29245a.K = d.SENDING_REQUEST;
        this.f29245a.f29255h = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        super.responseBodyStart(call);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.responseBodyStart(call);
        }
        this.f29245a.K = d.READING_RESPONSE;
        this.f29245a.n = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        super.responseHeadersStart(call);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.responseHeadersStart(call);
        }
        this.f29245a.f29259l = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        super.secureConnectStart(call);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.secureConnectStart(call);
        }
        this.f29245a.f29253f = System.currentTimeMillis();
        this.f29245a.K = d.SSL_HANDSHAKE;
    }

    private static int a(IOException iOException) {
        if (iOException instanceof SSLHandshakeException) {
            return -148;
        }
        if (iOException instanceof SSLKeyException) {
            return -149;
        }
        if (iOException instanceof SSLProtocolException) {
            return -107;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -153;
        }
        if (iOException instanceof UnknownHostException) {
            return -105;
        }
        if (iOException instanceof ConnectException) {
            return -104;
        }
        if (iOException instanceof PortUnreachableException) {
            return -108;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -109;
        }
        if (iOException instanceof BindException) {
            return -147;
        }
        if (iOException instanceof MalformedURLException) {
            return -300;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -118;
        }
        if ((iOException instanceof ProtocolException) || (iOException instanceof HttpRetryException) || (iOException instanceof UnknownServiceException) || !"java.io.IOException: Exception in connect".equals(iOException.getMessage())) {
            return -1;
        }
        return -15;
    }

    public j(EventListener eventListener, k kVar) {
        this.f29246b = eventListener;
        this.f29245a = kVar;
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        super.connectionReleased(call, connection);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.connectionReleased(call, connection);
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        super.dnsStart(call, str);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.dnsStart(call, str);
        }
        this.f29245a.f29249b = System.currentTimeMillis();
        this.f29245a.K = d.RESOLVING_HOST;
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j2) {
        super.requestBodyEnd(call, j2);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.requestBodyEnd(call, j2);
        }
        this.f29245a.f29258k = System.currentTimeMillis();
        this.f29245a.x = j2;
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j2) {
        super.responseBodyEnd(call, j2);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.responseBodyEnd(call, j2);
        }
        this.f29245a.o = System.currentTimeMillis();
        this.f29245a.A = j2;
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        super.secureConnectEnd(call, handshake);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.secureConnectEnd(call, handshake);
        }
        this.f29245a.f29254g = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        super.callFailed(call, iOException);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.callFailed(call, iOException);
        }
        this.f29245a.p = System.currentTimeMillis();
        this.f29245a.K = d.IDLE;
        if ("Canceled".equals(iOException.getMessage())) {
            this.f29245a.N = p.CANCELED;
        } else {
            this.f29245a.N = p.FAILED;
        }
        this.f29245a.M = a(iOException);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        super.requestHeadersEnd(call, request);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.requestHeadersEnd(call, request);
        }
        this.f29245a.f29256i = System.currentTimeMillis();
        if (request != null) {
            this.f29245a.y = request.headers();
        }
        this.f29245a.K = d.WAITING_FOR_RESPONSE;
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.connectionAcquired(call, connection);
        }
        if (connection != null) {
            if (!(connection.socket() == null || connection.socket().getInetAddress() == null || connection.socket().getInetAddress().getHostAddress() == null)) {
                this.f29245a.E = connection.socket().getInetAddress().getHostAddress();
            }
            this.f29245a.F = connection.socket();
        }
        this.f29245a.q = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        super.responseHeadersEnd(call, response);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.responseHeadersEnd(call, response);
        }
        this.f29245a.f29260m = System.currentTimeMillis();
        if (this.f29245a.f29254g != -1) {
            this.f29245a.u = c.HANDSHAKE_FULL;
        } else {
            this.f29245a.u = c.HANDSHAKE_RESUME;
        }
        if (response != null) {
            this.f29245a.z = response.code();
            this.f29245a.B = response.protocol();
            if (response.handshake() != null) {
                this.f29245a.v = response.handshake().tlsVersion();
                this.f29245a.w = response.handshake().cipherSuite();
            }
            if (response.isRedirect()) {
                this.f29245a.I++;
                m mVar = new m();
                mVar.f29263a = response.code();
                mVar.f29264b = response.request().method();
                String header = response.header("location");
                if (!TextUtils.isEmpty(header)) {
                    mVar.f29265c = header;
                }
                this.f29245a.J.add(mVar);
            }
            if (response.isSuccessful()) {
                String header2 = response.header("content-type");
                if (!TextUtils.isEmpty(header2)) {
                    this.f29245a.H = header2;
                }
            }
            this.f29245a.G = response.headers();
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.connectStart(call, inetSocketAddress, proxy);
        }
        this.f29245a.f29251d = System.currentTimeMillis();
        this.f29245a.K = d.CONNECTING;
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.dnsEnd(call, str, list);
        }
        this.f29245a.f29250c = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.connectEnd(call, inetSocketAddress, proxy, protocol);
        }
        this.f29245a.f29252e = System.currentTimeMillis();
        if (proxy != null) {
            this.f29245a.t = proxy.type();
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        EventListener eventListener = this.f29246b;
        if (eventListener != null) {
            eventListener.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        }
        if (inetSocketAddress != null) {
            this.f29245a.s.add(new Pair<>(inetSocketAddress, Integer.valueOf(a(iOException))));
        }
    }
}
