package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class eu extends a {
    static {
        Covode.recordClassIndex(18265);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(17.5f, 4.0f);
        this.f30626c.cubicTo(17.7761f, 4.0f, 18.0f, 4.22386f, 18.0f, 4.5f);
        this.f30626c.lineTo(18.0f, 8.0f);
        this.f30626c.lineTo(30.0f, 8.0f);
        this.f30626c.lineTo(30.0f, 4.5f);
        this.f30626c.cubicTo(30.0f, 4.22386f, 30.2239f, 4.0f, 30.5f, 4.0f);
        this.f30626c.lineTo(33.5f, 4.0f);
        this.f30626c.cubicTo(33.7761f, 4.0f, 34.0f, 4.22386f, 34.0f, 4.5f);
        this.f30626c.lineTo(34.0f, 8.0f);
        this.f30626c.lineTo(38.0f, 8.0f);
        this.f30626c.cubicTo(41.3137f, 8.0f, 44.0f, 10.6863f, 44.0f, 14.0f);
        this.f30626c.lineTo(44.0f, 36.0f);
        this.f30626c.cubicTo(44.0f, 39.3137f, 41.3137f, 42.0f, 38.0f, 42.0f);
        this.f30626c.lineTo(10.0f, 42.0f);
        this.f30626c.cubicTo(6.68629f, 42.0f, 4.0f, 39.3137f, 4.0f, 36.0f);
        this.f30626c.lineTo(4.0f, 14.0f);
        this.f30626c.cubicTo(4.0f, 10.6863f, 6.68629f, 8.0f, 10.0f, 8.0f);
        this.f30626c.lineTo(14.0f, 8.0f);
        this.f30626c.lineTo(14.0f, 4.5f);
        this.f30626c.cubicTo(14.0f, 4.22386f, 14.2239f, 4.0f, 14.5f, 4.0f);
        this.f30626c.lineTo(17.5f, 4.0f);
        this.f30626c.close();
        this.f30626c.moveTo(30.0f, 12.0f);
        this.f30626c.lineTo(30.0f, 15.5f);
        this.f30626c.cubicTo(30.0f, 15.7761f, 30.2239f, 16.0f, 30.5f, 16.0f);
        this.f30626c.lineTo(33.5f, 16.0f);
        this.f30626c.cubicTo(33.7761f, 16.0f, 34.0f, 15.7761f, 34.0f, 15.5f);
        this.f30626c.lineTo(34.0f, 12.0f);
        this.f30626c.lineTo(38.0f, 12.0f);
        this.f30626c.cubicTo(39.1046f, 12.0f, 40.0f, 12.8954f, 40.0f, 14.0f);
        this.f30626c.lineTo(40.0f, 19.0f);
        this.f30626c.lineTo(8.0f, 19.0f);
        this.f30626c.lineTo(8.0f, 14.0f);
        this.f30626c.cubicTo(8.0f, 12.8954f, 8.89543f, 12.0f, 10.0f, 12.0f);
        this.f30626c.lineTo(14.0f, 12.0f);
        this.f30626c.lineTo(14.0f, 15.5f);
        this.f30626c.cubicTo(14.0f, 15.7761f, 14.2239f, 16.0f, 14.5f, 16.0f);
        this.f30626c.lineTo(17.5f, 16.0f);
        this.f30626c.cubicTo(17.7761f, 16.0f, 18.0f, 15.7761f, 18.0f, 15.5f);
        this.f30626c.lineTo(18.0f, 12.0f);
        this.f30626c.lineTo(30.0f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(8.0f, 23.0f);
        this.f30626c.lineTo(8.0f, 36.0f);
        this.f30626c.cubicTo(8.0f, 37.1046f, 8.89543f, 38.0f, 10.0f, 38.0f);
        this.f30626c.lineTo(38.0f, 38.0f);
        this.f30626c.cubicTo(39.1046f, 38.0f, 40.0f, 37.1046f, 40.0f, 36.0f);
        this.f30626c.lineTo(40.0f, 23.0f);
        this.f30626c.lineTo(8.0f, 23.0f);
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
