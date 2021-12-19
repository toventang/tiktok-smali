package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fh extends a {
    static {
        Covode.recordClassIndex(18279);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(43.4142f, 22.5858f);
        this.f30626c.lineTo(27.1213f, 6.29289f);
        this.f30626c.cubicTo(26.7308f, 5.90237f, 26.0976f, 5.90237f, 25.7071f, 6.29289f);
        this.f30626c.lineTo(24.2929f, 7.70711f);
        this.f30626c.cubicTo(23.9024f, 8.09763f, 23.9024f, 8.7308f, 24.2929f, 9.12132f);
        this.f30626c.lineTo(39.1716f, 24.0f);
        this.f30626c.lineTo(24.2929f, 38.8787f);
        this.f30626c.cubicTo(23.9024f, 39.2692f, 23.9024f, 39.9024f, 24.2929f, 40.2929f);
        this.f30626c.lineTo(25.7071f, 41.7071f);
        this.f30626c.cubicTo(26.0976f, 42.0976f, 26.7308f, 42.0976f, 27.1213f, 41.7071f);
        this.f30626c.lineTo(43.4142f, 25.4142f);
        this.f30626c.cubicTo(44.1953f, 24.6332f, 44.1953f, 23.3668f, 43.4142f, 22.5858f);
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
