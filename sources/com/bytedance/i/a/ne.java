package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ne extends a {
    static {
        Covode.recordClassIndex(18492);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(6.89566f, 8.0f);
        this.f30626c.lineTo(3.0f, 8.0f);
        this.f30626c.cubicTo(2.44772f, 8.0f, 2.0f, 7.55229f, 2.0f, 7.0f);
        this.f30626c.lineTo(2.0f, 5.0f);
        this.f30626c.cubicTo(2.0f, 4.44772f, 2.44772f, 4.0f, 3.0f, 4.0f);
        this.f30626c.lineTo(8.5f, 4.0f);
        this.f30626c.cubicTo(9.4374f, 4.0f, 10.249f, 4.65106f, 10.4524f, 5.56614f);
        this.f30626c.lineTo(11.4377f, 10.0f);
        this.f30626c.lineTo(42.0f, 10.0f);
        this.f30626c.cubicTo(42.6429f, 10.0f, 43.2466f, 10.309f, 43.6225f, 10.8306f);
        this.f30626c.cubicTo(43.9984f, 11.3521f, 44.1007f, 12.0226f, 43.8974f, 12.6325f);
        this.f30626c.lineTo(39.8974f, 24.6325f);
        this.f30626c.cubicTo(39.6251f, 25.4491f, 38.8609f, 26.0f, 38.0f, 26.0f);
        this.f30626c.lineTo(14.9932f, 26.0f);
        this.f30626c.lineTo(16.1043f, 31.0f);
        this.f30626c.lineTo(37.0f, 31.0f);
        this.f30626c.cubicTo(37.5523f, 31.0f, 38.0f, 31.4477f, 38.0f, 32.0f);
        this.f30626c.lineTo(38.0f, 34.0f);
        this.f30626c.cubicTo(38.0f, 34.5523f, 37.5523f, 35.0f, 37.0f, 35.0f);
        this.f30626c.lineTo(14.5f, 35.0f);
        this.f30626c.cubicTo(13.5626f, 35.0f, 12.751f, 34.3489f, 12.5476f, 33.4339f);
        this.f30626c.lineTo(6.89566f, 8.0f);
        this.f30626c.close();
        this.f30626c.moveTo(14.1043f, 22.0f);
        this.f30626c.lineTo(36.5585f, 22.0f);
        this.f30626c.lineTo(39.2252f, 14.0f);
        this.f30626c.lineTo(12.3266f, 14.0f);
        this.f30626c.lineTo(14.1043f, 22.0f);
        this.f30626c.close();
        this.f30626c.moveTo(20.0f, 41.0f);
        this.f30626c.cubicTo(20.0f, 43.2091f, 18.2091f, 45.0f, 16.0f, 45.0f);
        this.f30626c.cubicTo(13.7909f, 45.0f, 12.0f, 43.2091f, 12.0f, 41.0f);
        this.f30626c.cubicTo(12.0f, 38.7909f, 13.7909f, 37.0f, 16.0f, 37.0f);
        this.f30626c.cubicTo(18.2091f, 37.0f, 20.0f, 38.7909f, 20.0f, 41.0f);
        this.f30626c.close();
        this.f30626c.moveTo(35.0f, 45.0f);
        this.f30626c.cubicTo(37.2091f, 45.0f, 39.0f, 43.2091f, 39.0f, 41.0f);
        this.f30626c.cubicTo(39.0f, 38.7909f, 37.2091f, 37.0f, 35.0f, 37.0f);
        this.f30626c.cubicTo(32.7909f, 37.0f, 31.0f, 38.7909f, 31.0f, 41.0f);
        this.f30626c.cubicTo(31.0f, 43.2091f, 32.7909f, 45.0f, 35.0f, 45.0f);
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
