package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ng extends a {
    static {
        Covode.recordClassIndex(18494);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 7.0f);
        this.f30626c.cubicTo(8.0f, 4.23858f, 10.2386f, 2.0f, 13.0f, 2.0f);
        this.f30626c.lineTo(35.0f, 2.0f);
        this.f30626c.cubicTo(37.7614f, 2.0f, 40.0f, 4.23858f, 40.0f, 7.0f);
        this.f30626c.lineTo(40.0f, 41.0f);
        this.f30626c.cubicTo(40.0f, 43.7614f, 37.7614f, 46.0f, 35.0f, 46.0f);
        this.f30626c.lineTo(13.0f, 46.0f);
        this.f30626c.cubicTo(10.2386f, 46.0f, 8.0f, 43.7614f, 8.0f, 41.0f);
        this.f30626c.lineTo(8.0f, 7.0f);
        this.f30626c.close();
        this.f30626c.moveTo(13.0f, 6.0f);
        this.f30626c.cubicTo(12.4477f, 6.0f, 12.0f, 6.44772f, 12.0f, 7.0f);
        this.f30626c.lineTo(12.0f, 41.0f);
        this.f30626c.cubicTo(12.0f, 41.5523f, 12.4477f, 42.0f, 13.0f, 42.0f);
        this.f30626c.lineTo(35.0f, 42.0f);
        this.f30626c.cubicTo(35.5523f, 42.0f, 36.0f, 41.5523f, 36.0f, 41.0f);
        this.f30626c.lineTo(36.0f, 7.0f);
        this.f30626c.cubicTo(36.0f, 6.44772f, 35.5523f, 6.0f, 35.0f, 6.0f);
        this.f30626c.lineTo(13.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.moveTo(18.0f, 10.0f);
        this.f30626c.cubicTo(18.0f, 9.44772f, 18.4477f, 9.0f, 19.0f, 9.0f);
        this.f30626c.lineTo(29.0f, 9.0f);
        this.f30626c.cubicTo(29.5523f, 9.0f, 30.0f, 9.44772f, 30.0f, 10.0f);
        this.f30626c.lineTo(30.0f, 12.0f);
        this.f30626c.cubicTo(30.0f, 12.5523f, 29.5523f, 13.0f, 29.0f, 13.0f);
        this.f30626c.lineTo(19.0f, 13.0f);
        this.f30626c.cubicTo(18.4477f, 13.0f, 18.0f, 12.5523f, 18.0f, 12.0f);
        this.f30626c.lineTo(18.0f, 10.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 39.0f);
        this.f30626c.cubicTo(25.6569f, 39.0f, 27.0f, 37.6569f, 27.0f, 36.0f);
        this.f30626c.cubicTo(27.0f, 34.3431f, 25.6569f, 33.0f, 24.0f, 33.0f);
        this.f30626c.cubicTo(22.3431f, 33.0f, 21.0f, 34.3431f, 21.0f, 36.0f);
        this.f30626c.cubicTo(21.0f, 37.6569f, 22.3431f, 39.0f, 24.0f, 39.0f);
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
