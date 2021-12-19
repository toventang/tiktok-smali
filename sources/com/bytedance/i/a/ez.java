package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ez extends a {
    static {
        Covode.recordClassIndex(18270);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(22.5858f, 32.4142f);
        this.f30626c.lineTo(8.29289f, 18.1213f);
        this.f30626c.cubicTo(7.90237f, 17.7308f, 7.90237f, 17.0976f, 8.29289f, 16.7071f);
        this.f30626c.lineTo(9.70711f, 15.2929f);
        this.f30626c.cubicTo(10.0976f, 14.9024f, 10.7308f, 14.9024f, 11.1213f, 15.2929f);
        this.f30626c.lineTo(24.0f, 28.1716f);
        this.f30626c.lineTo(36.8787f, 15.2929f);
        this.f30626c.cubicTo(37.2692f, 14.9024f, 37.9024f, 14.9024f, 38.2929f, 15.2929f);
        this.f30626c.lineTo(39.7071f, 16.7071f);
        this.f30626c.cubicTo(40.0976f, 17.0976f, 40.0976f, 17.7308f, 39.7071f, 18.1213f);
        this.f30626c.lineTo(25.4142f, 32.4142f);
        this.f30626c.cubicTo(24.6332f, 33.1953f, 23.3668f, 33.1953f, 22.5858f, 32.4142f);
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
