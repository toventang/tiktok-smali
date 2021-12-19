package com.ss.android.ugc.aweme.dsp.ui.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
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
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

@ViewPager.a
public final class c extends HorizontalScrollView {

    /* renamed from: k  reason: collision with root package name */
    public static final Interpolator f83959k = new androidx.g.a.a.b();

    /* renamed from: l  reason: collision with root package name */
    public static final f.a<f> f83960l = new f.c(16);

    /* renamed from: m  reason: collision with root package name */
    public static final a f83961m = new a((byte) 0);
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<f> f83962a;

    /* renamed from: b  reason: collision with root package name */
    public final e f83963b;

    /* renamed from: c  reason: collision with root package name */
    public int f83964c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f83965d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<AbstractC2003c> f83966e;

    /* renamed from: f  reason: collision with root package name */
    g f83967f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f83968g;

    /* renamed from: h  reason: collision with root package name */
    public final int f83969h;

    /* renamed from: i  reason: collision with root package name */
    public b f83970i;

    /* renamed from: j  reason: collision with root package name */
    public final f.a<h> f83971j;
    private f n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private ValueAnimator u;
    private final float v;
    private final float w;
    private float x;
    private boolean y;
    private boolean z;

    public interface b {
        static {
            Covode.recordClassIndex(52377);
        }

