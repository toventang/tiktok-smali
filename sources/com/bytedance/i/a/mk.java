package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mk extends a {
    static {
        Covode.recordClassIndex(18471);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(13.0f, 4.0f);
        this.f30626c.lineTo(35.0f, 4.0f);
        this.f30626c.cubicTo(39.9706f, 4.0f, 44.0f, 8.02944f, 44.0f, 13.0f);
        this.f30626c.lineTo(44.0f, 35.0f);
        this.f30626c.cubicTo(44.0f, 35.5523f, 43.5523f, 36.0f, 43.0f, 36.0f);
        this.f30626c.lineTo(41.0f, 36.0f);
        this.f30626c.cubicTo(40.4477f, 36.0f, 40.0f, 35.5523f, 40.0f, 35.0f);
        this.f30626c.lineTo(40.0f, 14.0f);
        this.f30626c.cubicTo(40.0f, 10.6863f, 37.3137f, 8.0f, 34.0f, 8.0f);
        this.f30626c.lineTo(13.0f, 8.0f);
        this.f30626c.cubicTo(12.4477f, 8.0f, 12.0f, 7.55228f, 12.0f, 7.0f);
        this.f30626c.lineTo(12.0f, 5.0f);
        this.f30626c.cubicTo(12.0f, 4.44772f, 12.4477f, 4.0f, 13.0f, 4.0f);
        this.f30626c.close();
        this.f30626c.moveTo(9.0f, 12.0f);
        this.f30626c.cubicTo(6.23858f, 12.0f, 4.0f, 14.2386f, 4.0f, 17.0f);
        this.f30626c.lineTo(4.0f, 39.0f);
        this.f30626c.cubicTo(4.0f, 41.7614f, 6.23858f, 44.0f, 9.0f, 44.0f);
        this.f30626c.lineTo(31.0f, 44.0f);
        this.f30626c.cubicTo(33.7614f, 44.0f, 36.0f, 41.7614f, 36.0f, 39.0f);
        this.f30626c.lineTo(36.0f, 17.0f);
        this.f30626c.cubicTo(36.0f, 14.2386f, 33.7614f, 12.0f, 31.0f, 12.0f);
        this.f30626c.lineTo(9.0f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(16.9537f, 20.0327f);
        this.f30626c.cubicTo(16.4157f, 19.683f, 15.7293f, 19.6558f, 15.1653f, 19.9619f);
        this.f30626c.cubicTo(14.6013f, 20.268f, 14.25f, 20.8583f, 14.25f, 21.5f);
        this.f30626c.lineTo(14.25f, 34.5f);
        this.f30626c.cubicTo(14.25f, 35.1417f, 14.6013f, 35.732f, 15.1653f, 36.0381f);
        this.f30626c.cubicTo(15.7293f, 36.3442f, 16.4157f, 36.317f, 16.9537f, 35.9673f);
        this.f30626c.lineTo(26.9537f, 29.4673f);
        this.f30626c.cubicTo(27.4504f, 29.1445f, 27.75f, 28.5923f, 27.75f, 28.0f);
        this.f30626c.cubicTo(27.75f, 27.4077f, 27.4504f, 26.8555f, 26.9537f, 26.5327f);
        this.f30626c.lineTo(16.9537f, 20.0327f);
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
