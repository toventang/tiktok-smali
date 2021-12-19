package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.e;
import com.bytedance.geckox.f;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.statistic.a;
import com.bytedance.geckox.utils.e;
import com.bytedance.geckox.utils.m;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.q;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.utils.gecko.c;
import com.ss.android.ugc.aweme.web.GeckoXClientManager;
import com.ss.android.ugc.aweme.web.IGeckoXClientManager;
import com.ss.android.ugc.aweme.web.k;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class dc {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f142812a;

    /* renamed from: b  reason: collision with root package name */
    private static Context f142813b;

    /* renamed from: c  reason: collision with root package name */
    private static a f142814c = new a() {
        /* class com.ss.android.ugc.aweme.utils.dc.AnonymousClass2 */

        static {
            Covode.recordClassIndex(93425);
        }

        @Override // com.bytedance.geckox.statistic.a
        public final void a(String str, JSONObject jSONObject) {
            if (!TextUtils.isEmpty(str) && jSONObject != null) {
                dw.a(jSONObject);
                com.ss.android.common.c.a.a(str, jSONObject);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static GeckoGlobalConfig.IMonitorConfig f142815d = new GeckoGlobalConfig.IMonitorConfig() {
        /* class com.ss.android.ugc.aweme.utils.dc.AnonymousClass3 */

        static {
            Covode.recordClassIndex(93426);
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final String getMonitorHost() {
            return "https://mon.isnssdk.com";
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final String getPackageId() {
            return null;
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final boolean isOversea() {
            return true;
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final String getChannel() {
            return d.s;
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final String getUpdateVersionCode() {
            return String.valueOf(d.d());
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final Map<String, String> getCommonParams() {
            HashMap hashMap = new HashMap();
            q.b(hashMap, true);
            hashMap.remove("mac_address");
            hashMap.remove("uuid");
            hashMap.remove("openudid");
            hashMap.remove("aliyun_uuid");
            hashMap.remove("oaid");
            return hashMap;
        }
    };

    public static Set<String> a() {
        return c.a.a().f142997c.a();
    }

    public static boolean h() {
        return TextUtils.equals(d.s, "local_test");
    }

    private static Context l() {
        if (f142813b == null) {
            f142813b = d.a();
        }
        return f142813b;
    }

    public static com.bytedance.geckox.c b() {
        String c2 = k.f145061a.c();
        if (TextUtils.isEmpty(c2)) {
            return null;
        }
        return c(c2);
    }

    public static void f() {
        try {
            e.a(new File(a(d.a()), "offline"));
        } catch (Throwable unused) {
        }
    }

    public static int i() {
        try {
            return b.a().a("gecko_bytediff_exp_tt_android", ClientExpManager.gecko_bytediff_exp_tt_android());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void k() {
        f a2 = f.a();
        String deviceId = DeviceRegisterManager.getDeviceId();
        a2.i();
        if (!TextUtils.isEmpty(deviceId) && a2.f29845d != null) {
            a2.f29845d.setDeviceId(deviceId);
        }
    }

    static {
        Covode.recordClassIndex(93423);
        com.bytedance.geckox.i.a.f29908b.add(new com.bytedance.geckox.i.b() {
            /* class com.ss.android.ugc.aweme.utils.dc.AnonymousClass1 */

            static {
                Covode.recordClassIndex(93424);
            }

            @Override // com.bytedance.geckox.i.b
            public final void a(Object... objArr) {
                if (dc.h()) {
                    dg.a().b(objArr);
                }
            }
        });
        com.bytedance.geckox.i.a.f29907a = true;
    }

    public static synchronized void c() {
        synchronized (dc.class) {
            MethodCollector.i(10447);
            com.bytedance.geckox.c c2 = c(k.f145061a.c());
            if (c2 != null) {
                c2.a(CheckRequestBodyModel.GroupType.NORMAL.getValue(), (Map<String, List<CheckRequestBodyModel.TargetChannel>>) null, new com.ss.android.ugc.aweme.web.d());
            }
            MethodCollector.o(10447);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r2 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void d() {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.utils.dc> r5 = com.ss.android.ugc.aweme.utils.dc.class
            monitor-enter(r5)
            r4 = 10610(0x2972, float:1.4868E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)     // Catch:{ all -> 0x003d }
            com.ss.android.ugc.aweme.web.k r0 = com.ss.android.ugc.aweme.web.k.f145061a     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r0.c()     // Catch:{ all -> 0x003d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x003d }
            r3 = 0
            if (r0 != 0) goto L_0x0038
            com.ss.android.ugc.aweme.web.IGeckoXClientManager r0 = com.ss.android.ugc.aweme.web.GeckoXClientManager.a()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0038
            com.bytedance.geckox.c r2 = r0.b(r1)     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x002a
            com.bytedance.geckox.c r2 = d(r1)     // Catch:{ all -> 0x003d }
            r0.b(r1, r2)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0038
        L_0x002a:
            com.bytedance.geckox.model.CheckRequestBodyModel$GroupType r0 = com.bytedance.geckox.model.CheckRequestBodyModel.GroupType.HIGHPRIORITY     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r0.getValue()     // Catch:{ all -> 0x003d }
            com.ss.android.ugc.aweme.web.d r0 = new com.ss.android.ugc.aweme.web.d     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            r2.a(r1, r3, r0)     // Catch:{ all -> 0x003d }
        L_0x0038:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)     // Catch:{ all -> 0x003d }
            monitor-exit(r5)
            return
        L_0x003d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.dc.d():void");
    }

    public static void e() {
        com.bytedance.geckox.c b2 = b();
        if (b2 != null) {
            String b3 = com.ss.android.ugc.aweme.i18n.language.a.b();
            if (!TextUtils.isEmpty(b3)) {
                b2.a(b3.toLowerCase(Locale.ROOT), (Map<String, List<CheckRequestBodyModel.TargetChannel>>) null, new OptionCheckUpdateParams().setListener(new com.ss.android.ugc.aweme.web.d()));
            }
        }
    }

    public static String g() {
        String str;
        Keva repo = Keva.getRepo("hybrid_debug_settings");
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe()) {
            str = "boe";
        } else {
            str = "local_test";
        }
        return repo.getString("gecko_deployment", str);
    }

    public static GeckoGlobalConfig j() {
        GeckoGlobalConfig.ENVType eNVType;
        boolean equals = "online".equals(g());
        if (!h() || equals) {
            eNVType = GeckoGlobalConfig.ENVType.PROD;
        } else if (!((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe() || !"boe".equals(g())) {
            eNVType = GeckoGlobalConfig.ENVType.DEV;
        } else {
            eNVType = GeckoGlobalConfig.ENVType.BOE;
        }
        String deviceId = DeviceRegisterManager.getDeviceId();
        Context a2 = d.a();
        GeckoGlobalConfig.Builder region = new GeckoGlobalConfig.Builder(a2).netStack(new GeckoXNetImpl(a2)).statisticMonitor(f142814c).host("gecko-va.tiktokv.com").appVersion(d.f()).appId((long) d.n).region(com.ss.android.ugc.aweme.language.d.g());
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "0";
        }
        return region.deviceId(deviceId).env(eNVType).monitorConfig(f142815d).build();
    }

    public static boolean b(String str) {
        return a(k.f145061a.c(), str);
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    private static com.bytedance.geckox.c c(String str) {
        IGeckoXClientManager a2 = GeckoXClientManager.a();
        if (a2 == null) {
            return null;
        }
        com.bytedance.geckox.c a3 = a2.a(str);
        if (a3 != null) {
            return a3;
        }
        com.bytedance.geckox.c d2 = d(str);
        a2.a(str, d2);
        return d2;
    }

    private static com.bytedance.geckox.c d(String str) {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        File b2 = k.b();
        try {
            e.a aVar = new e.a(l());
            aVar.f29805k = "gecko-va.tiktokv.com";
            e.a a2 = aVar.a((long) d.n);
            a2.f29803i = d.f();
            a2.f29795a = new GeckoXNetImpl(l());
            a2.f29800f = f142814c;
            e.a b3 = a2.a(str).b(str);
            b3.f29807m = com.ss.android.ugc.aweme.language.d.g();
            b3.f29804j = serverDeviceId;
            b3.f29806l = b2;
            return com.bytedance.geckox.c.a(b3.b());
        } catch (Exception e2) {
            Log.getStackTraceString(e2);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e1 A[Catch:{ Exception -> 0x00f5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.geckox.c a(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.dc.a(java.lang.String):com.bytedance.geckox.c");
    }

    public static boolean a(String str, String str2) {
        return c("offlineX", str, str2);
    }

    public static String b(String str, String str2) {
        return a("offlineX", str, str2);
    }

    public static Long b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str)) {
                str = "gecko_offline_res_x";
            }
            try {
                File file = new File(a(l()), str + File.separator + str2);
                if (!file.exists()) {
                    return null;
                }
                File file2 = new File(file.getAbsolutePath(), str3);
                if (!file2.exists()) {
                    return null;
                }
                Long a2 = m.a(file2);
                String.valueOf(a2);
                return a2;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static boolean c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || b(str, str2, str3) == null) {
            return false;
        }
        return true;
    }

    public static String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str)) {
                str = "gecko_offline_res_x";
            }
            if (str3.indexOf("/") == 0) {
                str3 = str3.substring(1);
            }
            if (str3.lastIndexOf("/") == str3.length() - 1) {
                str3 = str3.substring(0, str3.lastIndexOf("/"));
            }
            try {
                File file = new File(a(l()), str + File.separator + str2);
                if (!file.exists()) {
                    return null;
                }
                String absolutePath = file.getAbsolutePath();
                File file2 = new File(absolutePath, str3);
                if (!file2.exists()) {
                    return null;
                }
                Long a2 = m.a(file2);
                if (a2 == null) {
                    return null;
                }
                return absolutePath + File.separator + str3 + File.separator + a2 + File.separator + "res";
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
