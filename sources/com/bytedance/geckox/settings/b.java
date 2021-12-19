package com.bytedance.geckox.settings;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.f;
import com.bytedance.geckox.l.a;
import com.bytedance.geckox.m.c;
import com.bytedance.geckox.settings.a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.SettingsLocal;
import com.bytedance.geckox.utils.n;
import com.bytedance.geckox.utils.o;
import com.bytedance.q.a.d;
import com.bytedance.q.h;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Context f30029a;

    /* renamed from: b  reason: collision with root package name */
    public GeckoGlobalConfig f30030b;

    /* renamed from: c  reason: collision with root package name */
    public GlobalConfigSettings f30031c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.geckox.settings.a.a f30032d;

    /* renamed from: e  reason: collision with root package name */
    public int f30033e;

    /* renamed from: f  reason: collision with root package name */
    public c f30034f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30035g = true;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.geckox.policy.a.a f30036h;

    /* renamed from: i  reason: collision with root package name */
    public AtomicBoolean f30037i = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17426);
    }

    /* access modifiers changed from: package-private */
    public class a extends com.bytedance.geckox.m.a {
        static {
            Covode.recordClassIndex(17429);
        }

        @Override // com.bytedance.geckox.m.a
        public final int a() {
            return 0;
        }

        @Override // com.bytedance.geckox.m.a
        public final void b() {
            b.this.a(3);
        }

        private a() {
        }

        /* synthetic */ a(b bVar, byte b2) {
            this();
        }
    }

    public final void a() {
        GlobalConfigSettings.GlobalConfig globalConfig;
        GlobalConfigSettings.SettingsPollingConfig checkUpdate;
        GlobalConfigSettings globalConfigSettings = this.f30031c;
        if (globalConfigSettings != null && (globalConfig = globalConfigSettings.getGlobalConfig()) != null && globalConfig.getPollEnable() == 1 && (checkUpdate = globalConfig.getCheckUpdate()) != null) {
            long interval = checkUpdate.getInterval() * 1000;
            c.a().a(new a(this, (byte) 0), interval, interval);
        }
    }

    public final void a(final int i2) {
        com.bytedance.geckox.i.a.a("sync global settings start", Integer.valueOf(i2));
        o.a().b().execute(new Runnable() {
            /* class com.bytedance.geckox.settings.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(17428);
            }

            public final void run() {
                Set<IGeckoRegister> a2;
                if (b.this.f30037i.compareAndSet(false, true)) {
                    Context context = b.this.f30029a;
                    GeckoGlobalConfig d2 = f.a().d();
                    if (!(d2 == null || (a2 = a.C0632a.f29926a.a(IGeckoRegister.class)) == null || a2.isEmpty())) {
                        com.bytedance.geckox.i.a.a("gecko register start,register count:" + a2.size());
                        long currentTimeMillis = System.currentTimeMillis();
                        GeckoGlobalConfig.ENVType env = d2.getEnv();
                        for (IGeckoRegister iGeckoRegister : a2) {
                            com.bytedance.geckox.a.a aVar = (com.bytedance.geckox.a.a) iGeckoRegister.getClass().getAnnotation(com.bytedance.geckox.a.a.class);
                            if (aVar == null) {
                                env.name();
                                iGeckoRegister.getClass().getName();
                                com.bytedance.geckox.i.a.b();
                            } else {
                                String a3 = aVar.a();
                                String b2 = aVar.b();
                                String c2 = aVar.c();
                                int i2 = a.AnonymousClass1.f30027a[env.ordinal()];
                                if (i2 == 2) {
                                    a3 = c2;
                                } else if (i2 == 3) {
                                    a3 = b2;
                                }
                                if (TextUtils.isEmpty(a3)) {
                                    env.name();
                                    iGeckoRegister.getClass().getName();
                                    com.bytedance.geckox.i.a.b();
                                } else {
                                    Map<String, OptionCheckUpdateParams.CustomValue> registerCustomParams = iGeckoRegister.registerCustomParams();
                                    if (registerCustomParams != null && !registerCustomParams.isEmpty()) {
                                        f.a().a(a3, registerCustomParams);
                                    }
                                    String registerRootDir = iGeckoRegister.registerRootDir(context);
                                    if (TextUtils.isEmpty(registerRootDir)) {
                                        env.name();
                                        iGeckoRegister.getClass().getName();
                                        com.bytedance.geckox.i.a.b();
                                    } else {
                                        f.a().a(a3, registerRootDir);
                                    }
                                }
                            }
                        }
                        com.bytedance.geckox.i.a.a("gecko register finish,time cost:" + (System.currentTimeMillis() - currentTimeMillis));
                    }
                }
                try {
                    GeckoGlobalConfig geckoGlobalConfig = b.this.f30030b;
                    int i3 = b.this.f30033e;
                    ArrayList arrayList = new ArrayList();
                    h.a a4 = new h.a().a(com.bytedance.geckox.settings.b.a.class);
                    a4.f42381c = new Object[]{geckoGlobalConfig, Integer.valueOf(i3)};
                    arrayList.add(a4.a());
                    com.bytedance.q.b a5 = com.bytedance.q.c.a(arrayList);
                    a5.a("req_type", Integer.valueOf(i2));
                    GlobalConfigSettings globalConfigSettings = (GlobalConfigSettings) a5.a((Object) null);
                    b.this.f30036h.b();
                    if (globalConfigSettings != null) {
                        com.bytedance.geckox.i.a.a("sync global settings success", globalConfigSettings);
                        b.this.f30035g = false;
                        b.this.f30031c = globalConfigSettings;
                        b bVar = b.this;
                        bVar.f30033e = bVar.f30031c.getVersion();
                        Context context2 = b.this.f30029a;
                        GlobalConfigSettings globalConfigSettings2 = b.this.f30031c;
                        com.bytedance.geckox.i.a.a("settings cache stored", globalConfigSettings2);
                        if (globalConfigSettings2 != null) {
                            n.a().a(context2, "gecko_settings", com.bytedance.geckox.d.b.f29780a.f29781b.b(globalConfigSettings2));
                        }
                        c.a().a(0);
                        b.this.f30032d.a(globalConfigSettings);
                    } else {
                        if (b.this.f30035g) {
                            b.this.f30035g = false;
                        }
                        b.this.f30032d.a();
                    }
                    b.this.a();
                } catch (Throwable th) {
                    b.this.f30032d.a();
                    throw th;
                }
                b.this.f30032d.a();
            }
        });
    }

    public b(GeckoGlobalConfig geckoGlobalConfig) {
        String str;
        this.f30030b = geckoGlobalConfig;
        this.f30029a = geckoGlobalConfig.getContext();
        this.f30032d = new com.bytedance.geckox.settings.a.a();
        this.f30034f = new c();
        SettingsLocal b2 = c.b(this.f30029a);
        String name = this.f30030b.getEnv().name();
        String appVersion = this.f30030b.getAppVersion();
        String str2 = null;
        if (b2 != null) {
            str2 = b2.getEnv();
            str = b2.getAppVersion();
        } else {
            str = null;
        }
        Context context = this.f30029a;
        SettingsLocal settingsLocal = new SettingsLocal(name, appVersion);
        com.bytedance.geckox.i.a.a("settings local cache stored", settingsLocal);
        n.a().a(context, "gecko_settings_local", com.bytedance.geckox.d.b.f29780a.f29781b.b(settingsLocal));
        if (!name.equals(str2) || !appVersion.equals(str)) {
            c.c(this.f30029a);
        } else {
            GlobalConfigSettings a2 = c.a(this.f30029a);
            this.f30031c = a2;
            if (a2 != null) {
                this.f30033e = a2.getVersion();
            }
        }
        this.f30036h = new com.bytedance.geckox.policy.a.a(new com.bytedance.geckox.policy.a.b() {
            /* class com.bytedance.geckox.settings.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17427);
            }

            @Override // com.bytedance.geckox.policy.a.b
            public final void a() {
                com.bytedance.geckox.i.a.a("sync global settings retry");
                b.this.a(2);
            }
        });
    }

    public final void a(Throwable th) {
        if (th.getCause() instanceof d) {
            this.f30036h.b();
            d dVar = (d) th.getCause();
            com.bytedance.geckox.settings.a.a aVar = this.f30032d;
            int i2 = dVar.code;
            String message = dVar.getMessage();
            if (aVar.f30028a != null && !aVar.f30028a.isEmpty()) {
                com.bytedance.geckox.i.a.a("global settings notify request error");
                for (com.bytedance.geckox.settings.a.b bVar : aVar.f30028a) {
                    bVar.a(i2, message);
                }
            }
            com.bytedance.geckox.i.a.a("settings loop stop");
            if (dVar.code == 2103) {
                c.c(this.f30029a);
                this.f30031c = null;
                this.f30033e = 0;
                this.f30035g = false;
                c.a().a(0);
                this.f30032d.a(null);
            } else if (this.f30035g) {
                this.f30035g = false;
                a();
            }
        } else {
            com.bytedance.geckox.i.a.c();
            if (th.getCause() instanceof com.bytedance.q.a.c) {
                com.bytedance.geckox.policy.a.a aVar2 = this.f30036h;
                if (aVar2.f29947b.compareAndSet(false, true)) {
                    aVar2.a();
                }
            }
            this.f30035g = true;
            c.a().a(0);
        }
    }
}
