package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class al extends a {
    static {
        Covode.recordClassIndex(18148);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(9.0f, 9.0f);
        this.f30626c.cubicTo(9.0f, 7.34315f, 10.3431f, 6.0f, 12.0f, 6.0f);
        this.f30626c.lineTo(25.0f, 6.0f);
        this.f30626c.cubicTo(26.6569f, 6.0f, 28.0f, 7.34315f, 28.0f, 9.0f);
        this.f30626c.lineTo(35.0f, 9.0f);
        this.f30626c.cubicTo(36.6569f, 9.0f, 38.0f, 10.3431f, 38.0f, 12.0f);
        this.f30626c.lineTo(38.0f, 39.0f);
        this.f30626c.cubicTo(38.0f, 40.6569f, 36.6569f, 42.0f, 35.0f, 42.0f);
        this.f30626c.lineTo(15.0f, 42.0f);
        this.f30626c.cubicTo(13.3431f, 42.0f, 12.0f, 40.6569f, 12.0f, 39.0f);
        this.f30626c.lineTo(12.0f, 28.0f);
        this.f30626c.cubicTo(10.3431f, 28.0f, 9.0f, 26.6569f, 9.0f, 25.0f);
        this.f30626c.lineTo(9.0f, 9.0f);
        this.f30626c.close();
        this.f30626c.moveTo(14.0f, 28.0f);
        this.f30626c.lineTo(14.0f, 39.0f);
        this.f30626c.cubicTo(14.0f, 39.5523f, 14.4477f, 40.0f, 15.0f, 40.0f);
        this.f30626c.lineTo(35.0f, 40.0f);
        this.f30626c.cubicTo(35.5523f, 40.0f, 36.0f, 39.5523f, 36.0f, 39.0f);
        this.f30626c.lineTo(36.0f, 12.0f);
        this.f30626c.cubicTo(36.0f, 11.4477f, 35.5523f, 11.0f, 35.0f, 11.0f);
        this.f30626c.lineTo(28.0f, 11.0f);
        this.f30626c.lineTo(28.0f, 25.0f);
        this.f30626c.cubicTo(28.0f, 26.6569f, 26.6569f, 28.0f, 25.0f, 28.0f);
        this.f30626c.lineTo(14.0f, 28.0f);
        this.f30626c.close();
        this.f30626c.moveTo(12.0f, 8.0f);
        this.f30626c.cubicTo(11.4477f, 8.0f, 11.0f, 8.44772f, 11.0f, 9.0f);
        this.f30626c.lineTo(11.0f, 25.0f);
        this.f30626c.cubicTo(11.0f, 25.5523f, 11.4477f, 26.0f, 12.0f, 26.0f);
        this.f30626c.lineTo(25.0f, 26.0f);
        this.f30626c.cubicTo(25.5523f, 26.0f, 26.0f, 25.5523f, 26.0f, 25.0f);
        this.f30626c.lineTo(26.0f, 9.0f);
        this.f30626c.cubicTo(26.0f, 8.44772f, 25.5523f, 8.0f, 25.0f, 8.0f);
        this.f30626c.lineTo(12.0f, 8.0f);
        this.f30626c.close();
        this.f30626c.moveTo(16.5f, 15.0f);
        this.f30626c.cubicTo(16.5f, 16.6569f, 15.8284f, 18.0f, 15.0f, 18.0f);
        this.f30626c.cubicTo(14.1716f, 18.0f, 13.5f, 16.6569f, 13.5f, 15.0f);
        this.f30626c.cubicTo(13.5f, 13.3431f, 14.1716f, 12.0f, 15.0f, 12.0f);
        this.f30626c.cubicTo(15.8284f, 12.0f, 16.5f, 13.3431f, 16.5f, 15.0f);
        this.f30626c.close();
        this.f30626c.moveTo(22.0f, 18.0f);
        this.f30626c.cubicTo(22.8284f, 18.0f, 23.5f, 16.6569f, 23.5f, 15.0f);
        this.f30626c.cubicTo(23.5f, 13.3431f, 22.8284f, 12.0f, 22.0f, 12.0f);
        this.f30626c.cubicTo(21.1716f, 12.0f, 20.5f, 13.3431f, 20.5f, 15.0f);
        this.f30626c.cubicTo(20.5f, 16.6569f, 21.1716f, 18.0f, 22.0f, 18.0f);
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
