package com.ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import b.i;
import com.bytedance.analytics.page.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.hox.a.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.e;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import com.ss.android.ugc.aweme.cm.a;
import com.ss.android.ugc.aweme.commercialize.utils.ay;
import com.ss.android.ugc.aweme.commercialize.utils.l;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.activity.j;
import com.ss.android.ugc.aweme.detail.ui.al;
import com.ss.android.ugc.aweme.experiment.fn;
import com.ss.android.ugc.aweme.experiment.fp;
import com.ss.android.ugc.aweme.experiment.ft;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.helper.h;
import com.ss.android.ugc.aweme.feed.i.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.o.a;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.ui.bc;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.ui.b;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.json.JSONObject;

public class k extends e implements b, d, AwemeChangeCallBack.a {
    private Bundle A;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.aweme.profile.ui.d.d f116480a;

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.ugc.aweme.profile.ui.d.b f116481b;

    /* renamed from: c  reason: collision with root package name */
    Object f116482c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.ies.uikit.a.b f116483d;

    /* renamed from: e  reason: collision with root package name */
    Aweme f116484e;

    /* renamed from: j  reason: collision with root package name */
    String f116485j;

    /* renamed from: k  reason: collision with root package name */
    u<Integer> f116486k;

    /* renamed from: l  reason: collision with root package name */
    List<Pair<Aweme, Integer>> f116487l = new ArrayList(2);

    /* renamed from: m  reason: collision with root package name */
    String f116488m = "";
    boolean n = false;
    boolean o = false;
    String p = "page_profile";
    private Fragment q;
    private String r = "";
    private String s = "other_places";
    private boolean t = true;
    private boolean u;
    private boolean v;
    private String w;
    private String y;
    private final Object z = new Object();

    static {
        Covode.recordClassIndex(75189);
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "5836";
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        a(new v(this, z2));
    }

