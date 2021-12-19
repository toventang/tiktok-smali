package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class dw extends a {
    static {
        Covode.recordClassIndex(18240);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 8.0f);
        this.f30626c.cubicTo(15.1634f, 8.0f, 8.0f, 15.1634f, 8.0f, 24.0f);
        this.f30626c.cubicTo(8.0f, 32.8366f, 15.1634f, 40.0f, 24.0f, 40.0f);
        this.f30626c.cubicTo(26.7473f, 40.0f, 29.3246f, 39.31f, 31.5769f, 38.0964f);
        this.f30626c.lineTo(33.3376f, 37.1477f);
        this.f30626c.cubicTo(33.8238f, 36.8857f, 34.4303f, 37.0674f, 34.6923f, 37.5536f);
        this.f30626c.lineTo(36.5897f, 41.0749f);
        this.f30626c.cubicTo(36.8517f, 41.5611f, 36.6699f, 42.1677f, 36.1838f, 42.4296f);
        this.f30626c.lineTo(34.4231f, 43.3784f);
        this.f30626c.cubicTo(31.3178f, 45.0517f, 27.7652f, 46.0f, 24.0f, 46.0f);
        this.f30626c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f30626c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f30626c.lineTo(46.0f, 25.9f);
        this.f30626c.cubicTo(46.0f, 30.8039f, 41.8557f, 34.6f, 37.1516f, 34.6f);
        this.f30626c.cubicTo(34.7243f, 34.6f, 32.5292f, 33.606f, 30.9511f, 32.0027f);
        this.f30626c.cubicTo(29.0907f, 33.6206f, 26.6606f, 34.6f, 24.0f, 34.6f);
        this.f30626c.cubicTo(18.1458f, 34.6f, 13.4f, 29.8542f, 13.4f, 24.0f);
        this.f30626c.cubicTo(13.4f, 18.1458f, 18.1458f, 13.4f, 24.0f, 13.4f);
        this.f30626c.cubicTo(29.8542f, 13.4f, 34.6f, 18.1458f, 34.6f, 24.0f);
        this.f30626c.cubicTo(34.6f, 24.5945f, 34.5508f, 25.1796f, 34.4556f, 25.751f);
        this.f30626c.cubicTo(34.453f, 25.8001f, 34.4516f, 25.8497f, 34.4516f, 25.9f);
        this.f30626c.cubicTo(34.4516f, 27.3912f, 35.6605f, 28.6f, 37.1516f, 28.6f);
        this.f30626c.cubicTo(38.7436f, 28.6f, 40.0f, 27.2921f, 40.0f, 25.9f);
        this.f30626c.lineTo(40.0f, 24.0f);
        this.f30626c.cubicTo(40.0f, 15.1634f, 32.8366f, 8.0f, 24.0f, 8.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 19.4f);
        this.f30626c.cubicTo(21.4595f, 19.4f, 19.4f, 21.4595f, 19.4f, 24.0f);
        this.f30626c.cubicTo(19.4f, 26.5405f, 21.4595f, 28.6f, 24.0f, 28.6f);
        this.f30626c.cubicTo(26.2521f, 28.6f, 28.1317f, 26.9786f, 28.5243f, 24.8387f);
        this.f30626c.cubicTo(28.5737f, 24.5689f, 28.6f, 24.2888f, 28.6f, 24.0f);
        this.f30626c.cubicTo(28.6f, 21.4595f, 26.5405f, 19.4f, 24.0f, 19.4f);
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
