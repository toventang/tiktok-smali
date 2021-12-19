package com.ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.detail.transition.b;
import com.ss.android.ugc.aweme.feed.adapter.al;
import com.zhiliaoapp.musically.R;

public class LoadMoreFrameLayout extends FrameLayout {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f95192g = {"personal_homepage", "others_homepage", "challenge", "single_song", "prop_page", "duet_page", "mv_page", "poi_detail"};
    private c A;

    /* renamed from: a  reason: collision with root package name */
    public al f95193a;

    /* renamed from: b  reason: collision with root package name */
    public int f95194b;

    /* renamed from: c  reason: collision with root package name */
    public int f95195c;

    /* renamed from: d  reason: collision with root package name */
    final h.f.a.a<String> f95196d;

    /* renamed from: e  reason: collision with root package name */
    final h.f.a.a<String> f95197e;

    /* renamed from: f  reason: collision with root package name */
    public int f95198f;

    /* renamed from: h  reason: collision with root package name */
    private int f95199h;

    /* renamed from: i  reason: collision with root package name */
    private DmtStatusView f95200i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.common.widget.c f95201j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b f95202k;

    /* renamed from: l  reason: collision with root package name */
    private int f95203l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f95204m;
    private boolean n;
    private float o;
    private float p;
    private int q;
    private ValueAnimator r;
    private long s;
    private String t;
    private boolean u;
    private Drawable v;
    private View w;
    private b x;
    private a y;
    private String z;

    public interface a {
        static {
            Covode.recordClassIndex(60329);
        }

        void a();
    }

    public interface b {
        static {
            Covode.recordClassIndex(60330);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(60331);
        }

