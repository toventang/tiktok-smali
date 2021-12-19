package com.bytedance.tux.skeleton.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f45326a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f45327b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f45328c = new RectF();

    static {
        Covode.recordClassIndex(27613);
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i2) {
    }

    public ColorFilter getColorFilter() {
        return this.f45327b.getColorFilter();
    }

    public final RectF a() {
        this.f45328c.set(getBounds());
        return this.f45328c;
    }

    public a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f45327b = paint;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f45327b.setColorFilter(colorFilter);
    }

    public void draw(Canvas canvas) {
        l.c(canvas, "");
        RectF a2 = a();
        float f2 = this.f45326a;
        canvas.drawRoundRect(a2, f2, f2, this.f45327b);
    }
}
