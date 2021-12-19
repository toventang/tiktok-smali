package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pt extends a {
    static {
        Covode.recordClassIndex(18561);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 5.0f);
        this.f30626c.cubicTo(6.34315f, 5.0f, 5.0f, 6.34315f, 5.0f, 8.0f);
        this.f30626c.lineTo(5.0f, 40.0f);
        this.f30626c.cubicTo(5.0f, 41.6569f, 6.34315f, 43.0f, 8.0f, 43.0f);
        this.f30626c.lineTo(40.0f, 43.0f);
        this.f30626c.cubicTo(41.6569f, 43.0f, 43.0f, 41.6569f, 43.0f, 40.0f);
        this.f30626c.lineTo(43.0f, 15.0f);
        this.f30626c.cubicTo(43.0f, 13.3431f, 41.6568f, 12.0f, 40.0f, 12.0f);
        this.f30626c.lineTo(38.0f, 12.0f);
        this.f30626c.lineTo(38.0f, 8.0f);
        this.f30626c.cubicTo(38.0f, 6.34314f, 36.6569f, 5.0f, 35.0f, 5.0f);
        this.f30626c.lineTo(8.0f, 5.0f);
        this.f30626c.close();
        this.f30626c.moveTo(9.0f, 39.0f);
        this.f30626c.lineTo(9.0f, 16.0f);
        this.f30626c.lineTo(39.0f, 16.0f);
        this.f30626c.lineTo(39.0f, 39.0f);
        this.f30626c.lineTo(9.0f, 39.0f);
        this.f30626c.close();
        this.f30626c.moveTo(34.0f, 12.0f);
        this.f30626c.lineTo(9.0f, 12.0f);
        this.f30626c.lineTo(9.0f, 9.0f);
        this.f30626c.lineTo(34.0f, 9.0f);
        this.f30626c.lineTo(34.0f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(23.0f, 35.0f);
        this.f30626c.cubicTo(22.4477f, 35.0f, 22.0f, 34.5523f, 22.0f, 34.0f);
        this.f30626c.lineTo(22.0f, 30.0f);
        this.f30626c.lineTo(18.0f, 30.0f);
        this.f30626c.cubicTo(17.4477f, 30.0f, 17.0f, 29.5523f, 17.0f, 29.0f);
        this.f30626c.lineTo(17.0f, 27.0f);
        this.f30626c.cubicTo(17.0f, 26.4477f, 17.4477f, 26.0f, 18.0f, 26.0f);
        this.f30626c.lineTo(22.0f, 26.0f);
        this.f30626c.lineTo(22.0f, 22.0f);
        this.f30626c.cubicTo(22.0f, 21.4477f, 22.4477f, 21.0f, 23.0f, 21.0f);
        this.f30626c.lineTo(25.0f, 21.0f);
        this.f30626c.cubicTo(25.5523f, 21.0f, 26.0f, 21.4477f, 26.0f, 22.0f);
        this.f30626c.lineTo(26.0f, 26.0f);
        this.f30626c.lineTo(30.0f, 26.0f);
        this.f30626c.cubicTo(30.5523f, 26.0f, 31.0f, 26.4477f, 31.0f, 27.0f);
        this.f30626c.lineTo(31.0f, 29.0f);
        this.f30626c.cubicTo(31.0f, 29.5523f, 30.5523f, 30.0f, 30.0f, 30.0f);
        this.f30626c.lineTo(26.0f, 30.0f);
        this.f30626c.lineTo(26.0f, 34.0f);
        this.f30626c.cubicTo(26.0f, 34.5523f, 25.5523f, 35.0f, 25.0f, 35.0f);
        this.f30626c.lineTo(23.0f, 35.0f);
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
