package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ix extends a {
    static {
        Covode.recordClassIndex(18376);
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
        this.f30626c.moveTo(27.0f, 16.0f);
        this.f30626c.cubicTo(27.0f, 17.6569f, 25.6569f, 19.0f, 24.0f, 19.0f);
        this.f30626c.cubicTo(22.3431f, 19.0f, 21.0f, 17.6569f, 21.0f, 16.0f);
        this.f30626c.cubicTo(21.0f, 14.3431f, 22.3431f, 13.0f, 24.0f, 13.0f);
        this.f30626c.cubicTo(25.6569f, 13.0f, 27.0f, 14.3431f, 27.0f, 16.0f);
        this.f30626c.close();
        this.f30626c.moveTo(23.0f, 22.0f);
        this.f30626c.cubicTo(22.4477f, 22.0f, 22.0f, 22.4477f, 22.0f, 23.0f);
        this.f30626c.lineTo(22.0f, 34.0f);
        this.f30626c.cubicTo(22.0f, 34.5523f, 22.4477f, 35.0f, 23.0f, 35.0f);
        this.f30626c.lineTo(25.0f, 35.0f);
        this.f30626c.cubicTo(25.5523f, 35.0f, 26.0f, 34.5523f, 26.0f, 34.0f);
        this.f30626c.lineTo(26.0f, 23.0f);
        this.f30626c.cubicTo(26.0f, 22.4477f, 25.5523f, 22.0f, 25.0f, 22.0f);
        this.f30626c.lineTo(23.0f, 22.0f);
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
