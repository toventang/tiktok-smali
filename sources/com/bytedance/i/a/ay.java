package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ay extends a {
    static {
        Covode.recordClassIndex(18161);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(17.3022f, 7.5f);
        this.f30626c.cubicTo(16.1304f, 7.5f, 15.1159f, 8.31383f, 14.8617f, 9.45767f);
        this.f30626c.lineTo(14.2967f, 12.0f);
        this.f30626c.lineTo(8.5f, 12.0f);
        this.f30626c.cubicTo(5.46243f, 12.0f, 3.0f, 14.4624f, 3.0f, 17.5f);
        this.f30626c.lineTo(3.0f, 35.5f);
        this.f30626c.cubicTo(3.0f, 38.5376f, 5.46243f, 41.0f, 8.5f, 41.0f);
        this.f30626c.lineTo(39.5f, 41.0f);
        this.f30626c.cubicTo(42.5376f, 41.0f, 45.0f, 38.5376f, 45.0f, 35.5f);
        this.f30626c.lineTo(45.0f, 17.5f);
        this.f30626c.cubicTo(45.0f, 14.4624f, 42.5376f, 12.0f, 39.5f, 12.0f);
        this.f30626c.lineTo(33.7033f, 12.0f);
        this.f30626c.lineTo(33.1383f, 9.45767f);
        this.f30626c.cubicTo(32.8841f, 8.31383f, 31.8696f, 7.5f, 30.6978f, 7.5f);
        this.f30626c.lineTo(17.3022f, 7.5f);
        this.f30626c.close();
        this.f30626c.moveTo(17.1383f, 13.0423f);
        this.f30626c.lineTo(17.7033f, 10.5f);
        this.f30626c.lineTo(30.2967f, 10.5f);
        this.f30626c.lineTo(30.8617f, 13.0423f);
        this.f30626c.cubicTo(31.1159f, 14.1862f, 32.1304f, 15.0f, 33.3022f, 15.0f);
        this.f30626c.lineTo(39.5f, 15.0f);
        this.f30626c.cubicTo(40.8807f, 15.0f, 42.0f, 16.1193f, 42.0f, 17.5f);
        this.f30626c.lineTo(42.0f, 35.5f);
        this.f30626c.cubicTo(42.0f, 36.8807f, 40.8807f, 38.0f, 39.5f, 38.0f);
        this.f30626c.lineTo(8.5f, 38.0f);
        this.f30626c.cubicTo(7.11929f, 38.0f, 6.0f, 36.8807f, 6.0f, 35.5f);
        this.f30626c.lineTo(6.0f, 17.5f);
        this.f30626c.cubicTo(6.0f, 16.1193f, 7.11929f, 15.0f, 8.5f, 15.0f);
        this.f30626c.lineTo(14.6978f, 15.0f);
        this.f30626c.cubicTo(15.8696f, 15.0f, 16.8841f, 14.1862f, 17.1383f, 13.0423f);
        this.f30626c.close();
        this.f30626c.moveTo(18.0f, 25.5f);
        this.f30626c.cubicTo(18.0f, 22.1863f, 20.6863f, 19.5f, 24.0f, 19.5f);
        this.f30626c.cubicTo(27.3137f, 19.5f, 30.0f, 22.1863f, 30.0f, 25.5f);
        this.f30626c.cubicTo(30.0f, 28.8137f, 27.3137f, 31.5f, 24.0f, 31.5f);
        this.f30626c.cubicTo(20.6863f, 31.5f, 18.0f, 28.8137f, 18.0f, 25.5f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 16.5f);
        this.f30626c.cubicTo(19.0294f, 16.5f, 15.0f, 20.5294f, 15.0f, 25.5f);
        this.f30626c.cubicTo(15.0f, 30.4706f, 19.0294f, 34.5f, 24.0f, 34.5f);
        this.f30626c.cubicTo(28.9706f, 34.5f, 33.0f, 30.4706f, 33.0f, 25.5f);
        this.f30626c.cubicTo(33.0f, 20.5294f, 28.9706f, 16.5f, 24.0f, 16.5f);
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
