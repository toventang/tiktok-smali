package com.ss.android.ugc.aweme.shortvideo.sticker;

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

public final class AVCircleProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f130195a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f130196b;

    /* renamed from: c  reason: collision with root package name */
    private int f130197c;

    /* renamed from: d  reason: collision with root package name */
    private int f130198d;

    /* renamed from: e  reason: collision with root package name */
    private int f130199e;

    /* renamed from: f  reason: collision with root package name */
    private int f130200f = 100;

    /* renamed from: g  reason: collision with root package name */
    private int f130201g;

    /* renamed from: h  reason: collision with root package name */
    private int f130202h;

    /* renamed from: i  reason: collision with root package name */
    private float f130203i;

    static {
        Covode.recordClassIndex(85404);
    }

    public final int getHeight$tools_avdmtview_release() {
        return this.f130198d;
    }

    public final int getWidth$tools_avdmtview_release() {
        return this.f130197c;
    }

    public final void setHeight$tools_avdmtview_release(int i2) {
        this.f130198d = i2;
    }

    public final void setMaxProgress(int i2) {
        this.f130200f = i2;
    }

    public final void setStartAngle(int i2) {
        this.f130201g = i2;
    }

    public final void setWidth$tools_avdmtview_release(int i2) {
        this.f130197c = i2;
    }

    public final void setProgress(int i2) {
        this.f130199e = i2;
        invalidate();
    }

    public final void setBgCircleColor(int i2) {
        Paint paint = this.f130195a;
        if (paint == null) {
            l.a("bgPaint");
        }
        paint.setColor(i2);
    }

    public final void setCircleWidth(int i2) {
        Paint paint = this.f130196b;
        if (paint == null) {
            l.a("progressPaint");
        }
        paint.setStrokeWidth((float) i2);
    }

    public final void setProgressColor(int i2) {
        Paint paint = this.f130196b;
        if (paint == null) {
            l.a("progressPaint");
        }
        paint.setColor(i2);
    }

    public final void setBgCircleWidth(int i2) {
        this.f130202h = i2 / 2;
        Paint paint = this.f130195a;
        if (paint == null) {
            l.a("bgPaint");
        }
        paint.setStrokeWidth((float) i2);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(8239);
        l.d(canvas, "");
        super.onDraw(canvas);
        int i2 = this.f130202h;
        RectF rectF = new RectF((float) i2, (float) i2, (float) (this.f130197c - i2), (float) (this.f130198d - i2));
        if (this.f130203i > 0.0f) {
            int i3 = this.f130197c;
            float f2 = this.f130203i;
            rectF = new RectF(((float) (i3 / 2)) - f2, ((float) (this.f130198d / 2)) - f2, ((float) (i3 / 2)) + f2, ((float) (i3 / 2)) + f2);
        }
        float f3 = (float) (this.f130201g - 90);
        float f4 = ((((float) this.f130199e) * 1.0f) / ((float) this.f130200f)) * 360.0f;
        Paint paint = this.f130196b;
        if (paint == null) {
            l.a("progressPaint");
        }
        canvas.drawArc(rectF, f3, f4, false, paint);
        MethodCollector.o(8239);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(8233);
        super.onMeasure(i2, i3);
        this.f130197c = View.MeasureSpec.getSize(i2);
        this.f130198d = View.MeasureSpec.getSize(i3);
        MethodCollector.o(8233);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AVCircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(8259);
        Paint paint = new Paint();
        this.f130195a = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f130195a;
        if (paint2 == null) {
            l.a("bgPaint");
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.f130195a;
        if (paint3 == null) {
            l.a("bgPaint");
        }
        Paint paint4 = new Paint(paint3);
        this.f130196b = paint4;
        paint4.setStrokeCap(Paint.Cap.ROUND);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3p});
            l.b(obtainStyledAttributes, "");
            this.f130203i = obtainStyledAttributes.getDimension(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        MethodCollector.o(8259);
    }
}
