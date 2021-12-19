package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fi extends a {
    static {
        Covode.recordClassIndex(18280);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(38.1716f, 24.0f);
        this.f30626c.lineTo(24.7929f, 10.6213f);
        this.f30626c.cubicTo(24.4024f, 10.2308f, 24.4024f, 9.59763f, 24.7929f, 9.20711f);
        this.f30626c.lineTo(26.2071f, 7.79289f);
        this.f30626c.cubicTo(26.5976f, 7.40237f, 27.2308f, 7.40237f, 27.6213f, 7.79289f);
        this.f30626c.lineTo(42.4142f, 22.5858f);
        this.f30626c.cubicTo(43.1953f, 23.3668f, 43.1953f, 24.6332f, 42.4142f, 25.4142f);
        this.f30626c.lineTo(27.6213f, 40.2071f);
        this.f30626c.cubicTo(27.2308f, 40.5976f, 26.5976f, 40.5976f, 26.2071f, 40.2071f);
        this.f30626c.lineTo(24.7929f, 38.7929f);
        this.f30626c.cubicTo(24.4024f, 38.4024f, 24.4024f, 37.7692f, 24.7929f, 37.3787f);
        this.f30626c.lineTo(38.1716f, 24.0f);
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
