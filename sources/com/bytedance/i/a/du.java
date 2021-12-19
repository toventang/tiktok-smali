package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class du extends a {
    static {
        Covode.recordClassIndex(18238);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(33.1841f, 2.68096f);
        this.f30626c.cubicTo(33.1898f, 2.67945f, 33.1955f, 2.67794f, 33.2012f, 2.67643f);
        this.f30626c.lineTo(35.7622f, 1.99951f);
        this.f30626c.cubicTo(37.0275f, 6.64255f, 34.2306f, 11.4167f, 29.5131f, 12.6609f);
        this.f30626c.lineTo(34.2052f, 29.897f);
        this.f30626c.cubicTo(36.0894f, 36.8207f, 31.7431f, 43.9432f, 24.5502f, 45.4959f);
        this.f30626c.cubicTo(18.1672f, 46.873f, 11.5908f, 43.133f, 9.60992f, 37.0026f);
        this.f30626c.cubicTo(7.37985f, 30.0938f, 11.4726f, 22.8274f, 18.5045f, 20.9722f);
        this.f30626c.cubicTo(18.5108f, 20.971f, 18.5172f, 20.969f, 18.5232f, 20.9671f);
        this.f30626c.cubicTo(18.5272f, 20.9658f, 18.5311f, 20.9646f, 18.5345f, 20.9638f);
        this.f30626c.cubicTo(20.1566f, 20.5407f, 21.8066f, 21.5582f, 22.2427f, 23.1511f);
        this.f30626c.lineTo(22.4963f, 24.084f);
        this.f30626c.cubicTo(22.9431f, 25.7255f, 21.9527f, 27.3924f, 20.2898f, 27.8578f);
        this.f30626c.cubicTo(19.931f, 27.9593f, 19.5722f, 28.0968f, 19.2199f, 28.2745f);
        this.f30626c.cubicTo(17.1939f, 29.2963f, 15.9951f, 31.5153f, 16.2507f, 33.7449f);
        this.f30626c.cubicTo(16.6525f, 37.2818f, 20.1953f, 39.4713f, 23.5404f, 38.4115f);
        this.f30626c.cubicTo(26.4172f, 37.504f, 27.964f, 34.4176f, 27.182f, 31.547f);
        this.f30626c.lineTo(21.9162f, 12.1955f);
        this.f30626c.cubicTo(20.9966f, 8.82569f, 23.0312f, 5.36069f, 26.4537f, 4.45742f);
        this.f30626c.lineTo(33.1841f, 2.68096f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
