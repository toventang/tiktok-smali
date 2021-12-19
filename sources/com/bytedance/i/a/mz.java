package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mz extends a {
    static {
        Covode.recordClassIndex(18486);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(7.11641f, 22.0f);
        this.f30626c.cubicTo(8.02939f, 14.2096f, 14.2096f, 8.02939f, 22.0f, 7.11641f);
        this.f30626c.lineTo(22.0f, 3.0f);
        this.f30626c.cubicTo(22.0f, 2.44772f, 22.4477f, 2.0f, 23.0f, 2.0f);
        this.f30626c.lineTo(25.0f, 2.0f);
        this.f30626c.cubicTo(25.5523f, 2.0f, 26.0f, 2.44771f, 26.0f, 3.0f);
        this.f30626c.lineTo(26.0f, 7.11641f);
        this.f30626c.cubicTo(33.7904f, 8.02939f, 39.9706f, 14.2096f, 40.8836f, 22.0f);
        this.f30626c.lineTo(45.0f, 22.0f);
        this.f30626c.cubicTo(45.5523f, 22.0f, 46.0f, 22.4477f, 46.0f, 23.0f);
        this.f30626c.lineTo(46.0f, 25.0f);
        this.f30626c.cubicTo(46.0f, 25.5523f, 45.5523f, 26.0f, 45.0f, 26.0f);
        this.f30626c.lineTo(40.8836f, 26.0f);
        this.f30626c.cubicTo(39.9706f, 33.7904f, 33.7904f, 39.9706f, 26.0f, 40.8836f);
        this.f30626c.lineTo(26.0f, 45.0f);
        this.f30626c.cubicTo(26.0f, 45.5523f, 25.5523f, 46.0f, 25.0f, 46.0f);
        this.f30626c.lineTo(23.0f, 46.0f);
        this.f30626c.cubicTo(22.4477f, 46.0f, 22.0f, 45.5523f, 22.0f, 45.0f);
        this.f30626c.lineTo(22.0f, 40.8836f);
        this.f30626c.cubicTo(14.2096f, 39.9706f, 8.02939f, 33.7904f, 7.11641f, 26.0f);
        this.f30626c.lineTo(3.0f, 26.0f);
        this.f30626c.cubicTo(2.44772f, 26.0f, 2.0f, 25.5523f, 2.0f, 25.0f);
        this.f30626c.lineTo(2.0f, 23.0f);
        this.f30626c.cubicTo(2.0f, 22.4477f, 2.44771f, 22.0f, 3.0f, 22.0f);
        this.f30626c.lineTo(7.11641f, 22.0f);
        this.f30626c.close();
        this.f30626c.moveTo(11.0f, 24.0f);
        this.f30626c.cubicTo(11.0f, 16.8203f, 16.8203f, 11.0f, 24.0f, 11.0f);
        this.f30626c.cubicTo(31.1797f, 11.0f, 37.0f, 16.8203f, 37.0f, 24.0f);
        this.f30626c.cubicTo(37.0f, 31.1797f, 31.1797f, 37.0f, 24.0f, 37.0f);
        this.f30626c.cubicTo(16.8203f, 37.0f, 11.0f, 31.1797f, 11.0f, 24.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 29.0f);
        this.f30626c.cubicTo(26.7614f, 29.0f, 29.0f, 26.7614f, 29.0f, 24.0f);
        this.f30626c.cubicTo(29.0f, 21.2386f, 26.7614f, 19.0f, 24.0f, 19.0f);
        this.f30626c.cubicTo(21.2386f, 19.0f, 19.0f, 21.2386f, 19.0f, 24.0f);
        this.f30626c.cubicTo(19.0f, 26.7614f, 21.2386f, 29.0f, 24.0f, 29.0f);
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
