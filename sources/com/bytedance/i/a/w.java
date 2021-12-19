package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class w extends a {
    static {
        Covode.recordClassIndex(18574);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(17.0f, 16.4f);
        this.f30626c.cubicTo(17.0f, 12.2666f, 20.1794f, 9.0f, 24.0f, 9.0f);
        this.f30626c.cubicTo(27.8206f, 9.0f, 31.0f, 12.2666f, 31.0f, 16.4f);
        this.f30626c.lineTo(31.0f, 18.0f);
        this.f30626c.lineTo(17.0f, 18.0f);
        this.f30626c.lineTo(17.0f, 16.4f);
        this.f30626c.close();
        this.f30626c.moveTo(33.0f, 16.4f);
        this.f30626c.lineTo(33.0f, 18.0f);
        this.f30626c.lineTo(35.0f, 18.0f);
        this.f30626c.cubicTo(36.6569f, 18.0f, 38.0f, 19.3431f, 38.0f, 21.0f);
        this.f30626c.lineTo(38.0f, 37.0f);
        this.f30626c.cubicTo(38.0f, 38.6569f, 36.6569f, 40.0f, 35.0f, 40.0f);
        this.f30626c.lineTo(13.0f, 40.0f);
        this.f30626c.cubicTo(11.3431f, 40.0f, 10.0f, 38.6569f, 10.0f, 37.0f);
        this.f30626c.lineTo(10.0f, 21.0f);
        this.f30626c.cubicTo(10.0f, 19.3431f, 11.3431f, 18.0f, 13.0f, 18.0f);
        this.f30626c.lineTo(15.0f, 18.0f);
        this.f30626c.lineTo(15.0f, 16.4f);
        this.f30626c.cubicTo(15.0f, 11.2551f, 18.984f, 7.0f, 24.0f, 7.0f);
        this.f30626c.cubicTo(29.016f, 7.0f, 33.0f, 11.2551f, 33.0f, 16.4f);
        this.f30626c.close();
        this.f30626c.moveTo(12.0f, 21.0f);
        this.f30626c.cubicTo(12.0f, 20.4477f, 12.4477f, 20.0f, 13.0f, 20.0f);
        this.f30626c.lineTo(35.0f, 20.0f);
        this.f30626c.cubicTo(35.5523f, 20.0f, 36.0f, 20.4477f, 36.0f, 21.0f);
        this.f30626c.lineTo(36.0f, 37.0f);
        this.f30626c.cubicTo(36.0f, 37.5523f, 35.5523f, 38.0f, 35.0f, 38.0f);
        this.f30626c.lineTo(13.0f, 38.0f);
        this.f30626c.cubicTo(12.4477f, 38.0f, 12.0f, 37.5523f, 12.0f, 37.0f);
        this.f30626c.lineTo(12.0f, 21.0f);
        this.f30626c.close();
        this.f30626c.moveTo(25.0f, 28.792f);
        this.f30626c.cubicTo(25.883f, 28.4062f, 26.5f, 27.5252f, 26.5f, 26.5f);
        this.f30626c.cubicTo(26.5f, 25.1193f, 25.3807f, 24.0f, 24.0f, 24.0f);
        this.f30626c.cubicTo(22.6193f, 24.0f, 21.5f, 25.1193f, 21.5f, 26.5f);
        this.f30626c.cubicTo(21.5f, 27.5252f, 22.117f, 28.4062f, 23.0f, 28.792f);
        this.f30626c.lineTo(23.0f, 33.0f);
        this.f30626c.cubicTo(23.0f, 33.5523f, 23.4477f, 34.0f, 24.0f, 34.0f);
        this.f30626c.cubicTo(24.5523f, 34.0f, 25.0f, 33.5523f, 25.0f, 33.0f);
        this.f30626c.lineTo(25.0f, 28.792f);
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
