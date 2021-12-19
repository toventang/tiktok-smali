package com.ss.android.ugc.aweme.homepage.msadapt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.lifecycle.i;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.at;
import com.ss.android.ugc.aweme.ba;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.feed.i.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.msadapt.core.a;
import com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout;
import com.ss.android.ugc.aweme.main.a.a;
import com.ss.android.ugc.aweme.main.j;
import com.ss.android.ugc.aweme.main.m;
import com.ss.android.ugc.aweme.main.o;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.r;

public final class DoubleFragmentMainActivity extends a implements a.AbstractC2797a, j, i, org.greenrobot.eventbus.j {

    /* renamed from: a  reason: collision with root package name */
    private SurfaceDuoLayout f99181a;

    /* renamed from: b  reason: collision with root package name */
    private ScrollSwitchStateManager f99182b;

    /* renamed from: c  reason: collision with root package name */
    private final h f99183c = h.i.a((h.f.a.a) c.f99194a);

    /* renamed from: d  reason: collision with root package name */
    private at f99184d;

    /* renamed from: e  reason: collision with root package name */
    private final String f99185e = "msadapt";

    /* renamed from: f  reason: collision with root package name */
    private String f99186f = "DISCOVER";

    /* renamed from: g  reason: collision with root package name */
    private Fragment f99187g;

    /* renamed from: h  reason: collision with root package name */
    private Fragment f99188h;

    /* renamed from: i  reason: collision with root package name */
    private Fragment f99189i;

    /* renamed from: j  reason: collision with root package name */
    private int f99190j;

    /* renamed from: k  reason: collision with root package name */
    private final String f99191k = "end";

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f99192l;

    static {
        Covode.recordClassIndex(63192);
    }

