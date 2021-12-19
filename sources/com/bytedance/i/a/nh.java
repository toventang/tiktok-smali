package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class nh extends a {
    static {
        Covode.recordClassIndex(18495);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(20.3359f, 8.37242f);
        this.f30626c.cubicTo(22.3296f, 7.04331f, 25.0f, 8.47248f, 25.0f, 10.8686f);
        this.f30626c.lineTo(25.0f, 37.1315f);
        this.f30626c.cubicTo(25.0f, 39.5276f, 22.3296f, 40.9568f, 20.3359f, 39.6277f);
        this.f30626c.lineTo(10.3944f, 33.0001f);
        this.f30626c.lineTo(6.0f, 33.0001f);
        this.f30626c.cubicTo(4.34314f, 33.0001f, 3.0f, 31.6569f, 3.0f, 30.0001f);
        this.f30626c.lineTo(3.0f, 18.0001f);
        this.f30626c.cubicTo(3.0f, 16.3432f, 4.34315f, 15.0001f, 6.0f, 15.0001f);
        this.f30626c.lineTo(10.3944f, 15.0001f);
        this.f30626c.lineTo(20.3359f, 8.37242f);
        this.f30626c.close();
        this.f30626c.moveTo(32.9998f, 24.0001f);
        this.f30626c.cubicTo(32.9998f, 21.5583f, 32.0293f, 19.3445f, 30.4479f, 17.7212f);
        this.f30626c.cubicTo(30.0625f, 17.3256f, 29.9964f, 16.699f, 30.3472f, 16.2724f);
        this.f30626c.lineTo(31.6177f, 14.7277f);
        this.f30626c.cubicTo(31.9685f, 14.3012f, 32.6017f, 14.2371f, 33.0001f, 14.6196f);
        this.f30626c.cubicTo(35.4628f, 16.9832f, 36.9998f, 20.3129f, 36.9998f, 24.0001f);
        this.f30626c.cubicTo(36.9998f, 27.6873f, 35.4628f, 31.0169f, 33.0001f, 33.3806f);
        this.f30626c.cubicTo(32.6017f, 33.763f, 31.9685f, 33.699f, 31.6177f, 33.2724f);
        this.f30626c.lineTo(30.3472f, 31.7277f);
        this.f30626c.cubicTo(29.9964f, 31.3012f, 30.0625f, 30.6745f, 30.4479f, 30.2789f);
        this.f30626c.cubicTo(32.0293f, 28.6556f, 32.9998f, 26.4418f, 32.9998f, 24.0001f);
        this.f30626c.close();
        this.f30626c.moveTo(37.0144f, 11.0501f);
        this.f30626c.cubicTo(36.6563f, 11.4706f, 36.7094f, 12.0995f, 37.1069f, 12.483f);
        this.f30626c.cubicTo(40.1263f, 15.3952f, 42.0002f, 19.4778f, 42.0002f, 24.0f);
        this.f30626c.cubicTo(42.0002f, 28.5221f, 40.1263f, 32.6048f, 37.1069f, 35.517f);
        this.f30626c.cubicTo(36.7094f, 35.9004f, 36.6563f, 36.5294f, 37.0144f, 36.9499f);
        this.f30626c.lineTo(38.3109f, 38.4727f);
        this.f30626c.cubicTo(38.6689f, 38.8932f, 39.302f, 38.9457f, 39.7041f, 38.5672f);
        this.f30626c.cubicTo(43.5774f, 34.9219f, 46.0002f, 29.743f, 46.0002f, 24.0f);
        this.f30626c.cubicTo(46.0002f, 18.257f, 43.5774f, 13.078f, 39.7041f, 9.43278f);
        this.f30626c.cubicTo(39.302f, 9.05427f, 38.6689f, 9.10671f, 38.3109f, 9.52722f);
        this.f30626c.lineTo(37.0144f, 11.0501f);
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
