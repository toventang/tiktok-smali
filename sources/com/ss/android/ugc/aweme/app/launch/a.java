package com.ss.android.ugc.aweme.app.launch;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ies.ugc.appcontext.j;
import com.bytedance.keva.Keva;
import com.ss.android.legoimpl.ProcessExceptionTask;
import com.ss.android.ugc.aweme.experiment.eu;
import com.ss.android.ugc.aweme.lego.d.a;
import com.ss.android.ugc.aweme.logger.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66818a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f66819b = i.a((h.f.a.a) b.f66824a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f66820c = i.a((h.f.a.a) C1499a.f66821a);

    public static final class d implements com.ss.android.ugc.aweme.lego.component.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f66828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f66829b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f66830c;

        static {
            Covode.recordClassIndex(41143);
        }

        /* renamed from: com.ss.android.ugc.aweme.app.launch.a$d$a  reason: collision with other inner class name */
        public static final class C1501a implements com.ss.android.ugc.aweme.lego.component.a {
            static {
                Covode.recordClassIndex(41144);
            }

            C1501a() {
            }

            @Override // com.ss.android.ugc.aweme.lego.component.a
            public final void a(com.ss.android.ugc.aweme.lego.component.b bVar) {
                l.d(bVar, "");
                com.ss.android.ugc.aweme.lego.f.e().a(new ProcessExceptionTask(bVar)).a();
            }
        }

        @Override // com.ss.android.ugc.aweme.lego.component.c
        public final Context a() {
            return this.f66828a;
        }

        @Override // com.ss.android.ugc.aweme.lego.component.c
        public final com.ss.android.ugc.aweme.lego.component.a b() {
            return new C1501a();
        }

        @Override // com.ss.android.ugc.aweme.lego.component.c
        public final com.ss.android.ugc.aweme.lego.d.a c() {
            return new b(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.component.c
        public final boolean d() {
            return eu.b();
        }

        public static final class b implements com.ss.android.ugc.aweme.lego.d.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f66831a;

            static {
                Covode.recordClassIndex(41145);
            }

            @Override // com.ss.android.ugc.aweme.lego.d.a
            public final int a() {
                Integer num = (Integer) this.f66831a.f66829b.element.get(com.ss.android.ugc.aweme.lego.f.a.b(this.f66831a.f66828a));
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.lego.d.a
            public final a.EnumC2764a b() {
                if (a() == 0) {
                    return a.EnumC2764a.WILD;
                }
                if (this.f66831a.f66830c.get(a())) {
                    return a.EnumC2764a.PRISON;
                }
                return a.EnumC2764a.NORMAL;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            b(d dVar) {
                this.f66831a = dVar;
            }
        }

        d(Application application, z.e eVar, SparseBooleanArray sparseBooleanArray) {
            this.f66828a = application;
            this.f66829b = eVar;
            this.f66830c = sparseBooleanArray;
        }
    }

    public static Keva a() {
        return (Keva) f66819b.getValue();
    }

    public static final class e implements com.ss.android.ugc.aweme.lego.component.e<com.ss.android.ugc.aweme.lego.component.d> {
        static {
            Covode.recordClassIndex(41146);
        }

        e() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.lego.component.e
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.lego.component.d dVar) {
            com.ss.android.ugc.aweme.lego.component.d dVar2 = dVar;
            l.d(dVar2, "");
            a.b.f109011a.a(dVar2.f107474c, false);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.lego.component.e
        public final /* synthetic */ void b(com.ss.android.ugc.aweme.lego.component.d dVar) {
            com.ss.android.ugc.aweme.lego.component.d dVar2 = dVar;
            l.d(dVar2, "");
            a.b.f109011a.b(dVar2.f107474c, false);
        }
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a$a  reason: collision with other inner class name */
    static final class C1499a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1499a f66821a = new C1499a();

        static {
            Covode.recordClassIndex(41139);
        }

        C1499a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("ab_repo_cold_boot", 1);
        }
    }

    static final class b extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f66824a = new b();

        static {
            Covode.recordClassIndex(41140);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("main_process_runstate", 1);
        }
    }

    static {
        Covode.recordClassIndex(41138);
    }

    public static final class f implements com.ss.android.ugc.aweme.lego.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f66832a;

        static {
            Covode.recordClassIndex(41147);
        }

        f(Application application) {
            this.f66832a = application;
        }

        @Override // com.ss.android.ugc.aweme.lego.component.f
        public final void a(com.ss.android.ugc.aweme.lego.a.f fVar) {
            l.d(fVar, "");
            if (com.ss.android.ugc.aweme.lego.f.a.a(this.f66832a)) {
                a.a().storeInt("runstate", fVar.ordinal());
            }
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.ies.ugc.appcontext.e, h.z> {
        final /* synthetic */ AppBuildConfig $buildConfig;

        static {
            Covode.recordClassIndex(41141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AppBuildConfig appBuildConfig) {
            super(1);
            this.$buildConfig = appBuildConfig;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.ies.ugc.appcontext.e eVar) {
            com.bytedance.ies.ugc.appcontext.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f34617e = Integer.valueOf((int) R.string.uh);
            l.b("musical_ly", "");
            l.d("musical_ly", "");
            eVar2.f34618f = "musical_ly";
            l.d("tiktok", "");
            eVar2.f34620h = "tiktok";
            eVar2.f34614b = false;
            String a2 = this.$buildConfig.a();
            l.d(a2, "");
            eVar2.f34619g = a2;
            eVar2.f34622j = 2022205030;
            l.b("musically-android", "");
            l.d("musically-android", "");
            eVar2.f34623k = "musically-android";
            eVar2.f34624l = 1233;
            eVar2.o = 2;
            eVar2.p = true;
            eVar2.f34621i = false;
            eVar2.f34625m = this.$buildConfig.c();
            eVar2.n = true;
            eVar2.f34615c = new f.d() {
                /* class com.ss.android.ugc.aweme.app.launch.a.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(41142);
                }

                @Override // com.bytedance.ies.ugc.appcontext.f.d
                public final boolean a(Activity activity) {
                    if (activity != null && !(activity instanceof com.bytedance.ies.foundation.activity.a)) {
                        return true;
                    }
                    return false;
                }
            };
            return h.z.f158842a;
        }
    }

    public static void a(Application application) {
        l.d(application, "");
        z.e eVar = new z.e();
        eVar.element = (T) new HashMap();
        String packageName = application.getPackageName();
        l.b(packageName, "");
        eVar.element.put(packageName, 1);
        eVar.element.put(packageName + ":push", 2);
        eVar.element.put(packageName + ":pushservice", 32);
        eVar.element.put(packageName + ":ttplayer", 64);
        eVar.element.put(packageName + ":miniapp0", 16);
        eVar.element.put(packageName + ":miniapp1", 16);
        eVar.element.put(packageName + ":miniapp2", 16);
        eVar.element.put(packageName + ":miniapp3", 16);
        eVar.element.put(packageName + ":miniapp4", 16);
        eVar.element.put(packageName + ":miniapp100", 16);
        eVar.element.put(packageName + ":miniapp200", 16);
        eVar.element.put(packageName + ":error_activity", 256);
        eVar.element.put(packageName + ":safemode", 128);
        eVar.element.put(packageName + ":wallpaper", 1024);
        eVar.element.put(packageName + ":bm", 512);
        eVar.element.put(packageName + ":boost_multidex", 2048);
        eVar.element.put(packageName + ":downloader", 4);
        eVar.element.put(packageName + ":playcore_missing_splits_activity", 131072);
        eVar.element.put(packageName + ":feedbacker", 262144);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        sparseBooleanArray.put(16, true);
        sparseBooleanArray.put(8, true);
        com.ss.android.ugc.aweme.lego.f.a(new d(application, eVar, sparseBooleanArray));
        if (!((Boolean) com.ss.android.ugc.aweme.lego.b.b.f107421f.getValue()).booleanValue()) {
            com.ss.android.ugc.aweme.legoImp.a aVar = new com.ss.android.ugc.aweme.legoImp.a(new e());
            l.d(aVar, "");
            com.ss.android.ugc.aweme.lego.f.f107542g = aVar;
        }
        com.ss.android.ugc.aweme.lego.f.f107546k = new f(application);
    }

    public static void a(Application application, AppBuildConfig appBuildConfig) {
        boolean z;
        l.d(application, "");
        l.d(appBuildConfig, "");
        c cVar = new c(appBuildConfig);
        l.d(application, "");
        l.d(cVar, "");
        com.bytedance.ies.ugc.appcontext.e eVar = new com.bytedance.ies.ugc.appcontext.e(application, cVar);
        l.d(eVar, "");
        com.bytedance.ies.ugc.appcontext.d.f34595b = eVar.a();
        com.bytedance.ies.ugc.appcontext.d.f34594a = eVar.f34614b;
        com.bytedance.ies.ugc.appcontext.d.f34597d = eVar.f34617e;
        com.bytedance.ies.ugc.appcontext.d.f34596c = eVar.f34616d;
        String str = eVar.f34618f;
        if (str == null) {
            l.a("appName");
        }
        com.bytedance.ies.ugc.appcontext.d.f34598e = str;
        String str2 = eVar.f34620h;
        if (str2 == null) {
            l.a("flavor");
        }
        com.bytedance.ies.ugc.appcontext.d.f34600g = str2;
        long j2 = eVar.f34622j;
        String str3 = eVar.f34619g;
        if (str3 == null) {
            l.a("versionName");
        }
        com.bytedance.ies.ugc.appcontext.d.f34599f = new d.c(j2, str3);
        String str4 = eVar.f34623k;
        if (str4 == null) {
            l.a("feedbackAppKey");
        }
        com.bytedance.ies.ugc.appcontext.d.f34602i = str4;
        com.bytedance.ies.ugc.appcontext.d.f34605l = eVar.o;
        com.bytedance.ies.ugc.appcontext.d.f34606m = eVar.p;
        com.bytedance.ies.ugc.appcontext.d.n = eVar.f34624l;
        com.bytedance.ies.ugc.appcontext.d.t = eVar.f34621i;
        com.bytedance.ies.ugc.appcontext.d.v = eVar.f34625m;
        com.bytedance.ies.ugc.appcontext.d.w = eVar.n;
        d.c cVar2 = com.bytedance.ies.ugc.appcontext.d.f34599f;
        if (cVar2 == null) {
            l.a("versionInfo");
        }
        if (TextUtils.isEmpty(cVar2.f34612b) || cVar2.f34611a == 0 || cVar2.f34611a == -1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Application application2 = com.bytedance.ies.ugc.appcontext.d.f34595b;
            if (application2 == null) {
                l.a("context");
            }
            com.bytedance.ies.ugc.appcontext.d.f34599f = j.a(application2);
        }
        Application application3 = com.bytedance.ies.ugc.appcontext.d.f34595b;
        if (application3 == null) {
            l.a("context");
        }
        com.bytedance.ies.ugc.appcontext.d.f34601h = j.b(application3);
        Application application4 = com.bytedance.ies.ugc.appcontext.d.f34595b;
        if (application4 == null) {
            l.a("context");
        }
        String a2 = j.a(application4, "meta_channel");
        if (a2 != null && a2.length() > 0) {
            com.bytedance.ies.ugc.appcontext.d.s = a2;
            com.bytedance.ies.ugc.appcontext.d.u = a2;
        }
        Application application5 = com.bytedance.ies.ugc.appcontext.d.f34595b;
        if (application5 == null) {
            l.a("context");
        }
        String a3 = j.a(application5, "GIT_BRANCH");
        if (a3 != null) {
            com.bytedance.ies.ugc.appcontext.d.o = a3;
        }
        Application application6 = com.bytedance.ies.ugc.appcontext.d.f34595b;
        if (application6 == null) {
            l.a("context");
        }
        String a4 = j.a(application6, "GIT_SHA");
        if (a4 != null) {
            com.bytedance.ies.ugc.appcontext.d.p = a4;
        }
        Application application7 = com.bytedance.ies.ugc.appcontext.d.f34595b;
        if (application7 == null) {
            l.a("context");
        }
        String a5 = j.a(application7, "GIT_USERNAME");
        if (a5 != null) {
            com.bytedance.ies.ugc.appcontext.d.q = a5;
        }
        Application application8 = com.bytedance.ies.ugc.appcontext.d.f34595b;
        if (application8 == null) {
            l.a("context");
        }
        String a6 = j.a(application8, "GIT_USER_EMAIL");
        if (a6 != null) {
            com.bytedance.ies.ugc.appcontext.d.r = a6;
        }
        Application application9 = com.bytedance.ies.ugc.appcontext.d.f34595b;
        if (application9 == null) {
            l.a("context");
        }
        String a7 = j.a(application9, "release_build");
        if (a7 != null) {
            com.bytedance.ies.ugc.appcontext.d.f34603j = a7;
        }
        Application a8 = eVar.a();
        l.d(a8, "");
        a8.registerActivityLifecycleCallbacks(new f.e(a8));
        com.bytedance.ies.ugc.appcontext.f.p = eVar.f34615c;
    }
}
