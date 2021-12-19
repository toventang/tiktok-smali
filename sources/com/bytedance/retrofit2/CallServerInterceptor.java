package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.client.d;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.token.e;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.bs.b;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.services.ApiMonitorService;
import h.f.b.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class CallServerInterceptor<T> implements a, l, m {
    private volatile boolean mCanceled;
    private Throwable mCreationFailure;
    private volatile boolean mExecuted;
    public Request mOriginalRequest;
    private volatile d mRawCall;
    private final t<T> mServiceMethod;
    private volatile long mThrottleNetSpeed;

    static {
        Covode.recordClassIndex(25947);
    }

    public static int com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    private d createRawCall(j jVar, Request request) {
        return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_createRawCall(this, jVar, request);
    }

    private c executeCall(d dVar, s sVar) {
        return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_executeCall(this, dVar, sVar);
    }

    @Override // com.bytedance.retrofit2.c.a
    public u intercept(a.AbstractC1036a aVar) {
        return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_intercept(this, aVar);
    }

    /* access modifiers changed from: package-private */
    public u parseResponse(c cVar, s sVar) {
        return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_parseResponse(this, cVar, sVar);
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public Request request() {
        return this.mOriginalRequest;
    }

    public void cancel() {
        this.mCanceled = true;
        if (this.mRawCall != null) {
            this.mRawCall.b();
        }
    }

    @Override // com.bytedance.retrofit2.l
    public void doCollect() {
        if (this.mRawCall instanceof l) {
            ((l) this.mRawCall).doCollect();
        }
    }

    @Override // com.bytedance.retrofit2.m
    public Object getRequestInfo() {
        if (!(this.mRawCall instanceof m)) {
            return null;
        }
        ((m) this.mRawCall).getRequestInfo();
        return null;
    }

    public synchronized boolean isExecuted() {
        boolean z;
        MethodCollector.i(2886);
        z = this.mExecuted;
        MethodCollector.o(2886);
        return z;
    }

    public synchronized void resetExecuted() {
        MethodCollector.i(2887);
        this.mExecuted = false;
        MethodCollector.o(2887);
    }

    public CallServerInterceptor(t<T> tVar) {
        this.mServiceMethod = tVar;
    }

    public boolean setThrottleNetSpeed(long j2) {
        this.mThrottleNetSpeed = j2;
        if (this.mRawCall != null) {
            return this.mRawCall.a(j2);
        }
        return false;
    }

    public u CallServerInterceptor__intercept$___twin___(a.AbstractC1036a aVar) {
        c cVar;
        c a2;
        MethodCollector.i(2841);
        s c2 = aVar.c();
        if (c2 != null) {
            c2.f42598i = System.currentTimeMillis();
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        this.mOriginalRequest = aVar.a();
        synchronized (this) {
            try {
                if (!this.mExecuted) {
                    this.mExecuted = true;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already executed.");
                    MethodCollector.o(2841);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.o(2841);
            }
        }
        Throwable th = this.mCreationFailure;
        if (th == null) {
            this.mOriginalRequest.setMetrics(c2);
            if (this.mServiceMethod.o != null) {
                if (c2 != null) {
                    c2.x.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
                }
                cVar = this.mServiceMethod.o.a(this.mOriginalRequest);
            } else {
                cVar = null;
            }
            if (cVar == null) {
                try {
                    this.mRawCall = createRawCall(null, this.mOriginalRequest);
                    if (this.mThrottleNetSpeed > 0) {
                        this.mRawCall.a(this.mThrottleNetSpeed);
                    }
                    if (this.mCanceled) {
                        this.mRawCall.b();
                    }
                    if (c2 != null) {
                        c2.x.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
                    }
                    cVar = executeCall(this.mRawCall, c2);
                    if (!(this.mServiceMethod.o == null || (a2 = this.mServiceMethod.o.a(this.mOriginalRequest, cVar)) == null)) {
                        cVar = a2;
                    }
                } catch (IOException | RuntimeException e2) {
                    this.mCreationFailure = e2;
                    MethodCollector.o(2841);
                    throw e2;
                } catch (Throwable th2) {
                    this.mCreationFailure = th2;
                    if (th2 instanceof Exception) {
                        MethodCollector.o(2841);
                        throw th2;
                    }
                    Exception exc = new Exception(th2);
                    MethodCollector.o(2841);
                    throw exc;
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            u parseResponse = parseResponse(cVar, c2);
            if (c2 != null) {
                c2.y.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
            return parseResponse;
        } else if (th instanceof IOException) {
            MethodCollector.o(2841);
            throw th;
        } else {
            Exception exc2 = new Exception(this.mCreationFailure);
            MethodCollector.o(2841);
            throw exc2;
        }
    }

    public d CallServerInterceptor__createRawCall$___twin___(j jVar, Request request) {
        return this.mServiceMethod.f42605c.get().a(request);
    }

    public c CallServerInterceptor__executeCall$___twin___(d dVar, s sVar) {
        if (sVar != null) {
            sVar.t = SystemClock.uptimeMillis();
        }
        return dVar.a();
    }

    public static u com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_intercept(CallServerInterceptor callServerInterceptor, a.AbstractC1036a aVar) {
        if (!(aVar.c() instanceof b)) {
            return callServerInterceptor.CallServerInterceptor__intercept$___twin___(aVar);
        }
        b bVar = (b) aVar.c();
        if (bVar.W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
            bVar.a(bVar.Y, uptimeMillis);
            bVar.b(bVar.Y, uptimeMillis);
        }
        bVar.a(callServerInterceptor.getClass().getSimpleName());
        bVar.W = SystemClock.uptimeMillis();
        u CallServerInterceptor__intercept$___twin___ = callServerInterceptor.CallServerInterceptor__intercept$___twin___(aVar);
        if (bVar.X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
            String simpleName = callServerInterceptor.getClass().getSimpleName();
            bVar.a(simpleName, uptimeMillis2);
            bVar.c(simpleName, uptimeMillis2);
        }
        bVar.X = SystemClock.uptimeMillis();
        return CallServerInterceptor__intercept$___twin___;
    }

    public u<T> CallServerInterceptor__parseResponse$___twin___(c cVar, s sVar) {
        if (cVar != null) {
            TypedInput typedInput = cVar.f42477e;
            int i2 = cVar.f42474b;
            if (i2 < 200 || i2 >= 300) {
                return u.a(typedInput, cVar);
            }
            if (i2 == 204 || i2 == 205) {
                return u.a((Object) null, cVar);
            }
            if (sVar != null) {
                try {
                    sVar.v = SystemClock.uptimeMillis();
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
            Object a2 = t.a(this.mServiceMethod, typedInput);
            if (sVar != null) {
                sVar.w = SystemClock.uptimeMillis();
            }
            return u.a(a2, cVar);
        }
        throw new IOException("SsResponse is null");
    }

    public static u com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_parseResponse(CallServerInterceptor callServerInterceptor, c cVar, s sVar) {
        if ((cVar.f42478f instanceof com.bytedance.frameworks.baselib.network.http.a) && ((com.bytedance.frameworks.baselib.network.http.a) cVar.f42478f).f28920h > 0) {
            Request request = callServerInterceptor.mOriginalRequest;
            if (request.getMetrics() instanceof b) {
                b bVar = (b) request.getMetrics();
                long uptimeMillis = SystemClock.uptimeMillis();
                u<T> CallServerInterceptor__parseResponse$___twin___ = callServerInterceptor.CallServerInterceptor__parseResponse$___twin___(cVar, sVar);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                bVar.T = uptimeMillis2 - uptimeMillis;
                bVar.Z = uptimeMillis2;
                return CallServerInterceptor__parseResponse$___twin___;
            }
        }
        return callServerInterceptor.CallServerInterceptor__parseResponse$___twin___(cVar, sVar);
    }

    public static d com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_createRawCall(CallServerInterceptor callServerInterceptor, j jVar, Request request) {
        long currentTimeMillis = System.currentTimeMillis();
        d CallServerInterceptor__createRawCall$___twin___ = callServerInterceptor.CallServerInterceptor__createRawCall$___twin___(jVar, request);
        if (a.b.f109011a.f109002c && com.ss.android.ugc.aweme.lancet.b.b.a(request) != -1) {
            a.b.f109011a.a("feed_create_sslcall", System.currentTimeMillis() - currentTimeMillis);
        }
        com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_d("NetworkUtilsLancet", "create ssl requestVersion:" + com.ss.android.ugc.aweme.lancet.b.b.a(request) + ";duration:" + (System.currentTimeMillis() - currentTimeMillis));
        return CallServerInterceptor__createRawCall$___twin___;
    }

    public static u com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_parseResponse(CallServerInterceptor callServerInterceptor, c cVar, s sVar) {
        int i2;
        List<com.bytedance.retrofit2.client.b> headers;
        Request request = callServerInterceptor.mOriginalRequest;
        boolean z = a.b.f109011a.f109002c;
        if (z) {
            i2 = com.ss.android.ugc.aweme.lancet.b.b.a(request);
            if (i2 != -1) {
                a.b.f109011a.b("feed_network_duration", true);
                if (!a.b.f109011a.a("feed_parse_duration")) {
                    a.b.f109011a.a("feed_parse_duration", true);
                }
            }
        } else {
            i2 = -1;
        }
        try {
            u<?> com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_parseResponse = com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_parseResponse(callServerInterceptor, cVar, sVar);
            if (z && i2 != -1) {
                boolean a2 = a.b.f109011a.a("feed_parse_duration");
                boolean b2 = a.b.f109011a.b("feed_parse_duration");
                if (a2 && !b2) {
                    a.b.f109011a.b("feed_parse_duration", true);
                }
                if (!a.b.f109011a.a("feed_parse_to_ui")) {
                    a.b.f109011a.a("feed_parse_to_ui", true);
                }
                a.b.f109011a.a("feed_net_api_to_feed_api", false);
                a.b.f109011a.a("feed_api_type", (long) i2);
            }
            if (request != null) {
                ApiMonitorService.Companion.getInstance().addALog(request.getUrl(), com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_parseResponse);
            }
            return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_ApiTimeLancet_parseResponse;
        } catch (Throwable th) {
            if ((th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && cVar != null && th.getErrorCode() == 8) {
                String str = cVar.f42473a;
                if (request == null) {
                    headers = null;
                } else {
                    headers = request.getHeaders();
                }
                e.a(str, headers, com.ss.android.ugc.aweme.account.b.g().isLogin());
            }
            throw th;
        }
    }

    public static c com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_executeCall(CallServerInterceptor callServerInterceptor, d dVar, s sVar) {
        String str;
        Request request = callServerInterceptor.mOriginalRequest;
        if (a.b.f109011a.f109002c && com.ss.android.ugc.aweme.feed.api.e.a(request)) {
            a.b.f109011a.b("feed_request_to_network", true);
            a.b.f109011a.b("feed_boot_to_network", false);
            if (!a.b.f109011a.a("feed_network_duration")) {
                a.b.f109011a.a("feed_network_duration", true);
            }
            if (a.b.f109011a.a("feed_init_ttnet_end_to_network")) {
                a.b.f109011a.b("feed_init_ttnet_end_to_network", false);
            }
        }
        try {
            return callServerInterceptor.CallServerInterceptor__executeCall$___twin___(dVar, sVar);
        } catch (Exception e2) {
            if (request != null) {
                l.d(request, "");
                l.d(e2, "");
                ArrayList<Integer> a2 = com.ss.android.ugc.aweme.bs.a.a();
                int hashCode = request.getPath().hashCode();
                if (a2 != null && a2.contains(Integer.valueOf(hashCode))) {
                    try {
                        if (e2 instanceof com.bytedance.frameworks.baselib.network.http.b.c) {
                            str = "status_code=" + ((com.bytedance.frameworks.baselib.network.http.b.c) e2).getStatusCode() + ",message=" + e2.getMessage();
                        } else if (e2 instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c) {
                            str = "status_code=" + ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) e2).getStatusCode() + ",message=" + e2.getMessage() + ",traceCode=" + ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) e2).getTraceCode() + ",requestLog=" + ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) e2).getRequestLog() + ",requestInfo=" + com.ss.android.ugc.aweme.bs.a.f68797a.b(((com.bytedance.frameworks.baselib.network.http.cronet.b.c) e2).getRequestInfo());
                        } else {
                            str = e2.getMessage();
                        }
                        if (str == null) {
                            str = "";
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("path", request.getPath());
                        jSONObject.put("response", str);
                        jSONObject.put("request", com.ss.android.ugc.aweme.bs.a.f68797a.b(request));
                        o.b(com.ss.android.ugc.aweme.bs.a.f68798b, "", jSONObject);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
            throw e2;
        }
    }
}
