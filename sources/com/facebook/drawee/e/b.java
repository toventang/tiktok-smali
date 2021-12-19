package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;

public final class b extends g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f47360a;

    /* renamed from: b  reason: collision with root package name */
    float f47361b;

    /* renamed from: c  reason: collision with root package name */
    private int f47362c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47363d;

    static {
        Covode.recordClassIndex(28763);
    }

    public final void run() {
        this.f47363d = false;
        this.f47361b += (float) ((int) ((20.0f / ((float) this.f47362c)) * 360.0f));
        invalidateSelf();
    }

    @Override // com.facebook.drawee.e.g
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i2 = bounds.right - bounds.left;
        int i3 = bounds.bottom - bounds.top;
        float f2 = this.f47361b;
        if (!this.f47360a) {
            f2 = 360.0f - f2;
        }
        canvas.rotate(f2, (float) (bounds.left + (i2 / 2)), (float) (bounds.top + (i3 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.f47363d) {
            this.f47363d = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public b(Drawable drawable, int i2) {
        this(drawable, i2, (byte) 0);
    }

    private b(Drawable drawable, int i2, byte b2) {
        super((Drawable) i.a(drawable));
        this.f47361b = 0.0f;
        this.f47363d = false;
        this.f47362c = i2;
        this.f47360a = true;
    }
}
