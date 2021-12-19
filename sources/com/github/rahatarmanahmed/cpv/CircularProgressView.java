package com.github.rahatarmanahmed.cpv;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CircularProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f49264a;

    /* renamed from: b  reason: collision with root package name */
    public float f49265b;

    /* renamed from: c  reason: collision with root package name */
    public float f49266c;

    /* renamed from: d  reason: collision with root package name */
    public List<Object> f49267d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public float f49268e;

    /* renamed from: f  reason: collision with root package name */
    public float f49269f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f49270g;

    /* renamed from: h  reason: collision with root package name */
    private int f49271h;

    /* renamed from: i  reason: collision with root package name */
    private RectF f49272i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f49273j;

    /* renamed from: k  reason: collision with root package name */
    private float f49274k;

    /* renamed from: l  reason: collision with root package name */
    private float f49275l;

    /* renamed from: m  reason: collision with root package name */
    private int f49276m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private ValueAnimator s;
    private ValueAnimator t;
    private AnimatorSet u;
    private float v;

    static {
        Covode.recordClassIndex(30828);
    }

    public int getColor() {
        return this.n;
    }

    public float getMaxProgress() {
        return this.f49275l;
    }

    public float getProgress() {
        return this.f49274k;
    }

    public int getThickness() {
        return this.f49276m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f49273j) {
            a();
        }
    }

    private void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.f49272i;
        int i2 = this.f49276m;
        int i3 = this.f49271h;
        rectF.set((float) (paddingLeft + i2), (float) (paddingTop + i2), (float) ((i3 - paddingLeft) - i2), (float) ((i3 - paddingTop) - i2));
    }

    private void c() {
        this.f49270g.setColor(this.n);
        this.f49270g.setStyle(Paint.Style.STROKE);
        this.f49270g.setStrokeWidth((float) this.f49276m);
        this.f49270g.setStrokeCap(Paint.Cap.BUTT);
    }

    private void d() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.s = null;
        }
        ValueAnimator valueAnimator2 = this.t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.t = null;
        }
        AnimatorSet animatorSet = this.u;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.u = null;
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.s.cancel();
        }
        ValueAnimator valueAnimator2 = this.t;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.t.cancel();
        }
        AnimatorSet animatorSet = this.u;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.u.cancel();
        }
        int i2 = 0;
        if (!this.f49264a) {
            float f2 = this.v;
            this.f49268e = f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f2 + 360.0f);
            this.s = ofFloat;
            ofFloat.setDuration((long) this.p);
            this.s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.github.rahatarmanahmed.cpv.CircularProgressView.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(30831);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f49268e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.s.start();
            this.f49269f = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, this.f49274k);
            this.t = ofFloat2;
            ofFloat2.setDuration((long) this.q);
            this.t.setInterpolator(new LinearInterpolator());
            this.t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.github.rahatarmanahmed.cpv.CircularProgressView.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(30832);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f49269f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.t.start();
            return;
        }
        this.f49265b = 15.0f;
        this.u = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        while (i2 < this.r) {
            AnimatorSet a2 = a((float) i2);
            AnimatorSet.Builder play = this.u.play(a2);
            if (animatorSet2 != null) {
                play.after(animatorSet2);
            }
            i2++;
            animatorSet2 = a2;
        }
        this.u.addListener(new AnimatorListenerAdapter() {
            /* class com.github.rahatarmanahmed.cpv.CircularProgressView.AnonymousClass5 */

            /* renamed from: a  reason: collision with root package name */
            boolean f49282a;

            static {
                Covode.recordClassIndex(30833);
            }

            public final void onAnimationCancel(Animator animator) {
                this.f49282a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f49282a) {
                    CircularProgressView.this.a();
                }
            }
        });
        this.u.start();
        Iterator<Object> it = this.f49267d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void setMaxProgress(float f2) {
        this.f49275l = f2;
        invalidate();
    }

    public void setColor(int i2) {
        this.n = i2;
        c();
        invalidate();
    }

    public void setThickness(int i2) {
        this.f49276m = i2;
        c();
        b();
        invalidate();
    }

    public void setVisibility(int i2) {
        int visibility = getVisibility();
        super.setVisibility(i2);
        if (i2 == visibility) {
            return;
        }
        if (i2 == 0) {
            a();
        } else if (i2 == 8 || i2 == 4) {
            d();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        MethodCollector.i(9252);
        super.onDraw(canvas);
        if (isInEditMode()) {
            f2 = this.f49274k;
        } else {
            f2 = this.f49269f;
        }
        float f3 = (f2 / this.f49275l) * 360.0f;
        if (!this.f49264a) {
            canvas.drawArc(this.f49272i, this.f49268e, f3, false, this.f49270g);
            MethodCollector.o(9252);
            return;
        }
        canvas.drawArc(this.f49272i, this.f49268e + this.f49266c, this.f49265b, false, this.f49270g);
        MethodCollector.o(9252);
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        boolean z3 = this.f49264a;
        if (z3 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f49264a = z;
        if (z2) {
            a();
        }
        if (z3 != z) {
            Iterator<Object> it = this.f49267d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setProgress(final float f2) {
        this.f49274k = f2;
        if (!this.f49264a) {
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.t.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49269f, f2);
            this.t = ofFloat;
            ofFloat.setDuration((long) this.q);
            this.t.setInterpolator(new LinearInterpolator());
            this.t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.github.rahatarmanahmed.cpv.CircularProgressView.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(30829);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f49269f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.t.addListener(new AnimatorListenerAdapter() {
                /* class com.github.rahatarmanahmed.cpv.CircularProgressView.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(30830);
                }

                public final void onAnimationEnd(Animator animator) {
                    Iterator<Object> it = CircularProgressView.this.f49267d.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
            this.t.start();
        }
        invalidate();
        Iterator<Object> it = this.f49267d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private AnimatorSet a(float f2) {
        int i2 = this.r;
        final float f3 = ((((float) (i2 - 1)) * 360.0f) / ((float) i2)) + 15.0f;
        final float f4 = ((f3 - 15.0f) * f2) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(15.0f, f3);
        ofFloat.setDuration((long) ((this.o / this.r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.github.rahatarmanahmed.cpv.CircularProgressView.AnonymousClass6 */

            static {
                Covode.recordClassIndex(30834);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f49265b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        int i3 = this.r;
        float f5 = (0.5f + f2) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((f2 * 720.0f) / ((float) i3), f5 / ((float) i3));
        ofFloat2.setDuration((long) ((this.o / this.r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.github.rahatarmanahmed.cpv.CircularProgressView.AnonymousClass7 */

            static {
                Covode.recordClassIndex(30835);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f49266c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f4, (f4 + f3) - 15.0f);
        ofFloat3.setDuration((long) ((this.o / this.r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.github.rahatarmanahmed.cpv.CircularProgressView.AnonymousClass8 */

            static {
                Covode.recordClassIndex(30836);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f49268e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView circularProgressView = CircularProgressView.this;
                circularProgressView.f49265b = (f3 - circularProgressView.f49268e) + f4;
                CircularProgressView.this.invalidate();
            }
        });
        int i4 = this.r;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f5 / ((float) i4), ((f2 + 1.0f) * 720.0f) / ((float) i4));
        ofFloat4.setDuration((long) ((this.o / this.r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.github.rahatarmanahmed.cpv.CircularProgressView.AnonymousClass9 */

            static {
                Covode.recordClassIndex(30837);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f49266c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(8877);
        super.onMeasure(i2, i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f49271h = measuredWidth;
        setMeasuredDimension(paddingLeft + measuredWidth, measuredWidth + paddingTop);
        MethodCollector.o(8877);
    }

    private static int a(Resources resources, int i2) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i2);
        if (matchConfig == null) {
            return resources.getInteger(i2);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i2);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i3 = 0; i3 < min; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i2);
        }
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(8872);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.qb, R.attr.qc, R.attr.qd, R.attr.qe, R.attr.qf, R.attr.qg, R.attr.qh, R.attr.qi, R.attr.qj, R.attr.qk, R.attr.ql}, 0, 0);
        Resources resources = getResources();
        this.f49274k = obtainStyledAttributes.getFloat(8, (float) a(resources, R.integer.b1));
        this.f49275l = obtainStyledAttributes.getFloat(7, (float) a(resources, R.integer.b0));
        this.f49276m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.go));
        this.f49264a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.f159911h));
        this.f49273j = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.f159910g));
        float f2 = obtainStyledAttributes.getFloat(9, (float) a(resources, R.integer.b2));
        this.v = f2;
        this.f49268e = f2;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.n = obtainStyledAttributes.getColor(5, resources.getColor(R.color.gu));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.n = typedValue.data;
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.n = getContext().obtainStyledAttributes(new int[]{16843829}).getColor(0, resources.getColor(R.color.gu));
        } else {
            this.n = resources.getColor(R.color.gu);
        }
        this.o = obtainStyledAttributes.getInteger(1, a(resources, R.integer.aw));
        this.p = obtainStyledAttributes.getInteger(3, a(resources, R.integer.ay));
        this.q = obtainStyledAttributes.getInteger(4, a(resources, R.integer.az));
        this.r = obtainStyledAttributes.getInteger(2, a(resources, R.integer.ax));
        obtainStyledAttributes.recycle();
        this.f49270g = new Paint(1);
        c();
        this.f49272i = new RectF();
        MethodCollector.o(8872);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 >= i3) {
            i2 = i3;
        }
        this.f49271h = i2;
        b();
    }
}
