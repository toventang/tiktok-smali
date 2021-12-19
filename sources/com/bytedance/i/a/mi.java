package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mi extends a {
    static {
        Covode.recordClassIndex(18469);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(17.25f, 12.4608f);
        this.f30626c.lineTo(17.25f, 35.5392f);
        this.f30626c.lineTo(36.606f, 24.0f);
        this.f30626c.lineTo(17.25f, 12.4608f);
        this.f30626c.close();
        this.f30626c.moveTo(12.75f, 10.2604f);
        this.f30626c.cubicTo(12.75f, 7.73827f, 15.4979f, 6.17732f, 17.6642f, 7.46879f);
        this.f30626c.lineTo(40.7113f, 21.2084f);
        this.f30626c.cubicTo(42.8257f, 22.4689f, 42.8257f, 25.5311f, 40.7113f, 26.7916f);
        this.f30626c.lineTo(17.6642f, 40.5312f);
        this.f30626c.cubicTo(15.4979f, 41.8227f, 12.75f, 40.2617f, 12.75f, 37.7396f);
        this.f30626c.lineTo(12.75f, 10.2604f);
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
