package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class CircleProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f150253a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f150254b;

    /* renamed from: c  reason: collision with root package name */
    private int f150255c;

    /* renamed from: d  reason: collision with root package name */
    private int f150256d;

    /* renamed from: e  reason: collision with root package name */
    private int f150257e;

    /* renamed from: f  reason: collision with root package name */
    private int f150258f = 100;

    /* renamed from: g  reason: collision with root package name */
    private int f150259g;

    /* renamed from: h  reason: collision with root package name */
    private int f150260h;

    /* renamed from: i  reason: collision with root package name */
    private float f150261i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f150262j;

    static {
        Covode.recordClassIndex(98863);
    }

    public final int getHeight$lib_runtime_release() {
        return this.f150256d;
    }

    public final int getWidth$lib_runtime_release() {
        return this.f150255c;
    }

    public final void setHeight$lib_runtime_release(int i2) {
        this.f150256d = i2;
    }

    public final void setMaxProgress(int i2) {
        this.f150258f = i2;
    }

    public final void setStartAngle(int i2) {
        this.f150259g = i2;
    }

    public final void setWidth$lib_runtime_release(int i2) {
        this.f150255c = i2;
    }

    public final void setProgress(int i2) {
        this.f150257e = i2;
        invalidate();
    }

    public final void setBgCircleColor(int i2) {
        Paint paint = this.f150253a;
        if (paint == null) {
            l.a("bgPaint");
        }
        paint.setColor(i2);
    }

    public final void setCircleWidth(int i2) {
        Paint paint = this.f150254b;
        if (paint == null) {
            l.a("progressPaint");
        }
        paint.setStrokeWidth((float) i2);
    }

    public final void setProgressColor(int i2) {
        Paint paint = this.f150254b;
        if (paint == null) {
            l.a("progressPaint");
        }
        paint.setColor(i2);
    }

    public final void setBgCircleWidth(int i2) {
        this.f150260h = i2 / 2;
        Paint paint = this.f150253a;
        if (paint == null) {
            l.a("bgPaint");
        }
        paint.setStrokeWidth((float) i2);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(4408);
        l.d(canvas, "");
        super.onDraw(canvas);
        float f2 = this.f150261i;
        if (f2 > 0.0f) {
            RectF rectF = this.f150262j;
            int i2 = this.f150255c;
            rectF.set(((float) (i2 / 2)) - f2, ((float) (this.f150256d / 2)) - f2, ((float) (i2 / 2)) + f2, ((float) (i2 / 2)) + f2);
        } else {
            RectF rectF2 = this.f150262j;
            int i3 = this.f150260h;
            rectF2.set((float) i3, (float) i3, (float) (this.f150255c - i3), (float) (this.f150256d - i3));
        }
        RectF rectF3 = this.f150262j;
        float f3 = (float) (this.f150259g - 90);
        float f4 = ((((float) this.f150257e) * 1.0f) / ((float) this.f150258f)) * 360.0f;
        Paint paint = this.f150254b;
        if (paint == null) {
            l.a("progressPaint");
        }
        canvas.drawArc(rectF3, f3, f4, false, paint);
        MethodCollector.o(4408);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(4079);
        super.onMeasure(i2, i3);
        this.f150255c = View.MeasureSpec.getSize(i2);
        this.f150256d = View.MeasureSpec.getSize(i3);
        MethodCollector.o(4079);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(4430);
        Paint paint = new Paint();
        this.f150253a = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f150253a;
        if (paint2 == null) {
            l.a("bgPaint");
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.f150253a;
        if (paint3 == null) {
            l.a("bgPaint");
        }
        Paint paint4 = new Paint(paint3);
        this.f150254b = paint4;
        paint4.setStrokeCap(Paint.Cap.ROUND);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv, R.attr.akw, R.attr.akx});
            l.b(obtainStyledAttributes, "");
            this.f150261i = obtainStyledAttributes.getDimension(13, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.f150262j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        MethodCollector.o(4430);
    }
}
