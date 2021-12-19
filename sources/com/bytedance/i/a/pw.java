package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pw extends a {
    static {
        Covode.recordClassIndex(18564);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 46.0f);
        this.f30626c.cubicTo(36.1503f, 46.0f, 46.0f, 36.1503f, 46.0f, 24.0f);
        this.f30626c.cubicTo(46.0f, 11.8497f, 36.1503f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(11.8497f, 2.0f, 2.0f, 11.8497f, 2.0f, 24.0f);
        this.f30626c.cubicTo(2.0f, 36.1503f, 11.8497f, 46.0f, 24.0f, 46.0f);
        this.f30626c.close();
        this.f30626c.moveTo(15.1466f, 30.7323f);
        this.f30626c.lineTo(21.8788f, 24.0001f);
        this.f30626c.lineTo(15.1466f, 17.2679f);
        this.f30626c.cubicTo(14.756f, 16.8774f, 14.756f, 16.2442f, 15.1466f, 15.8537f);
        this.f30626c.lineTo(15.8537f, 15.1466f);
        this.f30626c.cubicTo(16.2442f, 14.756f, 16.8774f, 14.756f, 17.2679f, 15.1466f);
        this.f30626c.lineTo(24.0001f, 21.8788f);
        this.f30626c.lineTo(30.7323f, 15.1466f);
        this.f30626c.cubicTo(31.1229f, 14.756f, 31.756f, 14.756f, 32.1466f, 15.1466f);
        this.f30626c.lineTo(32.8537f, 15.8537f);
        this.f30626c.cubicTo(33.2442f, 16.2442f, 33.2442f, 16.8774f, 32.8537f, 17.2679f);
        this.f30626c.lineTo(26.1214f, 24.0001f);
        this.f30626c.lineTo(32.8537f, 30.7323f);
        this.f30626c.cubicTo(33.2442f, 31.1229f, 33.2442f, 31.756f, 32.8537f, 32.1466f);
        this.f30626c.lineTo(32.1466f, 32.8537f);
        this.f30626c.cubicTo(31.756f, 33.2442f, 31.1229f, 33.2442f, 30.7323f, 32.8537f);
        this.f30626c.lineTo(24.0001f, 26.1214f);
        this.f30626c.lineTo(17.2679f, 32.8537f);
        this.f30626c.cubicTo(16.8774f, 33.2442f, 16.2442f, 33.2442f, 15.8537f, 32.8537f);
        this.f30626c.lineTo(15.1466f, 32.1466f);
        this.f30626c.cubicTo(14.756f, 31.756f, 14.756f, 31.1229f, 15.1466f, 30.7323f);
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
