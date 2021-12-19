package com.bytedance.tux.status.loading;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.j.h;

public final class TuxDualBallView extends View {

    /* renamed from: f  reason: collision with root package name */
    public static final a f45370f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public float f45371a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45372b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f45373c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45374d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f45375e;

    /* renamed from: g  reason: collision with root package name */
    private int f45376g;

    /* renamed from: h  reason: collision with root package name */
    private int f45377h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f45378i;

    /* renamed from: j  reason: collision with root package name */
    private final PorterDuffXfermode f45379j;

    /* renamed from: k  reason: collision with root package name */
    private final int f45380k;

    /* renamed from: l  reason: collision with root package name */
    private long f45381l;

    /* renamed from: m  reason: collision with root package name */
    private int f45382m;
    private float n;
    private float o;
    private float p;
    private float q;

    static {
        Covode.recordClassIndex(27632);
    }

    public TuxDualBallView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27633);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public final void b() {
        a();
        this.f45374d = true;
        this.f45372b = true;
        postInvalidate();
    }

    public final void c() {
        this.f45374d = false;
        this.f45373c = false;
        this.f45371a = 0.0f;
    }

    public final void a() {
        this.f45381l = -1;
        if (this.f45382m <= 0) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            setProgressBarInfo(h.g.a.a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics())));
        }
        int c2 = h.c(getMeasuredHeight(), getMeasuredWidth());
        int i2 = this.f45382m;
        if (1 <= c2 && i2 > c2) {
            setProgressBarInfo(c2);
        }
        this.f45373c = true;
    }

    public final void setAnimating(boolean z) {
        this.f45374d = z;
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 != 0) {
            c();
        }
    }

    public final void setProgressBarInfo(int i2) {
        if (i2 > 0) {
            this.f45382m = i2;
            this.n = ((float) i2) / 2.0f;
            float f2 = ((float) (i2 >> 1)) * 0.32f;
            this.o = f2;
            float f3 = (((float) i2) * 0.16f) + f2;
            this.p = f3;
            this.q = ((float) i2) - (f3 * 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f2;
        float f3;
        int i2;
        int i3;
        MethodCollector.i(9049);
        l.c(canvas, "");
        super.onDraw(canvas);
        if ((this.f45374d || !this.f45372b) && this.f45373c) {
            if (this.f45372b) {
                long nanoTime = System.nanoTime() / 1000000;
                if (this.f45381l < 0) {
                    this.f45381l = nanoTime;
                }
                float f4 = ((float) (nanoTime - this.f45381l)) / 400.0f;
                this.f45371a = f4;
                int i4 = (int) f4;
                boolean z = true;
                if (((this.f45380k + i4) & 1) != 1) {
                    z = false;
                }
                this.f45375e = z;
                this.f45371a = f4 - ((float) i4);
            }
            float f5 = this.f45371a;
            if (((double) f5) < 0.5d) {
                f2 = f5 * 2.0f * f5;
            } else {
                f2 = ((f5 * 2.0f) * (2.0f - f5)) - 1.0f;
            }
            int i5 = this.f45382m;
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) i5, (float) i5, this.f45378i, 31);
            float f6 = (this.q * f2) + this.p;
            if (((double) f2) < 0.5d) {
                f3 = f2 * 2.0f;
            } else {
                f3 = 2.0f - (f2 * 2.0f);
            }
            float f7 = this.o;
            float f8 = (0.25f * f3 * f7) + f7;
            Paint paint = this.f45378i;
            if (this.f45375e) {
                i2 = this.f45377h;
            } else {
                i2 = this.f45376g;
            }
            paint.setColor(i2);
            canvas.drawCircle(f6, this.n, f8, this.f45378i);
            float f9 = ((float) this.f45382m) - f6;
            float f10 = this.o;
            float f11 = f10 - ((f3 * 0.375f) * f10);
            Paint paint2 = this.f45378i;
            if (this.f45375e) {
                i3 = this.f45376g;
            } else {
                i3 = this.f45377h;
            }
            paint2.setColor(i3);
            this.f45378i.setXfermode(this.f45379j);
            canvas.drawCircle(f9, this.n, f11, this.f45378i);
            this.f45378i.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(17);
            MethodCollector.o(9049);
            return;
        }
        MethodCollector.o(9049);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(8852);
        super.onMeasure(i2, i3);
        int c2 = h.c(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        int i4 = this.f45382m;
        if (1 > c2) {
            MethodCollector.o(8852);
            return;
        }
        if (i4 > c2) {
            setProgressBarInfo(c2);
        }
        MethodCollector.o(8852);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxDualBallView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxDualBallView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(9051);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.f45378i = paint;
        this.f45379j = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.f45381l = -1;
        this.f45382m = -1;
        this.f45376g = Color.parseColor("#FE2C55");
        this.f45377h = Color.parseColor("#25F4EE");
        MethodCollector.o(9051);
    }
}
