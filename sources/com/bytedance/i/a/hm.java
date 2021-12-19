package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hm extends a {
    static {
        Covode.recordClassIndex(18338);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(2.0f, 24.0f);
        this.f30626c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f30626c.cubicTo(46.0f, 36.1503f, 36.1503f, 46.0f, 24.0f, 46.0f);
        this.f30626c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f30626c.close();
        this.f30626c.moveTo(21.0f, 13.0f);
        this.f30626c.cubicTo(21.0f, 12.4477f, 21.4477f, 12.0f, 22.0f, 12.0f);
        this.f30626c.lineTo(26.0f, 12.0f);
        this.f30626c.cubicTo(26.5523f, 12.0f, 27.0f, 12.4477f, 27.0f, 13.0f);
        this.f30626c.lineTo(27.0f, 25.0f);
        this.f30626c.cubicTo(27.0f, 25.5523f, 26.5523f, 26.0f, 26.0f, 26.0f);
        this.f30626c.lineTo(22.0f, 26.0f);
        this.f30626c.cubicTo(21.4477f, 26.0f, 21.0f, 25.5523f, 21.0f, 25.0f);
        this.f30626c.lineTo(21.0f, 13.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 37.0f);
        this.f30626c.cubicTo(25.933f, 37.0f, 27.5f, 35.433f, 27.5f, 33.5f);
        this.f30626c.cubicTo(27.5f, 31.567f, 25.933f, 30.0f, 24.0f, 30.0f);
        this.f30626c.cubicTo(22.067f, 30.0f, 20.5f, 31.567f, 20.5f, 33.5f);
        this.f30626c.cubicTo(20.5f, 35.433f, 22.067f, 37.0f, 24.0f, 37.0f);
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
