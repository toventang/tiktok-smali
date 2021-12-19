package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pm extends a {
    static {
        Covode.recordClassIndex(18554);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(7.5f, 10.0f);
        this.f30626c.cubicTo(4.73858f, 10.0f, 2.5f, 12.2386f, 2.5f, 15.0f);
        this.f30626c.lineTo(2.5f, 33.0f);
        this.f30626c.cubicTo(2.5f, 35.7614f, 4.73858f, 38.0f, 7.5f, 38.0f);
        this.f30626c.lineTo(29.5f, 38.0f);
        this.f30626c.cubicTo(32.2614f, 38.0f, 34.5f, 35.7614f, 34.5f, 33.0f);
        this.f30626c.lineTo(34.5f, 27.2763f);
        this.f30626c.lineTo(42.7879f, 33.5909f);
        this.f30626c.cubicTo(43.3927f, 34.0516f, 44.2064f, 34.1297f, 44.8876f, 33.7922f);
        this.f30626c.cubicTo(45.5689f, 33.4548f, 46.0f, 32.7603f, 46.0f, 32.0f);
        this.f30626c.lineTo(46.0f, 16.0f);
        this.f30626c.cubicTo(46.0f, 15.2397f, 45.5689f, 14.5452f, 44.8876f, 14.2078f);
        this.f30626c.cubicTo(44.2063f, 13.8704f, 43.3927f, 13.9484f, 42.7879f, 14.4092f);
        this.f30626c.lineTo(34.5f, 20.7238f);
        this.f30626c.lineTo(34.5f, 15.0f);
        this.f30626c.cubicTo(34.5f, 12.2386f, 32.2614f, 10.0f, 29.5f, 10.0f);
        this.f30626c.lineTo(7.5f, 10.0f);
        this.f30626c.close();
        this.f30626c.moveTo(6.5f, 15.0f);
        this.f30626c.cubicTo(6.5f, 14.4477f, 6.94772f, 14.0f, 7.5f, 14.0f);
        this.f30626c.lineTo(29.5f, 14.0f);
        this.f30626c.cubicTo(30.0523f, 14.0f, 30.5f, 14.4477f, 30.5f, 15.0f);
        this.f30626c.lineTo(30.5f, 33.0f);
        this.f30626c.cubicTo(30.5f, 33.5523f, 30.0523f, 34.0f, 29.5f, 34.0f);
        this.f30626c.lineTo(7.5f, 34.0f);
        this.f30626c.cubicTo(6.94771f, 34.0f, 6.5f, 33.5523f, 6.5f, 33.0f);
        this.f30626c.lineTo(6.5f, 15.0f);
        this.f30626c.close();
        this.f30626c.moveTo(42.0f, 27.9619f);
        this.f30626c.lineTo(36.8001f, 24.0001f);
        this.f30626c.lineTo(42.0f, 20.0382f);
        this.f30626c.lineTo(42.0f, 27.9619f);
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
