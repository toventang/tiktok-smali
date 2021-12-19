package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class dy extends a {
    static {
        Covode.recordClassIndex(18242);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(20.5123f, 7.0f);
        this.f30626c.cubicTo(19.0504f, 7.0f, 17.6388f, 7.53374f, 16.5426f, 8.50097f);
        this.f30626c.lineTo(4.07592f, 19.501f);
        this.f30626c.cubicTo(1.3689f, 21.8895f, 1.3689f, 26.1105f, 4.07592f, 28.499f);
        this.f30626c.lineTo(16.5426f, 39.499f);
        this.f30626c.cubicTo(17.6388f, 40.4663f, 19.0504f, 41.0f, 20.5123f, 41.0f);
        this.f30626c.lineTo(39.9999f, 41.0f);
        this.f30626c.cubicTo(43.3136f, 41.0f, 45.9999f, 38.3137f, 45.9999f, 35.0f);
        this.f30626c.lineTo(45.9999f, 13.0f);
        this.f30626c.cubicTo(45.9999f, 9.68629f, 43.3136f, 7.0f, 39.9999f, 7.0f);
        this.f30626c.lineTo(20.5123f, 7.0f);
        this.f30626c.close();
        this.f30626c.moveTo(19.1891f, 11.5003f);
        this.f30626c.cubicTo(19.5545f, 11.1779f, 20.025f, 11.0f, 20.5123f, 11.0f);
        this.f30626c.lineTo(39.9999f, 11.0f);
        this.f30626c.cubicTo(41.1045f, 11.0f, 41.9999f, 11.8954f, 41.9999f, 13.0f);
        this.f30626c.lineTo(41.9999f, 35.0f);
        this.f30626c.cubicTo(41.9999f, 36.1046f, 41.1045f, 37.0f, 39.9999f, 37.0f);
        this.f30626c.lineTo(20.5123f, 37.0f);
        this.f30626c.cubicTo(20.025f, 37.0f, 19.5545f, 36.8221f, 19.1891f, 36.4997f);
        this.f30626c.lineTo(6.72241f, 25.4997f);
        this.f30626c.cubicTo(5.82007f, 24.7035f, 5.82007f, 23.2965f, 6.72241f, 22.5003f);
        this.f30626c.lineTo(19.1891f, 11.5003f);
        this.f30626c.close();
        this.f30626c.moveTo(21.0856f, 18.9142f);
        this.f30626c.lineTo(26.1714f, 24.0f);
        this.f30626c.lineTo(21.0856f, 29.0858f);
        this.f30626c.lineTo(23.914f, 31.9142f);
        this.f30626c.lineTo(28.9998f, 26.8284f);
        this.f30626c.lineTo(34.0856f, 31.9142f);
        this.f30626c.lineTo(36.914f, 29.0858f);
        this.f30626c.lineTo(31.8282f, 24.0f);
        this.f30626c.lineTo(36.914f, 18.9142f);
        this.f30626c.lineTo(34.0856f, 16.0858f);
        this.f30626c.lineTo(28.9998f, 21.1716f);
        this.f30626c.lineTo(23.914f, 16.0858f);
        this.f30626c.lineTo(21.0856f, 18.9142f);
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
