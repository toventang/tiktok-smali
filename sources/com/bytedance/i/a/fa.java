package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fa extends a {
    static {
        Covode.recordClassIndex(18272);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(7.58586f, 11.0355f);
        this.f30626c.lineTo(21.8788f, 25.3284f);
        this.f30626c.cubicTo(23.0503f, 26.5f, 24.9498f, 26.5f, 26.1214f, 25.3284f);
        this.f30626c.lineTo(40.4143f, 11.0355f);
        this.f30626c.cubicTo(40.8048f, 10.645f, 40.8048f, 10.0118f, 40.4143f, 9.62133f);
        this.f30626c.lineTo(37.5859f, 6.7929f);
        this.f30626c.cubicTo(37.1953f, 6.40237f, 36.5622f, 6.40237f, 36.1716f, 6.7929f);
        this.f30626c.lineTo(24.0001f, 18.9645f);
        this.f30626c.lineTo(11.8285f, 6.79289f);
        this.f30626c.cubicTo(11.438f, 6.40237f, 10.8048f, 6.40237f, 10.4143f, 6.79289f);
        this.f30626c.lineTo(7.58586f, 9.62132f);
        this.f30626c.cubicTo(7.19534f, 10.0118f, 7.19534f, 10.645f, 7.58586f, 11.0355f);
        this.f30626c.close();
        this.f30626c.moveTo(7.58586f, 30.0355f);
        this.f30626c.lineTo(21.8788f, 44.3284f);
        this.f30626c.cubicTo(23.0503f, 45.5f, 24.9498f, 45.5f, 26.1214f, 44.3284f);
        this.f30626c.lineTo(40.4143f, 30.0355f);
        this.f30626c.cubicTo(40.8048f, 29.645f, 40.8048f, 29.0119f, 40.4143f, 28.6213f);
        this.f30626c.lineTo(37.5859f, 25.7929f);
        this.f30626c.cubicTo(37.1953f, 25.4024f, 36.5622f, 25.4024f, 36.1716f, 25.7929f);
        this.f30626c.lineTo(24.0001f, 37.9645f);
        this.f30626c.lineTo(11.8285f, 25.7929f);
        this.f30626c.cubicTo(11.438f, 25.4024f, 10.8048f, 25.4024f, 10.4143f, 25.7929f);
        this.f30626c.lineTo(7.58586f, 28.6213f);
        this.f30626c.cubicTo(7.19534f, 29.0118f, 7.19534f, 29.645f, 7.58586f, 30.0355f);
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
