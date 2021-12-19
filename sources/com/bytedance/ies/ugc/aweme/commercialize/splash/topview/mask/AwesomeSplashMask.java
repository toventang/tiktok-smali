package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton;
import com.ss.android.ad.splash.f.o;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class AwesomeSplashMask extends RelativeLayout implements com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c {

    /* renamed from: m  reason: collision with root package name */
    public static final a f34903m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f34904a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f34905b;

    /* renamed from: c  reason: collision with root package name */
    public AwemeSplashInfo f34906c;

    /* renamed from: d  reason: collision with root package name */
    public int f34907d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f34908e;

    /* renamed from: f  reason: collision with root package name */
    public int f34909f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f34910g;

    /* renamed from: h  reason: collision with root package name */
    AnimatorSet f34911h;

    /* renamed from: i  reason: collision with root package name */
    ObjectAnimator f34912i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f34913j;

    /* renamed from: k  reason: collision with root package name */
    final Animator.AnimatorListener f34914k;

    /* renamed from: l  reason: collision with root package name */
    public final GestureDetector.OnGestureListener f34915l;
    private int n;
    private boolean o;
    private final h.h p;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private final h.h t;
    private AwemeSplashInfo.SkipInfo u;
    private int v;
    private ViewPropertyAnimator w;
    private AdHomePageDataVM x;
    private final u<Float> y;

    static {
        Covode.recordClassIndex(20939);
    }

    public AwesomeSplashMask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final GestureDetector getMaskGestureDetector() {
        return (GestureDetector) this.t.getValue();
    }

    private final TopViewSkipButton getSkipButton() {
        return (TopViewSkipButton) this.p.getValue();
    }

    private static /* synthetic */ void getStatus$annotations() {
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c
    public final void b() {
    }

    /* access modifiers changed from: package-private */
    public final RelativeLayout getCountDownBg4() {
        return (RelativeLayout) this.q.getValue();
    }

    public final RelativeLayout getCountDownBg5() {
        return (RelativeLayout) this.s.getValue();
    }

    public final TextView getCountDownTv() {
        return (TextView) this.r.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20940);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<RelativeLayout> {
        final /* synthetic */ AwesomeSplashMask this$0;

        static {
            Covode.recordClassIndex(20942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AwesomeSplashMask awesomeSplashMask) {
            super(0);
            this.this$0 = awesomeSplashMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.this$0.findViewById(R.id.do_);
        }
    }

    static final class d extends m implements h.f.a.a<RelativeLayout> {
        final /* synthetic */ AwesomeSplashMask this$0;

        static {
            Covode.recordClassIndex(20943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AwesomeSplashMask awesomeSplashMask) {
            super(0);
            this.this$0 = awesomeSplashMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.this$0.findViewById(R.id.doa);
        }
    }

    static final class e extends m implements h.f.a.a<TextView> {
        final /* synthetic */ AwesomeSplashMask this$0;

        static {
            Covode.recordClassIndex(20944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AwesomeSplashMask awesomeSplashMask) {
            super(0);
            this.this$0 = awesomeSplashMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.findViewById(R.id.exp);
        }
    }

    static final class g extends m implements h.f.a.a<GestureDetector> {
        final /* synthetic */ AwesomeSplashMask this$0;

        static {
            Covode.recordClassIndex(20946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(AwesomeSplashMask awesomeSplashMask) {
            super(0);
            this.this$0 = awesomeSplashMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GestureDetector invoke() {
            return new GestureDetector(this.this$0.f34908e, this.this$0.f34915l);
        }
    }

    static final class k extends m implements h.f.a.a<TopViewSkipButton> {
        final /* synthetic */ AwesomeSplashMask this$0;

        static {
            Covode.recordClassIndex(20950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(AwesomeSplashMask awesomeSplashMask) {
            super(0);
            this.this$0 = awesomeSplashMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TopViewSkipButton invoke() {
            return this.this$0.findViewById(R.id.e50);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c
    public final void a() {
        AdHomePageDataVM adHomePageDataVM;
        getSkipButton().b();
        d();
        if (this.f34907d == 5 && (adHomePageDataVM = this.x) != null) {
            adHomePageDataVM.f34659c.removeObserver(this.y);
        }
        ViewPropertyAnimator viewPropertyAnimator = this.w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.w = null;
        }
    }

    public final void d() {
        AnimatorSet animatorSet = this.f34911h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f34911h = null;
        }
        ObjectAnimator objectAnimator = this.f34912i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f34912i = null;
        }
        RelativeLayout countDownBg4 = getCountDownBg4();
        if (countDownBg4.getVisibility() == 0) {
            countDownBg4.setVisibility(8);
        }
        RelativeLayout countDownBg5 = getCountDownBg5();
        if (countDownBg5.getVisibility() == 0) {
            countDownBg5.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getContext() instanceof androidx.fragment.app.e) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.x = AdHomePageDataVM.a.a((androidx.fragment.app.e) context);
        }
        View findViewById = findViewById(R.id.q7);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin += com.ss.android.ugc.aweme.base.utils.i.b();
            findViewById.setLayoutParams(marginLayoutParams);
        }
        setOnTouchListener(new j(this));
    }

    public final void c() {
        AwemeRawAd awemeRawAd;
        String openUrl;
        com.bytedance.ies.ugc.aweme.commercialize.splash.a.b a2 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
        if (a2 != null && a2.c(this.f34905b)) {
            com.bytedance.ies.ugc.aweme.commercialize.splash.a.b a3 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
            if (a3 == null) {
                l.b();
            }
            if (a3.d(this.f34905b)) {
                new com.bytedance.tux.g.b(this).e(R.string.of).b();
                return;
            }
            Aweme aweme = this.f34905b;
            if (aweme == null) {
                l.b();
            }
            aweme.getAid();
            Aweme aweme2 = this.f34905b;
            if (!(aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null || (openUrl = awemeRawAd.getOpenUrl()) == null || openUrl.length() == 0)) {
                Uri parse = Uri.parse(awemeRawAd.getOpenUrl());
                l.b(parse, "");
                if (TextUtils.equals(parse.getHost(), "challenge")) {
                    com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(awemeRawAd.getOpenUrl());
                    gVar.a("extra_challenge_from", "awesome_splash");
                    awemeRawAd.setOpenUrl(gVar.a());
                }
            }
            com.bytedance.ies.ugc.aweme.commercialize.splash.a.b a4 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
            if (a4 != null) {
                a4.a(this.f34908e, this.f34905b, this.f34904a);
            }
        }
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwesomeSplashMask f34916a;

        static {
            Covode.recordClassIndex(20941);
        }

        public final void onAnimationCancel(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator, boolean z) {
            l.d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AwesomeSplashMask awesomeSplashMask) {
            this.f34916a = awesomeSplashMask;
        }

        public final void onAnimationEnd(Animator animator, boolean z) {
            l.d(animator, "");
            this.f34916a.f34910g = true;
        }
    }

    public static final class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwesomeSplashMask f34917a;

        static {
            Covode.recordClassIndex(20945);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(AwesomeSplashMask awesomeSplashMask) {
            this.f34917a = awesomeSplashMask;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            this.f34917a.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            this.f34917a.c();
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            String enterAppText;
            l.d(motionEvent, "");
            l.d(motionEvent2, "");
            if (Math.abs(f2) >= Math.abs(f3) || motionEvent2.getY() >= motionEvent.getY()) {
                z = false;
            } else {
                z = true;
            }
            AwemeRawAd awemeRawAd = null;
            if (this.f34917a.f34907d != 3) {
                if (this.f34917a.f34907d != 0) {
                    if (this.f34917a.f34907d == 4) {
                        if (!z) {
                            return true;
                        }
                        Aweme aweme = this.f34917a.f34905b;
                        if (aweme != null) {
                            awemeRawAd = aweme.getAwemeRawAd();
                        }
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "slide_up", awemeRawAd).b();
                        AwemeSplashInfo awemeSplashInfo = this.f34917a.f34906c;
                        if (awemeSplashInfo == null || (enterAppText = awemeSplashInfo.getEnterAppText()) == null || enterAppText.length() == 0) {
                            return true;
                        }
                        if (this.f34917a.f34909f > 1) {
                            TextView countDownTv = this.f34917a.getCountDownTv();
                            l.b(countDownTv, "");
                            String enterAppText2 = awemeSplashInfo.getEnterAppText();
                            l.b(enterAppText2, "");
                            countDownTv.setText(p.a(enterAppText2, "%", String.valueOf(this.f34917a.f34909f), false));
                            AwesomeSplashMask awesomeSplashMask = this.f34917a;
                            if (awesomeSplashMask.f34910g) {
                                awesomeSplashMask.f34910g = false;
                                Aweme aweme2 = awesomeSplashMask.f34905b;
                                if (aweme2 == null) {
                                    l.b();
                                }
                                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", aweme2.getAwemeRawAd()).b("refer", "tips").b();
                                RelativeLayout countDownBg4 = awesomeSplashMask.getCountDownBg4();
                                if (countDownBg4.getVisibility() == 8) {
                                    countDownBg4.setVisibility(0);
                                }
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "translationY", 0.0f, -o.a(awesomeSplashMask.f34908e, 50.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "translationY", 0.0f, o.a(awesomeSplashMask.f34908e, 50.0f));
                                l.b(ofFloat, "");
                                ofFloat.setDuration(200L);
                                l.b(ofFloat2, "");
                                ofFloat2.setDuration(2L);
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "alpha", 1.0f, 0.0f);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "alpha", 1.0f);
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "alpha", 1.0f);
                                l.b(ofFloat3, "");
                                ofFloat3.setDuration(150L);
                                l.b(ofFloat4, "");
                                ofFloat4.setDuration(650L);
                                l.b(ofFloat5, "");
                                ofFloat5.setDuration(2L);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(ofFloat).before(ofFloat4);
                                animatorSet.play(ofFloat4).before(ofFloat3);
                                animatorSet.play(ofFloat3).before(ofFloat2);
                                animatorSet.play(ofFloat2).before(ofFloat5);
                                animatorSet.addListener(awesomeSplashMask.f34914k);
                                animatorSet.start();
                                awesomeSplashMask.f34911h = animatorSet;
                            }
                        } else {
                            this.f34917a.d();
                        }
                    } else if (this.f34917a.f34907d == 1) {
                        if (z) {
                            Aweme aweme3 = this.f34917a.f34905b;
                            if (aweme3 != null) {
                                awemeRawAd = aweme3.getAwemeRawAd();
                            }
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "slide_up", awemeRawAd).b();
                        }
                    }
                }
                this.f34917a.c();
            } else if (z) {
                Aweme aweme4 = this.f34917a.f34905b;
                if (aweme4 != null) {
                    awemeRawAd = aweme4.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "slide_up", awemeRawAd).b();
            }
            return true;
        }
    }

    public static final class i implements TopViewSkipButton.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwesomeSplashMask f34920a;

        static {
            Covode.recordClassIndex(20948);
        }

        i(AwesomeSplashMask awesomeSplashMask) {
            this.f34920a = awesomeSplashMask;
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton.b
        public final void a(int i2) {
            this.f34920a.f34909f = i2;
            if (this.f34920a.f34907d == 5) {
                AwemeSplashInfo awemeSplashInfo = this.f34920a.f34906c;
                if (awemeSplashInfo == null) {
                    l.b();
                }
                if (!TextUtils.isEmpty(awemeSplashInfo.getEnterAppText()) && this.f34920a.f34909f > 0) {
                    TextView countDownTv = this.f34920a.getCountDownTv();
                    l.b(countDownTv, "");
                    AwemeSplashInfo awemeSplashInfo2 = this.f34920a.f34906c;
                    if (awemeSplashInfo2 == null) {
                        l.b();
                    }
                    String enterAppText = awemeSplashInfo2.getEnterAppText();
                    l.b(enterAppText, "");
                    countDownTv.setText(p.a(enterAppText, "%", String.valueOf(this.f34920a.f34909f), false));
                }
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (this.f34907d != 5) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (this.f34907d == 5) {
            return false;
        }
        int i2 = this.n;
        if (!(i2 == 1 || i2 == 4)) {
            getMaskGestureDetector().onTouchEvent(motionEvent);
        }
        if (this.n != 4) {
            return true;
        }
        return false;
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwesomeSplashMask f34918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f34919b;

        static {
            Covode.recordClassIndex(20947);
        }

        h(AwesomeSplashMask awesomeSplashMask, Context context) {
            this.f34918a = awesomeSplashMask;
            this.f34919b = context;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            AwemeRawAd awemeRawAd;
            Float f2 = (Float) obj;
            RelativeLayout countDownBg5 = this.f34918a.getCountDownBg5();
            l.b(countDownBg5, "");
            if (countDownBg5.getVisibility() == 8) {
                RelativeLayout countDownBg52 = this.f34918a.getCountDownBg5();
                l.b(countDownBg52, "");
                countDownBg52.setVisibility(0);
            }
            RelativeLayout countDownBg53 = this.f34918a.getCountDownBg5();
            l.b(countDownBg53, "");
            countDownBg53.setTranslationY(-f2.floatValue());
            if (l.a(f2, 0.0f)) {
                this.f34918a.f34913j = false;
            }
            if (!this.f34918a.f34913j) {
                float floatValue = f2.floatValue();
                ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f34919b);
                l.b(viewConfiguration, "");
                if (floatValue > ((float) viewConfiguration.getScaledTouchSlop())) {
                    this.f34918a.f34913j = true;
                    Aweme aweme = this.f34918a.f34905b;
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "slide_up", awemeRawAd).b();
                    AwesomeSplashMask awesomeSplashMask = this.f34918a;
                    if (awesomeSplashMask.f34910g && awesomeSplashMask.f34909f > 1) {
                        awesomeSplashMask.f34910g = false;
                        Aweme aweme2 = awesomeSplashMask.f34905b;
                        if (aweme2 == null) {
                            l.b();
                        }
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", aweme2.getAwemeRawAd()).b("refer", "tips").b();
                        RelativeLayout countDownBg4 = awesomeSplashMask.getCountDownBg4();
                        if (countDownBg4.getVisibility() == 8) {
                            countDownBg4.setVisibility(0);
                        }
                        AwemeSplashInfo awemeSplashInfo = awesomeSplashMask.f34906c;
                        if (awemeSplashInfo == null) {
                            l.b();
                        }
                        String enterAppText = awemeSplashInfo.getEnterAppText();
                        if (!(enterAppText == null || enterAppText.length() == 0)) {
                            TextView countDownTv = awesomeSplashMask.getCountDownTv();
                            l.b(countDownTv, "");
                            AwemeSplashInfo awemeSplashInfo2 = awesomeSplashMask.f34906c;
                            if (awemeSplashInfo2 == null) {
                                l.b();
                            }
                            String enterAppText2 = awemeSplashInfo2.getEnterAppText();
                            l.b(enterAppText2, "");
                            countDownTv.setText(p.a(enterAppText2, "%", String.valueOf(awesomeSplashMask.f34909f), false));
                        }
                        awesomeSplashMask.f34912i = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "translationY", 0.0f, -o.a(awesomeSplashMask.f34908e, 50.0f));
                        ObjectAnimator objectAnimator = awesomeSplashMask.f34912i;
                        if (objectAnimator != null) {
                            objectAnimator.setDuration(200L);
                        }
                        ObjectAnimator objectAnimator2 = awesomeSplashMask.f34912i;
                        if (objectAnimator2 != null) {
                            objectAnimator2.start();
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c
    public final void onEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo.SkipInfo skipInfo;
        int i2;
        int i3;
        AdHomePageDataVM adHomePageDataVM;
        t<Float> tVar;
        l.d(aVar, "");
        this.n = aVar.f34874a;
        Aweme aweme = aVar.f34875b;
        this.f34905b = aweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            l.b(awemeRawAd, "");
            AwemeSplashInfo splashInfo = awemeRawAd.getSplashInfo();
            this.f34906c = splashInfo;
            if (splashInfo != null) {
                this.f34907d = splashInfo.getSwipeUpType();
                AwemeSplashInfo.SkipInfo skipInfo2 = splashInfo.getSkipInfo();
                if (skipInfo2 != null) {
                    this.u = skipInfo2;
                    this.v = skipInfo2.getButtonExtraStyle();
                }
            }
            if (!this.o) {
                if (!(this.f34907d != 5 || (adHomePageDataVM = this.x) == null || (tVar = adHomePageDataVM.f34659c) == null)) {
                    Context context = getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    tVar.observe((androidx.lifecycle.m) context, this.y);
                }
                AwemeSplashInfo.SkipInfo skipInfo3 = this.u;
                if (skipInfo3 != null) {
                    getSkipButton().a(this.f34908e, skipInfo3);
                }
                if (!(!gb.a(getContext()) || (i3 = this.v) == 2 || i3 == 3)) {
                    TopViewSkipButton skipButton = getSkipButton();
                    l.b(skipButton, "");
                    ViewGroup.LayoutParams layoutParams = skipButton.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.addRule(11, 0);
                    layoutParams2.addRule(9);
                    TopViewSkipButton skipButton2 = getSkipButton();
                    l.b(skipButton2, "");
                    skipButton2.setLayoutParams(layoutParams2);
                    View findViewById = findViewById(R.id.q5);
                    l.b(findViewById, "");
                    AutoRTLImageView autoRTLImageView = (AutoRTLImageView) findViewById;
                    ViewGroup.LayoutParams layoutParams3 = autoRTLImageView.getLayoutParams();
                    Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.addRule(9, 0);
                    layoutParams4.addRule(11);
                    layoutParams4.rightMargin = n.a(14.0d);
                    autoRTLImageView.setLayoutParams(layoutParams4);
                }
                this.o = true;
            }
            int i4 = this.n;
            if (i4 == 3) {
                ALog.d("AwesomeSplash", "AwesomeSplashMask onEvent is FADING_OUT");
                d();
                ViewPropertyAnimator duration = animate().alpha(0.0f).setDuration(260);
                this.w = duration;
                if (duration != null) {
                    duration.start();
                }
                com.bytedance.ies.ugc.aweme.commercialize.splash.a.b a2 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
                if (a2 != null) {
                    Context context2 = getContext();
                    l.b(context2, "");
                    a2.a(context2, this.f34905b);
                }
            } else if (i4 == 2 && (skipInfo = this.u) != null) {
                if (skipInfo.isCountdown_enable() || (i2 = this.f34907d) == 4 || i2 == 5) {
                    TopViewSkipButton skipButton3 = getSkipButton();
                    i iVar = new i(this);
                    l.d(iVar, "");
                    skipButton3.f34958h = iVar;
                    AwemeSplashInfo awemeSplashInfo = this.f34906c;
                    if (awemeSplashInfo == null) {
                        l.b();
                    }
                    this.f34909f = (int) (awemeSplashInfo.getSplashShowTime() / 1000.0f);
                    TopViewSkipButton skipButton4 = getSkipButton();
                    AwemeSplashInfo awemeSplashInfo2 = this.f34906c;
                    if (awemeSplashInfo2 == null) {
                        l.b();
                    }
                    skipButton4.a((long) awemeSplashInfo2.getSplashShowTime());
                }
            }
        }
    }

    static final class j implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwesomeSplashMask f34921a;

        static {
            Covode.recordClassIndex(20949);
        }

        j(AwesomeSplashMask awesomeSplashMask) {
            this.f34921a = awesomeSplashMask;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f34921a.f34907d == 5) {
                return false;
            }
            l.b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            HashMap hashMap = new HashMap();
            if (gb.a(this.f34921a.getContext())) {
                hashMap.put("click_x", String.valueOf(((float) com.ss.android.ugc.aweme.base.utils.i.b(this.f34921a.getContext())) - motionEvent.getRawX()));
            } else {
                hashMap.put("click_x", String.valueOf(motionEvent.getRawX()));
            }
            hashMap.put("click_y", String.valueOf(motionEvent.getRawY()));
            Map<String, String> map = this.f34921a.f34904a;
            String b2 = new com.google.gson.f().b(hashMap);
            l.b(b2, "");
            map.put("ad_extra_data", b2);
            return false;
        }
    }

    private /* synthetic */ AwesomeSplashMask(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AwesomeSplashMask(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5903);
        this.n = 4;
        this.f34904a = new HashMap();
        this.p = h.i.a(h.m.NONE, new k(this));
        this.q = h.i.a(h.m.NONE, new c(this));
        this.r = h.i.a(h.m.NONE, new e(this));
        this.s = h.i.a(h.m.NONE, new d(this));
        this.t = h.i.a(h.m.NONE, new g(this));
        this.f34908e = context;
        this.f34910g = true;
        this.f34914k = new b(this);
        this.y = new h(this, context);
        this.f34915l = new f(this);
        MethodCollector.o(5903);
    }
}
