package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kv extends a {
    static {
        Covode.recordClassIndex(18428);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 6.0f);
        this.f30626c.cubicTo(20.134f, 6.0f, 17.0f, 9.13401f, 17.0f, 13.0f);
        this.f30626c.lineTo(17.0f, 17.0f);
        this.f30626c.lineTo(31.0f, 17.0f);
        this.f30626c.lineTo(31.0f, 13.0f);
        this.f30626c.cubicTo(31.0f, 9.13401f, 27.866f, 6.0f, 24.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.moveTo(35.0f, 17.0f);
        this.f30626c.lineTo(35.0f, 13.0f);
        this.f30626c.cubicTo(35.0f, 6.92487f, 30.0751f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(17.9249f, 2.0f, 13.0f, 6.92487f, 13.0f, 13.0f);
        this.f30626c.lineTo(13.0f, 17.0f);
        this.f30626c.lineTo(12.0f, 17.0f);
        this.f30626c.cubicTo(8.68629f, 17.0f, 6.0f, 19.6863f, 6.0f, 23.0f);
        this.f30626c.lineTo(6.0f, 39.0f);
        this.f30626c.cubicTo(6.0f, 42.3137f, 8.68629f, 45.0f, 12.0f, 45.0f);
        this.f30626c.lineTo(36.0f, 45.0f);
        this.f30626c.cubicTo(39.3137f, 45.0f, 42.0f, 42.3137f, 42.0f, 39.0f);
        this.f30626c.lineTo(42.0f, 23.0f);
        this.f30626c.cubicTo(42.0f, 19.6863f, 39.3137f, 17.0f, 36.0f, 17.0f);
        this.f30626c.lineTo(35.0f, 17.0f);
        this.f30626c.close();
        this.f30626c.moveTo(12.0f, 21.0f);
        this.f30626c.cubicTo(10.8954f, 21.0f, 10.0f, 21.8954f, 10.0f, 23.0f);
        this.f30626c.lineTo(10.0f, 39.0f);
        this.f30626c.cubicTo(10.0f, 40.1046f, 10.8954f, 41.0f, 12.0f, 41.0f);
        this.f30626c.lineTo(36.0f, 41.0f);
        this.f30626c.cubicTo(37.1046f, 41.0f, 38.0f, 40.1046f, 38.0f, 39.0f);
        this.f30626c.lineTo(38.0f, 23.0f);
        this.f30626c.cubicTo(38.0f, 21.8954f, 37.1046f, 21.0f, 36.0f, 21.0f);
        this.f30626c.lineTo(12.0f, 21.0f);
        this.f30626c.close();
        this.f30626c.moveTo(26.0f, 32.4649f);
        this.f30626c.cubicTo(27.1956f, 31.7733f, 28.0f, 30.4806f, 28.0f, 29.0f);
        this.f30626c.cubicTo(28.0f, 26.7909f, 26.2091f, 25.0f, 24.0f, 25.0f);
        this.f30626c.cubicTo(21.7909f, 25.0f, 20.0f, 26.7909f, 20.0f, 29.0f);
        this.f30626c.cubicTo(20.0f, 30.4806f, 20.8044f, 31.7733f, 22.0f, 32.4649f);
        this.f30626c.lineTo(22.0f, 37.0f);
        this.f30626c.cubicTo(22.0f, 37.5523f, 22.4477f, 38.0f, 23.0f, 38.0f);
        this.f30626c.lineTo(25.0f, 38.0f);
        this.f30626c.cubicTo(25.5523f, 38.0f, 26.0f, 37.5523f, 26.0f, 37.0f);
        this.f30626c.lineTo(26.0f, 32.4649f);
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
