package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ao extends a {
    static {
        Covode.recordClassIndex(18151);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.0f, 9.0f);
        this.f30626c.cubicTo(16.0f, 7.89543f, 16.8954f, 7.0f, 18.0f, 7.0f);
        this.f30626c.lineTo(30.0f, 7.0f);
        this.f30626c.cubicTo(31.1046f, 7.0f, 32.0f, 7.89543f, 32.0f, 9.0f);
        this.f30626c.lineTo(32.0f, 12.0f);
        this.f30626c.lineTo(38.5f, 12.0f);
        this.f30626c.cubicTo(38.7761f, 12.0f, 39.0f, 12.2239f, 39.0f, 12.5f);
        this.f30626c.lineTo(39.0f, 13.5f);
        this.f30626c.cubicTo(39.0f, 13.7761f, 38.7761f, 14.0f, 38.5f, 14.0f);
        this.f30626c.lineTo(36.0f, 14.0f);
        this.f30626c.lineTo(36.0f, 37.0f);
        this.f30626c.cubicTo(36.0f, 38.6569f, 34.6569f, 40.0f, 33.0f, 40.0f);
        this.f30626c.lineTo(15.0f, 40.0f);
        this.f30626c.cubicTo(13.3431f, 40.0f, 12.0f, 38.6569f, 12.0f, 37.0f);
        this.f30626c.lineTo(12.0f, 14.0f);
        this.f30626c.lineTo(9.5f, 14.0f);
        this.f30626c.cubicTo(9.22386f, 14.0f, 9.0f, 13.7761f, 9.0f, 13.5f);
        this.f30626c.lineTo(9.0f, 12.5f);
        this.f30626c.cubicTo(9.0f, 12.2239f, 9.22386f, 12.0f, 9.5f, 12.0f);
        this.f30626c.lineTo(16.0f, 12.0f);
        this.f30626c.lineTo(16.0f, 9.0f);
        this.f30626c.close();
        this.f30626c.moveTo(18.0f, 12.0f);
        this.f30626c.lineTo(30.0f, 12.0f);
        this.f30626c.lineTo(30.0f, 9.0f);
        this.f30626c.lineTo(18.0f, 9.0f);
        this.f30626c.lineTo(18.0f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(14.0f, 14.0f);
        this.f30626c.lineTo(14.0f, 37.0f);
        this.f30626c.cubicTo(14.0f, 37.5523f, 14.4477f, 38.0f, 15.0f, 38.0f);
        this.f30626c.lineTo(33.0f, 38.0f);
        this.f30626c.cubicTo(33.5523f, 38.0f, 34.0f, 37.5523f, 34.0f, 37.0f);
        this.f30626c.lineTo(34.0f, 14.0f);
        this.f30626c.lineTo(14.0f, 14.0f);
        this.f30626c.close();
        this.f30626c.moveTo(20.0f, 31.5f);
        this.f30626c.cubicTo(19.7239f, 31.5f, 19.5f, 31.2761f, 19.5f, 31.0f);
        this.f30626c.lineTo(19.5f, 20.0f);
        this.f30626c.cubicTo(19.5f, 19.7239f, 19.7239f, 19.5f, 20.0f, 19.5f);
        this.f30626c.lineTo(21.0f, 19.5f);
        this.f30626c.cubicTo(21.2761f, 19.5f, 21.5f, 19.7239f, 21.5f, 20.0f);
        this.f30626c.lineTo(21.5f, 31.0f);
        this.f30626c.cubicTo(21.5f, 31.2761f, 21.2761f, 31.5f, 21.0f, 31.5f);
        this.f30626c.lineTo(20.0f, 31.5f);
        this.f30626c.close();
        this.f30626c.moveTo(27.0f, 31.5f);
        this.f30626c.cubicTo(26.7239f, 31.5f, 26.5f, 31.2761f, 26.5f, 31.0f);
        this.f30626c.lineTo(26.5f, 20.0f);
        this.f30626c.cubicTo(26.5f, 19.7239f, 26.7239f, 19.5f, 27.0f, 19.5f);
        this.f30626c.lineTo(28.0f, 19.5f);
        this.f30626c.cubicTo(28.2761f, 19.5f, 28.5f, 19.7239f, 28.5f, 20.0f);
        this.f30626c.lineTo(28.5f, 31.0f);
        this.f30626c.cubicTo(28.5f, 31.2761f, 28.2761f, 31.5f, 28.0f, 31.5f);
        this.f30626c.lineTo(27.0f, 31.5f);
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