    public final void a(Aweme aweme, boolean z2) {
        androidx.fragment.app.e activity;
        if (aweme.getAwemeRawAd() != null) {
            com.ss.android.ugc.aweme.profile.service.b.f116618a.getBulletABHelper().a(this.f116483d, i(), this);
            if (!f(aweme)) {
                g(aweme);
            }
            if (z2 && (activity = getActivity()) != null) {
                ScrollSwitchStateManager.a.a(activity).a(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
    public final void a(Aweme aweme) {
        boolean z2;
        Aweme aweme2;
        if (aweme != null) {
            if (a.f93623a && getActivity() != null && (aweme2 = HomePageDataViewModel.a.a(getActivity()).f99128k) != null && (!TextUtils.equals(aweme2.getAid(), aweme.getAid()) || !TextUtils.equals(aweme2.getSecAuthorUid(), aweme.getSecAuthorUid()))) {
                com.ss.android.ugc.aweme.framework.a.a.b(4, "feed2profile", "ProfilePageFragment onAwemeChange invalid aweme, aid: " + aweme.getAid() + ", secUid: " + aweme.getSecAuthorUid() + "; homepage_aid: " + aweme2.getAid() + ", homepage_secUid: " + aweme2.getSecAuthorUid());
            }
            if (!aweme.isAwemeFromXiGua()) {
                if (getUserVisibleHint()) {
                    this.f116487l.add(Pair.create(aweme, 17));
                    a(this.f116487l, 1);
                    z2 = false;
                } else {
                    this.f116487l.add(Pair.create(aweme, 1));
                    z2 = true;
                }
                int i2 = 300;
                if (this.u) {
                    if (this.v) {
                        if (!z2) {
                            com.ss.android.b.a.a.a.a(new y(this), 300);
                        } else if (fn.f90053a == 2) {
                            this.o = true;
                        } else if (fn.f90053a == 1) {
                            z zVar = new z(this);
                            if (ft.f90083a > 5000) {
                                i2 = 5000;
                            } else if (ft.f90083a >= 300) {
                                i2 = ft.f90083a;
                            }
                            com.ss.android.b.a.a.a.a(zVar, i2);
                            this.o = true;
                        } else {
                            com.ss.android.b.a.a.a.a(new aa(this), 300);
                        }
                        if (com.bytedance.ies.abmock.b.a().a(true, "profile_params_async_open", false) && com.ss.android.ugc.aweme.profile.service.a.f116616a.shouldShowAdBrowser(aweme)) {
                            i.b(new ab(this, aweme), r.a());
                        }
                    }
                    i(aweme);
                } else {
                    n nVar = new n(this);
                    if (this.t && (getContext() instanceof f.c)) {
                        i2 = 3000;
                    }
                    com.ss.android.b.a.a.a.a(nVar, i2);
                    i(aweme);
                }
                this.t = false;
            }
        }
    }

    public final void a(String str) {
        this.f116488m = str;
        String str2 = this.r;
        switch (str2.hashCode()) {
            case -803549229:
                if (str2.equals("page_ad")) {
                }
                return;
            case -803548836:
                if (str2.equals("page_my")) {
                }
                return;
            case -331427643:
                if (str2.equals("page_fake_user")) {
                    a(new s(str));
                    return;
                }
                return;
            case 883917691:
                if (str2.equals("page_user")) {
                }
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        n();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        o();
    }

    private void n() {
        IBenchmarkService c2;
        if (this.B && (c2 = BenchmarkServiceImpl.c()) != null) {
            c2.a(2);
        }
    }

    private void o() {
        IBenchmarkService c2;
        if (this.B && (c2 = BenchmarkServiceImpl.c()) != null) {
            c2.a();
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return String.valueOf(hashCode());
    }

    public final void g() {
        ScrollSwitchStateManager.a.a(getActivity()).a("page_feed", true);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.bytedance.a.b.c("profile", "");
    }

    private static boolean m() {
        try {
            return c.f99077a.f99078b.getProfilePageSkipRemove().booleanValue();
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.profile.ui.d.b d() {
        com.ss.android.ugc.aweme.profile.ui.d.b bVar = (com.ss.android.ugc.aweme.profile.ui.d.b) getChildFragmentManager().a("tag_fragment_page_my");
        if (bVar == null) {
            bVar = (com.ss.android.ugc.aweme.profile.ui.d.b) com.ss.android.ugc.aweme.profile.service.b.f116618a.createMyProfileFragment();
        }
        bVar.a(new bc() {
            /* class com.ss.android.ugc.aweme.profile.k.AnonymousClass4 */

            static {
                Covode.recordClassIndex(75193);
            }

            @Override // com.ss.android.ugc.aweme.feed.ui.bc
            public final void a() {
                k.this.g();
            }
        });
        return bVar;
    }

    private void j() {
        if (this.q != null || this.f116483d != null) {
            if (!(this.f116483d == null || this.f116484e.getAwemeRawAd() == null)) {
                com.ss.android.ugc.aweme.profile.service.b.f116618a.getBulletABHelper().b(this.f116483d);
            }
            if (this.q != null) {
                com.ss.android.ugc.aweme.profile.service.a.f116616a.getAdFlutterLandPageUtil().b(this.q);
            }
        }
    }

    private Bundle l() {
        Bundle bundle = new Bundle();
        bundle.putString("profile_from", "feed_detail");
        bundle.putString("previous_page", "homepage_hot");
        bundle.putString("enter_from", "homepage_hot");
        bundle.putString("is_first_time", "true");
        Bundle arguments = getArguments();
        if (arguments != null) {
            bundle.putInt("from_recommend_card", arguments.getInt("from_recommend_card", 0));
        }
        return bundle;
    }

    private void h() {
        if (ab_()) {
            c(true);
            if (this.f116487l.size() > 0) {
                List<Pair<Aweme, Integer>> list = this.f116487l;
                Pair<Aweme, Integer> pair = list.get(list.size() - 1);
                List<Pair<Aweme, Integer>> list2 = this.f116487l;
                list2.set(list2.size() - 1, Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 16)));
            }
            this.f116487l = a(this.f116487l, 1);
        }
    }

    private com.ss.android.ugc.aweme.profile.ui.d.d k() {
        getChildFragmentManager().a("tag_fragment_page_user");
        com.ss.android.ugc.aweme.profile.ui.v2.i iVar = new com.ss.android.ugc.aweme.profile.ui.v2.i();
        iVar.setArguments(l());
        iVar.a(new p(this));
        iVar.a(this.f116485j);
        iVar.b(this.f116485j);
        iVar.c("other_places");
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
        if (r1.equals("click_title") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
        if (r1.equals("click_avatar") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
        if (r1.equals("slide") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        return r4.f116484e.getAwemeRawAd().getAuthorUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String i() {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.k.i():java.lang.String");
    }

    private void c(boolean z2) {
        com.ss.android.ugc.aweme.profile.ui.d.d dVar = this.f116480a;
        if (dVar != null) {
            dVar.b(z2);
        }
    }

    public final k b(boolean z2) {
        if (z2) {
            this.s = "main_head";
        }
        return this;
    }

    private void a(Fragment fragment) {
        n a2 = getChildFragmentManager().a();
        a2.a(fragment);
        a2.c();
    }

    private boolean c(String str) {
        return TextUtils.equals(this.r, str);
    }

    private boolean m(Aweme aweme) {
        TextUtils.equals(this.f116485j, "homepage_hot");
        return false;
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        this.f116487l = a(this.f116487l, 2);
        o();
        this.B = false;
    }

    private void a(h.f.a.b<com.ss.android.ugc.aweme.profile.ui.d.a, Void> bVar) {
        a("tag_fragment_page_fake_user", com.ss.android.ugc.aweme.profile.ui.d.a.class, bVar);
    }

    static boolean b(Aweme aweme) {
        if (aweme == null || !TextUtils.equals(com.ss.android.ugc.aweme.account.b.g().getCurUserId(), aweme.getAuthorUid())) {
            return false;
        }
        return true;
    }

    private static boolean f(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getPreloadWeb() != 7) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
        if (!(getActivity() instanceof al)) {
            return;
        }
        if (z2) {
            h();
            com.ss.android.ugc.aweme.profile.service.b.f116618a.onFeedStop();
            return;
        }
        this.f116487l = a(this.f116487l, 2);
    }

    private void i(Aweme aweme) {
        androidx.fragment.app.e activity = getActivity();
        if (!(activity instanceof com.ss.android.ugc.aweme.d.d) || !(((com.ss.android.ugc.aweme.d.d) activity).getInflater() instanceof com.ss.android.ugc.aweme.d.e)) {
            return;
        }
        if (b(aweme)) {
            if (!this.D) {
                this.D = true;
                af.a(activity);
            }
        } else if (!c("page_user") && this.f116480a == null && !this.C) {
            this.C = true;
            af.a(activity);
        }
    }

    private com.ss.android.ugc.aweme.profile.ui.d.a k(Aweme aweme) {
        com.ss.android.ugc.aweme.profile.ui.d.a createFakeUserProfileFragment;
        Bundle bundle = new Bundle();
        if (aweme == null || !com.ss.android.ugc.aweme.commercialize.e.a.b.f(aweme.getAwemeRawAd())) {
            createFakeUserProfileFragment = com.ss.android.ugc.aweme.profile.service.a.f116616a.createFakeUserProfileFragment();
        } else {
            createFakeUserProfileFragment = com.ss.android.ugc.aweme.profile.service.a.f116616a.createNewFakeUserProfileFragment();
            bundle.putAll(p(aweme));
        }
        if (createFakeUserProfileFragment != null) {
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putString("enter_from", this.f116485j);
            createFakeUserProfileFragment.c().setArguments(bundle);
        }
        return createFakeUserProfileFragment;
    }

    private static String n(Aweme aweme) {
        if (com.ss.android.ugc.aweme.profile.service.a.f116616a.shouldShowFakeUserProfile(aweme)) {
            return "page_fake_user";
        }
        if (com.ss.android.ugc.aweme.profile.service.a.f116616a.shouldShowAdBrowser(aweme)) {
            return "page_ad";
        }
        if (b(aweme)) {
            return "page_my";
        }
        return "page_user";
    }

    public final void b(String str) {
        com.ss.android.ugc.aweme.profile.ui.d.d dVar = this.f116480a;
        if (dVar != null) {
            dVar.e(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c(Aweme aweme) {
        MethodCollector.i(9356);
        com.ss.android.ugc.aweme.profile.service.a.f116616a.getAdFlutterLandPageUtil();
        aweme.getAwemeRawAd();
        synchronized (this.z) {
            try {
                this.A = p(aweme);
            } catch (Throwable th) {
                MethodCollector.o(9356);
                throw th;
            }
        }
        MethodCollector.o(9356);
        return null;
    }

    private void l(Aweme aweme) {
        if (aweme != null && aweme.getAuthor() != null && getActivity() != null && !getActivity().isFinishing()) {
            aweme.getAid();
            m(aweme);
            this.f116480a.j();
            this.f116480a.a(aweme.getAuthorUid(), aweme.getAuthor().getSecUid());
            this.f116480a.a(aweme);
            a(aweme, 2);
        }
    }

    private com.bytedance.ies.uikit.a.b o(Aweme aweme) {
        Bundle bundle;
        MethodCollector.i(9345);
        System.currentTimeMillis();
        if (com.bytedance.ies.abmock.b.a().a(true, "profile_params_async_open", false)) {
            synchronized (this.z) {
                try {
                    Bundle bundle2 = this.A;
                    if (bundle2 == null || a(bundle2, "aweme_id") != aweme.getAid()) {
                        bundle = p(aweme);
                    } else {
                        bundle = this.A;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9345);
                    throw th;
                }
            }
        } else {
            bundle = p(aweme);
        }
        com.ss.android.ugc.aweme.profile.experiment.f bulletABHelper = com.ss.android.ugc.aweme.profile.service.b.f116618a.getBulletABHelper();
        com.bytedance.ies.uikit.a.b a2 = bulletABHelper.a(getActivity(), bundle, i());
        bulletABHelper.b(a2, new q(this));
        bulletABHelper.a(a2, new r(this));
        a2.setArguments(bundle);
        MethodCollector.o(9345);
        return a2;
    }

    private void d(Aweme aweme) {
        com.ss.android.ugc.aweme.profile.ui.d.d dVar;
        c(false);
        String n2 = n(aweme);
        n2.hashCode();
        switch (n2.hashCode()) {
            case -803549229:
                if (n2.equals("page_ad")) {
                    if (f(aweme)) {
                        j();
                        return;
                    } else if (this.q != null || this.f116483d != null) {
                        j();
                        ay.f75622a = null;
                        androidx.fragment.app.e activity = getActivity();
                        if (activity != null) {
                            ScrollSwitchStateManager a2 = ScrollSwitchStateManager.a.a(activity);
                            if (!a2.a()) {
                                a2.a(true);
                            }
                        }
                        getActivity();
                        l.a(getContext());
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case -803548836:
                if (n2.equals("page_my") && this.f116481b != null) {
                }
                return;
            case -331427643:
                if (n2.equals("page_fake_user")) {
                    a(false);
                    return;
                }
                return;
            case 883917691:
                if (n2.equals("page_user") && (dVar = this.f116480a) != null) {
                    dVar.a(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void g(Aweme aweme) {
        if (this.q != null || this.f116483d != null) {
            if (com.ss.android.ugc.aweme.profile.service.a.f116616a.getAdLynxLandPageUtil().a(aweme.getAwemeRawAd())) {
                com.ss.android.ugc.aweme.profile.service.a.f116616a.logFeedRawLynxAdOpenUrlH5(getContext(), aweme);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_h5", aweme.getAwemeRawAd()).a("render_type", "lynx").c();
            } else {
                com.ss.android.ugc.aweme.profile.service.a.f116616a.getAdFlutterLandPageUtil();
                aweme.getAwemeRawAd();
                int i2 = h.a().f93346i;
                if (i2 == 53) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "open_url_h5", aweme.getAwemeRawAd()).b("refer", "button").b();
                    h.a().f93346i = -1;
                } else if (i2 == 54) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad_bg", "open_url_h5", aweme.getAwemeRawAd()).b("refer", "bg_more_button").b();
                    h.a().f93346i = -1;
                } else {
                    com.ss.android.ugc.aweme.profile.service.a.f116616a.logFeedRawAdOpenUrlH5(getContext(), aweme);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_h5", aweme.getAwemeRawAd()).c();
                    h.a().f93346i = -1;
                }
            }
            com.ss.android.ugc.aweme.profile.service.a.f116616a.onProfileWebPageShow(getContext(), aweme, this.f116488m);
            if (this.f116483d != null) {
                com.ss.android.ugc.aweme.profile.service.b.f116618a.getBulletABHelper().a(this.f116483d);
            }
            if (this.q != null) {
                com.ss.android.ugc.aweme.profile.service.a.f116616a.getAdFlutterLandPageUtil().a(this.q);
            }
        }
    }

    private void h(final Aweme aweme) {
        if (this.q != null || this.f116483d != null) {
            com.bytedance.ies.uikit.a.b bVar = this.f116483d;
            if (bVar != null) {
                if (bVar instanceof j) {
                    MixActivityContainer mixActivityContainer = ((j) bVar).f78546a;
                    if (mixActivityContainer != null) {
                        a(aweme, mixActivityContainer.getCrossPlatformParams().f78744d.z);
                    } else {
                        getChildFragmentManager().a((i.b) new i.b() {
                            /* class com.ss.android.ugc.aweme.profile.k.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(75191);
                            }

                            @Override // androidx.fragment.app.i.b
                            public final void onFragmentViewCreated(androidx.fragment.app.i iVar, Fragment fragment, View view, Bundle bundle) {
                                if (k.this.f116483d == null) {
                                    com.ss.android.ugc.aweme.framework.a.a.a(5, "ProfilePageFragment", "adBrowserContainerFragment is null when onFragmentViewCreated is called");
                                    return;
                                }
                                MixActivityContainer mixActivityContainer = ((j) k.this.f116483d).f78546a;
                                if (mixActivityContainer != null) {
                                    k.this.a(aweme, mixActivityContainer.getCrossPlatformParams().f78744d.z);
                                } else {
                                    com.ss.android.ugc.aweme.framework.a.a.a("MixActivityContainer is null when onFragmentViewCreated is called");
                                }
                                k.this.getChildFragmentManager().a(this);
                            }
                        }, false);
                    }
                } else {
                    final com.ss.android.ugc.aweme.profile.experiment.f bulletABHelper = com.ss.android.ugc.aweme.profile.service.b.f116618a.getBulletABHelper();
                    final boolean c2 = bulletABHelper.c(this.f116483d);
                    if (bulletABHelper.d(this.f116483d)) {
                        a(aweme, c2);
                    } else {
                        getChildFragmentManager().a((i.b) new i.b() {
                            /* class com.ss.android.ugc.aweme.profile.k.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(75192);
                            }

                            @Override // androidx.fragment.app.i.b
                            public final void onFragmentViewCreated(androidx.fragment.app.i iVar, Fragment fragment, View view, Bundle bundle) {
                                if (bulletABHelper.d(k.this.f116483d)) {
                                    k.this.a(aweme, c2);
                                } else {
                                    com.ss.android.ugc.aweme.framework.a.a.a("BulletContainerView is null when onFragmentViewCreated is called");
                                }
                                k.this.getChildFragmentManager().a(this);
                            }
                        }, false);
                    }
                }
            }
            if (this.q != null && !f(aweme)) {
                g(aweme);
            }
            AwemeRawAd awemeRawAd = null;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            ay.f75622a = awemeRawAd;
            getActivity();
        }
    }

    static boolean a(List<Pair<Aweme, Integer>> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
        // Method dump skipped, instructions count: 444
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.k.e(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    private void j(Aweme aweme) {
        if (ab_()) {
            this.v = true;
            boolean equals = true ^ TextUtils.equals(ac.e(this.f116484e), ac.e(aweme));
            com.ss.android.ugc.aweme.profile.f.ac.a("doAwemeChange(), isAwemeChange is " + equals + ", old aid is " + ac.e(this.f116484e) + ", new aid is " + ac.e(aweme));
            this.f116484e = aweme;
            if (com.ss.android.ugc.aweme.profile.service.a.f116616a.shouldShowFakeUserProfile(aweme)) {
                com.ss.android.ugc.aweme.profile.ui.d.a k2 = k(aweme);
                if (k2 != null) {
                    a(k2.c(), "tag_fragment_page_fake_user");
                    this.f116482c = k2;
                }
                this.r = "page_fake_user";
            } else if (com.ss.android.ugc.aweme.profile.service.a.f116616a.shouldShowAdBrowser(aweme)) {
                com.ss.android.ugc.aweme.profile.service.a.f116616a.getAdFlutterLandPageUtil();
                aweme.getAwemeRawAd();
                if (this.f116483d == null || equals) {
                    if (m()) {
                        this.f116483d = null;
                        this.q = null;
                    } else {
                        if (this.f116483d != null && !c("page_ad")) {
                            a(this.f116483d);
                            this.f116483d = null;
                        }
                        if (this.q != null && !c("page_ad")) {
                            a(this.q);
                            this.q = null;
                        }
                    }
                    com.bytedance.ies.uikit.a.b o2 = o(aweme);
                    this.f116483d = o2;
                    a(o2, "tag_fragment_page_ad");
                    this.f116482c = this.f116483d;
                }
                this.r = "page_ad";
                if (f(this.f116484e)) {
                    h(this.f116484e);
                }
            } else {
                if (m()) {
                    this.f116483d = null;
                    this.q = null;
                } else {
                    if (this.f116483d != null && !c("page_ad")) {
                        a(this.f116483d);
                        this.f116483d = null;
                    }
                    if (this.q != null && !c("page_ad")) {
                        a(this.q);
                        this.q = null;
                    }
                }
                if (b(aweme)) {
                    if (!c("page_my")) {
                        if (this.f116481b == null) {
                            this.f116481b = d();
                        }
                        if (!com.ss.android.ugc.aweme.story.d.a.g(aweme)) {
                            a((Fragment) this.f116481b, "tag_fragment_page_my");
                            this.f116482c = this.f116481b;
                        }
                        this.r = "page_my";
                    } else if (!com.ss.android.ugc.aweme.story.d.a.g(aweme) && !(this.f116482c instanceof com.ss.android.ugc.aweme.profile.ui.d.b)) {
                        a((Fragment) this.f116481b, "tag_fragment_page_my");
                        this.f116482c = this.f116481b;
                        this.r = "page_my";
                    }
                    if (!equals) {
                        return;
                    }
                    return;
                }
                if (!c("page_user")) {
                    if (this.f116480a == null) {
                        this.f116480a = k();
                    }
                    Fragment fragment = (Fragment) this.f116480a;
                    a(fragment, "tag_fragment_page_user");
                    this.f116482c = fragment;
                    this.r = "page_user";
                }
                if (equals) {
                    l(aweme);
                }
            }
        }
    }

    private Bundle p(Aweme aweme) {
        String webTitle;
        String jSONObject;
        boolean z2;
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("url", aweme.getAwemeRawAd().getWebUrl());
        bundle.putBoolean("control_request_url", true);
        if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getSource())) {
            webTitle = aweme.getAwemeRawAd().getSource();
        } else {
            webTitle = aweme.getAwemeRawAd().getWebTitle();
        }
        bundle.putString("bundle_download_app_name", webTitle);
        bundle.putBoolean("bundle_disable_download_dialog", aweme.getAwemeRawAd().isDisableDownloadDialog());
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().c());
        bundle.putBoolean("use_ordinary_web", com.ss.android.ugc.aweme.feed.x.k.a(aweme.getAwemeRawAd()));
        bundle.putBoolean("bundle_is_ad_fake", true);
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putString("bundle_download_app_log_extra", aweme.getAwemeRawAd().getLogExtra());
        bundle.putBoolean("show_report", aweme.getAwemeRawAd().isReportEnable());
        bundle.putString("aweme_id", aweme.getAid());
        Long creativeId = aweme.getAwemeRawAd().getCreativeId();
        bundle.putLong("ad_id", aweme.getAwemeRawAd().getCreativeId().longValue());
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putString("bundle_download_app_extra", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
        bundle.putString("landing_page_info", aweme.getAwemeRawAd().getLandingPageInfo());
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        if (!TextUtils.isEmpty(downloadUrl)) {
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("bundle_download_url", downloadUrl);
            bundle.putString("bundle_ad_quick_app_url", aweme.getAwemeRawAd().getQuickAppUrl());
            bundle.putString("aweme_package_name", aweme.getAwemeRawAd().getPackageName());
            if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getAppName())) {
                bundle.putString("bundle_download_app_name", aweme.getAwemeRawAd().getAppName());
            }
            bundle.putInt("bundle_download_mode", aweme.getAwemeRawAd().getDownloadMode());
            bundle.putInt("bundle_link_mode", aweme.getAwemeRawAd().getLinkMode());
            bundle.putBoolean("bundle_support_multiple_download", aweme.getAwemeRawAd().isSupportMultiple());
            bundle.putString("bundle_open_url", aweme.getAwemeRawAd().getOpenUrl());
            bundle.putString("bundle_web_url", aweme.getAwemeRawAd().getWebUrl());
        }
        bundle.putString("bundle_web_title", af.a(aweme.getAwemeRawAd().getWebTitle()));
        String packageName = aweme.getAwemeRawAd().getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            bundle.putString("aweme_package_name", packageName);
        }
        String str2 = "";
        JSONObject extJson = com.ss.android.ugc.aweme.profile.service.a.f116616a.getExtJson(getContext(), aweme, str2);
        if (extJson == null) {
            jSONObject = str2;
        } else {
            jSONObject = extJson.toString();
        }
        bundle.putString("aweme_json_extra", jSONObject);
        Long groupId = aweme.getAwemeRawAd().getGroupId();
        if (!(groupId == null || groupId.longValue() == 0)) {
            bundle.putString("aweme_group_id", String.valueOf(groupId));
        }
        if (aweme.getAwemeRawAd().getCreativeId().longValue() != 0) {
            bundle.putString("aweme_creative_id", String.valueOf(creativeId));
        }
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        bundle.putString("preload_channel_name", aweme.getAwemeRawAd().getChannelName());
        bundle.putString("preload_scene", "feed");
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        bundle.putInt("preload_web_status_new", aweme.getAwemeRawAd().getPreloadWebNew());
        bundle.putInt("preload_is_web_url", 1);
        bundle.putInt("web_type", aweme.getAwemeRawAd().getWebType());
        bundle.putBoolean("enable_web_google_login", aweme.getAwemeRawAd().isEnableWebGoogleLogin());
        bundle.putBoolean("enable_web_report", aweme.getAwemeRawAd().isEnableWebReport());
        bundle.putString("commerce_enter_from", "feedad");
        Context context = getContext();
        if (context == null || !aweme.getAwemeRawAd().isUseDefaultColor()) {
            bundle.putInt("bundle_webview_background", -1);
        } else {
            bundle.putInt("bundle_webview_background", androidx.core.content.b.c(context, R.color.f159928l));
        }
        if (aweme.getAwemeRawAd().getWebviewProgressBar() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        bundle.putBoolean("webview_progress_bar", z2);
        if (com.ss.android.ugc.aweme.profile.service.a.f116616a.getAdLynxLandPageUtil().a(aweme.getAwemeRawAd())) {
            bundle.putBoolean("is_lynx_landing_page", true);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("should_full_screen", false);
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            if (aweme.getAwemeRawAd().getNativeSiteConfig().getLynxLandingStyle() == 1) {
                if (!(aweme.getVideo() == null || aweme.getVideo().getOriginCover() == null || com.bytedance.common.utility.collection.b.a((Collection) aweme.getVideo().getOriginCover().getUrlList()))) {
                    bundle.putString("bundle_full_screen_bg_image", aweme.getVideo().getOriginCover().getUrlList().get(0));
                }
                bundle.putInt("bundle_webview_background", 0);
            }
            List<String> geckoChannel = aweme.getAwemeRawAd().getNativeSiteConfig().getGeckoChannel();
            if (!com.bytedance.common.utility.collection.b.a((Collection) geckoChannel)) {
                str = geckoChannel.get(0);
            } else {
                str = str2;
            }
            bundle.putString("lynx_channel_name", str);
            bundle.putString("bundle_native_site_custom_data", aweme.getAwemeRawAd().getNativeSiteCustomData());
            if (!com.bytedance.common.utility.collection.b.a((Collection) aweme.getAwemeRawAd().getNativeSiteConfig().getSecondPageGeckoChannel())) {
                if (f2 != null) {
                    str2 = f2.b(aweme.getAwemeRawAd().getAdId());
                }
                bundle.putString("second_page_preload_channel_prefix", str2);
            }
            bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(com.bytedance.common.utility.n.a(context), 1073741824));
            bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(com.bytedance.common.utility.n.b(context) - hh.b(), 1073741824));
            Uri parse = Uri.parse(aweme.getAwemeRawAd().getNativeSiteConfig().getLynxScheme());
            if (parse.isHierarchical()) {
                bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                    bundle.putBoolean("preset_safe_point", true);
                    bundle.putInt("thread_strategy", 2);
                }
            }
        }
        bundle.putBoolean("hide_web_button", aweme.getAwemeRawAd().isHideWebButton());
        bundle.putBoolean("bundle_show_lynx_bottom_label", aweme.getAwemeRawAd().isShowWebViewBottomLynxButton());
        bundle.putString("bundle_lynx_bottom_label_template_url", aweme.getAwemeRawAd().getLynxButtonUrl());
        bundle.putString("bundle_lynx_bottom_label_data", aweme.getAwemeRawAd().getLynxRawData());
        return bundle;
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        String d2 = Hox.a.a(getActivity()).d(this.p);
        String str = "";
        if (bundle.getString(be.f68530b, str).equals(be.f68531c) || bundle.getBoolean(d2)) {
            androidx.fragment.app.e activity = getActivity();
            if (!fp.f90065c) {
                ae.f115954a.preloadProfile(activity, this.p);
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.share.model.d(false));
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.share.model.a());
            if (TextUtils.isEmpty(a.C1605a.f71196d)) {
                a.C1605a.f71193a = this.p;
            }
            HomePageDataViewModel a2 = HomePageDataViewModel.a.a(activity);
            Aweme aweme = a2.f99124g;
            String str2 = a2.f99123f;
            if (aweme != null) {
                str = aweme.getAid();
            }
            b.C2974b.a(str2, str);
            com.ss.android.ugc.d.a.c.a(new g());
            ((MainAnimViewModel) ae.a(activity, (ad.b) null).a(MainAnimViewModel.class)).f109062d.setValue(this.p);
            com.bytedance.ies.dmt.ui.f.a.f33482a = false;
            s.a(af.PROFILE);
            a2.f99129l = false;
        }
        h();
        com.ss.android.ugc.aweme.profile.service.b.f116618a.onFeedStop();
        this.B = true;
        n();
        com.bytedance.analytics.b.a(this);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private <T> T a(String str, Class<T> cls) {
        Fragment a2;
        if (!TextUtils.isEmpty(str) && cls != null && (a2 = getChildFragmentManager().a(str)) != null && cls.isInstance(a2)) {
            return cls.cast(a2);
        }
        return null;
    }

    private void a(Aweme aweme, int i2) {
        com.ss.android.ugc.aweme.profile.f.ac.a("setUserProfileSimpleUserData(), aid is " + aweme.getAid() + ", period is " + i2);
        if (i2 != 2 || !TextUtils.equals(this.f116485j, "homepage_hot") || !com.ss.android.ugc.aweme.base.ui.anchor.a.f68349a.d()) {
            this.f116480a.a(aweme.getAuthor());
            this.n = true;
            return;
        }
        p.f107614a.postAtFrontOfQueue(new o(this, aweme, i2));
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AwemeChangeCallBack.a(getActivity(), this, this);
        HomePageDataViewModel a2 = HomePageDataViewModel.a.a(getActivity());
        l lVar = new l(this);
        h.f.b.l.d(this, "");
        h.f.b.l.d(lVar, "");
        a2.f99125h.observe(this, lVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.w = arguments.getString("related_gid", "");
        }
        ScrollSwitchStateManager a3 = ScrollSwitchStateManager.a.a(getActivity());
        if (getActivity() != null && this.u) {
            m mVar = new m(this, a3);
            this.f116486k = mVar;
            a3.c(this, mVar);
        }
        a3.c(this, new u(this, a3));
    }

    /* access modifiers changed from: package-private */
    public final List<Pair<Aweme, Integer>> a(List<Pair<Aweme, Integer>> list, int i2) {
        if (!a(list)) {
            return list;
        }
        ListIterator<Pair<Aweme, Integer>> listIterator = list.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            Pair<Aweme, Integer> next = listIterator.next();
            if (i2 == 0) {
                this.o = false;
                if (((Integer) next.second).intValue() == 1) {
                    if (!listIterator.hasNext()) {
                        j((Aweme) next.first);
                        listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() | 4096)));
                        break;
                    }
                    listIterator.remove();
                } else if (((Integer) next.second).intValue() == 4097) {
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                } else if (((Integer) next.second).intValue() == 17) {
                    j((Aweme) next.first);
                    listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() | 4096)));
                    break;
                } else if (((Integer) next.second).intValue() == 273) {
                    if (getHost() == null) {
                        com.ss.android.ugc.aweme.framework.a.a.a("getHost() is null, isAdded:" + isAdded() + " isRemoving:" + isRemoving() + " isResumed:" + isResumed() + " isDetached:" + isDetached() + " isVisible:" + isVisible());
                    } else {
                        j((Aweme) next.first);
                        e((Aweme) next.first);
                    }
                    listIterator.set(Pair.create(next.first, 69649));
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                }
            } else if (i2 == 1) {
                if (((Integer) next.second).intValue() == 4113) {
                    e((Aweme) next.first);
                    listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() | 65536)));
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                } else if (((Integer) next.second).intValue() == 17) {
                    listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() | 256)));
                    break;
                }
            } else if (i2 != 2) {
                continue;
            } else if ((((Integer) next.second).intValue() & 65536) == 65536) {
                d((Aweme) next.first);
                listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() & -17 & -65537)));
                break;
            } else if ((((Integer) next.second).intValue() & 256) == 256) {
                listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() & -17 & -257)));
                break;
            } else if ((((Integer) next.second).intValue() & 16) == 16) {
                listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() & -17)));
                break;
            }
        }
        list.size();
        return list;
    }

    /* access modifiers changed from: package-private */
    public final void a(Fragment fragment, String str) {
        n a2 = getChildFragmentManager().a();
        a2.b(R.id.ad7, fragment, str);
        a2.c();
        com.ss.android.ugc.aweme.profile.f.ac.a("replaceFragment(), tag is ".concat(String.valueOf(str)));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u = true;
        com.ss.android.ugc.aweme.profile.f.ac.a("UserProfileInitMethodExperiment lazyLoad is " + this.u);
        return com.a.b.c.a((Activity) getActivity(), (int) R.layout.ajc);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<T, java.lang.Void> */
    /* JADX WARN: Multi-variable type inference failed */
    private <T> void a(String str, Class<T> cls, h.f.a.b<T, Void> bVar) {
        Object a2 = a(str, cls);
        if (a2 != null && bVar != 0) {
            bVar.invoke(a2);
        }
    }
}
