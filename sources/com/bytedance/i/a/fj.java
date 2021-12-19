package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fj extends a {
    static {
        Covode.recordClassIndex(18281);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(25.4142f, 15.5858f);
        this.f30626c.lineTo(39.7071f, 29.8787f);
        this.f30626c.cubicTo(40.0976f, 30.2692f, 40.0976f, 30.9024f, 39.7071f, 31.2929f);
        this.f30626c.lineTo(38.2929f, 32.7071f);
        this.f30626c.cubicTo(37.9024f, 33.0976f, 37.2692f, 33.0976f, 36.8787f, 32.7071f);
        this.f30626c.lineTo(24.0f, 19.8284f);
        this.f30626c.lineTo(11.1213f, 32.7071f);
        this.f30626c.cubicTo(10.7308f, 33.0976f, 10.0976f, 33.0976f, 9.70711f, 32.7071f);
        this.f30626c.lineTo(8.29289f, 31.2929f);
        this.f30626c.cubicTo(7.90237f, 30.9024f, 7.90237f, 30.2692f, 8.29289f, 29.8787f);
        this.f30626c.lineTo(22.5858f, 15.5858f);
        this.f30626c.cubicTo(23.3668f, 14.8047f, 24.6332f, 14.8047f, 25.4142f, 15.5858f);
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
