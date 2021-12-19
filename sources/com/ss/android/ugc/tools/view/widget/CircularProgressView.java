package com.ss.android.ugc.tools.view.widget;

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

public class CircularProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f150263a;

    /* renamed from: b  reason: collision with root package name */
    public float f150264b;

    /* renamed from: c  reason: collision with root package name */
    public float f150265c;

    /* renamed from: d  reason: collision with root package name */
    public float f150266d;

    /* renamed from: e  reason: collision with root package name */
    public float f150267e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f150268f;

    /* renamed from: g  reason: collision with root package name */
    private int f150269g;

    /* renamed from: h  reason: collision with root package name */
    private RectF f150270h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f150271i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f150272j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f150273k;

    /* renamed from: l  reason: collision with root package name */
    private float f150274l;

    /* renamed from: m  reason: collision with root package name */
    private int f150275m;
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
        Covode.recordClassIndex(98864);
    }

    public int getColor() {
        return this.n;
    }

    public float getMaxProgress() {
        return this.f150274l;
    }

    public float getProgress() {
        return this.f150264b;
    }

    public int getThickness() {
        return this.f150275m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f150273k = false;
        b();
    }

    private void c() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.f150270h;
        int i2 = this.f150275m;
        int i3 = this.f150269g;
        rectF.set((float) (paddingLeft + i2), (float) (paddingTop + i2), (float) ((i3 - paddingLeft) - i2), (float) ((i3 - paddingTop) - i2));
    }

    private void d() {
        this.f150268f.setColor(this.n);
        this.f150268f.setStyle(Paint.Style.STROKE);
        this.f150268f.setStrokeWidth((float) this.f150275m);
        this.f150268f.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void b() {
        this.f150272j = false;
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

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f150273k = true;
        if (this.f150271i || this.f150272j) {
            a();
        }
    }

    public final void a() {
        if (!this.f150273k) {
            this.f150272j = true;
            return;
        }
        int i2 = 0;
        this.f150272j = false;
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
        if (!this.f150263a) {
            float f2 = this.v;
            this.f150267e = f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f2 + 360.0f);
            this.s = ofFloat;
            ofFloat.setDuration((long) this.p);
            this.s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.tools.view.widget.CircularProgressView.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(98865);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (CircularProgressView.this.f150264b != 0.0f) {
                        CircularProgressView.this.f150267e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CircularProgressView.this.invalidate();
                    }
                }
            });
            this.s.start();
            return;
        }
        this.f150265c = 15.0f;
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
            /* class com.ss.android.ugc.tools.view.widget.CircularProgressView.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            boolean f150277a;

            static {
                Covode.recordClassIndex(98866);
            }

            public final void onAnimationCancel(Animator animator) {
                this.f150277a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f150277a) {
                    CircularProgressView.this.a();
                }
            }
        });
        this.u.start();
    }

    public void setMaxProgress(float f2) {
        this.f150274l = f2;
        invalidate();
    }

    public void setColor(int i2) {
        this.n = i2;
        d();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        if (this.f150263a != z) {
            this.f150263a = z;
            a();
        }
    }

    public void setProgress(float f2) {
        if (this.f150264b != f2) {
            this.f150264b = f2;
            invalidate();
        }
    }

    public void setThickness(int i2) {
        this.f150275m = i2;
        d();
        c();
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
            b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(4713);
        super.onDraw(canvas);
        isInEditMode();
        float f2 = (this.f150264b / this.f150274l) * 360.0f;
        if (!this.f150263a) {
            canvas.drawArc(this.f150270h, this.f150267e, f2, false, this.f150268f);
            MethodCollector.o(4713);
            return;
        }
        canvas.drawArc(this.f150270h, this.f150267e + this.f150266d, this.f150265c, false, this.f150268f);
        MethodCollector.o(4713);
    }

    private AnimatorSet a(float f2) {
        int i2 = this.r;
        final float f3 = ((((float) (i2 - 1)) * 360.0f) / ((float) i2)) + 15.0f;
        final float f4 = ((f3 - 15.0f) * f2) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(15.0f, f3);
        ofFloat.setDuration((long) ((this.o / this.r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.tools.view.widget.CircularProgressView.AnonymousClass3 */

            static {
                Covode.recordClassIndex(98867);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f150265c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        int i3 = this.r;
        float f5 = (0.5f + f2) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((f2 * 720.0f) / ((float) i3), f5 / ((float) i3));
        ofFloat2.setDuration((long) ((this.o / this.r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.tools.view.widget.CircularProgressView.AnonymousClass4 */

            static {
                Covode.recordClassIndex(98868);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f150266d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f4, (f4 + f3) - 15.0f);
        ofFloat3.setDuration((long) ((this.o / this.r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.tools.view.widget.CircularProgressView.AnonymousClass5 */

            static {
                Covode.recordClassIndex(98869);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f150267e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView circularProgressView = CircularProgressView.this;
                circularProgressView.f150265c = (f3 - circularProgressView.f150267e) + f4;
                CircularProgressView.this.invalidate();
            }
        });
        int i4 = this.r;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f5 / ((float) i4), ((f2 + 1.0f) * 720.0f) / ((float) i4));
        ofFloat4.setDuration((long) ((this.o / this.r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.tools.view.widget.CircularProgressView.AnonymousClass6 */

            static {
                Covode.recordClassIndex(98870);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f150266d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(4685);
        super.onMeasure(i2, i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f150269g = measuredWidth;
        setMeasuredDimension(paddingLeft + measuredWidth, measuredWidth + paddingTop);
        MethodCollector.o(4685);
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
        MethodCollector.i(4665);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.qb, R.attr.qc, R.attr.qd, R.attr.qe, R.attr.qf, R.attr.qg, R.attr.qh, R.attr.qi, R.attr.qj, R.attr.qk, R.attr.ql}, 0, 0);
        Resources resources = getResources();
        this.f150264b = obtainStyledAttributes.getFloat(8, (float) a(resources, R.integer.b1));
        this.f150274l = obtainStyledAttributes.getFloat(7, (float) a(resources, R.integer.b0));
        this.f150275m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.go));
        this.f150263a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.f159911h));
        this.f150271i = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.f159910g));
        float f2 = obtainStyledAttributes.getFloat(9, (float) a(resources, R.integer.b2));
        this.v = f2;
        this.f150267e = f2;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.n = obtainStyledAttributes.getColor(5, resources.getColor(R.color.gu));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.n = typedValue.data;
        } else if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.n = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.gu));
            obtainStyledAttributes2.recycle();
        } else {
            this.n = resources.getColor(R.color.gu);
        }
        this.o = obtainStyledAttributes.getInteger(1, a(resources, R.integer.aw));
        this.p = obtainStyledAttributes.getInteger(3, a(resources, R.integer.ay));
        this.q = obtainStyledAttributes.getInteger(4, a(resources, R.integer.az));
        this.r = obtainStyledAttributes.getInteger(2, a(resources, R.integer.ax));
        obtainStyledAttributes.recycle();
        this.f150268f = new Paint(1);
        d();
        this.f150270h = new RectF();
        MethodCollector.o(4665);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 >= i3) {
            i2 = i3;
        }
        this.f150269g = i2;
        c();
    }
}
