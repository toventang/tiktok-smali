package com.ss.android.ugc.aweme.shortvideo.duet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ab;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ac;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ai;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.da.e;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.ss.android.ugc.aweme.shortvideo.duet.f;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRelativeLayout;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class q extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {
    public static final b F = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f126587a = {new y(q.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(q.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(q.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0)};
    public boolean A;
    public final com.ss.android.ugc.asve.recorder.effect.a B;
    public boolean C;
    public final Runnable D;
    public final h.f.a.b<com.bytedance.creativex.recorder.gesture.api.d, z> E;
    private View G;
    private AVDmtPanelRelativeLayout H;
    private AVDmtPanelRecycleView I;
    private View J;
    private View K;
    private View L;
    private View M;
    private View N;
    private final h.h O;
    private com.ss.android.ugc.aweme.effectplatform.f P;
    private final h.h.d Q;
    private final h.h.d R;
    private final h.h.d S;
    private final com.bytedance.o.f T;
    private final LiveData<com.bytedance.creativex.recorder.sticker.b.a> U;

    /* renamed from: b  reason: collision with root package name */
    public int f126588b;

    /* renamed from: c  reason: collision with root package name */
    public int f126589c = 1;

    /* renamed from: d  reason: collision with root package name */
    public RelativeLayout f126590d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f126591e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f126592f;

    /* renamed from: g  reason: collision with root package name */
    DmtStatusView f126593g;

    /* renamed from: h  reason: collision with root package name */
    public View f126594h;

    /* renamed from: i  reason: collision with root package name */
    public View f126595i;

    /* renamed from: j  reason: collision with root package name */
    public StyleTextView f126596j;

    /* renamed from: k  reason: collision with root package name */
    public final SafeHandler f126597k = new SafeHandler(this);

    /* renamed from: l  reason: collision with root package name */
    m f126598l;
    c t;
    public f u;
    final com.bytedance.scene.navigation.h v;
    public final h.f.a.m<Float, Float, z> w;
    public final h.f.a.a<z> x;
    public boolean y;
    float z;

    static {
        Covode.recordClassIndex(83023);
    }

    public final DuetLayoutModeViewModel a() {
        return (DuetLayoutModeViewModel) this.O.getValue();
    }

    public final com.bytedance.creativex.recorder.b.a.d b() {
        return (com.bytedance.creativex.recorder.b.a.d) this.Q.a(this, f126587a[0]);
    }

    /* access modifiers changed from: package-private */
    public final ShortVideoContext d() {
        return (ShortVideoContext) this.R.a(this, f126587a[1]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(83025);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.T;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class v implements com.bytedance.scene.navigation.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126612a;

        static {
            Covode.recordClassIndex(83046);
        }

        v(q qVar) {
            this.f126612a = qVar;
        }

        @Override // com.bytedance.scene.navigation.h
        public final boolean a() {
            this.f126612a.D();
            return true;
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126599a;

        static {
            Covode.recordClassIndex(83027);
        }

        d(q qVar) {
            this.f126599a = qVar;
        }

        public final void run() {
            q.b(this.f126599a).setEnabled(false);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(83026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(q qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            q qVar = this.this$0;
            qVar.B.a(0, 0.5f, 0.0f, 0);
            qVar.B.a(0.5f, 0.0f, 0.0f, 0.0f, 1.0f);
            return z.f158842a;
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126600a;

        static {
            Covode.recordClassIndex(83028);
        }

        e(q qVar) {
            this.f126600a = qVar;
        }

        public final void run() {
            q.b(this.f126600a).setRotation(0.0f);
            q.b(this.f126600a).setEnabled(true);
        }
    }

    static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126608a;

        static {
            Covode.recordClassIndex(83042);
        }

        s(q qVar) {
            this.f126608a = qVar;
        }

        public final void run() {
            Animation a2 = com.ss.android.ugc.aweme.sticker.p.a.a(1.0f, 0.0f, 300);
            a2.setAnimationListener(new Animation.AnimationListener(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.duet.q.s.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ s f126609a;

                static {
                    Covode.recordClassIndex(83043);
                }

                public final void onAnimationRepeat(Animation animation) {
                    h.f.b.l.d(animation, "");
                }

                public final void onAnimationStart(Animation animation) {
                    h.f.b.l.d(animation, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f126609a = r1;
                }

                public final void onAnimationEnd(Animation animation) {
                    h.f.b.l.d(animation, "");
                    q.f(this.f126609a.f126608a).setVisibility(4);
                }
            });
            q.f(this.f126608a).startAnimation(a2);
        }
    }

    public static final class t extends e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126610a;

        static {
            Covode.recordClassIndex(83044);
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void a() {
            this.f126610a.b().a(new ac(false, false, 6));
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void d() {
            this.f126610a.b().a(new ac(true, false, 6));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(q qVar) {
            this.f126610a = qVar;
        }
    }

    public final void D() {
        f fVar = this.u;
        if (fVar != null) {
            fVar.a();
        }
        a().a(false);
        com.bytedance.scene.ktx.b.b(this).a(this.v);
    }

    public final void C() {
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        DuetLayoutListViewModel duetLayoutListViewModel = (DuetLayoutListViewModel) androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(DuetLayoutListViewModel.class);
        com.ss.android.ugc.aweme.effectplatform.f fVar = this.P;
        if (fVar == null) {
            h.f.b.l.a("effectPlatform");
        }
        androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<EffectChannelResponse>> a2 = duetLayoutListViewModel.a(fVar, "duet-layout");
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        a2.observe((androidx.fragment.app.e) activity2, new r(this));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<DuetLayoutModeViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(83024);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.duet.q.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class k implements androidx.lifecycle.u<com.bytedance.creativex.recorder.sticker.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126605a;

        static {
            Covode.recordClassIndex(83034);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(q qVar) {
            this.f126605a = qVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.bytedance.creativex.recorder.sticker.b.a aVar) {
            com.bytedance.creativex.recorder.sticker.b.a aVar2 = aVar;
            if (aVar2 != null && aVar2.f28381a == 20 && aVar2.f28382b == 16176) {
                this.f126605a.f126589c = aVar2.f28383c;
                DuetLayoutModeViewModel a2 = this.f126605a.a();
                int i2 = 2;
                if (aVar2.f28383c == 2) {
                    i2 = 1;
                }
                a2.c(new DuetLayoutModeViewModel.b(i2));
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126601a;

        static {
            Covode.recordClassIndex(83029);
        }

        f(q qVar) {
            this.f126601a = qVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f126601a.C();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126603a;

        static {
            Covode.recordClassIndex(83032);
        }

        i(q qVar) {
            this.f126603a = qVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f126603a.D();
        }
    }

    public static final class w implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Effect f126613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f126614b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f126615c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f126616d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DuetContext f126617e;

        static {
            Covode.recordClassIndex(83047);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            this.f126615c.a(this.f126613a, this.f126617e, this.f126614b);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            h.f.b.l.d(exceptionResult, "");
            if (effect != null) {
                l.c(effect);
            }
        }

        w(Effect effect, int i2, q qVar, List list, DuetContext duetContext) {
            this.f126613a = effect;
            this.f126614b = i2;
            this.f126615c = qVar;
            this.f126616d = list;
            this.f126617e = duetContext;
        }
    }

    public static final /* synthetic */ View a(q qVar) {
        View view = qVar.f126595i;
        if (view == null) {
            h.f.b.l.a("cameraLayout");
        }
        return view;
    }

    public static final /* synthetic */ View b(q qVar) {
        View view = qVar.f126594h;
        if (view == null) {
            h.f.b.l.a("ivCamera");
        }
        return view;
    }

    public static final /* synthetic */ ImageView c(q qVar) {
        ImageView imageView = qVar.f126591e;
        if (imageView == null) {
            h.f.b.l.a("mSwitchIcon");
        }
        return imageView;
    }

    public static final /* synthetic */ TextView d(q qVar) {
        TextView textView = qVar.f126592f;
        if (textView == null) {
            h.f.b.l.a("mSwitchText");
        }
        return textView;
    }

    public static final /* synthetic */ RelativeLayout e(q qVar) {
        RelativeLayout relativeLayout = qVar.f126590d;
        if (relativeLayout == null) {
            h.f.b.l.a("mSwitchContainer");
        }
        return relativeLayout;
    }

    public static final /* synthetic */ StyleTextView f(q qVar) {
        StyleTextView styleTextView = qVar.f126596j;
        if (styleTextView == null) {
            h.f.b.l.a("stickerPromptView");
        }
        return styleTextView;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126606a;

        static {
            Covode.recordClassIndex(83036);
        }

        m(q qVar) {
            this.f126606a = qVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = q.a(this.f126606a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            float b2 = com.bytedance.common.utility.n.b(this.f126606a.f42913m, 32.0f);
            Activity activity = this.f126606a.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            marginLayoutParams.topMargin = (int) (b2 + ((float) dh.c(activity)));
            q.a(this.f126606a).setLayoutParams(marginLayoutParams);
        }
    }

    static final class u<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126611a;

        static {
            Covode.recordClassIndex(83045);
        }

        u(q qVar) {
            this.f126611a = qVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            float f2;
            Boolean bool = (Boolean) obj;
            q qVar = this.f126611a;
            h.f.b.l.b(bool, "");
            qVar.A = bool.booleanValue();
            View a2 = q.a(this.f126611a);
            if (this.f126611a.A) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            a2.setAlpha(f2);
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126602a;

        static {
            Covode.recordClassIndex(83031);
        }

        h(q qVar) {
            this.f126602a = qVar;
        }

        public final void onClick(View view) {
            int i2;
            T t;
            ClickAgent.onClick(view);
            q qVar = this.f126602a;
            Activity activity = qVar.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            Activity activity2 = this.f126602a.f42913m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            com.bytedance.jedi.arch.d<Integer> layoutDirection = ((ChangeDuetLayoutState) ((BaseJediViewModel) com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(ChangeDuetLayoutViewModel.class)).a((androidx.fragment.app.e) activity2)).getLayoutDirection();
            int i3 = 0;
            if (layoutDirection == null || (t = layoutDirection.f39404b) == null) {
                i2 = 0;
            } else {
                i2 = t.intValue();
            }
            qVar.f126588b = i2;
            q qVar2 = this.f126602a;
            if (qVar2.f126588b != 1) {
                i3 = 1;
            }
            qVar2.f126588b = i3;
            Activity activity3 = this.f126602a.f42913m;
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ((ChangeDuetLayoutViewModel) com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity3).a(ChangeDuetLayoutViewModel.class)).a(this.f126602a.f126588b);
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126604a;

        static {
            Covode.recordClassIndex(83033);
        }

        j(q qVar) {
            this.f126604a = qVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f126604a.A) {
                q qVar = this.f126604a;
                PrivacyCert privacyCert = new PrivacyCert(new com.bytedance.bpea.basics.j("1039"), "Open the camera on the shooting page to preview and shoot the video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.a()});
                View view2 = qVar.f126594h;
                if (view2 == null) {
                    h.f.b.l.a("ivCamera");
                }
                view2.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new d(qVar)).withEndAction(new e(qVar)).start();
                int unused = qVar.b().a(false, privacyCert, (String) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f126607a;

        static {
            Covode.recordClassIndex(83041);
        }

        r(q qVar) {
            this.f126607a = qVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            ArrayList arrayList;
            com.ss.android.ugc.aweme.bw.b.a aVar = (com.ss.android.ugc.aweme.bw.b.a) obj;
            q qVar = this.f126607a;
            if (aVar != null) {
                if (aVar.f69569b == a.EnumC1574a.LOADING) {
                    DmtStatusView dmtStatusView = qVar.f126593g;
                    if (dmtStatusView == null) {
                        h.f.b.l.a("statusView");
                    }
                    dmtStatusView.f();
                } else if (aVar.f69569b == a.EnumC1574a.ERROR) {
                    DmtStatusView dmtStatusView2 = qVar.f126593g;
                    if (dmtStatusView2 == null) {
                        h.f.b.l.a("statusView");
                    }
                    dmtStatusView2.h();
                } else if (aVar.f69569b == a.EnumC1574a.SUCCESS) {
                    M m2 = aVar.f69568a;
                    if (m2 == null || com.bytedance.common.utility.h.a(m2.getAllCategoryEffects())) {
                        DmtStatusView dmtStatusView3 = qVar.f126593g;
                        if (dmtStatusView3 == null) {
                            h.f.b.l.a("statusView");
                        }
                        dmtStatusView3.g();
                        return;
                    }
                    DmtStatusView dmtStatusView4 = qVar.f126593g;
                    if (dmtStatusView4 == null) {
                        h.f.b.l.a("statusView");
                    }
                    dmtStatusView4.d();
                    m mVar = qVar.f126598l;
                    if (mVar != null) {
                        List<Effect> allCategoryEffects = m2.getAllCategoryEffects();
                        Effect effect = qVar.d().f124757b.o.q;
                        h.f.b.l.d(allCategoryEffects, "");
                        if (com.bytedance.common.utility.collection.b.a((Collection) allCategoryEffects)) {
                            arrayList = new ArrayList();
                        } else {
                            arrayList = new ArrayList();
                            if (allCategoryEffects == null) {
                                h.f.b.l.b();
                            }
                            for (Effect effect2 : allCategoryEffects) {
                                arrayList.add(new StickerWrapper(effect2, ""));
                            }
                        }
                        mVar.f126564a = arrayList;
                        if (effect != null) {
                            Iterator<? extends StickerWrapper> it = mVar.f126564a.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (!h.f.b.l.a((Object) ((StickerWrapper) it.next()).f134687a.getEffect_id(), (Object) effect.getEffect_id())) {
                                    i2++;
                                } else if (i2 >= 0) {
                                    mVar.a(i2, false);
                                }
                            }
                        }
                    }
                    m mVar2 = qVar.f126598l;
                    if (mVar2 != null) {
                        mVar2.notifyDataSetChanged();
                    }
                    qVar.a(m2.getAllCategoryEffects());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<? extends Effect> list) {
        T t2;
        if (d().O) {
            DuetContext duetContext = d().f124757b.o;
            h.f.b.l.b(duetContext, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (h.f.b.l.a((Object) l.c(t2), (Object) duetContext.o)) {
                    break;
                }
            }
            T t3 = t2;
            if (t3 != null) {
                int b2 = h.j.h.b(list.indexOf(t3), 0);
                com.ss.android.ugc.aweme.effectplatform.f fVar = this.P;
                if (fVar == null) {
                    h.f.b.l.a("effectPlatform");
                }
                if (fVar.c(t3)) {
                    a(t3, duetContext, b2);
                    return;
                }
                com.ss.android.ugc.aweme.effectplatform.f fVar2 = this.P;
                if (fVar2 == null) {
                    h.f.b.l.a("effectPlatform");
                }
                fVar2.b(t3, new w(t3, b2, this, list, duetContext));
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View view = this.G;
        if (view == null) {
            h.f.b.l.a("rootView");
        }
        View findViewById = view.findViewById(R.id.aqh);
        h.f.b.l.b(findViewById, "");
        this.f126590d = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.aqi);
        h.f.b.l.b(findViewById2, "");
        this.f126591e = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.aqj);
        h.f.b.l.b(findViewById3, "");
        this.f126592f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.aqc);
        h.f.b.l.b(findViewById4, "");
        this.H = (AVDmtPanelRelativeLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.aqf);
        h.f.b.l.b(findViewById5, "");
        this.I = (AVDmtPanelRecycleView) findViewById5;
        View findViewById6 = view.findViewById(R.id.aqg);
        h.f.b.l.b(findViewById6, "");
        this.J = findViewById6;
        View findViewById7 = view.findViewById(R.id.aqd);
        h.f.b.l.b(findViewById7, "");
        this.K = findViewById7;
        View findViewById8 = view.findViewById(R.id.aqe);
        h.f.b.l.b(findViewById8, "");
        this.f126593g = (DmtStatusView) findViewById8;
        LayoutInflater from = LayoutInflater.from(this.f42913m);
        View view2 = this.G;
        if (view2 == null) {
            h.f.b.l.a("rootView");
        }
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        View a2 = com.a.a(from, R.layout.eb, (ViewGroup) view2, false);
        h.f.b.l.b(a2, "");
        this.L = a2;
        if (a2 == null) {
            h.f.b.l.a("errorView");
        }
        View findViewById9 = a2.findViewById(R.id.axq);
        h.f.b.l.b(findViewById9, "");
        this.M = findViewById9;
        if (findViewById9 == null) {
            h.f.b.l.a("retryView");
        }
        findViewById9.setOnClickListener(new f(this));
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(ChangeDuetLayoutViewModel.class);
        h.f.b.l.b(a3, "");
        selectNonNullSubscribe(a3, r.f126618a, new ah(), new g(this));
        RelativeLayout relativeLayout = this.f126590d;
        if (relativeLayout == null) {
            h.f.b.l.a("mSwitchContainer");
        }
        relativeLayout.setOnClickListener(new h(this));
        View view3 = this.J;
        if (view3 == null) {
            h.f.b.l.a("mOutsideView");
        }
        view3.setOnClickListener(new i(this));
        DmtStatusView dmtStatusView = this.f126593g;
        if (dmtStatusView == null) {
            h.f.b.l.a("statusView");
        }
        DmtStatusView.a a4 = DmtStatusView.a.a(q());
        View view4 = this.L;
        if (view4 == null) {
            h.f.b.l.a("errorView");
        }
        DmtStatusView.a b2 = a4.c(view4).b();
        b2.f33605g = 1;
        dmtStatusView.setBuilder(b2);
        View view5 = this.f126595i;
        if (view5 == null) {
            h.f.b.l.a("cameraLayout");
        }
        view5.setVisibility(0);
        View view6 = this.f126595i;
        if (view6 == null) {
            h.f.b.l.a("cameraLayout");
        }
        View findViewById10 = view6.findViewById(R.id.by0);
        h.f.b.l.b(findViewById10, "");
        this.f126594h = findViewById10;
        if (av.a()) {
            View view7 = this.f126594h;
            if (view7 == null) {
                h.f.b.l.a("ivCamera");
            }
            Objects.requireNonNull(view7, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view7).setImageResource(2131232566);
        } else {
            View view8 = this.f126594h;
            if (view8 == null) {
                h.f.b.l.a("ivCamera");
            }
            Objects.requireNonNull(view8, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view8).setImageResource(2131232565);
        }
        View view9 = this.f126595i;
        if (view9 == null) {
            h.f.b.l.a("cameraLayout");
        }
        View findViewById11 = view9.findViewById(R.id.f0e);
        h.f.b.l.b(findViewById11, "");
        this.N = findViewById11;
        View view10 = this.f126595i;
        if (view10 == null) {
            h.f.b.l.a("cameraLayout");
        }
        view10.setOnClickListener(new j(this));
        LiveData<com.bytedance.creativex.recorder.sticker.b.a> liveData = this.U;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        liveData.observe((androidx.fragment.app.e) activity2, new k(this));
        selectNonNullSubscribe(a(), t.f126620a, ai.a(), new n(this));
        selectNonNullSubscribe(a(), u.f126621a, ai.a(), new o(this));
        selectNonNullSubscribe(a(), v.f126622a, ai.a(), new p(this));
        selectNonNullSubscribe(a(), w.f126623a, ai.a(), new C3289q(this));
        selectNonNullSubscribe(a(), s.f126619a, ai.a(), new l(this));
        ((com.ss.android.ugc.aweme.shortvideo.h.a) this.S.a(this, f126587a[2])).d().a(this, new m(this));
        View view11 = this.G;
        if (view11 == null) {
            h.f.b.l.a("rootView");
        }
        View view12 = this.f126595i;
        if (view12 == null) {
            h.f.b.l.a("cameraLayout");
        }
        c cVar = new c(view11, view12);
        this.t = cVar;
        cVar.f126501a = new t(this);
        b().o().a(this, new u(this));
        Activity activity3 = this.f42913m;
        if (activity3 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity3, "");
        this.P = com.ss.android.ugc.aweme.effectplatform.c.a(activity3, null);
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) activity4;
        ShortVideoContext d2 = d();
        com.ss.android.ugc.aweme.effectplatform.f fVar = this.P;
        if (fVar == null) {
            h.f.b.l.a("effectPlatform");
        }
        this.f126598l = new m(dVar, d2, fVar, a());
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.I;
        if (aVDmtPanelRecycleView == null) {
            h.f.b.l.a("mModeRecyclerView");
        }
        aVDmtPanelRecycleView.setAdapter(this.f126598l);
        AVDmtPanelRecycleView aVDmtPanelRecycleView2 = this.I;
        if (aVDmtPanelRecycleView2 == null) {
            h.f.b.l.a("mModeRecyclerView");
        }
        aVDmtPanelRecycleView2.setLayoutManager(new LinearLayoutManager(0, false));
        C();
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.d<? extends Integer>, z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(83030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(q qVar) {
            super(2);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.d<? extends Integer> dVar) {
            com.bytedance.jedi.arch.d<? extends Integer> dVar2 = dVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(dVar2, "");
            this.this$0.f126588b = dVar2.f39404b.intValue();
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(83035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(q qVar) {
            super(2);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            num.intValue();
            h.f.b.l.d(bVar, "");
            f fVar = this.this$0.u;
            if (fVar != null) {
                fVar.a();
            }
            this.this$0.y = true;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.e5, viewGroup, false);
        View findViewById = a2.findViewById(R.id.aql);
        h.f.b.l.b(findViewById, "");
        this.G = findViewById;
        View findViewById2 = a2.findViewById(R.id.bus);
        h.f.b.l.b(findViewById2, "");
        this.f126595i = findViewById2;
        View findViewById3 = a2.findViewById(R.id.ebc);
        h.f.b.l.b(findViewById3, "");
        this.f126596j = (StyleTextView) findViewById3;
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(83039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(q qVar) {
            super(2);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(bVar, "");
            if (intValue == 0) {
                this.this$0.E.invoke(new d.a());
            } else if (intValue == 1) {
                h.f.a.b<com.bytedance.creativex.recorder.gesture.api.d, z> bVar2 = this.this$0.E;
                com.ss.android.ugc.asve.recorder.effect.a aVar = this.this$0.B;
                ViewGroup.LayoutParams layoutParams = this.this$0.b().G().getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                bVar2.invoke(new i(aVar, new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams)));
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$q  reason: collision with other inner class name */
    static final class C3289q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, String, z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(83040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3289q(q qVar) {
            super(2);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, String str) {
            String str2 = str;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(str2, "");
            q.f(this.this$0).setText(str2);
            this.this$0.f126597k.removeCallbacks(this.this$0.D);
            if (TextUtils.isEmpty(str2)) {
                q.f(this.this$0).setVisibility(8);
            } else {
                q.f(this.this$0).setVisibility(0);
                this.this$0.f126597k.postDelayed(this.this$0.D, 5000);
            }
            return z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.m<Float, Float, z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(83048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(q qVar) {
            super(2);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Float f2, Float f3) {
            int i2;
            float floatValue = f2.floatValue();
            float floatValue2 = f3.floatValue();
            q qVar = this.this$0;
            if (qVar.f126589c == 0) {
                i2 = 1;
            } else {
                i2 = this.this$0.f126589c;
            }
            float f4 = floatValue2 / ((float) i2);
            int e2 = dh.e(qVar.f42913m);
            if (qVar.y) {
                qVar.z = f4;
                qVar.B.a(0, 0.5f, (-floatValue) / ((float) e2), 0);
                qVar.y = false;
            }
            float f5 = (float) e2;
            qVar.B.a(0.5f, ((-floatValue) + f4) / f5, 0.0f, (-(f4 - qVar.z)) / f5, 1.0f);
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(83037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(q qVar) {
            super(2);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(bVar, "");
            this.this$0.f126588b = 0;
            if (intValue == 1) {
                q.c(this.this$0).setImageDrawable(this.this$0.t().getResources().getDrawable(2131232274));
                q.d(this.this$0).setText(this.this$0.t().getResources().getString(R.string.beu));
                q.e(this.this$0).setVisibility(0);
            } else if (intValue != 2) {
                q.e(this.this$0).setVisibility(4);
            } else {
                q.c(this.this$0).setImageDrawable(this.this$0.t().getResources().getDrawable(2131232278));
                q.d(this.this$0).setText(this.this$0.t().getResources().getString(R.string.bev));
                q.e(this.this$0).setVisibility(0);
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ q this$0;

        static {
            Covode.recordClassIndex(83038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(q qVar) {
            super(2);
            this.this$0 = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(bVar, "");
            f.a aVar = f.a.NONE;
            if (intValue == 1) {
                aVar = f.a.UP_DOWN;
            } else if (intValue == 2) {
                aVar = f.a.THREE_SCREEN;
            }
            q qVar = this.this$0;
            View view = this.this$0.n;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
            qVar.u = new f((ViewGroup) view, aVar);
            f fVar = this.this$0.u;
            if (fVar != null) {
                h.f.a.m<Float, Float, z> mVar = this.this$0.w;
                h.f.a.a<z> aVar2 = this.this$0.x;
                fVar.f126525h = mVar;
                fVar.f126526i = aVar2;
            }
            f fVar2 = this.this$0.u;
            if (fVar2 != null) {
                int i2 = g.f126537a[fVar2.f126528k.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 && j.f126549a.b("duet_layout_three_screen_drag_gesture_hint")) {
                        fVar2.f126524g = (-fVar2.f126521d) / 3.0f;
                    }
                } else if (j.f126549a.b("duet_layout_up_down_drag_gesture_hint")) {
                    fVar2.f126524g = (-fVar2.f126521d) / 4.0f;
                }
                fVar2.f126518a.setTranslationY(fVar2.f126524g);
                fVar2.f126518a.c();
                fVar2.f126518a.a(fVar2);
                fVar2.f126518a.setAnimation("duet_layout_drag_lottie_mt.json");
                fVar2.f126518a.setRepeatCount(1);
                fVar2.f126518a.setRepeatMode(1);
                fVar2.f126518a.postDelayed(new f.RunnableC3288f(new f.h(fVar2)), fVar2.f126523f);
                Context context = fVar2.f126527j.getContext();
                h.f.b.l.b(context, "");
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, -context.getResources().getDimension(R.dimen.j8)).setDuration(fVar2.f126520c);
                duration.removeAllUpdateListeners();
                fVar2.f126519b = duration;
                ValueAnimator valueAnimator = fVar2.f126519b;
                if (valueAnimator != null) {
                    valueAnimator.addUpdateListener(new f.i(fVar2));
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public final void a(Effect effect, DuetContext duetContext, int i2) {
        if (effect != null && duetContext != null && this.f42913m != null) {
            m mVar = this.f126598l;
            if (mVar != null) {
                mVar.a(i2, false);
            }
            Activity activity = this.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(ChangeDuetLayoutViewModel.class);
            h.f.b.l.b(a2, "");
            ChangeDuetLayoutViewModel changeDuetLayoutViewModel = (ChangeDuetLayoutViewModel) a2;
            if (duetContext.p != 0) {
                changeDuetLayoutViewModel.a(duetContext.p);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super com.bytedance.creativex.recorder.gesture.api.d, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public q(com.bytedance.o.f fVar, LiveData<com.bytedance.creativex.recorder.sticker.b.a> liveData, h.f.a.b<? super com.bytedance.creativex.recorder.gesture.api.d, z> bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(liveData, "");
        h.f.b.l.d(bVar, "");
        this.T = fVar;
        this.U = liveData;
        this.E = bVar;
        h.k.c a2 = h.f.b.ab.a(DuetLayoutModeViewModel.class);
        this.O = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.v = new v(this);
        this.w = new x(this);
        this.x = new c(this);
        this.y = true;
        this.A = true;
        this.Q = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.R = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
        this.S = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);
        this.B = b().D().getEffectController();
        this.C = true;
        this.D = new s(this);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
