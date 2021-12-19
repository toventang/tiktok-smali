package com.ss.android.ugc.aweme.dsp.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.adapter.al;
import h.f.b.l;

public final class DspLoadMoreFrameLayout extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final a f83928e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f83929a;

    /* renamed from: b  reason: collision with root package name */
    public al f83930b;

    /* renamed from: c  reason: collision with root package name */
    public int f83931c;

    /* renamed from: d  reason: collision with root package name */
    public int f83932d;

    /* renamed from: f  reason: collision with root package name */
    private int f83933f;

    /* renamed from: g  reason: collision with root package name */
    private DmtStatusView f83934g;

    /* renamed from: h  reason: collision with root package name */
    private int f83935h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f83936i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f83937j;

    /* renamed from: k  reason: collision with root package name */
    private float f83938k;

    /* renamed from: l  reason: collision with root package name */
    private float f83939l;

    /* renamed from: m  reason: collision with root package name */
    private int f83940m;
    private ValueAnimator n;
    private long o;
    private String p;
    private boolean q;
    private Drawable r;
    private boolean s;

    static {
        Covode.recordClassIndex(52355);
    }

    public DspLoadMoreFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52356);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private void b() {
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.q = true;
        } catch (Exception e2) {
            com.bytedance.c.a.a.a.b.a(e2, "DspLoadMoreFrameLayout");
        }
    }

    public final int getViewPagerMarginTop() {
        View view = this.f83929a;
        if (view == null) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            return marginLayoutParams2.topMargin;
        }
        return 0;
    }

    public final void a() {
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.d();
        }
        this.f83931c = -1;
        if (this.f83929a != null) {
            c();
        }
        if (this.o != -1 && !TextUtils.isEmpty(this.p)) {
            this.o = -1;
        }
    }

    private void c() {
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        int viewPagerMarginTop = getViewPagerMarginTop();
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.setDuration(200L);
        }
        ValueAnimator valueAnimator2 = this.n;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new DecelerateInterpolator());
        }
        ValueAnimator valueAnimator3 = this.n;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new b(this, viewPagerMarginTop));
        }
        ValueAnimator valueAnimator4 = this.n;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new c(this));
        }
        ValueAnimator valueAnimator5 = this.n;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        b();
    }

    public final void setCanLoadMore(boolean z) {
        this.s = z;
    }

    public final void setLabel(String str) {
        this.p = str;
    }

    public final void setLoadMoreListener(al alVar) {
        this.f83930b = alVar;
    }

    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DspLoadMoreFrameLayout f83943a;

        static {
            Covode.recordClassIndex(52358);
        }

        public final void onAnimationCancel(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(DspLoadMoreFrameLayout dspLoadMoreFrameLayout) {
            this.f83943a = dspLoadMoreFrameLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f83943a.setBackground(null);
        }
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DspLoadMoreFrameLayout f83946a;

        static {
            Covode.recordClassIndex(52360);
        }

        public final void onAnimationCancel(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(DspLoadMoreFrameLayout dspLoadMoreFrameLayout) {
            this.f83946a = dspLoadMoreFrameLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            al alVar;
            l.d(animator, "");
            if (this.f83946a.f83930b != null && this.f83946a.f83931c == -1 && (alVar = this.f83946a.f83930b) != null) {
                alVar.a();
            }
        }
    }

    public final void setBottomViewBackground(Drawable drawable) {
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.setBackgroundDrawable(drawable);
        } else {
            this.r = drawable;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DspLoadMoreFrameLayout f83947a;

        static {
            Covode.recordClassIndex(52361);
        }

        f(DspLoadMoreFrameLayout dspLoadMoreFrameLayout) {
            this.f83947a = dspLoadMoreFrameLayout;
        }

        public final void onClick(View view) {
            al alVar;
            ClickAgent.onClick(view);
            if (this.f83947a.f83930b != null && (alVar = this.f83947a.f83930b) != null) {
                alVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DspLoadMoreFrameLayout f83941a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f83942b;

        static {
            Covode.recordClassIndex(52357);
        }

        b(DspLoadMoreFrameLayout dspLoadMoreFrameLayout, int i2) {
            this.f83941a = dspLoadMoreFrameLayout;
            this.f83942b = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i2;
            l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int viewPagerMarginTop = this.f83941a.getViewPagerMarginTop();
            DspLoadMoreFrameLayout dspLoadMoreFrameLayout = this.f83941a;
            if (animatedFraction == 1.0f) {
                i2 = -viewPagerMarginTop;
            } else {
                double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                double d2 = (double) this.f83942b;
                Double.isNaN(d2);
                double d3 = pow * d2;
                double viewPagerMarginTop2 = (double) this.f83941a.getViewPagerMarginTop();
                Double.isNaN(viewPagerMarginTop2);
                i2 = (int) (d3 - viewPagerMarginTop2);
            }
            dspLoadMoreFrameLayout.setViewPagerMarginTopByDelta(i2);
        }
    }

    public final void setViewPagerMarginTopByDelta(int i2) {
        View view = this.f83929a;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin += i2;
                marginLayoutParams2.bottomMargin = -marginLayoutParams2.topMargin;
                View view2 = this.f83929a;
                if (view2 != null) {
                    view2.setLayoutParams(marginLayoutParams2);
                }
            }
        }
    }

    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DspLoadMoreFrameLayout f83944a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f83945b;

        static {
            Covode.recordClassIndex(52359);
        }

        d(DspLoadMoreFrameLayout dspLoadMoreFrameLayout, int i2) {
            this.f83944a = dspLoadMoreFrameLayout;
            this.f83945b = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i2;
            l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int viewPagerMarginTop = this.f83944a.getViewPagerMarginTop();
            DspLoadMoreFrameLayout dspLoadMoreFrameLayout = this.f83944a;
            if (animatedFraction == 1.0f) {
                i2 = -(viewPagerMarginTop + dspLoadMoreFrameLayout.f83932d);
            } else {
                double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                double d2 = (double) (this.f83945b + this.f83944a.f83932d);
                Double.isNaN(d2);
                double d3 = pow * d2;
                double viewPagerMarginTop2 = (double) (this.f83944a.getViewPagerMarginTop() + this.f83944a.f83932d);
                Double.isNaN(viewPagerMarginTop2);
                i2 = (int) (d3 - viewPagerMarginTop2);
            }
            dspLoadMoreFrameLayout.setViewPagerMarginTopByDelta(i2);
        }
    }

    private DmtStatusView a(boolean z) {
        DmtStatusView dmtStatusView;
        if (this.f83934g == null && z && this.q) {
            try {
                this.f83934g = new DmtStatusView(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, n.a(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, 0);
                addView(this.f83934g, 0, layoutParams);
                DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
                a2.a(new f(this));
                DmtStatusView dmtStatusView2 = this.f83934g;
                if (dmtStatusView2 != null) {
                    dmtStatusView2.setBuilder(a2);
                }
                Drawable drawable = this.r;
                if (!(drawable == null || (dmtStatusView = this.f83934g) == null)) {
                    dmtStatusView.setBackgroundDrawable(drawable);
                }
            } catch (Exception e2) {
                this.f83934g = null;
                this.r = null;
                com.bytedance.c.a.a.a.b.a(e2, "DspLoadMoreFrameLayout");
            }
        }
        DmtStatusView dmtStatusView3 = this.f83934g;
        if (dmtStatusView3 != null && dmtStatusView3.e()) {
            this.f83931c = -1;
        }
        return this.f83934g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r1 != 3) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.ui.DspLoadMoreFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r5 <= 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (r5 < 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        r7 = -r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.ui.DspLoadMoreFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private /* synthetic */ DspLoadMoreFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DspLoadMoreFrameLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(1409);
        this.f83931c = -1;
        this.o = -1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        l.b(viewConfiguration, "");
        this.f83935h = viewConfiguration.getScaledTouchSlop();
        Context context2 = getContext();
        l.b(context2, "");
        Resources resources = context2.getResources();
        l.b(resources, "");
        this.f83932d = (int) (resources.getDisplayMetrics().density * 109.0f);
        Context context3 = getContext();
        l.b(context3, "");
        Resources resources2 = context3.getResources();
        l.b(resources2, "");
        this.f83940m = (int) (resources2.getDisplayMetrics().density * 218.0f);
        MethodCollector.o(1409);
    }
}
