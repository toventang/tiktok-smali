package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class x extends a {
    static {
        Covode.recordClassIndex(18575);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(29.045f, 32.4591f);
        this.f30626c.cubicTo(26.7688f, 34.0601f, 23.9942f, 35.0f, 21.0f, 35.0f);
        this.f30626c.cubicTo(13.268f, 35.0f, 7.0f, 28.732f, 7.0f, 21.0f);
        this.f30626c.cubicTo(7.0f, 13.268f, 13.268f, 7.0f, 21.0f, 7.0f);
        this.f30626c.cubicTo(28.732f, 7.0f, 35.0f, 13.268f, 35.0f, 21.0f);
        this.f30626c.cubicTo(35.0f, 25.015f, 33.3099f, 28.6352f, 30.6023f, 31.1881f);
        this.f30626c.lineTo(38.5867f, 39.1724f);
        this.f30626c.cubicTo(38.7819f, 39.3677f, 38.7819f, 39.6843f, 38.5867f, 39.8795f);
        this.f30626c.lineTo(37.8796f, 40.5866f);
        this.f30626c.cubicTo(37.6843f, 40.7819f, 37.3677f, 40.7819f, 37.1725f, 40.5866f);
        this.f30626c.lineTo(29.045f, 32.4591f);
        this.f30626c.close();
        this.f30626c.moveTo(33.0f, 21.0f);
        this.f30626c.cubicTo(33.0f, 27.6274f, 27.6274f, 33.0f, 21.0f, 33.0f);
        this.f30626c.cubicTo(14.3726f, 33.0f, 9.0f, 27.6274f, 9.0f, 21.0f);
        this.f30626c.cubicTo(9.0f, 14.3726f, 14.3726f, 9.0f, 21.0f, 9.0f);
        this.f30626c.cubicTo(27.6274f, 9.0f, 33.0f, 14.3726f, 33.0f, 21.0f);
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
