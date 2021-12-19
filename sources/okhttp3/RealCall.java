package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import k.ab;
import k.d;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

/* access modifiers changed from: package-private */
public final class RealCall implements Call {
    final OkHttpClient client;
    public EventListener eventListener;
    private boolean executed;
    final boolean forWebSocket;
    final Request originalRequest;
    final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;
    final d timeout;

    static {
        Covode.recordClassIndex(106169);
    }

    /* access modifiers changed from: package-private */
    public final class AsyncCall extends NamedRunnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final Callback responseCallback;

        /* access modifiers changed from: package-private */
        public final RealCall get() {
            return RealCall.this;
        }

        /* access modifiers changed from: package-private */
        public final Request request() {
            return RealCall.this.originalRequest;
        }

        static {
            Covode.recordClassIndex(106171);
        }

        /* access modifiers changed from: package-private */
        public final String host() {
            return RealCall.this.originalRequest.url().host();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0024 A[Catch:{ all -> 0x007f }] */
        @Override // okhttp3.internal.NamedRunnable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void execute() {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall.AsyncCall.execute():void");
        }

        /* access modifiers changed from: package-private */
        public final void executeOn(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e2) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e2);
                RealCall.this.eventListener.callFailed(RealCall.this, interruptedIOException);
                this.responseCallback.onFailure(RealCall.this, interruptedIOException);
                RealCall.this.client.dispatcher().finished(this);
            } catch (Throwable th) {
                RealCall.this.client.dispatcher().finished(this);
                throw th;
            }
        }

        AsyncCall(Callback callback) {
            super("OkHttp %s", RealCall.this.redactedUrl());
            this.responseCallback = callback;
        }
    }

    @Override // okhttp3.Call
    public final Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.Call
    public final ab timeout() {
        return this.timeout;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        this.retryAndFollowUpInterceptor.cancel();
    }

    @Override // okhttp3.Call
    public final boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }

    /* access modifiers changed from: package-private */
    public final StreamAllocation streamAllocation() {
        return this.retryAndFollowUpInterceptor.streamAllocation();
    }

    private void captureCallStackTrace() {
        this.retryAndFollowUpInterceptor.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
    }

    @Override // okhttp3.Call
    public final synchronized boolean isExecuted() {
        boolean z;
        MethodCollector.i(3746);
        z = this.executed;
        MethodCollector.o(3746);
        return z;
    }

    /* access modifiers changed from: package-private */
    public final String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    @Override // okhttp3.Call, java.lang.Object
    public final RealCall clone() {
        return newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    /* access modifiers changed from: package-private */
    public final String toLoggableString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (isCanceled()) {
            str = "canceled ";
        } else {
            str = "";
        }
        StringBuilder append = sb.append(str);
        if (this.forWebSocket) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        return append.append(str2).append(" to ").append(redactedUrl()).toString();
    }

    @Override // okhttp3.Call
    public final Response execute() {
        MethodCollector.i(947);
        synchronized (this) {
            try {
                if (!this.executed) {
                    this.executed = true;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already Executed");
                    MethodCollector.o(947);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.o(947);
                throw th;
            }
        }
        captureCallStackTrace();
        this.timeout.enter();
        this.eventListener.callStart(this);
        try {
            this.client.dispatcher().executed(this);
            Response responseWithInterceptorChain = getResponseWithInterceptorChain();
            if (responseWithInterceptorChain != null) {
                this.client.dispatcher().finished(this);
                MethodCollector.o(947);
                return responseWithInterceptorChain;
            }
            IOException iOException = new IOException("Canceled");
            MethodCollector.o(947);
            throw iOException;
        } catch (IOException e2) {
            IOException timeoutExit = timeoutExit(e2);
            this.eventListener.callFailed(this, timeoutExit);
            MethodCollector.o(947);
            throw timeoutExit;
        } catch (Throwable th2) {
            this.client.dispatcher().finished(this);
            MethodCollector.o(947);
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public final Response getResponseWithInterceptorChain() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.client.interceptors());
        arrayList.add(this.retryAndFollowUpInterceptor);
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.internalCache()));
        arrayList.add(new ConnectInterceptor(this.client));
        if (!this.forWebSocket) {
            arrayList.addAll(this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        Response proceed = new RealInterceptorChain(arrayList, null, null, null, 0, this.originalRequest, this, this.eventListener, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
        if (!this.retryAndFollowUpInterceptor.isCanceled()) {
            return proceed;
        }
        Util.closeQuietly(proceed);
        throw new IOException("Canceled");
    }

    /* access modifiers changed from: package-private */
    public final IOException timeoutExit(IOException iOException) {
        if (!this.timeout.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // okhttp3.Call
    public final void enqueue(Callback callback) {
        MethodCollector.i(3743);
        synchronized (this) {
            try {
                if (!this.executed) {
                    this.executed = true;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already Executed");
                    MethodCollector.o(3743);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.o(3743);
                throw th;
            }
        }
        captureCallStackTrace();
        this.eventListener.callStart(this);
        this.client.dispatcher().enqueue(new AsyncCall(callback));
        MethodCollector.o(3743);
    }

    static RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        RealCall realCall = new RealCall(okHttpClient, request, z);
        realCall.eventListener = okHttpClient.eventListenerFactory().create(realCall);
        return realCall;
    }

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(okHttpClient, z);
        AnonymousClass1 r3 = new d() {
            /* class okhttp3.RealCall.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106170);
            }

            @Override // k.d
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        this.timeout = r3;
        r3.timeout((long) okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }
}
