package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ds extends a {
    static {
        Covode.recordClassIndex(18236);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(23.2379f, 4.89642f);
        this.f30626c.lineTo(8.40039f, 22.3524f);
        this.f30626c.cubicTo(7.84832f, 23.0019f, 8.30991f, 24.0f, 9.16233f, 24.0f);
        this.f30626c.lineTo(16.9999f, 24.0f);
        this.f30626c.lineTo(16.9999f, 34.0f);
        this.f30626c.cubicTo(16.9999f, 34.5523f, 17.4476f, 35.0f, 17.9999f, 35.0f);
        this.f30626c.lineTo(29.9999f, 35.0f);
        this.f30626c.cubicTo(30.5522f, 35.0f, 30.9999f, 34.5523f, 30.9999f, 34.0f);
        this.f30626c.lineTo(30.9999f, 24.0f);
        this.f30626c.lineTo(38.8374f, 24.0f);
        this.f30626c.cubicTo(39.6899f, 24.0f, 40.1514f, 23.0019f, 39.5994f, 22.3524f);
        this.f30626c.lineTo(24.7618f, 4.89642f);
        this.f30626c.cubicTo(24.3625f, 4.42662f, 23.6373f, 4.42662f, 23.2379f, 4.89642f);
        this.f30626c.close();
        this.f30626c.moveTo(17.9999f, 38.0f);
        this.f30626c.cubicTo(17.4476f, 38.0f, 16.9999f, 38.4477f, 16.9999f, 39.0f);
        this.f30626c.lineTo(16.9999f, 41.0f);
        this.f30626c.cubicTo(16.9999f, 41.5523f, 17.4476f, 42.0f, 17.9999f, 42.0f);
        this.f30626c.lineTo(29.9999f, 42.0f);
        this.f30626c.cubicTo(30.5522f, 42.0f, 30.9999f, 41.5523f, 30.9999f, 41.0f);
        this.f30626c.lineTo(30.9999f, 39.0f);
        this.f30626c.cubicTo(30.9999f, 38.4477f, 30.5522f, 38.0f, 29.9999f, 38.0f);
        this.f30626c.lineTo(17.9999f, 38.0f);
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
