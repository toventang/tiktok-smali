package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class oo extends a {
    static {
        Covode.recordClassIndex(18529);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(11.4977f, 9.0f);
        this.f30626c.cubicTo(10.1195f, 9.0f, 9.0013f, 10.1153f, 8.99767f, 11.4934f);
        this.f30626c.lineTo(8.94239f, 32.4934f);
        this.f30626c.cubicTo(8.93875f, 33.8767f, 10.0591f, 35.0f, 11.4424f, 35.0f);
        this.f30626c.lineTo(18.7895f, 35.0f);
        this.f30626c.lineTo(22.0656f, 39.004f);
        this.f30626c.cubicTo(23.0659f, 40.2265f, 24.9352f, 40.2264f, 25.9354f, 39.0039f);
        this.f30626c.lineTo(29.2111f, 35.0f);
        this.f30626c.lineTo(36.5587f, 35.0f);
        this.f30626c.cubicTo(37.942f, 35.0f, 39.0623f, 33.8767f, 39.0587f, 32.4934f);
        this.f30626c.lineTo(39.0029f, 11.4934f);
        this.f30626c.cubicTo(38.9993f, 10.1152f, 37.8811f, 9.0f, 36.5029f, 9.0f);
        this.f30626c.lineTo(11.4977f, 9.0f);
        this.f30626c.close();
        this.f30626c.moveTo(29.0f, 21.0f);
        this.f30626c.lineTo(19.0f, 21.0f);
        this.f30626c.cubicTo(18.4477f, 21.0f, 18.0f, 21.4477f, 18.0f, 22.0f);
        this.f30626c.lineTo(18.0f, 23.0f);
        this.f30626c.cubicTo(18.0f, 23.5523f, 18.4477f, 24.0f, 19.0f, 24.0f);
        this.f30626c.lineTo(29.0f, 24.0f);
        this.f30626c.cubicTo(29.5523f, 24.0f, 30.0f, 23.5523f, 30.0f, 23.0f);
        this.f30626c.lineTo(30.0f, 22.0f);
        this.f30626c.cubicTo(30.0f, 21.4477f, 29.5523f, 21.0f, 29.0f, 21.0f);
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
