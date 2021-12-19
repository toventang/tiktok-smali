package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class d extends a {
    static {
        Covode.recordClassIndex(18217);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 11.0f);
        this.f30626c.cubicTo(8.0f, 7.68629f, 10.6863f, 5.0f, 14.0f, 5.0f);
        this.f30626c.lineTo(38.0f, 5.0f);
        this.f30626c.cubicTo(38.5523f, 5.0f, 39.0f, 5.44772f, 39.0f, 6.0f);
        this.f30626c.lineTo(39.0f, 41.0f);
        this.f30626c.cubicTo(39.0f, 41.5523f, 38.5523f, 42.0f, 38.0f, 42.0f);
        this.f30626c.lineTo(13.5f, 42.0f);
        this.f30626c.cubicTo(10.4624f, 42.0f, 8.0f, 39.5376f, 8.0f, 36.5f);
        this.f30626c.cubicTo(8.0f, 36.3315f, 8.00758f, 36.1647f, 8.02242f, 36.0f);
        this.f30626c.lineTo(8.0f, 36.0f);
        this.f30626c.lineTo(8.0f, 11.0f);
        this.f30626c.close();
        this.f30626c.moveTo(10.0f, 32.2572f);
        this.f30626c.cubicTo(10.9509f, 31.4718f, 12.1704f, 31.0f, 13.5f, 31.0f);
        this.f30626c.lineTo(37.0f, 31.0f);
        this.f30626c.lineTo(37.0f, 7.0f);
        this.f30626c.lineTo(14.0f, 7.0f);
        this.f30626c.cubicTo(11.7909f, 7.0f, 10.0f, 8.79086f, 10.0f, 11.0f);
        this.f30626c.lineTo(10.0f, 32.2572f);
        this.f30626c.close();
        this.f30626c.moveTo(37.0f, 33.0f);
        this.f30626c.lineTo(13.5f, 33.0f);
        this.f30626c.cubicTo(11.567f, 33.0f, 10.0f, 34.567f, 10.0f, 36.5f);
        this.f30626c.cubicTo(10.0f, 38.433f, 11.567f, 40.0f, 13.5f, 40.0f);
        this.f30626c.lineTo(37.0f, 40.0f);
        this.f30626c.lineTo(37.0f, 33.0f);
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
