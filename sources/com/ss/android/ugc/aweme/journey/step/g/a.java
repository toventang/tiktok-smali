package com.ss.android.ugc.aweme.journey.step.g;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.account.g;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.g.e;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends e implements g, i, j {

    /* renamed from: a  reason: collision with root package name */
    public View f105010a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f105011b;

    /* renamed from: c  reason: collision with root package name */
    public View f105012c;

    /* renamed from: d  reason: collision with root package name */
    public ViewStub f105013d;

    /* renamed from: e  reason: collision with root package name */
    final IMandatoryLoginService f105014e = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
    private SparseArray o;

    static {
        Covode.recordClassIndex(67332);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.g.e
    public final View a(int i2) {
        if (this.o == null) {
            this.o = new SparseArray();
        }
        View view = (View) this.o.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o.put(i2, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(144, new org.greenrobot.eventbus.g(a.class, "onComplianceSettingDoneEvent", com.ss.android.ugc.aweme.journey.b.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.g.e
    public final void h() {
        SparseArray sparseArray = this.o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105018a;

        static {
            Covode.recordClassIndex(67336);
        }

        d(a aVar) {
            this.f105018a = aVar;
        }

        public final void run() {
            a.e();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105016a;

        static {
            Covode.recordClassIndex(67334);
        }

        b(a aVar) {
            this.f105016a = aVar;
        }

        public final void run() {
            this.f105016a.i();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105017a;

        static {
            Covode.recordClassIndex(67335);
        }

        c(a aVar) {
            this.f105017a = aVar;
        }

        public final void run() {
            this.f105017a.a(0L);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.g.a$a  reason: collision with other inner class name */
    static final class RunnableC2680a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105015a;

        static {
            Covode.recordClassIndex(67333);
        }

        RunnableC2680a(a aVar) {
            this.f105015a = aVar;
        }

        public final void run() {
            this.f105015a.a((Boolean) null);
            a.e();
        }
    }

    public static void e() {
        com.ss.android.ugc.d.a.c.a(new b());
    }

    public final View b() {
        View view = this.f105010a;
        if (view == null) {
            l.a("logoView");
        }
        return view;
    }

    public final TextView c() {
        TextView textView = this.f105011b;
        if (textView == null) {
            l.a("sloganView");
        }
        return textView;
    }

    public final View d() {
        View view = this.f105012c;
        if (view == null) {
            l.a("rootView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.journey.step.g.e
    public final ViewStub g() {
        ViewStub viewStub = this.f105013d;
        if (viewStub == null) {
            l.a("mStatusView");
        }
        return viewStub;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f105031j = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (com.bytedance.ies.ugc.appcontext.f.f34637l) {
            a((Boolean) true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.g
    public final void a() {
        a.C1369a.b(this);
        this.f105033l.postDelayed(new d(this), 100);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.g.e, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DmtStatusView dmtStatusView = this.f105034m;
        if (dmtStatusView != null) {
            dmtStatusView.d();
        }
        a.C1369a.b(this);
        super.onDestroyView();
        h();
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f105025b;

        static {
            Covode.recordClassIndex(67340);
        }

        f(a aVar, Bundle bundle) {
            this.f105024a = aVar;
            this.f105025b = bundle;
        }

        public final void run() {
            this.f105024a.a((Boolean) null);
            this.f105024a.i();
            com.ss.android.ugc.aweme.ug.i.f141953a.storeLong("mandatory_login_shown_millis", System.currentTimeMillis());
            com.ss.android.ugc.aweme.login.c.a(this.f105024a, "cold_launch", "welcome_screen", this.f105025b, new com.ss.android.ugc.aweme.base.component.f(this) {
                /* class com.ss.android.ugc.aweme.journey.step.g.a.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f105026a;

                static {
                    Covode.recordClassIndex(67341);
                }

                @Override // com.ss.android.ugc.aweme.base.component.f
                public final void a() {
                }

                @Override // com.ss.android.ugc.aweme.base.component.f
                public final void b() {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f105026a = r1;
                }
            });
            a.C1369a.a(this.f105024a);
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f105020b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f105021c;

        static {
            Covode.recordClassIndex(67337);
        }

        e(a aVar, float f2, float f3) {
            this.f105019a = aVar;
            this.f105020b = f2;
            this.f105021c = f3;
        }

        public final void run() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f105019a.c(), "translationY", this.f105020b, ((float) (-this.f105019a.d().getHeight())) + this.f105020b + ((float) this.f105019a.c().getHeight()));
            View b2 = this.f105019a.b();
            float height = (float) this.f105019a.d().getHeight();
            float f2 = this.f105021c;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b2, "translationY", height - f2, -f2);
            l.b(ofFloat, "");
            ofFloat.setDuration(420L);
            l.b(ofFloat2, "");
            ofFloat2.setDuration(420L);
            ofFloat2.setStartDelay(100);
            ofFloat.addListener(new Animator.AnimatorListener(this) {
                /* class com.ss.android.ugc.aweme.journey.step.g.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f105022a;

                static {
                    Covode.recordClassIndex(67338);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f105022a = r1;
                }

                public final void onAnimationStart(Animator animator) {
                    this.f105022a.f105019a.c().setAlpha(1.0f);
                }
            });
            ofFloat2.addListener(new Animator.AnimatorListener(this) {
                /* class com.ss.android.ugc.aweme.journey.step.g.a.e.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f105023a;

                static {
                    Covode.recordClassIndex(67339);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f105023a = r1;
                }

                public final void onAnimationStart(Animator animator) {
                    this.f105023a.f105019a.b().setAlpha(1.0f);
                }

                public final void onAnimationEnd(Animator animator) {
                    Bundle arguments;
                    a aVar = this.f105023a.f105019a;
                    if (Build.VERSION.SDK_INT <= 28 && Build.VERSION.SDK_INT >= 21) {
                        new Handler(Looper.getMainLooper()).post(new e.a(aVar));
                    }
                    a aVar2 = this.f105023a.f105019a;
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    boolean z = false;
                    if (!g2.isLogin() && (arguments = aVar2.getArguments()) != null && arguments.getBoolean("extra_require_login", false)) {
                        z = true;
                    }
                    if (!z && !aVar2.f105014e.shouldShowForcedLogin()) {
                        aVar2.f105033l.postDelayed(new RunnableC2680a(aVar2), 1500);
                    } else if (aVar2.f105032k) {
                        aVar2.a(1500L);
                    } else {
                        aVar2.f105033l.postDelayed(new b(aVar2), 1500);
                        aVar2.f105033l.postDelayed(new c(aVar2), 2500);
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
        }
    }

    @r(b = true)
    public final void onComplianceSettingDoneEvent(com.ss.android.ugc.aweme.journey.b bVar) {
        l.d(bVar, "");
        this.f105032k = true;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.common.r.a("show_slogan_page", new HashMap());
    }

    public final void a(long j2) {
        Bundle loginActivityBundle = this.f105014e.getLoginActivityBundle();
        loginActivityBundle.putBoolean("is_from_new_user_journey", true);
        this.f105033l.postDelayed(new f(this, loginActivityBundle), j2);
    }

    /* access modifiers changed from: package-private */
    public final void a(Boolean bool) {
        String str;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("is_background", l.a(bool, true) ? 1 : 0).a("stay_time", System.currentTimeMillis() - this.f105031j);
        if (com.ss.android.ugc.aweme.base.ui.anchor.a.f68349a.e()) {
            str = "1";
        } else {
            str = "0";
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("if_send_fake_feed", str);
        Integer a4 = HybridABInfoService.b().a();
        if (a4 != null) {
            a3.a("is_ab_backend_resp_received", a4.intValue());
        }
        com.ss.android.ugc.aweme.common.r.a("exit_slogan_page", a3.f66730a);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.g.e, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        long j2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        boolean z = ((ComponentDependencies) ae.a(requireActivity(), (ad.b) null).a(ComponentDependencies.class)).f104922l;
        ImageView imageView = (ImageView) a(R.id.cj3);
        l.b(imageView, "");
        this.f105010a = imageView;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.e63);
        l.b(tuxTextView, "");
        this.f105011b = tuxTextView;
        FrameLayout frameLayout = (FrameLayout) a(R.id.e64);
        l.b(frameLayout, "");
        this.f105012c = frameLayout;
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.e_o);
        l.b(viewStub, "");
        this.f105013d = viewStub;
        ((TuxTextView) a(R.id.e63)).a(42.0f);
        float b2 = n.b(view.getContext(), 60.0f);
        float b3 = n.b(view.getContext(), 46.0f);
        if (z) {
            string = getString(R.string.dgl);
        } else if (com.ss.android.ugc.aweme.language.d.f()) {
            string = getString(R.string.dga);
        } else {
            string = getString(R.string.dg9);
        }
        l.b(string, "");
        if (z) {
            string2 = getString(R.string.dgm);
        } else if (com.ss.android.ugc.aweme.language.d.f()) {
            string2 = getString(R.string.dgb);
        } else {
            string2 = getString(R.string.dg_);
        }
        l.b(string2, "");
        TextView textView = this.f105011b;
        if (textView == null) {
            l.a("sloganView");
        }
        textView.setText(string + "\n" + string2);
        View view2 = this.f105010a;
        if (view2 == null) {
            l.a("logoView");
        }
        e eVar = new e(this, b2, b3);
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getInt("extra_optimize_option", 0) <= 0) {
            j2 = 1000;
        } else {
            j2 = 0;
        }
        view2.postDelayed(eVar, j2);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.abw, viewGroup, false);
    }
}
