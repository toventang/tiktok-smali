package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class de extends a {
    static {
        Covode.recordClassIndex(18222);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(4.58579f, 22.5858f);
        this.f30626c.lineTo(20.8787f, 6.29289f);
        this.f30626c.cubicTo(21.2692f, 5.90237f, 21.9024f, 5.90237f, 22.2929f, 6.29289f);
        this.f30626c.lineTo(23.7071f, 7.70711f);
        this.f30626c.cubicTo(24.0976f, 8.09763f, 24.0976f, 8.7308f, 23.7071f, 9.12132f);
        this.f30626c.lineTo(10.8284f, 22.0f);
        this.f30626c.lineTo(39.0f, 22.0f);
        this.f30626c.cubicTo(39.5523f, 22.0f, 40.0f, 22.4477f, 40.0f, 23.0f);
        this.f30626c.lineTo(40.0f, 25.0f);
        this.f30626c.cubicTo(40.0f, 25.5523f, 39.5523f, 26.0f, 39.0f, 26.0f);
        this.f30626c.lineTo(10.8284f, 26.0f);
        this.f30626c.lineTo(23.7071f, 38.8787f);
        this.f30626c.cubicTo(24.0976f, 39.2692f, 24.0976f, 39.9024f, 23.7071f, 40.2929f);
        this.f30626c.lineTo(22.2929f, 41.7071f);
        this.f30626c.cubicTo(21.9024f, 42.0976f, 21.2692f, 42.0976f, 20.8787f, 41.7071f);
        this.f30626c.lineTo(4.58579f, 25.4142f);
        this.f30626c.cubicTo(3.80474f, 24.6332f, 3.80474f, 23.3668f, 4.58579f, 22.5858f);
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
