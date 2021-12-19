package com.bytedance.hybrid.spark.page;

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
import h.f.b.l;

public final class DoubleColorBallAnimationView extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f31186a;

    /* renamed from: b  reason: collision with root package name */
    private final float f31187b;

    /* renamed from: c  reason: collision with root package name */
    private final float f31188c;

    /* renamed from: d  reason: collision with root package name */
    private final float f31189d;

    /* renamed from: e  reason: collision with root package name */
    private final float f31190e;

    /* renamed from: f  reason: collision with root package name */
    private final float f31191f;

    /* renamed from: g  reason: collision with root package name */
    private final long f31192g;

    /* renamed from: h  reason: collision with root package name */
    private int f31193h;

    /* renamed from: i  reason: collision with root package name */
    private int f31194i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f31195j;

    /* renamed from: k  reason: collision with root package name */
    private final PorterDuffXfermode f31196k;

    /* renamed from: l  reason: collision with root package name */
    private float f31197l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f31198m;
    private boolean n;
    private int o;
    private long p;
    private int q;
    private float r;
    private float s;
    private float t;
    private float u;

    static {
        Covode.recordClassIndex(18110);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    private void a() {
        this.f31186a = false;
        this.n = false;
        this.f31197l = 0.0f;
    }

    private static Paint b() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    private final void c() {
        this.p = -1;
        if (this.q <= 0) {
            Context context = getContext();
            l.a((Object) context, "");
            setProgressBarInfo(context.getResources().getDimensionPixelSize(R.dimen.n8));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.q > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f31195j == null) {
            this.f31195j = b();
        }
        this.n = true;
    }

    public final void setCycleBias(int i2) {
        this.o = i2;
    }

    private final void a(Context context) {
        this.f31193h = b.c(context, R.color.jt);
        this.f31194i = b.c(context, R.color.ju);
    }

    public final void setProgress(float f2) {
        if (!this.n) {
            c();
        }
        this.f31197l = f2;
        this.f31186a = false;
        this.f31198m = false;
        postInvalidate();
    }

    public final void setProgressBarInfo(int i2) {
        if (i2 > 0) {
            this.q = i2;
            this.r = ((float) i2) / 2.0f;
            float f2 = ((float) (i2 >> 1)) * this.f31190e;
            this.s = f2;
            float f3 = (this.f31189d * ((float) i2)) + f2;
            this.t = f3;
            this.u = ((float) i2) - (f3 * 2.0f);
        }
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 0) {
            c();
            this.f31186a = true;
            this.f31198m = true;
            postInvalidate();
            return;
        }
        a();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f2;
        float f3;
        int i2;
        int i3;
        MethodCollector.i(6605);
        l.c(canvas, "");
        super.onDraw(canvas);
        if ((this.f31186a || !this.f31198m) && this.n) {
            boolean z = false;
            if (this.f31198m) {
                long nanoTime = System.nanoTime() / 1000000;
                if (this.p < 0) {
                    this.p = nanoTime;
                }
                float f4 = ((float) (nanoTime - this.p)) / this.f31191f;
                this.f31197l = f4;
                int i4 = (int) f4;
                if (((this.o + i4) & 1) == 1) {
                    z = true;
                }
                this.f31197l = f4 - ((float) i4);
            } else {
                z = false;
            }
            float f5 = this.f31197l;
            if (((double) f5) < 0.5d) {
                f2 = f5 * 2.0f * f5;
            } else {
                f2 = ((f5 * 2.0f) * (2.0f - f5)) - 1.0f;
            }
            int i5 = this.q;
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) i5, (float) i5, this.f31195j, 31);
            float f6 = (this.u * f2) + this.t;
            if (((double) f2) < 0.5d) {
                f3 = f2 * 2.0f;
            } else {
                f3 = 2.0f - (f2 * 2.0f);
            }
            float f7 = this.s;
            float f8 = (this.f31187b * f3 * f7) + f7;
            Paint paint = this.f31195j;
            if (paint == null) {
                l.a();
            }
            if (z) {
                i2 = this.f31194i;
            } else {
                i2 = this.f31193h;
            }
            paint.setColor(i2);
            float f9 = this.r;
            Paint paint2 = this.f31195j;
            if (paint2 == null) {
                l.a();
            }
            canvas.drawCircle(f6, f9, f8, paint2);
            float f10 = ((float) this.q) - f6;
            float f11 = this.s;
            float f12 = f11 - ((f3 * this.f31188c) * f11);
            Paint paint3 = this.f31195j;
            if (paint3 == null) {
                l.a();
            }
            if (z) {
                i3 = this.f31193h;
            } else {
                i3 = this.f31194i;
            }
            paint3.setColor(i3);
            Paint paint4 = this.f31195j;
            if (paint4 == null) {
                l.a();
            }
            paint4.setXfermode(this.f31196k);
            float f13 = this.r;
            Paint paint5 = this.f31195j;
            if (paint5 == null) {
                l.a();
            }
            canvas.drawCircle(f10, f13, f12, paint5);
            Paint paint6 = this.f31195j;
            if (paint6 == null) {
                l.a();
            }
            paint6.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(this.f31192g);
            MethodCollector.o(6605);
            return;
        }
        MethodCollector.o(6605);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.c(context, "");
        a(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(6583);
        super.onMeasure(i2, i3);
        int min = Math.min(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        if (this.q > min && min > 0) {
            setProgressBarInfo(min);
        }
        MethodCollector.o(6583);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(6610);
        this.f31187b = 0.25f;
        this.f31188c = 0.375f;
        this.f31189d = 0.16f;
        this.f31190e = 0.32f;
        this.f31191f = 400.0f;
        this.f31192g = 17;
        this.f31196k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.p = -1;
        this.q = -1;
        a(context);
        MethodCollector.o(6610);
    }
}
