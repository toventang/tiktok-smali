package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ex extends a {
    static {
        Covode.recordClassIndex(18268);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(17.1099f, 6.60898f);
        this.f30626c.cubicTo(15.7038f, 6.60898f, 14.4863f, 7.58557f, 14.1813f, 8.95819f);
        this.f30626c.lineTo(13.6777f, 11.2244f);
        this.f30626c.lineTo(8.0f, 11.2244f);
        this.f30626c.cubicTo(4.68629f, 11.2244f, 2.0f, 13.9107f, 2.0f, 17.2244f);
        this.f30626c.lineTo(2.0f, 35.891f);
        this.f30626c.cubicTo(2.0f, 39.2047f, 4.68629f, 41.891f, 8.0f, 41.891f);
        this.f30626c.lineTo(40.0f, 41.891f);
        this.f30626c.cubicTo(43.3137f, 41.891f, 46.0f, 39.2047f, 46.0f, 35.891f);
        this.f30626c.lineTo(46.0f, 17.2244f);
        this.f30626c.cubicTo(46.0f, 13.9106f, 43.3137f, 11.2244f, 40.0f, 11.2244f);
        this.f30626c.lineTo(34.3223f, 11.2244f);
        this.f30626c.lineTo(33.8187f, 8.95819f);
        this.f30626c.cubicTo(33.5137f, 7.58558f, 32.2962f, 6.60898f, 30.8901f, 6.60898f);
        this.f30626c.lineTo(17.1099f, 6.60898f);
        this.f30626c.close();
        this.f30626c.moveTo(17.4084f, 12.8752f);
        this.f30626c.lineTo(17.912f, 10.609f);
        this.f30626c.lineTo(30.088f, 10.609f);
        this.f30626c.lineTo(30.5916f, 12.8752f);
        this.f30626c.cubicTo(30.8966f, 14.2478f, 32.114f, 15.2244f, 33.5201f, 15.2244f);
        this.f30626c.lineTo(40.0f, 15.2244f);
        this.f30626c.cubicTo(41.1046f, 15.2244f, 42.0f, 16.1198f, 42.0f, 17.2244f);
        this.f30626c.lineTo(42.0f, 35.891f);
        this.f30626c.cubicTo(42.0f, 36.9956f, 41.1046f, 37.891f, 40.0f, 37.891f);
        this.f30626c.lineTo(8.0f, 37.891f);
        this.f30626c.cubicTo(6.89543f, 37.891f, 6.0f, 36.9956f, 6.0f, 35.891f);
        this.f30626c.lineTo(6.0f, 17.2244f);
        this.f30626c.cubicTo(6.0f, 16.1198f, 6.89543f, 15.2244f, 8.0f, 15.2244f);
        this.f30626c.lineTo(14.4799f, 15.2244f);
        this.f30626c.cubicTo(15.886f, 15.2244f, 17.1034f, 14.2478f, 17.4084f, 12.8752f);
        this.f30626c.close();
        this.f30626c.moveTo(19.0f, 26.0f);
        this.f30626c.cubicTo(19.0f, 23.2386f, 21.2386f, 21.0f, 24.0f, 21.0f);
        this.f30626c.cubicTo(26.7614f, 21.0f, 29.0f, 23.2386f, 29.0f, 26.0f);
        this.f30626c.cubicTo(29.0f, 28.7614f, 26.7614f, 31.0f, 24.0f, 31.0f);
        this.f30626c.cubicTo(21.2386f, 31.0f, 19.0f, 28.7614f, 19.0f, 26.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 17.0f);
        this.f30626c.cubicTo(19.0294f, 17.0f, 15.0f, 21.0294f, 15.0f, 26.0f);
        this.f30626c.cubicTo(15.0f, 30.9706f, 19.0294f, 35.0f, 24.0f, 35.0f);
        this.f30626c.cubicTo(28.9706f, 35.0f, 33.0f, 30.9706f, 33.0f, 26.0f);
        this.f30626c.cubicTo(33.0f, 21.0294f, 28.9706f, 17.0f, 24.0f, 17.0f);
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
