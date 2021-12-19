package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class AwesomeSplashNewMask extends RelativeLayout implements com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f34922e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f34923a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f34924b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f34925c;

    /* renamed from: d  reason: collision with root package name */
    public final GestureDetector.OnGestureListener f34926d;

    /* renamed from: f  reason: collision with root package name */
    private int f34927f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f34928g;

    /* renamed from: h  reason: collision with root package name */
    private AwemeSplashInfo f34929h;

    /* renamed from: i  reason: collision with root package name */
    private AwemeSplashInfo.SkipInfo f34930i;

    /* renamed from: j  reason: collision with root package name */
    private AwemeSplashInfo.LabelInfo f34931j;

    /* renamed from: k  reason: collision with root package name */
    private int f34932k;

    /* renamed from: l  reason: collision with root package name */
    private int f34933l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f34934m;
    private ViewPropertyAnimator n;
    private boolean o;
    private Runnable p;
    private ObjectAnimator q;
    private final h.h r;
    private final h.h s;
    private final h.h t;
    private final h.h u;
    private final h.h v;
    private final h.h w;
    private final h.h x;

    /* access modifiers changed from: package-private */
    public static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final p f34941a = new p();

        static {
            Covode.recordClassIndex(20968);
        }

        p() {
        }

        public final void onClick(View view) {
        }
    }

    static {
        Covode.recordClassIndex(20951);
    }

    public AwesomeSplashNewMask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final GestureDetector getMaskGestureDetector() {
        return (GestureDetector) this.w.getValue();
    }

    private final ImageView getPromptIv() {
        return (ImageView) this.t.getValue();
    }

    private final RelativeLayout getPromptTotal() {
        return (RelativeLayout) this.r.getValue();
    }

    private final TopViewSkipButton getSkipButton() {
        return (TopViewSkipButton) this.u.getValue();
    }

    private final TextView getSponsorSign() {
        return (TextView) this.v.getValue();
    }

    private static /* synthetic */ void getStatus$annotations() {
    }

    private final ImageView getTopPromptIv() {
        return (ImageView) this.x.getValue();
    }

    public final TextView getPromptTv() {
        return (TextView) this.s.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20952);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class q extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(20969);
        }

        q() {
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            super.onAnimationEnd(animator);
            animator.setStartDelay(1000);
            animator.start();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwesomeSplashNewMask f34936a;

        static {
            Covode.recordClassIndex(20954);
        }

        c(AwesomeSplashNewMask awesomeSplashNewMask) {
            this.f34936a = awesomeSplashNewMask;
        }

        public final void run() {
            this.f34936a.a(true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ AwesomeSplashNewMask this$0;

        static {
            Covode.recordClassIndex(20965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.this$0 = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            AwemeRawAd awemeRawAd;
            this.this$0.getPromptTv().setOnClickListener(AnonymousClass1.f34940a);
            Aweme aweme = this.this$0.f34925c;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", awemeRawAd).b("refer", "tips").b();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c
    public final void b() {
        this.f34928g = true;
        a();
    }

    static final class e extends h.f.b.m implements h.f.a.a<GestureDetector> {
        final /* synthetic */ AwesomeSplashNewMask this$0;

        static {
            Covode.recordClassIndex(20956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.this$0 = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GestureDetector invoke() {
            return new GestureDetector(this.this$0.f34924b, this.this$0.f34926d);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ AwesomeSplashNewMask this$0;

        static {
            Covode.recordClassIndex(20958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.this$0 = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.c05);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<RelativeLayout> {
        final /* synthetic */ AwesomeSplashNewMask this$0;

        static {
            Covode.recordClassIndex(20959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.this$0 = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.this$0.findViewById(R.id.doq);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ AwesomeSplashNewMask this$0;

        static {
            Covode.recordClassIndex(20960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.this$0 = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.findViewById(R.id.f51);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<TopViewSkipButton> {
        final /* synthetic */ AwesomeSplashNewMask this$0;

        static {
            Covode.recordClassIndex(20962);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.this$0 = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TopViewSkipButton invoke() {
            return this.this$0.findViewById(R.id.e50);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ AwesomeSplashNewMask this$0;

        static {
            Covode.recordClassIndex(20963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.this$0 = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.findViewById(R.id.f7l);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ AwesomeSplashNewMask this$0;

        static {
            Covode.recordClassIndex(20964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.this$0 = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.c2_);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.q7);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin += com.ss.android.ugc.aweme.base.utils.i.b();
            findViewById.setLayoutParams(marginLayoutParams);
        }
        setOnTouchListener(new f(this));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c
    public final void a() {
        if (this.p != null) {
            getPromptTotal().removeCallbacks(this.p);
            this.p = null;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.n;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.n = null;
        }
        ObjectAnimator objectAnimator = this.q;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            ObjectAnimator objectAnimator2 = this.q;
            if (objectAnimator2 == null) {
                h.f.b.l.b();
            }
            objectAnimator2.cancel();
            this.q = null;
        }
        ImageView promptIv = getPromptIv();
        h.f.b.l.b(promptIv, "");
        TextView promptTv = getPromptTv();
        h.f.b.l.b(promptTv, "");
        j.a(promptIv, promptTv);
        getSkipButton().b();
    }

    public static final class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwesomeSplashNewMask f34935a;

        static {
            Covode.recordClassIndex(20953);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AwesomeSplashNewMask awesomeSplashNewMask) {
            this.f34935a = awesomeSplashNewMask;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            this.f34935a.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
            if (r0 == null) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onSingleTapUp(android.view.MotionEvent r7) {
            /*
            // Method dump skipped, instructions count: 159
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask.b.onSingleTapUp(android.view.MotionEvent):boolean");
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z;
            if (!(motionEvent == null || motionEvent2 == null || Math.abs(f2) >= Math.abs(f3))) {
                ViewParent parent = this.f34935a.getParent();
                if (motionEvent2.getY() > motionEvent.getY()) {
                    z = true;
                } else {
                    z = false;
                }
                parent.requestDisallowInterceptTouchEvent(z);
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<View[], z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f34939a = new j();

        static {
            Covode.recordClassIndex(20961);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View[] viewArr) {
            a(viewArr);
            return z.f158842a;
        }

        public static void a(View... viewArr) {
            h.f.b.l.d(viewArr, "");
            for (View view : viewArr) {
                view.clearAnimation();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<View[], z> {
        final /* synthetic */ boolean $isDelay;

        static {
            Covode.recordClassIndex(20967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(boolean z) {
            super(1);
            this.$isDelay = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View[] viewArr) {
            a(viewArr);
            return z.f158842a;
        }

        public final void a(View... viewArr) {
            h.f.b.l.d(viewArr, "");
            if (this.$isDelay) {
                for (View view : viewArr) {
                    view.setAlpha(0.0f);
                    com.bytedance.common.utility.n.a(view, 0);
                    view.animate().alpha(1.0f).setDuration(300).setListener(null);
                }
                return;
            }
            for (View view2 : viewArr) {
                com.bytedance.common.utility.n.a(view2, 0);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwesomeSplashNewMask f34937a;

        static {
            Covode.recordClassIndex(20955);
        }

        d(AwesomeSplashNewMask awesomeSplashNewMask) {
            this.f34937a = awesomeSplashNewMask;
        }

        public final void onClick(View view) {
            AwemeRawAd awemeRawAd;
            Aweme aweme = this.f34937a.f34925c;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", awemeRawAd).b("refer", "adtag").b();
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        h.f.b.l.d(motionEvent, "");
        super.onTouchEvent(motionEvent);
        GestureDetector maskGestureDetector = getMaskGestureDetector();
        if (!(this.f34928g || (i2 = this.f34927f) == 1 || i2 == 4)) {
            maskGestureDetector.onTouchEvent(motionEvent);
        }
        if (this.f34927f != 4) {
            return true;
        }
        return false;
    }

    public final void a(boolean z) {
        String enterAppText;
        AwemeSplashInfo awemeSplashInfo = this.f34929h;
        if (awemeSplashInfo != null && (enterAppText = awemeSplashInfo.getEnterAppText()) != null && enterAppText.length() != 0) {
            n nVar = new n(this);
            o oVar = new o(z);
            int i2 = this.f34932k;
            if (i2 == 6) {
                com.bytedance.common.utility.n.a(getPromptTotal(), 0);
                TextView promptTv = getPromptTv();
                h.f.b.l.b(promptTv, "");
                AwemeSplashInfo awemeSplashInfo2 = this.f34929h;
                if (awemeSplashInfo2 == null) {
                    h.f.b.l.b();
                }
                promptTv.setText(awemeSplashInfo2.getEnterAppText());
                TextView promptTv2 = getPromptTv();
                h.f.b.l.b(promptTv2, "");
                ImageView promptIv = getPromptIv();
                h.f.b.l.b(promptIv, "");
                oVar.a(promptTv2, promptIv);
                nVar.a();
                getPromptIv().setOnClickListener(p.f34941a);
            } else if (i2 == 7) {
                com.bytedance.common.utility.n.a(getPromptTotal(), 0);
                com.bytedance.common.utility.n.a(getPromptIv(), 8);
                TextView promptTv3 = getPromptTv();
                h.f.b.l.b(promptTv3, "");
                oVar.a(promptTv3);
                TextView promptTv4 = getPromptTv();
                h.f.b.l.b(promptTv4, "");
                AwemeSplashInfo awemeSplashInfo3 = this.f34929h;
                if (awemeSplashInfo3 == null) {
                    h.f.b.l.b();
                }
                promptTv4.setText(awemeSplashInfo3.getEnterAppText());
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getPromptTv(), "translationY", 0.0f, -com.bytedance.common.utility.n.b(this.f34924b, 8.0f), 0.0f);
                this.q = ofFloat;
                if (z && ofFloat != null) {
                    ofFloat.setStartDelay(300);
                }
                ObjectAnimator objectAnimator = this.q;
                if (objectAnimator != null) {
                    objectAnimator.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                }
                ObjectAnimator objectAnimator2 = this.q;
                if (objectAnimator2 != null) {
                    objectAnimator2.addListener(new q());
                }
                ObjectAnimator objectAnimator3 = this.q;
                if (objectAnimator3 != null) {
                    objectAnimator3.start();
                }
                nVar.a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0164  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a r13) {
        /*
        // Method dump skipped, instructions count: 431
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask.onEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a):void");
    }

    static final class f implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwesomeSplashNewMask f34938a;

        static {
            Covode.recordClassIndex(20957);
        }

        f(AwesomeSplashNewMask awesomeSplashNewMask) {
            this.f34938a = awesomeSplashNewMask;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            h.f.b.l.b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            HashMap hashMap = new HashMap();
            if (gb.a(this.f34938a.getContext())) {
                hashMap.put("click_x", String.valueOf(((float) com.ss.android.ugc.aweme.base.utils.i.b(this.f34938a.getContext())) - motionEvent.getRawX()));
            } else {
                hashMap.put("click_x", String.valueOf(motionEvent.getRawX()));
            }
            hashMap.put("click_y", String.valueOf(motionEvent.getRawY()));
            Map<String, String> map = this.f34938a.f34923a;
            String b2 = new com.google.gson.f().b(hashMap);
            h.f.b.l.b(b2, "");
            map.put("ad_extra_data", b2);
            return false;
        }
    }

    private /* synthetic */ AwesomeSplashNewMask(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AwesomeSplashNewMask(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(9272);
        this.f34927f = 4;
        this.f34923a = new HashMap();
        this.f34924b = context;
        this.o = true;
        this.r = h.i.a(h.m.NONE, new h(this));
        this.s = h.i.a(h.m.NONE, new i(this));
        this.t = h.i.a(h.m.NONE, new g(this));
        this.u = h.i.a(h.m.NONE, new k(this));
        this.v = h.i.a(h.m.NONE, new l(this));
        this.w = h.i.a(h.m.NONE, new e(this));
        this.x = h.i.a(h.m.NONE, new m(this));
        this.f34926d = new b(this);
        MethodCollector.o(9272);
    }
}
