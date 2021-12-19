package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gy extends a {
    static {
        Covode.recordClassIndex(18323);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(12.0f, 7.0f);
        this.f30626c.cubicTo(11.4477f, 7.0f, 11.0f, 7.44772f, 11.0f, 8.0f);
        this.f30626c.lineTo(11.0f, 40.0f);
        this.f30626c.cubicTo(11.0f, 40.5523f, 11.4477f, 41.0f, 12.0f, 41.0f);
        this.f30626c.lineTo(36.0f, 41.0f);
        this.f30626c.cubicTo(36.5523f, 41.0f, 37.0f, 40.5523f, 37.0f, 40.0f);
        this.f30626c.lineTo(37.0f, 19.0f);
        this.f30626c.lineTo(26.0f, 19.0f);
        this.f30626c.cubicTo(24.8954f, 19.0f, 24.0f, 18.1046f, 24.0f, 17.0f);
        this.f30626c.lineTo(24.0f, 7.0f);
        this.f30626c.lineTo(12.0f, 7.0f);
        this.f30626c.close();
        this.f30626c.moveTo(28.0f, 9.56797f);
        this.f30626c.lineTo(33.8847f, 15.0f);
        this.f30626c.lineTo(28.0f, 15.0f);
        this.f30626c.lineTo(28.0f, 9.56797f);
        this.f30626c.close();
        this.f30626c.moveTo(7.0f, 8.0f);
        this.f30626c.cubicTo(7.0f, 5.23858f, 9.23858f, 3.0f, 12.0f, 3.0f);
        this.f30626c.lineTo(26.0f, 3.0f);
        this.f30626c.cubicTo(26.5028f, 3.0f, 26.9871f, 3.18937f, 27.3566f, 3.53039f);
        this.f30626c.lineTo(40.3566f, 15.5304f);
        this.f30626c.cubicTo(40.7667f, 15.909f, 41.0f, 16.4418f, 41.0f, 17.0f);
        this.f30626c.lineTo(41.0f, 40.0f);
        this.f30626c.cubicTo(41.0f, 42.7614f, 38.7614f, 45.0f, 36.0f, 45.0f);
        this.f30626c.lineTo(12.0f, 45.0f);
        this.f30626c.cubicTo(9.23858f, 45.0f, 7.0f, 42.7614f, 7.0f, 40.0f);
        this.f30626c.lineTo(7.0f, 8.0f);
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
