package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class eg extends a {
    static {
        Covode.recordClassIndex(18251);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(46.0f, 24.0f);
        this.f30626c.cubicTo(46.0f, 36.1503f, 36.1503f, 46.0f, 24.0f, 46.0f);
        this.f30626c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f30626c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f30626c.close();
        this.f30626c.moveTo(35.2353f, 38.0638f);
        this.f30626c.cubicTo(32.156f, 40.5271f, 28.25f, 42.0f, 24.0f, 42.0f);
        this.f30626c.cubicTo(14.0589f, 42.0f, 6.0f, 33.9411f, 6.0f, 24.0f);
        this.f30626c.cubicTo(6.0f, 19.75f, 7.47293f, 15.844f, 9.93618f, 12.7647f);
        this.f30626c.lineTo(35.2353f, 38.0638f);
        this.f30626c.close();
        this.f30626c.moveTo(38.0638f, 35.2354f);
        this.f30626c.lineTo(12.7646f, 9.93623f);
        this.f30626c.cubicTo(15.8439f, 7.47296f, 19.75f, 6.0f, 24.0f, 6.0f);
        this.f30626c.cubicTo(33.9411f, 6.0f, 42.0f, 14.0589f, 42.0f, 24.0f);
        this.f30626c.cubicTo(42.0f, 28.25f, 40.527f, 32.1561f, 38.0638f, 35.2354f);
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
