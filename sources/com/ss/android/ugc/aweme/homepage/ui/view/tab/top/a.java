package com.ss.android.ugc.aweme.homepage.ui.view.tab.top;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.g.f;
import androidx.core.h.s;
import androidx.core.h.v;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.f.b.z;
import h.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

@ViewPager.a
public final class a extends HorizontalScrollView {
    private static final f.a<f> B = new f.c(16);

    /* renamed from: i  reason: collision with root package name */
    public static final Interpolator f99640i = new androidx.g.a.a.b();

    /* renamed from: j  reason: collision with root package name */
    public static final C2437a f99641j = new C2437a((byte) 0);
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    public final e f99642a;

    /* renamed from: b  reason: collision with root package name */
    public int f99643b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f99644c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<c> f99645d;

    /* renamed from: e  reason: collision with root package name */
    g f99646e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f99647f;

    /* renamed from: g  reason: collision with root package name */
    public final int f99648g;

    /* renamed from: h  reason: collision with root package name */
    public b f99649h;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<f> f99650k;

    /* renamed from: l  reason: collision with root package name */
    private f f99651l;

    /* renamed from: m  reason: collision with root package name */
    private int f99652m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private ValueAnimator t;
    private final float u;
    private final float v;
    private float w;
    private final f.a<h> x;
    private boolean y;
    private boolean z;

    public interface b {
        static {
            Covode.recordClassIndex(63536);
        }

        void a(f fVar);
    }

    public interface c {
        static {
            Covode.recordClassIndex(63537);
        }

        void a(f fVar);

        void b(f fVar);
    }

    public static final class f {

        /* renamed from: f  reason: collision with root package name */
        public static final C2441a f99685f = new C2441a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public int f99686a = -1;

        /* renamed from: b  reason: collision with root package name */
        public View f99687b;

        /* renamed from: c  reason: collision with root package name */
        public a f99688c;

        /* renamed from: d  reason: collision with root package name */
        public h f99689d;

        /* renamed from: e  reason: collision with root package name */
        public Object f99690e;

        static {
            Covode.recordClassIndex(63549);
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$f$a  reason: collision with other inner class name */
        public static final class C2441a {
            static {
                Covode.recordClassIndex(63550);
            }

            private C2441a() {
            }

            public /* synthetic */ C2441a(byte b2) {
                this();
            }
        }

        private void c() {
            h hVar = this.f99689d;
            if (hVar != null) {
                hVar.a();
            }
        }

        public final void a() {
            a aVar = this.f99688c;
            if (aVar != null) {
                aVar.a((a) this, (f) true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout".toString());
        }

        public final boolean b() {
            a aVar = this.f99688c;
            if (aVar == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout".toString());
            } else if (aVar.getSelectedTabPosition() == this.f99686a) {
                return true;
            } else {
                return false;
            }
        }

        public final f a(View view) {
            this.f99687b = view;
            c();
            return this;
        }
    }

    public a(Context context, char c2) {
        this(context, (byte) 0);
    }

    public final void addView(View view) {
        l.d(view, "");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2) {
        l.d(view, "");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        l.d(view, "");
        l.d(layoutParams, "");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        l.d(view, "");
        l.d(layoutParams, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$a  reason: collision with other inner class name */
    public static final class C2437a {
        static {
            Covode.recordClassIndex(63535);
        }

        private C2437a() {
        }

        public /* synthetic */ C2437a(byte b2) {
            this();
        }
    }

    public class d extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public int f99653a;

        /* renamed from: b  reason: collision with root package name */
        public int f99654b;

        /* renamed from: c  reason: collision with root package name */
        public int f99655c;

        /* renamed from: d  reason: collision with root package name */
        float f99656d;

        /* renamed from: e  reason: collision with root package name */
        public u<Float, Float, ? extends Paint> f99657e;

        /* renamed from: g  reason: collision with root package name */
        private final Paint f99659g;

        /* renamed from: h  reason: collision with root package name */
        private int f99660h = -1;

        /* renamed from: i  reason: collision with root package name */
        private float f99661i;

        /* renamed from: j  reason: collision with root package name */
        private int f99662j = -1;

        /* renamed from: k  reason: collision with root package name */
        private int f99663k = -1;

        /* renamed from: l  reason: collision with root package name */
        private int f99664l = -1;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f99665m;
        private int n = Integer.MAX_VALUE;
        private boolean o;
        private int p;
        private LinearGradient q;
        private LinearGradient r;
        private Paint s;
        private PorterDuffXfermode t;
        private int u = -1;
        private float v;

        static {
            Covode.recordClassIndex(63538);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.u<java.lang.Float, java.lang.Float, ? extends android.graphics.Paint>, h.u<java.lang.Float, java.lang.Float, android.graphics.Paint> */
        public final u<Float, Float, Paint> getBarrierTriple() {
            return this.f99657e;
        }

        public final PorterDuffXfermode getMDuffXferMode() {
            return this.t;
        }

        public final boolean getMIsDragged() {
            return this.o;
        }

        public final int getMLayerId() {
            return this.u;
        }

        public final LinearGradient getMLeftGradient() {
            return this.q;
        }

        public final Paint getMOverBorderPaint() {
            return this.s;
        }

        public final LinearGradient getMRightGradient() {
            return this.r;
        }

        /* access modifiers changed from: protected */
        public final Paint getMSelectedIndicatorPaint() {
            return this.f99659g;
        }

        public final int getMSelectedPosition() {
            return this.f99660h;
        }

        public final float getMSelectionOffset() {
            return this.f99661i;
        }

        public final float getStripMargin() {
            return this.v;
        }

        public final float getIndicatorPosition() {
            return ((float) this.f99660h) + this.f99661i;
        }

        /* access modifiers changed from: protected */
        public final void a() {
            int i2;
            View childAt = getChildAt(this.f99660h);
            int i3 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f99654b > 0) {
                    int abs = Math.abs(i2 - i3) / 2;
                    int i4 = this.f99655c;
                    i3 = (i3 + abs) - i4;
                    i2 = (i2 - abs) + i4;
                }
                if (this.f99661i > 0.0f && this.f99660h < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f99660h + 1);
                    l.b(childAt2, "");
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (this.f99654b > 0) {
                        int abs2 = Math.abs(right - left) / 2;
                        int i5 = this.f99655c;
                        left = (left + abs2) - i5;
                        right = (right - abs2) + i5;
                    }
                    float f2 = this.f99661i;
                    i3 = (int) ((((float) left) * f2) + ((1.0f - f2) * ((float) i3)));
                    i2 = (int) ((((float) right) * f2) + ((1.0f - f2) * ((float) i2)));
                }
            }
            a(i3, i2);
        }

        public final void setBarrierTriple(u<Float, Float, ? extends Paint> uVar) {
            this.f99657e = uVar;
        }

        public final void setMDuffXferMode(PorterDuffXfermode porterDuffXfermode) {
            this.t = porterDuffXfermode;
        }

        public final void setMIsDragged(boolean z) {
            this.o = z;
        }

        public final void setMLayerId(int i2) {
            this.u = i2;
        }

        public final void setMLeftGradient(LinearGradient linearGradient) {
            this.q = linearGradient;
        }

        public final void setMOverBorderPaint(Paint paint) {
            this.s = paint;
        }

        public final void setMRightGradient(LinearGradient linearGradient) {
            this.r = linearGradient;
        }

        public final void setMSelectedPosition(int i2) {
            this.f99660h = i2;
        }

        public final void setMSelectionOffset(float f2) {
            this.f99661i = f2;
        }

        public final void setSelectedTabHorizontalPadding(int i2) {
            this.p = i2;
        }

        public final void setStripMargin(float f2) {
            this.v = f2;
        }

        public final void setTabStripMargin(float f2) {
            this.v = f2;
            v.c(this);
        }

        public final void setSelectedIndicatorHeight(int i2) {
            if (this.f99653a != i2) {
                this.f99653a = i2;
                v.c(this);
            }
        }

        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f99671a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f99672b;

            static {
                Covode.recordClassIndex(63540);
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                this.f99671a.setMSelectedPosition(this.f99672b);
                this.f99671a.setMSelectionOffset(0.0f);
            }

            b(d dVar, int i2) {
                this.f99671a = dVar;
                this.f99672b = i2;
            }
        }

        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.f99662j != i2) {
                requestLayout();
                this.f99662j = i2;
            }
        }

