package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ow extends a {
    static {
        Covode.recordClassIndex(18537);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 46.0f);
        this.f30626c.cubicTo(36.1503f, 46.0f, 46.0f, 36.1503f, 46.0f, 24.0f);
        this.f30626c.cubicTo(46.0f, 11.8497f, 36.1503f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(11.8497f, 2.0f, 2.0f, 11.8497f, 2.0f, 24.0f);
        this.f30626c.cubicTo(2.0f, 36.1503f, 11.8497f, 46.0f, 24.0f, 46.0f);
        this.f30626c.close();
        this.f30626c.moveTo(14.4563f, 22.0891f);
        this.f30626c.cubicTo(14.8468f, 21.6986f, 15.48f, 21.6986f, 15.8705f, 22.0891f);
        this.f30626c.lineTo(20.5632f, 26.7817f);
        this.f30626c.lineTo(32.0054f, 15.3395f);
        this.f30626c.cubicTo(32.396f, 14.949f, 33.0291f, 14.949f, 33.4196f, 15.3395f);
        this.f30626c.lineTo(36.0552f, 17.9751f);
        this.f30626c.cubicTo(36.4457f, 18.3656f, 36.4457f, 18.9987f, 36.0552f, 19.3893f);
        this.f30626c.lineTo(24.6129f, 30.8315f);
        this.f30626c.lineTo(21.9774f, 33.4671f);
        this.f30626c.cubicTo(21.1963f, 34.2482f, 19.93f, 34.2482f, 19.1489f, 33.4671f);
        this.f30626c.lineTo(16.5134f, 30.8315f);
        this.f30626c.lineTo(11.8207f, 26.1389f);
        this.f30626c.cubicTo(11.4302f, 25.7484f, 11.4302f, 25.1152f, 11.8207f, 24.7247f);
        this.f30626c.lineTo(14.4563f, 22.0891f);
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
