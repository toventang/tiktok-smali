package org.chromium;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.b;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.m;
import com.ttnet.org.chromium.base.k;
import com.ttnet.org.chromium.net.ab;
import com.ttnet.org.chromium.net.c;
import com.ttnet.org.chromium.net.g;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import com.ttnet.org.chromium.net.impl.f;
import com.ttnet.org.chromium.net.t;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class CronetClient implements ICronetClient {
    private static ICronetClient.ICronetBootFailureChecker sCronetBootFailureChecker;
    private static volatile c sCronetEngine;
    private static volatile int sNetworkThreadPriority = 20;
    private static volatile t.a sRequestFinishedInfoListener;

    public static int org_chromium_CronetClient_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int org_chromium_CronetClient_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public static void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) {
    }

    public long getCostTime(long j2, long j3) {
        if (j3 == -1 || j2 == -1 || j3 > j2) {
            return -1;
        }
        return j2 - j3;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public String getCronetVersion() {
        return "TTNetVersion:a6246045 2021-11-26 QuicVersion:705d0b81 2021-08-12";
    }

    static {
        Covode.recordClassIndex(106436);
    }

    public static c getCronetEngine() {
        Objects.requireNonNull(sCronetEngine, "Cronet engine is null.");
        return sCronetEngine;
    }

    private static long getALogFuncAddr() {
        return ((Long) Reflect.on(Class.forName("com.bytedance.ttnet.TTALog").newInstance()).call("getALogFuncAddr").get()).longValue();
    }

    public static int getEffectiveConnectionType() {
        if (sCronetEngine instanceof g) {
            return ((g) sCronetEngine).a();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static Map<String, int[]> getGroupRTTEstimates() {
        if (sCronetEngine instanceof g) {
            return ((g) sCronetEngine).f();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private static boolean getListenAppStateIndependently() {
        try {
            return ((Boolean) Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("getListenAppStateIndependently").get()).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int[] getNetworkQuality() {
        if (sCronetEngine instanceof g) {
            g gVar = (g) sCronetEngine;
            return new int[]{gVar.d(), gVar.c(), gVar.e()};
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private static String getDomainConfigByRegion() {
        String a2 = c.a().a("getCarrierRegion");
        String a3 = c.a().a("getSysRegion");
        String a4 = c.a().a("getRegion");
        if (TextUtils.isEmpty(a2)) {
            if (!TextUtils.isEmpty(a3)) {
                a2 = a3;
            } else {
                a2 = a4;
            }
        }
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return (String) Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("getGetDomainConfigByRegion", new Class[]{String.class}, a2).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setNetworkThreadPriority(int i2) {
        sNetworkThreadPriority = i2;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection) {
        return httpURLConnection instanceof CronetHttpURLConnection;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetBootFailureChecker(ICronetClient.ICronetBootFailureChecker iCronetBootFailureChecker) {
        sCronetBootFailureChecker = iCronetBootFailureChecker;
    }

    private long getTime(Date date) {
        if (date == null) {
            return -1;
        }
        return date.getTime();
    }

    private long getValue(Long l2) {
        if (l2 == null) {
            return -1;
        }
        return l2.longValue();
    }

    public static void org_chromium_CronetClient_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static List<InetAddress> dnsLookup(String str) {
        if (sCronetEngine instanceof g) {
            return ((g) sCronetEngine).e(str);
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void getMappingRequestState(final String str) {
        CronetUrlRequest cronetUrlRequest;
        try {
            if (!TextUtils.isEmpty(str) && (cronetUrlRequest = f.f155687a.get(str)) != null) {
                cronetUrlRequest.a(new ab.c() {
                    /* class org.chromium.CronetClient.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(106438);
                    }

                    @Override // com.ttnet.org.chromium.net.ab.c
                    public final void onStatus(int i2) {
                        e c2 = e.c();
                        String str = str;
                        if (c2.f159762a) {
                            c a2 = c.a();
                            if (d.a().loggerDebug()) {
                                d.a().loggerD("CronetAppProviderManager", "onMappingRequestStatus key = " + str + " status = " + i2);
                            }
                            try {
                                if (a2.f159757a != null) {
                                    k.a(a2.f159757a).a("onMappingRequestStatus", new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(i2));
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean notifySwitchToMultiNetwork(boolean z) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).b(z);
            return true;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static File org_chromium_CronetClient_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }

    public static void preconnectUrl(String str) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).d(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void reportNetDiagnosisUserLog(String str) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).g(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setAlogFuncAddr(long j2) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).a(j2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setAppStartUpState(int i2) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).e(i2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setHostResolverRules(String str) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).f(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setProxy(String str) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).b(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void clearClientOpaqueData(Context context) {
        try {
            if (f.a(context)) {
                if (d.a().loggerDebug()) {
                    d.a().loggerD("CronetClient", "clearClientOpaqueData start");
                }
                if (sCronetEngine instanceof g) {
                    ((g) sCronetEngine).b();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static com.bytedance.frameworks.baselib.network.http.cronet.b.g getPacketLossRateMetrics(int i2) {
        if (sCronetEngine instanceof g) {
            com.bytedance.frameworks.baselib.network.http.cronet.b.g gVar = new com.bytedance.frameworks.baselib.network.http.cronet.b.g();
            g gVar2 = (g) sCronetEngine;
            gVar.f29068a = i2;
            gVar.f29069b = gVar2.a(i2);
            gVar.f29070c = gVar2.b(i2);
            gVar.f29071d = gVar2.c(i2);
            gVar.f29072e = gVar2.d(i2);
            return gVar;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private void tryCreateRequestFinishedInfoListener(Executor executor) {
        MethodCollector.i(12012);
        if (sRequestFinishedInfoListener == null) {
            synchronized (CronetClient.class) {
                try {
                    if (sRequestFinishedInfoListener == null) {
                        sRequestFinishedInfoListener = new t.a(executor) {
                            /* class org.chromium.CronetClient.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(106439);
                            }

                            private long getTime(Date date) {
                                if (date == null) {
                                    return -1;
                                }
                                return date.getTime();
                            }

                            @Override // com.ttnet.org.chromium.net.t.a
                            public void onRequestFinished(t tVar) {
                                t.b b2;
                                if (tVar != null && (b2 = tVar.b()) != null) {
                                    String str = "";
                                    try {
                                        if (d.a().loggerDebug()) {
                                            try {
                                                if (tVar.d() != null) {
                                                    str = str + " http status = " + tVar.d().b();
                                                }
                                                str = str + " finishedReason = " + tVar.c();
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                            }
                                            d.a().loggerD("CronetClient", str + " url = " + tVar.a());
                                            d.a().loggerD("CronetClient", (((((((" dns_cost = " + CronetClient.this.getCostTime(getTime(b2.c()), getTime(b2.b())) + " ms ") + " connect_cost = " + CronetClient.this.getCostTime(getTime(b2.e()), getTime(b2.d())) + " ms ") + " ssl_cost = " + CronetClient.this.getCostTime(getTime(b2.g()), getTime(b2.f())) + " ms ") + " sending_cost = " + CronetClient.this.getCostTime(getTime(b2.i()), getTime(b2.h())) + " ms ") + " push_cost = " + CronetClient.this.getCostTime(getTime(b2.k()), getTime(b2.j())) + " ms ") + " response_cost = " + CronetClient.this.getCostTime(getTime(b2.m()), getTime(b2.l())) + " ms ") + " total_cost = " + b2.p() + " ms ") + " remote_ip = " + b2.t() + " : " + b2.u());
                                            try {
                                                if (tVar.e() != null) {
                                                    d.a().loggerD("CronetClient", " exception = " + tVar.e().getMessage());
                                                }
                                            } catch (Exception e3) {
                                                e3.printStackTrace();
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        };
                    }
                } finally {
                    MethodCollector.o(12012);
                }
            }
            return;
        }
        MethodCollector.o(12012);
    }

    public static String[] ttUrlDispatch(String str) {
        if (sCronetEngine instanceof g) {
            Map<String, String> c2 = ((g) sCronetEngine).c(str);
            return new String[]{c2.get("final_url"), c2.get("epoch"), c2.get("etag")};
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getProxyConfig(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.getProxyConfig(java.lang.String):java.lang.String");
    }

    public static void removeClientOpaqueData(Context context, String str) {
        try {
            if (f.a(context)) {
                if (d.a().loggerDebug()) {
                    d.a().loggerD("CronetClient", "removeClientOpaqueData start");
                }
                if (sCronetEngine instanceof g) {
                    ((g) sCronetEngine).a(str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void triggerGetDomain(Context context, boolean z) {
        try {
            if (f.a(context)) {
                if (d.a().loggerDebug()) {
                    d.a().loggerD("CronetClient", "triggerGetDomain start");
                }
                if (sCronetEngine instanceof g) {
                    ((g) sCronetEngine).a(z);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void getRequestMetrics(HttpURLConnection httpURLConnection, Map<String, Object> map) {
        String str;
        if (httpURLConnection != null && map != null && (httpURLConnection instanceof CronetHttpURLConnection)) {
            try {
                CronetHttpURLConnection cronetHttpURLConnection = (CronetHttpURLConnection) httpURLConnection;
                t b2 = cronetHttpURLConnection.b();
                if (!(b2 == null || b2.b() == null)) {
                    t.b b3 = b2.b();
                    map.put("remote_ip", b3.t() + ":" + b3.u());
                    map.put("dns_time", Long.valueOf(getCostTime(getTime(b3.c()), getTime(b3.b()))));
                    map.put("connect_time", Long.valueOf(getCostTime(getTime(b3.e()), getTime(b3.d()))));
                    map.put("ssl_time", Long.valueOf(getCostTime(getTime(b3.g()), getTime(b3.f()))));
                    map.put("send_time", Long.valueOf(getCostTime(getTime(b3.i()), getTime(b3.h()))));
                    map.put("push_time", Long.valueOf(getCostTime(getTime(b3.k()), getTime(b3.j()))));
                    map.put("receive_time", Long.valueOf(getCostTime(getTime(b3.m()), getTime(b3.l()))));
                    map.put("socket_reused", Boolean.valueOf(b3.n()));
                    map.put("ttfb", Long.valueOf(getValue(b3.o())));
                    map.put("total_time", Long.valueOf(getValue(b3.p())));
                    map.put("send_byte_count", Long.valueOf(getValue(b3.q())));
                    map.put("received_byte_count", Long.valueOf(getValue(b3.r())));
                    map.put("retry_attempts", Long.valueOf(getValue(b3.v())));
                    map.put("request_headers", b3.w());
                    map.put("response_headers", b3.x());
                    map.put("request_start", Long.valueOf(getTime(b3.a())));
                    map.put("post_task_start", Long.valueOf(getTime(b3.s())));
                    map.put("wait_ctx", Long.valueOf(getCostTime(getTime(b3.a()), getTime(b3.s()))));
                }
                if (cronetHttpURLConnection.f155848l != null) {
                    str = cronetHttpURLConnection.f155848l;
                } else {
                    str = "";
                }
                map.put("request_log", str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void tryStartNetDetect(String[] strArr, int i2, int i3) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).a(strArr, i2, i3);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void ttDnsResolve(String str, int i2, String str2) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).a(str, i2, str2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
        try {
            if (f.a(context)) {
                if (d.a().loggerDebug()) {
                    d.a().loggerD("CronetClient", "addClientOpaqueData start");
                }
                if (sCronetEngine instanceof g) {
                    ((g) sCronetEngine).a(strArr, bArr, bArr2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public HttpURLConnection openConnection(Context context, String str, boolean z, String str2, Executor executor) {
        try {
            if (sCronetEngine == null) {
                b.a().f29000b = b.a.LAZY_INIT;
            }
            tryCreateCronetEngine(context, false, false, false, z, str2, executor, false);
            return (HttpURLConnection) sCronetEngine.a(new URL(str));
        } catch (Throwable th) {
            if (th instanceof MalformedURLException) {
                throw th;
            } else if (!(th instanceof UnsupportedOperationException) || th.getMessage() == null || !th.getMessage().contains("Unexpected protocol")) {
                throw new IOException(th);
            } else {
                throw new IOException("MalformedURLException", th);
            }
        }
    }

    public static void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).a(z, str, str2, str3, z2, str4);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void notifyTNCConfigUpdated(String str, String str2, String str3, String str4, String str5, String str6) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).a(str, str2, str3, str4, str5, str6);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetEngine(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, Executor executor, boolean z5) {
        tryCreateCronetEngine(context, z, z2, z3, z4, str, executor, z5);
    }

    public static void notifyStoreRegionUpdated(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (sCronetEngine instanceof g) {
            ((g) sCronetEngine).a(str, str2, str3, str4, str5, str6, str7, str8);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0276, code lost:
        if (r8 != false) goto L_0x0209;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x028a A[Catch:{ Exception -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void tryCreateCronetEngine(android.content.Context r13, boolean r14, boolean r15, boolean r16, boolean r17, java.lang.String r18, java.util.concurrent.Executor r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 863
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.tryCreateCronetEngine(android.content.Context, boolean, boolean, boolean, boolean, java.lang.String, java.util.concurrent.Executor, boolean):void");
    }
}
