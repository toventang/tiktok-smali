package com.ss.android.ugc.aweme.hybridkit.task;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.h;
import com.bytedance.hybrid.spark.a.i;
import com.bytedance.hybrid.spark.d;
import com.bytedance.ies.xelement.m;
import com.bytedance.ies.xelement.n;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.b;
import com.bytedance.lynx.hybrid.c;
import com.bytedance.lynx.hybrid.e.b;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.service.f;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.canvas.LynxHeliumCanvas;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.components.video.playbox.LynxDeclarativeVideoPlayBox;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.en;
import com.ss.android.ugc.aweme.web.k;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class HybridKitConfigTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f99752a = new a((byte) 0);

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ HybridKitConfigTask this$0;

        static {
            Covode.recordClassIndex(63594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(HybridKitConfigTask hybridKitConfigTask, Context context) {
            super(0);
            this.this$0 = hybridKitConfigTask;
            this.$context = context;
        }

        public static final class b implements com.bytedance.lynx.hybrid.a.d {
            static {
                Covode.recordClassIndex(63596);
            }

            b() {
            }

            @Override // com.bytedance.lynx.hybrid.a.d
            public final f a() {
                com.bytedance.lynx.hybrid.b.a aVar = new com.bytedance.lynx.hybrid.b.a();
                com.ss.android.ugc.aweme.hybridkit.bridge.a aVar2 = new com.ss.android.ugc.aweme.hybridkit.bridge.a();
                l.c(aVar2, "");
                aVar.f40875a = aVar2;
                return aVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            Context context = this.$context;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) context;
            Keva.getRepo("__hybrid_local_test__").getBoolean("lynxDebugEnable", true);
            b.a aVar = new b.a(application);
            com.bytedance.lynx.hybrid.e.d.f40960b = false;
            com.bytedance.lynx.hybrid.e.d.f40961c = false;
            aVar.f40946a = false;
            a aVar2 = new a(this);
            l.c(aVar2, "");
            aVar.f40947b.add(aVar2);
            com.ss.android.ugc.aweme.cq.a.a aVar3 = new com.ss.android.ugc.aweme.cq.a.a();
            l.c(aVar3, "");
            aVar.f40952g = aVar3;
            aVar.a(n.a(new c("canvas")));
            aVar.a(com.ss.android.ugc.aweme.cq.b.c.a(true));
            com.bytedance.lynx.hybrid.e.b bVar = new com.bytedance.lynx.hybrid.e.b(aVar.f40954i, aVar.f40946a, aVar.f40947b, aVar.f40948c, aVar.f40949d, aVar.f40950e, aVar.f40951f, aVar.f40952g, aVar.f40953h, (byte) 0);
            l.b(k.f145061a, "");
            l.b("gecko-va.tiktokv.com", "");
            List c2 = n.c("ecom_prefix");
            for (Pattern pattern : com.ss.android.ugc.aweme.web.l.b()) {
                if (pattern != null) {
                    String pattern2 = pattern.toString();
                    l.b(pattern2, "");
                    if (pattern2.length() > 0) {
                        String pattern3 = pattern.toString();
                        l.b(pattern3, "");
                        c2.add(pattern3);
                    }
                }
            }
            k kVar = k.f145061a;
            l.b(kVar, "");
            String c3 = kVar.c();
            l.b(c3, "");
            GeckoConfig geckoConfig = new GeckoConfig(c3, "offlineX", false, false, 12, null);
            geckoConfig.setGeckoDepender(new com.bytedance.lynx.hybrid.resource.g.b.b());
            com.bytedance.lynx.hybrid.resource.config.c cVar = new com.bytedance.lynx.hybrid.resource.config.c("gecko-va.tiktokv.com", c2, geckoConfig, null, new GeckoXNetImpl(com.bytedance.ies.ugc.appcontext.d.a()), 8);
            b bVar2 = new b();
            com.bytedance.lynx.hybrid.a.m mVar = new com.bytedance.lynx.hybrid.a.m("https://mon-va.byteoversea.com");
            String a2 = com.ss.android.ugc.aweme.language.d.a();
            String valueOf = String.valueOf(com.bytedance.ies.ugc.appcontext.d.n);
            String serverDeviceId = AppLog.getServerDeviceId();
            String f2 = com.bytedance.ies.ugc.appcontext.d.f();
            l.b(a2, "");
            if (serverDeviceId == null) {
                str = "";
            } else {
                str = serverDeviceId;
            }
            c cVar2 = new c(a2, valueOf, f2, serverDeviceId, a2, valueOf, f2, str);
            cVar2.put("os", (Object) "android");
            String str2 = Build.VERSION.RELEASE;
            l.b(str2, "");
            cVar2.put("osVersion", (Object) str2);
            cVar2.put("channel", (Object) com.bytedance.ies.ugc.appcontext.d.s);
            cVar2.put("region", (Object) a2);
            cVar2.put("appName", (Object) com.bytedance.ies.ugc.appcontext.d.b());
            cVar2.put("appVersion", (Object) f2);
            cVar2.put("updateVersionCode", (Object) String.valueOf(com.bytedance.ies.ugc.appcontext.d.d()));
            String locale = en.a().toString();
            l.b(locale, "");
            cVar2.put("language", (Object) locale);
            cVar2.put("appLanguage", (Object) SettingServiceImpl.v().h());
            String b2 = com.ss.android.ugc.aweme.i18n.language.a.b();
            l.b(b2, "");
            cVar2.put("appLocale", (Object) b2);
            cVar2.put("aid", (Object) valueOf);
            l.b(serverDeviceId, "");
            cVar2.put("deviceId", (Object) serverDeviceId);
            b.a aVar4 = new b.a(cVar2);
            aVar4.f40868a = bVar;
            aVar4.f40869b = cVar;
            aVar4.f40871d = bVar2;
            aVar4.f40872e = mVar;
            aVar4.f40873f = new com.bytedance.lynx.hybrid.a.l(new com.ss.android.ugc.aweme.hybridkit.a.a());
            com.bytedance.lynx.hybrid.b bVar3 = new com.bytedance.lynx.hybrid.b(aVar4.f40874g, aVar4.f40872e, aVar4.f40868a, aVar4.f40869b, aVar4.f40870c, aVar4.f40871d, aVar4.f40873f, (byte) 0);
            l.c(bVar3, "");
            l.c(application, "");
            com.bytedance.lynx.hybrid.d.f40919b = bVar3;
            com.bytedance.lynx.hybrid.c a3 = c.a.a();
            a3.f40904d = bVar3.f40861a;
            l.c(application, "");
            a3.f40902b = application;
            a3.f40901a = bVar3.f40861a.isDebug();
            return z.f158842a;
        }

        public static final class c extends com.lynx.tasm.behavior.a {
            static {
                Covode.recordClassIndex(63597);
            }

            c(String str) {
                super(str);
            }

            @Override // com.lynx.tasm.behavior.a
            public final LynxUI<?> a(j jVar) {
                return new LynxHeliumCanvas(jVar);
            }
        }

        public static final class a implements com.bytedance.lynx.hybrid.d.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f99754a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f99755b = false;

            static {
                Covode.recordClassIndex(63595);
            }

            a(d dVar) {
                this.f99754a = dVar;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63591);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e implements com.bytedance.hybrid.spark.b {
        static {
            Covode.recordClassIndex(63598);
        }

        e() {
        }

        @Override // com.bytedance.hybrid.spark.b
        public final i a() {
            return new com.ss.android.ugc.aweme.hybridkit.b.b();
        }

        @Override // com.bytedance.hybrid.spark.b
        public final h b() {
            return new com.ss.android.ugc.aweme.hybridkit.b.a();
        }

        @Override // com.bytedance.hybrid.spark.b
        public final d.b c() {
            return new d.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(63590);
        n.a.a().a(new m.a().a(b.f99753a).a());
    }

    static final class b extends h.f.b.m implements h.f.a.b<Context, com.bytedance.ies.xelement.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f99753a = new b();

        static {
            Covode.recordClassIndex(63592);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.xelement.d invoke(Context context) {
            Context context2 = context;
            l.d(context2, "");
            return new LynxDeclarativeVideoPlayBox(context2, (byte) 0);
        }
    }

    public static final class c extends com.bytedance.lynx.hybrid.a.a {
        final /* synthetic */ String $appId;
        final /* synthetic */ String $appVersion;
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $lynxDebug = false;
        final /* synthetic */ String $region;

        static {
            Covode.recordClassIndex(63593);
        }

        @Override // com.bytedance.lynx.hybrid.h.c
        public final Object getABParamsValue(String str) {
            Map<String, Object> map;
            l.d(str, "");
            JSONObject b2 = SettingsRequestServiceImpl.i().b(str);
            return (b2 == null || (map = JsonExtKt.toMap(b2)) == null) ? str : map;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(str5, str6, str7, str8, false);
            this.$region = str;
            this.$appId = str2;
            this.$appVersion = str3;
            this.$did = str4;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        d dVar = new d(this, context);
        l.c(dVar, "");
        com.bytedance.lynx.hybrid.d.f40922e = dVar;
        e eVar = new e();
        l.c(eVar, "");
        com.bytedance.hybrid.spark.d.f31109a = eVar;
        ALog.i(com.bytedance.lynx.hybrid.d.f40918a, "HybridKit Config Finish by LegoTask, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
    }
}