        void a(int i2);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.u = true;
        } catch (Exception unused) {
        }
    }

    public final void f() {
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.setVisibility(8);
        }
    }

    public int getViewPagerMarginTop() {
        com.ss.android.ugc.aweme.common.widget.c cVar = this.f95201j;
        if (cVar == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) cVar.getLayoutParams()).topMargin;
    }

    static {
        Covode.recordClassIndex(60321);
    }

    public final void b() {
        DmtStatusView a2 = a(true);
        if (a2 != null) {
            a2.h();
        }
        this.f95194b = 2;
        d();
    }

    public final void e() {
        DmtStatusView a2 = a(true);
        if (a2 != null) {
            a2.setVisibility(0);
        }
        setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.a2));
    }

    public final void a() {
        this.f95194b = 0;
        if (this.s == -1) {
            this.s = System.currentTimeMillis();
        }
    }

    public final void c() {
        DmtStatusView a2 = a(true);
        if (a2 != null) {
            a2.g();
        }
        this.f95194b = 1;
        if (this.f95201j != null) {
            i();
        }
        if (this.s != -1 && !TextUtils.isEmpty(this.t)) {
            n.b("aweme_feed_load_more_duration", this.t, (float) (System.currentTimeMillis() - this.s));
            this.s = -1;
        }
    }

    public final void d() {
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.d();
        }
        this.f95194b = -1;
        if (this.f95201j != null) {
            i();
        }
        if (this.s != -1 && !TextUtils.isEmpty(this.t)) {
            n.b("aweme_feed_load_more_duration", this.t, (float) (System.currentTimeMillis() - this.s));
            this.s = -1;
        }
    }

    public final void g() {
        final int i2 = ((int) (((float) this.f95195c) * 1.5f)) / 100;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.AnonymousClass4 */

            static {
                Covode.recordClassIndex(60325);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i2 = i2 * (intValue - LoadMoreFrameLayout.this.f95198f);
                LoadMoreFrameLayout.this.f95198f = intValue;
                DmtStatusView a2 = LoadMoreFrameLayout.this.a(true);
                if (a2.e()) {
                    a2.f();
                } else {
                    LoadMoreFrameLayout.this.e();
                }
                LoadMoreFrameLayout.this.setViewPagerMarginTopByDelta(-i2);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.AnonymousClass5 */

            static {
                Covode.recordClassIndex(60326);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                LoadMoreFrameLayout.this.h();
            }

            public final void onAnimationStart(Animator animator) {
                LoadMoreFrameLayout.this.f95198f = 0;
            }
        });
        ofInt.start();
    }

    private void i() {
        this.r = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int viewPagerMarginTop = getViewPagerMarginTop();
        this.r.setDuration(200L);
        this.r.setInterpolator(new DecelerateInterpolator());
        this.r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.AnonymousClass2 */

            static {
                Covode.recordClassIndex(60323);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                if (animatedFraction == 1.0f) {
                    i2 = -viewPagerMarginTop;
                } else {
                    double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                    double d2 = (double) viewPagerMarginTop;
                    Double.isNaN(d2);
                    double d3 = pow * d2;
                    double viewPagerMarginTop2 = (double) LoadMoreFrameLayout.this.getViewPagerMarginTop();
                    Double.isNaN(viewPagerMarginTop2);
                    i2 = (int) (d3 - viewPagerMarginTop2);
                }
                loadMoreFrameLayout.setViewPagerMarginTopByDelta(i2);
            }
        });
        this.r.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.AnonymousClass3 */

            static {
                Covode.recordClassIndex(60324);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                LoadMoreFrameLayout.this.setBackground(null);
            }
        });
        this.r.start();
        f();
    }

    public final void h() {
        this.r = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int viewPagerMarginTop = getViewPagerMarginTop();
        int i2 = ((this.f95195c + viewPagerMarginTop) * -200) / this.q;
        if (i2 < 0) {
            i2 = 200;
        }
        this.r.setDuration((long) i2);
        this.r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.AnonymousClass6 */

            static {
                Covode.recordClassIndex(60327);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                if (animatedFraction == 1.0f) {
                    i2 = -(viewPagerMarginTop + loadMoreFrameLayout.f95195c);
                } else {
                    double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                    double d2 = (double) (viewPagerMarginTop + LoadMoreFrameLayout.this.f95195c);
                    Double.isNaN(d2);
                    double d3 = pow * d2;
                    double viewPagerMarginTop2 = (double) (LoadMoreFrameLayout.this.getViewPagerMarginTop() + LoadMoreFrameLayout.this.f95195c);
                    Double.isNaN(viewPagerMarginTop2);
                    i2 = (int) (d3 - viewPagerMarginTop2);
                }
                loadMoreFrameLayout.setViewPagerMarginTopByDelta(i2);
            }
        });
        this.r.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.AnonymousClass7 */

            static {
                Covode.recordClassIndex(60328);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (LoadMoreFrameLayout.this.f95193a != null && LoadMoreFrameLayout.this.f95194b == -1) {
                    LoadMoreFrameLayout.this.f95193a.a();
                }
            }
        });
        this.r.start();
    }

    public void setEnterFromPage(String str) {
        this.z = str;
    }

    public void setLabel(String str) {
        this.t = str;
    }

    public void setLoadMoreListener(al alVar) {
        this.f95193a = alVar;
    }

    public void setOnGestureTriggerExit(a aVar) {
        this.y = aVar;
    }

    public void setOnLoadMoreUiListener(b bVar) {
        this.x = bVar;
    }

    public void setOnScrolledListener(c cVar) {
        this.A = cVar;
    }

    public LoadMoreFrameLayout(Context context) {
        this(context, null);
    }

    public void setLoadMoreEmptyView(View view) {
        this.w = view;
        this.f95200i = null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(9633);
        super.onDraw(canvas);
        MethodCollector.o(9633);
    }

    public void setBottomViewBackground(Drawable drawable) {
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.setBackgroundDrawable(drawable);
        } else {
            this.v = drawable;
        }
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f95192g) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public void setViewPagerMarginTopByDelta(int i2) {
        com.ss.android.ugc.aweme.common.widget.c cVar = this.f95201j;
        if (cVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cVar.getLayoutParams();
            marginLayoutParams.topMargin += i2;
            marginLayoutParams.bottomMargin = -marginLayoutParams.topMargin;
            c cVar2 = this.A;
            if (cVar2 != null) {
                cVar2.a(marginLayoutParams.topMargin);
            }
            this.f95201j.setLayoutParams(marginLayoutParams);
        }
    }

    public final DmtStatusView a(boolean z2) {
        MethodCollector.i(9636);
        if (this.f95200i == null && z2 && this.u) {
            try {
                this.f95200i = new DmtStatusView(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, com.ss.android.ugc.aweme.base.utils.n.a(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, com.ss.android.ugc.aweme.base.utils.n.a(49.0d));
                addView(this.f95200i, 0, layoutParams);
                if (this.w == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.bjc, (ViewGroup) null);
                    textView.setGravity(17);
                    textView.setTextColor(androidx.core.content.b.c(getContext(), R.color.ac));
                    this.w = textView;
                }
                DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
                a2.a(new View.OnClickListener() {
                    /* class com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(60322);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        if (LoadMoreFrameLayout.this.f95193a != null) {
                            LoadMoreFrameLayout.this.f95193a.a();
                        }
                    }
                });
                if (!b.C1864b.f79875a || !a(this.z)) {
                    a2.b(this.w);
                }
                this.f95200i.setBuilder(a2);
                Drawable drawable = this.v;
                if (drawable != null) {
                    this.f95200i.setBackgroundDrawable(drawable);
                }
            } catch (Exception unused) {
                this.f95200i = null;
                this.v = null;
            }
        }
        DmtStatusView dmtStatusView = this.f95200i;
        if (dmtStatusView != null && dmtStatusView.e()) {
            this.f95194b = -1;
        }
        DmtStatusView dmtStatusView2 = this.f95200i;
        MethodCollector.o(9636);
        return dmtStatusView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r1 != 3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if (r5 <= 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        if (r5 < 0) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        r6 = -r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void a(com.ss.android.ugc.aweme.common.widget.c cVar, com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b bVar) {
        this.f95201j = cVar;
        this.f95202k = bVar;
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LoadMoreFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9486);
        this.f95194b = -1;
        this.s = -1;
        this.f95196d = g.f95270a;
        this.f95197e = h.f95271a;
        this.f95203l = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f95195c = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.q = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
        MethodCollector.o(9486);
    }
}
