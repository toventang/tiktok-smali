package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bn extends a {
    static {
        Covode.recordClassIndex(18177);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 8.5f);
        this.f30626c.cubicTo(6.067f, 8.5f, 4.5f, 10.067f, 4.5f, 12.0f);
        this.f30626c.lineTo(4.5f, 36.0f);
        this.f30626c.cubicTo(4.5f, 37.933f, 6.067f, 39.5f, 8.0f, 39.5f);
        this.f30626c.lineTo(39.0f, 39.5f);
        this.f30626c.cubicTo(40.933f, 39.5f, 42.5f, 37.933f, 42.5f, 36.0f);
        this.f30626c.lineTo(42.5f, 12.0f);
        this.f30626c.cubicTo(42.5f, 10.067f, 40.933f, 8.5f, 39.0f, 8.5f);
        this.f30626c.lineTo(8.0f, 8.5f);
        this.f30626c.close();
        this.f30626c.moveTo(7.5f, 12.0f);
        this.f30626c.cubicTo(7.5f, 11.7239f, 7.72386f, 11.5f, 8.0f, 11.5f);
        this.f30626c.lineTo(39.0f, 11.5f);
        this.f30626c.cubicTo(39.2761f, 11.5f, 39.5f, 11.7239f, 39.5f, 12.0f);
        this.f30626c.lineTo(39.5f, 26.0f);
        this.f30626c.lineTo(31.9f, 20.3f);
        this.f30626c.cubicTo(31.346f, 19.8845f, 30.5796f, 19.9023f, 30.0454f, 20.3429f);
        this.f30626c.lineTo(10.4611f, 36.5f);
        this.f30626c.lineTo(8.0f, 36.5f);
        this.f30626c.cubicTo(7.72386f, 36.5f, 7.5f, 36.2761f, 7.5f, 36.0f);
        this.f30626c.lineTo(7.5f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(31.0442f, 23.4081f);
        this.f30626c.lineTo(39.5f, 29.75f);
        this.f30626c.lineTo(39.5f, 36.0f);
        this.f30626c.cubicTo(39.5f, 36.2761f, 39.2761f, 36.5f, 39.0f, 36.5f);
        this.f30626c.lineTo(15.1753f, 36.5f);
        this.f30626c.lineTo(31.0442f, 23.4081f);
        this.f30626c.close();
        this.f30626c.moveTo(17.0f, 22.0f);
        this.f30626c.cubicTo(18.6569f, 22.0f, 20.0f, 20.6569f, 20.0f, 19.0f);
        this.f30626c.cubicTo(20.0f, 17.3431f, 18.6569f, 16.0f, 17.0f, 16.0f);
        this.f30626c.cubicTo(15.3431f, 16.0f, 14.0f, 17.3431f, 14.0f, 19.0f);
        this.f30626c.cubicTo(14.0f, 20.6569f, 15.3431f, 22.0f, 17.0f, 22.0f);
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
