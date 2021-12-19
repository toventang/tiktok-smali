package com.bytedance.retrofit2;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.c.b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public class SsHttpCall<T> implements b<T>, l, m {
    public static a sThrottleControl;
    private long appCallTime;
    public final Object[] args;
    private final CallServerInterceptor callServerInterceptor;
    public Request originalRequest;
    public Throwable preBuildURLException;
    public final t<T> serviceMethod;

    public interface a {
        static {
            Covode.recordClassIndex(25954);
        }

        int a(String str);

        int a(String str, String str2);

        boolean a();

        boolean b();

        boolean b(String str);
    }

    static {
        Covode.recordClassIndex(25951);
    }

    @Override // com.bytedance.retrofit2.b
    public u execute() {
        return com_bytedance_retrofit2_SsHttpCall_com_ss_android_ugc_aweme_net_lancet_NetIOCheckLancet_execute(this);
    }

    @Override // com.bytedance.retrofit2.b
    public void cancel() {
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 != null) {
            callServerInterceptor2.cancel();
        }
    }

    @Override // com.bytedance.retrofit2.l
    public void doCollect() {
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 != null) {
            callServerInterceptor2.doCollect();
        }
    }

    public s getRetrofitMetrics() {
        return this.serviceMethod.p;
    }

    @Override // com.bytedance.retrofit2.b, java.lang.Object
    public SsHttpCall<T> clone() {
        return new SsHttpCall<>(this.serviceMethod, this.args);
    }

    @Override // com.bytedance.retrofit2.m
    public Object getRequestInfo() {
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 != null) {
            return callServerInterceptor2.getRequestInfo();
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.b
    public boolean isCanceled() {
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 == null || !callServerInterceptor2.isCanceled()) {
            return false;
        }
        return true;
    }

    public synchronized boolean isExecuted() {
        MethodCollector.i(54);
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 == null || !callServerInterceptor2.isExecuted()) {
            MethodCollector.o(54);
            return false;
        }
        MethodCollector.o(54);
        return true;
    }

    /* access modifiers changed from: package-private */
    public u getResponseWithInterceptorChain() {
        s sVar = this.serviceMethod.p;
        sVar.q = SystemClock.uptimeMillis();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.serviceMethod.f42607e);
        linkedList.add(this.callServerInterceptor);
        sVar.f42596g = this.appCallTime;
        sVar.f42597h = System.currentTimeMillis();
        this.originalRequest.setMetrics(sVar);
        u a2 = new b(linkedList, 0, this.originalRequest, this, sVar).a(this.originalRequest);
        a2.f42632d = sVar;
        return a2;
    }

    @Override // com.bytedance.retrofit2.b
    public Request request() {
        Request request;
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 != null && (request = callServerInterceptor2.request()) != null) {
            return request;
        }
        if (this.originalRequest == null) {
            try {
                s sVar = this.serviceMethod.p;
                sVar.r = SystemClock.uptimeMillis();
                this.originalRequest = this.serviceMethod.a(this.args);
                sVar.s = SystemClock.uptimeMillis();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException("Unable to create request.", e3);
            }
        }
        return this.originalRequest;
    }

    public u<T> SsHttpCall__execute$___twin___() {
        Request request;
        String str;
        MethodCollector.i(49);
        s sVar = this.serviceMethod.p;
        sVar.o = SystemClock.uptimeMillis();
        this.appCallTime = System.currentTimeMillis();
        sVar.r = SystemClock.uptimeMillis();
        this.originalRequest = this.serviceMethod.a(this.args);
        sVar.s = SystemClock.uptimeMillis();
        a aVar = sThrottleControl;
        if (aVar != null) {
            int i2 = 0;
            if (aVar.a()) {
                Request request2 = this.originalRequest;
                if (request2 != null && !TextUtils.isEmpty(request2.getPath()) && sThrottleControl.b(this.originalRequest.getPath())) {
                    i2 = sThrottleControl.a(this.originalRequest.getPath());
                }
            } else if (sThrottleControl.b() && (request = this.originalRequest) != null) {
                List<com.bytedance.retrofit2.client.b> headers = request.headers("x-tt-request-tag");
                if (headers == null || headers.size() <= 0 || TextUtils.isEmpty(headers.get(0).f42472b)) {
                    str = "";
                } else {
                    str = headers.get(0).f42472b;
                }
                i2 = sThrottleControl.a(this.originalRequest.getUrl(), str);
            }
            long j2 = (long) i2;
            sVar.p = j2;
            Thread.sleep(j2);
        }
        u<T> responseWithInterceptorChain = getResponseWithInterceptorChain();
        MethodCollector.o(49);
        return responseWithInterceptorChain;
    }

    public static void setThrottleControl(a aVar) {
        sThrottleControl = aVar;
    }

    public T toResponseBody(TypedInput typedInput) {
        return (T) t.a(this.serviceMethod, typedInput);
    }

    public boolean setThrottleNetSpeed(long j2) {
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 != null) {
            return callServerInterceptor2.setThrottleNetSpeed(j2);
        }
        return false;
    }

    public static u com_bytedance_retrofit2_SsHttpCall_com_ss_android_ugc_aweme_net_lancet_NetIOCheckLancet_execute(SsHttpCall ssHttpCall) {
        String str;
        u<T> SsHttpCall__execute$___twin___ = ssHttpCall.SsHttpCall__execute$___twin___();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            try {
                Field declaredField = u.class.getDeclaredField("a");
                declaredField.setAccessible(true);
                str = ((c) declaredField.get(SsHttpCall__execute$___twin___)).f42473a;
            } catch (Exception unused) {
                str = "";
            }
            com.bytedance.services.apm.api.a.a(new Throwable(), "do network IO on UI thread，url=".concat(String.valueOf(str)));
        }
        return SsHttpCall__execute$___twin___;
    }

    @Override // com.bytedance.retrofit2.b
    public void enqueue(final d<T> dVar) {
        final j jVar;
        final s sVar = this.serviceMethod.p;
        sVar.n = SystemClock.uptimeMillis();
        this.appCallTime = System.currentTimeMillis();
        Objects.requireNonNull(dVar, "callback == null");
        CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
        if (callServerInterceptor2 == null || !callServerInterceptor2.isExecuted()) {
            final Executor executor = this.serviceMethod.f42608f;
            if (dVar instanceof j) {
                jVar = (j) dVar;
            } else {
                jVar = null;
            }
            final AnonymousClass1 r1 = new v() {
                /* class com.bytedance.retrofit2.SsHttpCall.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(25952);
                }

                @Override // com.bytedance.retrofit2.v
                public final int a() {
                    return SsHttpCall.this.serviceMethod.f42609g;
                }

                @Override // com.bytedance.retrofit2.v
                public final boolean b() {
                    return SsHttpCall.this.serviceMethod.f42612j;
                }

                public final void run() {
                    try {
                        if (SsHttpCall.this.preBuildURLException == null) {
                            if (SsHttpCall.this.originalRequest == null) {
                                sVar.r = SystemClock.uptimeMillis();
                                SsHttpCall ssHttpCall = SsHttpCall.this;
                                ssHttpCall.originalRequest = ssHttpCall.serviceMethod.a(SsHttpCall.this.args);
                                sVar.s = SystemClock.uptimeMillis();
                            }
                            u<T> responseWithInterceptorChain = SsHttpCall.this.getResponseWithInterceptorChain();
                            try {
                                dVar.a(SsHttpCall.this, responseWithInterceptorChain);
                                j jVar = jVar;
                                if (jVar != null) {
                                    jVar.b(SsHttpCall.this, responseWithInterceptorChain);
                                }
                            } catch (Throwable unused) {
                            }
                        } else {
                            throw SsHttpCall.this.preBuildURLException;
                        }
                    } catch (Throwable unused2) {
                    }
                }

                @Override // com.bytedance.retrofit2.v
                public final int c() {
                    String str;
                    int i2 = 0;
                    if (SsHttpCall.sThrottleControl != null) {
                        if (SsHttpCall.sThrottleControl.a()) {
                            if (SsHttpCall.this.originalRequest != null && !TextUtils.isEmpty(SsHttpCall.this.originalRequest.getPath()) && SsHttpCall.sThrottleControl.b(SsHttpCall.this.originalRequest.getPath())) {
                                i2 = SsHttpCall.sThrottleControl.a(SsHttpCall.this.originalRequest.getPath());
                            }
                        } else if (SsHttpCall.sThrottleControl.b() && SsHttpCall.this.originalRequest != null) {
                            List<com.bytedance.retrofit2.client.b> headers = SsHttpCall.this.originalRequest.headers("x-tt-request-tag");
                            if (headers == null || headers.size() <= 0 || TextUtils.isEmpty(headers.get(0).f42472b)) {
                                str = "";
                            } else {
                                str = headers.get(0).f42472b;
                            }
                            i2 = SsHttpCall.sThrottleControl.a(SsHttpCall.this.originalRequest.getUrl(), str);
                        }
                    }
                    sVar.p = (long) i2;
                    return i2;
                }
            };
            a aVar = sThrottleControl;
            if (aVar == null || (!aVar.a() && !sThrottleControl.b())) {
                executor.execute(r1);
            } else {
                executor.execute(new v() {
                    /* class com.bytedance.retrofit2.SsHttpCall.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(25953);
                    }

                    @Override // com.bytedance.retrofit2.v
                    public final int c() {
                        return 0;
                    }

                    @Override // com.bytedance.retrofit2.v
                    public final int a() {
                        return SsHttpCall.this.serviceMethod.f42609g;
                    }

                    @Override // com.bytedance.retrofit2.v
                    public final boolean b() {
                        return SsHttpCall.this.serviceMethod.f42612j;
                    }

                    public final void run() {
                        try {
                            if (SsHttpCall.this.originalRequest == null) {
                                s sVar = SsHttpCall.this.serviceMethod.p;
                                sVar.r = SystemClock.uptimeMillis();
                                SsHttpCall ssHttpCall = SsHttpCall.this;
                                ssHttpCall.originalRequest = ssHttpCall.serviceMethod.a(SsHttpCall.this.args);
                                sVar.s = SystemClock.uptimeMillis();
                            }
                        } catch (Throwable th) {
                            SsHttpCall.this.preBuildURLException = th;
                        }
                        executor.execute(r1);
                    }
                });
            }
        } else {
            throw new IllegalStateException("Already executed.");
        }
    }

    SsHttpCall(t<T> tVar, Object[] objArr) {
        this.serviceMethod = tVar;
        this.args = objArr;
        this.callServerInterceptor = new CallServerInterceptor(tVar);
    }
}