    private final Fragment b() {
        return (Fragment) this.f99183c.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f99192l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f99192l == null) {
            this.f99192l = new SparseArray();
        }
        View view = (View) this.f99192l.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f99192l.put(i2, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(16, new g(DoubleFragmentMainActivity.class, "onScrollToProfileEvent", ad.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final boolean hasRegistedResumeAction() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final boolean isMainTabVisible() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final boolean isUnderMainTab() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final boolean isUnderThirdTab() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final void onFeedRecommendFragmentReady() {
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final void onKeyBack() {
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public final void registerActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final void setTabBackground(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public final void unRegisterActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
        l.d(aVar, "");
    }

    public static final class a implements m {
        static {
            Covode.recordClassIndex(63193);
        }

        @Override // com.ss.android.ugc.aweme.main.m
        public final void a() {
        }

        a() {
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DoubleFragmentMainActivity f99197a;

        static {
            Covode.recordClassIndex(63198);
        }

        e(DoubleFragmentMainActivity doubleFragmentMainActivity) {
            this.f99197a = doubleFragmentMainActivity;
        }

        public final void run() {
            this.f99197a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final m getMainHelper() {
        return new a();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    static final class c extends h.f.b.m implements h.f.a.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f99194a = new c();

        static {
            Covode.recordClassIndex(63195);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return MainServiceImpl.createIMainServicebyMonsterPlugin(false).obtainMainPageFragment();
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f99198a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f99199b;

        static {
            Covode.recordClassIndex(63199);
        }

        f(Fragment fragment, Aweme aweme) {
            this.f99198a = fragment;
            this.f99199b = aweme;
        }

        public final void run() {
            ProfileServiceImpl.g().updateUserInfo(this.f99198a, this.f99199b);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final Fragment getCurFragment() {
        Fragment b2 = b();
        if (b2 == null) {
            l.b();
        }
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.main.a.a.AbstractC2797a
    public final o getHelper() {
        o a2 = HomePageUIFrameServiceImpl.e().a((Context) this);
        if (a2 == null) {
            l.b();
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final boolean isDuoDualMode() {
        if (!a.C2425a.b(this)) {
            return false;
        }
        return a.C2425a.d(this);
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public final String getEnterFrom() {
        com.ss.android.ugc.aweme.main.l a2 = MSAdaptionService.c().a((Activity) this);
        if (a2 == null || a2.m() || !a2.n()) {
            return "homepage_hot";
        }
        return "homepage_follow";
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        super.onBackPressed();
        if (MSAdaptionService.c().c((Context) this)) {
            SmartRouter.buildRoute(this, "//duo").withParam("duo_type", "duo_back").open();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onResume", true);
        super.onResume();
        a.C2425a.d(this);
        if (!a.C2425a.d(this)) {
            SmartRouter.buildRoute(this, "//main").open();
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public final void a() {
        Fragment a2 = a(false);
        if (a2 != null) {
            if (a(a2)) {
                int i2 = this.f99190j;
                if (i2 > 0) {
                    int i3 = 1;
                    while (true) {
                        getSupportFragmentManager().c();
                        if (i3 == i2) {
                            break;
                        }
                        i3++;
                    }
                }
                this.f99190j = 0;
                return;
            }
            getSupportFragmentManager().c();
        }
    }

    public static final class b implements AwemeChangeCallBack.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DoubleFragmentMainActivity f99193a;

        static {
            Covode.recordClassIndex(63194);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(DoubleFragmentMainActivity doubleFragmentMainActivity) {
            this.f99193a = doubleFragmentMainActivity;
        }

        @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
        public final void a(Aweme aweme) {
            ProfileServiceImpl.g().updateUserInfo(this.f99193a.a(true), aweme);
            if (aweme != null) {
                MSAdaptionService.c().a(aweme);
            }
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f99195a = new d();

        static {
            Covode.recordClassIndex(63196);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f99196a);
            return z.f158842a;
        }
    }

    @r
    public final void onScrollToProfileEvent(ad adVar) {
        if (MSAdaptionService.c().c((Context) this)) {
            SmartRouter.buildRoute(this, "//duo").withParam("duo_type", "duo_profile").open();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onConfigurationChanged(Configuration configuration) {
        l.d(configuration, "");
        super.onConfigurationChanged(configuration);
        if (a.C2425a.b(this) && a.C2425a.d(this) && getResources().getConfiguration().orientation == 1) {
            androidx.lifecycle.i lifecycle = getLifecycle();
            l.b(lifecycle, "");
            if (lifecycle.a().isAtLeast(i.b.RESUMED)) {
                SmartRouter.buildRoute(this, "//main").open();
                finish();
            }
        }
        if (!a.C2425a.d(this)) {
            androidx.lifecycle.i lifecycle2 = getLifecycle();
            l.b(lifecycle2, "");
            if (lifecycle2.a().isAtLeast(i.b.RESUMED)) {
                SmartRouter.buildRoute(this, "//main").open();
                finish();
            }
        }
    }

    private static boolean a(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return TextUtils.equals(fragment.getTag(), "duo_detail");
    }

    private static boolean a(String str) {
        if (l.a((Object) str, (Object) "DISCOVER") || l.a((Object) str, (Object) "NOTIFICATION") || l.a((Object) str, (Object) "USER")) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.homepage.msadapt.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        View view;
        at atVar;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onCreate", true);
        activityConfiguration(d.f99195a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.b9);
        Hox.a.a(this).a(this, HomePageUIFrameServiceImpl.e().a((androidx.fragment.app.e) this));
        ScrollSwitchStateManager a2 = ScrollSwitchStateManager.a.a(this);
        this.f99182b = a2;
        if (a2 == null) {
            l.a("stateManager");
        }
        a2.a("page_feed");
        Bundle bundle2 = new Bundle();
        bundle2.putString(be.f68530b, be.f68532d);
        Hox.a.a(this).b("HOME", bundle2);
        this.f99184d = new at();
        if (!(getApplication() == null || (atVar = this.f99184d) == null)) {
            atVar.a(getApplication());
        }
        AwemeChangeCallBack.b(this, this, new b(this));
        SurfaceDuoLayout surfaceDuoLayout = (SurfaceDuoLayout) findViewById(R.id.awt);
        this.f99181a = surfaceDuoLayout;
        com.ss.android.ugc.aweme.base.f.a aVar = null;
        if (surfaceDuoLayout != null) {
            view = surfaceDuoLayout.findViewById(R.id.b4z);
        } else {
            view = null;
        }
        if (view != null) {
            SurfaceDuoLayout surfaceDuoLayout2 = this.f99181a;
            if (surfaceDuoLayout2 != null) {
                surfaceDuoLayout2.findViewById(R.id.b4z);
            }
            Fragment b2 = b();
            if (b2 == null) {
                l.b();
            }
            a(R.id.b4z, b2);
            MSAdaptionService.c().a(b());
            Fragment obtainFriendTabFragment = MainServiceImpl.createIMainServicebyMonsterPlugin(false).obtainFriendTabFragment();
            l.b(obtainFriendTabFragment, "");
            this.f99187g = obtainFriendTabFragment;
            Class a3 = com.ss.android.ugc.aweme.notice.api.services.b.f112773a.a();
            if (a3 != null) {
                aVar = (com.ss.android.ugc.aweme.base.f.a) a3.newInstance();
            }
            this.f99188h = aVar;
            Fragment obtainMyProfileFragment = ProfileServiceImpl.g().obtainMyProfileFragment();
            if (obtainMyProfileFragment == null) {
                l.b();
            }
            this.f99189i = obtainMyProfileFragment;
            n a4 = getSupportFragmentManager().a();
            l.b(a4, "");
            Fragment fragment = this.f99187g;
            if (fragment == null) {
                l.b();
            }
            n a5 = a4.a(R.id.b50, fragment, "DISCOVER");
            Fragment fragment2 = this.f99188h;
            if (fragment2 == null) {
                l.b();
            }
            n a6 = a5.a(R.id.b50, fragment2, "NOTIFICATION");
            Fragment fragment3 = this.f99189i;
            if (fragment3 == null) {
                l.b();
            }
            n a7 = a6.a(R.id.b50, fragment3, "USER");
            Fragment fragment4 = this.f99187g;
            if (fragment4 == null) {
                l.b();
            }
            n c2 = a7.c(fragment4);
            Fragment fragment5 = this.f99188h;
            if (fragment5 == null) {
                l.b();
            }
            n b3 = c2.b(fragment5);
            Fragment fragment6 = this.f99189i;
            if (fragment6 == null) {
                l.b();
            }
            b3.b(fragment6).b();
        } else {
            Fragment b4 = b();
            if (b4 == null) {
                l.b();
            }
            a(R.id.b50, b4);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public final void onNewIntent(Intent intent) {
        String str;
        super.onNewIntent(intent);
        setIntent(intent);
        Fragment fragment = null;
        r4 = null;
        r4 = null;
        r4 = null;
        Fragment fragment2 = null;
        String str2 = null;
        if (intent != null) {
            str = a(intent, "duo_type");
        } else {
            str = null;
        }
        boolean a2 = a(a(false));
        boolean z = !TextUtils.equals("duo_back", str);
        if (TextUtils.equals(str, "duo_detail") || (z && a2)) {
            this.f99190j++;
        }
        if (intent != null) {
            a(intent, "duo_type");
            String a3 = a(intent, "duo_type");
            if (a3 != null) {
                switch (a3.hashCode()) {
                    case -2080291192:
                        if (a3.equals("duo_back")) {
                            a();
                            return;
                        }
                        return;
                    case -1938590286:
                        if (a3.equals("duo_detail")) {
                            l.d(this, "");
                            if (MSAdaptionService.c().a(com.bytedance.ies.ugc.appcontext.d.a())) {
                                fragment = ba.a().a(this);
                            }
                            a(fragment, "duo_detail", false);
                            return;
                        }
                        return;
                    case -1833904024:
                        if (a3.equals("duo_profile")) {
                            Fragment a4 = a(true);
                            if (a4 != null) {
                                str2 = a4.getTag();
                            }
                            if (!TextUtils.equals(str2, "duo_profile")) {
                                Fragment obtainUserProfileFragment = ProfileServiceImpl.g().obtainUserProfileFragment();
                                Aweme a5 = AwemeChangeCallBack.a(this);
                                a(obtainUserProfileFragment, "duo_profile", true);
                                new Handler(Looper.getMainLooper()).postDelayed(new f(obtainUserProfileFragment, a5), 1000);
                                return;
                            }
                            return;
                        }
                        return;
                    case -300053832:
                        if (a3.equals("duo_webview")) {
                            com.ss.android.ugc.aweme.crossplatform.activity.j jVar = new com.ss.android.ugc.aweme.crossplatform.activity.j();
                            jVar.a(new e(this));
                            jVar.setArguments(a(getIntent()));
                            a((Fragment) jVar, "duo_webview", true);
                            return;
                        }
                        return;
                    case -30215092:
                        if (a3.equals("duo_music_detail")) {
                            a((DoubleFragmentMainActivity) MusicDetailService.a().a(getIntent()), (Fragment) "duo_music_detail", (String) true);
                            return;
                        }
                        return;
                    case 962860898:
                        if (a3.equals("duo_challenge")) {
                            a((DoubleFragmentMainActivity) com.ss.android.ugc.aweme.challenge.api.a.f69899a.a(getIntent()), (Fragment) "duo_challenge", (String) true);
                            return;
                        }
                        return;
                    case 971786005:
                        if (a3.equals("duo_bottom_click")) {
                            String a6 = a(intent, "duo_clicked_tab_name");
                            if (a6 == null) {
                                a6 = "";
                            }
                            l.b(a6, "");
                            if (TextUtils.equals(a6, "PUBLISH")) {
                                Toast makeText = Toast.makeText(this, getString(R.string.bey), 0);
                                if (Build.VERSION.SDK_INT == 25) {
                                    ic.a(makeText);
                                }
                                makeText.show();
                                return;
                            } else if (!TextUtils.equals(a6, "HOME")) {
                                this.f99186f = a6;
                                int hashCode = a6.hashCode();
                                if (hashCode != -1382453013) {
                                    if (hashCode != 2614219) {
                                        if (hashCode == 1055811561 && a6.equals("DISCOVER")) {
                                            fragment2 = this.f99187g;
                                        }
                                    } else if (a6.equals("USER")) {
                                        fragment2 = this.f99189i;
                                    }
                                } else if (a6.equals("NOTIFICATION")) {
                                    fragment2 = this.f99188h;
                                }
                                a((DoubleFragmentMainActivity) fragment2, (Fragment) a6, (String) true);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Fragment a(boolean z) {
        boolean z2;
        androidx.fragment.app.i supportFragmentManager = getSupportFragmentManager();
        l.b(supportFragmentManager, "");
        List<Fragment> f2 = supportFragmentManager.f();
        l.b(f2, "");
        if (f2 == null) {
            return null;
        }
        for (Fragment fragment : f2) {
            if (fragment != null && fragment.isVisible()) {
                if (TextUtils.equals(fragment.getTag(), "HOME") || TextUtils.equals(fragment.getTag(), "duo_detail")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    if (!z2) {
                        return fragment;
                    }
                } else if (z2) {
                    return fragment;
                }
            }
        }
        return null;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private final void a(int i2, Fragment fragment) {
        if (this.f99181a != null && findViewById(i2) != null) {
            n b2 = getSupportFragmentManager().a().b(i2, fragment, "HOME");
            l.b(b2, "");
            b2.c();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Fragment fragment, String str, boolean z) {
        int i2;
        if (fragment != null) {
            if (z) {
                i2 = R.id.b50;
            } else {
                i2 = R.id.b4z;
            }
            Fragment a2 = a(z);
            n a3 = getSupportFragmentManager().a();
            l.b(a3, "");
            if (a2 != null) {
                a3.b(a2);
            }
            if (a(str)) {
                a3.c(fragment);
            } else {
                a3.a(i2, fragment, str);
            }
            a3.a((String) null);
            a3.b();
        }
    }
}
