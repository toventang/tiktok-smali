package com.bytedance.helios.sdk;

import android.app.AppOpsManager;
import android.app.Application;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.api.b.q;
import com.bytedance.helios.api.config.AbstractSettingsModel;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.config.ApiConfig;
import com.bytedance.helios.api.config.ApiInfo;
import com.bytedance.helios.api.config.ApiSampleRateConfig;
import com.bytedance.helios.api.config.CrpConfig;
import com.bytedance.helios.api.config.DefaultSampleRateConfig;
import com.bytedance.helios.api.config.FrequencyGroupModel;
import com.bytedance.helios.api.config.ResourceCheckModel;
import com.bytedance.helios.api.config.ResourceSampleRateConfig;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.api.config.SampleRateConfig;
import com.bytedance.helios.api.d.a;
import com.bytedance.helios.sdk.a.b;
import com.ss.android.agilelogger.ALog;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class HeliosEnvImpl extends com.bytedance.helios.api.a {
    public static final HeliosEnvImpl INSTANCE = new HeliosEnvImpl();
    private static final Map<String, h.f.a.a<Object>> baseExpressionEnv = ag.b(v.a("$region", a.f30716a), v.a("$channel", b.f30717a), v.a("$version_code", c.f30718a), v.a("$device_id", d.f30719a), v.a("$os_version", e.f30720a), v.a("$first_start", f.f30721a));
    private static Map<String, com.bytedance.helios.sdk.f.a.b> blockConditions = new LinkedHashMap();
    private static volatile com.bytedance.helios.api.config.a envAppInfo;
    private static com.bytedance.helios.api.config.b envProxy;
    private static volatile boolean envReady;
    private static AbstractSettingsModel envSettings = new d();
    private static volatile boolean envSettingsReady;
    private static Map<String, com.bytedance.helios.sdk.f.a.b> monitorConditions = new LinkedHashMap();

    private HeliosEnvImpl() {
    }

    public final Map<String, h.f.a.a<Object>> getBaseExpressionEnv() {
        return baseExpressionEnv;
    }

    public final Map<String, com.bytedance.helios.sdk.f.a.b> getBlockConditions() {
        return blockConditions;
    }

    public final com.bytedance.helios.api.config.a getEnvAppInfo() {
        return envAppInfo;
    }

    public final Map<String, com.bytedance.helios.sdk.f.a.b> getMonitorConditions() {
        return monitorConditions;
    }

    static final class e extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f30720a = new e();

        static {
            Covode.recordClassIndex(17861);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public final boolean getAlogEnabled() {
        return envSettings.getAlogEnabled();
    }

    public final List<AnchorInfoModel> getAnchorConfigList() {
        return envSettings.getAnchorConfigList();
    }

    public final ApiConfig getApiConfig() {
        return envSettings.getApiConfig();
    }

    public final long getApiTimeOutDuration() {
        return envSettings.getApiTimeOutDuration();
    }

    public final boolean getAppOpsIgnoreKnownApi() {
        return envSettings.getAppOpsIgnoreKnownApi();
    }

    public final long getBackgroundFreezeDuration() {
        return envSettings.getBackgroundFreezeDuration();
    }

    public final CrpConfig getCrpConfig() {
        return envSettings.getCrpConfig();
    }

    public final List<FrequencyGroupModel> getFrequencyGroupModels() {
        return envSettings.getFrequencyGroupModels();
    }

    public final List<String> getInterestedAppOps() {
        return envSettings.getInterestedAppOps();
    }

    public final List<ResourceCheckModel> getResourceCheckSettings() {
        return envSettings.getResourceCheckList();
    }

    public final List<RuleInfo> getRuleInfoList() {
        return envSettings.getRuleInfoList();
    }

    public final SampleRateConfig getSampleRateConfig() {
        return envSettings.getSampleRateConfig();
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f30717a = new b();

        static {
            Covode.recordClassIndex(17858);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String str;
            com.bytedance.helios.api.config.a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
            if (envAppInfo == null || (str = envAppInfo.f30713d) == null) {
                return "";
            }
            return str;
        }
    }

    private final void initSettingsAsync() {
        com.bytedance.helios.a.a.a.b().post(j.f30726a);
    }

    public final Application getApplication() {
        com.bytedance.helios.api.config.a aVar = envAppInfo;
        if (aVar != null) {
            return aVar.f30712c;
        }
        return null;
    }

    public final String getDeviceId() {
        com.bytedance.helios.api.config.b bVar = envProxy;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    static final class a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f30716a = new a();

        static {
            Covode.recordClassIndex(17857);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2;
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.INSTANCE;
            com.bytedance.helios.api.config.b bVar = HeliosEnvImpl.envProxy;
            if (bVar == null || (a2 = bVar.a()) == null) {
                return "";
            }
            return a2;
        }
    }

    static final class c extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f30718a = new c();

        static {
            Covode.recordClassIndex(17859);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long j2;
            com.bytedance.helios.api.config.a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
            if (envAppInfo != null) {
                j2 = envAppInfo.f30711b;
            } else {
                j2 = 0;
            }
            return Long.valueOf(j2);
        }
    }

    static final class d extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f30719a = new d();

        static {
            Covode.recordClassIndex(17860);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String b2;
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.INSTANCE;
            com.bytedance.helios.api.config.b bVar = HeliosEnvImpl.envProxy;
            if (bVar == null || (b2 = bVar.b()) == null) {
                return "";
            }
            return b2;
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f30721a = new f();

        static {
            Covode.recordClassIndex(17862);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            com.bytedance.helios.api.config.a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
            if (envAppInfo != null) {
                z = envAppInfo.f30714e;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.helios.api.config.b f30724a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.helios.api.config.a f30725b;

        static {
            Covode.recordClassIndex(17865);
        }

        i(com.bytedance.helios.api.config.b bVar, com.bytedance.helios.api.config.a aVar) {
            this.f30724a = bVar;
            this.f30725b = aVar;
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            f.a().a(this.f30725b.f30712c);
            com.bytedance.helios.sdk.c.f.a("LifecycleMonitor.initialize", currentTimeMillis, true);
        }
    }

    @Override // com.bytedance.helios.api.a
    public final boolean isEnabled() {
        if (envSettingsReady && envSettings.getEnabled()) {
            return true;
        }
        com.bytedance.helios.api.config.a aVar = envAppInfo;
        if (aVar == null || !aVar.f30714e) {
            return false;
        }
        return true;
    }

    public final boolean isOffLineEnv() {
        if (isTestEnv()) {
            return true;
        }
        com.bytedance.helios.api.config.a aVar = envAppInfo;
        if (aVar == null || !aVar.f30710a) {
            return false;
        }
        return true;
    }

    public final boolean isTestEnv() {
        String str;
        List<String> testEnvChannels = envSettings.getTestEnvChannels();
        com.bytedance.helios.api.config.a aVar = envAppInfo;
        if (aVar != null) {
            str = aVar.f30713d;
        } else {
            str = null;
        }
        return n.a((Iterable) testEnvChannels, (Object) str);
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final h f30723a = new h();

        static {
            Covode.recordClassIndex(17864);
        }

        h() {
        }

        public final void run() {
            if (HeliosEnvImpl.INSTANCE.isOffLineEnv()) {
                ALog.setDebug(true);
                ConfigManager configManager = Npth.getConfigManager();
                l.a((Object) configManager, "");
                configManager.setDebugMode(true);
            }
            com.bytedance.helios.sdk.utils.f.a("Helios-Common-Env", String.valueOf(HeliosEnvImpl.INSTANCE.getEnvAppInfo()), (String) null, 12);
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.INSTANCE;
            com.bytedance.helios.sdk.utils.f.a("Helios-Common-Env", HeliosEnvImpl.envSettings.toString(), (String) null, 12);
        }
    }

    public final synchronized void checkAllCommonEnvReady() {
        MethodCollector.i(2829);
        if (!envReady && envSettingsReady) {
            envReady = true;
            com.bytedance.helios.sdk.utils.f.a("Helios-Common-Env", "checkAllCommonEnvReady", (String) null, 12);
            com.bytedance.helios.sdk.utils.g.b().post(g.f30722a);
            com.bytedance.helios.a.a.a.b().postDelayed(h.f30723a, 10000);
        }
        MethodCollector.o(2829);
    }

    public final String getUserRegion() {
        String str;
        com.bytedance.helios.api.config.b bVar = envProxy;
        if (bVar != null) {
            str = bVar.a();
        } else {
            str = null;
        }
        if (envProxy != null) {
            com.bytedance.helios.sdk.utils.f.a("Helios-Common-Env", "userRegion=".concat(String.valueOf(str)), (String) null, 12);
        }
        return str;
    }

    public final void tryStartNativeAudioMonitor() {
        if (isEnabled() && getApplication() != null) {
            Application application = getApplication();
            if (application == null) {
                l.a();
            }
            if (com.bytedance.helios.sdk.utils.h.a(application)) {
                com.bytedance.helios.api.d.a a2 = a.C0642a.a();
                if (a2 != null) {
                    a2.startMonitor();
                }
                com.bytedance.helios.sdk.utils.f.a("HeliosEnv", "tryEnableNativeAudioMonitor: ".concat(String.valueOf(a2)), (String) null, 12);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final j f30726a = new j();

        static {
            Covode.recordClassIndex(17866);
        }

        j() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
            if (h.a.n.a((java.lang.Iterable) r1, (java.lang.Object) r0) != false) goto L_0x0030;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                com.bytedance.helios.api.config.b r0 = com.bytedance.helios.sdk.HeliosEnvImpl.access$getEnvProxy$p(r0)
                if (r0 == 0) goto L_0x000e
                com.bytedance.helios.api.config.AbstractSettingsModel r3 = r0.c()
                if (r3 != 0) goto L_0x000f
            L_0x000e:
                return
            L_0x000f:
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                com.bytedance.helios.api.config.a r0 = r0.getEnvAppInfo()
                r2 = 1
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.f30710a
                if (r0 == r2) goto L_0x0030
            L_0x001c:
                java.util.List r1 = r3.getTestEnvChannels()
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                com.bytedance.helios.api.config.a r0 = r0.getEnvAppInfo()
                if (r0 == 0) goto L_0x004f
                java.lang.String r0 = r0.f30713d
            L_0x002a:
                boolean r0 = h.a.n.a(r1, r0)
                if (r0 == 0) goto L_0x003f
            L_0x0030:
                com.ss.android.agilelogger.ALog.setDebug(r2)
                com.bytedance.crash.runtime.ConfigManager r1 = com.bytedance.crash.Npth.getConfigManager()
                java.lang.String r0 = ""
                h.f.b.l.a(r1, r0)
                r1.setDebugMode(r2)
            L_0x003f:
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                com.bytedance.helios.sdk.HeliosEnvImpl.access$setEnvSettings$p(r0, r3)
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                com.bytedance.helios.sdk.HeliosEnvImpl.access$setEnvSettingsReady$p(r0, r2)
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                r0.checkAllCommonEnvReady()
                goto L_0x000e
            L_0x004f:
                r0 = 0
                goto L_0x002a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.HeliosEnvImpl.j.run():void");
        }
    }

    static {
        Covode.recordClassIndex(17856);
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final g f30722a = new g();

        static {
            Covode.recordClassIndex(17863);
        }

        g() {
        }

        public final void run() {
            int i2;
            String str;
            Application application;
            com.bytedance.helios.sdk.a.b a2;
            long currentTimeMillis = System.currentTimeMillis();
            SampleRateConfig sampleRateConfig = HeliosEnvImpl.INSTANCE.getSampleRateConfig();
            l.c(sampleRateConfig, "");
            String deviceId = HeliosEnvImpl.INSTANCE.getDeviceId();
            if (deviceId == null || p.a((CharSequence) deviceId) || l.a((Object) deviceId, (Object) "0") || l.a((Object) deviceId, (Object) "-1")) {
                deviceId = com.bytedance.helios.sdk.utils.d.a("random_device_id");
                if (p.a((CharSequence) deviceId)) {
                    deviceId = UUID.randomUUID().toString();
                    l.a((Object) deviceId, "");
                    com.bytedance.helios.sdk.utils.d.b("random_device_id", deviceId);
                }
            }
            String sb = new StringBuilder().append(com.bytedance.helios.sdk.g.b.f30987a.get(1)).append('-').append(com.bytedance.helios.sdk.g.b.f30987a.get(2)).append('-').append(com.bytedance.helios.sdk.g.b.f30987a.get(5)).toString();
            String a3 = com.bytedance.helios.sdk.utils.d.a("sample_rate_date", "");
            long abs = Math.abs(com.bytedance.helios.sdk.g.a.a(com.bytedance.helios.sdk.g.a.a(deviceId)));
            com.bytedance.helios.sdk.utils.f.a("Helios-Common-Env", "generateSampleRateResults deviceId=" + deviceId + " hashCode=" + abs + " date=" + sb + " originalDate=" + a3, (String) null, 12);
            com.bytedance.helios.sdk.utils.f.a("Helios-Common-Env", "generateSampleRateResults\n" + com.bytedance.helios.sdk.utils.c.a(sampleRateConfig), (String) null, 12);
            DefaultSampleRateConfig defaultLowPriorityConfig = sampleRateConfig.getDefaultLowPriorityConfig();
            com.bytedance.helios.sdk.g.b.f30988b = new com.bytedance.helios.api.b.p(com.bytedance.helios.sdk.g.b.a(abs, sampleRateConfig.getAppOpsConfig()), com.bytedance.helios.sdk.g.b.a(abs, sampleRateConfig.getAutoStartConfig()), com.bytedance.helios.sdk.g.b.a(abs, sampleRateConfig.getExceptionConfig()), new com.bytedance.helios.api.b.e(com.bytedance.helios.sdk.g.b.a(abs, defaultLowPriorityConfig.getMonitorNormal()), com.bytedance.helios.sdk.g.b.a(abs, defaultLowPriorityConfig.getMonitorError()), com.bytedance.helios.sdk.g.b.a(abs, defaultLowPriorityConfig.getInterceptError())));
            List<ResourceSampleRateConfig> resourceMediumPriorityConfigs = sampleRateConfig.getResourceMediumPriorityConfigs();
            ArrayList arrayList = new ArrayList(n.a((Iterable) resourceMediumPriorityConfigs, 10));
            for (T t : resourceMediumPriorityConfigs) {
                com.bytedance.helios.sdk.g.b.f30989c.put(t.getResourceId(), new com.bytedance.helios.api.b.e(com.bytedance.helios.sdk.g.b.a(abs, t.getMonitorNormal()), com.bytedance.helios.sdk.g.b.a(abs, t.getMonitorError()), com.bytedance.helios.sdk.g.b.a(abs, t.getInterceptError())));
                arrayList.add(z.f158842a);
            }
            List<ApiSampleRateConfig> apiHighPriorityConfigs = sampleRateConfig.getApiHighPriorityConfigs();
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) apiHighPriorityConfigs, 10));
            for (T t2 : apiHighPriorityConfigs) {
                com.bytedance.helios.api.b.e eVar = new com.bytedance.helios.api.b.e(com.bytedance.helios.sdk.g.b.a(abs, t2.getMonitorNormal()), com.bytedance.helios.sdk.g.b.a(abs, t2.getMonitorError()), com.bytedance.helios.sdk.g.b.a(abs, t2.getInterceptError()));
                Iterator<T> it = t2.getApiIds().iterator();
                while (it.hasNext()) {
                    com.bytedance.helios.sdk.g.b.f30990d.put(Integer.valueOf(it.next().intValue()), eVar);
                }
                arrayList2.add(z.f158842a);
            }
            if (!sampleRateConfig.getEnableMonitor() || !(!l.a((Object) sb, (Object) a3))) {
                i2 = 12;
                str = null;
            } else {
                com.bytedance.helios.sdk.utils.d.b("sample_rate_date", sb);
                com.bytedance.helios.api.b.p pVar = com.bytedance.helios.sdk.g.b.f30988b;
                if (pVar == null) {
                    l.a();
                }
                i2 = 12;
                str = null;
                q qVar = new q(sb, deviceId, abs, pVar, com.bytedance.helios.sdk.g.b.f30989c, com.bytedance.helios.sdk.g.b.f30990d);
                l.c(qVar, "");
                o.f30690f.obtainMessage(1002, qVar).sendToTarget();
            }
            com.bytedance.helios.sdk.utils.f.a("Helios-Common-Env", "generateSampleRateResults\n" + com.bytedance.helios.sdk.g.b.f30988b + '\n' + com.bytedance.helios.sdk.g.b.f30989c + '\n' + com.bytedance.helios.sdk.g.b.f30990d, str, i2);
            com.bytedance.helios.sdk.c.f.a("SamplerManager.generateSampleRateResults", currentTimeMillis, true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t3 : HeliosEnvImpl.INSTANCE.getRuleInfoList()) {
                linkedHashMap.put("$" + t3.getName(), new com.bytedance.helios.sdk.f.a.e(t3.getName()));
            }
            for (Map.Entry<String, RuleInfo> entry : com.bytedance.helios.sdk.f.e.a.f30981c.entrySet()) {
                linkedHashMap.put("$" + entry.getKey(), new com.bytedance.helios.sdk.f.a.e(entry.getKey()));
            }
            linkedHashMap.put("$background", new com.bytedance.helios.sdk.f.a.a());
            linkedHashMap.put("$frequency", new com.bytedance.helios.sdk.f.a.c(false));
            linkedHashMap.put("$parameter", new com.bytedance.helios.sdk.f.a.d(true));
            HeliosEnvImpl.INSTANCE.setBlockConditions(linkedHashMap);
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.INSTANCE;
            Map<String, com.bytedance.helios.sdk.f.a.b> d2 = ag.d(linkedHashMap);
            d2.put("$frequency", new com.bytedance.helios.sdk.f.a.c(true));
            d2.put("$parameter", new com.bytedance.helios.sdk.f.a.d(false));
            heliosEnvImpl.setMonitorConditions(d2);
            HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.INSTANCE;
            List<RuleInfo> ruleInfoList = HeliosEnvImpl.envSettings.getRuleInfoList();
            ArrayList<RuleInfo> arrayList3 = new ArrayList();
            for (T t4 : ruleInfoList) {
                if (l.a((Object) t4.getRegisterType(), (Object) "auto")) {
                    arrayList3.add(t4);
                }
            }
            for (RuleInfo ruleInfo : arrayList3) {
                com.bytedance.helios.sdk.f.b.a(ruleInfo);
            }
            HeliosEnvImpl heliosEnvImpl3 = HeliosEnvImpl.INSTANCE;
            boolean alogEnabled = HeliosEnvImpl.envSettings.getAlogEnabled();
            HeliosEnvImpl heliosEnvImpl4 = HeliosEnvImpl.INSTANCE;
            long alogDuration = HeliosEnvImpl.envSettings.getAlogDuration();
            com.bytedance.helios.sdk.c.a.f30805b = alogEnabled;
            com.bytedance.helios.sdk.c.a.f30806c = alogDuration;
            long j2 = com.bytedance.helios.sdk.c.a.a().getLong("alog_last_request_start_time", 0);
            long j3 = com.bytedance.helios.sdk.c.a.a().getLong("alog_last_request_end_time", 0);
            if (1 <= j2 && j3 > j2) {
                com.bytedance.helios.sdk.c.a.a(j2, j3, 0);
            }
            com.bytedance.helios.api.config.a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
            if (!(envAppInfo == null || (application = envAppInfo.f30712c) == null || Build.VERSION.SDK_INT < 30 || (a2 = b.a.a(application)) == null)) {
                try {
                    AppOpsManager appOpsManager = a2.f30751a;
                    if (appOpsManager != null) {
                        appOpsManager.setOnOpNotedCallback(com.bytedance.helios.sdk.utils.g.c(), a2.f30752b);
                    }
                } catch (Exception e2) {
                    o.a(new com.bytedance.helios.api.c.b(null, e2, "label_app_ops_listen", null, 9));
                }
            }
            HeliosEnvImpl.INSTANCE.tryStartNativeAudioMonitor();
            HeliosEnvImpl heliosEnvImpl5 = HeliosEnvImpl.INSTANCE;
            com.bytedance.helios.api.config.b bVar = HeliosEnvImpl.envProxy;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    public final void setEnvAppInfo(com.bytedance.helios.api.config.a aVar) {
        envAppInfo = aVar;
    }

    public final void setBlockConditions(Map<String, com.bytedance.helios.sdk.f.a.b> map) {
        l.c(map, "");
        blockConditions = map;
    }

    public final void setMonitorConditions(Map<String, com.bytedance.helios.sdk.f.a.b> map) {
        l.c(map, "");
        monitorConditions = map;
    }

    @Override // com.bytedance.helios.api.a
    public final void ruleChangeNotify(RuleInfo ruleInfo) {
        l.c(ruleInfo, "");
        com.bytedance.helios.sdk.f.b.a(ruleInfo);
    }

    @Override // com.bytedance.helios.api.a
    public final void recordRegionEvent(Map<String, Object> map) {
        l.c(map, "");
        l.c(map, "");
        Object obj = map.get("event_time_stamp");
        if (!(obj instanceof Long)) {
            obj = null;
        }
        Long l2 = (Long) obj;
        if (l2 != null) {
            map.put("event_date_time", com.bytedance.helios.a.a.g.a(l2.longValue()));
            map.put("event_time_stamp", String.valueOf(l2.longValue()));
        }
        com.bytedance.helios.sdk.utils.f.a("RegionEvent", map.toString(), (String) null, 12);
        com.bytedance.helios.sdk.e.a<Map<String, Object>> aVar = com.bytedance.helios.sdk.e.c.f30945a;
        if (aVar != null) {
            aVar.offer(map);
        }
    }

    @Override // com.bytedance.helios.api.a
    public final void ruleChangeNotify(String str, boolean z) {
        l.c(str, "");
        com.bytedance.helios.sdk.f.b.a(str, z);
    }

    public final List<ApiInfo> getApiInfoList(int i2, String str) {
        String str2;
        com.bytedance.helios.sdk.d.e b2 = e.b(i2);
        if (!(b2 == null || (str2 = b2.f30873a) == null)) {
            str = str2;
        }
        List<ApiInfo> apiInfoList = getApiConfig().getApiInfoList();
        ArrayList arrayList = new ArrayList();
        for (T t : apiInfoList) {
            T t2 = t;
            if (t2.getApiIds().contains(Integer.valueOf(i2)) || (str != null && !p.a((CharSequence) str) && t2.getResourceIds().contains(str))) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return n.a(getApiConfig().getDefaultApiInfo());
        }
        return arrayList2;
    }

    @Override // com.bytedance.helios.api.a
    public final void init(com.bytedance.helios.api.config.b bVar, com.bytedance.helios.api.config.a aVar) {
        MethodCollector.i(2823);
        l.c(bVar, "");
        l.c(aVar, "");
        synchronized (this) {
            try {
                if (!envReady) {
                    long currentTimeMillis = System.currentTimeMillis();
                    envProxy = bVar;
                    envAppInfo = aVar;
                    INSTANCE.initSettingsAsync();
                    com.bytedance.helios.sdk.utils.g a2 = com.bytedance.helios.sdk.utils.g.a();
                    l.a((Object) a2, "");
                    a2.setUncaughtExceptionHandler(com.bytedance.helios.api.c.a.f30705a);
                    com.bytedance.helios.a.a.a a3 = com.bytedance.helios.a.a.a.a();
                    l.a((Object) a3, "");
                    a3.setUncaughtExceptionHandler(com.bytedance.helios.api.c.a.f30705a);
                    com.bytedance.helios.a.a.c.a().post(new i(bVar, aVar));
                    com.bytedance.helios.sdk.c.f.a("HeliosEnv.init", currentTimeMillis, true);
                    MethodCollector.o(2823);
                }
            } finally {
                MethodCollector.o(2823);
            }
        }
    }

    public static /* synthetic */ List getApiInfoList$default(HeliosEnvImpl heliosEnvImpl, int i2, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        return heliosEnvImpl.getApiInfoList(i2, str);
    }
}
