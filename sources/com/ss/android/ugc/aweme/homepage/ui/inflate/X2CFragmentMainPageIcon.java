package com.ss.android.ugc.aweme.homepage.ui.inflate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.experiment.az;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.d;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.b;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.notification.view.h;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import java.util.List;

public class X2CFragmentMainPageIcon implements q {

    /* renamed from: a  reason: collision with root package name */
    public c f99515a;

    /* renamed from: b  reason: collision with root package name */
    public m f99516b;

    /* renamed from: c  reason: collision with root package name */
    public m f99517c;

    /* renamed from: d  reason: collision with root package name */
    public b f99518d;

    /* renamed from: e  reason: collision with root package name */
    public m f99519e;

    /* renamed from: f  reason: collision with root package name */
    public m f99520f;

    /* renamed from: g  reason: collision with root package name */
    public d f99521g;

    /* renamed from: h  reason: collision with root package name */
    public a f99522h;

    static {
        Covode.recordClassIndex(63474);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "inflate_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return ad.INFLATE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final Class<? extends Activity> b() {
        return HomePageUIFrameServiceImpl.e().a();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static void a(View view) {
        MethodCollector.i(4197);
        if (!(view == null || view.getParent() == null)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        MethodCollector.o(4197);
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final void a(Context context, Activity activity) {
        b bVar;
        if (activity != null) {
            context = activity;
        }
        try {
            if (az.a()) {
                f.n.a(PreDrawableInflate.class, new PreDrawableInflate());
                this.f99515a = new c(com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab.a.a(context));
                this.f99516b = new m(HomePageUIFrameServiceImpl.e().c(context));
                this.f99517c = new m(HomePageUIFrameServiceImpl.e().d(context));
                this.f99519e = new m(h.a(context));
                this.f99520f = new m(ProfileServiceImpl.g().c(context));
                ar a2 = com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.c.a(context);
                this.f99518d = new b(a2.f82871g, a2.f82872h, a2.f66982c, a2.f66983d, a2.f66980a);
            }
            if (com.ss.android.ugc.aweme.s.d.e() && (bVar = this.f99518d) != null) {
                this.f99521g = new d(context, this.f99518d, (ImageView) bVar.a(), (ImageView) this.f99518d.s());
                AVExternalServiceImpl.a().specialPlusService().isNeedShowSpecialPlusDirect();
            }
            if (com.ss.android.ugc.aweme.s.d.f() && (context instanceof e)) {
                this.f99522h = new a(context, (char) 0);
                e eVar = (e) context;
                HomeTabViewModel a3 = HomeTabViewModel.a.a(eVar);
                for (by byVar : a3.b()) {
                    View a4 = byVar.a(com.ss.android.ugc.aweme.homepage.ui.view.tab.b.f99536a);
                    this.f99522h.a(this.f99522h.a(a4, byVar.d()));
                    a3.a(byVar.d(), byVar);
                    a3.a(byVar, a4);
                }
                float a5 = (float) com.ss.android.ugc.aweme.homepage.ui.view.a.a(context, FollowFeedServiceImpl.c().b(eVar) + ((com.ss.android.ugc.aweme.homepage.ui.view.tab.top.e) a3.b("For You")).getTextWidth());
                FollowFeedServiceImpl.c().a(eVar, a5);
                ((com.ss.android.ugc.aweme.homepage.ui.view.tab.top.e) a3.b("For You")).setTextSize(a5);
            }
        } catch (Exception unused) {
        }
    }
}
