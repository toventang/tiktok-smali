package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ly extends a {
    static {
        Covode.recordClassIndex(18458);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(13.0001f, 13.0f);
        this.f30626c.cubicTo(13.0001f, 9.68629f, 15.6864f, 7.0f, 19.0001f, 7.0f);
        this.f30626c.cubicTo(22.3139f, 7.0f, 25.0001f, 9.68629f, 25.0001f, 13.0f);
        this.f30626c.cubicTo(25.0001f, 16.3137f, 22.3139f, 19.0f, 19.0001f, 19.0f);
        this.f30626c.cubicTo(15.6864f, 19.0f, 13.0001f, 16.3137f, 13.0001f, 13.0f);
        this.f30626c.close();
        this.f30626c.moveTo(19.0001f, 3.0f);
        this.f30626c.cubicTo(13.4773f, 3.0f, 9.00015f, 7.47715f, 9.00015f, 13.0f);
        this.f30626c.cubicTo(9.00015f, 18.5228f, 13.4773f, 23.0f, 19.0001f, 23.0f);
        this.f30626c.cubicTo(24.523f, 23.0f, 29.0001f, 18.5228f, 29.0001f, 13.0f);
        this.f30626c.cubicTo(29.0001f, 7.47715f, 24.523f, 3.0f, 19.0001f, 3.0f);
        this.f30626c.close();
        this.f30626c.moveTo(5.19435f, 40.9681f);
        this.f30626c.cubicTo(6.70152f, 35.5144f, 10.0886f, 32.2352f, 13.9162f, 30.738f);
        this.f30626c.cubicTo(17.7125f, 29.2531f, 22.0358f, 29.4832f, 25.6064f, 31.2486f);
        this.f30626c.cubicTo(26.1015f, 31.4934f, 26.7131f, 31.338f, 26.9931f, 30.8619f);
        this.f30626c.lineTo(28.0072f, 29.1381f);
        this.f30626c.cubicTo(28.2872f, 28.662f, 28.1294f, 28.0465f, 27.6384f, 27.7937f);
        this.f30626c.cubicTo(23.0156f, 25.4139f, 17.4034f, 25.0789f, 12.4591f, 27.0129f);
        this.f30626c.cubicTo(7.37426f, 29.0018f, 3.09339f, 33.3505f, 1.2883f, 40.0887f);
        this.f30626c.cubicTo(1.14539f, 40.6222f, 1.48573f, 41.1592f, 2.02454f, 41.2805f);
        this.f30626c.lineTo(3.97575f, 41.7195f);
        this.f30626c.cubicTo(4.51457f, 41.8408f, 5.04724f, 41.5004f, 5.19435f, 40.9681f);
        this.f30626c.close();
        this.f30626c.moveTo(37.0002f, 26.0f);
        this.f30626c.cubicTo(37.5525f, 26.0f, 38.0002f, 26.4477f, 38.0002f, 27.0f);
        this.f30626c.lineTo(38.0002f, 34.0f);
        this.f30626c.lineTo(45.0002f, 34.0f);
        this.f30626c.cubicTo(45.5525f, 34.0f, 46.0002f, 34.4477f, 46.0002f, 35.0f);
        this.f30626c.lineTo(46.0002f, 37.0f);
        this.f30626c.cubicTo(46.0002f, 37.5523f, 45.5525f, 38.0f, 45.0002f, 38.0f);
        this.f30626c.lineTo(38.0002f, 38.0f);
        this.f30626c.lineTo(38.0002f, 45.0f);
        this.f30626c.cubicTo(38.0002f, 45.5523f, 37.5525f, 46.0f, 37.0002f, 46.0f);
        this.f30626c.lineTo(35.0002f, 46.0f);
        this.f30626c.cubicTo(34.448f, 46.0f, 34.0002f, 45.5523f, 34.0002f, 45.0f);
        this.f30626c.lineTo(34.0002f, 38.0f);
        this.f30626c.lineTo(27.0002f, 38.0f);
        this.f30626c.cubicTo(26.448f, 38.0f, 26.0002f, 37.5523f, 26.0002f, 37.0f);
        this.f30626c.lineTo(26.0002f, 35.0f);
        this.f30626c.cubicTo(26.0002f, 34.4477f, 26.448f, 34.0f, 27.0002f, 34.0f);
        this.f30626c.lineTo(34.0002f, 34.0f);
        this.f30626c.lineTo(34.0002f, 27.0f);
        this.f30626c.cubicTo(34.0002f, 26.4477f, 34.448f, 26.0f, 35.0002f, 26.0f);
        this.f30626c.lineTo(37.0002f, 26.0f);
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
