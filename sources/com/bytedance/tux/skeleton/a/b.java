package com.bytedance.tux.skeleton.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final Paint f45330c;

    /* renamed from: d  reason: collision with root package name */
    public int f45331d;

    static {
        Covode.recordClassIndex(27614);
    }

    public b() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        this.f45330c = paint;
    }

    @Override // com.bytedance.tux.skeleton.a.a
    public final void draw(Canvas canvas) {
        l.c(canvas, "");
        super.draw(canvas);
        canvas.drawRoundRect(a(), this.f45326a, this.f45326a, this.f45330c);
    }
}
