package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ir extends a {
    static {
        Covode.recordClassIndex(18370);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(28.0781f, 7.17931f);
        this.f30626c.cubicTo(27.8285f, 6.68664f, 28.0244f, 6.08056f, 28.5358f, 5.87203f);
        this.f30626c.cubicTo(32.9356f, 4.07795f, 37.8765f, 5.08837f, 41.327f, 8.56047f);
        this.f30626c.cubicTo(46.2243f, 13.4886f, 46.2243f, 21.4734f, 41.327f, 26.4016f);
        this.f30626c.lineTo(25.4186f, 42.4098f);
        this.f30626c.cubicTo(25.0432f, 42.7875f, 24.5326f, 43.0f, 24.0f, 43.0f);
        this.f30626c.cubicTo(23.4674f, 43.0f, 22.9568f, 42.7875f, 22.5814f, 42.4098f);
        this.f30626c.lineTo(6.67302f, 26.4016f);
        this.f30626c.cubicTo(1.77566f, 21.4734f, 1.77566f, 13.4886f, 6.67302f, 8.56047f);
        this.f30626c.cubicTo(10.9346f, 4.27215f, 17.4319f, 3.76529f, 22.3657f, 7.54239f);
        this.f30626c.cubicTo(22.9025f, 7.95332f, 23.1954f, 8.6076f, 23.1443f, 9.28168f);
        this.f30626c.lineTo(22.7627f, 14.3135f);
        this.f30626c.lineTo(26.4527f, 16.5237f);
        this.f30626c.cubicTo(27.308f, 17.036f, 27.6554f, 18.1f, 27.2671f, 19.0183f);
        this.f30626c.lineTo(25.2232f, 23.853f);
        this.f30626c.lineTo(26.7562f, 26.8747f);
        this.f30626c.cubicTo(27.0061f, 27.3673f, 26.8093f, 27.9691f, 26.3168f, 28.219f);
        this.f30626c.lineTo(24.5332f, 29.1238f);
        this.f30626c.cubicTo(24.0407f, 29.3737f, 23.4388f, 29.1769f, 23.189f, 28.6844f);
        this.f30626c.lineTo(21.2358f, 24.8344f);
        this.f30626c.cubicTo(20.9694f, 24.3092f, 20.948f, 23.6933f, 21.1773f, 23.1508f);
        this.f30626c.lineTo(22.9059f, 19.062f);
        this.f30626c.lineTo(19.6473f, 17.1102f);
        this.f30626c.cubicTo(18.9976f, 16.721f, 18.6235f, 15.9983f, 18.6807f, 15.2432f);
        this.f30626c.lineTo(19.0683f, 10.1318f);
        this.f30626c.cubicTo(15.8928f, 8.24443f, 12.1181f, 8.75584f, 9.51028f, 11.38f);
        this.f30626c.cubicTo(6.16324f, 14.7481f, 6.16324f, 20.2139f, 9.51028f, 23.582f);
        this.f30626c.lineTo(24.0f, 38.1627f);
        this.f30626c.lineTo(38.4897f, 23.582f);
        this.f30626c.cubicTo(41.8368f, 20.2139f, 41.8368f, 14.7481f, 38.4897f, 11.38f);
        this.f30626c.cubicTo(36.2471f, 9.1233f, 33.1639f, 8.44509f, 30.3515f, 9.45892f);
        this.f30626c.cubicTo(29.832f, 9.64621f, 29.2316f, 9.45607f, 28.982f, 8.96341f);
        this.f30626c.lineTo(28.0781f, 7.17931f);
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
