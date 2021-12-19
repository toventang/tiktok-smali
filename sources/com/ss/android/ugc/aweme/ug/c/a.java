package com.ss.android.ugc.aweme.ug.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.ugc.appcontext.f;
import com.google.android.play.core.install.InstallState;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FlexibleUpdateStrategy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class a implements com.ss.android.ugc.aweme.ug.d {

    /* renamed from: a  reason: collision with root package name */
    static com.google.android.play.core.a.a f141755a;

    /* renamed from: b  reason: collision with root package name */
    static com.google.android.play.core.a.b f141756b;

    /* renamed from: c  reason: collision with root package name */
    static com.google.android.play.core.install.b f141757c;

    /* renamed from: d  reason: collision with root package name */
    static boolean f141758d;

    /* renamed from: e  reason: collision with root package name */
    static WeakReference<Activity> f141759e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f141760f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f141761g;

    /* renamed from: h  reason: collision with root package name */
    private static long f141762h;

    private a() {
    }

    static {
        Covode.recordClassIndex(92656);
    }

    public static final /* synthetic */ com.google.android.play.core.a.a b() {
        com.google.android.play.core.a.a aVar = f141755a;
        if (aVar == null) {
            l.a("mAppUpdateInfo");
        }
        return aVar;
    }

    public static void a() {
        Activity j2 = f.j();
        if (j2 != null) {
            Dialog b2 = b(j2);
            if (!b2.isShowing()) {
                b2.show();
            }
        }
    }

    private static boolean c() {
        int i2;
        int i3;
        if (com.ss.android.ugc.aweme.co.b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_CURRENT_VERSIONCODE_FOR_UPDATE") != ((int) com.bytedance.ies.ugc.appcontext.d.e())) {
            com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_CURRENT_VERSIONCODE_FOR_UPDATE", (int) com.bytedance.ies.ugc.appcontext.d.e());
            com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_LAST_CHECK_UPDATE_TIME", 0L);
            com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_SHOW_UPDATE_TIMES", 0);
            com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_DOWNLOADED_FOR_UPDATE", false);
            com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_UPDATE_IN_PROGRESS", false);
        }
        int b2 = com.ss.android.ugc.aweme.co.b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_SHOW_UPDATE_TIMES");
        f141762h = com.ss.android.ugc.aweme.co.b.b().d(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_LAST_CHECK_UPDATE_TIME");
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            FlexibleUpdateStrategy flexibleUpdateStrategy = iESSettingsProxy.getFlexibleUpdateStrategy();
            l.b(flexibleUpdateStrategy, "");
            Integer allowShowAllTimes = flexibleUpdateStrategy.getAllowShowAllTimes();
            l.b(allowShowAllTimes, "");
            i3 = allowShowAllTimes.intValue();
            IESSettingsProxy iESSettingsProxy2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy2, "");
            FlexibleUpdateStrategy flexibleUpdateStrategy2 = iESSettingsProxy2.getFlexibleUpdateStrategy();
            l.b(flexibleUpdateStrategy2, "");
            Integer intervalDays = flexibleUpdateStrategy2.getIntervalDays();
            l.b(intervalDays, "");
            i2 = intervalDays.intValue();
        } catch (com.bytedance.ies.a unused) {
            i2 = 0;
            i3 = 0;
        }
        if (b2 >= i3 || System.currentTimeMillis() - f141762h < ((long) i2) * 86400000) {
            return false;
        }
        return true;
    }

    private static Context c(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static void a(Activity activity) {
        l.d(activity, "");
        if (Build.VERSION.SDK_INT >= 21 && com.ss.android.ugc.aweme.co.b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_UPDATE_IN_PROGRESS", false)) {
            a(activity, "");
        }
    }

    public static Dialog b(Activity activity) {
        l.d(activity, "");
        a.C0731a aVar = new a.C0731a(activity);
        a.C0731a a2 = aVar.a(R.string.cnw);
        a2.f33402b = activity.getString(R.string.cnv);
        a2.a(R.string.cnr, (DialogInterface.OnClickListener) b.f141766a, false).b(R.string.dj3, (DialogInterface.OnClickListener) c.f141767a, false);
        Dialog c2 = aVar.a().c();
        c2.setCanceledOnTouchOutside(false);
        l.b(c2, "");
        return c2;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements com.google.android.play.core.install.b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f141768a = new d();

        static {
            Covode.recordClassIndex(92660);
        }

        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.android.play.core.c.a
        public final /* synthetic */ void a(InstallState installState) {
            Activity activity;
            if (installState.a() == 11) {
                com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_DOWNLOADED_FOR_UPDATE", true);
                com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_UPDATE_IN_PROGRESS", false);
                a.f141760f.a("app_update_download_finish");
                if (f.f34637l) {
                    com.google.android.play.core.a.b bVar = a.f141756b;
                    if (bVar != null) {
                        bVar.b();
                    }
                } else if (!a.f141758d) {
                    a.f141758d = true;
                    WeakReference<Activity> weakReference = a.f141759e;
                    if (weakReference != null && (activity = weakReference.get()) != null) {
                        l.b(activity, "");
                        if (activity.isFinishing()) {
                            a.a();
                            return;
                        }
                        Dialog b2 = a.b(activity);
                        if (!b2.isShowing()) {
                            b2.show();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.c.a$a  reason: collision with other inner class name */
    static final class C3771a<ResultT> implements com.google.android.play.core.tasks.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f141764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f141765b;

        static {
            Covode.recordClassIndex(92657);
        }

        C3771a(boolean z, Activity activity) {
            this.f141764a = z;
            this.f141765b = activity;
        }

        @Override // com.google.android.play.core.tasks.b
        public final /* synthetic */ void a(Object obj) {
            com.google.android.play.core.a.a aVar = (com.google.android.play.core.a.a) obj;
            if (!this.f141764a) {
                com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_LAST_CHECK_UPDATE_TIME", System.currentTimeMillis());
            }
            l.b(aVar, "");
            a.f141755a = aVar;
            if (a.b().c() == 2) {
                if (a.b().a(com.google.android.play.core.a.d.c().b()) != null) {
                    a.f141760f.a("app_update_toast_show");
                    if (!this.f141764a) {
                        com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_SHOW_UPDATE_TIMES", com.ss.android.ugc.aweme.co.b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_SHOW_UPDATE_TIMES") + 1);
                    }
                    com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_UPDATE_IN_PROGRESS", true);
                    com.google.android.play.core.a.b bVar = a.f141756b;
                    if (bVar != null) {
                        bVar.a(a.b(), this.f141765b);
                    }
                }
            } else if (a.b().c() == 3) {
                if (!this.f141764a) {
                    com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_SHOW_UPDATE_TIMES", com.ss.android.ugc.aweme.co.b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_SHOW_UPDATE_TIMES") + 1);
                }
                if (!com.ss.android.ugc.aweme.co.b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_DOWNLOADED_FOR_UPDATE", false)) {
                    if (this.f141764a) {
                        new com.bytedance.tux.g.b(this.f141765b).e(R.string.tb).b();
                    }
                    com.google.android.play.core.a.b bVar2 = a.f141756b;
                    if (bVar2 != null) {
                        bVar2.a(a.b(), this.f141765b);
                    }
                } else if (this.f141765b.isFinishing()) {
                    a.a();
                } else {
                    Dialog b2 = a.b(this.f141765b);
                    if (!b2.isShowing()) {
                        b2.show();
                    }
                }
            } else {
                if (this.f141764a) {
                    new com.bytedance.tux.g.b(this.f141765b).e(R.string.cv5).b();
                }
                com.google.android.play.core.a.b bVar3 = a.f141756b;
                if (bVar3 != null) {
                    bVar3.b(a.f141757c);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.d
    public final void a(String str) {
        l.d(str, "");
        r.a(str, new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, "flexible").f66730a);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f141766a = new b();

        static {
            Covode.recordClassIndex(92658);
        }

        b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            a.f141760f.a("app_update_install");
            com.google.android.play.core.a.b bVar = a.f141756b;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f141767a = new c();

        static {
            Covode.recordClassIndex(92659);
        }

        c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.google.android.play.core.a.b bVar = a.f141756b;
            if (bVar != null) {
                bVar.b(a.f141757c);
            }
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static void a(Activity activity, String str) {
        l.d(activity, "");
        l.d(str, "");
        if (f141756b == null) {
            f141756b = com.google.android.play.core.a.c.a(c(activity));
        }
        d dVar = d.f141768a;
        f141757c = dVar;
        com.google.android.play.core.a.b bVar = f141756b;
        if (bVar != null) {
            bVar.a(dVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.d
    public final void a(Activity activity, boolean z, String str) {
        com.google.android.play.core.tasks.d<com.google.android.play.core.a.a> a2;
        l.d(activity, "");
        l.d(str, "");
        if (Build.VERSION.SDK_INT >= 21) {
            if (!z) {
                if (!f141761g) {
                    IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                    l.b(iESSettingsProxy, "");
                    Integer inappUpdateSwitchStrategy = iESSettingsProxy.getInappUpdateSwitchStrategy();
                    if (inappUpdateSwitchStrategy == null || inappUpdateSwitchStrategy.intValue() != 3) {
                        IESSettingsProxy iESSettingsProxy2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                        l.b(iESSettingsProxy2, "");
                        Integer inappUpdateSwitchStrategy2 = iESSettingsProxy2.getInappUpdateSwitchStrategy();
                        if (inappUpdateSwitchStrategy2 == null || inappUpdateSwitchStrategy2.intValue() != 1) {
                            return;
                        }
                    }
                    Boolean a3 = s.a();
                    l.b(a3, "");
                    if (a3.booleanValue()) {
                        com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_LAST_CHECK_UPDATE_TIME", System.currentTimeMillis());
                        com.ss.android.ugc.aweme.co.b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), "KEY_CURRENT_VERSIONCODE_FOR_UPDATE", (int) com.bytedance.ies.ugc.appcontext.d.e());
                        return;
                    } else if (!c()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            f141761g = true;
            f141759e = new WeakReference<>(activity);
            a(activity, str);
            com.google.android.play.core.a.b bVar = f141756b;
            if (bVar != null && (a2 = bVar.a()) != null) {
                a2.a(new C3771a(z, activity));
            }
        }
    }
}
