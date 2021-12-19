package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bp extends a {
    static {
        Covode.recordClassIndex(18179);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.9392f, 8.93935f);
        this.f30626c.cubicTo(28.8387f, 5.03987f, 35.1611f, 5.03987f, 39.0606f, 8.93936f);
        this.f30626c.cubicTo(42.9601f, 12.8389f, 42.9601f, 19.1612f, 39.0605f, 23.0607f);
        this.f30626c.lineTo(37.7677f, 24.3536f);
        this.f30626c.cubicTo(37.3771f, 24.7441f, 36.744f, 24.7441f, 36.3535f, 24.3535f);
        this.f30626c.lineTo(35.6464f, 23.6464f);
        this.f30626c.cubicTo(35.2558f, 23.2559f, 35.2558f, 22.6228f, 35.6464f, 22.2322f);
        this.f30626c.lineTo(36.9392f, 20.9394f);
        this.f30626c.cubicTo(39.6672f, 18.2114f, 39.6672f, 13.7886f, 36.9392f, 11.0607f);
        this.f30626c.cubicTo(34.2113f, 8.33276f, 29.7885f, 8.33276f, 27.0606f, 11.0607f);
        this.f30626c.lineTo(22.0606f, 16.0607f);
        this.f30626c.cubicTo(19.572f, 18.5492f, 19.3536f, 22.4483f, 21.4055f, 25.1844f);
        this.f30626c.cubicTo(21.7369f, 25.6263f, 21.744f, 26.2559f, 21.3535f, 26.6464f);
        this.f30626c.lineTo(20.6464f, 27.3535f);
        this.f30626c.cubicTo(20.2558f, 27.7441f, 19.618f, 27.7469f, 19.268f, 27.3197f);
        this.f30626c.cubicTo(16.0543f, 23.3974f, 16.2781f, 17.6005f, 19.9393f, 13.9393f);
        this.f30626c.lineTo(24.9392f, 8.93935f);
        this.f30626c.close();
        this.f30626c.moveTo(30.4773f, 27.654f);
        this.f30626c.cubicTo(30.1957f, 30.3822f, 28.9857f, 33.1355f, 27.0607f, 35.0606f);
        this.f30626c.lineTo(23.0607f, 39.0606f);
        this.f30626c.cubicTo(19.1612f, 42.96f, 12.8389f, 42.96f, 8.93939f, 39.0605f);
        this.f30626c.cubicTo(5.03989f, 35.1611f, 5.0399f, 28.8387f, 8.9394f, 24.9392f);
        this.f30626c.lineTo(10.2323f, 23.6464f);
        this.f30626c.cubicTo(10.6228f, 23.2558f, 11.256f, 23.2558f, 11.6465f, 23.6464f);
        this.f30626c.lineTo(12.3536f, 24.3535f);
        this.f30626c.cubicTo(12.7441f, 24.744f, 12.7441f, 25.3772f, 12.3536f, 25.7677f);
        this.f30626c.lineTo(11.0607f, 27.0605f);
        this.f30626c.cubicTo(8.33279f, 29.7885f, 8.33279f, 34.2113f, 11.0607f, 36.9392f);
        this.f30626c.cubicTo(13.7886f, 39.6671f, 18.2115f, 39.6671f, 20.9394f, 36.9392f);
        this.f30626c.lineTo(24.9394f, 32.9392f);
        this.f30626c.cubicTo(26.328f, 31.5506f, 27.2749f, 29.4608f, 27.4932f, 27.3459f);
        this.f30626c.cubicTo(27.6704f, 25.629f, 27.3585f, 24.0404f, 26.5683f, 22.8358f);
        this.f30626c.cubicTo(26.2653f, 22.374f, 26.2558f, 21.7441f, 26.6464f, 21.3535f);
        this.f30626c.lineTo(27.3535f, 20.6464f);
        this.f30626c.cubicTo(27.744f, 20.2559f, 28.3832f, 20.2527f, 28.7211f, 20.6895f);
        this.f30626c.cubicTo(30.2608f, 22.6792f, 30.7262f, 25.2428f, 30.4773f, 27.654f);
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
