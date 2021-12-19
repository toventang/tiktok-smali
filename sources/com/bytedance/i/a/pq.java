package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pq extends a {
    static {
        Covode.recordClassIndex(18558);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(22.0f, 42.0f);
        this.f30626c.cubicTo(22.0f, 42.5523f, 22.4477f, 43.0f, 23.0f, 43.0f);
        this.f30626c.lineTo(25.0f, 43.0f);
        this.f30626c.cubicTo(25.5523f, 43.0f, 26.0f, 42.5523f, 26.0f, 42.0f);
        this.f30626c.lineTo(26.0f, 6.0f);
        this.f30626c.cubicTo(26.0f, 5.44772f, 25.5523f, 5.0f, 25.0f, 5.0f);
        this.f30626c.lineTo(23.0f, 5.0f);
        this.f30626c.cubicTo(22.4477f, 5.0f, 22.0f, 5.44772f, 22.0f, 6.0f);
        this.f30626c.lineTo(22.0f, 42.0f);
        this.f30626c.close();
        this.f30626c.moveTo(6.0f, 14.0f);
        this.f30626c.cubicTo(6.0f, 13.4477f, 6.44772f, 13.0f, 7.0f, 13.0f);
        this.f30626c.lineTo(17.0f, 13.0f);
        this.f30626c.cubicTo(17.5523f, 13.0f, 18.0f, 12.5523f, 18.0f, 12.0f);
        this.f30626c.lineTo(18.0f, 10.0f);
        this.f30626c.cubicTo(18.0f, 9.44772f, 17.5523f, 9.0f, 17.0f, 9.0f);
        this.f30626c.lineTo(7.0f, 9.0f);
        this.f30626c.cubicTo(4.23858f, 9.0f, 2.0f, 11.2386f, 2.0f, 14.0f);
        this.f30626c.lineTo(2.0f, 34.0f);
        this.f30626c.cubicTo(2.0f, 36.7614f, 4.23858f, 39.0f, 7.0f, 39.0f);
        this.f30626c.lineTo(17.0f, 39.0f);
        this.f30626c.cubicTo(17.5523f, 39.0f, 18.0f, 38.5523f, 18.0f, 38.0f);
        this.f30626c.lineTo(18.0f, 36.0f);
        this.f30626c.cubicTo(18.0f, 35.4477f, 17.5523f, 35.0f, 17.0f, 35.0f);
        this.f30626c.lineTo(7.0f, 35.0f);
        this.f30626c.cubicTo(6.44772f, 35.0f, 6.0f, 34.5523f, 6.0f, 34.0f);
        this.f30626c.lineTo(6.0f, 14.0f);
        this.f30626c.close();
        this.f30626c.moveTo(31.0f, 13.0f);
        this.f30626c.lineTo(41.0f, 13.0f);
        this.f30626c.cubicTo(41.5523f, 13.0f, 42.0f, 13.4477f, 42.0f, 14.0f);
        this.f30626c.lineTo(42.0f, 34.0f);
        this.f30626c.cubicTo(42.0f, 34.5523f, 41.5523f, 35.0f, 41.0f, 35.0f);
        this.f30626c.lineTo(31.0f, 35.0f);
        this.f30626c.cubicTo(30.4477f, 35.0f, 30.0f, 35.4477f, 30.0f, 36.0f);
        this.f30626c.lineTo(30.0f, 38.0f);
        this.f30626c.cubicTo(30.0f, 38.5523f, 30.4477f, 39.0f, 31.0f, 39.0f);
        this.f30626c.lineTo(41.0f, 39.0f);
        this.f30626c.cubicTo(43.7614f, 39.0f, 46.0f, 36.7614f, 46.0f, 34.0f);
        this.f30626c.lineTo(46.0f, 14.0f);
        this.f30626c.cubicTo(46.0f, 11.2386f, 43.7614f, 9.0f, 41.0f, 9.0f);
        this.f30626c.lineTo(31.0f, 9.0f);
        this.f30626c.cubicTo(30.4477f, 9.0f, 30.0f, 9.44772f, 30.0f, 10.0f);
        this.f30626c.lineTo(30.0f, 12.0f);
        this.f30626c.cubicTo(30.0f, 12.5523f, 30.4477f, 13.0f, 31.0f, 13.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
