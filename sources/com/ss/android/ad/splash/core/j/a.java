package com.ss.android.ad.splash.core.j;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public long f58623a = 0;

    /* renamed from: b  reason: collision with root package name */
    public double f58624b = 1.0d;

    /* renamed from: c  reason: collision with root package name */
    private final int f58625c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f58626d;

    /* renamed from: e  reason: collision with root package name */
    private int f58627e;

    /* renamed from: f  reason: collision with root package name */
    private int f58628f = -1;

    /* renamed from: g  reason: collision with root package name */
    private RectF f58629g;

    /* renamed from: h  reason: collision with root package name */
    private final float f58630h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    private ValueAnimator f58631i;

    static {
        Covode.recordClassIndex(36353);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.f58631i;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f58631i;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f58631i = null;
        }
    }

    public final void setBorderColor(int i2) {
        this.f58628f = i2;
        this.f58626d.setColor(i2);
    }

    public final void setBorderSize(int i2) {
        int max = Math.max(i2, 0);
        this.f58627e = max;
        this.f58626d.setStrokeWidth((float) max);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(2547);
        super.onDraw(canvas);
        RectF rectF = this.f58629g;
        if (rectF != null) {
            canvas.drawArc(rectF, -90.0f, (float) (this.f58624b * 360.0d), false, this.f58626d);
        }
        MethodCollector.o(2547);
    }

    public final void setDuration(long j2) {
        long max = Math.max(0L, j2);
        this.f58623a = max;
        if (max != 0) {
            ValueAnimator duration = ValueAnimator.ofFloat((float) max, 0.0f).setDuration(this.f58623a);
            this.f58631i = duration;
            duration.setInterpolator(new LinearInterpolator());
            this.f58631i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ad.splash.core.j.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36354);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    a aVar = a.this;
                    double d2 = (double) floatValue;
                    double d3 = (double) aVar.f58623a;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    aVar.f58624b = d2 / d3;
                    a.this.invalidate();
                }
            });
        }
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(2543);
        int parseColor = Color.parseColor("#979797");
        this.f58625c = parseColor;
        if (this.f58627e == 0) {
            this.f58627e = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        }
        Paint paint = new Paint();
        this.f58626d = paint;
        paint.setColor(this.f58628f);
        this.f58626d.setStyle(Paint.Style.STROKE);
        this.f58626d.setStrokeWidth((float) this.f58627e);
        this.f58626d.setAntiAlias(true);
        this.f58626d.setDither(true);
        setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setShape(1);
        int i2 = Build.VERSION.SDK_INT;
        setBackground(gradientDrawable);
        MethodCollector.o(2543);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(2546);
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            int i4 = this.f58627e;
            this.f58629g = new RectF((float) (i4 / 2), (float) (i4 / 2), (float) (getMeasuredWidth() - (this.f58627e / 2)), (float) (getMeasuredHeight() - (this.f58627e / 2)));
        }
        MethodCollector.o(2546);
    }
}
