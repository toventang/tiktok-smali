package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hn extends a {
    static {
        Covode.recordClassIndex(18339);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(20.5522f, 6.91656f);
        this.f30626c.cubicTo(22.0988f, 4.28733f, 25.9011f, 4.28734f, 27.4477f, 6.91656f);
        this.f30626c.lineTo(43.9509f, 34.9719f);
        this.f30626c.cubicTo(45.5194f, 37.6385f, 43.5968f, 41.0f, 40.5031f, 41.0f);
        this.f30626c.lineTo(7.49679f, 41.0f);
        this.f30626c.cubicTo(4.40313f, 41.0f, 2.48051f, 37.6385f, 4.04906f, 34.9719f);
        this.f30626c.lineTo(20.5522f, 6.91656f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 8.94464f);
        this.f30626c.lineTo(7.49679f, 37.0f);
        this.f30626c.lineTo(40.5031f, 37.0f);
        this.f30626c.lineTo(24.0f, 8.94464f);
        this.f30626c.close();
        this.f30626c.moveTo(22.0f, 18.0f);
        this.f30626c.cubicTo(22.0f, 17.4477f, 22.4477f, 17.0f, 23.0f, 17.0f);
        this.f30626c.lineTo(25.0f, 17.0f);
        this.f30626c.cubicTo(25.5522f, 17.0f, 26.0f, 17.4477f, 26.0f, 18.0f);
        this.f30626c.lineTo(26.0f, 27.0f);
        this.f30626c.cubicTo(26.0f, 27.5523f, 25.5522f, 28.0f, 25.0f, 28.0f);
        this.f30626c.lineTo(23.0f, 28.0f);
        this.f30626c.cubicTo(22.4477f, 28.0f, 22.0f, 27.5523f, 22.0f, 27.0f);
        this.f30626c.lineTo(22.0f, 18.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 35.0f);
        this.f30626c.cubicTo(25.3807f, 35.0f, 26.5f, 33.8807f, 26.5f, 32.5f);
        this.f30626c.cubicTo(26.5f, 31.1193f, 25.3807f, 30.0f, 24.0f, 30.0f);
        this.f30626c.cubicTo(22.6192f, 30.0f, 21.5f, 31.1193f, 21.5f, 32.5f);
        this.f30626c.cubicTo(21.5f, 33.8807f, 22.6192f, 35.0f, 24.0f, 35.0f);
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
