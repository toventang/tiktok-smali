package com.bytedance.ttnet;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.PrintStreamPrinter;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.c.f;
import com.bytedance.frameworks.baselib.network.http.c.g;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.b;
import com.bytedance.frameworks.baselib.network.http.cronet.b.h;
import com.bytedance.frameworks.baselib.network.http.cronet.b.k;
import com.bytedance.frameworks.baselib.network.http.d.a.o;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.e.c;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lancet.s;
import com.ss.android.ugc.aweme.logger.a;
import java.net.CookieHandler;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class TTNetInit {
    private static volatile a env = a.RELEASE;
    private static volatile boolean sApiHttpInterceptEnabled = false;
    private static volatile String sClientIPString = "";
    private static volatile boolean sCookieLogReportEnabled = false;
    private static long sCookieManagerInitStartTime = 0;
    public static ICronetAppProvider sCronetProvider;
    private static volatile int sDelayTime = 10;
    public static Map<String, String> sGetDomainRegionMap;
    private static d sITTNetDepend;
    private static volatile CountDownLatch sLatchInitCompleted = new CountDownLatch(1);
    private static volatile boolean sListenAppStateIndependently = false;
    private static volatile boolean sMainThreadInitCookieEnabled = true;
    private static volatile boolean sNotifiedColdStartFinsish = false;

    public static int com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static void doCommand(Context context, String str) {
    }

    public static void onActivityResume(Activity activity) {
        com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_TTNetInitLancet_onActivityResume(activity);
    }

    public static void setALogFuncAddr(long j2) {
    }

    public static void setEnableURLDispatcher(boolean z) {
    }

    public static void setFirstRequestWaitTime(long j2) {
    }

    public static void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) {
    }

    public static void tryInitCookieManager(Context context, boolean z, boolean z2) {
        com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_tryInitCookieManager(context, z, z2);
    }

    public static boolean urlDispatchEnabled() {
        return true;
    }

    public static boolean apiHttpInterceptEnabled() {
        return sApiHttpInterceptEnabled;
    }

    public static boolean cookieLogReportEnabled() {
        return sCookieLogReportEnabled;
    }

    public static String getClientIpString() {
        return sClientIPString;
    }

    public static ICronetAppProvider getCronetProvider() {
        return sCronetProvider;
    }

    public static a getEnv() {
        return env;
    }

    public static boolean getListenAppStateIndependently() {
        return sListenAppStateIndependently;
    }

    public static long getALogFuncAddr() {
        return TTALog.getALogFuncAddr();
    }

    public static boolean isPrivateApiAccessEnabled() {
        getTTNetDepend();
        return true;
    }

    public static void useCustomizedCookieStoreName() {
        f.f28978a = "ttnetCookieStore";
    }

    public static void getInitCompletedLatch() {
        try {
            sLatchInitCompleted.await(5, TimeUnit.SECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static d getTTNetDepend() {
        d dVar = sITTNetDepend;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("sITTNetDepend is null");
    }

    public static void notifyColdStartFinish() {
        if (sITTNetDepend != null && !sNotifiedColdStartFinsish) {
            sNotifiedColdStartFinsish = true;
        }
    }

    public static void preInitCronetKernel() {
        b.a().f29000b = b.a.PRE_INIT;
        getCronetHttpClient();
    }

    private static void countDownInitCompletedLatch() {
        try {
            if (sLatchInitCompleted.getCount() > 0) {
                sLatchInitCompleted.countDown();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void injectOkhttp3HttpDnsDepend() {
        o.a(sITTNetDepend.e(), sITTNetDepend.f().get("httpdns"));
    }

    public enum a {
        DEBUG,
        RELEASE;

        static {
            Covode.recordClassIndex(27224);
        }
    }

    static {
        Covode.recordClassIndex(27216);
        TTALog.init();
    }

    public static void forceInitCronetKernel() {
        b.a().f29000b = b.a.FORCE_INIT;
        h.a(getTTNetDepend().a()).a(false, com.bytedance.ttnet.a.a.a(getTTNetDepend().a()).c(), true);
    }

    private static h getCronetHttpClient() {
        if (!c.a()) {
            return null;
        }
        h a2 = h.a(getTTNetDepend().a());
        a2.a(true, com.bytedance.ttnet.a.a.a(getTTNetDepend().a()).c(), false);
        return a2;
    }

    public static int getEffectiveConnectionType() {
        try {
            h.a(getTTNetDepend().a());
            h.a();
            return ((Integer) Reflect.on(h.f29075c).call("getEffectiveConnectionType").get()).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static Map<String, com.bytedance.frameworks.baselib.network.http.cronet.b.f> getGroupRttEstimates() {
        h.a(getTTNetDepend().a());
        h.a();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((Map) Reflect.on(h.f29075c).call("getGroupRTTEstimates").get()).entrySet()) {
            if (((int[]) entry.getValue()).length == 2) {
                com.bytedance.frameworks.baselib.network.http.cronet.b.f fVar = new com.bytedance.frameworks.baselib.network.http.cronet.b.f();
                fVar.f29065a = ((int[]) entry.getValue())[0];
                fVar.f29066b = ((int[]) entry.getValue())[1];
                fVar.f29067c = -1;
                hashMap.put(entry.getKey(), fVar);
            } else {
                throw new UnknownFormatConversionException("getGroupRttEstimates returns wrong format");
            }
        }
        return hashMap;
    }

    public static com.bytedance.frameworks.baselib.network.http.cronet.b.f getNetworkQuality() {
        h.a(getTTNetDepend().a());
        h.a();
        int[] iArr = (int[]) Reflect.on(h.f29075c).call("getNetworkQuality").get();
        if (iArr.length == 3) {
            com.bytedance.frameworks.baselib.network.http.cronet.b.f fVar = new com.bytedance.frameworks.baselib.network.http.cronet.b.f();
            fVar.f29065a = iArr[0];
            fVar.f29066b = iArr[1];
            fVar.f29067c = iArr[2];
            return fVar;
        }
        throw new UnknownFormatConversionException("getNetworkQuality returns wrong format");
    }

    public static CookieManager com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_launch_CookieManagerLancet_getInstance() {
        if (!SettingsManager.a().a("cookie_manager_lancet", true)) {
            return CookieManager.getInstance();
        }
        Context a2 = d.a();
        try {
            return CookieManager.getInstance();
        } catch (RuntimeException e2) {
            try {
                System.err.println("assets=" + ((Object) null));
                AssetManager assets = a2.getAssets();
                System.err.println("assets1=".concat(String.valueOf(assets)));
                System.err.println("assets1=" + Arrays.toString(com.ss.android.ugc.aweme.lancet.a.b.a(assets)));
                if (assets != null) {
                    System.err.println("assets=" + Arrays.toString(com.ss.android.ugc.aweme.lancet.a.b.a(assets)));
                }
                Context a3 = com.ss.android.ugc.aweme.lancet.a.b.a();
                if (a3 != null) {
                    ApplicationInfo applicationInfo = a3.getApplicationInfo();
                    if (applicationInfo != null) {
                        applicationInfo.dump(new PrintStreamPrinter(System.err), "");
                    } else {
                        System.err.println("applicationInfo=".concat(String.valueOf(applicationInfo)));
                    }
                } else {
                    System.err.println("webViewContext=".concat(String.valueOf(a3)));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            throw e2;
        }
    }

    public static void enableApiHttpIntercept(boolean z) {
        sApiHttpInterceptEnabled = z;
    }

    public static void enableCookieLogReport(boolean z) {
        sCookieLogReportEnabled = z;
    }

    public static void setBypassOfflineCheck(boolean z) {
        h.f29076d = z;
    }

    public static void setDelayTime(int i2) {
        sDelayTime = i2;
    }

    public static void setEnv(a aVar) {
        env = aVar;
    }

    public static void setListenAppStateIndependently(boolean z) {
        sListenAppStateIndependently = z;
    }

    public static void setMainThreadInitCookieEnabled(boolean z) {
        sMainThreadInitCookieEnabled = z;
    }

    public static void onClientIPChanged(String str) {
        if (str != null) {
            sClientIPString = str;
        }
    }

    public static void setProcessFlag(int i2) {
        com.bytedance.frameworks.baselib.network.http.g.f.f29375a.set(i2);
    }

    public static void trigerGetDomain(Context context) {
        triggerGetDomain(context, false);
    }

    public static void TTNetInit__onActivityResume$___twin___(final Activity activity) {
        if (activity != null) {
            new e() {
                /* class com.bytedance.ttnet.TTNetInit.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(27223);
                }

                @Override // com.bytedance.common.utility.b.e
                public final void run() {
                    com.bytedance.ttnet.a.a.a(activity).i();
                }
            }.a();
        }
    }

    public static void setGetDomainRegionMap(Map<String, String> map) {
        if (map != null) {
            sGetDomainRegionMap = map;
            return;
        }
        throw new IllegalArgumentException("getDomainRegionMap is null");
    }

    public static k ttUrlDispatch(String str) {
        try {
            new URL(str).toURI();
            h.a(getTTNetDepend().a());
            return h.a(str);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void clearClientOpaqueData(Context context) {
        h.a(context);
        try {
            if (h.f29075c == null) {
                return;
            }
            if (h.f29074b != null) {
                Reflect.on(h.f29075c).call("clearClientOpaqueData", new Class[]{Context.class}, h.f29074b);
            }
        } catch (Throwable unused) {
        }
    }

    public static void com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_TTNetInitLancet_onActivityResume(Activity activity) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_LogLancet_d("TTNetInitLancet", "onActivityResume1");
            g.a().execute(new s.a(activity));
            return;
        }
        com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_LogLancet_d("TTNetInitLancet", "onActivityResume2");
        TTNetInit__onActivityResume$___twin___(activity);
    }

    public static List<InetAddress> dnsLookup(String str) {
        h.a(getTTNetDepend().a());
        if (h.f29075c != null) {
            return (List) Reflect.on(h.f29075c).call("dnsLookup", new Class[]{String.class}, str).get();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static String getGetDomainConfigByRegion(String str) {
        Map<String, String> map = sGetDomainRegionMap;
        if (map == null || map.isEmpty() || sCronetProvider == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = sGetDomainRegionMap.get(str.toLowerCase());
        if (TextUtils.isEmpty(str2)) {
            return sCronetProvider.getGetDomainDefaultJSON();
        }
        return str2;
    }

    public static void getMappingRequestState(String str) {
        try {
            h.a(getTTNetDepend().a());
            h.a();
            Reflect.on(h.f29075c).call("getMappingRequestState", new Class[]{String.class}, str).get();
        } catch (Throwable unused) {
        }
    }

    public static com.bytedance.frameworks.baselib.network.http.cronet.b.g getPacketLossRateMetrics(int i2) {
        h.a(getTTNetDepend().a());
        h.a();
        return (com.bytedance.frameworks.baselib.network.http.cronet.b.g) Reflect.on(h.f29075c).call("getPacketLossRateMetrics", new Class[]{Integer.TYPE}, Integer.valueOf(i2)).get();
    }

    public static void preconnectUrl(String str) {
        try {
            new URL(str).toURI();
            h.a(getTTNetDepend().a());
            if (h.f29075c != null) {
                Reflect.on(h.f29075c).call("preconnectUrl", new Class[]{String.class}, str).get();
                return;
            }
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void setHostResolverRulesForTesting(String str) {
        if (getCronetHttpClient() != null) {
            h.a();
            Reflect.on(h.f29075c).call("setHostResolverRules", new Class[]{String.class}, str);
        }
    }

    public static void setProxy(String str) {
        h.a(getTTNetDepend().a());
        h.a();
        Reflect.on(h.f29075c).call("setProxy", new Class[]{String.class}, str).get();
    }

    public static void trySetDefaultUserAgent(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    char[] charArray = str.toCharArray();
                    int length = charArray.length;
                    boolean z = false;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (charArray[i2] < ' ' || charArray[i2] > '~') {
                            charArray[i2] = '?';
                            z = true;
                        }
                    }
                    if (z) {
                        str = new String(charArray);
                    }
                }
            } catch (Exception unused) {
            }
        }
        com.bytedance.frameworks.baselib.network.http.e.f29332d = str;
    }

    public static void setCookieHandler(final Context context) {
        CookieManager com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_launch_CookieManagerLancet_getInstance;
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null && (cookieHandler instanceof com.bytedance.frameworks.baselib.network.http.c.g)) {
                com.bytedance.frameworks.baselib.network.http.e.a();
            } else if (sCookieManagerInitStartTime <= 0) {
                com.bytedance.frameworks.baselib.network.http.e.a();
            } else {
                try {
                    com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_launch_CookieManagerLancet_getInstance = com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_launch_CookieManagerLancet_getInstance();
                } catch (Throwable th) {
                    sDelayTime = 0;
                    CookieInitFailedReport(context, th.getMessage());
                }
                int i2 = sDelayTime;
                getTTNetDepend();
                CookieHandler.setDefault(new com.bytedance.frameworks.baselib.network.http.c.g(context, i2, com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_launch_CookieManagerLancet_getInstance, new g.a() {
                    /* class com.bytedance.ttnet.TTNetInit.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(27221);
                    }

                    @Override // com.bytedance.frameworks.baselib.network.http.c.g.a
                    public final void a() {
                        if (TTNetInit.cookieLogReportEnabled()) {
                            TTNetInit.getTTNetDepend();
                        }
                    }
                }));
                com.bytedance.frameworks.baselib.network.http.e.a();
            }
        } catch (Throwable th2) {
            CookieInitFailedReport(context, th2.getMessage());
        }
    }

    public static void setCronetDepend(ICronetAppProvider iCronetAppProvider) {
        if (iCronetAppProvider != null) {
            sCronetProvider = iCronetAppProvider;
            String carrierRegion = iCronetAppProvider.getCarrierRegion();
            String sysRegion = iCronetAppProvider.getSysRegion();
            String region = iCronetAppProvider.getRegion();
            if (TextUtils.isEmpty(carrierRegion)) {
                if (!TextUtils.isEmpty(sysRegion)) {
                    carrierRegion = sysRegion;
                } else {
                    carrierRegion = region;
                }
            }
            com.bytedance.frameworks.baselib.network.http.f.b.a().a(carrierRegion, iCronetAppProvider.getStoreIdcRuleJSON(), getTTNetDepend().a(), 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002b: INVOKE  
                  (wrap: com.bytedance.frameworks.baselib.network.http.f.b : 0x0016: INVOKE  (r3v0 com.bytedance.frameworks.baselib.network.http.f.b) =  type: STATIC call: com.bytedance.frameworks.baselib.network.http.f.b.a():com.bytedance.frameworks.baselib.network.http.f.b)
                  (r4v3 'carrierRegion' java.lang.String)
                  (wrap: java.lang.String : 0x001a: INVOKE  (r2v1 java.lang.String) = (r5v0 'iCronetAppProvider' com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider) type: INTERFACE call: com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider.getStoreIdcRuleJSON():java.lang.String)
                  (wrap: android.content.Context : 0x0022: INVOKE  (r1v2 android.content.Context) = 
                  (wrap: com.bytedance.ttnet.d : 0x001e: INVOKE  (r0v3 com.bytedance.ttnet.d) =  type: STATIC call: com.bytedance.ttnet.TTNetInit.getTTNetDepend():com.bytedance.ttnet.d)
                 type: INTERFACE call: com.bytedance.ttnet.d.a():android.content.Context)
                  (wrap: com.bytedance.ttnet.f.c$1 : 0x0028: CONSTRUCTOR  (r0v4 com.bytedance.ttnet.f.c$1) = (r5v0 'iCronetAppProvider' com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider) call: com.bytedance.ttnet.f.c.1.<init>(com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.frameworks.baselib.network.http.f.b.a(java.lang.String, java.lang.String, android.content.Context, com.bytedance.frameworks.baselib.network.http.f.a):void in method: com.bytedance.ttnet.TTNetInit.setCronetDepend(com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0028: CONSTRUCTOR  (r0v4 com.bytedance.ttnet.f.c$1) = (r5v0 'iCronetAppProvider' com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider) call: com.bytedance.ttnet.f.c.1.<init>(com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider):void type: CONSTRUCTOR in method: com.bytedance.ttnet.TTNetInit.setCronetDepend(com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ttnet.f.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                if (r5 == 0) goto L_0x0045
                com.bytedance.ttnet.TTNetInit.sCronetProvider = r5
                java.lang.String r4 = r5.getCarrierRegion()
                java.lang.String r2 = r5.getSysRegion()
                java.lang.String r1 = r5.getRegion()
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L_0x003b
            L_0x0016:
                com.bytedance.frameworks.baselib.network.http.f.b r3 = com.bytedance.frameworks.baselib.network.http.f.b.a()
                java.lang.String r2 = r5.getStoreIdcRuleJSON()
                com.bytedance.ttnet.d r0 = getTTNetDepend()
                android.content.Context r1 = r0.a()
                com.bytedance.ttnet.f.c$1 r0 = new com.bytedance.ttnet.f.c$1
                r0.<init>(r5)
                r3.a(r4, r2, r1, r0)
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L_0x003a
                java.lang.String r0 = getGetDomainConfigByRegion(r4)
                com.bytedance.ttnet.f.c.f44624a = r0
            L_0x003a:
                return
            L_0x003b:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L_0x0043
                r4 = r2
                goto L_0x0016
            L_0x0043:
                r4 = r1
                goto L_0x0016
            L_0x0045:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "cronetDepend is null"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.TTNetInit.setCronetDepend(com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider):void");
        }

        public static void setTTNetDepend(d dVar) {
            sITTNetDepend = dVar;
            Map<String, String> f2 = getTTNetDepend().f();
            if (TextUtils.isEmpty(f2.get("httpdns")) || TextUtils.isEmpty(f2.get("netlog")) || TextUtils.isEmpty(f2.get("boe"))) {
                sITTNetDepend = null;
                throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
            }
            com.bytedance.frameworks.baselib.network.http.g.a.f29359a = f2.get("boe");
            injectOkhttp3HttpDnsDepend();
        }

        public static void monitorLogSend(String str, JSONObject jSONObject) {
            d dVar = sITTNetDepend;
            if (dVar != null) {
                dVar.a(str, jSONObject);
            }
        }

        private static void CookieInitFailedReport(Context context, String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", "failed");
                jSONObject.put("exception", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            getTTNetDepend();
        }

        public static void removeClientOpaqueData(Context context, String str) {
            h.a(context);
            try {
                if (h.f29075c == null) {
                    return;
                }
                if (h.f29074b != null) {
                    Reflect.on(h.f29075c).call("removeClientOpaqueData", new Class[]{Context.class, String.class}, h.f29074b, str);
                }
            } catch (Throwable unused) {
            }
        }

        public static void triggerGetDomain(Context context, boolean z) {
            h.a(context);
            try {
                if (h.f29075c == null) {
                    return;
                }
                if (h.f29074b != null) {
                    Reflect.on(h.f29075c).call("triggerGetDomain", new Class[]{Context.class, Boolean.TYPE}, h.f29074b, Boolean.valueOf(z));
                }
            } catch (Throwable unused) {
            }
        }

        public static c TTDnsResolve(String str, int i2) {
            com.bytedance.ttnet.e.a a2 = com.bytedance.ttnet.e.a.a();
            com.bytedance.ttnet.e.b bVar = new com.bytedance.ttnet.e.b(str, i2);
            a2.f44594a.put(bVar.f44597c, bVar);
            h.a(getTTNetDepend().a());
            String str2 = bVar.f44595a;
            int i3 = bVar.f44596b;
            String str3 = bVar.f44597c;
            if (h.f29075c != null) {
                Reflect.on(h.f29075c).call("ttDnsResolve", new Class[]{String[].class, Integer.TYPE, String.class}, str2, Integer.valueOf(i3), str3).get();
                bVar.f44598d.await();
                a2.f44594a.remove(bVar.f44597c);
                return bVar.f44599e;
            }
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }

        public static void com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_tryInitCookieManager(Context context, boolean z, boolean z2) {
            a.b.f109011a.a("feed_network_init_cookie_duration", false);
            TTNetInit__tryInitCookieManager$___twin___(context, z, z2);
        }

        public static boolean tryStartTTNetDetect(String[] strArr, int i2, int i3) {
            if (strArr != null && strArr.length > 0 && i2 > 0 && i2 <= 180 && i3 >= 0) {
                try {
                    h.a(getTTNetDepend().a());
                    if (h.f29075c != null) {
                        Reflect.on(h.f29075c).call("tryStartNetDetect", new Class[]{String[].class, Integer.TYPE, Integer.TYPE}, strArr, Integer.valueOf(i2), Integer.valueOf(i3)).get();
                        return true;
                    }
                    throw new UnsupportedOperationException("CronetEngine has not been initialized.");
                } catch (Throwable unused) {
                }
            }
            return false;
        }

        public static void TTNetInit__tryInitCookieManager$___twin___(final Context context, final boolean z, final boolean z2) {
            try {
                sCookieManagerInitStartTime = System.currentTimeMillis();
                if (z) {
                    CookieSyncManager.createInstance(context);
                    com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_launch_CookieManagerLancet_getInstance().setAcceptCookie(true);
                    setCookieHandler(context);
                    Logger.debug();
                } else {
                    com.bytedance.frameworks.baselib.network.http.e.a();
                }
            } catch (Throwable th) {
                if (com.bytedance.frameworks.baselib.network.http.g.f.a(context) && Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    if (sMainThreadInitCookieEnabled) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            /* class com.bytedance.ttnet.TTNetInit.AnonymousClass6 */

                            static {
                                Covode.recordClassIndex(27222);
                            }

                            public final void run() {
                                TTNetInit.tryInitCookieManager(context, z, z2);
                            }
                        });
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error", th.getMessage());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    d dVar = sITTNetDepend;
                    if (dVar != null) {
                        dVar.a("async_init_cookie_manager_fail", jSONObject);
                    }
                    CookieInitFailedReport(context, th.getMessage());
                }
            }
            ClientKeyManager a2 = ClientKeyManager.a();
            ClientKeyManager.f44558g = z2;
            try {
                ClientKeyManager.f44556a = Keva.getRepo("ttnet_client_key_config", 1);
            } catch (Throwable unused) {
            }
            if (ClientKeyManager.f44556a != null) {
                String string = ClientKeyManager.f44556a.getString("client_key_config", "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        a2.a(new JSONObject(string));
                    } catch (Throwable unused2) {
                    }
                }
                if (ClientKeyManager.f44557b) {
                    String string2 = ClientKeyManager.f44556a.getString("session_id", "");
                    long j2 = ClientKeyManager.f44556a.getLong("session_time", 0);
                    a2.f44564e = ClientKeyManager.f44556a.getString("session_url", "");
                    a2.f44562c = ClientKeyManager.f44556a.getString("client_key", "");
                    a2.f44565f = ClientKeyManager.f44556a.getString("kms_version", "");
                    ClientKeyManager.f44559h = ClientKeyManager.a(a2.f44562c, a2.f44565f);
                    if (!string2.isEmpty() && !a2.f44564e.isEmpty()) {
                        String[] split = string2.split(";");
                        if (split != null && split.length > 0) {
                            a2.f44563d = split[0].trim();
                        }
                        if (!TextUtils.isEmpty(a2.f44563d)) {
                            String a3 = ClientKeyManager.a(split, j2, string2);
                            if (!TextUtils.isEmpty(a3)) {
                                string2 = a3;
                            }
                            CookieHandler cookieHandler = CookieHandler.getDefault();
                            if (cookieHandler != null) {
                                try {
                                    URI a4 = com.bytedance.frameworks.baselib.network.http.g.g.a(a2.f44564e);
                                    if (a4 != null) {
                                        Map<String, List<String>> map = cookieHandler.get(a4, null);
                                        if (map != null && !map.isEmpty() && map.containsKey("Cookie")) {
                                            String obj = map.get("Cookie").toString();
                                            if (TextUtils.isEmpty(obj)) {
                                                ClientKeyManager.a(string2, cookieHandler, a4);
                                                a2.a("empty");
                                            } else if (!obj.contains(a2.f44563d)) {
                                                ClientKeyManager.a(string2, cookieHandler, a4);
                                                a2.a(obj);
                                            }
                                        }
                                    }
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                    }
                }
            }
        }

        public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
            h.a(context);
            try {
                if (h.f29075c == null) {
                    return;
                }
                if (h.f29074b != null) {
                    Reflect.on(h.f29075c).call("addClientOpaqueData", new Class[]{Context.class, String[].class, byte[].class, byte[].class}, h.f29074b, strArr, bArr, bArr2);
                }
            } catch (Throwable unused) {
            }
        }

        public static void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
            if (!z || (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3))) {
                try {
                    if (getCronetHttpClient() == null) {
                        return;
                    }
                    if (h.f29075c != null) {
                        Reflect.on(h.f29075c).call("enableTTBizHttpDns", new Class[]{Boolean.TYPE, String.class, String.class, String.class, Boolean.TYPE, String.class}, Boolean.valueOf(z), str, str2, str3, Boolean.valueOf(z2), str4).get();
                        return;
                    }
                    throw new UnsupportedOperationException("CronetEngine has not been initialized.");
                } catch (Throwable unused) {
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
            if (r3 == false) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
            r1 = com.bytedance.frameworks.baselib.network.http.g.f.c(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d7, code lost:
            if (r1 == null) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00df, code lost:
            if (r1.contains(":miniapp") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fb, code lost:
            if (r7 != false) goto L_0x00c9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void tryInitTTNet(final android.content.Context r8, android.app.Application r9, com.bytedance.frameworks.baselib.network.http.e.b<com.bytedance.ttnet.d.b> r10, com.bytedance.frameworks.baselib.network.http.e.i<com.bytedance.ttnet.d.b> r11, com.bytedance.frameworks.baselib.network.http.e.f r12, final boolean r13, boolean... r14) {
            /*
            // Method dump skipped, instructions count: 317
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.TTNetInit.tryInitTTNet(android.content.Context, android.app.Application, com.bytedance.frameworks.baselib.network.http.e$b, com.bytedance.frameworks.baselib.network.http.e$i, com.bytedance.frameworks.baselib.network.http.e$f, boolean, boolean[]):void");
        }
    }
