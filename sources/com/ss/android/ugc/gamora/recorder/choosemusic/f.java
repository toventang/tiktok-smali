package com.ss.android.ugc.gamora.recorder.choosemusic;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.ss.android.ugc.aweme.experiment.ch;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ao;
import com.ss.android.ugc.aweme.shortvideo.ci;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.Objects;

public final class f extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b {
    public static final a E = new a((byte) 0);
    public boolean A;
    public final b B;
    public final com.ss.android.ugc.aweme.sticker.presenter.o C;
    final ShortVideoContext D;
    private boolean F = true;
    private FrameLayout G;
    private ImageView H;
    private Space I;
    private final h.h J = h.i.a((h.f.a.a) e.f147589a);
    private final h.h K = h.i.a((h.f.a.a) new ae(this));
    private final com.bytedance.als.h<Boolean> L;

    /* renamed from: a  reason: collision with root package name */
    c f147569a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.tux.tooltip.a f147570b;

    /* renamed from: c  reason: collision with root package name */
    public ShortVideoContextViewModel f147571c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f147572d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f147573e;

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f147574f;

    /* renamed from: g  reason: collision with root package name */
    public FrameLayout f147575g;

    /* renamed from: h  reason: collision with root package name */
    boolean f147576h;

    /* renamed from: i  reason: collision with root package name */
    boolean f147577i;

    /* renamed from: j  reason: collision with root package name */
    public View f147578j;

    /* renamed from: k  reason: collision with root package name */
    public Animator f147579k;

    /* renamed from: l  reason: collision with root package name */
    public View f147580l;
    public boolean t;
    LinearLayout u;
    public TextView v;
    LinearLayout w;
    public CircleDraweeView x;
    public View y;
    public ImageView z;

    static {
        Covode.recordClassIndex(97243);
    }

    public final boolean a() {
        return ((Boolean) this.J.getValue()).booleanValue();
    }

