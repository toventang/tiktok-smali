package com.bytedance.ies.ugc.aweme.commercialize.splash.core;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.ugc.aweme.commercialize.splash.SplashAdManagerPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.c.a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.j;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadJsonTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.e;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h;
import com.bytedance.keva.Keva;
import com.ss.android.ad.splash.n;
import com.ss.android.ad.splash.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.utils.br;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class SplashAdServiceImpl implements ISplashAdService {
    static {
        Covode.recordClassIndex(20850);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final boolean a(Context context) {
        l.d(context, "");
        if (!j.b() || a.a()) {
            return d.f34861b.a(context, 1);
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void a(boolean z) {
        h.a();
        if (h.f34889a != null) {
            e eVar = h.f34889a;
            if (eVar.f34880b != null) {
                eVar.f34880b.edit().putBoolean("awesome_splash_filter_enable", z).apply();
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final int a() {
        u a2 = a.a(com.bytedance.ies.ugc.appcontext.d.a());
        l.b(a2, "");
        return a2.j();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void f() {
        if (!a.f34741a) {
            a.f34741a = true;
            a.a(com.bytedance.ies.ugc.appcontext.d.a()).g();
        }
    }

    public static ISplashAdService h() {
        MethodCollector.i(6388);
        Object a2 = b.a(ISplashAdService.class, false);
        if (a2 != null) {
            ISplashAdService iSplashAdService = (ISplashAdService) a2;
            MethodCollector.o(6388);
            return iSplashAdService;
        }
        if (b.f145529d == null) {
            synchronized (ISplashAdService.class) {
                try {
                    if (b.f145529d == null) {
                        b.f145529d = new SplashAdServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6388);
                    throw th;
                }
            }
        }
        SplashAdServiceImpl splashAdServiceImpl = (SplashAdServiceImpl) b.f145529d;
        MethodCollector.o(6388);
        return splashAdServiceImpl;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final w c() {
        if (g.b() && br.a()) {
            return null;
        }
        if (!j.b() || a.a()) {
            return new TopViewPreloadJsonTask();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final w d() {
        if (g.b() && br.a()) {
            return null;
        }
        if (!j.b() || a.a()) {
            return new SplashAdManagerPreloadTask();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final q e() {
        if (g.b() && br.a()) {
            return null;
        }
        if (!j.b() || a.a()) {
            return new SplashBgInflate();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void g() {
        Keva repo = Keva.getRepo("ab_repo_cold_boot");
        boolean z = true;
        if (!SettingsManager.a().a("enable_normal_splash_ad", true) || !com.bytedance.ies.abmock.b.a().a(true, "enable_normal_splash_ad_ab", true)) {
            z = false;
        }
        repo.storeBoolean("splash_ad_enable", z);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void b() {
        h.a();
        if (h.f34889a != null) {
            e.b(i.c());
            e.b(i.d());
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final w a(List<? extends Aweme> list) {
        return new TopViewPreloadTask(list);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final View a(View view) {
        if (view != null) {
            return view.findViewById(R.id.q8);
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final Drawable b(Context context) {
        l.d(context, "");
        Object b2 = f.b(SplashBgInflate.class);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate");
        Drawable b3 = ((SplashBgInflate) b2).b(context);
        l.b(b3, "");
        return b3;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final com.bytedance.ies.ugc.aweme.commercialize.splash.topview.b a(Activity activity) {
        l.d(activity, "");
        return new com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.a(activity);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void b(com.bytedance.ies.ugc.aweme.commercialize.splash.a.b bVar) {
        l.d(bVar, "");
        if (!a.b()) {
            a.a(bVar);
            com.bytedance.apm.b.a("splash_depend_init_question", 1, (JSONObject) null);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final Aweme a(String str) {
        h.a();
        return h.f34889a.a(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void a(com.bytedance.ies.ugc.aweme.commercialize.splash.a.b bVar) {
        l.d(bVar, "");
        if (!a.b()) {
            a.a(bVar);
        } else {
            com.bytedance.apm.b.a("splash_depend_init_question", 2, (JSONObject) null);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final View a(Activity activity, ViewGroup viewGroup) {
        l.d(activity, "");
        l.d(viewGroup, "");
        com.a.a(activity.getLayoutInflater(), R.layout.lj, viewGroup, true);
        return viewGroup.findViewById(R.id.q6);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final View b(Fragment fragment, ViewGroup viewGroup) {
        l.d(fragment, "");
        l.d(viewGroup, "");
        com.a.a(fragment.getLayoutInflater(), R.layout.b3g, viewGroup, true);
        return viewGroup.findViewById(R.id.egi);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final View a(Fragment fragment, ViewGroup viewGroup) {
        l.d(fragment, "");
        l.d(viewGroup, "");
        com.a.a(fragment.getLayoutInflater(), R.layout.lk, viewGroup, true);
        return viewGroup.findViewById(R.id.q6);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void a(Context context, String str) {
        String deviceId;
        l.d(context, "");
        l.d(str, "");
        if (SettingsManager.a().a("splash_crash_protect", true) && n.c(context).a(str)) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("event_time", System.currentTimeMillis());
            IHostContextDepend iHostContextDepend = com.bytedance.ies.android.base.runtime.a.f31874c;
            if (!(iHostContextDepend == null || (deviceId = iHostContextDepend.getDeviceId()) == null)) {
                a2.a("id", deviceId);
            }
            r.a("splash_ad_handle_exception_event", a2.f66730a);
        }
    }
}
