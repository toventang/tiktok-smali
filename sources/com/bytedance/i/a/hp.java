package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hp extends a {
    static {
        Covode.recordClassIndex(18341);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0002f, 26.0f);
        this.f30626c.cubicTo(19.7059f, 26.0f, 15.8921f, 24.6667f, 13.1943f, 22.6037f);
        this.f30626c.cubicTo(10.8165f, 20.7853f, 9.37042f, 18.4654f, 9.0623f, 15.9975f);
        this.f30626c.cubicTo(8.99388f, 15.4494f, 8.55252f, 15.0f, 8.00023f, 15.0f);
        this.f30626c.lineTo(6.00023f, 15.0f);
        this.f30626c.cubicTo(5.44795f, 15.0f, 4.99588f, 15.4488f, 5.04122f, 15.9992f);
        this.f30626c.cubicTo(5.36458f, 19.9247f, 7.5754f, 23.3424f, 10.7645f, 25.7811f);
        this.f30626c.cubicTo(11.224f, 26.1324f, 11.7052f, 26.4649f, 12.2062f, 26.7774f);
        this.f30626c.lineTo(9.50035f, 31.4641f);
        this.f30626c.cubicTo(9.22421f, 31.9424f, 9.38808f, 32.554f, 9.86638f, 32.8301f);
        this.f30626c.lineTo(11.5984f, 33.8301f);
        this.f30626c.cubicTo(12.0767f, 34.1063f, 12.6883f, 33.9424f, 12.9645f, 33.4641f);
        this.f30626c.lineTo(15.8046f, 28.5449f);
        this.f30626c.cubicTo(17.7228f, 29.2661f, 19.8114f, 29.7384f, 22.0004f, 29.9183f);
        this.f30626c.lineTo(22.0004f, 35.0f);
        this.f30626c.cubicTo(22.0004f, 35.5523f, 22.4481f, 36.0f, 23.0004f, 36.0f);
        this.f30626c.lineTo(25.0004f, 36.0f);
        this.f30626c.cubicTo(25.5526f, 36.0f, 26.0004f, 35.5523f, 26.0004f, 35.0f);
        this.f30626c.lineTo(26.0004f, 29.9183f);
        this.f30626c.cubicTo(28.4556f, 29.7165f, 30.7847f, 29.1467f, 32.8886f, 28.2706f);
        this.f30626c.lineTo(35.5004f, 32.7942f);
        this.f30626c.cubicTo(35.7765f, 33.2725f, 36.3881f, 33.4364f, 36.8664f, 33.1603f);
        this.f30626c.lineTo(38.5984f, 32.1603f);
        this.f30626c.cubicTo(39.0767f, 31.8841f, 39.2406f, 31.2725f, 38.9645f, 30.7942f);
        this.f30626c.lineTo(36.4128f, 26.3746f);
        this.f30626c.cubicTo(36.6943f, 26.1833f, 36.9688f, 25.9854f, 37.236f, 25.7811f);
        this.f30626c.cubicTo(40.4251f, 23.3424f, 42.6359f, 19.9247f, 42.9592f, 15.9992f);
        this.f30626c.cubicTo(43.0046f, 15.4488f, 42.5525f, 15.0f, 42.0002f, 15.0f);
        this.f30626c.lineTo(40.0002f, 15.0f);
        this.f30626c.cubicTo(39.4479f, 15.0f, 39.0066f, 15.4494f, 38.9382f, 15.9975f);
        this.f30626c.cubicTo(38.63f, 18.4654f, 37.184f, 20.7853f, 34.8061f, 22.6037f);
        this.f30626c.cubicTo(32.1084f, 24.6667f, 28.2946f, 26.0f, 24.0002f, 26.0f);
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