        void a(f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.ui.a.c$c  reason: collision with other inner class name */
    public interface AbstractC2003c {
        static {
            Covode.recordClassIndex(52378);
        }

        void a(f fVar);

        void b(f fVar);
    }

    public static final class f {

        /* renamed from: f  reason: collision with root package name */
        public static final a f83998f = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public int f83999a = -1;

        /* renamed from: b  reason: collision with root package name */
        public View f84000b;

        /* renamed from: c  reason: collision with root package name */
        public c f84001c;

        /* renamed from: d  reason: collision with root package name */
        public h f84002d;

        /* renamed from: e  reason: collision with root package name */
        public Object f84003e;

        static {
            Covode.recordClassIndex(52386);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(52387);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public final void a() {
            c cVar = this.f84001c;
            if (cVar != null) {
                cVar.a((c) this, (f) true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout".toString());
        }

        public final boolean b() {
            c cVar = this.f84001c;
            if (cVar == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout".toString());
            } else if (cVar.getSelectedTabPosition() == this.f83999a) {
                return true;
            } else {
                return false;
            }
        }
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

    public static final class a {
        static {
            Covode.recordClassIndex(52376);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public class d extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public int f83972a;

        /* renamed from: b  reason: collision with root package name */
        public int f83973b;

        /* renamed from: c  reason: collision with root package name */
        public int f83974c;

        /* renamed from: d  reason: collision with root package name */
        float f83975d;

        /* renamed from: e  reason: collision with root package name */
        public u<Float, Float, ? extends Paint> f83976e;

        /* renamed from: g  reason: collision with root package name */
        private final Paint f83978g;

        /* renamed from: h  reason: collision with root package name */
        private int f83979h = -1;

        /* renamed from: i  reason: collision with root package name */
        private float f83980i;

        /* renamed from: j  reason: collision with root package name */
        private int f83981j = -1;

        /* renamed from: k  reason: collision with root package name */
        private int f83982k = -1;

        /* renamed from: l  reason: collision with root package name */
        private int f83983l = -1;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f83984m;
        private int n = Integer.MAX_VALUE;
        private boolean o;
        private LinearGradient p;
        private LinearGradient q;
        private Paint r;
        private PorterDuffXfermode s;
        private int t = -1;
        private float u;

        static {
            Covode.recordClassIndex(52379);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.u<java.lang.Float, java.lang.Float, ? extends android.graphics.Paint>, h.u<java.lang.Float, java.lang.Float, android.graphics.Paint> */
        public final u<Float, Float, Paint> getBarrierTriple() {
            return this.f83976e;
        }

        public final PorterDuffXfermode getMDuffXferMode() {
            return this.s;
        }

        public final boolean getMIsDragged() {
            return this.o;
        }

        public final int getMLayerId() {
            return this.t;
        }

        public final LinearGradient getMLeftGradient() {
            return this.p;
        }

        public final Paint getMOverBorderPaint() {
            return this.r;
        }

        public final LinearGradient getMRightGradient() {
            return this.q;
        }

        /* access modifiers changed from: protected */
        public final Paint getMSelectedIndicatorPaint() {
            return this.f83978g;
        }

        public final int getMSelectedPosition() {
            return this.f83979h;
        }

        public final float getMSelectionOffset() {
            return this.f83980i;
        }

        public final float getStripMargin() {
            return this.u;
        }

        public final float getIndicatorPosition() {
            return ((float) this.f83979h) + this.f83980i;
        }

        private void a() {
            int i2;
            View childAt = getChildAt(this.f83979h);
            int i3 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f83973b > 0) {
                    int abs = Math.abs(i2 - i3) / 2;
                    int i4 = this.f83974c;
                    i3 = (i3 + abs) - i4;
                    i2 = (i2 - abs) + i4;
                }
                if (this.f83980i > 0.0f && this.f83979h < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f83979h + 1);
                    l.b(childAt2, "");
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (this.f83973b > 0) {
                        int abs2 = Math.abs(right - left) / 2;
                        int i5 = this.f83974c;
                        left = (left + abs2) - i5;
                        right = (right - abs2) + i5;
                    }
                    float f2 = this.f83980i;
                    i3 = (int) ((((float) left) * f2) + ((1.0f - f2) * ((float) i3)));
                    i2 = (int) ((((float) right) * f2) + ((1.0f - f2) * ((float) i2)));
                }
            }
            a(i3, i2);
        }

        public final void setBarrierTriple(u<Float, Float, ? extends Paint> uVar) {
            this.f83976e = uVar;
        }

        public final void setMDuffXferMode(PorterDuffXfermode porterDuffXfermode) {
            this.s = porterDuffXfermode;
        }

        public final void setMIsDragged(boolean z) {
            this.o = z;
        }

        public final void setMLayerId(int i2) {
            this.t = i2;
        }

        public final void setMLeftGradient(LinearGradient linearGradient) {
            this.p = linearGradient;
        }

        public final void setMOverBorderPaint(Paint paint) {
            this.r = paint;
        }

        public final void setMRightGradient(LinearGradient linearGradient) {
            this.q = linearGradient;
        }

        public final void setMSelectedPosition(int i2) {
            this.f83979h = i2;
        }

        public final void setMSelectionOffset(float f2) {
            this.f83980i = f2;
        }

        public final void setStripMargin(float f2) {
            this.u = f2;
        }

        public final void setTabStripMargin(float f2) {
            this.u = f2;
            v.c(this);
        }

        public final void setSelectedIndicatorHeight(int i2) {
            if (this.f83972a != i2) {
                this.f83972a = i2;
                v.c(this);
            }
        }

        public final void setTabBarrierColor(int i2) {
            Paint paint;
            u<Float, Float, ? extends Paint> uVar = this.f83976e;
            if (uVar != null && (paint = (Paint) uVar.getThird()) != null) {
                paint.setColor(i2);
            }
        }

        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f83990a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f83991b;

            static {
                Covode.recordClassIndex(52381);
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                this.f83990a.setMSelectedPosition(this.f83991b);
                this.f83990a.setMSelectionOffset(0.0f);
            }

            b(d dVar, int i2) {
                this.f83990a = dVar;
                this.f83991b = i2;
            }
        }

        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.f83981j != i2) {
                requestLayout();
                this.f83981j = i2;
            }
        }

        public final void setSelectedIndicatorColor(int i2) {
            if (this.f83978g.getColor() != i2) {
                this.f83978g.setColor(i2);
                v.c(this);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f83985a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z.c f83986b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z.c f83987c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f83988d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f83989e;

            static {
                Covode.recordClassIndex(52380);
            }

            a(d dVar, z.c cVar, z.c cVar2, int i2, int i3) {
                this.f83985a = dVar;
                this.f83986b = cVar;
                this.f83987c = cVar2;
                this.f83988d = i2;
                this.f83989e = i3;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.b(valueAnimator, "");
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (this.f83985a.f83973b > 0) {
                    int abs = Math.abs(this.f83986b.element - this.f83987c.element) / 2;
                    z.c cVar = this.f83987c;
                    cVar.element = (cVar.element + abs) - this.f83985a.f83974c;
                    z.c cVar2 = this.f83986b;
                    cVar2.element = (cVar2.element - abs) + this.f83985a.f83974c;
                }
                this.f83985a.a(d.a(this.f83988d, this.f83987c.element, animatedFraction), d.a(this.f83989e, this.f83986b.element, animatedFraction));
            }
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            MethodCollector.i(1282);
            super.onDraw(canvas);
            int i2 = -1;
            if (c.this.getMMode() == 0 && this.f83975d > 0.0f) {
                c cVar = c.this;
                if ((cVar.canScrollHorizontally(-1) || cVar.canScrollHorizontally(1)) && canvas != null) {
                    i2 = canvas.saveLayer((float) c.this.getScrollX(), 0.0f, ((float) c.this.getScrollX()) + ((float) getWidth()), (float) getHeight(), this.r, 31);
                }
            }
            this.t = i2;
            MethodCollector.o(1282);
        }

        public final void setOverBorderWidth(float f2) {
            this.f83975d = f2;
            if (f2 > 0.0f) {
                this.p = new LinearGradient(0.0f, 0.0f, f2, 0.0f, new int[]{0, 0, -16777216}, new float[]{0.0f, 0.3f, 1.0f}, Shader.TileMode.CLAMP);
                this.q = new LinearGradient(0.0f, 0.0f, f2, 0.0f, new int[]{-16777216, 0, 0}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
                this.t = -1;
                if (this.r == null) {
                    this.r = new Paint(1);
                }
                if (this.s == null) {
                    this.s = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
                }
            }
        }

        public void draw(Canvas canvas) {
            float f2;
            float f3;
            float f4;
            Paint paint;
            Float second;
            Float first;
            Float first2;
            Float second2;
            l.d(canvas, "");
            super.draw(canvas);
            int childCount = getChildCount();
            int i2 = 1;
            if (childCount > 1 && this.f83976e != null) {
                if (v.e(this) == 1) {
                    i2 = 0;
                    childCount--;
                }
                while (i2 < childCount) {
                    float height = (float) getHeight();
                    u<Float, Float, ? extends Paint> uVar = this.f83976e;
                    float f5 = 0.0f;
                    if (uVar == null || (second2 = uVar.getSecond()) == null) {
                        f2 = 0.0f;
                    } else {
                        f2 = second2.floatValue();
                    }
                    float f6 = (height - f2) / 2.0f;
                    View childAt = getChildAt(i2);
                    u<Float, Float, ? extends Paint> uVar2 = this.f83976e;
                    if (uVar2 == null || (first2 = uVar2.getFirst()) == null) {
                        f3 = 0.0f;
                    } else {
                        f3 = first2.floatValue();
                    }
                    l.b(childAt, "");
                    float left = ((float) childAt.getLeft()) - (f3 / 2.0f);
                    float left2 = (float) childAt.getLeft();
                    u<Float, Float, ? extends Paint> uVar3 = this.f83976e;
                    if (uVar3 == null || (first = uVar3.getFirst()) == null) {
                        f4 = 0.0f;
                    } else {
                        f4 = first.floatValue();
                    }
                    float f7 = left2 + f4;
                    u<Float, Float, ? extends Paint> uVar4 = this.f83976e;
                    if (!(uVar4 == null || (second = uVar4.getSecond()) == null)) {
                        f5 = second.floatValue();
                    }
                    float f8 = f6 + f5;
                    u<Float, Float, ? extends Paint> uVar5 = this.f83976e;
                    if (uVar5 != null) {
                        paint = (Paint) uVar5.getThird();
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        l.b();
                    }
                    canvas.drawRect(left, f6, f7, f8, paint);
                    i2++;
                }
            }
        }

        public final void a(int i2, float f2) {
            ValueAnimator valueAnimator = this.f83984m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f83984m;
                if (valueAnimator2 == null) {
                    l.b();
                }
                valueAnimator2.cancel();
            }
            this.f83979h = i2;
            this.f83980i = f2;
            a();
        }

        public d(Context context) {
            super(context);
            MethodCollector.i(1341);
            setWillNotDraw(false);
            this.f83978g = new Paint();
            MethodCollector.o(1341);
        }

        public final void a(int i2, int i3) {
            if (i2 != this.f83982k || i3 != this.f83983l) {
                this.f83982k = i2;
                this.f83983l = i3;
                v.c(this);
            }
        }

        public final void b(int i2, int i3) {
            boolean z;
            int i4;
            int i5;
            int i6;
            ValueAnimator valueAnimator = this.f83984m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f83984m;
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
            if (Math.abs(i2 - this.f83979h) <= 1) {
                i4 = this.f83982k;
                i6 = this.f83983l;
            } else {
                int b2 = c.this.b(24);
                if (i2 < this.f83979h) {
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
                this.f83984m = valueAnimator3;
                valueAnimator3.setInterpolator(c.f83959k);
                valueAnimator3.setDuration((long) i3);
                valueAnimator3.setFloatValues(0.0f, 1.0f);
                valueAnimator3.addUpdateListener(new a(this, cVar2, cVar, i4, i6));
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.ui.a.c.d.onMeasure(int, int):void");
        }

        public static int a(int i2, int i3, float f2) {
            return i2 + Math.round(f2 * ((float) (i3 - i2)));
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            MethodCollector.i(884);
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f83984m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
                MethodCollector.o(884);
                return;
            }
            ValueAnimator valueAnimator2 = this.f83984m;
            if (valueAnimator2 == null) {
                l.b();
            }
            valueAnimator2.cancel();
            ValueAnimator valueAnimator3 = this.f83984m;
            if (valueAnimator3 == null) {
                l.b();
            }
            long duration = valueAnimator3.getDuration();
            int i6 = this.f83979h;
            ValueAnimator valueAnimator4 = this.f83984m;
            if (valueAnimator4 == null) {
                l.b();
            }
            b(i6, Math.round((1.0f - valueAnimator4.getAnimatedFraction()) * ((float) duration)));
            MethodCollector.o(884);
        }
    }

    public final class h extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public f f84008a;

        /* renamed from: c  reason: collision with root package name */
        private View f84010c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f84011d;

        static {
            Covode.recordClassIndex(52389);
        }

        public final TextView getMCustomTextView$music_dsp_release() {
            return this.f84011d;
        }

        public final f getTab() {
            return this.f84008a;
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f84008a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (c.this.f83970i != null) {
                b bVar = c.this.f83970i;
                if (bVar == null) {
                    l.b();
                }
                bVar.a(this.f84008a);
            } else {
                f fVar = this.f84008a;
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
                r6 = 823(0x337, float:1.153E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
                com.ss.android.ugc.aweme.dsp.ui.a.c$f r5 = r7.f84008a
                r4 = 0
                if (r5 == 0) goto L_0x0058
                android.view.View r3 = r5.f84000b
            L_0x000c:
                r2 = 1
                if (r3 == 0) goto L_0x004c
                android.view.ViewParent r1 = r3.getParent()
                if (r1 != 0) goto L_0x0041
            L_0x0015:
                r7.addView(r3)
            L_0x0018:
                r7.f84010c = r3
                r0 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r1 = r3.findViewById(r0)
                boolean r0 = r1 instanceof android.widget.TextView
                if (r0 != 0) goto L_0x003f
            L_0x0025:
                android.widget.TextView r4 = (android.widget.TextView) r4
                r7.f84011d = r4
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
                android.view.View r0 = r7.f84010c
                if (r0 == 0) goto L_0x0055
                r7.removeView(r0)
                r7.f84010c = r4
            L_0x0055:
                r7.f84011d = r4
                goto L_0x002e
            L_0x0058:
                r3 = r4
                goto L_0x000c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.ui.a.c.h.a():void");
        }

        public final void setMCustomTextView$music_dsp_release(TextView textView) {
            this.f84011d = textView;
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
            if (!l.a(fVar, this.f84008a)) {
                this.f84008a = fVar;
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
            View view = this.f84010c;
            if (view != null) {
                view.setSelected(z);
            }
            TextView textView = this.f84011d;
            if (textView != null) {
                textView.setSelected(z);
            }
        }

        public h(Context context) {
            super(context);
            MethodCollector.i(849);
            if (c.this.getMTabBackgroundResId() != 0) {
                if (context == null) {
                    l.b();
                }
                v.a(this, androidx.appcompat.a.a.a.b(context, c.this.getMTabBackgroundResId()));
            }
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            v.a(this, s.a(getContext()));
            MethodCollector.o(849);
        }

        public final void onMeasure(int i2, int i3) {
            MethodCollector.i(804);
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int i4 = c.this.f83964c;
            if (i4 > 0 && (mode == 0 || size > i4)) {
                i2 = View.MeasureSpec.makeMeasureSpec(c.this.f83964c, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            MethodCollector.o(804);
        }
    }

    public final boolean getEnableAnimation() {
        return this.z;
    }

    public final int getMMode() {
        return this.t;
    }

    public final g getMPageChangeListener() {
        return this.f83967f;
    }

    public final int getMTabBackgroundResId() {
        return this.p;
    }

    public final int getMTabGravity() {
        return this.s;
    }

    public final boolean getRepeatAnim() {
        return this.y;
    }

    public final boolean getSwipeMode() {
        return this.A;
    }

    public final int getTabMode() {
        return this.t;
    }

    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f84012a;

        static {
            Covode.recordClassIndex(52390);
        }

        public i(c cVar) {
            this.f84012a = cVar;
        }

        public final void run() {
            this.f84012a.requestLayout();
        }
    }

    public final int getTabCount() {
        return this.f83962a.size();
    }

    public final int getTabMinWidth() {
        int i2 = this.q;
        if (i2 != -1) {
            return i2;
        }
        return 0;
    }

    public final int getSelectedTabPosition() {
        f fVar = this.n;
        if (fVar != null) {
            return fVar.f83999a;
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
        Covode.recordClassIndex(52375);
    }

    private final void b() {
        v.a(this.f83963b, 0, 0, 0, 0);
        int i2 = this.t;
        if (i2 == 0) {
            this.f83963b.setGravity(8388611);
        } else if (i2 == 1) {
            this.f83963b.setGravity(1);
        }
        a(true);
    }

    private final int getTabScrollRange() {
        return h.j.h.b(0, ((this.f83963b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private final void a() {
        if (this.u == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.u = valueAnimator;
            valueAnimator.setInterpolator(f83959k);
            ValueAnimator valueAnimator2 = this.u;
            if (valueAnimator2 == null) {
                l.b();
            }
            valueAnimator2.setDuration(200L);
            ValueAnimator valueAnimator3 = this.u;
            if (valueAnimator3 == null) {
                l.b();
            }
            valueAnimator3.addUpdateListener(new j(this));
        }
    }

    private final int getDefaultHeight() {
        int size = this.f83962a.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.f83962a.get(i2);
            l.b(fVar, "");
            View view = fVar.f84000b;
            if (view != null && view.getHeight() > 58) {
                return 58;
            }
        }
        return 48;
    }

    private final void setTabMinWidth(int i2) {
        this.q = i2;
    }

    public final void setAutoFillWhenScrollable(boolean z2) {
        this.f83965d = z2;
    }

    public final void setEnableAnimation(boolean z2) {
        this.z = z2;
    }

    public final void setMMode(int i2) {
        this.t = i2;
    }

    public final void setMPageChangeListener(g gVar) {
        this.f83967f = gVar;
    }

    public final void setMTabBackgroundResId(int i2) {
        this.p = i2;
    }

    public final void setMTabGravity(int i2) {
        this.s = i2;
    }

    public final void setOnTabClickListener(b bVar) {
        this.f83970i = bVar;
    }

    public final void setOverBorderOffset(float f2) {
        this.x = f2;
    }

    public final void setRepeatAnim(boolean z2) {
        this.y = z2;
    }

    public final void setSwipeMode(boolean z2) {
        this.A = z2;
    }

    public final void setTouchable(boolean z2) {
        this.f83968g = z2;
    }

    public static final class g implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<c> f84004a;

        /* renamed from: b  reason: collision with root package name */
        int f84005b;

        /* renamed from: c  reason: collision with root package name */
        int f84006c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f84007d = true;

        static {
            Covode.recordClassIndex(52388);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f84005b = this.f84006c;
            this.f84006c = i2;
        }

        public g(c cVar) {
            l.d(cVar, "");
            this.f84004a = new WeakReference<>(cVar);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            boolean z;
            c cVar = this.f84004a.get();
            if (cVar != null) {
                cVar.setTabBarrierColor(i2);
                if (cVar.getSelectedTabPosition() != i2 && i2 < cVar.getTabCount()) {
                    int i3 = this.f84006c;
                    if (i3 == 0 || (i3 == 2 && this.f84005b == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.a(cVar.a(i2), z);
                }
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
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.dsp.ui.a.c> r0 = r6.f84004a
                java.lang.Object r5 = r0.get()
                com.ss.android.ugc.aweme.dsp.ui.a.c r5 = (com.ss.android.ugc.aweme.dsp.ui.a.c) r5
                if (r5 == 0) goto L_0x0033
                int r4 = r6.f84006c
                r3 = 0
                r2 = 2
                r1 = 1
                if (r4 != r2) goto L_0x0015
                int r0 = r6.f84005b
                if (r0 != r1) goto L_0x0036
            L_0x0015:
                r1 = 1
                if (r4 != r2) goto L_0x001c
            L_0x0018:
                int r0 = r6.f84005b
                if (r0 == 0) goto L_0x0034
            L_0x001c:
                r0 = 1
            L_0x001d:
                r5.a(r7, r8, r1, r0)
                com.ss.android.ugc.aweme.dsp.ui.a.c$e r1 = r5.f83963b
                int r0 = r6.f84006c
                if (r0 != r2) goto L_0x002a
                int r0 = r6.f84005b
                if (r0 == 0) goto L_0x002b
            L_0x002a:
                r3 = 1
            L_0x002b:
                r1.setMIsDragged(r3)
                com.ss.android.ugc.aweme.dsp.ui.a.c$e r0 = r5.f83963b
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.ui.a.c.g.onPageScrolled(int, float, int):void");
        }
    }

    private void c(int i2) {
        a(i2, 0.0f, true, true);
    }

    public final void setOverBorderTransparentWidth(float f2) {
        this.f83963b.setOverBorderWidth(f2);
    }

    public final void setSelectedTabIndicatorColor(int i2) {
        this.f83963b.setSelectedIndicatorColor(i2);
    }

    public final void setSelectedTabIndicatorHeight(int i2) {
        this.f83963b.setSelectedIndicatorHeight(i2);
    }

    public final void setTabStripMargin(float f2) {
        this.f83963b.setTabStripMargin(f2);
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l.d(attributeSet, "");
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        l.b(generateDefaultLayoutParams, "");
        return generateDefaultLayoutParams;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f83968g || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        a();
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator == null) {
            l.b();
        }
        valueAnimator.addListener(animatorListener);
    }

    public final void setTabMode(int i2) {
        if (i2 != this.t) {
            this.t = i2;
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f84013a;

        static {
            Covode.recordClassIndex(52391);
        }

        j(c cVar) {
            this.f84013a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            c cVar = this.f84013a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            cVar.scrollTo(((Integer) animatedValue).intValue(), 0);
        }
    }

    public final f a(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.f83962a.get(i2);
    }

    public final void setTabBarrierColor(int i2) {
        int c2;
        if (i2 == 0) {
            c2 = androidx.core.content.b.c(getContext(), R.color.b2);
        } else {
            c2 = androidx.core.content.b.c(getContext(), R.color.ln);
        }
        this.f83963b.setTabBarrierColor(c2);
    }

    public final int b(int i2) {
        Resources resources = getResources();
        l.b(resources, "");
        return Math.round(resources.getDisplayMetrics().density * ((float) i2));
    }

    public final boolean canScrollHorizontally(int i2) {
        int computeHorizontalScrollOffset = computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = computeHorizontalScrollRange() - computeHorizontalScrollExtent();
        if (computeHorizontalScrollRange == 0) {
            return false;
        }
        if (i2 < 0) {
            if (((float) computeHorizontalScrollOffset) - this.x > 0.0f) {
                return true;
            }
            return false;
        } else if (((float) computeHorizontalScrollOffset) + this.x < ((float) (computeHorizontalScrollRange - 1))) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(513);
        this.f83962a = new ArrayList<>();
        this.f83964c = Integer.MAX_VALUE;
        this.f83966e = new ArrayList<>();
        this.f83971j = new f.b(12);
        this.y = true;
        this.z = true;
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context);
        this.f83963b = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        eVar.setSelectedIndicatorHeight(0);
        eVar.setSelectedIndicatorColor(0);
        this.q = -1;
        this.r = -1;
        this.p = 0;
        this.t = 1;
        this.s = 0;
        this.v = n.b(getContext(), 1.5f);
        this.w = n.b(getContext(), 1.5f);
        Resources resources = getResources();
        l.b(resources, "");
        this.f83969h = resources.getConfiguration().orientation;
        b();
        MethodCollector.o(513);
    }

    private final void d(int i2) {
        if (i2 != -1) {
            if (getWindowToken() != null && v.v(this)) {
                e eVar = this.f83963b;
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
                    a();
                    ValueAnimator valueAnimator = this.u;
                    if (valueAnimator == null) {
                        l.b();
                    }
                    valueAnimator.setIntValues(scrollX, a2);
                    ValueAnimator valueAnimator2 = this.u;
                    if (valueAnimator2 == null) {
                        l.b();
                    }
                    valueAnimator2.start();
                }
                this.f83963b.b(i2, 200);
                return;
            }
            c(i2);
        }
    }

    private final void setSelectedTabView(int i2) {
        int c2;
        boolean z2;
        int childCount = this.f83963b.getChildCount();
        if (i2 == 0) {
            c2 = androidx.core.content.b.c(getContext(), R.color.ae);
        } else {
            c2 = androidx.core.content.b.c(getContext(), R.color.f159928l);
        }
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f83963b.getChildAt(i3);
                l.b(childAt, "");
                if (i3 == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                childAt.setSelected(z2);
                if (childAt instanceof h) {
                    h hVar = (h) childAt;
                    TextView mCustomTextView$music_dsp_release = hVar.getMCustomTextView$music_dsp_release();
                    if (mCustomTextView$music_dsp_release != null) {
                        mCustomTextView$music_dsp_release.setTextColor(c2);
                    }
                    if (hVar.isSelected()) {
                        if (mCustomTextView$music_dsp_release != null) {
                            mCustomTextView$music_dsp_release.setAlpha(1.0f);
                        }
                    } else if (mCustomTextView$music_dsp_release != null) {
                        mCustomTextView$music_dsp_release.setAlpha(this.f83963b.f83992g);
                    }
                }
            }
        }
    }

    public final void a(LinearLayout.LayoutParams layoutParams) {
        if (this.t == 1 && this.s == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i2 = this.o;
        if (i2 != 0) {
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = this.o;
        }
    }

    public final void a(boolean z2) {
        int childCount = this.f83963b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f83963b.getChildAt(i2);
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

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }

    public final class e extends d {

        /* renamed from: g  reason: collision with root package name */
        final float f83992g = 0.6f;

        /* renamed from: i  reason: collision with root package name */
        private final AnimatorSet f83994i = new AnimatorSet();

        /* access modifiers changed from: package-private */
        public static final class a implements TimeInterpolator {

            /* renamed from: a  reason: collision with root package name */
            public static final a f83996a = new a();

            static {
                Covode.recordClassIndex(52384);
            }

            a() {
            }

            public final float getInterpolation(float f2) {
                return f2 < 0.33333334f ? f2 * 1.5f : (f2 * 0.75f) + 0.25f;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b implements TimeInterpolator {

            /* renamed from: a  reason: collision with root package name */
            public static final b f83997a = new b();

            static {
                Covode.recordClassIndex(52385);
            }

            b() {
            }

            public final float getInterpolation(float f2) {
                return f2 < 0.33333334f ? f2 * 1.5f : (f2 * 0.75f) + 0.25f;
            }
        }

        static {
            Covode.recordClassIndex(52382);
        }

        public e(Context context) {
            super(context);
            c.this.f83966e.add(new AbstractC2003c(this) {
                /* class com.ss.android.ugc.aweme.dsp.ui.a.c.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f83995a;

                static {
                    Covode.recordClassIndex(52383);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f83995a = r1;
                }

                @Override // com.ss.android.ugc.aweme.dsp.ui.a.c.AbstractC2003c
                public final void b(f fVar) {
                    h hVar;
                    TextView mCustomTextView$music_dsp_release;
                    if (!c.this.getSwipeMode()) {
                        this.f83995a.a(fVar, true);
                    }
                    if (fVar != null && (hVar = fVar.f84002d) != null && (mCustomTextView$music_dsp_release = hVar.getMCustomTextView$music_dsp_release()) != null) {
                        com.bytedance.ies.dmt.ui.widget.util.b.a().a(mCustomTextView$music_dsp_release, com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
                    }
                }

                @Override // com.ss.android.ugc.aweme.dsp.ui.a.c.AbstractC2003c
                public final void a(f fVar) {
                    h hVar;
                    TextView mCustomTextView$music_dsp_release;
                    TextView mCustomTextView$music_dsp_release2;
                    l.d(fVar, "");
                    h hVar2 = fVar.f84002d;
                    int childCount = this.f83995a.getChildCount();
                    if (childCount >= 0) {
                        int i2 = 0;
                        while (true) {
                            View childAt = this.f83995a.getChildAt(i2);
                            if ((childAt instanceof h) && (mCustomTextView$music_dsp_release = (hVar = (h) childAt).getMCustomTextView$music_dsp_release()) != null && mCustomTextView$music_dsp_release.getVisibility() == 0 && (mCustomTextView$music_dsp_release2 = hVar.getMCustomTextView$music_dsp_release()) != null) {
                                mCustomTextView$music_dsp_release2.setAlpha(this.f83995a.f83992g);
                            }
                            if (i2 == childCount) {
                                break;
                            }
                            i2++;
                        }
                    }
                    if (hVar2 instanceof h) {
                        TextView mCustomTextView$music_dsp_release3 = hVar2.getMCustomTextView$music_dsp_release();
                        if (mCustomTextView$music_dsp_release3 != null) {
                            mCustomTextView$music_dsp_release3.setAlpha(1.0f);
                        }
                        com.bytedance.ies.dmt.ui.widget.util.b.a().a(mCustomTextView$music_dsp_release3, com.bytedance.ies.dmt.ui.widget.util.d.f33796b);
                    }
                    if (!c.this.getSwipeMode()) {
                        this.f83995a.a(fVar, false);
                    }
                }
            });
        }

        public final void a(f fVar, boolean z) {
            h hVar;
            TextView mCustomTextView$music_dsp_release;
            ObjectAnimator objectAnimator;
            ObjectAnimator objectAnimator2 = null;
            if (fVar != null && (hVar = fVar.f84002d) != null && (mCustomTextView$music_dsp_release = hVar.getMCustomTextView$music_dsp_release()) != null) {
                float f2 = 1.125f;
                float f3 = 1.0f;
                if (z) {
                    if (c.this.getEnableAnimation()) {
                        objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$music_dsp_release, "scaleX", mCustomTextView$music_dsp_release.getScaleX(), 1.0f).setDuration(200L);
                        objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$music_dsp_release, "scaleY", mCustomTextView$music_dsp_release.getScaleY(), 1.0f).setDuration(200L);
                    } else {
                        objectAnimator = null;
                    }
                    f2 = 1.0f;
                    f3 = 0.6f;
                } else if (c.this.getEnableAnimation()) {
                    objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$music_dsp_release, "scaleX", mCustomTextView$music_dsp_release.getScaleX(), 1.25f, 1.125f).setDuration(300L);
                    objectAnimator2.setInterpolator(a.f83996a);
                    objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$music_dsp_release, "scaleY", mCustomTextView$music_dsp_release.getScaleY(), 1.25f, 1.125f).setDuration(300L);
                    objectAnimator.setInterpolator(b.f83997a);
                } else {
                    objectAnimator = null;
                }
                if (c.this.getEnableAnimation()) {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(mCustomTextView$music_dsp_release, "alpha", mCustomTextView$music_dsp_release.getAlpha(), f3).setDuration(200L);
                    l.b(duration, "");
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(duration, objectAnimator2, objectAnimator);
                    animatorSet.start();
                    return;
                }
                mCustomTextView$music_dsp_release.setScaleX(f2);
                mCustomTextView$music_dsp_release.setScaleY(f2);
                mCustomTextView$music_dsp_release.setAlpha(f3);
            }
        }
    }

    private final int a(int i2, float f2) {
        View view;
        int i3;
        int i4 = 0;
        if (this.t != 0) {
            return 0;
        }
        View childAt = this.f83963b.getChildAt(i2);
        int i5 = i2 + 1;
        if (i5 < this.f83963b.getChildCount()) {
            view = this.f83963b.getChildAt(i5);
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
        int i6 = (int) (((float) (i3 + i4 + (this.o * 4))) * 0.5f * f2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.ui.a.c.onMeasure(int, int):void");
    }

    public final void a(f fVar, int i2) {
        fVar.f83999a = i2;
        this.f83962a.add(i2, fVar);
        int size = this.f83962a.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.f83962a.get(i2).f83999a = i2;
            } else {
                return;
            }
        }
    }

    public final void a(f fVar, boolean z2) {
        int i2;
        f fVar2 = this.n;
        if (!l.a(fVar2, fVar)) {
            if (fVar != null) {
                i2 = fVar.f83999a;
            } else {
                i2 = -1;
            }
            if (z2) {
                if ((fVar2 == null || fVar2.f83999a == -1) && i2 != -1) {
                    c(i2);
                } else {
                    d(i2);
                }
                if (i2 != -1) {
                    setSelectedTabView(i2);
                }
            }
            if (fVar2 != null) {
                for (int size = this.f83966e.size() - 1; size >= 0; size--) {
                    this.f83966e.get(size).b(fVar2);
                }
            }
            this.n = fVar;
            if (fVar != null) {
                for (int size2 = this.f83966e.size() - 1; size2 >= 0; size2--) {
                    this.f83966e.get(size2).a(fVar);
                }
            }
        } else if (fVar2 != null) {
            if (fVar == null) {
                l.b();
            }
            for (int size3 = this.f83966e.size() - 1; size3 >= 0; size3--) {
                this.f83966e.get(size3);
            }
            d(fVar.f83999a);
        }
    }

    public final void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.f83963b.getChildCount()) {
            if (z3) {
                this.f83963b.a(i2, f2);
            }
            ValueAnimator valueAnimator = this.u;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.u;
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
        e eVar = this.f83963b;
        if (c.this.f83968g && i4 > 0 && eVar.f83975d > 0.0f) {
            v.c(eVar);
        }
        return super.overScrollBy(i2, i3, i4, i5, i6, i7, 10, i9, z2);
    }
}
