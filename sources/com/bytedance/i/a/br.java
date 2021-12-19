package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class br extends a {
    static {
        Covode.recordClassIndex(18181);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 8.5f);
        this.f30626c.cubicTo(20.9624f, 8.5f, 18.5f, 10.9624f, 18.5f, 14.0f);
        this.f30626c.lineTo(18.5f, 18.5f);
        this.f30626c.lineTo(29.5f, 18.5f);
        this.f30626c.lineTo(29.5f, 14.0f);
        this.f30626c.cubicTo(29.5f, 10.9624f, 27.0376f, 8.5f, 24.0f, 8.5f);
        this.f30626c.close();
        this.f30626c.moveTo(32.5f, 18.5f);
        this.f30626c.lineTo(32.5f, 14.0f);
        this.f30626c.cubicTo(32.5f, 9.30558f, 28.6944f, 5.5f, 24.0f, 5.5f);
        this.f30626c.cubicTo(19.3056f, 5.5f, 15.5f, 9.30558f, 15.5f, 14.0f);
        this.f30626c.lineTo(15.5f, 18.5f);
        this.f30626c.lineTo(11.0f, 18.5f);
        this.f30626c.cubicTo(9.61929f, 18.5f, 8.5f, 19.6193f, 8.5f, 21.0f);
        this.f30626c.lineTo(8.5f, 40.0f);
        this.f30626c.cubicTo(8.5f, 41.3807f, 9.61929f, 42.5f, 11.0f, 42.5f);
        this.f30626c.lineTo(37.0f, 42.5f);
        this.f30626c.cubicTo(38.3807f, 42.5f, 39.5f, 41.3807f, 39.5f, 40.0f);
        this.f30626c.lineTo(39.5f, 21.0f);
        this.f30626c.cubicTo(39.5f, 19.6193f, 38.3807f, 18.5f, 37.0f, 18.5f);
        this.f30626c.lineTo(32.5f, 18.5f);
        this.f30626c.close();
        this.f30626c.moveTo(11.5f, 21.5f);
        this.f30626c.lineTo(11.5f, 39.5f);
        this.f30626c.lineTo(36.5f, 39.5f);
        this.f30626c.lineTo(36.5f, 21.5f);
        this.f30626c.lineTo(11.5f, 21.5f);
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
