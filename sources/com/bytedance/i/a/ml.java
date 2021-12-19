package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ml extends a {
    static {
        Covode.recordClassIndex(18472);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(26.0f, 7.0f);
        this.f30626c.cubicTo(26.0f, 6.44772f, 25.5523f, 6.0f, 25.0f, 6.0f);
        this.f30626c.lineTo(23.0f, 6.0f);
        this.f30626c.cubicTo(22.4477f, 6.0f, 22.0f, 6.44772f, 22.0f, 7.0f);
        this.f30626c.lineTo(22.0f, 22.0f);
        this.f30626c.lineTo(7.0f, 22.0f);
        this.f30626c.cubicTo(6.44772f, 22.0f, 6.0f, 22.4477f, 6.0f, 23.0f);
        this.f30626c.lineTo(6.0f, 25.0f);
        this.f30626c.cubicTo(6.0f, 25.5523f, 6.44772f, 26.0f, 7.0f, 26.0f);
        this.f30626c.lineTo(22.0f, 26.0f);
        this.f30626c.lineTo(22.0f, 41.0f);
        this.f30626c.cubicTo(22.0f, 41.5523f, 22.4477f, 42.0f, 23.0f, 42.0f);
        this.f30626c.lineTo(25.0f, 42.0f);
        this.f30626c.cubicTo(25.5523f, 42.0f, 26.0f, 41.5523f, 26.0f, 41.0f);
        this.f30626c.lineTo(26.0f, 26.0f);
        this.f30626c.lineTo(41.0f, 26.0f);
        this.f30626c.cubicTo(41.5523f, 26.0f, 42.0f, 25.5523f, 42.0f, 25.0f);
        this.f30626c.lineTo(42.0f, 23.0f);
        this.f30626c.cubicTo(42.0f, 22.4477f, 41.5523f, 22.0f, 41.0f, 22.0f);
        this.f30626c.lineTo(26.0f, 22.0f);
        this.f30626c.lineTo(26.0f, 7.0f);
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
