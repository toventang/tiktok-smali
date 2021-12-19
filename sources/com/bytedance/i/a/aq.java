package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class aq extends a {
    static {
        Covode.recordClassIndex(18153);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 13.0f);
        this.f30626c.cubicTo(8.0f, 12.4477f, 8.44772f, 12.0f, 9.0f, 12.0f);
        this.f30626c.lineTo(39.0f, 12.0f);
        this.f30626c.cubicTo(39.5523f, 12.0f, 40.0f, 12.4477f, 40.0f, 13.0f);
        this.f30626c.lineTo(40.0f, 15.0f);
        this.f30626c.cubicTo(40.0f, 15.5523f, 39.5523f, 16.0f, 39.0f, 16.0f);
        this.f30626c.lineTo(9.0f, 16.0f);
        this.f30626c.cubicTo(8.44772f, 16.0f, 8.0f, 15.5523f, 8.0f, 15.0f);
        this.f30626c.lineTo(8.0f, 13.0f);
        this.f30626c.close();
        this.f30626c.moveTo(8.0f, 23.0f);
        this.f30626c.cubicTo(8.0f, 22.4477f, 8.44772f, 22.0f, 9.0f, 22.0f);
        this.f30626c.lineTo(39.0f, 22.0f);
        this.f30626c.cubicTo(39.5523f, 22.0f, 40.0f, 22.4477f, 40.0f, 23.0f);
        this.f30626c.lineTo(40.0f, 25.0f);
        this.f30626c.cubicTo(40.0f, 25.5523f, 39.5523f, 26.0f, 39.0f, 26.0f);
        this.f30626c.lineTo(9.0f, 26.0f);
        this.f30626c.cubicTo(8.44771f, 26.0f, 8.0f, 25.5523f, 8.0f, 25.0f);
        this.f30626c.lineTo(8.0f, 23.0f);
        this.f30626c.close();
        this.f30626c.moveTo(9.0f, 32.0f);
        this.f30626c.cubicTo(8.44772f, 32.0f, 8.0f, 32.4477f, 8.0f, 33.0f);
        this.f30626c.lineTo(8.0f, 35.0f);
        this.f30626c.cubicTo(8.0f, 35.5523f, 8.44772f, 36.0f, 9.0f, 36.0f);
        this.f30626c.lineTo(39.0f, 36.0f);
        this.f30626c.cubicTo(39.5523f, 36.0f, 40.0f, 35.5523f, 40.0f, 35.0f);
        this.f30626c.lineTo(40.0f, 33.0f);
        this.f30626c.cubicTo(40.0f, 32.4477f, 39.5523f, 32.0f, 39.0f, 32.0f);
        this.f30626c.lineTo(9.0f, 32.0f);
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
