package com.ss.android.ugc.aweme.view;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.common.ab;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.aweme.view.f.a;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class ProfileNaviActivity extends androidx.appcompat.app.d implements com.bytedance.jedi.arch.q {

    /* renamed from: c  reason: collision with root package name */
    public static final a f144020c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h.a.h<b> f144021a = new h.a.h<>();

    /* renamed from: b  reason: collision with root package name */
    public final String[] f144022b = {"android.permission.CAMERA"};

    /* renamed from: d  reason: collision with root package name */
    private final h.h f144023d = h.i.a((h.f.a.a) new u(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f144024e = h.i.a((h.f.a.a) new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f144025f = h.i.a((h.f.a.a) new e(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f144026g = h.i.a((h.f.a.a) new c(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f144027h = h.i.a((h.f.a.a) new z(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f144028i = h.i.a((h.f.a.a) new x(this));

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f144029j;

    /* access modifiers changed from: package-private */
    public enum b {
        ONBOARDING,
        EDITOR,
        HUB,
        IMAGE_EDITOR;

        static {
            Covode.recordClassIndex(94242);
        }
    }

    static {
        Covode.recordClassIndex(94240);
    }

    private final ProfileNaviOnboardingViewModel d() {
        return (ProfileNaviOnboardingViewModel) this.f144023d.getValue();
    }

    private final ProfileNaviHubViewModel e() {
        return (ProfileNaviHubViewModel) this.f144025f.getValue();
    }

    private final ProfileNaviCreatorViewModel f() {
        return (ProfileNaviCreatorViewModel) this.f144026g.getValue();
    }

    private final ProfileNaviSwitcherViewModel g() {
        return (ProfileNaviSwitcherViewModel) this.f144027h.getValue();
    }

    public final View a(int i2) {
        if (this.f144029j == null) {
            this.f144029j = new SparseArray();
        }
        View view = (View) this.f144029j.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f144029j.put(i2, findViewById);
        return findViewById;
    }

    public final ProfileNaviEditorViewModel a() {
        return (ProfileNaviEditorViewModel) this.f144024e.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94241);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        c();
    }

    static final class c extends h.f.b.m implements h.f.a.a<ProfileNaviCreatorViewModel> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviCreatorViewModel invoke() {
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(this.this$0).a(ProfileNaviCreatorViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<ProfileNaviEditorViewModel> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviEditorViewModel invoke() {
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(this.this$0).a(ProfileNaviEditorViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<ProfileNaviHubViewModel> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviHubViewModel invoke() {
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(this.this$0).a(ProfileNaviHubViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<ProfileNaviOnboardingViewModel> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviOnboardingViewModel invoke() {
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(this.this$0).a(ProfileNaviOnboardingViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.a<ProfileNaviSpinnerViewModel> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviSpinnerViewModel invoke() {
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(this.this$0).a(ProfileNaviSpinnerViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class z extends h.f.b.m implements h.f.a.a<ProfileNaviSwitcherViewModel> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviSwitcherViewModel invoke() {
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(this.this$0).a(ProfileNaviSwitcherViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    public final void c() {
        d().a();
        a().a();
        f().a();
        g().a();
        e().a();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
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

    public static final class y implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviActivity f144037a;

        static {
            Covode.recordClassIndex(94265);
        }

        public final void onGlobalLayout() {
            ProfileNaviActivity profileNaviActivity = this.f144037a;
            if (Build.VERSION.SDK_INT >= 21) {
                FrameLayout frameLayout = (FrameLayout) profileNaviActivity.a(R.id.da6);
                h.f.b.l.b(frameLayout, "");
                int width = frameLayout.getWidth();
                FrameLayout frameLayout2 = (FrameLayout) profileNaviActivity.a(R.id.da6);
                h.f.b.l.b(frameLayout2, "");
                double max = (double) Math.max(width, frameLayout2.getHeight());
                Double.isNaN(max);
                float f2 = (float) (max * 1.1d);
                FrameLayout frameLayout3 = (FrameLayout) profileNaviActivity.a(R.id.da6);
                h.f.b.l.b(frameLayout3, "");
                int width2 = frameLayout3.getWidth() / 2;
                FrameLayout frameLayout4 = (FrameLayout) profileNaviActivity.a(R.id.da6);
                h.f.b.l.b(frameLayout4, "");
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(profileNaviActivity.a(R.id.da6), width2, (frameLayout4.getHeight() / 3) * 2, 0.0f, f2);
                h.f.b.l.b(createCircularReveal, "");
                createCircularReveal.setDuration(400);
                createCircularReveal.setInterpolator(new AccelerateInterpolator());
                FrameLayout frameLayout5 = (FrameLayout) profileNaviActivity.a(R.id.da6);
                h.f.b.l.b(frameLayout5, "");
                frameLayout5.setVisibility(0);
                createCircularReveal.start();
            } else {
                FrameLayout frameLayout6 = (FrameLayout) profileNaviActivity.a(R.id.da6);
                h.f.b.l.b(frameLayout6, "");
                frameLayout6.setVisibility(0);
            }
            FrameLayout frameLayout7 = (FrameLayout) this.f144037a.a(R.id.da6);
            h.f.b.l.b(frameLayout7, "");
            frameLayout7.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        y(ProfileNaviActivity profileNaviActivity) {
            this.f144037a = profileNaviActivity;
        }
    }

    public final void b() {
        a();
        if (!ab.f76387c || androidx.core.app.a.a((Context) this, "android.permission.CAMERA") == 0 || Build.VERSION.SDK_INT < 23) {
            androidx.fragment.app.i supportFragmentManager = getSupportFragmentManager();
            h.f.b.l.b(supportFragmentManager, "");
            a(new com.ss.android.ugc.aweme.view.b.c(supportFragmentManager));
            return;
        }
        a.C0731a b2 = new a.C0731a(this).a(R.string.a0a).b(R.string.a0_);
        b2.M = true;
        com.bytedance.ies.dmt.ui.dialog.a a2 = b2.a(R.string.a0c, (DialogInterface.OnClickListener) new v(this), false).b(R.string.a0d, (DialogInterface.OnClickListener) new w(this), false).a();
        com.ss.android.ugc.aweme.common.r.a("show_avatar_camera_access", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
        a2.c();
    }

    private final void b(Fragment fragment) {
        if (fragment instanceof com.ss.android.ugc.aweme.view.e.a) {
            this.f144021a.a(b.ONBOARDING);
        } else if (fragment instanceof com.ss.android.ugc.aweme.view.b.c) {
            this.f144021a.a(b.EDITOR);
        } else if (fragment instanceof com.ss.android.ugc.aweme.view.f.a) {
            this.f144021a.a(b.IMAGE_EDITOR);
        } else if (fragment instanceof com.ss.android.ugc.aweme.view.c.a) {
            this.f144021a.a(b.HUB);
        }
    }

    private final void b(Bundle bundle) {
        if (bundle != null || Build.VERSION.SDK_INT < 21) {
            FrameLayout frameLayout = (FrameLayout) a(R.id.da6);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(0);
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) a(R.id.da6);
        h.f.b.l.b(frameLayout2, "");
        frameLayout2.setVisibility(4);
        FrameLayout frameLayout3 = (FrameLayout) a(R.id.da6);
        h.f.b.l.b(frameLayout3, "");
        ViewTreeObserver viewTreeObserver = frameLayout3.getViewTreeObserver();
        h.f.b.l.b(viewTreeObserver, "");
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new y(this));
        }
    }

    public final void a(Bundle bundle) {
        a(false);
        b(bundle);
        String a2 = a(getIntent(), "edit_navi_id_key");
        if (hk.a(a2)) {
            ProfileNaviOnboardingViewModel d2 = d();
            if (a2 == null) {
                h.f.b.l.b();
            }
            d2.a(a2, 0);
            return;
        }
        String a3 = a(getIntent(), "set_profile_photo_navi_id_key");
        if (hk.a(a3)) {
            a();
            if (com.ss.android.ugc.aweme.model.r.f110815e != null) {
                ProfileNaviCreatorViewModel f2 = f();
                if (a3 == null) {
                    h.f.b.l.b();
                }
                f2.a(a3, 0);
                return;
            }
            a(true);
            return;
        }
        com.ss.android.ugc.aweme.view.e.a aVar = new com.ss.android.ugc.aweme.view.e.a();
        if (getIntent().getIntExtra("entry_point", 0) == 1) {
            e().a(true);
        } else {
            a(aVar);
        }
    }

    public final void a(Fragment fragment) {
        androidx.fragment.app.n a2 = getSupportFragmentManager().a();
        h.f.b.l.b(a2, "");
        a2.b(R.id.da6, fragment, "navi_fragment");
        b(fragment);
        a2.b();
    }

    public final void a(String str) {
        String a2 = a(getIntent(), "set_profile_photo_navi_id_key");
        com.ss.android.ugc.aweme.view.f.a a3 = a.C3846a.a(str);
        if (hk.a(a2)) {
            a3 = a.C3846a.a("set_profile_photo");
        }
        a(a3);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onCreate", true);
        super.onCreate(bundle);
        String a2 = a(getIntent(), "enter_from");
        if (a2 != null) {
            h.f.b.l.d(a2, "");
            com.ss.android.ugc.aweme.bn.a.f68735a = a2;
        }
        setContentView(R.layout.aph);
        a().a((Context) this);
        f();
        com.ss.android.ugc.aweme.model.b.f110754a.clear();
        a(bundle);
        f.a.b.b unused = selectSubscribe(d(), h.f144281a, new ah(), new k(this));
        f.a.b.b unused2 = selectSubscribe(a(), s.f144292a, new ah(), new r(this));
        f.a.b.b unused3 = selectSubscribe(a(), t.f144293a, new ah(), new s(this));
        f.a.b.b unused4 = selectSubscribe(a(), u.f144294a, new ah(), new t(this));
        f.a.b.b unused5 = selectSubscribe(e(), v.f144295a, new ah(), new f(this));
        f.a.b.b unused6 = selectSubscribe(e(), i.f144282a, new ah(), new g(this));
        f.a.b.b unused7 = selectSubscribe(e(), j.f144283a, new ah(), new h(this));
        f.a.b.b unused8 = selectSubscribe(f(), k.f144284a, new ah(), new i(this));
        f.a.b.b unused9 = selectSubscribe(f(), l.f144285a, new ah(), new j(this));
        f.a.b.b unused10 = selectSubscribe(e(), m.f144286a, new ah(), new l(this));
        f.a.b.b unused11 = selectSubscribe(e(), n.f144287a, new ah(), new m(this));
        f.a.b.b unused12 = selectSubscribe(f(), o.f144288a, new ah(), new n(this));
        f.a.b.b unused13 = selectSubscribe(g(), p.f144289a, new ah(), new o(this));
        f.a.b.b unused14 = selectSubscribe(e(), q.f144290a, new ah(), new p(this));
        f.a.b.b unused15 = selectSubscribe((ProfileNaviSpinnerViewModel) this.f144028i.getValue(), r.f144291a, new ah(), new q(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onCreate", false);
    }

    public final void a(boolean z2) {
        if (z2) {
            CardView cardView = (CardView) a(R.id.dav);
            h.f.b.l.b(cardView, "");
            cardView.setVisibility(0);
            ((TuxDualBallView) a(R.id.dau)).b();
            return;
        }
        ((TuxDualBallView) a(R.id.dau)).c();
        CardView cardView2 = (CardView) a(R.id.dav);
        h.f.b.l.b(cardView2, "");
        cardView2.setVisibility(4);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.a("set_profile_photo");
            }
            return h.z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.a(new com.ss.android.ugc.aweme.view.e.a());
            }
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.a(new com.ss.android.ugc.aweme.view.c.a());
            }
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.c();
                this.this$0.finish();
            }
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.model.api.a.b, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.model.api.a.b bVar) {
            com.ss.android.ugc.aweme.model.api.a.b bVar2 = bVar;
            h.f.b.l.d(iVar, "");
            if (bVar2 != null) {
                this.this$0.a();
                h.f.b.l.d(bVar2, "");
                com.ss.android.ugc.aweme.model.r.a(bVar2);
                this.this$0.b();
            }
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.b();
            }
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.c();
                this.this$0.finish();
            }
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.a((ProfileNaviActivity) "avatar_hub");
            }
            return h.z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.c();
                this.this$0.a(new com.ss.android.ugc.aweme.view.e.a());
            }
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.c();
                this.this$0.finish();
            }
            return h.z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            this.this$0.a(booleanValue);
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.a(new com.ss.android.ugc.aweme.view.c.a());
            }
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.model.u>, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends com.ss.android.ugc.aweme.model.u> list) {
            h.f.b.l.d(iVar, "");
            if (list != null && this.this$0.getSupportFragmentManager().a("navi_fragment") == null) {
                this.this$0.a((Bundle) null);
            }
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.c();
                this.this$0.finish();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviActivity f144036a;

        static {
            Covode.recordClassIndex(94263);
        }

        w(ProfileNaviActivity profileNaviActivity) {
            this.f144036a = profileNaviActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.common.r.a("deny_avatar_camera", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
            ProfileNaviActivity profileNaviActivity = this.f144036a;
            androidx.fragment.app.i supportFragmentManager = this.f144036a.getSupportFragmentManager();
            h.f.b.l.b(supportFragmentManager, "");
            profileNaviActivity.a(new com.ss.android.ugc.aweme.view.b.c(supportFragmentManager));
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ ProfileNaviActivity this$0;

        static {
            Covode.recordClassIndex(94250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.this$0 = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                ProfileNaviActivity profileNaviActivity = this.this$0;
                if (!profileNaviActivity.f144021a.isEmpty()) {
                    profileNaviActivity.f144021a.b();
                }
                if (profileNaviActivity.f144021a.isEmpty()) {
                    profileNaviActivity.c();
                    profileNaviActivity.finish();
                } else {
                    int i2 = g.f144280a[profileNaviActivity.f144021a.b().ordinal()];
                    if (i2 == 1) {
                        profileNaviActivity.c();
                        profileNaviActivity.a(new com.ss.android.ugc.aweme.view.e.a());
                    } else if (i2 == 2) {
                        profileNaviActivity.b();
                    } else if (i2 == 3) {
                        profileNaviActivity.a((ProfileNaviActivity) "avatar_hub");
                    } else if (i2 == 4) {
                        profileNaviActivity.a(new com.ss.android.ugc.aweme.view.c.a());
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviActivity f144035a;

        static {
            Covode.recordClassIndex(94262);
        }

        v(ProfileNaviActivity profileNaviActivity) {
            this.f144035a = profileNaviActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.common.r.a("allow_avatar_camera", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "avatar_hub").f66730a);
            ProfileNaviActivity profileNaviActivity = this.f144035a;
            String[] strArr = profileNaviActivity.f144022b;
            if (!((Boolean) com.bytedance.helios.sdk.a.a(profileNaviActivity, new Object[]{strArr, 12345}, 102600, "void", false, null).first).booleanValue()) {
                com.bytedance.helios.sdk.a.a(null, profileNaviActivity, new Object[]{strArr, 12345}, 102600, "com_ss_android_ugc_aweme_view_ProfileNaviActivity$showEditorFragment$tuxDialogBuilder$1_com_ss_android_ugc_aweme_view_ProfileNaviActivity_requestPermissions(Lcom/ss/android/ugc/aweme/view/ProfileNaviActivity;[Ljava/lang/String;I)V");
                profileNaviActivity.requestPermissions(strArr, 12345);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        h.f.b.l.d(strArr, "");
        h.f.b.l.d(iArr, "");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        androidx.fragment.app.i supportFragmentManager = getSupportFragmentManager();
        h.f.b.l.b(supportFragmentManager, "");
        a(new com.ss.android.ugc.aweme.view.b.c(supportFragmentManager));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
