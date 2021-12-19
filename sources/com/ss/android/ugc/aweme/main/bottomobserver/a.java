package com.ss.android.ugc.aweme.main.bottomobserver;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.ae;
import com.ss.android.ugc.aweme.metrics.l;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final e f109208a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f109209b;

    static {
        Covode.recordClassIndex(69932);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.bottomobserver.a$a  reason: collision with other inner class name */
    static final class CallableC2798a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final CallableC2798a f109210a = new CallableC2798a();

        static {
            Covode.recordClassIndex(69933);
        }

        CallableC2798a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.ss.android.common.c.c.a(com.bytedance.ies.ugc.appcontext.d.a(), "homepage", "show");
            return null;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final d f109215a = new d();

        static {
            Covode.recordClassIndex(69936);
        }

        d() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.ss.android.common.c.c.a(com.bytedance.ies.ugc.appcontext.d.a(), "homepage", "click");
            return null;
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f109214a = new c();

        static {
            Covode.recordClassIndex(69935);
        }

        c() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            r.a("homepage_hot_click", new com.ss.android.ugc.aweme.app.f.d().a("click_method", "enter").f66730a);
            return null;
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HomePageDataViewModel f109211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f109212b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f109213c;

        static {
            Covode.recordClassIndex(69934);
        }

        b(HomePageDataViewModel homePageDataViewModel, String str, String str2) {
            this.f109211a = homePageDataViewModel;
            this.f109212b = str;
            this.f109213c = str2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            if (this.f109211a.f99130m == 0) {
                str = "enter_homepage_follow";
            } else {
                str = "enter_homepage_hot";
            }
            l lVar = new l(str);
            lVar.f109583a = "click_button_icon";
            l a2 = lVar.a(this.f109212b);
            a2.f109584b = this.f109213c;
            if (this.f109211a.f99128k != null) {
                a2.f(this.f109211a.f99128k);
            }
            a2.f();
            return null;
        }
    }

    public a(Context context) {
        h.f.b.l.d(context, "");
        this.f109209b = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f109208a = (e) context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AVExternalServiceImpl.a().enterFromService().setEnterFrom("HOME");
        HomePageDataViewModel a2 = HomePageDataViewModel.a.a(this.f109208a);
        TabChangeManager a3 = TabChangeManager.a.a(this.f109208a);
        ScrollSwitchStateManager a4 = ScrollSwitchStateManager.a.a(this.f109208a);
        com.ss.android.ugc.aweme.notice.api.b.a(false);
        a4.a(true);
        e eVar = this.f109208a;
        MainActivity mainActivity = null;
        if (!(eVar instanceof MainActivity)) {
            eVar = null;
        }
        MainActivity mainActivity2 = (MainActivity) eVar;
        if (mainActivity2 != null) {
            mainActivity2.refreshSlideSwitchCanScrollRight();
        }
        e eVar2 = this.f109208a;
        if (eVar2 instanceof MainActivity) {
            mainActivity = eVar2;
        }
        MainActivity mainActivity3 = mainActivity;
        if (mainActivity3 != null) {
            mainActivity3.setAdScrollRightControl();
        }
        com.ss.android.ugc.aweme.share.d.c.f123452d = a2.f99128k;
        String str = a3.f109107d;
        if (TextUtils.equals("HOME", a3.f109107d)) {
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) HomeTabViewModel.a.a(this.f109208a).b("HOME");
            if (aVar != null) {
                aVar.h();
            }
            Fragment a5 = a3.a("HOME");
            if (a5 instanceof ae) {
                ((ae) a5).a(true, "homepage_refresh");
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ug.guide.c(1));
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ad.feed.c.a());
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(be.f68530b, be.f68532d);
            Hox.a.a(this.f109208a).b("HOME", bundle);
            Fragment b2 = a3.b();
            i.b(CallableC2798a.f109210a, r.a());
            if (b2 instanceof ae) {
                ae aeVar = (ae) b2;
                if (aeVar.y == null || aeVar.f109140c == null || aeVar.y.b(aeVar.f109140c.getCurrentItemCompat()) == 1) {
                    AVExternalServiceImpl.a().shoutOutsService().setInFollowingTab(true);
                    com.ss.android.ugc.aweme.main.h.a.a(this.f109208a);
                }
                i.b(new b(a2, str, aeVar.q()), r.a());
                if (aeVar.l() instanceof af) {
                    i.b(c.f109214a, r.a());
                }
            }
        }
        i.b(d.f109215a, r.a());
    }
}
