package com.google.android.material.h;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.appcompat.b.a.c;
import com.bytedance.covode.number.Covode;

public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    static final double f52436b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c  reason: collision with root package name */
    final Paint f52437c;

    /* renamed from: d  reason: collision with root package name */
    final Paint f52438d;

    /* renamed from: e  reason: collision with root package name */
    final RectF f52439e;

    /* renamed from: f  reason: collision with root package name */
    public float f52440f;

    /* renamed from: g  reason: collision with root package name */
    Path f52441g;

    /* renamed from: h  reason: collision with root package name */
    float f52442h;

    /* renamed from: i  reason: collision with root package name */
    public float f52443i;

    /* renamed from: j  reason: collision with root package name */
    float f52444j;

    /* renamed from: k  reason: collision with root package name */
    public float f52445k;

    /* renamed from: l  reason: collision with root package name */
    public float f52446l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f52447m;
    private final int n;
    private final int o;
    private final int p;
    private boolean q;
    private boolean r;

    @Override // androidx.appcompat.b.a.c
    public final int getOpacity() {
        return -3;
    }

    static {
        Covode.recordClassIndex(32521);
    }

    @Override // androidx.appcompat.b.a.c
    public final void onBoundsChange(Rect rect) {
        this.f52447m = true;
    }

    public final void a(float f2) {
        a(f2, this.f52443i);
    }

    private static int b(float f2) {
        int round = Math.round(f2);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    @Override // androidx.appcompat.b.a.c
    public final void setAlpha(int i2) {
        super.setAlpha(i2);
        this.f52437c.setAlpha(i2);
        this.f52438d.setAlpha(i2);
    }

    @Override // androidx.appcompat.b.a.c
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) a(this.f52443i, this.f52440f, this.q));
        int ceil2 = (int) Math.ceil((double) b(this.f52443i, this.f52440f, this.q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // androidx.appcompat.b.a.c
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f52447m) {
            Rect bounds = getBounds();
            float f2 = this.f52443i * 1.5f;
            this.f52439e.set(((float) bounds.left) + this.f52443i, ((float) bounds.top) + f2, ((float) bounds.right) - this.f52443i, ((float) bounds.bottom) - f2);
            this.f1046a.setBounds((int) this.f52439e.left, (int) this.f52439e.top, (int) this.f52439e.right, (int) this.f52439e.bottom);
            float f3 = this.f52440f;
            RectF rectF = new RectF(-f3, -f3, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f4 = this.f52444j;
            rectF2.inset(-f4, -f4);
            Path path = this.f52441g;
            if (path == null) {
                this.f52441g = new Path();
            } else {
                path.reset();
            }
            this.f52441g.setFillType(Path.FillType.EVEN_ODD);
            this.f52441g.moveTo(-this.f52440f, 0.0f);
            this.f52441g.rLineTo(-this.f52444j, 0.0f);
            this.f52441g.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f52441g.arcTo(rectF, 270.0f, -90.0f, false);
            this.f52441g.close();
            float f5 = -rectF2.top;
            if (f5 > 0.0f) {
                float f6 = this.f52440f / f5;
                this.f52437c.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{0, this.n, this.o, this.p}, new float[]{0.0f, f6, ((1.0f - f6) / 2.0f) + f6, 1.0f}, Shader.TileMode.CLAMP));
            }
            z = true;
            this.f52438d.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.n, this.o, this.p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f52438d.setAntiAlias(false);
            this.f52447m = false;
        } else {
            z = true;
        }
        int save = canvas.save();
        canvas.rotate(this.f52446l, this.f52439e.centerX(), this.f52439e.centerY());
        float f7 = this.f52440f;
        float f8 = (-f7) - this.f52444j;
        float f9 = f7 * 2.0f;
        if (this.f52439e.width() - f9 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f52439e.height() - f9 <= 0.0f) {
            z = false;
        }
        float f10 = this.f52445k;
        float f11 = f7 / ((f10 - (0.5f * f10)) + f7);
        float f12 = f7 / ((f10 - (0.25f * f10)) + f7);
        float f13 = f7 / ((f10 - (1.0f * f10)) + f7);
        int save2 = canvas.save();
        canvas.translate(this.f52439e.left + f7, this.f52439e.top + f7);
        canvas.scale(f11, f12);
        canvas.drawPath(this.f52441g, this.f52437c);
        if (z2) {
            canvas.scale(1.0f / f11, 1.0f);
            canvas.drawRect(0.0f, f8, this.f52439e.width() - f9, -this.f52440f, this.f52438d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f52439e.right - f7, this.f52439e.bottom - f7);
        canvas.scale(f11, f13);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f52441g, this.f52437c);
        if (z2) {
            canvas.scale(1.0f / f11, 1.0f);
            canvas.drawRect(0.0f, f8, this.f52439e.width() - f9, (-this.f52440f) + this.f52444j, this.f52438d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f52439e.left + f7, this.f52439e.bottom - f7);
        canvas.scale(f11, f13);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f52441g, this.f52437c);
        if (z) {
            canvas.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f8, this.f52439e.height() - f9, -this.f52440f, this.f52438d);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        canvas.translate(this.f52439e.right - f7, this.f52439e.top + f7);
        canvas.scale(f11, f12);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f52441g, this.f52437c);
        if (z) {
            canvas.scale(1.0f / f12, 1.0f);
            canvas.drawRect(0.0f, f8, this.f52439e.height() - f9, -this.f52440f, this.f52438d);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(save);
        super.draw(canvas);
    }

    public final void a(float f2, float f3) {
        if (f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float b2 = (float) b(f2);
        float b3 = (float) b(f3);
        if (b2 > b3) {
            if (!this.r) {
                this.r = true;
            }
            b2 = b3;
        }
        if (this.f52445k != b2 || this.f52443i != b3) {
            this.f52445k = b2;
            this.f52443i = b3;
            this.f52444j = (float) Math.round(b2 * 1.5f);
            this.f52442h = b3;
            this.f52447m = true;
            invalidateSelf();
        }
    }

    public static float a(float f2, float f3, boolean z) {
        if (!z) {
            return f2 * 1.5f;
        }
        double d2 = (double) (f2 * 1.5f);
        double d3 = 1.0d - f52436b;
        double d4 = (double) f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    public static float b(float f2, float f3, boolean z) {
        if (!z) {
            return f2;
        }
        double d2 = (double) f2;
        double d3 = 1.0d - f52436b;
        double d4 = (double) f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }
}
