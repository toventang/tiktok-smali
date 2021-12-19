package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class po extends a {
    static {
        Covode.recordClassIndex(18556);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(2.0f, 12.0f);
        this.f30626c.cubicTo(2.0f, 9.23858f, 4.23858f, 7.0f, 7.0f, 7.0f);
        this.f30626c.lineTo(24.0f, 7.0f);
        this.f30626c.cubicTo(26.7614f, 7.0f, 29.0f, 9.23858f, 29.0f, 12.0f);
        this.f30626c.lineTo(25.0f, 12.0f);
        this.f30626c.cubicTo(25.0f, 11.4477f, 24.5523f, 11.0f, 24.0f, 11.0f);
        this.f30626c.lineTo(7.0f, 11.0f);
        this.f30626c.cubicTo(6.44771f, 11.0f, 6.0f, 11.4477f, 6.0f, 12.0f);
        this.f30626c.lineTo(6.0f, 29.0f);
        this.f30626c.cubicTo(6.0f, 29.5523f, 6.44772f, 30.0f, 7.0f, 30.0f);
        this.f30626c.lineTo(7.0f, 34.0f);
        this.f30626c.cubicTo(4.23858f, 34.0f, 2.0f, 31.7614f, 2.0f, 29.0f);
        this.f30626c.lineTo(2.0f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(9.0f, 19.0f);
        this.f30626c.cubicTo(9.0f, 16.2386f, 11.2386f, 14.0f, 14.0f, 14.0f);
        this.f30626c.lineTo(32.0f, 14.0f);
        this.f30626c.cubicTo(34.7614f, 14.0f, 37.0f, 16.2386f, 37.0f, 19.0f);
        this.f30626c.lineTo(37.0f, 22.7011f);
        this.f30626c.lineTo(43.2117f, 17.4702f);
        this.f30626c.cubicTo(43.8068f, 16.9691f, 44.6383f, 16.8585f, 45.3436f, 17.1866f);
        this.f30626c.cubicTo(46.0489f, 17.5148f, 46.5f, 18.2221f, 46.5f, 19.0f);
        this.f30626c.lineTo(46.5f, 35.0f);
        this.f30626c.cubicTo(46.5f, 35.7779f, 46.0489f, 36.4852f, 45.3436f, 36.8134f);
        this.f30626c.cubicTo(44.6383f, 37.1415f, 43.8068f, 37.0309f, 43.2117f, 36.5298f);
        this.f30626c.lineTo(37.0f, 31.2989f);
        this.f30626c.lineTo(37.0f, 36.0f);
        this.f30626c.cubicTo(37.0f, 38.7614f, 34.7614f, 41.0f, 32.0f, 41.0f);
        this.f30626c.lineTo(14.0f, 41.0f);
        this.f30626c.cubicTo(11.2386f, 41.0f, 9.0f, 38.7614f, 9.0f, 36.0f);
        this.f30626c.lineTo(9.0f, 19.0f);
        this.f30626c.close();
        this.f30626c.moveTo(33.0f, 19.0f);
        this.f30626c.cubicTo(33.0f, 18.4477f, 32.5523f, 18.0f, 32.0f, 18.0f);
        this.f30626c.lineTo(14.0f, 18.0f);
        this.f30626c.cubicTo(13.4477f, 18.0f, 13.0f, 18.4477f, 13.0f, 19.0f);
        this.f30626c.lineTo(13.0f, 36.0f);
        this.f30626c.cubicTo(13.0f, 36.5523f, 13.4477f, 37.0f, 14.0f, 37.0f);
        this.f30626c.lineTo(32.0f, 37.0f);
        this.f30626c.cubicTo(32.5523f, 37.0f, 33.0f, 36.5523f, 33.0f, 36.0f);
        this.f30626c.lineTo(33.0f, 19.0f);
        this.f30626c.close();
        this.f30626c.moveTo(38.1049f, 27.0f);
        this.f30626c.lineTo(42.5f, 30.7011f);
        this.f30626c.lineTo(42.5f, 23.2989f);
        this.f30626c.lineTo(38.1049f, 27.0f);
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
