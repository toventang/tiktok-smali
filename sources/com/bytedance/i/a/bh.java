package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bh extends a {
    static {
        Covode.recordClassIndex(18171);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 7.5f);
        this.f30626c.cubicTo(14.8873f, 7.5f, 7.5f, 14.8873f, 7.5f, 24.0f);
        this.f30626c.cubicTo(7.5f, 33.1127f, 14.8873f, 40.5f, 24.0f, 40.5f);
        this.f30626c.cubicTo(33.1127f, 40.5f, 40.5f, 33.1127f, 40.5f, 24.0f);
        this.f30626c.cubicTo(40.5f, 14.8873f, 33.1127f, 7.5f, 24.0f, 7.5f);
        this.f30626c.close();
        this.f30626c.moveTo(4.5f, 24.0f);
        this.f30626c.cubicTo(4.5f, 13.2304f, 13.2304f, 4.5f, 24.0f, 4.5f);
        this.f30626c.cubicTo(34.7696f, 4.5f, 43.5f, 13.2304f, 43.5f, 24.0f);
        this.f30626c.cubicTo(43.5f, 34.7696f, 34.7696f, 43.5f, 24.0f, 43.5f);
        this.f30626c.cubicTo(13.2304f, 43.5f, 4.5f, 34.7696f, 4.5f, 24.0f);
        this.f30626c.close();
        this.f30626c.moveTo(22.5f, 14.5f);
        this.f30626c.cubicTo(22.5f, 14.2239f, 22.7239f, 14.0f, 23.0f, 14.0f);
        this.f30626c.lineTo(25.0f, 14.0f);
        this.f30626c.cubicTo(25.2761f, 14.0f, 25.5f, 14.2239f, 25.5f, 14.5f);
        this.f30626c.lineTo(25.5f, 27.5f);
        this.f30626c.cubicTo(25.5f, 27.7761f, 25.2761f, 28.0f, 25.0f, 28.0f);
        this.f30626c.lineTo(23.0f, 28.0f);
        this.f30626c.cubicTo(22.7239f, 28.0f, 22.5f, 27.7761f, 22.5f, 27.5f);
        this.f30626c.lineTo(22.5f, 14.5f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 30.0f);
        this.f30626c.cubicTo(23.1716f, 30.0f, 22.5f, 30.6716f, 22.5f, 31.5f);
        this.f30626c.lineTo(22.5f, 32.5f);
        this.f30626c.cubicTo(22.5f, 33.3284f, 23.1716f, 34.0f, 24.0f, 34.0f);
        this.f30626c.cubicTo(24.8284f, 34.0f, 25.5f, 33.3284f, 25.5f, 32.5f);
        this.f30626c.lineTo(25.5f, 31.5f);
        this.f30626c.cubicTo(25.5f, 30.6716f, 24.8284f, 30.0f, 24.0f, 30.0f);
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
