package com.bytedance.ies.dmt.ui.widget;

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
    public boolean f33607a;

    /* renamed from: b  reason: collision with root package name */
    private final float f33608b;

    /* renamed from: c  reason: collision with root package name */
    private final float f33609c;

    /* renamed from: d  reason: collision with root package name */
    private final float f33610d;

    /* renamed from: e  reason: collision with root package name */
    private final float f33611e;

    /* renamed from: f  reason: collision with root package name */
    private final float f33612f;

    /* renamed from: g  reason: collision with root package name */
    private final long f33613g;

    /* renamed from: h  reason: collision with root package name */
    private int f33614h;

    /* renamed from: i  reason: collision with root package name */
    private int f33615i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f33616j;

    /* renamed from: k  reason: collision with root package name */
    private final PorterDuffXfermode f33617k;

    /* renamed from: l  reason: collision with root package name */
    private float f33618l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f33619m;
    private boolean n;
    private int o;
    private long p;
    private int q;
    private float r;
    private float s;
    private float t;
    private float u;

    static {
        Covode.recordClassIndex(20022);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void a() {
        d();
        this.f33607a = true;
        this.f33619m = true;
        postInvalidate();
    }

    public final void b() {
        this.f33607a = false;
        this.n = false;
        this.f33618l = 0.0f;
    }

    private static Paint c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    private void d() {
        this.p = -1;
        if (this.q <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.h1));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.q > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f33616j == null) {
            this.f33616j = c();
        }
        this.n = true;
    }

    public void setCycleBias(int i2) {
        this.o = i2;
    }

    public DoubleColorBallAnimationView(Context context) {
        this(context, null);
        a(context);
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
        this.f33614h = b.c(context, R.color.bh);
        this.f33615i = b.c(context, R.color.a2f);
    }

    public void setProgress(float f2) {
        if (!this.n) {
            d();
        }
        this.f33618l = f2;
        this.f33607a = false;
        this.f33619m = false;
        postInvalidate();
    }

    public void setProgressBarInfo(int i2) {
        if (i2 > 0) {
            this.q = i2;
            this.r = ((float) i2) / 2.0f;
            float f2 = ((float) (i2 >> 1)) * 0.32f;
            this.s = f2;
            float f3 = (((float) i2) * 0.16f) + f2;
            this.t = f3;
            this.u = ((float) i2) - (f3 * 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        int i2;
        int i3;
        MethodCollector.i(9145);
        super.onDraw(canvas);
        if ((this.f33607a || !this.f33619m) && this.n) {
            boolean z = false;
            if (this.f33619m) {
                long nanoTime = System.nanoTime() / 1000000;
                if (this.p < 0) {
                    this.p = nanoTime;
                }
                float f4 = ((float) (nanoTime - this.p)) / 400.0f;
                this.f33618l = f4;
                int i4 = (int) f4;
                if (((this.o + i4) & 1) == 1) {
                    z = true;
                }
                this.f33618l = f4 - ((float) i4);
            } else {
                z = false;
            }
            float f5 = this.f33618l;
            if (((double) f5) < 0.5d) {
                f2 = f5 * 2.0f * f5;
            } else {
                f2 = ((f5 * 2.0f) * (2.0f - f5)) - 1.0f;
            }
            int i5 = this.q;
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) i5, (float) i5, this.f33616j, 31);
            float f6 = (this.u * f2) + this.t;
            if (((double) f2) < 0.5d) {
                f3 = f2 * 2.0f;
            } else {
                f3 = 2.0f - (f2 * 2.0f);
            }
            float f7 = this.s;
            float f8 = (0.25f * f3 * f7) + f7;
            Paint paint = this.f33616j;
            if (z) {
                i2 = this.f33615i;
            } else {
                i2 = this.f33614h;
            }
            paint.setColor(i2);
            canvas.drawCircle(f6, this.r, f8, this.f33616j);
            float f9 = ((float) this.q) - f6;
            float f10 = this.s;
            float f11 = f10 - ((f3 * 0.375f) * f10);
            Paint paint2 = this.f33616j;
            if (z) {
                i3 = this.f33614h;
            } else {
                i3 = this.f33615i;
            }
            paint2.setColor(i3);
            this.f33616j.setXfermode(this.f33617k);
            canvas.drawCircle(f9, this.r, f11, this.f33616j);
            this.f33616j.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(17);
            MethodCollector.o(9145);
            return;
        }
        MethodCollector.o(9145);
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(9143);
        super.onMeasure(i2, i3);
        int min = Math.min(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        if (this.q > min && min > 0) {
            setProgressBarInfo(min);
        }
        MethodCollector.o(9143);
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8941);
        this.f33608b = 0.25f;
        this.f33609c = 0.375f;
        this.f33610d = 0.16f;
        this.f33611e = 0.32f;
        this.f33612f = 400.0f;
        this.f33613g = 17;
        this.f33617k = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.f33619m = false;
        this.n = false;
        this.o = 0;
        this.f33607a = false;
        this.p = -1;
        this.q = -1;
        a(context);
        MethodCollector.o(8941);
    }
}
