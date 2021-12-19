package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ie extends a {
    static {
        Covode.recordClassIndex(18357);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 10.0f);
        this.f30626c.cubicTo(7.44772f, 10.0f, 7.0f, 10.4477f, 7.0f, 11.0f);
        this.f30626c.lineTo(7.0f, 37.0f);
        this.f30626c.cubicTo(7.0f, 37.5523f, 7.44772f, 38.0f, 8.0f, 38.0f);
        this.f30626c.lineTo(40.0f, 38.0f);
        this.f30626c.cubicTo(40.5523f, 38.0f, 41.0f, 37.5523f, 41.0f, 37.0f);
        this.f30626c.lineTo(41.0f, 16.0f);
        this.f30626c.cubicTo(41.0f, 15.4477f, 40.5523f, 15.0f, 40.0f, 15.0f);
        this.f30626c.lineTo(24.0f, 15.0f);
        this.f30626c.lineTo(22.6459f, 15.0f);
        this.f30626c.lineTo(22.143f, 13.7428f);
        this.f30626c.lineTo(20.8974f, 10.6286f);
        this.f30626c.cubicTo(20.7455f, 10.249f, 20.3778f, 10.0f, 19.9689f, 10.0f);
        this.f30626c.lineTo(8.0f, 10.0f);
        this.f30626c.close();
        this.f30626c.moveTo(3.0f, 11.0f);
        this.f30626c.cubicTo(3.0f, 8.23858f, 5.23858f, 6.0f, 8.0f, 6.0f);
        this.f30626c.lineTo(19.9689f, 6.0f);
        this.f30626c.cubicTo(22.0134f, 6.0f, 23.852f, 7.24475f, 24.6113f, 9.14305f);
        this.f30626c.lineTo(25.3541f, 11.0f);
        this.f30626c.lineTo(40.0f, 11.0f);
        this.f30626c.cubicTo(42.7614f, 11.0f, 45.0f, 13.2386f, 45.0f, 16.0f);
        this.f30626c.lineTo(45.0f, 37.0f);
        this.f30626c.cubicTo(45.0f, 39.7614f, 42.7614f, 42.0f, 40.0f, 42.0f);
        this.f30626c.lineTo(8.0f, 42.0f);
        this.f30626c.cubicTo(5.23858f, 42.0f, 3.0f, 39.7614f, 3.0f, 37.0f);
        this.f30626c.lineTo(3.0f, 11.0f);
        this.f30626c.close();
        this.f30626c.moveTo(25.0f, 18.0f);
        this.f30626c.cubicTo(25.5523f, 18.0f, 26.0f, 18.4477f, 26.0f, 19.0f);
        this.f30626c.lineTo(26.0f, 27.6201f);
        this.f30626c.lineTo(29.4345f, 24.6436f);
        this.f30626c.cubicTo(29.8518f, 24.2819f, 30.4834f, 24.327f, 30.8451f, 24.7443f);
        this.f30626c.lineTo(32.1549f, 26.2557f);
        this.f30626c.cubicTo(32.5166f, 26.6731f, 32.4715f, 27.3046f, 32.0542f, 27.6663f);
        this.f30626c.lineTo(24.6549f, 34.079f);
        this.f30626c.cubicTo(24.2791f, 34.4048f, 23.7209f, 34.4048f, 23.3451f, 34.079f);
        this.f30626c.lineTo(15.9458f, 27.6663f);
        this.f30626c.cubicTo(15.5285f, 27.3046f, 15.4834f, 26.6731f, 15.8451f, 26.2557f);
        this.f30626c.lineTo(17.1549f, 24.7443f);
        this.f30626c.cubicTo(17.5166f, 24.327f, 18.1482f, 24.2819f, 18.5655f, 24.6436f);
        this.f30626c.lineTo(22.0f, 27.6201f);
        this.f30626c.lineTo(22.0f, 19.0f);
        this.f30626c.cubicTo(22.0f, 18.4477f, 22.4477f, 18.0f, 23.0f, 18.0f);
        this.f30626c.lineTo(25.0f, 18.0f);
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
