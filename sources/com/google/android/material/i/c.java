package com.google.android.material.i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.e;
import com.bytedance.covode.number.Covode;

public final class c extends Drawable implements e {

    /* renamed from: a  reason: collision with root package name */
    public e f52448a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f52449b;

    /* renamed from: c  reason: collision with root package name */
    public float f52450c;

    /* renamed from: d  reason: collision with root package name */
    public int f52451d;

    /* renamed from: e  reason: collision with root package name */
    public int f52452e;

    /* renamed from: f  reason: collision with root package name */
    public float f52453f;

    /* renamed from: g  reason: collision with root package name */
    public float f52454g;

    /* renamed from: h  reason: collision with root package name */
    public Paint.Style f52455h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f52456i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f52457j;

    /* renamed from: k  reason: collision with root package name */
    private final Matrix[] f52458k;

    /* renamed from: l  reason: collision with root package name */
    private final Matrix[] f52459l;

    /* renamed from: m  reason: collision with root package name */
    private final d[] f52460m;
    private final Matrix n;
    private final Path o;
    private final PointF p;
    private final d q;
    private final Region r;
    private final Region s;
    private final float[] t;
    private final float[] u;
    private boolean v;
    private int w;
    private int x;
    private PorterDuffColorFilter y;
    private PorterDuff.Mode z;

    static {
        Covode.recordClassIndex(32525);
    }

    public final int getOpacity() {
        return -3;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.r.set(bounds);
        b(bounds.width(), bounds.height(), this.o);
        this.s.setPath(this.o, this.r);
        this.r.op(this.s, Region.Op.DIFFERENCE);
        return this.r;
    }

    private void a() {
        ColorStateList colorStateList = this.f52456i;
        if (colorStateList == null || this.z == null) {
            this.y = null;
            return;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        this.y = new PorterDuffColorFilter(colorForState, this.z);
        if (this.v) {
            this.w = colorForState;
        }
    }

    public final void a(float f2) {
        this.f52450c = f2;
        invalidateSelf();
    }

    public final void setAlpha(int i2) {
        this.x = i2;
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.e
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f52457j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.e
    public final void setTintList(ColorStateList colorStateList) {
        this.f52456i = colorStateList;
        a();
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.e
    public final void setTintMode(PorterDuff.Mode mode) {
        this.z = mode;
        a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.f52457j.setColorFilter(this.y);
        int alpha = this.f52457j.getAlpha();
        Paint paint = this.f52457j;
        int i2 = this.x;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        this.f52457j.setStrokeWidth(this.f52454g);
        this.f52457j.setStyle(this.f52455h);
        int i3 = this.f52451d;
        if (i3 > 0 && this.f52449b) {
            this.f52457j.setShadowLayer((float) this.f52452e, 0.0f, (float) i3, this.w);
        }
        if (this.f52448a != null) {
            b(canvas.getWidth(), canvas.getHeight(), this.o);
            canvas.drawPath(this.o, this.f52457j);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f52457j);
        }
        this.f52457j.setAlpha(alpha);
    }

    private float a(int i2, int i3, int i4) {
        a(i2, i3, i4, this.p);
        float f2 = this.p.x;
        float f3 = this.p.y;
        a((i2 + 1) % 4, i3, i4, this.p);
        return (float) Math.atan2((double) (this.p.y - f3), (double) (this.p.x - f2));
    }

    private void b(int i2, int i3, Path path) {
        a(i2, i3, path);
        if (this.f52453f != 1.0f) {
            this.n.reset();
            Matrix matrix = this.n;
            float f2 = this.f52453f;
            matrix.setScale(f2, f2, (float) (i2 / 2), (float) (i3 / 2));
            path.transform(this.n);
        }
    }

    private void a(int i2, int i3, Path path) {
        b bVar;
        path.rewind();
        if (this.f52448a != null) {
            int i4 = 0;
            while (i4 < 4) {
                a(i4, i2, i3, this.p);
                int i5 = ((i4 - 1) + 4) % 4;
                a(i5, i2, i3, this.p);
                float f2 = this.p.x;
                float f3 = this.p.y;
                int i6 = i4 + 1;
                a(i6 % 4, i2, i3, this.p);
                float f4 = this.p.x;
                float f5 = this.p.y;
                a(i4, i2, i3, this.p);
                float f6 = this.p.x;
                float f7 = this.p.y;
                Math.atan2((double) (f3 - f7), (double) (f2 - f6));
                Math.atan2((double) (f5 - f7), (double) (f4 - f6));
                this.f52458k[i4].reset();
                this.f52458k[i4].setTranslate(this.p.x, this.p.y);
                this.f52458k[i4].preRotate((float) Math.toDegrees((double) (a(i5, i2, i3) + 1.5707964f)));
                this.t[0] = this.f52460m[i4].f52463c;
                this.t[1] = this.f52460m[i4].f52464d;
                this.f52458k[i4].mapPoints(this.t);
                float a2 = a(i4, i2, i3);
                this.f52459l[i4].reset();
                Matrix matrix = this.f52459l[i4];
                float[] fArr = this.t;
                matrix.setTranslate(fArr[0], fArr[1]);
                this.f52459l[i4].preRotate((float) Math.toDegrees((double) a2));
                i4 = i6;
            }
            int i7 = 0;
            do {
                this.t[0] = this.f52460m[i7].f52461a;
                this.t[1] = this.f52460m[i7].f52462b;
                this.f52458k[i7].mapPoints(this.t);
                if (i7 == 0) {
                    float[] fArr2 = this.t;
                    path.moveTo(fArr2[0], fArr2[1]);
                } else {
                    float[] fArr3 = this.t;
                    path.lineTo(fArr3[0], fArr3[1]);
                }
                this.f52460m[i7].a(this.f52458k[i7], path);
                int i8 = i7 + 1;
                int i9 = i8 % 4;
                this.t[0] = this.f52460m[i7].f52463c;
                this.t[1] = this.f52460m[i7].f52464d;
                this.f52458k[i7].mapPoints(this.t);
                this.u[0] = this.f52460m[i9].f52461a;
                this.u[1] = this.f52460m[i9].f52462b;
                this.f52458k[i9].mapPoints(this.u);
                float[] fArr4 = this.t;
                float f8 = fArr4[0];
                float[] fArr5 = this.u;
                float hypot = (float) Math.hypot((double) (f8 - fArr5[0]), (double) (fArr4[1] - fArr5[1]));
                d dVar = this.q;
                dVar.f52461a = 0.0f;
                dVar.f52462b = 0.0f;
                dVar.f52463c = 0.0f;
                dVar.f52464d = 0.0f;
                dVar.f52465e.clear();
                if (i7 == 1) {
                    bVar = this.f52448a.f52479b;
                } else if (i7 == 2) {
                    bVar = this.f52448a.f52480c;
                } else if (i7 != 3) {
                    bVar = this.f52448a.f52478a;
                } else {
                    bVar = this.f52448a.f52481d;
                }
                bVar.a(hypot, this.f52450c, this.q);
                this.q.a(this.f52459l[i7], path);
                i7 = i8;
            } while (i7 < 4);
            path.close();
        }
    }

    private static void a(int i2, int i3, int i4, PointF pointF) {
        if (i2 == 1) {
            pointF.set((float) i3, 0.0f);
        } else if (i2 == 2) {
            pointF.set((float) i3, (float) i4);
        } else if (i2 != 3) {
            pointF.set(0.0f, 0.0f);
        } else {
            pointF.set(0.0f, (float) i4);
        }
    }
}