        public final void setSelectedIndicatorColor(int i2) {
            if (this.f99659g.getColor() != i2) {
                this.f99659g.setColor(i2);
                v.c(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$d$a  reason: collision with other inner class name */
        public static final class C2438a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f99666a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z.c f99667b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z.c f99668c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f99669d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f99670e;

            static {
                Covode.recordClassIndex(63539);
            }

            C2438a(d dVar, z.c cVar, z.c cVar2, int i2, int i3) {
                this.f99666a = dVar;
                this.f99667b = cVar;
                this.f99668c = cVar2;
                this.f99669d = i2;
                this.f99670e = i3;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.b(valueAnimator, "");
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (this.f99666a.f99654b > 0) {
                    int abs = Math.abs(this.f99667b.element - this.f99668c.element) / 2;
                    z.c cVar = this.f99668c;
                    cVar.element = (cVar.element + abs) - this.f99666a.f99655c;
                    z.c cVar2 = this.f99667b;
                    cVar2.element = (cVar2.element - abs) + this.f99666a.f99655c;
                }
                this.f99666a.a(d.a(this.f99669d, this.f99668c.element, animatedFraction), d.a(this.f99670e, this.f99667b.element, animatedFraction));
            }
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            MethodCollector.i(3376);
            super.onDraw(canvas);
            int i2 = -1;
            if (a.this.getMMode() == 0 && this.f99656d > 0.0f) {
                a aVar = a.this;
                if ((aVar.canScrollHorizontally(-1) || aVar.canScrollHorizontally(1)) && canvas != null) {
                    i2 = canvas.saveLayer((float) a.this.getScrollX(), 0.0f, ((float) a.this.getScrollX()) + ((float) getWidth()), (float) getHeight(), this.s, 31);
                }
            }
            this.u = i2;
            MethodCollector.o(3376);
        }

        public final void setOverBorderWidth(float f2) {
            this.f99656d = f2;
            if (f2 > 0.0f) {
                this.q = new LinearGradient(0.0f, 0.0f, f2, 0.0f, new int[]{0, 0, -16777216}, new float[]{0.0f, 0.3f, 1.0f}, Shader.TileMode.CLAMP);
                this.r = new LinearGradient(0.0f, 0.0f, f2, 0.0f, new int[]{-16777216, 0, 0}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
                this.u = -1;
                if (this.s == null) {
                    this.s = new Paint(1);
                }
                if (this.t == null) {
                    this.t = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
                }
            }
        }

        public void draw(Canvas canvas) {
            int i2;
            float f2;
            float f3;
            float f4;
            float f5;
            Paint paint;
            Float second;
            Float first;
            Float first2;
            Float second2;
            int i3;
            l.d(canvas, "");
            d dVar = this;
            super.draw(canvas);
            int i4 = dVar.f99663k;
            if (i4 >= 0 && (i3 = dVar.f99664l) > i4) {
                int i5 = dVar.p;
                canvas.drawRect(((float) i4) + ((float) i5), (((float) dVar.getHeight()) - ((float) dVar.f99653a)) + dVar.v, ((float) i3) - ((float) i5), ((float) dVar.getHeight()) + dVar.v, dVar.f99659g);
            }
            int childCount = dVar.getChildCount();
            if (childCount > 1 && dVar.f99657e != null) {
                dVar = dVar;
                if (v.e(dVar) == 1) {
                    i2 = 0;
                    childCount--;
                } else {
                    i2 = 1;
                }
                while (i2 < childCount) {
                    float height = (float) dVar.getHeight();
                    u<Float, Float, ? extends Paint> uVar = dVar.f99657e;
                    if (uVar == null || (second2 = uVar.getSecond()) == null) {
                        f2 = 0.0f;
                    } else {
                        f2 = second2.floatValue();
                    }
                    float f6 = (height - f2) / 2.0f;
                    View childAt = dVar.getChildAt(i2);
                    u<Float, Float, ? extends Paint> uVar2 = dVar.f99657e;
                    if (uVar2 == null || (first2 = uVar2.getFirst()) == null) {
                        f3 = 0.0f;
                    } else {
                        f3 = first2.floatValue();
                    }
                    l.b(childAt, "");
                    float left = ((float) childAt.getLeft()) - (f3 / 2.0f);
                    float left2 = (float) childAt.getLeft();
                    u<Float, Float, ? extends Paint> uVar3 = dVar.f99657e;
                    if (uVar3 == null || (first = uVar3.getFirst()) == null) {
                        f4 = 0.0f;
                    } else {
                        f4 = first.floatValue();
                    }
                    float f7 = left2 + f4;
                    u<Float, Float, ? extends Paint> uVar4 = dVar.f99657e;
                    if (uVar4 == null || (second = uVar4.getSecond()) == null) {
                        f5 = 0.0f;
                    } else {
                        f5 = second.floatValue();
                    }
                    float f8 = f6 + f5;
                    u<Float, Float, ? extends Paint> uVar5 = dVar.f99657e;
                    if (uVar5 != null) {
                        paint = (Paint) uVar5.getThird();
                        if (paint != null) {
                            canvas.drawRect(left, f6, f7, f8, paint);
                            i2++;
                        }
                    } else {
                        paint = null;
                    }
                    l.b();
                    canvas.drawRect(left, f6, f7, f8, paint);
                    i2++;
                }
            }
            if (dVar.f99656d > 0.0f && dVar.u > 0) {
                Paint paint2 = dVar.s;
                if (paint2 != null) {
                    paint2.setXfermode(dVar.t);
                }
                canvas.save();
                canvas.translate((float) a.this.getScrollX(), 0.0f);
                if (a.this.canScrollHorizontally(-1)) {
                    Paint paint3 = dVar.s;
                    if (paint3 != null) {
                        paint3.setShader(dVar.q);
                    }
                    if (dVar.s != null) {
                        float f9 = dVar.f99656d;
                        float height2 = (float) dVar.getHeight();
                        Paint paint4 = dVar.s;
                        if (paint4 == null) {
                            l.b();
                        }
                        canvas.drawRect(0.0f, 0.0f, f9, height2, paint4);
                    }
                }
                if (a.this.canScrollHorizontally(1)) {
                    canvas.translate(((float) a.this.getWidth()) - dVar.f99656d, 0.0f);
                    Paint paint5 = dVar.s;
                    if (paint5 != null) {
                        paint5.setShader(dVar.r);
                    }
                    if (dVar.s != null) {
                        float f10 = dVar.f99656d;
                        float height3 = (float) dVar.getHeight();
                        Paint paint6 = dVar.s;
                        if (paint6 == null) {
                            l.b();
                        }
                        canvas.drawRect(0.0f, 0.0f, f10, height3, paint6);
                    }
                }
                Paint paint7 = dVar.s;
                if (paint7 != null) {
                    paint7.setXfermode(null);
                }
                canvas.restore();
                canvas.restoreToCount(dVar.u);
            }
        }

        public final void a(int i2, float f2) {
            ValueAnimator valueAnimator = this.f99665m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f99665m;
                if (valueAnimator2 == null) {
                    l.b();
                }
                valueAnimator2.cancel();
            }
            this.f99660h = i2;
            this.f99661i = f2;
            a();
        }

        public d(Context context) {
            super(context);
            MethodCollector.i(3729);
            setWillNotDraw(false);
            this.f99659g = new Paint();
            MethodCollector.o(3729);
        }

        public final void a(int i2, int i3) {
            if (i2 != this.f99663k || i3 != this.f99664l) {
                this.f99663k = i2;
                this.f99664l = i3;
                v.c(this);
            }
        }

        public final void b(int i2, int i3) {
            boolean z;
            int i4;
            int i5;
            int i6;
            ValueAnimator valueAnimator = this.f99665m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f99665m;
                if (valueAnimator2 == null) {
                    l.b();
                }
                valueAnimator2.cancel();
            }
            if (v.e(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i2);
            if (childAt == null) {
                a();
                return;
            }
            z.c cVar = new z.c();
            cVar.element = childAt.getLeft();
            z.c cVar2 = new z.c();
            cVar2.element = childAt.getRight();
            if (Math.abs(i2 - this.f99660h) <= 1) {
                i4 = this.f99663k;
                i6 = this.f99664l;
            } else {
                int b2 = a.this.b(24);
                if (i2 < this.f99660h) {
                    if (!z) {
                        i5 = cVar2.element;
                    }
                    i4 = cVar.element - b2;
                    i6 = i4;
                } else {
                    if (z) {
                        i5 = cVar2.element;
                    }
                    i4 = cVar.element - b2;
                    i6 = i4;
                }
                i4 = i5 + b2;
                i6 = i4;
            }
            if (i4 != cVar.element || i6 != cVar2.element) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f99665m = valueAnimator3;
                valueAnimator3.setInterpolator(a.f99640i);
                valueAnimator3.setDuration((long) i3);
                valueAnimator3.setFloatValues(0.0f, 1.0f);
                valueAnimator3.addUpdateListener(new C2438a(this, cVar2, cVar, i4, i6));
                valueAnimator3.addListener(new b(this, i2));
                valueAnimator3.start();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
            if (r7 != false) goto L_0x00aa;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMeasure(int r12, int r13) {
            /*
            // Method dump skipped, instructions count: 391
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a.d.onMeasure(int, int):void");
        }

        public static int a(int i2, int i3, float f2) {
            return i2 + Math.round(f2 * ((float) (i3 - i2)));
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            MethodCollector.i(5852);
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f99665m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
                MethodCollector.o(5852);
                return;
            }
            ValueAnimator valueAnimator2 = this.f99665m;
            if (valueAnimator2 == null) {
                l.b();
            }
            valueAnimator2.cancel();
            ValueAnimator valueAnimator3 = this.f99665m;
            if (valueAnimator3 == null) {
                l.b();
            }
            long duration = valueAnimator3.getDuration();
            int i6 = this.f99660h;
            ValueAnimator valueAnimator4 = this.f99665m;
            if (valueAnimator4 == null) {
                l.b();
            }
            b(i6, Math.round((1.0f - valueAnimator4.getAnimatedFraction()) * ((float) duration)));
            MethodCollector.o(5852);
        }
    }

    public final class h extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private f f99697b;

        /* renamed from: c  reason: collision with root package name */
        private View f99698c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f99699d;

        static {
            Covode.recordClassIndex(63552);
        }

        public final TextView getMCustomTextView$homepage_common_release() {
            return this.f99699d;
        }

        public final f getTab() {
            return this.f99697b;
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f99697b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (a.this.f99649h != null) {
                b bVar = a.this.f99649h;
                if (bVar == null) {
                    l.b();
                }
                bVar.a(this.f99697b);
            } else {
                f fVar = this.f99697b;
                if (fVar == null) {
                    l.b();
                }
                fVar.a();
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                r6 = 5477(0x1565, float:7.675E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
                com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$f r5 = r7.f99697b
                r4 = 0
                if (r5 == 0) goto L_0x0058
                android.view.View r3 = r5.f99687b
            L_0x000c:
                r2 = 1
                if (r3 == 0) goto L_0x004c
                android.view.ViewParent r1 = r3.getParent()
                if (r1 != 0) goto L_0x0041
            L_0x0015:
                r7.addView(r3)
            L_0x0018:
                r7.f99698c = r3
                r0 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r1 = r3.findViewById(r0)
                boolean r0 = r1 instanceof android.widget.TextView
                if (r0 != 0) goto L_0x003f
            L_0x0025:
                android.widget.TextView r4 = (android.widget.TextView) r4
                r7.f99699d = r4
                if (r4 == 0) goto L_0x002e
                r4.setMaxLines(r2)
            L_0x002e:
                if (r5 == 0) goto L_0x003d
                boolean r0 = r5.b()
                if (r0 == 0) goto L_0x003d
            L_0x0036:
                r7.setSelected(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
                return
            L_0x003d:
                r2 = 0
                goto L_0x0036
            L_0x003f:
                r4 = r1
                goto L_0x0025
            L_0x0041:
                r0 = r7
                if (r1 == r0) goto L_0x0018
                if (r1 == 0) goto L_0x0015
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r1.removeView(r3)
                goto L_0x0015
            L_0x004c:
                android.view.View r0 = r7.f99698c
                if (r0 == 0) goto L_0x0055
                r7.removeView(r0)
                r7.f99698c = r4
            L_0x0055:
                r7.f99699d = r4
                goto L_0x002e
            L_0x0058:
                r3 = r4
                goto L_0x000c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a.h.a():void");
        }

        public final void setMCustomTextView$homepage_common_release(TextView textView) {
            this.f99699d = textView;
        }

        public final void a(f fVar) {
            if (!l.a(fVar, this.f99697b)) {
                this.f99697b = fVar;
            }
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            l.d(accessibilityEvent, "");
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.a$b");
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            l.d(accessibilityNodeInfo, "");
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.a$b");
        }

        public final void setTab(f fVar) {
            if (!l.a(fVar, this.f99697b)) {
                this.f99697b = fVar;
                a();
            }
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                int i2 = Build.VERSION.SDK_INT;
            }
            View view = this.f99698c;
            if (view != null) {
                view.setSelected(z);
            }
            TextView textView = this.f99699d;
            if (textView != null) {
                textView.setSelected(z);
            }
        }

        public h(Context context) {
            super(context);
            MethodCollector.i(5485);
            if (a.this.getMTabBackgroundResId() != 0) {
                if (context == null) {
                    l.b();
                }
                v.a(this, androidx.appcompat.a.a.a.b(context, a.this.getMTabBackgroundResId()));
            }
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            v.a(this, s.a(getContext()));
            MethodCollector.o(5485);
        }

        public final void onMeasure(int i2, int i3) {
            MethodCollector.i(5458);
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int i4 = a.this.f99643b;
            if (i4 > 0 && (mode == 0 || size > i4)) {
                i2 = View.MeasureSpec.makeMeasureSpec(a.this.f99643b, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            MethodCollector.o(5458);
        }
    }

    public final boolean getEnableAnimation() {
        return this.z;
    }

    public final int getMCustomTabResId() {
        return this.s;
    }

    public final int getMMode() {
        return this.r;
    }

    public final g getMPageChangeListener() {
        return this.f99646e;
    }

    public final int getMTabBackgroundResId() {
        return this.n;
    }

    public final int getMTabGravity() {
        return this.q;
    }

    public final boolean getRepeatAnim() {
        return this.y;
    }

    public final boolean getSwipeMode() {
        return this.A;
    }

    public final int getTabGravity() {
        return this.q;
    }

    public final int getTabMode() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void a(boolean z2) {
        int childCount = this.f99642a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f99642a.getChildAt(i2);
            l.b(childAt, "");
            childAt.setMinimumWidth(getTabMinWidth());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            a((LinearLayout.LayoutParams) layoutParams);
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99700a;

        static {
            Covode.recordClassIndex(63553);
        }

        i(a aVar) {
            this.f99700a = aVar;
        }

        public final void run() {
            this.f99700a.requestLayout();
        }
    }

    private final float getScrollPosition() {
        return this.f99642a.getIndicatorPosition();
    }

    private final int getTabMinWidth() {
        int i2 = this.o;
        if (i2 != -1) {
            return i2;
        }
        return 0;
    }

    public final int getTabCount() {
        return this.f99650k.size();
    }

    public final int getTabStripLeftPadding() {
        return this.f99642a.getPaddingLeft();
    }

    public final int getTabStripRightPadding() {
        return this.f99642a.getPaddingRight();
    }

    private final LinearLayout.LayoutParams b() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    public final int getSelectedTabPosition() {
        f fVar = this.f99651l;
        if (fVar != null) {
            return fVar.f99686a;
        }
        return -1;
    }

    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(63534);
    }

    private final void d() {
        v.a(this.f99642a, 0, 0, 0, 0);
        int i2 = this.r;
        if (i2 == 0) {
            this.f99642a.setGravity(8388611);
        } else if (i2 == 1) {
            this.f99642a.setGravity(1);
        }
        a(true);
    }

    private final int getTabScrollRange() {
        return Math.max(0, ((this.f99642a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private final h a() {
        h hVar;
        f.a<h> aVar = this.x;
        if (aVar == null || (hVar = aVar.acquire()) == null) {
            hVar = new h(getContext());
        }
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        return hVar;
    }

    private final void c() {
        if (this.t == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.t = valueAnimator;
            valueAnimator.setInterpolator(f99640i);
            ValueAnimator valueAnimator2 = this.t;
            if (valueAnimator2 == null) {
                l.b();
            }
            valueAnimator2.setDuration(200L);
            ValueAnimator valueAnimator3 = this.t;
            if (valueAnimator3 == null) {
                l.b();
            }
            valueAnimator3.addUpdateListener(new j(this));
        }
    }

    private final int getDefaultHeight() {
        int size = this.f99650k.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.f99650k.get(i2);
            l.b(fVar, "");
            View view = fVar.f99687b;
            if (view != null && view.getHeight() > 58) {
                return 58;
            }
        }
        return 48;
    }

    private final void setTabMinWidth(int i2) {
        this.o = i2;
    }

    public final void setAutoFillWhenScrollable(boolean z2) {
        this.f99644c = z2;
    }

    public final void setCustomTabViewResId(int i2) {
        this.s = i2;
    }

    public final void setEnableAnimation(boolean z2) {
        this.z = z2;
    }

    public final void setMCustomTabResId(int i2) {
        this.s = i2;
    }

    public final void setMMode(int i2) {
        this.r = i2;
    }

    public final void setMPageChangeListener(g gVar) {
        this.f99646e = gVar;
    }

    public final void setMTabBackgroundResId(int i2) {
        this.n = i2;
    }

    public final void setMTabGravity(int i2) {
        this.q = i2;
    }

    public final void setOnTabClickListener(b bVar) {
        this.f99649h = bVar;
    }

    public final void setOverBorderOffset(float f2) {
        this.w = f2;
    }

    public final void setRepeatAnim(boolean z2) {
        this.y = z2;
    }

    public final void setSwipeMode(boolean z2) {
        this.A = z2;
    }

    public final void setTouchable(boolean z2) {
        this.f99647f = z2;
    }

    /* access modifiers changed from: package-private */
    public final class e extends d {

        /* renamed from: g  reason: collision with root package name */
        final float f99673g = 0.6f;

        /* renamed from: h  reason: collision with root package name */
        public final AnimatorSet f99674h = new AnimatorSet();

        /* access modifiers changed from: package-private */
        public static final class b implements TimeInterpolator {

            /* renamed from: a  reason: collision with root package name */
            public static final b f99678a = new b();

            static {
                Covode.recordClassIndex(63544);
            }

            b() {
            }

            public final float getInterpolation(float f2) {
                return f2 < 0.33333334f ? f2 * 1.5f : (f2 * 0.75f) + 0.25f;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class c implements TimeInterpolator {

            /* renamed from: a  reason: collision with root package name */
            public static final c f99679a = new c();

            static {
                Covode.recordClassIndex(63545);
            }

            c() {
            }

            public final float getInterpolation(float f2) {
                return f2 < 0.33333334f ? f2 * 1.5f : (f2 * 0.75f) + 0.25f;
            }
        }

        static {
            Covode.recordClassIndex(63541);
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e$a  reason: collision with other inner class name */
        public static final class C2439a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f99677a;

            static {
                Covode.recordClassIndex(63543);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C2439a(e eVar) {
                this.f99677a = eVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object obj;
                Paint mSelectedIndicatorPaint = this.f99677a.getMSelectedIndicatorPaint();
                if (valueAnimator != null) {
                    obj = valueAnimator.getAnimatedValue();
                } else {
                    obj = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
                mSelectedIndicatorPaint.setAlpha(((Integer) obj).intValue());
                v.c(this.f99677a);
            }
        }

        public static final class f extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f99684a;

            static {
                Covode.recordClassIndex(63548);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            f(e eVar) {
                this.f99684a = eVar;
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                if (a.this.getRepeatAnim()) {
                    this.f99684a.f99674h.start();
                }
            }
        }

        public static final class d implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f99680a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z.a f99681b;

            static {
                Covode.recordClassIndex(63546);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object obj;
                e eVar = this.f99680a;
                if (valueAnimator != null) {
                    obj = valueAnimator.getAnimatedValue();
                } else {
                    obj = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
                eVar.setMSelectionOffset(((Float) obj).floatValue());
                if (!this.f99681b.element) {
                    e eVar2 = this.f99680a;
                    eVar2.setMSelectionOffset(1.0f - eVar2.getMSelectionOffset());
                }
                this.f99680a.a();
                e eVar3 = this.f99680a;
                eVar3.b(eVar3.getMSelectedPosition(), this.f99680a.getMSelectionOffset());
            }

            d(e eVar, z.a aVar) {
                this.f99680a = eVar;
                this.f99681b = aVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e$e  reason: collision with other inner class name */
        public static final class C2440e implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f99682a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z.a f99683b;

            static {
                Covode.recordClassIndex(63547);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object obj;
                e eVar = this.f99682a;
                if (valueAnimator != null) {
                    obj = valueAnimator.getAnimatedValue();
                } else {
                    obj = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
                eVar.setMSelectionOffset(((Float) obj).floatValue());
                if (!this.f99683b.element) {
                    e eVar2 = this.f99682a;
                    eVar2.setMSelectionOffset(1.0f - eVar2.getMSelectionOffset());
                }
                this.f99682a.a();
                e eVar3 = this.f99682a;
                eVar3.b(eVar3.getMSelectedPosition(), this.f99682a.getMSelectionOffset());
            }

            C2440e(e eVar, z.a aVar) {
                this.f99682a = eVar;
                this.f99683b = aVar;
            }
        }

        public e(Context context) {
            super(context);
            getMSelectedIndicatorPaint().setShadowLayer((float) getHeight(), 0.0f, (float) getWidth(), Color.parseColor("#26000000"));
            a.this.f99645d.add(new c(this) {
                /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f99676a;

                static {
                    Covode.recordClassIndex(63542);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f99676a = r1;
                }

                @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a.c
                public final void b(f fVar) {
                    h hVar;
                    TextView mCustomTextView$homepage_common_release;
                    if (!a.this.getSwipeMode()) {
                        this.f99676a.a(fVar, true);
                    }
                    if (fVar != null && (hVar = fVar.f99689d) != null && (mCustomTextView$homepage_common_release = hVar.getMCustomTextView$homepage_common_release()) != null) {
                        com.bytedance.ies.dmt.ui.widget.util.b.a().a(mCustomTextView$homepage_common_release, com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
                    }
                }

                @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a.c
                public final void a(f fVar) {
                    h hVar;
                    TextView mCustomTextView$homepage_common_release;
                    TextView mCustomTextView$homepage_common_release2;
                    l.d(fVar, "");
                    h hVar2 = fVar.f99689d;
                    int childCount = this.f99676a.getChildCount();
                    if (childCount >= 0) {
                        int i2 = 0;
                        while (true) {
                            View childAt = this.f99676a.getChildAt(i2);
                            if ((childAt instanceof h) && (mCustomTextView$homepage_common_release = (hVar = (h) childAt).getMCustomTextView$homepage_common_release()) != null && mCustomTextView$homepage_common_release.getVisibility() == 0 && (mCustomTextView$homepage_common_release2 = hVar.getMCustomTextView$homepage_common_release()) != null) {
                                mCustomTextView$homepage_common_release2.setAlpha(this.f99676a.f99673g);
                            }
                            if (i2 == childCount) {
                                break;
                            }
                            i2++;
                        }
                    }
                    if (hVar2 instanceof h) {
                        TextView mCustomTextView$homepage_common_release3 = hVar2.getMCustomTextView$homepage_common_release();
                        if (mCustomTextView$homepage_common_release3 != null) {
                            mCustomTextView$homepage_common_release3.setAlpha(1.0f);
                        }
                        com.bytedance.ies.dmt.ui.widget.util.b.a().a(mCustomTextView$homepage_common_release3, com.bytedance.ies.dmt.ui.widget.util.d.f33796b);
                    }
                    if (!a.this.getSwipeMode()) {
                        this.f99676a.a(fVar, false);
                    }
                }
            });
        }

        public final void a(int i2, boolean z) {
            boolean z2 = false;
            if (z) {
                if (this.f99674h.isRunning()) {
                    this.f99674h.cancel();
                }
                z.a aVar = new z.a();
                aVar.element = false;
                if (i2 != getMSelectedPosition()) {
                    if (getMSelectedPosition() - i2 > 0) {
                        z2 = true;
                    }
                    aVar.element = z2;
                    setMSelectedPosition(i2);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f);
                    l.b(ofFloat, "");
                    ofFloat.setDuration(400L);
                    ofFloat.addUpdateListener(new d(this, aVar));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.3f, 1.0f);
                    l.b(ofFloat2, "");
                    ofFloat2.setDuration(900L);
                    ofFloat2.addUpdateListener(new C2440e(this, aVar));
                    this.f99674h.play(ofFloat).before(ofFloat2);
                    this.f99674h.start();
                    this.f99674h.addListener(new f(this));
                    return;
                }
                return;
            }
            a.this.setRepeatAnim(false);
            if (this.f99674h.isRunning()) {
                this.f99674h.cancel();
            }
            f a2 = a.this.a(i2);
            if (a2 != null) {
                a2.a();
            }
        }

        public final void b(int i2, float f2) {
            TextView mCustomTextView$homepage_common_release;
            h hVar;
            TextView mCustomTextView$homepage_common_release2;
            TextView mCustomTextView$homepage_common_release3;
            TextView mCustomTextView$homepage_common_release4;
            TextView mCustomTextView$homepage_common_release5;
            View childAt = getChildAt(i2);
            if (f2 <= 0.0f || i2 >= getChildCount() - 1) {
                int i3 = 0;
                int childCount = getChildCount();
                if (childCount >= 0) {
                    while (true) {
                        View childAt2 = getChildAt(i3);
                        if ((childAt2 instanceof h) && (mCustomTextView$homepage_common_release2 = (hVar = (h) childAt2).getMCustomTextView$homepage_common_release()) != null && mCustomTextView$homepage_common_release2.getVisibility() == 0 && (mCustomTextView$homepage_common_release3 = hVar.getMCustomTextView$homepage_common_release()) != null) {
                            mCustomTextView$homepage_common_release3.setAlpha(this.f99673g);
                        }
                        if (i3 == childCount) {
                            break;
                        }
                        i3++;
                    }
                }
                if ((childAt instanceof h) && (mCustomTextView$homepage_common_release = ((h) childAt).getMCustomTextView$homepage_common_release()) != null) {
                    mCustomTextView$homepage_common_release.setAlpha(1.0f);
                    return;
                }
                return;
            }
            if ((childAt instanceof h) && (mCustomTextView$homepage_common_release5 = ((h) childAt).getMCustomTextView$homepage_common_release()) != null && mCustomTextView$homepage_common_release5.getVisibility() == 0) {
                mCustomTextView$homepage_common_release5.setAlpha(1.0f - ((1.0f - this.f99673g) * f2));
            }
            View childAt3 = getChildAt(i2 + 1);
            if ((childAt3 instanceof h) && (mCustomTextView$homepage_common_release4 = ((h) childAt3).getMCustomTextView$homepage_common_release()) != null && mCustomTextView$homepage_common_release4.getVisibility() == 0) {
                float f3 = this.f99673g;
                mCustomTextView$homepage_common_release4.setAlpha(f3 + ((1.0f - f3) * f2));
            }
        }

        public final void a(f fVar, boolean z) {
            h hVar;
            TextView mCustomTextView$homepage_common_release;
            ObjectAnimator objectAnimator;
            ObjectAnimator objectAnimator2 = null;
            if (fVar != null && (hVar = fVar.f99689d) != null && (mCustomTextView$homepage_common_release = hVar.getMCustomTextView$homepage_common_release()) != null) {
                float f2 = 1.125f;
                float f3 = 1.0f;
                if (z) {
                    if (a.this.getEnableAnimation()) {
                        objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleX", mCustomTextView$homepage_common_release.getScaleX(), 1.0f).setDuration(200L);
                        objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleY", mCustomTextView$homepage_common_release.getScaleY(), 1.0f).setDuration(200L);
                    } else {
                        objectAnimator = null;
                    }
                    f2 = 1.0f;
                    f3 = 0.6f;
                } else if (a.this.getEnableAnimation()) {
                    objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleX", mCustomTextView$homepage_common_release.getScaleX(), 1.25f, 1.125f).setDuration(300L);
                    objectAnimator2.setInterpolator(b.f99678a);
                    objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleY", mCustomTextView$homepage_common_release.getScaleY(), 1.25f, 1.125f).setDuration(300L);
                    objectAnimator.setInterpolator(c.f99679a);
                } else {
                    objectAnimator = null;
                }
                if (a.this.getEnableAnimation()) {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "alpha", mCustomTextView$homepage_common_release.getAlpha(), f3).setDuration(200L);
                    l.b(duration, "");
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(duration, objectAnimator2, objectAnimator);
                    animatorSet.start();
                    return;
                }
                mCustomTextView$homepage_common_release.setScaleX(f2);
                mCustomTextView$homepage_common_release.setScaleY(f2);
                mCustomTextView$homepage_common_release.setAlpha(f3);
            }
        }
    }

    public static final class g implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<a> f99691a;

        /* renamed from: b  reason: collision with root package name */
        int f99692b;

        /* renamed from: c  reason: collision with root package name */
        int f99693c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f99694d;

        /* renamed from: e  reason: collision with root package name */
        private final AccelerateInterpolator f99695e = new AccelerateInterpolator();

        static {
            Covode.recordClassIndex(63551);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f99692b = this.f99693c;
            this.f99693c = i2;
        }

        public g(a aVar) {
            l.d(aVar, "");
            this.f99691a = new WeakReference<>(aVar);
            this.f99694d = true;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            boolean z;
            a aVar = this.f99691a.get();
            if (aVar != null && aVar.getSelectedTabPosition() != i2 && i2 < aVar.getTabCount()) {
                int i3 = this.f99693c;
                if (i3 == 0 || (i3 == 2 && this.f99692b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.a(aVar.a(i2), z);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
            if (r4 == 2) goto L_0x0018;
         */
        @Override // androidx.viewpager.widget.ViewPager.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageScrolled(int r7, float r8, int r9) {
            /*
                r6 = this;
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a> r0 = r6.f99691a
                java.lang.Object r5 = r0.get()
                com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a r5 = (com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a) r5
                if (r5 == 0) goto L_0x0033
                int r4 = r6.f99693c
                r3 = 0
                r2 = 2
                r1 = 1
                if (r4 != r2) goto L_0x0015
                int r0 = r6.f99692b
                if (r0 != r1) goto L_0x0036
            L_0x0015:
                r1 = 1
                if (r4 != r2) goto L_0x001c
            L_0x0018:
                int r0 = r6.f99692b
                if (r0 == 0) goto L_0x0034
            L_0x001c:
                r0 = 1
            L_0x001d:
                r5.a(r7, r8, r1, r0)
                com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e r1 = r5.f99642a
                int r0 = r6.f99693c
                if (r0 != r2) goto L_0x002a
                int r0 = r6.f99692b
                if (r0 == 0) goto L_0x002b
            L_0x002a:
                r3 = 1
            L_0x002b:
                r1.setMIsDragged(r3)
                com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e r0 = r5.f99642a
                androidx.core.h.v.c(r0)
            L_0x0033:
                return
            L_0x0034:
                r0 = 0
                goto L_0x001d
            L_0x0036:
                r1 = 0
                goto L_0x0018
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a.g.onPageScrolled(int, float, int):void");
        }
    }

    private void c(int i2) {
        a(i2, 0.0f, true, true);
    }

    public final void setOverBorderTransparentWidth(float f2) {
        this.f99642a.setOverBorderWidth(f2);
    }

    public final void setSelectedTabHorizontalPadding(int i2) {
        this.f99642a.setSelectedTabHorizontalPadding(i2);
    }

    public final void setSelectedTabIndicatorColor(int i2) {
        this.f99642a.setSelectedIndicatorColor(i2);
    }

    public final void setSelectedTabIndicatorHeight(int i2) {
        this.f99642a.setSelectedIndicatorHeight(i2);
    }

    public final void setTabStripMargin(float f2) {
        this.f99642a.setTabStripMargin(f2);
    }

    public final void a(f fVar) {
        l.d(fVar, "");
        a(fVar, this.f99650k.size());
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l.d(attributeSet, "");
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        l.b(generateDefaultLayoutParams, "");
        return generateDefaultLayoutParams;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f99647f || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        c();
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator == null) {
            l.b();
        }
        valueAnimator.addListener(animatorListener);
    }

    public final void setTabGravity(int i2) {
        if (this.q != i2) {
            this.q = i2;
            d();
        }
    }

    public final void setTabMode(int i2) {
        if (i2 != this.r) {
            this.r = i2;
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99701a;

        static {
            Covode.recordClassIndex(63554);
        }

        j(a aVar) {
            this.f99701a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            a aVar = this.f99701a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            aVar.scrollTo(((Integer) animatedValue).intValue(), 0);
        }
    }

    private final void b(f fVar) {
        this.f99642a.addView(fVar.f99689d, fVar.f99686a, b());
        this.f99642a.post(new i(this));
    }

    public final boolean canScrollHorizontally(int i2) {
        int computeHorizontalScrollOffset = computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = computeHorizontalScrollRange() - computeHorizontalScrollExtent();
        if (computeHorizontalScrollRange == 0) {
            return false;
        }
        if (i2 < 0) {
            if (((float) computeHorizontalScrollOffset) - this.w > 0.0f) {
                return true;
            }
            return false;
        } else if (((float) computeHorizontalScrollOffset) + this.w < ((float) (computeHorizontalScrollRange - 1))) {
            return true;
        } else {
            return false;
        }
    }

    public final void setTabMargin(int i2) {
        this.f99652m = b(i2);
        int tabCount = getTabCount();
        for (int i3 = 0; i3 < tabCount; i3++) {
            View childAt = this.f99642a.getChildAt(i3);
            l.b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = b(i2);
            marginLayoutParams.rightMargin = b(i2);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setTabMode(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 66669991) {
                if (hashCode == 97445748 && str.equals("fixed") && this.r != 1) {
                    this.r = 1;
                    d();
                }
            } else if (str.equals("scrollable") && this.r != 0) {
                this.r = 0;
                d();
            }
        }
    }

    private final void d(int i2) {
        if (i2 != -1) {
            if (getWindowToken() != null && v.v(this)) {
                e eVar = this.f99642a;
                int childCount = eVar.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = eVar.getChildAt(i3);
                    l.b(childAt, "");
                    if (childAt.getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int a2 = a(i2, 0.0f);
                if (scrollX != a2) {
                    c();
                    ValueAnimator valueAnimator = this.t;
                    if (valueAnimator == null) {
                        l.b();
                    }
                    valueAnimator.setIntValues(scrollX, a2);
                    ValueAnimator valueAnimator2 = this.t;
                    if (valueAnimator2 == null) {
                        l.b();
                    }
                    valueAnimator2.start();
                }
                this.f99642a.b(i2, 200);
                return;
            }
            c(i2);
        }
    }

    private final void setSelectedTabView(int i2) {
        boolean z2;
        int childCount = this.f99642a.getChildCount();
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f99642a.getChildAt(i3);
                l.b(childAt, "");
                if (i3 == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                childAt.setSelected(z2);
                if (childAt instanceof h) {
                    h hVar = (h) childAt;
                    TextView mCustomTextView$homepage_common_release = hVar.getMCustomTextView$homepage_common_release();
                    if (hVar.isSelected()) {
                        if (mCustomTextView$homepage_common_release != null) {
                            mCustomTextView$homepage_common_release.setAlpha(1.0f);
                        }
                    } else if (mCustomTextView$homepage_common_release != null) {
                        mCustomTextView$homepage_common_release.setAlpha(this.f99642a.f99673g);
                    }
                }
            }
        }
    }

    public final int b(int i2) {
        Resources resources = getResources();
        l.b(resources, "");
        return Math.round(resources.getDisplayMetrics().density * ((float) i2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(4090);
        this.f99650k = new ArrayList<>();
        this.f99643b = Integer.MAX_VALUE;
        this.f99645d = new ArrayList<>();
        this.x = new f.b(12);
        this.y = true;
        this.z = true;
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context);
        this.f99642a = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        eVar.setSelectedIndicatorHeight(0);
        eVar.setSelectedIndicatorColor(0);
        this.o = -1;
        this.p = -1;
        this.n = 0;
        this.r = 1;
        this.q = 0;
        getResources();
        this.u = n.b(getContext(), 1.5f);
        this.v = n.b(getContext(), 1.5f);
        Resources resources = getResources();
        l.b(resources, "");
        this.f99648g = resources.getConfiguration().orientation;
        d();
        MethodCollector.o(4090);
    }

    private final void a(LinearLayout.LayoutParams layoutParams) {
        if (this.r == 1 && this.q == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i2 = this.f99652m;
        if (i2 != 0) {
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = this.f99652m;
        }
    }

    public final f a(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.f99650k.get(i2);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    private void a(f fVar, int i2) {
        l.d(fVar, "");
        if (fVar.f99688c == this) {
            b(fVar, i2);
            b(fVar);
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.".toString());
    }

    private final void b(f fVar, int i2) {
        fVar.f99686a = i2;
        this.f99650k.add(i2, fVar);
        int size = this.f99650k.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.f99650k.get(i2).f99686a = i2;
            } else {
                return;
            }
        }
    }

    private final int a(int i2, float f2) {
        View view;
        int i3;
        int i4 = 0;
        if (this.r != 0) {
            return 0;
        }
        View childAt = this.f99642a.getChildAt(i2);
        int i5 = i2 + 1;
        if (i5 < this.f99642a.getChildCount()) {
            view = this.f99642a.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i3 = childAt.getWidth();
        } else {
            i3 = 0;
        }
        if (view != null) {
            i4 = view.getWidth();
        }
        if (childAt == null) {
            l.b();
        }
        int left = (childAt.getLeft() + (i3 / 2)) - (getWidth() / 2);
        int i6 = (int) (((float) (i3 + i4 + (this.f99652m * 4))) * 0.5f * f2);
        if (v.e(this) == 0) {
            return left + i6;
        }
        return left - i6;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r4.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r4.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a.onMeasure(int, int):void");
    }

    public final f a(View view, String str) {
        l.d(str, "");
        f acquire = B.acquire();
        if (acquire == null) {
            acquire = new f();
        }
        acquire.f99688c = this;
        acquire.f99690e = str;
        acquire.f99689d = a();
        if (view != null) {
            h hVar = acquire.f99689d;
            if (hVar == null) {
                l.b();
            }
            hVar.a(acquire);
            acquire.a(view);
        } else {
            h hVar2 = acquire.f99689d;
            if (hVar2 == null) {
                l.b();
            }
            hVar2.setTab(acquire);
        }
        return acquire;
    }

    public final void a(f fVar, boolean z2) {
        int i2;
        f fVar2 = this.f99651l;
        if (!l.a(fVar2, fVar)) {
            if (fVar != null) {
                i2 = fVar.f99686a;
            } else {
                i2 = -1;
            }
            if (z2) {
                if ((fVar2 == null || fVar2.f99686a == -1) && i2 != -1) {
                    c(i2);
                } else {
                    d(i2);
                }
                if (i2 != -1) {
                    setSelectedTabView(i2);
                }
            }
            if (fVar2 != null) {
                for (int size = this.f99645d.size() - 1; size >= 0; size--) {
                    this.f99645d.get(size).b(fVar2);
                }
            }
            this.f99651l = fVar;
            if (fVar != null) {
                for (int size2 = this.f99645d.size() - 1; size2 >= 0; size2--) {
                    this.f99645d.get(size2).a(fVar);
                }
            }
        } else if (fVar2 != null) {
            if (fVar == null) {
                l.b();
            }
            for (int size3 = this.f99645d.size() - 1; size3 >= 0; size3--) {
                this.f99645d.get(size3);
            }
            d(fVar.f99686a);
        }
    }

    public final void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.f99642a.getChildCount()) {
            if (z3) {
                this.f99642a.a(i2, f2);
            }
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.t;
                if (valueAnimator2 == null) {
                    l.b();
                }
                valueAnimator2.cancel();
            }
            scrollTo(a(i2, f2), 0);
            if (z2) {
                setSelectedTabView(round);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        e eVar = this.f99642a;
        if (a.this.f99647f && i4 > 0 && eVar.f99656d > 0.0f) {
            v.c(eVar);
        }
        return super.overScrollBy(i2, i3, i4, i5, i6, i7, 10, i9, z2);
    }
}
