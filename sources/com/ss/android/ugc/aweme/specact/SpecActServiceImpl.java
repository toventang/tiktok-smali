package com.ss.android.ugc.aweme.specact;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.specact.pendant.SpecActNewPendant;
import com.ss.android.ugc.aweme.specact.pendant.a.a;
import com.ss.android.ugc.aweme.specact.pendant.e.e;
import com.ss.android.ugc.aweme.specact.pendant.f.a;
import com.ss.android.ugc.aweme.specact.pendant.f.b;
import com.ss.android.ugc.aweme.specact.pendant.h.m;
import com.ss.android.ugc.aweme.specact.popup.c.a;
import com.ss.android.ugc.aweme.utils.gm;
import f.a.d.f;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;
import java.util.List;

public final class SpecActServiceImpl implements ISpecActService {

    /* renamed from: e  reason: collision with root package name */
    public static final a f134036e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public UgAwemeActivitySetting f134037a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.a.a f134038b = a.C3477a.a();

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.e.b f134039c = SpecActNewPendant.a.a();

    /* renamed from: d  reason: collision with root package name */
    public int f134040d;

    static {
        Covode.recordClassIndex(87680);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87681);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final com.ss.android.ugc.aweme.specact.api.a a() {
        return com.ss.android.ugc.aweme.attribution.a.f67086e;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void d() {
        c();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void g() {
        com.ss.android.ugc.aweme.specact.pendant.f.c.b();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void c() {
        this.f134037a = null;
        this.f134038b.f134089e = null;
        this.f134039c.d();
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void e() {
        com.ss.android.ugc.aweme.specact.pendant.f.c.f134251a = null;
        com.ss.android.ugc.aweme.specact.pendant.f.c.b();
        if (this.f134037a != null) {
            this.f134039c.m();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void h() {
        i.b(gm.f143020a, g.c());
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void f() {
        com.ss.android.ugc.aweme.specact.pendant.f.c.c();
        Iterator<T> it = com.ss.android.ugc.aweme.specact.pendant.f.c.f134252b.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public static ISpecActService i() {
        MethodCollector.i(11917);
        Object a2 = com.ss.android.ugc.b.a(ISpecActService.class, false);
        if (a2 != null) {
            ISpecActService iSpecActService = (ISpecActService) a2;
            MethodCollector.o(11917);
            return iSpecActService;
        }
        if (com.ss.android.ugc.b.el == null) {
            synchronized (ISpecActService.class) {
                try {
                    if (com.ss.android.ugc.b.el == null) {
                        com.ss.android.ugc.b.el = new SpecActServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11917);
                    throw th;
                }
            }
        }
        SpecActServiceImpl specActServiceImpl = (SpecActServiceImpl) com.ss.android.ugc.b.el;
        MethodCollector.o(11917);
        return specActServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void b() {
        LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
        l.b(localTestApi, "");
        localTestApi.getSpecActDebugService().a("SpecApi", "onSettingSynced");
        t.a(b.f134041a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new c(this));
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void a(Aweme aweme) {
        com.ss.android.ugc.aweme.specact.pendant.f.c.f134251a = aweme;
    }

    static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134041a = new b();

        static {
            Covode.recordClassIndex(87682);
        }

        b() {
        }

        @Override // f.a.w
        public final void subscribe(v<Integer> vVar) {
            l.d(vVar, "");
            vVar.a((Integer) 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void b(Aweme aweme) {
        if (this.f134037a != null) {
            this.f134039c.a(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void a(Context context) {
        l.d(context, "");
        if (context != null) {
            SharedPreferences a2 = d.a(context, "pref_name", 0);
            if (!a2.getBoolean("pref_short_cut", false)) {
                com.ss.android.ugc.aweme.shortcut.g.a(context, context.getPackageName());
                a2.edit().putBoolean("pref_short_cut", true).apply();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void c(String str) {
        l.d(str, "");
        l.d(str, "");
        if (p.a((CharSequence) str, (CharSequence) "/activity/referral", false) || p.a((CharSequence) str, (CharSequence) "/ug_activity_referral", false) || p.a((CharSequence) str, (CharSequence) "/activity/armor", false)) {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            r.a("leave_page_click", new com.ss.android.ugc.aweme.app.f.d().a("position", parse.getLastPathSegment()).a("button_name", "client").f66730a);
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SpecActServiceImpl f134042a;

        static {
            Covode.recordClassIndex(87683);
        }

        c(SpecActServiceImpl specActServiceImpl) {
            this.f134042a = specActServiceImpl;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 210
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.SpecActServiceImpl.c.accept(java.lang.Object):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void a(String str) {
        l.d(str, "");
        if (this.f134037a != null) {
            this.f134039c.c(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void b(String str) {
        l.d(str, "");
        if (this.f134037a != null) {
            this.f134039c.b(str);
            com.ss.android.ugc.aweme.specact.pendant.a.a aVar = this.f134038b;
            l.d(str, "");
            List<? extends UgActivityTasks> list = aVar.f134087c;
            if (!(list == null || list.isEmpty() || 0 != 0)) {
                for (UgActivityTasks ugActivityTasks : list) {
                    if (l.a((Object) ugActivityTasks.getTaskId(), (Object) "like_comment_tribute")) {
                        aVar.f134085a.storeBoolean(m.a("do_like_or_comment_tribute_action"), true);
                        long j2 = aVar.f134086b;
                        Integer time = ugActivityTasks.getTime();
                        l.b(time, "");
                        if (j2 < ((long) time.intValue())) {
                            r.a("interact_task_complete", new com.ss.android.ugc.aweme.app.f.d().a("task_name", str).a("task_id", ugActivityTasks.getTaskId()).f66730a);
                            return;
                        } else if (!aVar.f134085a.getBoolean(m.a("has_report_like_and_comment_tribute"), false)) {
                            aVar.f134090f = null;
                            aVar.a(ugActivityTasks);
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void a(boolean z) {
        com.ss.android.ugc.aweme.specact.popup.c.a a2 = a.C3498a.a();
        if (z) {
            a2.f134592g++;
        } else {
            a2.f134592g--;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void a(Activity activity, Aweme aweme) {
        l.d(activity, "");
        a.C3498a.a().a(activity, aweme);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void a(Fragment fragment, ViewGroup viewGroup) {
        l.d(fragment, "");
        this.f134039c.a(fragment, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.specact.api.ISpecActService
    public final void a(Long l2, Boolean bool, Boolean bool2) {
        if (l2 != null && bool != null && bool2 != null) {
            SpecActNewPendant a2 = SpecActNewPendant.a.a();
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            if (a2.f134079h) {
                a.C3487a.a().a(booleanValue, booleanValue2);
            }
            if (a2.f134080i) {
                com.ss.android.ugc.aweme.specact.pendant.f.b a3 = b.a.a();
                e eVar = a3.f134243f;
                if ((eVar == null || eVar.o()) && !a3.f134242e && !a3.f134241d.isEmpty() && booleanValue && !a3.c()) {
                    a3.f134242e = true;
                    a3.d().storeBoolean(m.a("pendant_has_active"), true);
                    a3.e().b(a3.f134242e);
                    UgActivityTasks i2 = a3.i();
                    if (i2 != null) {
                        a3.a(i2);
                    }
                }
            }
        }
    }
}
