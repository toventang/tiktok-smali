package com.bytedance.tux.input.slider;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f45166a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f45167b = 20.0f;

    /* renamed from: c  reason: collision with root package name */
    public int f45168c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float f45169d;

    /* renamed from: e  reason: collision with root package name */
    public float f45170e;

    /* renamed from: f  reason: collision with root package name */
    public float f45171f;

    /* renamed from: g  reason: collision with root package name */
    public int f45172g = -16777216;

    /* renamed from: h  reason: collision with root package name */
    public boolean f45173h;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f45174i;

    static {
        Covode.recordClassIndex(27535);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i2) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return (int) (this.f45166a * this.f45167b);
    }

    public final int getIntrinsicWidth() {
        return (int) (this.f45166a * this.f45167b);
    }

    public b() {
        Paint paint = new Paint();
        this.f45174i = paint;
        paint.setAntiAlias(true);
    }

    public final void draw(Canvas canvas) {
        float f2;
        l.c(canvas, "");
        this.f45174i.setColor(this.f45168c);
        this.f45174i.setShadowLayer(this.f45171f, this.f45169d, this.f45170e, this.f45172g);
        float centerX = (float) getBounds().centerX();
        float centerY = (float) getBounds().centerY();
        if (this.f45173h) {
            f2 = this.f45167b * this.f45166a;
        } else {
            f2 = this.f45167b;
        }
        canvas.drawCircle(centerX, centerY, f2 / 2.0f, this.f45174i);
    }
}
