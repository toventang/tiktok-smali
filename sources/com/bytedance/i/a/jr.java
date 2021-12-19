package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class jr extends a {
    static {
        Covode.recordClassIndex(18397);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(50.0f, 19.0f);
        this.f30626c.lineTo(50.0f, 27.0f);
        this.f30626c.lineTo(22.0f, 27.0f);
        this.f30626c.lineTo(22.0f, 19.0f);
        this.f30626c.cubicTo(22.0f, 11.268f, 28.268f, 5.0f, 36.0f, 5.0f);
        this.f30626c.cubicTo(43.732f, 5.0f, 50.0f, 11.268f, 50.0f, 19.0f);
        this.f30626c.close();
        this.f30626c.moveTo(19.0f, 27.0f);
        this.f30626c.lineTo(19.0f, 19.0f);
        this.f30626c.cubicTo(19.0f, 9.61116f, 26.6112f, 2.0f, 36.0f, 2.0f);
        this.f30626c.cubicTo(45.3888f, 2.0f, 53.0f, 9.61116f, 53.0f, 19.0f);
        this.f30626c.lineTo(53.0f, 27.0f);
        this.f30626c.lineTo(61.0f, 27.0f);
        this.f30626c.cubicTo(64.3137f, 27.0f, 67.0f, 29.6863f, 67.0f, 33.0f);
        this.f30626c.lineTo(67.0f, 63.9474f);
        this.f30626c.cubicTo(67.0f, 67.2611f, 64.3137f, 69.9474f, 61.0f, 69.9474f);
        this.f30626c.lineTo(11.0f, 69.9474f);
        this.f30626c.cubicTo(7.68629f, 69.9474f, 5.0f, 67.2611f, 5.0f, 63.9474f);
        this.f30626c.lineTo(5.0f, 33.0f);
        this.f30626c.cubicTo(5.0f, 29.6863f, 7.68629f, 27.0f, 11.0f, 27.0f);
        this.f30626c.lineTo(19.0f, 27.0f);
        this.f30626c.close();
        this.f30626c.moveTo(20.009f, 30.0f);
        this.f30626c.lineTo(11.0f, 30.0f);
        this.f30626c.cubicTo(9.34314f, 30.0f, 8.0f, 31.3431f, 8.0f, 33.0f);
        this.f30626c.lineTo(8.0f, 63.9474f);
        this.f30626c.cubicTo(8.0f, 65.6042f, 9.34315f, 66.9474f, 11.0f, 66.9474f);
        this.f30626c.lineTo(61.0f, 66.9474f);
        this.f30626c.cubicTo(62.6569f, 66.9474f, 64.0f, 65.6042f, 64.0f, 63.9474f);
        this.f30626c.lineTo(64.0f, 33.0f);
        this.f30626c.cubicTo(64.0f, 31.3431f, 62.6569f, 30.0f, 61.0f, 30.0f);
        this.f30626c.lineTo(51.991f, 30.0f);
        this.f30626c.lineTo(20.009f, 30.0f);
        this.f30626c.close();
        this.f30626c.moveTo(37.5f, 48.6922f);
        this.f30626c.cubicTo(39.5286f, 48.0551f, 41.0f, 46.16f, 41.0f, 43.9211f);
        this.f30626c.cubicTo(41.0f, 41.1597f, 38.7614f, 38.9211f, 36.0f, 38.9211f);
        this.f30626c.cubicTo(33.2386f, 38.9211f, 31.0f, 41.1597f, 31.0f, 43.9211f);
        this.f30626c.cubicTo(31.0f, 46.16f, 32.4714f, 48.0551f, 34.5f, 48.6922f);
        this.f30626c.lineTo(34.5f, 57.8421f);
        this.f30626c.cubicTo(34.5f, 58.3944f, 34.9477f, 58.8421f, 35.5f, 58.8421f);
        this.f30626c.lineTo(36.5f, 58.8421f);
        this.f30626c.cubicTo(37.0523f, 58.8421f, 37.5f, 58.3944f, 37.5f, 57.8421f);
        this.f30626c.lineTo(37.5f, 48.6922f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
