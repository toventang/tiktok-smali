package com.bytedance.geckox;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.framwork.core.sdkmonitor.k;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.c.a;
import com.bytedance.geckox.c.c;
import com.bytedance.geckox.e;
import com.bytedance.geckox.e.o;
import com.bytedance.geckox.e.q;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.settings.b;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.statistic.model.d;
import com.bytedance.geckox.utils.h;
import com.bytedance.geckox.utils.j;
import com.bytedance.geckox.utils.n;
import com.bytedance.q.d;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class f {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f29840i = true;

    /* renamed from: k  reason: collision with root package name */
    private static f f29841k;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f29842a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> f29843b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public Context f29844c;

    /* renamed from: d  reason: collision with root package name */
    public GeckoGlobalConfig f29845d;

    /* renamed from: e  reason: collision with root package name */
    public b f29846e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.geckox.policy.v4.a f29847f;

    /* renamed from: g  reason: collision with root package name */
    public long f29848g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f29849h = false;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.geckox.statistic.a f29850j;

    /* renamed from: l  reason: collision with root package name */
    private Common f29851l;

    /* renamed from: m  reason: collision with root package name */
    private AtomicBoolean f29852m = new AtomicBoolean(false);

    public final GeckoGlobalConfig d() {
        i();
        return this.f29845d;
    }

    static {
        Covode.recordClassIndex(17314);
    }

    private f() {
    }

    public final GlobalConfigSettings e() {
        i();
        if (this.f29845d == null) {
            return null;
        }
        j();
        b bVar = this.f29846e;
        if (bVar == null) {
            return null;
        }
        return bVar.f30031c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.geckox.f$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29853a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 17315(0x43a3, float:2.4263E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.geckox.GeckoGlobalConfig$ENVType[] r0 = com.bytedance.geckox.GeckoGlobalConfig.ENVType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.geckox.f.AnonymousClass1.f29853a = r2
                com.bytedance.geckox.GeckoGlobalConfig$ENVType r0 = com.bytedance.geckox.GeckoGlobalConfig.ENVType.BOE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.geckox.f.AnonymousClass1.f29853a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.geckox.GeckoGlobalConfig$ENVType r0 = com.bytedance.geckox.GeckoGlobalConfig.ENVType.DEV     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.geckox.f.AnonymousClass1.f29853a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.geckox.GeckoGlobalConfig$ENVType r0 = com.bytedance.geckox.GeckoGlobalConfig.ENVType.PROD     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.f.AnonymousClass1.<clinit>():void");
        }
    }

    public static f a() {
        MethodCollector.i(11707);
        if (f29841k == null) {
            synchronized (f.class) {
                try {
                    if (f29841k == null) {
                        f29841k = new f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11707);
                    throw th;
                }
            }
        }
        f fVar = f29841k;
        MethodCollector.o(11707);
        return fVar;
    }

    public final Common b() {
        if (this.f29851l == null) {
            this.f29851l = new Common(this.f29845d.getAppId(), this.f29845d.getAppVersion(), this.f29845d.getDeviceId(), this.f29845d.getRegion());
        }
        return this.f29851l;
    }

    public final Common c() {
        Common common = new Common(this.f29845d.getAppId(), this.f29845d.getAppVersion(), this.f29845d.getDeviceId(), this.f29845d.getRegion());
        common.appName = com.bytedance.geckox.utils.a.b(this.f29844c);
        common.ac = j.a(this.f29844c);
        return common;
    }

    public final void f() {
        int i2 = AnonymousClass1.f29853a[d().getEnv().ordinal()];
        if (i2 == 1 || i2 == 2) {
            n a2 = n.a();
            a2.a(this.f29844c);
            f29840i = a2.f30133a.getBoolean("gecko_switch", true);
        }
    }

    public final synchronized void j() {
        MethodCollector.i(12031);
        if (this.f29846e == null) {
            this.f29846e = new b(this.f29845d);
            a aVar = new a(this, (byte) 0);
            b bVar = this.f29846e;
            if (bVar != null) {
                com.bytedance.geckox.settings.a.a aVar2 = bVar.f30032d;
                if (aVar2.f30028a == null) {
                    aVar2.f30028a = new CopyOnWriteArrayList();
                }
                aVar2.f30028a.add(aVar);
            }
        }
        MethodCollector.o(12031);
    }

    public final boolean g() {
        boolean z;
        f();
        GlobalConfigSettings e2 = e();
        if (e2 == null || e2.getReqMeta() == null) {
            com.bytedance.geckox.i.a.a("gecko update enable:", Boolean.valueOf(f29840i));
            return f29840i;
        }
        if (e2.getReqMeta().getEnable() != 1 || !f29840i) {
            z = false;
        } else {
            z = true;
        }
        com.bytedance.geckox.i.a.a("gecko update enable:", Boolean.valueOf(z));
        return z;
    }

    public final boolean h() {
        boolean z;
        GlobalConfigSettings e2 = e();
        if (e2 == null || e2.getReqMeta() == null) {
            boolean g2 = g();
            com.bytedance.geckox.i.a.a("gecko update combine enable:", Boolean.valueOf(g2));
            return g2;
        }
        if (!g() || e2.getReqMeta().getPollEnable() != 1) {
            z = false;
        } else {
            z = true;
        }
        com.bytedance.geckox.i.a.a("gecko update combine enable:", Boolean.valueOf(z));
        return z;
    }

    public final synchronized void i() {
        IGeckoGlobalInit iGeckoGlobalInit;
        String str;
        MethodCollector.i(11879);
        if (!(this.f29852m.get() || (iGeckoGlobalInit = (IGeckoGlobalInit) ServiceManager.get().getServiceForReal(IGeckoGlobalInit.class)) == null || iGeckoGlobalInit.a() == null)) {
            GeckoGlobalConfig a2 = iGeckoGlobalInit.a();
            this.f29852m.set(true);
            this.f29845d = a2;
            Context context = a2.getContext();
            this.f29844c = context;
            h.a(context);
            com.bytedance.geckox.policy.loop.b a3 = com.bytedance.geckox.policy.loop.b.a();
            GeckoGlobalConfig geckoGlobalConfig = this.f29845d;
            com.bytedance.geckox.i.a.a("loop manager init");
            e.a a4 = new e.a(geckoGlobalConfig.getContext()).a(geckoGlobalConfig.getAppId());
            a4.f29804j = geckoGlobalConfig.getDeviceId();
            a4.f29795a = geckoGlobalConfig.getNetWork();
            a4.f29800f = geckoGlobalConfig.getStatisticMonitor();
            a4.f29805k = geckoGlobalConfig.getHost();
            a3.f29990a = a4.b("gecko").a("gecko").b();
            com.bytedance.geckox.policy.e.a a5 = com.bytedance.geckox.policy.e.a.a();
            GeckoGlobalConfig geckoGlobalConfig2 = this.f29845d;
            if (a5.f29988c.compareAndSet(false, true)) {
                e.a a6 = new e.a(geckoGlobalConfig2.getContext()).a(geckoGlobalConfig2.getAppId());
                a6.f29804j = geckoGlobalConfig2.getDeviceId();
                a6.f29795a = geckoGlobalConfig2.getNetWork();
                a6.f29800f = geckoGlobalConfig2.getStatisticMonitor();
                a6.f29805k = geckoGlobalConfig2.getHost();
                a5.f29987a = a6.b("gecko").a("gecko").b();
                com.bytedance.geckox.policy.e.a.f29985b = System.currentTimeMillis();
            }
            this.f29848g = System.currentTimeMillis();
            if (!com.bytedance.geckox.statistic.b.f30052a) {
                com.bytedance.geckox.statistic.b.f30052a = true;
                com.bytedance.geckox.f.b.a(com.bytedance.geckox.e.b.class, new com.bytedance.q.b.a() {
                    /* class com.bytedance.geckox.statistic.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(17455);
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void b(com.bytedance.q.b<T> bVar, d dVar) {
                        super.b(bVar, dVar);
                        com.bytedance.geckox.statistic.model.d a2 = b.a((com.bytedance.q.b) bVar, false);
                        a2.f30106i = SystemClock.uptimeMillis() - a2.p;
                        a2.f30105h += a2.f30106i;
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, d dVar) {
                        super.a(bVar, dVar);
                        Pair pair = (Pair) bVar.b(o.class);
                        com.bytedance.geckox.statistic.model.d a2 = b.a((com.bytedance.q.b) bVar, true);
                        a2.p = SystemClock.uptimeMillis();
                        a2.a((UpdatePackage) pair.second, true).f30115e = ((Uri) pair.first).toString();
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
                        super.a(bVar, dVar, th);
                        com.bytedance.geckox.statistic.model.d a2 = b.a((com.bytedance.q.b) bVar, false);
                        a2.f30105h += SystemClock.uptimeMillis() - a2.p;
                        b.a((com.bytedance.q.b) bVar, false).a((UpdatePackage) bVar.a(o.class), false).f30116f++;
                    }
                });
                com.bytedance.geckox.f.b.a(o.class, new com.bytedance.q.b.a() {
                    /* class com.bytedance.geckox.statistic.b.AnonymousClass7 */

                    static {
                        Covode.recordClassIndex(17466);
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
                        int i2;
                        if (th instanceof com.bytedance.geckox.c.d) {
                            i2 = 100;
                        } else if (th instanceof com.bytedance.geckox.c.e) {
                            i2 = 101;
                        } else {
                            return;
                        }
                        b.a(bVar, i2, th);
                    }
                });
                com.bytedance.geckox.f.b.a(q.class, new com.bytedance.q.b.a() {
                    /* class com.bytedance.geckox.statistic.b.AnonymousClass10 */

                    static {
                        Covode.recordClassIndex(17456);
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, d dVar) {
                        super.a(bVar, dVar);
                        b.a((com.bytedance.q.b) bVar, false).q = SystemClock.uptimeMillis();
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void b(com.bytedance.q.b<T> bVar, d dVar) {
                        super.b(bVar, dVar);
                        com.bytedance.geckox.statistic.model.d a2 = b.a((com.bytedance.q.b) bVar, false);
                        a2.f30108k = SystemClock.uptimeMillis() - a2.q;
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, d dVar, Throwable th) {
                        super.a(bVar, dVar, th);
                        b.a(bVar, 200, th);
                    }
                });
                com.bytedance.geckox.f.b.a(com.bytedance.geckox.e.n.class, new com.bytedance.q.b.a() {
                    /* class com.bytedance.geckox.statistic.b.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(17468);
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void b(com.bytedance.q.b<T> bVar, d dVar) {
                        super.b(bVar, dVar);
                        UpdatePackage updatePackage = (UpdatePackage) bVar.a(o.class);
                        com.bytedance.geckox.statistic.model.d a2 = b.a((com.bytedance.q.b) bVar, false);
                        a2.f30101d = true;
                        a2.f30103f = SystemClock.uptimeMillis() - a2.o;
                        d.a a3 = a2.a(updatePackage, false);
                        a3.f30112b = true;
                        a2.f30104g = SystemClock.uptimeMillis() - a3.f30118h;
                        a2.f30107j = a2.f30104g - a2.f30105h;
                        c.a(updatePackage);
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, com.bytedance.q.d dVar, Throwable th) {
                        super.a(bVar, dVar, th);
                        b.a(bVar, 500, th);
                    }
                });
                com.bytedance.geckox.f.b.a(com.bytedance.geckox.e.j.class, new com.bytedance.q.b.a() {
                    /* class com.bytedance.geckox.statistic.b.AnonymousClass8 */

                    static {
                        Covode.recordClassIndex(17467);
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, com.bytedance.q.d dVar) {
                        super.a(bVar, dVar);
                        b.a((com.bytedance.q.b) bVar, false).t = SystemClock.uptimeMillis();
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void b(com.bytedance.q.b<T> bVar, com.bytedance.q.d dVar) {
                        super.b(bVar, dVar);
                        com.bytedance.geckox.statistic.model.d a2 = b.a((com.bytedance.q.b) bVar, false);
                        a2.n = SystemClock.uptimeMillis() - a2.t;
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, com.bytedance.q.d dVar, Throwable th) {
                        int i2;
                        super.a(bVar, dVar, th);
                        if (th instanceof a) {
                            i2 = 301;
                        } else {
                            i2 = 300;
                        }
                        b.a(bVar, i2, th);
                    }
                });
                com.bytedance.geckox.f.b.a(com.bytedance.geckox.e.a.a.class, new com.bytedance.q.b.a() {
                    /* class com.bytedance.geckox.statistic.b.AnonymousClass11 */

                    static {
                        Covode.recordClassIndex(17457);
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, com.bytedance.q.d dVar) {
                        super.a(bVar, dVar);
                        b.a((com.bytedance.q.b) bVar, false).r = SystemClock.uptimeMillis();
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void b(com.bytedance.q.b<T> bVar, com.bytedance.q.d dVar) {
                        super.b(bVar, dVar);
                        com.bytedance.geckox.statistic.model.d a2 = b.a((com.bytedance.q.b) bVar, false);
                        a2.f30109l = SystemClock.uptimeMillis() - a2.r;
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, com.bytedance.q.d dVar, Throwable th) {
                        int i2;
                        super.a(bVar, dVar, th);
                        if (th instanceof c) {
                            i2 = 400;
                        } else if (th instanceof a) {
                            i2 = 401;
                        } else {
                            i2 = 402;
                        }
                        b.a(bVar, i2, th);
                    }
                });
                com.bytedance.geckox.f.b.a(com.bytedance.geckox.e.a.b.class, new com.bytedance.q.b.a() {
                    /* class com.bytedance.geckox.statistic.b.AnonymousClass12 */

                    static {
                        Covode.recordClassIndex(17458);
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, com.bytedance.q.d dVar) {
                        super.a(bVar, dVar);
                        b.a((com.bytedance.q.b) bVar, false).s = SystemClock.uptimeMillis();
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void b(com.bytedance.q.b<T> bVar, com.bytedance.q.d dVar) {
                        super.b(bVar, dVar);
                        com.bytedance.geckox.statistic.model.d a2 = b.a((com.bytedance.q.b) bVar, false);
                        a2.f30110m = SystemClock.uptimeMillis() - a2.s;
                    }

                    @Override // com.bytedance.q.b.a
                    public final <T> void a(com.bytedance.q.b<T> bVar, com.bytedance.q.d dVar, Throwable th) {
                        int i2;
                        super.a(bVar, dVar, th);
                        if (th instanceof com.bytedance.geckox.c.b) {
                            i2 = ((com.bytedance.geckox.c.b) th).getCode();
                        } else {
                            i2 = 1099;
                        }
                        b.a(bVar, i2, th);
                    }
                });
            }
            com.bytedance.geckox.m.c.a();
            com.bytedance.geckox.statistic.a.a a7 = com.bytedance.geckox.statistic.a.a.a();
            Context context2 = a2.getContext();
            GeckoGlobalConfig.IMonitorConfig monitorConfig = a2.getMonitorConfig();
            if (monitorConfig != null && a7.f30048b.compareAndSet(false, true)) {
                if (monitorConfig.isOversea()) {
                    str = "3261";
                } else {
                    str = "3262";
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("device_id", a2.getDeviceId());
                    jSONObject.put("host_aid", a2.getAppId());
                    jSONObject.put("sdk_version", "3.0.0-rc.4-mt");
                    jSONObject.put("app_version", a2.getAppVersion());
                    String channel = monitorConfig.getChannel();
                    if (!TextUtils.isEmpty(channel)) {
                        jSONObject.put("channel", channel);
                    }
                    String updateVersionCode = monitorConfig.getUpdateVersionCode();
                    if (!TextUtils.isEmpty(updateVersionCode)) {
                        jSONObject.put("update_version_code", updateVersionCode);
                    }
                    String packageId = monitorConfig.getPackageId();
                    if (!TextUtils.isEmpty(packageId)) {
                        jSONObject.put("package_name", packageId);
                    }
                    SDKMonitorUtils.b(str, Collections.singletonList(monitorConfig.getMonitorHost() + "/monitor/collect/"));
                    SDKMonitorUtils.a(str, Collections.singletonList(monitorConfig.getMonitorHost() + "/monitor/appmonitor/v2/settings"));
                    Context applicationContext = context2.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                        if (applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                    }
                    SDKMonitorUtils.a(applicationContext, str, jSONObject, new k.a(monitorConfig, a2) {
                        /* class com.bytedance.geckox.statistic.a.a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ GeckoGlobalConfig.IMonitorConfig f30049a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ GeckoGlobalConfig f30050b;

                        static {
                            Covode.recordClassIndex(17453);
                        }

                        @Override // com.bytedance.framwork.core.sdkmonitor.k.a
                        public final String a() {
                            return null;
                        }

                        @Override // com.bytedance.framwork.core.sdkmonitor.k.a
                        public final Map<String, String> b() {
                            String str;
                            Map<String, String> commonParams = this.f30049a.getCommonParams();
                            if (commonParams == null) {
                                commonParams = new HashMap<>();
                            }
                            if (this.f30049a.isOversea()) {
                                str = "1";
                            } else {
                                str = "0";
                            }
                            commonParams.put("oversea", str);
                            commonParams.put("host_aid", String.valueOf(this.f30050b.getAppId()));
                            return commonParams;
                        }

                        {
                            this.f30049a = r2;
                            this.f30050b = r3;
                        }
                    });
                    a7.f30047a = SDKMonitorUtils.a(str);
                    MethodCollector.o(11879);
                    return;
                } catch (JSONException e2) {
                    com.bytedance.geckox.i.a.a("monitor init failed", e2);
                }
            }
        }
        MethodCollector.o(11879);
    }

    /* access modifiers changed from: package-private */
    public class a extends com.bytedance.geckox.settings.a.b {
        static {
            Covode.recordClassIndex(17316);
        }

        @Override // com.bytedance.geckox.settings.a.b
        public final void a(GlobalConfigSettings globalConfigSettings) {
            b(globalConfigSettings);
        }

        private a() {
        }

        private void b(GlobalConfigSettings globalConfigSettings) {
            if (f.this.f29845d != null && globalConfigSettings != null && globalConfigSettings.getReqMeta() != null) {
                if (f.this.f29847f == null) {
                    f.this.f29847f = new com.bytedance.geckox.policy.v4.a(f.this.f29845d);
                }
                f.this.f29847f.a(f.this.f29848g, globalConfigSettings.getReqMeta());
                com.bytedance.geckox.policy.loop.b.a().a(f.this.h());
                com.bytedance.geckox.policy.loop.b.a().a(globalConfigSettings.getReqMeta().getCheckUpdate());
            }
        }

        /* synthetic */ a(f fVar, byte b2) {
            this();
        }

        @Override // com.bytedance.geckox.settings.a.b
        public final void a(int i2, String str) {
            super.a(i2, str);
            if (i2 == 2103) {
                com.bytedance.geckox.policy.loop.b.a().b();
            } else if (!f.this.f29849h) {
                f.this.f29849h = true;
                b(f.this.e());
            }
        }
    }

    public final boolean a(boolean z) {
        GlobalConfigSettings e2 = e();
        if (e2 == null || e2.getReqMeta() == null) {
            return z;
        }
        if (e2.getReqMeta().getFreControlEnable() != 1 || !z) {
            return false;
        }
        return true;
    }

    public final void a(String str, Map<String, OptionCheckUpdateParams.CustomValue> map) {
        com.bytedance.geckox.i.a.a("gecko register custom params,accessKey:" + str + ",custom params:" + map.keySet());
        Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map2 = this.f29843b;
        if (!TextUtils.isEmpty(str) && !map.isEmpty()) {
            Map<String, OptionCheckUpdateParams.CustomValue> map3 = map2.get(str);
            if (map3 != null) {
                map3.putAll(map);
            } else {
                map2.put(str, map);
            }
        }
    }

    public final void a(String str, String str2) {
        String str3 = this.f29842a.get(str);
        if (TextUtils.isEmpty(str3)) {
            this.f29842a.put(str, str2);
            com.bytedance.geckox.i.a.a("gecko register root dir,accessKey:" + str + ",root dir:" + str2);
            return;
        }
        if (str3.endsWith("/")) {
            str3 = str3.substring(0, str3.length() - 1);
        }
        if (str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        if (!str3.equals(str2)) {
            String a2 = com.a.a("oldPath: %s, newPath: %s, stackTrace: %s", new Object[]{str3, str2, Log.getStackTraceString(new Throwable())});
            com.bytedance.geckox.i.a.a(com.a.a("registerAccessKey2Dir error for ak: %s, %s", new Object[]{str, a2}), true);
            com.bytedance.geckox.statistic.c.a(1, 11, a2, str);
        }
    }
}
