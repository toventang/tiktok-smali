package com.ss.android.ugc.aweme.aabplugin.core.base.view;

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

public class DFCircularProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f62525a;

    /* renamed from: b  reason: collision with root package name */
    public float f62526b;

    /* renamed from: c  reason: collision with root package name */
    public float f62527c;

    /* renamed from: d  reason: collision with root package name */
    public float f62528d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f62529e;

    /* renamed from: f  reason: collision with root package name */
    private int f62530f;

    /* renamed from: g  reason: collision with root package name */
    private RectF f62531g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f62532h;

    /* renamed from: i  reason: collision with root package name */
    private float f62533i;

    /* renamed from: j  reason: collision with root package name */
    private float f62534j;

    /* renamed from: k  reason: collision with root package name */
    private int f62535k;

    /* renamed from: l  reason: collision with root package name */
    private int f62536l;

    /* renamed from: m  reason: collision with root package name */
    private int f62537m;
    private int n;
    private int o;
    private int p;
    private ValueAnimator q;
    private ValueAnimator r;
    private AnimatorSet s;
    private float t;

    static {
        Covode.recordClassIndex(38474);
    }

    public int getColor() {
        return this.f62536l;
    }

    public float getMaxProgress() {
        return this.f62534j;
    }

    public float getProgress() {
        return this.f62533i;
    }

    public int getThickness() {
        return this.f62535k;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f62532h) {
            a();
        }
    }

    private void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.f62531g;
        int i2 = this.f62535k;
        int i3 = this.f62530f;
        rectF.set((float) (paddingLeft + i2), (float) (paddingTop + i2), (float) ((i3 - paddingLeft) - i2), (float) ((i3 - paddingTop) - i2));
    }

    private void c() {
        this.f62529e.setColor(this.f62536l);
        this.f62529e.setStyle(Paint.Style.STROKE);
        this.f62529e.setStrokeWidth((float) this.f62535k);
        this.f62529e.setStrokeCap(Paint.Cap.ROUND);
    }

    private void d() {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.q = null;
        }
        ValueAnimator valueAnimator2 = this.r;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.r = null;
        }
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.q.cancel();
        }
        ValueAnimator valueAnimator2 = this.r;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.r.cancel();
        }
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.s.cancel();
        }
        int i2 = 0;
        if (!this.f62525a) {
            float f2 = this.t;
            this.f62528d = f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f2 + 360.0f);
            this.q = ofFloat;
            ofFloat.setDuration((long) this.n);
            this.q.setInterpolator(new DecelerateInterpolator(2.0f));
            this.q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(38475);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DFCircularProgressView.this.f62528d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    DFCircularProgressView.this.invalidate();
                }
            });
            this.q.start();
            return;
        }
        this.f62526b = 15.0f;
        this.s = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        while (i2 < this.p) {
            AnimatorSet a2 = a((float) i2);
            AnimatorSet.Builder play = this.s.play(a2);
            if (animatorSet2 != null) {
                play.after(animatorSet2);
            }
            i2++;
            animatorSet2 = a2;
        }
        this.s.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            boolean f62539a;

            static {
                Covode.recordClassIndex(38476);
            }

            public final void onAnimationCancel(Animator animator) {
                this.f62539a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f62539a) {
                    DFCircularProgressView.this.a();
                }
            }
        });
        this.s.start();
    }

    public void setMaxProgress(float f2) {
        this.f62534j = f2;
        invalidate();
    }

    public void setProgress(float f2) {
        this.f62533i = f2;
        invalidate();
    }

    public void setColor(int i2) {
        this.f62536l = i2;
        c();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        if (this.f62525a != z) {
            this.f62525a = z;
            a();
        }
    }

    public void setThickness(int i2) {
        this.f62535k = i2;
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
        MethodCollector.i(10642);
        super.onDraw(canvas);
        isInEditMode();
        float f2 = (this.f62533i / this.f62534j) * 360.0f;
        if (!this.f62525a) {
            canvas.drawArc(this.f62531g, this.f62528d, f2, false, this.f62529e);
            MethodCollector.o(10642);
            return;
        }
        canvas.drawArc(this.f62531g, this.f62528d + this.f62527c, this.f62526b, false, this.f62529e);
        MethodCollector.o(10642);
    }

    private AnimatorSet a(float f2) {
        int i2 = this.p;
        final float f3 = ((((float) (i2 - 1)) * 360.0f) / ((float) i2)) + 15.0f;
        final float f4 = ((f3 - 15.0f) * f2) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(15.0f, f3);
        ofFloat.setDuration((long) ((this.f62537m / this.p) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.AnonymousClass3 */

            static {
                Covode.recordClassIndex(38477);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f62526b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DFCircularProgressView.this.invalidate();
            }
        });
        int i3 = this.p;
        float f5 = (0.5f + f2) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((f2 * 720.0f) / ((float) i3), f5 / ((float) i3));
        ofFloat2.setDuration((long) ((this.f62537m / this.p) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.AnonymousClass4 */

            static {
                Covode.recordClassIndex(38478);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f62527c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f4, (f4 + f3) - 15.0f);
        ofFloat3.setDuration((long) ((this.f62537m / this.p) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.AnonymousClass5 */

            static {
                Covode.recordClassIndex(38479);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f62528d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DFCircularProgressView dFCircularProgressView = DFCircularProgressView.this;
                dFCircularProgressView.f62526b = (f3 - dFCircularProgressView.f62528d) + f4;
                DFCircularProgressView.this.invalidate();
            }
        });
        int i4 = this.p;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f5 / ((float) i4), ((f2 + 1.0f) * 720.0f) / ((float) i4));
        ofFloat4.setDuration((long) ((this.f62537m / this.p) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.AnonymousClass6 */

            static {
                Covode.recordClassIndex(38480);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f62527c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(10483);
        super.onMeasure(i2, i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f62530f = measuredWidth;
        setMeasuredDimension(paddingLeft + measuredWidth, measuredWidth + paddingTop);
        MethodCollector.o(10483);
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

    public DFCircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10332);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.qb, R.attr.qc, R.attr.qd, R.attr.qe, R.attr.qf, R.attr.qg, R.attr.qh, R.attr.qi, R.attr.qj, R.attr.qk, R.attr.ql}, 0, 0);
        Resources resources = getResources();
        this.f62533i = obtainStyledAttributes.getFloat(8, (float) a(resources, R.integer.b1));
        this.f62534j = obtainStyledAttributes.getFloat(7, (float) a(resources, R.integer.b0));
        this.f62535k = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.go));
        this.f62525a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.f159911h));
        this.f62532h = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.f159910g));
        float f2 = obtainStyledAttributes.getFloat(9, (float) a(resources, R.integer.b2));
        this.t = f2;
        this.f62528d = f2;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f62536l = obtainStyledAttributes.getColor(5, resources.getColor(R.color.gu));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f62536l = typedValue.data;
        } else if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f62536l = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.gu));
            obtainStyledAttributes2.recycle();
        } else {
            this.f62536l = resources.getColor(R.color.gu);
        }
        this.f62537m = obtainStyledAttributes.getInteger(1, a(resources, R.integer.aw));
        this.n = obtainStyledAttributes.getInteger(3, a(resources, R.integer.ay));
        this.o = obtainStyledAttributes.getInteger(4, a(resources, R.integer.az));
        this.p = obtainStyledAttributes.getInteger(2, a(resources, R.integer.ax));
        obtainStyledAttributes.recycle();
        this.f62529e = new Paint(1);
        c();
        this.f62531g = new RectF();
        MethodCollector.o(10332);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 >= i3) {
            i2 = i3;
        }
        this.f62530f = i2;
        b();
    }
}
