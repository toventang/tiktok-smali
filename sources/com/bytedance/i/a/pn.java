package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pn extends a {
    static {
        Covode.recordClassIndex(18555);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(7.0f, 10.0f);
        this.f30626c.cubicTo(4.23858f, 10.0f, 2.0f, 12.2386f, 2.0f, 15.0f);
        this.f30626c.lineTo(2.0f, 33.0f);
        this.f30626c.cubicTo(2.0f, 35.7614f, 4.23858f, 38.0f, 7.0f, 38.0f);
        this.f30626c.lineTo(29.0f, 38.0f);
        this.f30626c.cubicTo(31.7614f, 38.0f, 34.0f, 35.7614f, 34.0f, 33.0f);
        this.f30626c.lineTo(34.0f, 27.2763f);
        this.f30626c.lineTo(42.7879f, 33.5909f);
        this.f30626c.cubicTo(43.3927f, 34.0516f, 44.2064f, 34.1297f, 44.8876f, 33.7922f);
        this.f30626c.cubicTo(45.5689f, 33.4548f, 46.0f, 32.7603f, 46.0f, 32.0f);
        this.f30626c.lineTo(46.0f, 16.0f);
        this.f30626c.cubicTo(46.0f, 15.2397f, 45.5689f, 14.5452f, 44.8876f, 14.2078f);
        this.f30626c.cubicTo(44.2063f, 13.8703f, 43.3927f, 13.9484f, 42.7879f, 14.4091f);
        this.f30626c.lineTo(34.0f, 20.7238f);
        this.f30626c.lineTo(34.0f, 15.0f);
        this.f30626c.cubicTo(34.0f, 12.2386f, 31.7614f, 10.0f, 29.0f, 10.0f);
        this.f30626c.lineTo(7.0f, 10.0f);
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
