package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ms extends a {
    static {
        Covode.recordClassIndex(18479);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 6.0f);
        this.f30626c.cubicTo(14.0589f, 6.0f, 6.0f, 14.0589f, 6.0f, 24.0f);
        this.f30626c.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f30626c.cubicTo(33.9411f, 42.0f, 42.0f, 33.9411f, 42.0f, 24.0f);
        this.f30626c.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.moveTo(2.0f, 24.0f);
        this.f30626c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f30626c.cubicTo(46.0f, 36.1503f, 36.1503f, 46.0f, 24.0f, 46.0f);
        this.f30626c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0909f, 15.0f);
        this.f30626c.cubicTo(22.172f, 15.0f, 20.3433f, 16.2292f, 19.2617f, 18.61f);
        this.f30626c.cubicTo(19.0332f, 19.1128f, 18.4726f, 19.4f, 17.9487f, 19.2253f);
        this.f30626c.lineTo(16.0513f, 18.5929f);
        this.f30626c.cubicTo(15.5274f, 18.4182f, 15.2406f, 17.8497f, 15.4542f, 17.3405f);
        this.f30626c.cubicTo(16.9801f, 13.7031f, 20.0581f, 11.0f, 24.0909f, 11.0f);
        this.f30626c.cubicTo(28.459f, 11.0f, 32.0f, 14.541f, 32.0f, 18.9091f);
        this.f30626c.cubicTo(32.0f, 21.2138f, 30.7884f, 23.4606f, 29.2167f, 25.074f);
        this.f30626c.cubicTo(27.8157f, 26.5121f, 25.5807f, 27.702f, 22.9988f, 27.9518f);
        this.f30626c.cubicTo(22.4491f, 28.0049f, 22.0001f, 27.5523f, 22.0001f, 27.0f);
        this.f30626c.lineTo(22.0001f, 25.0f);
        this.f30626c.cubicTo(22.0001f, 24.4477f, 22.4504f, 24.0057f, 22.9955f, 23.9167f);
        this.f30626c.cubicTo(24.2296f, 23.7153f, 25.5034f, 23.1533f, 26.3515f, 22.2828f);
        this.f30626c.cubicTo(27.4389f, 21.1666f, 28.0f, 19.8679f, 28.0f, 18.9091f);
        this.f30626c.cubicTo(28.0f, 16.7502f, 26.2498f, 15.0f, 24.0909f, 15.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 36.0f);
        this.f30626c.cubicTo(22.3431f, 36.0f, 21.0f, 34.6569f, 21.0f, 33.0f);
        this.f30626c.cubicTo(21.0f, 31.3431f, 22.3431f, 30.0f, 24.0f, 30.0f);
        this.f30626c.cubicTo(25.6569f, 30.0f, 27.0f, 31.3431f, 27.0f, 33.0f);
        this.f30626c.cubicTo(27.0f, 34.6569f, 25.6569f, 36.0f, 24.0f, 36.0f);
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