    public final SafeHandler b() {
        return (SafeHandler) this.K.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97244);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class ae extends h.f.b.m implements h.f.a.a<SafeHandler> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(97249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.this$0);
        }
    }

    public final void D() {
        com.bytedance.tux.tooltip.a aVar = this.f147570b;
        if (aVar != null) {
            aVar.dismiss();
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
    public final com.bytedance.jedi.arch.ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    /* access modifiers changed from: package-private */
    public static final class ac implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147584a;

        static {
            Covode.recordClassIndex(97247);
        }

        ac(f fVar) {
            this.f147584a = fVar;
        }

        public final void run() {
            TextView textView = this.f147584a.v;
            if (textView != null) {
                textView.requestFocus();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ad implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147585a;

        static {
            Covode.recordClassIndex(97248);
        }

        ad(f fVar) {
            this.f147585a = fVar;
        }

        public final void run() {
            TextView c2 = f.c(this.f147585a);
            if (c2 != null) {
                c2.requestFocus();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147588a;

        static {
            Covode.recordClassIndex(97252);
        }

        d(f fVar) {
            this.f147588a = fVar;
        }

        public final void run() {
            f.c(this.f147588a).clearFocus();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f147589a = new e();

        static {
            Covode.recordClassIndex(97253);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(ch.a());
        }
    }

    static final class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147610a;

        static {
            Covode.recordClassIndex(97274);
        }

        y(f fVar) {
            this.f147610a = fVar;
        }

        public final void run() {
            TextView textView = this.f147610a.v;
            if (textView != null) {
                textView.requestFocus();
            }
        }
    }

    public final void F() {
        LinearLayout linearLayout = this.u;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final boolean d() {
        return com.ss.android.ugc.aweme.shortvideo.sticker.c.h(this.C.f());
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        Animator animator = this.f147579k;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aa implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147581a;

        static {
            Covode.recordClassIndex(97245);
        }

        aa(f fVar) {
            this.f147581a = fVar;
        }

        public final void run() {
            f.c(this.f147581a).requestFocus();
            f.c(this.f147581a).setSelected(true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147611a;

        static {
            Covode.recordClassIndex(97275);
        }

        z(f fVar) {
            this.f147611a = fVar;
        }

        public final void run() {
            TextView textView = this.f147611a.v;
            if (textView != null) {
                textView.requestFocus();
            }
            TextView textView2 = this.f147611a.v;
            if (textView2 != null) {
                textView2.setSelected(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void C() {
        if (this.f147569a == null) {
            Activity activity = this.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.f147569a = new ci((androidx.fragment.app.e) activity);
        }
    }

    static final class ab implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147582a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f147583b;

        static {
            Covode.recordClassIndex(97246);
        }

        ab(f fVar, z.e eVar) {
            this.f147582a = fVar;
            this.f147583b = eVar;
        }

        public final void run() {
            LinearLayout linearLayout;
            if (this.f147582a.f42913m != null) {
                Activity activity = this.f147582a.f42913m;
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, "");
                if (!activity.isFinishing() && this.f147583b.element != null) {
                    f fVar = this.f147582a;
                    T t = this.f147583b.element;
                    f fVar2 = this.f147582a;
                    TextView textView = fVar2.v;
                    if ((textView == null || (linearLayout = fVar2.u) == null || linearLayout.getVisibility() != 0 || textView.getVisibility() != 0) && (textView = fVar2.f147573e) == null) {
                        h.f.b.l.a("tvChooseMusic");
                    }
                    fVar.f147570b = t.b(textView).a(com.bytedance.tux.tooltip.h.BOTTOM).d();
                    com.bytedance.tux.tooltip.a aVar = this.f147582a.f147570b;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            }
        }
    }

    public final void E() {
        ImageView imageView = this.f147572d;
        if (imageView == null) {
            h.f.b.l.a("ivChooseMusic");
        }
        imageView.setVisibility(0);
        TextView textView = this.f147573e;
        if (textView == null) {
            h.f.b.l.a("tvChooseMusic");
        }
        textView.setVisibility(0);
        TextView textView2 = this.f147573e;
        if (textView2 == null) {
            h.f.b.l.a("tvChooseMusic");
        }
        textView2.setText(R.string.fvx);
        if (av.a()) {
            ImageView imageView2 = this.f147572d;
            if (imageView2 == null) {
                h.f.b.l.a("ivChooseMusic");
            }
            imageView2.setImageResource(2131232541);
        } else {
            ImageView imageView3 = this.f147572d;
            if (imageView3 == null) {
                h.f.b.l.a("ivChooseMusic");
            }
            imageView3.setImageResource(2131232355);
        }
        b().post(new d(this));
        b(false);
    }

    public static final class x implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147609a;

        static {
            Covode.recordClassIndex(97273);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        x(f fVar) {
            this.f147609a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ShortVideoContextViewModel shortVideoContextViewModel = this.f147609a.f147571c;
            if (shortVideoContextViewModel == null) {
                h.f.b.l.a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f124769a;
            com.ss.android.ugc.aweme.common.r.a("change_music_grey", new com.ss.android.ugc.tools.f.b().a("creation_id", shortVideoContext.q).a("shoot_way", shortVideoContext.r).f149193a);
        }
    }

    static final class t<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147605a;

        static {
            Covode.recordClassIndex(97269);
        }

        t(f fVar) {
            this.f147605a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            f fVar = this.f147605a;
            fVar.C();
            c cVar = fVar.f147569a;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    public static final class w extends com.ss.android.ugc.aweme.views.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147608a;

        static {
            Covode.recordClassIndex(97272);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(f fVar) {
            super(500, false, 2);
            this.f147608a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.views.k
        public final void a(View view) {
            String musicId;
            String str;
            String str2;
            h.f.b.l.d(view, "");
            f fVar = this.f147608a;
            AVExternalServiceImpl.a().provideAVPerformance().start(OpenMusicPanelPerformanceMonitor.f114756a, "start_choose_music");
            ShortVideoContextViewModel shortVideoContextViewModel = fVar.f147571c;
            if (shortVideoContextViewModel == null) {
                h.f.b.l.a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f124769a;
            ShortVideoContextViewModel shortVideoContextViewModel2 = fVar.f147571c;
            if (shortVideoContextViewModel2 == null) {
                h.f.b.l.a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext2 = shortVideoContextViewModel2.f124769a;
            h.f.b.l.b(shortVideoContext2, "");
            Mission a2 = com.ss.android.ugc.aweme.port.in.c.f115633l.a(shortVideoContext2.af.f124735c);
            if (!(a2 == null || (musicId = a2.getMusicId()) == null || musicId.length() == 0)) {
                Integer num = null;
                if (!a2.isMusicToasted()) {
                    com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                    if (cVar != null) {
                        str2 = cVar.getMid();
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.equals(str2, a2.getMusicId())) {
                        a2.setMusicToasted(true);
                        shortVideoContext2.af.f124735c = com.ss.android.ugc.aweme.port.in.c.f115633l.a(shortVideoContext2.af.f124735c, a2);
                    }
                }
                if (!a2.isMusicToasted()) {
                    com.ss.android.ugc.tools.view.widget.d.b(fVar.f42913m, R.string.d55).b();
                    com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("reason", 1).a("mission_id", a2.getMissionId()).a("page_source", a2.getEnterFrom());
                    com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
                    if (e2 != null) {
                        num = Integer.valueOf(e2.m());
                    }
                    com.ss.android.ugc.tools.f.b a4 = a3.a("creator_followers", num);
                    if (com.ss.android.ugc.aweme.port.in.l.f115658a.z().j()) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    com.ss.android.ugc.aweme.common.r.a("mission_requirement_toast", a4.a("creator_type", str).f149193a);
                }
            }
            if (!com.ss.android.ugc.aweme.df.l.a(view, 1200)) {
                h.f.b.l.b(shortVideoContext, "");
                if (!shortVideoContext.c()) {
                    fVar.B.n.a(h.z.f158842a);
                }
            }
        }
    }

    public static final /* synthetic */ FrameLayout a(f fVar) {
        FrameLayout frameLayout = fVar.f147575g;
        if (frameLayout == null) {
            h.f.b.l.a("musicRootContainer");
        }
        return frameLayout;
    }

    public static final /* synthetic */ ImageView b(f fVar) {
        ImageView imageView = fVar.f147572d;
        if (imageView == null) {
            h.f.b.l.a("ivChooseMusic");
        }
        return imageView;
    }

    public static final /* synthetic */ TextView c(f fVar) {
        TextView textView = fVar.f147573e;
        if (textView == null) {
            h.f.b.l.a("tvChooseMusic");
        }
        return textView;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147594a;

        static {
            Covode.recordClassIndex(97258);
        }

        j(f fVar) {
            this.f147594a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            f fVar = this.f147594a;
            h.f.b.l.b(bool, "");
            fVar.b(bool.booleanValue());
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147597a;

        static {
            Covode.recordClassIndex(97261);
        }

        m(f fVar) {
            this.f147597a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147597a.B.p.a(Boolean.valueOf(!this.f147597a.A));
        }
    }

    static final class v<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147607a;

        static {
            Covode.recordClassIndex(97271);
        }

        v(f fVar) {
            this.f147607a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            f fVar = this.f147607a;
            h.f.b.l.b(bool, "");
            fVar.a(bool.booleanValue());
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147592a;

        static {
            Covode.recordClassIndex(97256);
        }

        h(f fVar) {
            this.f147592a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            f.c(this.f147592a).setMaxWidth((int) com.bytedance.common.utility.n.b(this.f147592a.r(), 104.0f));
            f fVar = this.f147592a;
            h.f.b.l.b(bool, "");
            fVar.c(bool.booleanValue());
            this.f147592a.t = bool.booleanValue();
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147593a;

        static {
            Covode.recordClassIndex(97257);
        }

        i(f fVar) {
            this.f147593a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                this.f147593a.A = true;
                i2 = 2131230856;
            } else {
                this.f147593a.A = false;
                i2 = 2131230857;
            }
            ImageView imageView = this.f147593a.z;
            if (imageView != null) {
                imageView.setImageResource(i2);
            }
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147595a;

        static {
            Covode.recordClassIndex(97259);
        }

        k(f fVar) {
            this.f147595a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147595a.B.f147539i.a(h.z.f158842a);
            this.f147595a.c(false);
            f.c(this.f147595a).setMaxWidth((int) com.bytedance.common.utility.n.b(this.f147595a.r(), 140.0f));
            this.f147595a.t = false;
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147596a;

        static {
            Covode.recordClassIndex(97260);
        }

        l(f fVar) {
            this.f147596a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147596a.E();
            this.f147596a.B.f147539i.a(h.z.f158842a);
            this.f147596a.c(false);
            f.c(this.f147596a).setMaxWidth((int) com.bytedance.common.utility.n.b(this.f147596a.r(), 140.0f));
            this.f147596a.t = false;
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147599a;

        static {
            Covode.recordClassIndex(97263);
        }

        o(f fVar) {
            this.f147599a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = f.a(this.f147599a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f147599a.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            marginLayoutParams.topMargin = dh.c(activity) + en.a(7.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
            f.a(this.f147599a).setLayoutParams(marginLayoutParams);
        }
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147600a;

        static {
            Covode.recordClassIndex(97264);
        }

        p(f fVar) {
            this.f147600a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            f fVar = this.f147600a;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                w wVar = new w(fVar);
                RelativeLayout relativeLayout = fVar.f147574f;
                if (relativeLayout == null) {
                    h.f.b.l.a("chooseMusicContainer");
                }
                relativeLayout.setOnClickListener(wVar);
                LinearLayout linearLayout = fVar.w;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(wVar);
                    return;
                }
                return;
            }
            x xVar = new x(fVar);
            RelativeLayout relativeLayout2 = fVar.f147574f;
            if (relativeLayout2 == null) {
                h.f.b.l.a("chooseMusicContainer");
            }
            relativeLayout2.setOnClickListener(xVar);
            LinearLayout linearLayout2 = fVar.w;
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(xVar);
            }
        }
    }

    public static String a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        boolean z2;
        String name = cVar.getName();
        if (name == null || name.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(cVar.getName());
        String singer = cVar.getSinger();
        if (!(singer == null || singer.length() == 0)) {
            sb.append('-');
            sb.append(cVar.getSinger());
        }
        String sb2 = sb.toString();
        h.f.b.l.b(sb2, "");
        return sb2;
    }

    public final void c(boolean z2) {
        int i2;
        int i3 = 0;
        if (z2) {
            i2 = 0;
            i3 = 8;
        } else {
            i2 = 8;
        }
        View view = this.f147580l;
        if (view != null) {
            view.setVisibility(i2);
        }
        FrameLayout frameLayout = this.G;
        if (frameLayout != null) {
            frameLayout.setVisibility(i2);
        }
        Space space = this.I;
        if (space != null) {
            space.setVisibility(i3);
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147598a;

        static {
            Covode.recordClassIndex(97262);
        }

        n(f fVar) {
            this.f147598a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect = (Effect) obj;
            if (!this.f147598a.a()) {
                return;
            }
            if (com.ss.android.ugc.aweme.shortvideo.sticker.c.h(effect) || f.c(this.f147598a).getAlpha() != 1.0f || this.f147598a.B.f147537g.a() == null) {
                this.f147598a.t = false;
                this.f147598a.c(false);
                return;
            }
            this.f147598a.t = true;
            this.f147598a.c(true);
        }
    }

    static final class q<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147601a;

        static {
            Covode.recordClassIndex(97265);
        }

        q(f fVar) {
            this.f147601a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null) {
                this.f147601a.D();
                return;
            }
            f fVar = this.f147601a;
            int intValue = num.intValue();
            com.bytedance.tux.tooltip.a aVar = fVar.f147570b;
            if (aVar == null || !aVar.isShowing()) {
                fVar.C();
                z.e eVar = new z.e();
                T t = null;
                if (intValue == 1) {
                    c cVar = fVar.f147569a;
                    if (cVar != null) {
                        t = (T) cVar.b();
                    }
                } else {
                    c cVar2 = fVar.f147569a;
                    if (cVar2 != null) {
                        t = (T) cVar2.c();
                    }
                }
                eVar.element = t;
                fVar.b().post(new ab(fVar, eVar));
                TextView textView = fVar.f147573e;
                if (textView == null) {
                    h.f.b.l.a("tvChooseMusic");
                }
                textView.setOnTouchListener(new b(fVar));
                TextView textView2 = fVar.v;
                if (textView2 != null) {
                    textView2.setOnTouchListener(new c(fVar));
                }
            }
        }
    }

    static final class u<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147606a;

        static {
            Covode.recordClassIndex(97270);
        }

        u(f fVar) {
            this.f147606a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            int i3;
            Boolean bool = (Boolean) obj;
            ImageView b2 = f.b(this.f147606a);
            h.f.b.l.b(bool, "");
            int i4 = 0;
            if (bool.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            b2.setVisibility(i2);
            CircleDraweeView circleDraweeView = this.f147606a.x;
            if (circleDraweeView != null) {
                if (bool.booleanValue()) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                circleDraweeView.setVisibility(i3);
            }
            View view = this.f147606a.y;
            if (view != null) {
                if (!bool.booleanValue()) {
                    i4 = 8;
                }
                view.setVisibility(i4);
            }
        }
    }

    public final void a(boolean z2) {
        LinearLayout linearLayout = this.u;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            if (!z2 || !this.F) {
                TextView textView = this.f147573e;
                if (textView == null) {
                    h.f.b.l.a("tvChooseMusic");
                }
                textView.setVisibility(8);
                return;
            }
            TextView textView2 = this.f147573e;
            if (textView2 == null) {
                h.f.b.l.a("tvChooseMusic");
            }
            textView2.setVisibility(0);
            b().post(new aa(this));
        } else if (!z2 || !this.F) {
            TextView textView3 = this.v;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        } else {
            TextView textView4 = this.v;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            b().post(new z(this));
        }
    }

    public final void b(boolean z2) {
        if (!z2 || this.u == null) {
            LinearLayout linearLayout = this.u;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.f147574f;
            if (relativeLayout == null) {
                h.f.b.l.a("chooseMusicContainer");
            }
            relativeLayout.setVisibility(0);
            b().post(new ad(this));
            return;
        }
        RelativeLayout relativeLayout2 = this.f147574f;
        if (relativeLayout2 == null) {
            h.f.b.l.a("chooseMusicContainer");
        }
        relativeLayout2.setVisibility(8);
        LinearLayout linearLayout2 = this.u;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        b().post(new ac(this));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$f  reason: collision with other inner class name */
    static final class C3966f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147590a;

        static {
            Covode.recordClassIndex(97254);
        }

        C3966f(f fVar) {
            this.f147590a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            f fVar = this.f147590a;
            ShortVideoContextViewModel shortVideoContextViewModel = fVar.f147571c;
            if (shortVideoContextViewModel == null) {
                h.f.b.l.a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f124769a;
            h.f.b.l.b(shortVideoContext, "");
            if (shortVideoContext.c()) {
                StitchParams stitchParams = shortVideoContext.F.f124773a;
                if (stitchParams == null) {
                    h.f.b.l.b();
                }
                fVar.f147577i = true;
                TextView textView = fVar.f147573e;
                if (textView == null) {
                    h.f.b.l.a("tvChooseMusic");
                }
                textView.setClickable(false);
                TextView textView2 = fVar.f147573e;
                if (textView2 == null) {
                    h.f.b.l.a("tvChooseMusic");
                }
                textView2.setAlpha(0.5f);
                ImageView imageView = fVar.f147572d;
                if (imageView == null) {
                    h.f.b.l.a("ivChooseMusic");
                }
                imageView.setImageAlpha(127);
                if (!shortVideoContext.d()) {
                    fVar.f147576h = true;
                    RelativeLayout relativeLayout = fVar.f147574f;
                    if (relativeLayout == null) {
                        h.f.b.l.a("chooseMusicContainer");
                    }
                    relativeLayout.setVisibility(4);
                } else {
                    com.ss.android.ugc.aweme.shortvideo.c music = stitchParams.getMusic();
                    TextView textView3 = fVar.f147573e;
                    if (textView3 == null) {
                        h.f.b.l.a("tvChooseMusic");
                    }
                    if (music == null || (str = music.getMusicName()) == null) {
                        str = "";
                    }
                    textView3.setText(str);
                    if (!fVar.a()) {
                        if (av.a()) {
                            ImageView imageView2 = fVar.f147572d;
                            if (imageView2 == null) {
                                h.f.b.l.a("ivChooseMusic");
                            }
                            imageView2.setImageResource(2131232541);
                        } else {
                            ImageView imageView3 = fVar.f147572d;
                            if (imageView3 == null) {
                                h.f.b.l.a("ivChooseMusic");
                            }
                            imageView3.setImageResource(2131232539);
                        }
                    }
                }
                fVar.F();
            }
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147591a;

        static {
            Covode.recordClassIndex(97255);
        }

        g(f fVar) {
            this.f147591a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            View view = this.f147591a.f147578j;
            if (view != null) {
                h.f.b.l.b(bool, "");
                if (bool.booleanValue()) {
                    this.f147591a.b(false);
                    view.setVisibility(0);
                    if (this.f147591a.f147579k == null) {
                        f fVar = this.f147591a;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f);
                        ofFloat.setRepeatCount(-1);
                        ofFloat.setDuration(1000L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        fVar.f147579k = ofFloat;
                    }
                    Animator animator = this.f147591a.f147579k;
                    if (animator != null) {
                        animator.start();
                    }
                    this.f147591a.c(false);
                    f.c(this.f147591a).setText(this.f147591a.t().getResources().getText(R.string.g4k));
                    f.b(this.f147591a).setVisibility(4);
                } else if (view.getVisibility() != 8) {
                    view.setVisibility(8);
                    Animator animator2 = this.f147591a.f147579k;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f147591a.f147579k = null;
                    f.b(this.f147591a).setVisibility(0);
                    f.c(this.f147591a).setText(R.string.fvx);
                }
            }
        }
    }

    static final class r<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147602a;

        static {
            Covode.recordClassIndex(97266);
        }

        r(f fVar) {
            this.f147602a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                f.b(this.f147602a).setImageAlpha(255);
                f.c(this.f147602a).setAlpha(1.0f);
                com.ss.android.ugc.aweme.shortvideo.sticker.c.a(this.f147602a.C.f());
                if ((!this.f147602a.a() || this.f147602a.B.f147537g.a() == null || this.f147602a.d()) && !this.f147602a.t) {
                    z = false;
                } else {
                    z = true;
                    this.f147602a.t = true;
                    View view = this.f147602a.f147580l;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
                this.f147602a.a(true, z);
                return;
            }
            f.b(this.f147602a).setImageAlpha(127);
            f.c(this.f147602a).setAlpha(0.5f);
            View view2 = this.f147602a.f147580l;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            this.f147602a.a(false, false);
        }
    }

    static final class s<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147603a;

        static {
            Covode.recordClassIndex(97267);
        }

        s(f fVar) {
            this.f147603a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = (com.ss.android.ugc.aweme.shortvideo.c) obj;
            View view = this.f147603a.f147578j;
            if (view != null) {
                view.setVisibility(8);
            }
            if (cVar == null) {
                this.f147603a.E();
                if (this.f147603a.a()) {
                    this.f147603a.t = false;
                    this.f147603a.c(false);
                    return;
                }
                return;
            }
            f.c(this.f147603a).setText(f.a(cVar));
            if (this.f147603a.a()) {
                if (f.c(this.f147603a).getAlpha() == 1.0f && !this.f147603a.d()) {
                    this.f147603a.t = true;
                    this.f147603a.c(true);
                }
            } else if (av.a()) {
                f.b(this.f147603a).setImageResource(2131232541);
            } else {
                f.b(this.f147603a).setImageResource(2131232539);
            }
            this.f147603a.b().post(new Runnable(this) {
                /* class com.ss.android.ugc.gamora.recorder.choosemusic.f.s.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ s f147604a;

                static {
                    Covode.recordClassIndex(97268);
                }

                {
                    this.f147604a = r1;
                }

                public final void run() {
                    f.c(this.f147604a.f147603a).requestFocus();
                }
            });
            f fVar = this.f147603a;
            TextView textView = fVar.v;
            if (textView != null) {
                textView.setText(f.a(cVar));
            }
            com.ss.android.ugc.tools.c.a.a(fVar.x, cVar.getCoverMedium(), 22, 22);
            if (com.ss.android.ugc.gamora.recorder.choosemusic.a.b.a(fVar.D, fVar.C.f())) {
                fVar.b(true);
                fVar.b().post(new y(fVar));
            }
        }
    }

    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147586a;

        static {
            Covode.recordClassIndex(97250);
        }

        b(f fVar) {
            this.f147586a = fVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f147586a.D();
            return false;
        }
    }

    static final class c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f147587a;

        static {
            Covode.recordClassIndex(97251);
        }

        c(f fVar) {
            this.f147587a = fVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f147587a.D();
            return false;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bip, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    public final void a(boolean z2, boolean z3) {
        if (z2) {
            CircleDraweeView circleDraweeView = this.x;
            if (circleDraweeView != null) {
                circleDraweeView.setImageAlpha(255);
            }
            TextView textView = this.v;
            if (textView != null) {
                textView.setAlpha(1.0f);
            }
            if (z3) {
                Space space = this.I;
                if (space != null) {
                    space.setVisibility(8);
                }
                FrameLayout frameLayout = this.G;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            }
            ImageView imageView = this.z;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        CircleDraweeView circleDraweeView2 = this.x;
        if (circleDraweeView2 != null) {
            circleDraweeView2.setImageAlpha(127);
        }
        TextView textView2 = this.v;
        if (textView2 != null) {
            textView2.setAlpha(0.5f);
        }
        FrameLayout frameLayout2 = this.G;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        Space space2 = this.I;
        if (space2 != null) {
            space2.setVisibility(0);
        }
        ImageView imageView2 = this.z;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        MethodCollector.i(9208);
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.cr1);
        h.f.b.l.b(c2, "");
        this.f147575g = (FrameLayout) c2;
        View c3 = c(R.id.dol);
        h.f.b.l.b(c3, "");
        this.f147574f = (RelativeLayout) c3;
        View c4 = c(R.id.bv7);
        h.f.b.l.b(c4, "");
        this.f147572d = (ImageView) c4;
        View c5 = c(R.id.eww);
        h.f.b.l.b(c5, "");
        TextView textView = (TextView) c5;
        this.f147573e = textView;
        if (textView == null) {
            h.f.b.l.a("tvChooseMusic");
        }
        textView.setText(R.string.fvx);
        if (av.a()) {
            ImageView imageView = this.f147572d;
            if (imageView == null) {
                h.f.b.l.a("ivChooseMusic");
            }
            imageView.setImageResource(2131232541);
        } else {
            ImageView imageView2 = this.f147572d;
            if (imageView2 == null) {
                h.f.b.l.a("ivChooseMusic");
            }
            imageView2.setImageResource(2131232355);
        }
        this.f147578j = c(R.id.bv_);
        View c6 = c(R.id.cej);
        this.f147580l = c6;
        if (c6 != null) {
            c6.setVisibility(8);
        }
        Activity activity = this.f42913m;
        if (activity != null) {
            Space space = null;
            androidx.lifecycle.ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(ShortVideoContextViewModel.class);
            h.f.b.l.b(a2, "");
            this.f147571c = (ShortVideoContextViewModel) a2;
            View c7 = c(R.id.oa);
            if (!(c7 instanceof ViewStub)) {
                c7 = null;
            }
            ViewStub viewStub = (ViewStub) c7;
            if (com.ss.android.ugc.aweme.property.e.b() && viewStub != null) {
                View inflate = viewStub.inflate();
                if (!(inflate instanceof LinearLayout)) {
                    inflate = null;
                }
                this.u = (LinearLayout) inflate;
                View b2 = b(R.id.oc);
                if (!(b2 instanceof TextView)) {
                    b2 = null;
                }
                this.v = (TextView) b2;
                View b3 = b(R.id.od);
                if (!(b3 instanceof LinearLayout)) {
                    b3 = null;
                }
                this.w = (LinearLayout) b3;
                View b4 = b(R.id.o9);
                if (!(b4 instanceof CircleDraweeView)) {
                    b4 = null;
                }
                this.x = (CircleDraweeView) b4;
                View b5 = b(R.id.o_);
                if (!(b5 instanceof View)) {
                    b5 = null;
                }
                this.y = b5;
                View b6 = b(R.id.o4);
                if (!(b6 instanceof FrameLayout)) {
                    b6 = null;
                }
                this.G = (FrameLayout) b6;
                View b7 = b(R.id.o3);
                if (!(b7 instanceof ImageView)) {
                    b7 = null;
                }
                this.H = (ImageView) b7;
                View b8 = b(R.id.ob);
                if (!(b8 instanceof ImageView)) {
                    b8 = null;
                }
                this.z = (ImageView) b8;
                View b9 = b(R.id.oe);
                if (b9 instanceof Space) {
                    space = b9;
                }
                this.I = space;
            }
            Typeface a3 = ao.a();
            if (a3 != null) {
                TextView textView2 = this.f147573e;
                if (textView2 == null) {
                    h.f.b.l.a("tvChooseMusic");
                }
                textView2.setTypeface(a3);
                TextView textView3 = this.v;
                if (textView3 != null) {
                    textView3.setTypeface(a3);
                }
            }
            this.L.a(this, new o(this));
            this.B.f147541k.a(this, new p(this));
            this.B.f147542l.a(this, new q(this));
            this.B.f147536f.a(this, new r(this));
            this.B.f147537g.a(this, new s(this));
            this.B.f147535e.a(this, new t(this));
            this.B.f147532b.a(this, new u(this));
            this.B.f147533c.a(this, new v(this));
            this.B.f147543m.a(this, new C3966f(this));
            ShortVideoContextViewModel shortVideoContextViewModel = this.f147571c;
            if (shortVideoContextViewModel == null) {
                h.f.b.l.a("shortVideoContextViewModel");
            } else if (shortVideoContextViewModel != null) {
                ShortVideoContextViewModel shortVideoContextViewModel2 = this.f147571c;
                if (shortVideoContextViewModel2 == null) {
                    h.f.b.l.a("shortVideoContextViewModel");
                }
                if (shortVideoContextViewModel2.f124769a.aN) {
                    ShortVideoContextViewModel shortVideoContextViewModel3 = this.f147571c;
                    if (shortVideoContextViewModel3 == null) {
                        h.f.b.l.a("shortVideoContextViewModel");
                    }
                    if (shortVideoContextViewModel3.f124769a.O) {
                        a(false);
                        F();
                    }
                }
            }
            this.B.f147538h.a(this, new g(this));
            this.B.f147540j.a(this, new h(this));
            this.B.o.a(this, new i(this));
            this.B.q.a(this, new j(this));
            View view2 = this.f147580l;
            if (view2 != null) {
                view2.setOnClickListener(new k(this));
            }
            ImageView imageView3 = this.H;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new l(this));
            }
            CircleDraweeView circleDraweeView = this.x;
            if (circleDraweeView != null) {
                circleDraweeView.setOnClickListener(new m(this));
            }
            this.C.n().b().observe(this, new n(this));
            MethodCollector.o(9208);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(9208);
        throw nullPointerException;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    public f(b bVar, com.bytedance.als.h<Boolean> hVar, com.ss.android.ugc.aweme.sticker.presenter.o oVar, ShortVideoContext shortVideoContext) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(shortVideoContext, "");
        this.B = bVar;
        this.L = hVar;
        this.C = oVar;
        this.D = shortVideoContext;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
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
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
