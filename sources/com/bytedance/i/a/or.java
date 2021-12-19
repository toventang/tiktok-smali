package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class or extends a {
    static {
        Covode.recordClassIndex(18532);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(17.8286f, 4.0f);
        this.f30626c.cubicTo(15.7141f, 4.0f, 14.0f, 5.71411f, 14.0f, 7.82857f);
        this.f30626c.lineTo(14.0f, 12.0f);
        this.f30626c.lineTo(9.82857f, 12.0f);
        this.f30626c.cubicTo(7.71411f, 12.0f, 6.0f, 13.7141f, 6.0f, 15.8286f);
        this.f30626c.lineTo(6.0f, 40.1714f);
        this.f30626c.cubicTo(6.0f, 42.2859f, 7.71411f, 44.0f, 9.82857f, 44.0f);
        this.f30626c.lineTo(34.1714f, 44.0f);
        this.f30626c.cubicTo(36.2859f, 44.0f, 38.0f, 42.2859f, 38.0f, 40.1714f);
        this.f30626c.lineTo(38.0f, 35.8286f);
        this.f30626c.lineTo(42.1714f, 35.8286f);
        this.f30626c.cubicTo(44.2859f, 35.8286f, 46.0f, 34.1145f, 46.0f, 32.0f);
        this.f30626c.lineTo(46.0f, 7.82857f);
        this.f30626c.cubicTo(46.0f, 5.71411f, 44.2859f, 4.0f, 42.1714f, 4.0f);
        this.f30626c.lineTo(17.8286f, 4.0f);
        this.f30626c.close();
        this.f30626c.moveTo(34.1714f, 12.0f);
        this.f30626c.lineTo(18.0f, 12.0f);
        this.f30626c.lineTo(18.0f, 8.0f);
        this.f30626c.lineTo(42.0f, 8.0f);
        this.f30626c.lineTo(42.0f, 31.8286f);
        this.f30626c.lineTo(38.0f, 31.8286f);
        this.f30626c.lineTo(38.0f, 15.8286f);
        this.f30626c.cubicTo(38.0f, 13.7141f, 36.2859f, 12.0f, 34.1714f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(10.0f, 40.0f);
        this.f30626c.lineTo(10.0f, 16.0f);
        this.f30626c.lineTo(34.0f, 16.0f);
        this.f30626c.lineTo(34.0f, 40.0f);
        this.f30626c.lineTo(10.0f, 40.0f);
        this.f30626c.close();
        this.f30626c.moveTo(18.9537f, 19.5327f);
        this.f30626c.cubicTo(18.4157f, 19.183f, 17.7293f, 19.1558f, 17.1653f, 19.4619f);
        this.f30626c.cubicTo(16.6013f, 19.768f, 16.25f, 20.3583f, 16.25f, 21.0f);
        this.f30626c.lineTo(16.25f, 34.0f);
        this.f30626c.cubicTo(16.25f, 34.6417f, 16.6013f, 35.232f, 17.1653f, 35.5381f);
        this.f30626c.cubicTo(17.7293f, 35.8442f, 18.4157f, 35.817f, 18.9537f, 35.4673f);
        this.f30626c.lineTo(28.9537f, 28.9673f);
        this.f30626c.cubicTo(29.4504f, 28.6445f, 29.75f, 28.0923f, 29.75f, 27.5f);
        this.f30626c.cubicTo(29.75f, 26.9077f, 29.4504f, 26.3555f, 28.9537f, 26.0327f);
        this.f30626c.lineTo(18.9537f, 19.5327f);
        this.f30626c.close();
        this.f30626c.moveTo(24.7889f, 27.5f);
        this.f30626c.lineTo(19.75f, 30.7753f);
        this.f30626c.lineTo(19.75f, 24.2247f);
        this.f30626c.lineTo(24.7889f, 27.5f);
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
