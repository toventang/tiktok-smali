package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.common.widget.c;
import com.zhiliaoapp.musically.R;

public class LoadMoreFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public c f106283a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b f106284b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.commonfeed.a f106285c;

    /* renamed from: d  reason: collision with root package name */
    public int f106286d;

    /* renamed from: e  reason: collision with root package name */
    public int f106287e;

    /* renamed from: f  reason: collision with root package name */
    public long f106288f;

    /* renamed from: g  reason: collision with root package name */
    public String f106289g;

    /* renamed from: h  reason: collision with root package name */
    final h.f.a.a<String> f106290h;

    /* renamed from: i  reason: collision with root package name */
    final h.f.a.a<String> f106291i;

    /* renamed from: j  reason: collision with root package name */
    private DmtStatusView f106292j;

    /* renamed from: k  reason: collision with root package name */
    private int f106293k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f106294l;

    /* renamed from: m  reason: collision with root package name */
    private float f106295m;
    private float n;
    private int o;
    private ValueAnimator p;
    private boolean q;
    private Drawable r;
    private View s;
    private a t;
    private b u;

    public interface a {
        static {
            Covode.recordClassIndex(67954);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(67955);
        }
    }

    static {
        Covode.recordClassIndex(67948);
    }

    private void c() {
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.setVisibility(8);
        }
    }

    public int getViewPagerMarginTop() {
        c cVar = this.f106283a;
        if (cVar == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) cVar.getLayoutParams()).topMargin;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.q = true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a() {
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.d();
        }
        this.f106286d = -1;
        if (this.f106283a != null) {
            b();
        }
        if (this.f106288f != -1 && !TextUtils.isEmpty(this.f106289g)) {
            this.f106288f = -1;
        }
    }

    public final void b() {
        this.p = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int viewPagerMarginTop = getViewPagerMarginTop();
        int i2 = (viewPagerMarginTop * -200) / this.o;
        if (i2 < 0) {
            i2 = 200;
        }
        this.p.setDuration((long) i2);
        this.p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout.AnonymousClass2 */

            static {
                Covode.recordClassIndex(67950);
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
        this.p.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout.AnonymousClass3 */

            static {
                Covode.recordClassIndex(67951);
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
        this.p.start();
        c();
    }

    public void setLabel(String str) {
        this.f106289g = str;
    }

    public void setLoadMoreListener(com.ss.android.ugc.aweme.kids.commonfeed.a aVar) {
        this.f106285c = aVar;
    }

    public void setOnLoadMoreUiListener(a aVar) {
        this.t = aVar;
    }

    public void setOnScrolledListener(b bVar) {
        this.u = bVar;
    }

    public void setLoadMoreEmptyView(View view) {
        this.s = view;
        this.f106292j = null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(5739);
        super.onDraw(canvas);
        MethodCollector.o(5739);
    }

    public void setBottomViewBackground(Drawable drawable) {
        DmtStatusView a2 = a(false);
        if (a2 != null) {
            a2.setBackgroundDrawable(drawable);
        } else {
            this.r = drawable;
        }
    }

    public void setViewPagerMarginTopByDelta(int i2) {
        c cVar = this.f106283a;
        if (cVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cVar.getLayoutParams();
            marginLayoutParams.topMargin += i2;
            marginLayoutParams.bottomMargin = -marginLayoutParams.topMargin;
            if (this.u != null) {
                int i3 = marginLayoutParams.topMargin;
            }
            this.f106283a.setLayoutParams(marginLayoutParams);
        }
    }

    public final DmtStatusView a(boolean z) {
        MethodCollector.i(5749);
        if (this.f106292j == null && z && this.q) {
            try {
                this.f106292j = new DmtStatusView(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, n.a(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, n.a(49.0d));
                addView(this.f106292j, 0, layoutParams);
                if (this.s == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.bjc, (ViewGroup) null);
                    textView.setGravity(17);
                    textView.setTextColor(androidx.core.content.b.c(getContext(), R.color.ac));
                    this.s = textView;
                }
                this.f106292j.setBuilder(DmtStatusView.a.a(getContext()).a(new View.OnClickListener() {
                    /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(67949);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        if (LoadMoreFrameLayout.this.f106285c != null) {
                            LoadMoreFrameLayout.this.f106285c.a();
                        }
                    }
                }).b(this.s));
                Drawable drawable = this.r;
                if (drawable != null) {
                    this.f106292j.setBackgroundDrawable(drawable);
                }
            } catch (Exception e2) {
                this.f106292j = null;
                this.r = null;
                e2.printStackTrace();
            }
        }
        DmtStatusView dmtStatusView = this.f106292j;
        if (dmtStatusView != null && dmtStatusView.e()) {
            this.f106286d = -1;
        }
        DmtStatusView dmtStatusView2 = this.f106292j;
        MethodCollector.o(5749);
        return dmtStatusView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r1 != 3) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar;
        com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b bVar;
        int i2;
        DmtStatusView a2 = a(true);
        if (a2 == null || (cVar = this.f106283a) == null || cVar.getAdapter() == null || this.f106283a.getAdapter().getCount() == 0 || this.f106283a.getAdapter().getCount() - 1 != this.f106283a.getCurrentItem() || this.f106283a.a() || ((bVar = this.f106284b) != null && bVar.a())) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.f106294l) {
                        b();
                    }
                } else if (this.f106294l) {
                    float y = motionEvent.getY();
                    int i3 = (int) ((y - this.n) / 1.0f);
                    this.n = y;
                    int viewPagerMarginTop = getViewPagerMarginTop();
                    int i4 = viewPagerMarginTop + i3;
                    if (i4 > 0) {
                        i3 = -viewPagerMarginTop;
                    }
                    if (i4 >= (-this.o)) {
                        setViewPagerMarginTopByDelta(i3);
                        if (a2.e()) {
                            a2.f();
                        } else {
                            DmtStatusView a3 = a(true);
                            if (a3 != null) {
                                a3.setVisibility(0);
                            }
                            setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.a2));
                        }
                    }
                }
            } else if (this.f106294l) {
                if (getViewPagerMarginTop() > (-this.f106287e) || (i2 = this.f106286d) == 1 || i2 == 2) {
                    b();
                } else {
                    this.p = ValueAnimator.ofFloat(0.0f, 1.0f);
                    final int viewPagerMarginTop2 = getViewPagerMarginTop();
                    int i5 = ((this.f106287e + viewPagerMarginTop2) * -200) / this.o;
                    if (i5 < 0) {
                        i5 = 200;
                    }
                    this.p.setDuration((long) i5);
                    this.p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(67952);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i2;
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                            LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                            if (animatedFraction == 1.0f) {
                                i2 = -(viewPagerMarginTop + loadMoreFrameLayout.f106287e);
                            } else {
                                double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                                double d2 = (double) (viewPagerMarginTop2 + LoadMoreFrameLayout.this.f106287e);
                                Double.isNaN(d2);
                                double d3 = pow * d2;
                                double viewPagerMarginTop2 = (double) (LoadMoreFrameLayout.this.getViewPagerMarginTop() + LoadMoreFrameLayout.this.f106287e);
                                Double.isNaN(viewPagerMarginTop2);
                                i2 = (int) (d3 - viewPagerMarginTop2);
                            }
                            loadMoreFrameLayout.setViewPagerMarginTopByDelta(i2);
                        }
                    });
                    this.p.addListener(new Animator.AnimatorListener() {
                        /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(67953);
                        }

                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (LoadMoreFrameLayout.this.f106285c != null && LoadMoreFrameLayout.this.f106286d == -1) {
                                LoadMoreFrameLayout.this.f106285c.a();
                            }
                        }
                    });
                    this.p.start();
                }
            }
            this.f106294l = false;
        } else {
            this.f106294l = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LoadMoreFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(5738);
        this.f106286d = -1;
        this.f106288f = -1;
        this.f106290h = b.f106372a;
        this.f106291i = c.f106373a;
        this.f106293k = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f106287e = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.o = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
        MethodCollector.o(5738);
    }
}
