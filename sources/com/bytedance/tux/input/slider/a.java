package com.bytedance.tux.input.slider;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public int f45158a = -16777216;

    /* renamed from: b  reason: collision with root package name */
    public int f45159b = -16777216;

    /* renamed from: c  reason: collision with root package name */
    public int f45160c = -16777216;

    /* renamed from: d  reason: collision with root package name */
    public float f45161d;

    /* renamed from: e  reason: collision with root package name */
    float f45162e;

    /* renamed from: f  reason: collision with root package name */
    float f45163f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f45164g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f45165h;

    static {
        Covode.recordClassIndex(27534);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i2) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public a() {
        Paint paint = new Paint();
        this.f45164g = paint;
        this.f45165h = new RectF();
        paint.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        invalidateSelf();
        return onLevelChange;
    }

    public final void draw(Canvas canvas) {
        l.c(canvas, "");
        float width = (float) getBounds().width();
        float f2 = this.f45161d / 2.0f;
        float centerY = ((float) getBounds().centerY()) - f2;
        float centerY2 = ((float) getBounds().centerY()) + f2;
        this.f45164g.setColor(this.f45160c);
        this.f45165h.set(0.0f, centerY, width, centerY2);
        canvas.drawRoundRect(this.f45165h, f2, f2, this.f45164g);
        if (this.f45163f > this.f45162e) {
            this.f45164g.setColor(this.f45159b);
            this.f45165h.set(this.f45162e * width, centerY, this.f45163f * width, centerY2);
            canvas.drawRoundRect(this.f45165h, f2, f2, this.f45164g);
        }
        this.f45164g.setColor(this.f45158a);
        this.f45165h.set(0.0f, centerY, width * this.f45162e, centerY2);
        canvas.drawRoundRect(this.f45165h, f2, f2, this.f45164g);
    }
}
