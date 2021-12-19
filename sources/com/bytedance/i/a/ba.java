package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ba extends a {
    static {
        Covode.recordClassIndex(18164);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(25.5001f, 37.0f);
        this.f30626c.lineTo(34.5f, 37.0f);
        this.f30626c.cubicTo(39.7467f, 37.0f, 44.0f, 32.7467f, 44.0f, 27.5f);
        this.f30626c.cubicTo(44.0f, 22.7115f, 40.4571f, 18.7504f, 35.8497f, 18.0951f);
        this.f30626c.cubicTo(34.937f, 12.373f, 29.9792f, 8.0f, 24.0f, 8.0f);
        this.f30626c.cubicTo(17.3726f, 8.0f, 12.0f, 13.3726f, 12.0f, 20.0f);
        this.f30626c.lineTo(12.0f, 20.0145f);
        this.f30626c.cubicTo(7.53831f, 20.2733f, 4.0f, 23.9734f, 4.0f, 28.5f);
        this.f30626c.cubicTo(4.0f, 33.1944f, 7.80558f, 37.0f, 12.5f, 37.0f);
        this.f30626c.lineTo(22.5001f, 37.0f);
        this.f30626c.lineTo(22.5001f, 25.1213f);
        this.f30626c.lineTo(19.9143f, 27.7071f);
        this.f30626c.cubicTo(19.7191f, 27.9024f, 19.4025f, 27.9024f, 19.2072f, 27.7071f);
        this.f30626c.lineTo(17.793f, 26.2929f);
        this.f30626c.cubicTo(17.5977f, 26.0976f, 17.5977f, 25.781f, 17.793f, 25.5858f);
        this.f30626c.lineTo(22.9395f, 20.4393f);
        this.f30626c.cubicTo(23.5252f, 19.8536f, 24.475f, 19.8536f, 25.0608f, 20.4393f);
        this.f30626c.lineTo(30.2072f, 25.5858f);
        this.f30626c.cubicTo(30.4025f, 25.781f, 30.4025f, 26.0976f, 30.2072f, 26.2929f);
        this.f30626c.lineTo(28.793f, 27.7071f);
        this.f30626c.cubicTo(28.5977f, 27.9024f, 28.2812f, 27.9024f, 28.0859f, 27.7071f);
        this.f30626c.lineTo(25.5001f, 25.1213f);
        this.f30626c.lineTo(25.5001f, 37.0f);
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
