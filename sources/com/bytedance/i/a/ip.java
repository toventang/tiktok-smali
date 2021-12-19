package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ip extends a {
    static {
        Covode.recordClassIndex(18368);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(9.02211f, 21.1786f);
        this.f30626c.cubicTo(9.44856f, 13.2763f, 15.9913f, 7.0f, 24.0f, 7.0f);
        this.f30626c.cubicTo(32.0087f, 7.0f, 38.5514f, 13.2763f, 38.9779f, 21.1786f);
        this.f30626c.cubicTo(37.8243f, 21.5966f, 37.0f, 22.7021f, 37.0f, 24.0f);
        this.f30626c.lineTo(37.0f, 29.0f);
        this.f30626c.cubicTo(37.0f, 29.7454f, 37.2718f, 30.4273f, 37.7218f, 30.952f);
        this.f30626c.lineTo(35.1195f, 37.718f);
        this.f30626c.cubicTo(34.8224f, 38.4903f, 34.0803f, 39.0f, 33.2528f, 39.0f);
        this.f30626c.lineTo(29.5987f, 39.0f);
        this.f30626c.cubicTo(29.0799f, 38.1033f, 28.1104f, 37.5f, 27.0f, 37.5f);
        this.f30626c.lineTo(21.0f, 37.5f);
        this.f30626c.cubicTo(19.3431f, 37.5f, 18.0f, 38.8431f, 18.0f, 40.5f);
        this.f30626c.lineTo(18.0f, 41.5f);
        this.f30626c.cubicTo(18.0f, 43.1569f, 19.3431f, 44.5f, 21.0f, 44.5f);
        this.f30626c.lineTo(27.0f, 44.5f);
        this.f30626c.cubicTo(28.1104f, 44.5f, 29.0799f, 43.8967f, 29.5987f, 43.0f);
        this.f30626c.lineTo(33.2528f, 43.0f);
        this.f30626c.cubicTo(35.7354f, 43.0f, 37.9617f, 41.471f, 38.8529f, 39.1539f);
        this.f30626c.lineTo(41.6044f, 32.0f);
        this.f30626c.lineTo(42.0f, 32.0f);
        this.f30626c.cubicTo(43.6569f, 32.0f, 45.0f, 30.6569f, 45.0f, 29.0f);
        this.f30626c.lineTo(45.0f, 24.0f);
        this.f30626c.cubicTo(45.0f, 22.687f, 44.1566f, 21.5711f, 42.982f, 21.1644f);
        this.f30626c.cubicTo(42.5446f, 11.0587f, 34.2134f, 3.0f, 24.0f, 3.0f);
        this.f30626c.cubicTo(13.7866f, 3.0f, 5.45537f, 11.0587f, 5.01804f, 21.1644f);
        this.f30626c.cubicTo(3.84344f, 21.5711f, 3.0f, 22.687f, 3.0f, 24.0f);
        this.f30626c.lineTo(3.0f, 29.0f);
        this.f30626c.cubicTo(3.0f, 30.6569f, 4.34315f, 32.0f, 6.0f, 32.0f);
        this.f30626c.lineTo(8.0f, 32.0f);
        this.f30626c.cubicTo(9.65685f, 32.0f, 11.0f, 30.6569f, 11.0f, 29.0f);
        this.f30626c.lineTo(11.0f, 24.0f);
        this.f30626c.cubicTo(11.0f, 22.7021f, 10.1757f, 21.5966f, 9.02211f, 21.1786f);
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
