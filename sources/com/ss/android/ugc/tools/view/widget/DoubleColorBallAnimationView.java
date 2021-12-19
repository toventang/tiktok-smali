package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class DoubleColorBallAnimationView extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f150286a;

    /* renamed from: b  reason: collision with root package name */
    private int f150287b;

    /* renamed from: c  reason: collision with root package name */
    private int f150288c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f150289d;

    /* renamed from: e  reason: collision with root package name */
    private final PorterDuffXfermode f150290e;

    /* renamed from: f  reason: collision with root package name */
    private long f150291f;

    /* renamed from: g  reason: collision with root package name */
    private int f150292g;

    /* renamed from: h  reason: collision with root package name */
    private float f150293h;

    /* renamed from: i  reason: collision with root package name */
    private float f150294i;

    /* renamed from: j  reason: collision with root package name */
    private float f150295j;

    /* renamed from: k  reason: collision with root package name */
    private float f150296k;

    static {
        Covode.recordClassIndex(98872);
    }

    public final void b() {
        setLayerType(0, null);
        this.f150286a = false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void a() {
        setLayerType(1, null);
        d();
        this.f150286a = true;
        postInvalidate();
    }

    private static Paint c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    private void d() {
        this.f150291f = -1;
        if (this.f150292g <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.tr));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.f150292g > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f150289d == null) {
            this.f150289d = c();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 0) {
            a();
        } else {
            b();
        }
    }

    private void a(Context context) {
        this.f150287b = b.c(context, R.color.r0);
        this.f150288c = b.c(context, R.color.r1);
    }

    public void setProgressBarInfo(int i2) {
        if (i2 > 0) {
            this.f150292g = i2;
            this.f150293h = ((float) i2) / 2.0f;
            float f2 = ((float) (i2 >> 1)) * 0.32f;
            this.f150294i = f2;
            float f3 = (((float) i2) * 0.16f) + f2;
            this.f150295j = f3;
            this.f150296k = ((float) i2) - (f3 * 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        float f2;
        float f3;
        int i2;
        int i3;
        MethodCollector.i(8705);
        super.onDraw(canvas);
        if (!this.f150286a) {
            MethodCollector.o(8705);
            return;
        }
        long nanoTime = System.nanoTime() / 1000000;
        if (this.f150291f < 0) {
            this.f150291f = nanoTime;
        }
        float f4 = ((float) (nanoTime - this.f150291f)) / 400.0f;
        int i4 = (int) f4;
        if ((i4 & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        float f5 = f4 - ((float) i4);
        if (((double) f5) < 0.5d) {
            f2 = f5 * 2.0f * f5;
        } else {
            f2 = ((f5 * 2.0f) * (2.0f - f5)) - 1.0f;
        }
        int i5 = this.f150292g;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) i5, (float) i5, this.f150289d, 31);
        float f6 = (this.f150296k * f2) + this.f150295j;
        if (((double) f2) < 0.5d) {
            f3 = f2 * 2.0f;
        } else {
            f3 = 2.0f - (f2 * 2.0f);
        }
        float f7 = this.f150294i;
        float f8 = (0.25f * f3 * f7) + f7;
        Paint paint = this.f150289d;
        if (z) {
            i2 = this.f150288c;
        } else {
            i2 = this.f150287b;
        }
        paint.setColor(i2);
        canvas.drawCircle(f6, this.f150293h, f8, this.f150289d);
        float f9 = ((float) this.f150292g) - f6;
        float f10 = this.f150294i;
        float f11 = f10 - ((f3 * 0.375f) * f10);
        Paint paint2 = this.f150289d;
        if (z) {
            i3 = this.f150287b;
        } else {
            i3 = this.f150288c;
        }
        paint2.setColor(i3);
        this.f150289d.setXfermode(this.f150290e);
        canvas.drawCircle(f9, this.f150293h, f11, this.f150289d);
        this.f150289d.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        postInvalidateDelayed(17);
        MethodCollector.o(8705);
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(8703);
        super.onMeasure(i2, i3);
        int min = Math.min(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        if (this.f150292g > min && min > 0) {
            setProgressBarInfo(min);
        }
        MethodCollector.o(8703);
    }

    private DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8689);
        this.f150290e = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.f150286a = false;
        this.f150291f = -1;
        this.f150292g = -1;
        a(context);
        MethodCollector.o(8689);
    }
}
