package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import java.net.ProtocolException;
import k.f;
import k.g;
import k.k;
import k.q;
import k.y;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;

public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    static {
        Covode.recordClassIndex(106227);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        return okhttp3_internal_http_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_I18nOkHttpCheckLancet_intercept(this, chain);
    }

    /* access modifiers changed from: package-private */
    public static final class CountingSink extends k {
        long successfulCount;

        static {
            Covode.recordClassIndex(106228);
        }

        CountingSink(y yVar) {
            super(yVar);
        }

        @Override // k.y, k.k
        public final void write(f fVar, long j2) {
            super.write(fVar, j2);
            this.successfulCount += j2;
        }
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    public final Response CallServerInterceptor__intercept$___twin___(Interceptor.Chain chain) {
        Response build;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        HttpCodec httpStream = realInterceptorChain.httpStream();
        StreamAllocation streamAllocation = realInterceptorChain.streamAllocation();
        RealConnection realConnection = (RealConnection) realInterceptorChain.connection();
        Request request = realInterceptorChain.request();
        long currentTimeMillis = System.currentTimeMillis();
        realInterceptorChain.eventListener().requestHeadersStart(realInterceptorChain.call());
        httpStream.writeRequestHeaders(request);
        realInterceptorChain.eventListener().requestHeadersEnd(realInterceptorChain.call(), request);
        Response.Builder builder = null;
        if (HttpMethod.permitsRequestBody(request.method()) && request.body() != null) {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                httpStream.flushRequest();
                realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
                builder = httpStream.readResponseHeaders(true);
                if (builder != null) {
                    if (!realConnection.isMultiplexed()) {
                        streamAllocation.noNewStreams();
                    }
                }
            }
            realInterceptorChain.eventListener().requestBodyStart(realInterceptorChain.call());
            CountingSink countingSink = new CountingSink(httpStream.createRequestBody(request, request.body().contentLength()));
            g a2 = q.a(countingSink);
            request.body().writeTo(a2);
            a2.close();
            realInterceptorChain.eventListener().requestBodyEnd(realInterceptorChain.call(), countingSink.successfulCount);
        }
        httpStream.finishRequest();
        if (builder == null) {
            realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
            builder = httpStream.readResponseHeaders(false);
        }
        Response build2 = builder.request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build2.code();
        if (code == 100) {
            build2 = httpStream.readResponseHeaders(false).request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build2.code();
        }
        realInterceptorChain.eventListener().responseHeadersEnd(realInterceptorChain.call(), build2);
        if (!this.forWebSocket || code != 101) {
            build = build2.newBuilder().body(httpStream.openResponseBody(build2)).build();
        } else {
            build = build2.newBuilder().body(Util.EMPTY_RESPONSE).build();
        }
        if ("close".equalsIgnoreCase(build.request().header("Connection")) || "close".equalsIgnoreCase(build.header("Connection"))) {
            streamAllocation.noNewStreams();
        }
        if ((code != 204 && code != 205) || build.body().contentLength() <= 0) {
            return build;
        }
        throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + build.body().contentLength());
    }

    public static Response okhttp3_internal_http_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_I18nOkHttpCheckLancet_intercept(CallServerInterceptor callServerInterceptor, Interceptor.Chain chain) {
        return callServerInterceptor.CallServerInterceptor__intercept$___twin___(chain);
    }
}
