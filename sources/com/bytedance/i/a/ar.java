package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ar extends a {
    static {
        Covode.recordClassIndex(18154);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(5.0f, 11.0f);
        this.f30626c.cubicTo(5.0f, 10.4477f, 5.44772f, 10.0f, 6.0f, 10.0f);
        this.f30626c.lineTo(42.0f, 10.0f);
        this.f30626c.cubicTo(42.5523f, 10.0f, 43.0f, 10.4477f, 43.0f, 11.0f);
        this.f30626c.lineTo(43.0f, 13.0f);
        this.f30626c.cubicTo(43.0f, 13.5523f, 42.5523f, 14.0f, 42.0f, 14.0f);
        this.f30626c.lineTo(6.0f, 14.0f);
        this.f30626c.cubicTo(5.44772f, 14.0f, 5.0f, 13.5523f, 5.0f, 13.0f);
        this.f30626c.lineTo(5.0f, 11.0f);
        this.f30626c.close();
        this.f30626c.moveTo(5.0f, 23.0f);
        this.f30626c.cubicTo(5.0f, 22.4477f, 5.44772f, 22.0f, 6.0f, 22.0f);
        this.f30626c.lineTo(42.0f, 22.0f);
        this.f30626c.cubicTo(42.5523f, 22.0f, 43.0f, 22.4477f, 43.0f, 23.0f);
        this.f30626c.lineTo(43.0f, 25.0f);
        this.f30626c.cubicTo(43.0f, 25.5523f, 42.5523f, 26.0f, 42.0f, 26.0f);
        this.f30626c.lineTo(6.0f, 26.0f);
        this.f30626c.cubicTo(5.44771f, 26.0f, 5.0f, 25.5523f, 5.0f, 25.0f);
        this.f30626c.lineTo(5.0f, 23.0f);
        this.f30626c.close();
        this.f30626c.moveTo(6.0f, 34.0f);
        this.f30626c.cubicTo(5.44772f, 34.0f, 5.0f, 34.4477f, 5.0f, 35.0f);
        this.f30626c.lineTo(5.0f, 37.0f);
        this.f30626c.cubicTo(5.0f, 37.5523f, 5.44772f, 38.0f, 6.0f, 38.0f);
        this.f30626c.lineTo(42.0f, 38.0f);
        this.f30626c.cubicTo(42.5523f, 38.0f, 43.0f, 37.5523f, 43.0f, 37.0f);
        this.f30626c.lineTo(43.0f, 35.0f);
        this.f30626c.cubicTo(43.0f, 34.4477f, 42.5523f, 34.0f, 42.0f, 34.0f);
        this.f30626c.lineTo(6.0f, 34.0f);
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
