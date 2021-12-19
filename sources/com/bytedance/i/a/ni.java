package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ni extends a {
    static {
        Covode.recordClassIndex(18496);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(20.3359f, 8.37236f);
        this.f30626c.cubicTo(22.3296f, 7.04325f, 25.0f, 8.47242f, 25.0f, 10.8685f);
        this.f30626c.lineTo(25.0f, 37.1315f);
        this.f30626c.cubicTo(25.0f, 39.5276f, 22.3296f, 40.9567f, 20.3359f, 39.6276f);
        this.f30626c.lineTo(10.3944f, 33.0f);
        this.f30626c.lineTo(6.0f, 33.0f);
        this.f30626c.cubicTo(4.34314f, 33.0f, 3.0f, 31.6568f, 3.0f, 30.0f);
        this.f30626c.lineTo(3.0f, 18.0f);
        this.f30626c.cubicTo(3.0f, 16.3431f, 4.34315f, 15.0f, 6.0f, 15.0f);
        this.f30626c.lineTo(10.3944f, 15.0f);
        this.f30626c.lineTo(20.3359f, 8.37236f);
        this.f30626c.close();
        this.f30626c.moveTo(21.0f, 12.737f);
        this.f30626c.lineTo(12.1094f, 18.6641f);
        this.f30626c.cubicTo(11.7809f, 18.8831f, 11.3948f, 19.0f, 11.0f, 19.0f);
        this.f30626c.lineTo(7.0f, 19.0f);
        this.f30626c.lineTo(7.0f, 29.0f);
        this.f30626c.lineTo(11.0f, 29.0f);
        this.f30626c.cubicTo(11.3948f, 29.0f, 11.7809f, 29.1169f, 12.1094f, 29.3359f);
        this.f30626c.lineTo(21.0f, 35.263f);
        this.f30626c.lineTo(21.0f, 12.737f);
        this.f30626c.close();
        this.f30626c.moveTo(32.9998f, 24.0f);
        this.f30626c.cubicTo(32.9998f, 21.5583f, 32.0293f, 19.3445f, 30.4479f, 17.7211f);
        this.f30626c.cubicTo(30.0625f, 17.3255f, 29.9964f, 16.6989f, 30.3472f, 16.2724f);
        this.f30626c.lineTo(31.6177f, 14.7277f);
        this.f30626c.cubicTo(31.9685f, 14.3011f, 32.6017f, 14.2371f, 33.0001f, 14.6195f);
        this.f30626c.cubicTo(35.4628f, 16.9832f, 36.9998f, 20.3128f, 36.9998f, 24.0f);
        this.f30626c.cubicTo(36.9998f, 27.6872f, 35.4628f, 31.0168f, 33.0001f, 33.3805f);
        this.f30626c.cubicTo(32.6017f, 33.7629f, 31.9685f, 33.6989f, 31.6177f, 33.2724f);
        this.f30626c.lineTo(30.3472f, 31.7277f);
        this.f30626c.cubicTo(29.9964f, 31.3011f, 30.0625f, 30.6745f, 30.4479f, 30.2789f);
        this.f30626c.cubicTo(32.0293f, 28.6556f, 32.9998f, 26.4418f, 32.9998f, 24.0f);
        this.f30626c.close();
        this.f30626c.moveTo(37.0144f, 11.05f);
        this.f30626c.cubicTo(36.6563f, 11.4705f, 36.7094f, 12.0995f, 37.1069f, 12.4829f);
        this.f30626c.cubicTo(40.1263f, 15.3951f, 42.0002f, 19.4778f, 42.0002f, 23.9999f);
        this.f30626c.cubicTo(42.0002f, 28.522f, 40.1263f, 32.6047f, 37.1069f, 35.5169f);
        this.f30626c.cubicTo(36.7094f, 35.9003f, 36.6563f, 36.5293f, 37.0144f, 36.9498f);
        this.f30626c.lineTo(38.3109f, 38.4727f);
        this.f30626c.cubicTo(38.6689f, 38.8932f, 39.302f, 38.9456f, 39.7041f, 38.5671f);
        this.f30626c.cubicTo(43.5774f, 34.9219f, 46.0002f, 29.7429f, 46.0002f, 23.9999f);
        this.f30626c.cubicTo(46.0002f, 18.2569f, 43.5774f, 13.078f, 39.7041f, 9.43271f);
        this.f30626c.cubicTo(39.302f, 9.05421f, 38.6689f, 9.10664f, 38.3109f, 9.52716f);
        this.f30626c.lineTo(37.0144f, 11.05f);
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
