package com.ss.android.ugc.aweme.journey.step.swipeup;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.feed.model.NewUserProgressModel;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.a;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import h.f.b.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.base.f.a {
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ObjectAnimator f105142a;

    /* renamed from: b  reason: collision with root package name */
    public long f105143b = System.currentTimeMillis();

    /* renamed from: c  reason: collision with root package name */
    public GestureDetector f105144c;

    /* renamed from: d  reason: collision with root package name */
    public float f105145d;

    /* renamed from: e  reason: collision with root package name */
    public float f105146e;

    /* renamed from: j  reason: collision with root package name */
    public View f105147j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f105148k;

    /* renamed from: l  reason: collision with root package name */
    public Context f105149l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f105150m;
    public f.a.b.b n;
    private SparseArray p;

    static {
        Covode.recordClassIndex(67412);
    }

    public final View a(int i2) {
        if (this.p == null) {
            this.p = new SparseArray();
        }
        View view = (View) this.p.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.p.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67413);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105159a;

        static {
            Covode.recordClassIndex(67420);
        }

        h(b bVar) {
            this.f105159a = bVar;
        }

        public final void run() {
            this.f105159a.a("auto");
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        if (!this.f105150m) {
            b("background");
        }
        super.onStop();
    }

    public static void a() {
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b());
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onDestroyView() {
        ObjectAnimator objectAnimator = this.f105142a;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f105142a;
            if (objectAnimator2 == null) {
                l.b();
            }
            objectAnimator2.cancel();
        }
        super.onDestroyView();
        SparseArray sparseArray = this.p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.n = t.a(t.b(com.ss.android.ugc.aweme.compliance.api.a.r()), com.bytedance.ies.ugc.appcontext.f.e(), c.f105154a).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new d(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.n = t.b(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new e(this));
        this.f105143b = System.currentTimeMillis();
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105162a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.b f105163b;

        static {
            Covode.recordClassIndex(67423);
        }

        k(b bVar, z.b bVar2) {
            this.f105162a = bVar;
            this.f105163b = bVar2;
        }

        public final void run() {
            if (this.f105162a.ab_()) {
                TextView textView = this.f105162a.f105148k;
                if (textView == null) {
                    l.a("startWatchingView");
                }
                int top = textView.getTop();
                View a2 = this.f105162a.a(R.id.bf1);
                l.b(a2, "");
                float bottom = ((float) (top - a2.getBottom())) - n.b(this.f105162a.getContext(), 24.0f);
                if (bottom < this.f105163b.element) {
                    View a3 = this.f105162a.a(R.id.ffp);
                    l.b(a3, "");
                    a3.getLayoutParams().height = (int) bottom;
                    View a4 = this.f105162a.a(R.id.ffp);
                    l.b(a4, "");
                    ViewGroup.LayoutParams layoutParams = a4.getLayoutParams();
                    View a5 = this.f105162a.a(R.id.ffp);
                    l.b(a5, "");
                    layoutParams.width = a5.getLayoutParams().height;
                    View a6 = this.f105162a.a(R.id.ffp);
                    l.b(a6, "");
                    View a7 = this.f105162a.a(R.id.ffp);
                    l.b(a7, "");
                    a6.setLayoutParams(a7.getLayoutParams());
                }
            }
        }
    }

    public static final class i extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105160a;

        static {
            Covode.recordClassIndex(67421);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(b bVar) {
            this.f105160a = bVar;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            l.d(motionEvent, "");
            l.d(motionEvent2, "");
            if (motionEvent2.getRawY() - motionEvent.getRawY() < 0.0f && Math.abs(motionEvent2.getRawY() - motionEvent.getRawY()) >= 25.0f && Math.abs(f3) >= 400.0f) {
                if (!this.f105160a.f105150m) {
                    this.f105160a.f105150m = true;
                    this.f105160a.b("slide_up");
                }
                b.a();
            }
            return true;
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105156a;

        static {
            Covode.recordClassIndex(67417);
        }

        e(b bVar) {
            this.f105156a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((ITpcConsentService) obj).i();
            f.a.b.b bVar = this.f105156a.n;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105157a;

        static {
            Covode.recordClassIndex(67418);
        }

        f(b bVar) {
            this.f105157a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f105157a.a("click");
        }
    }

    public static final /* synthetic */ View a(b bVar) {
        View view = bVar.f105147j;
        if (view == null) {
            l.a("viewRoot");
        }
        return view;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.a("welcomescreen_show", new HashMap());
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105155a;

        static {
            Covode.recordClassIndex(67416);
        }

        d(b bVar) {
            this.f105155a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            C2686b bVar = (C2686b) obj;
            if (bVar.f105151a && com.bytedance.ies.ugc.appcontext.f.f34637l) {
                bVar.f105152b.h();
            }
            f.a.b.b bVar2 = this.f105155a.n;
            if (bVar2 != null) {
                bVar2.dispose();
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105158a;

        static {
            Covode.recordClassIndex(67419);
        }

        g(b bVar) {
            this.f105158a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f105158a.f105150m = true;
            this.f105158a.b("click");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.journey.step.g.b());
        }
    }

    public final void a(String str) {
        if (ab_()) {
            TextView textView = this.f105148k;
            if (textView == null) {
                l.a("startWatchingView");
            }
            if (textView.getVisibility() != 0) {
                TextView textView2 = this.f105148k;
                if (textView2 == null) {
                    l.a("startWatchingView");
                }
                textView2.setAlpha(0.0f);
                TextView textView3 = this.f105148k;
                if (textView3 == null) {
                    l.a("startWatchingView");
                }
                textView3.setVisibility(0);
                r.a("start_watching_button_show", new com.ss.android.ugc.aweme.app.f.d().a("exit_method", str).a("duration", System.currentTimeMillis() - this.f105143b).f66730a);
                TextView textView4 = this.f105148k;
                if (textView4 == null) {
                    l.a("startWatchingView");
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView4, "alpha", 0.0f, 1.0f);
                this.f105142a = ofFloat;
                if (ofFloat == null) {
                    l.b();
                }
                ofFloat.setDuration(200L);
                ObjectAnimator objectAnimator = this.f105142a;
                if (objectAnimator == null) {
                    l.b();
                }
                objectAnimator.start();
            }
        }
    }

    public final void b(String str) {
        l.d(str, "");
        p a2 = p.a.a();
        try {
            com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("exit_method", str).a("duration", System.currentTimeMillis() - this.f105143b).a("if_send_fake_feed", a2.f104890g).a("debuginfo", a2.f104891h.toString());
            Integer a4 = HybridABInfoService.b().a();
            if (a4 != null) {
                a3.a("is_ab_backend_resp_received", a4.intValue());
            }
            r.a("exit_welcomescreen", a3.f66730a);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$b  reason: collision with other inner class name */
    public static final class C2686b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f105151a;

        /* renamed from: b  reason: collision with root package name */
        public final ITpcConsentService f105152b;

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<Activity> f105153c;

        static {
            Covode.recordClassIndex(67414);
        }

        public C2686b(ITpcConsentService iTpcConsentService, WeakReference<Activity> weakReference) {
            l.d(iTpcConsentService, "");
            l.d(weakReference, "");
            this.f105152b = iTpcConsentService;
            this.f105153c = weakReference;
            this.f105151a = iTpcConsentService.a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null);
        }
    }

    static final class c<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f105154a = new c();

        static {
            Covode.recordClassIndex(67415);
        }

        c() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            l.d(iTpcConsentService, "");
            l.d(obj2, "");
            return new C2686b(iTpcConsentService, new WeakReference(obj2));
        }
    }

    static final class j implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105161a;

        static {
            Covode.recordClassIndex(67422);
        }

        j(b bVar) {
            this.f105161a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f105161a.f105145d = motionEvent.getRawY();
            } else if (action != 1) {
                if (action == 2) {
                    this.f105161a.f105146e = ((float) ((int) motionEvent.getRawY())) - this.f105161a.f105145d;
                    if (this.f105161a.f105146e < 0.0f) {
                        b.a(this.f105161a).setTranslationY(this.f105161a.f105146e);
                    }
                }
            } else if (Math.abs(b.a(this.f105161a).getTranslationY()) >= ((float) (b.a(this.f105161a).getMeasuredHeight() / 3))) {
                if (!this.f105161a.f105150m) {
                    this.f105161a.b("slide_up");
                    this.f105161a.f105150m = true;
                }
                b.a();
            } else {
                b bVar = this.f105161a;
                View view2 = bVar.f105147j;
                if (view2 == null) {
                    l.a("viewRoot");
                }
                view2.clearAnimation();
                View view3 = bVar.f105147j;
                if (view3 == null) {
                    l.a("viewRoot");
                }
                ObjectAnimator.ofFloat(view3, View.TRANSLATION_Y, 0.0f).start();
            }
            GestureDetector gestureDetector = this.f105161a.f105144c;
            if (gestureDetector == null) {
                l.a("mGestureDetector");
            }
            gestureDetector.onTouchEvent(motionEvent);
            return false;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        float f2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (com.ss.android.ugc.aweme.compliance.api.a.r().a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null)) {
            ITpcConsentService r = com.ss.android.ugc.aweme.compliance.api.a.r();
            androidx.fragment.app.e activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            r.a(activity, "swipe_up");
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.e_4);
        l.b(tuxTextView, "");
        this.f105148k = tuxTextView;
        Context context = this.f105149l;
        if (context == null) {
            context = getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("backend_response_received", com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.contains("response_caching_complete") ? 1 : 0);
        NewUserProgressModel.SwipeUpText swipeUpText = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94986g;
        if (swipeUpText != null) {
            str = swipeUpText.getTitle();
        } else {
            str = null;
        }
        r.a("show_welcome_new_guidance", a2.a("new_copy_shown", hk.a(str) ? 1 : 0).f66730a);
        ((TuxTextView) a(R.id.title)).a(38.0f);
        String c2 = a.C2284a.c();
        boolean z2 = true;
        if (c2 == null || h.m.p.a((CharSequence) c2)) {
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.title);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(context.getString(R.string.dg8));
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.title);
            l.b(tuxTextView3, "");
            tuxTextView3.setText(a.C2284a.c());
        }
        String d2 = a.C2284a.d();
        if (d2 == null || h.m.p.a((CharSequence) d2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView4 = (TuxTextView) a(R.id.dwk);
            l.b(tuxTextView4, "");
            tuxTextView4.setText(context.getString(R.string.gb2));
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) a(R.id.dwk);
            l.b(tuxTextView5, "");
            tuxTextView5.setText(a.C2284a.d());
        }
        TextView textView = this.f105148k;
        if (textView == null) {
            l.a("startWatchingView");
        }
        textView.setText(context.getString(R.string.det));
        TextView textView2 = this.f105148k;
        if (textView2 == null) {
            l.a("startWatchingView");
        }
        com.bytedance.ies.dmt.ui.f.c.a(textView2, 0.75f);
        TuxTextView tuxTextView6 = (TuxTextView) a(R.id.title);
        l.b(tuxTextView6, "");
        com.ss.android.ugc.aweme.journey.a.a.a(tuxTextView6);
        TuxTextView tuxTextView7 = (TuxTextView) a(R.id.dwk);
        l.b(tuxTextView7, "");
        com.ss.android.ugc.aweme.journey.a.a.a(tuxTextView7);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.dqe);
        l.b(constraintLayout, "");
        ViewParent parent = constraintLayout.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        this.f105147j = (View) parent;
        ((ConstraintLayout) a(R.id.dqe)).setOnClickListener(new f(this));
        TextView textView3 = this.f105148k;
        if (textView3 == null) {
            l.a("startWatchingView");
        }
        textView3.setOnClickListener(new g(this));
        ((ConstraintLayout) a(R.id.dqe)).postDelayed(new h(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.dqe);
        l.b(constraintLayout2, "");
        this.f105144c = new GestureDetector(constraintLayout2.getContext(), new i(this));
        if (((ComponentDependencies) ae.a(requireActivity(), (ad.b) null).a(ComponentDependencies.class)).f104911a) {
            ((ConstraintLayout) a(R.id.dqe)).setOnTouchListener(new j(this));
        }
        com.ss.android.ugc.aweme.arch.widgets.base.e.a(this, a(R.id.ffp)).a(a(R.id.ffp), new WelcomeVideoWidget("welcome_screen_video4.mp4", 2131235007, (byte) 0));
        int a3 = n.a(getContext());
        float f3 = (float) a3;
        if ((((float) n.b(getContext())) * 1.0f) / f3 >= 1.7777778f) {
            z2 = false;
        }
        Context context2 = getContext();
        if (z2) {
            f2 = 300.0f;
        } else {
            f2 = 376.0f;
        }
        float b2 = n.b(context2, f2);
        z.b bVar = new z.b();
        bVar.element = b2;
        if (f3 < b2) {
            bVar.element = f3;
            View a4 = a(R.id.ffp);
            l.b(a4, "");
            a4.getLayoutParams().height = a3;
            View a5 = a(R.id.ffp);
            l.b(a5, "");
            ViewGroup.LayoutParams layoutParams = a5.getLayoutParams();
            View a6 = a(R.id.ffp);
            l.b(a6, "");
            layoutParams.width = a6.getLayoutParams().height;
        } else if (z2) {
            View a7 = a(R.id.ffp);
            l.b(a7, "");
            a7.getLayoutParams().height = (int) b2;
            View a8 = a(R.id.ffp);
            l.b(a8, "");
            ViewGroup.LayoutParams layoutParams2 = a8.getLayoutParams();
            View a9 = a(R.id.ffp);
            l.b(a9, "");
            layoutParams2.width = a9.getLayoutParams().height;
        }
        a(R.id.ffp).post(new k(this, bVar));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.abj, viewGroup, false);
    }
}
