package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ca extends a {
    static {
        Covode.recordClassIndex(18191);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.1817f, 1.57551f);
        this.f30626c.cubicTo(23.6712f, 0.923054f, 22.7285f, 0.807963f, 22.076f, 1.31845f);
        this.f30626c.cubicTo(21.4236f, 1.82893f, 21.3085f, 2.77168f, 21.8189f, 3.42413f);
        this.f30626c.lineTo(25.0288f, 7.52676f);
        this.f30626c.cubicTo(24.688f, 7.50902f, 24.345f, 7.50005f, 24.0f, 7.50005f);
        this.f30626c.cubicTo(13.2304f, 7.50005f, 4.5f, 16.2305f, 4.5f, 27.0f);
        this.f30626c.cubicTo(4.5f, 37.7696f, 13.2304f, 46.5f, 24.0f, 46.5f);
        this.f30626c.cubicTo(34.7696f, 46.5f, 43.5f, 37.7696f, 43.5f, 27.0f);
        this.f30626c.cubicTo(43.5f, 26.1716f, 42.8284f, 25.5f, 42.0f, 25.5f);
        this.f30626c.cubicTo(41.1716f, 25.5f, 40.5f, 26.1716f, 40.5f, 27.0f);
        this.f30626c.cubicTo(40.5f, 36.1127f, 33.1127f, 43.5f, 24.0f, 43.5f);
        this.f30626c.cubicTo(14.8873f, 43.5f, 7.5f, 36.1127f, 7.5f, 27.0f);
        this.f30626c.cubicTo(7.5f, 17.8873f, 14.8873f, 10.5f, 24.0f, 10.5f);
        this.f30626c.cubicTo(24.346f, 10.5f, 24.6893f, 10.5107f, 25.0298f, 10.5316f);
        this.f30626c.lineTo(20.9637f, 14.4154f);
        this.f30626c.cubicTo(20.3646f, 14.9877f, 20.3429f, 15.9372f, 20.9151f, 16.5362f);
        this.f30626c.cubicTo(21.4873f, 17.1353f, 22.4368f, 17.157f, 23.0358f, 16.5848f);
        this.f30626c.lineTo(29.2986f, 10.6028f);
        this.f30626c.cubicTo(29.9307f, 9.99906f, 30.0019f, 9.01437f, 29.4633f, 8.32594f);
        this.f30626c.lineTo(24.1817f, 1.57551f);
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
