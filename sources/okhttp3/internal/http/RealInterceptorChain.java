package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;

public final class RealInterceptorChain implements Interceptor.Chain {
    private final Call call;
    private int calls;
    private final int connectTimeout;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final HttpCodec httpCodec;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeout;
    private final Request request;
    private final StreamAllocation streamAllocation;
    private final int writeTimeout;

    static {
        Covode.recordClassIndex(106234);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    public final int connectTimeoutMillis() {
        return this.connectTimeout;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Connection connection() {
        return this.connection;
    }

    public final EventListener eventListener() {
        return this.eventListener;
    }

    public final HttpCodec httpStream() {
        return this.httpCodec;
    }

    @Override // okhttp3.Interceptor.Chain
    public final int readTimeoutMillis() {
        return this.readTimeout;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Request request() {
        return this.request;
    }

    public final StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }

    @Override // okhttp3.Interceptor.Chain
    public final int writeTimeoutMillis() {
        return this.writeTimeout;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response proceed(Request request2) {
        return proceed(request2, this.streamAllocation, this.httpCodec, this.connection);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Interceptor.Chain withConnectTimeout(int i2, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, Util.checkDuration("timeout", (long) i2, timeUnit), this.readTimeout, this.writeTimeout);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Interceptor.Chain withReadTimeout(int i2, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, this.connectTimeout, Util.checkDuration("timeout", (long) i2, timeUnit), this.writeTimeout);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Interceptor.Chain withWriteTimeout(int i2, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, this.connectTimeout, this.readTimeout, Util.checkDuration("timeout", (long) i2, timeUnit));
    }

    public final Response proceed(Request request2, StreamAllocation streamAllocation2, HttpCodec httpCodec2, RealConnection realConnection) {
        if (this.index < this.interceptors.size()) {
            this.calls++;
            if (this.httpCodec != null && !this.connection.supportsUrl(request2.url())) {
                throw new IllegalStateException("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port");
            } else if (this.httpCodec == null || this.calls <= 1) {
                RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.interceptors, streamAllocation2, httpCodec2, realConnection, this.index + 1, request2, this.call, this.eventListener, this.connectTimeout, this.readTimeout, this.writeTimeout);
                Interceptor interceptor = this.interceptors.get(this.index);
                Response intercept = interceptor.intercept(realInterceptorChain);
                if (httpCodec2 != null && this.index + 1 < this.interceptors.size() && realInterceptorChain.calls != 1) {
                    throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
                } else if (intercept == null) {
                    throw new NullPointerException("interceptor " + interceptor + " returned null");
                } else if (intercept.body() != null) {
                    return intercept;
                } else {
                    throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public RealInterceptorChain(List<Interceptor> list, StreamAllocation streamAllocation2, HttpCodec httpCodec2, RealConnection realConnection, int i2, Request request2, Call call2, EventListener eventListener2, int i3, int i4, int i5) {
        this.interceptors = list;
        this.connection = realConnection;
        this.streamAllocation = streamAllocation2;
        this.httpCodec = httpCodec2;
        this.index = i2;
        this.request = request2;
        this.call = call2;
        this.eventListener = eventListener2;
        this.connectTimeout = i3;
        this.readTimeout = i4;
        this.writeTimeout = i5;
    }
}
