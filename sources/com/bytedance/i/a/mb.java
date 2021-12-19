package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mb extends a {
    static {
        Covode.recordClassIndex(18462);
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
        this.f30626c.moveTo(44.7074f, 30.1212f);
        this.f30626c.cubicTo(45.0979f, 29.7307f, 45.0979f, 29.0975f, 44.7074f, 28.707f);
        this.f30626c.lineTo(43.2932f, 27.2928f);
        this.f30626c.cubicTo(42.9026f, 26.9023f, 42.2695f, 26.9023f, 41.8789f, 27.2928f);
        this.f30626c.lineTo(30.0003f, 39.1715f);
        this.f30626c.lineTo(25.1216f, 34.2928f);
        this.f30626c.cubicTo(24.7311f, 33.9023f, 24.0979f, 33.9023f, 23.7074f, 34.2928f);
        this.f30626c.lineTo(22.2932f, 35.707f);
        this.f30626c.cubicTo(21.9026f, 36.0975f, 21.9026f, 36.7307f, 22.2932f, 37.1212f);
        this.f30626c.lineTo(28.586f, 43.4141f);
        this.f30626c.cubicTo(29.3671f, 44.1952f, 30.6334f, 44.1952f, 31.4145f, 43.4141f);
        this.f30626c.lineTo(44.7074f, 30.1212f);
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
