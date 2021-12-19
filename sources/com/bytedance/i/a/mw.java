package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mw extends a {
    static {
        Covode.recordClassIndex(18483);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(26.2461f, 7.0f);
        this.f30626c.cubicTo(17.5339f, 7.0f, 10.3523f, 13.5537f, 9.36247f, 22.0f);
        this.f30626c.lineTo(11.3675f, 22.0f);
        this.f30626c.cubicTo(12.1684f, 22.0f, 12.6443f, 22.8944f, 12.1969f, 23.5587f);
        this.f30626c.lineTo(8.014f, 29.7687f);
        this.f30626c.cubicTo(7.61763f, 30.3571f, 6.75157f, 30.3571f, 6.3552f, 29.7687f);
        this.f30626c.lineTo(2.1723f, 23.5587f);
        this.f30626c.cubicTo(1.72489f, 22.8944f, 2.20084f, 22.0f, 3.00169f, 22.0f);
        this.f30626c.lineTo(5.34007f, 22.0f);
        this.f30626c.cubicTo(6.34719f, 11.3401f, 15.3227f, 3.0f, 26.2461f, 3.0f);
        this.f30626c.cubicTo(37.844f, 3.0f, 47.2461f, 12.402f, 47.2461f, 24.0f);
        this.f30626c.cubicTo(47.2461f, 35.598f, 37.844f, 45.0f, 26.2461f, 45.0f);
        this.f30626c.cubicTo(21.8784f, 45.0f, 17.8178f, 43.6646f, 14.4563f, 41.3804f);
        this.f30626c.cubicTo(13.9995f, 41.07f, 13.9118f, 40.441f, 14.2435f, 39.9995f);
        this.f30626c.lineTo(15.4449f, 38.4005f);
        this.f30626c.cubicTo(15.7766f, 37.959f, 16.402f, 37.8726f, 16.8622f, 38.1779f);
        this.f30626c.cubicTo(19.551f, 39.9616f, 22.7749f, 41.0f, 26.2461f, 41.0f);
        this.f30626c.cubicTo(35.6349f, 41.0f, 43.2461f, 33.3888f, 43.2461f, 24.0f);
        this.f30626c.cubicTo(43.2461f, 14.6112f, 35.6349f, 7.0f, 26.2461f, 7.0f);
        this.f30626c.close();
        this.f30626c.moveTo(36.186f, 25.7321f);
        this.f30626c.cubicTo(36.8048f, 25.3748f, 37.186f, 24.7145f, 37.186f, 24.0f);
        this.f30626c.cubicTo(37.186f, 23.2855f, 36.8048f, 22.6252f, 36.186f, 22.268f);
        this.f30626c.lineTo(22.686f, 14.4737f);
        this.f30626c.cubicTo(22.0672f, 14.1165f, 21.3048f, 14.1165f, 20.686f, 14.4737f);
        this.f30626c.cubicTo(20.0672f, 14.831f, 19.686f, 15.4912f, 19.686f, 16.2058f);
        this.f30626c.lineTo(19.686f, 31.7942f);
        this.f30626c.cubicTo(19.686f, 32.5088f, 20.0672f, 33.169f, 20.686f, 33.5263f);
        this.f30626c.cubicTo(21.3048f, 33.8835f, 22.0672f, 33.8835f, 22.686f, 33.5263f);
        this.f30626c.lineTo(36.186f, 25.7321f);
        this.f30626c.close();
        this.f30626c.moveTo(23.686f, 28.3301f);
        this.f30626c.lineTo(23.686f, 19.6699f);
        this.f30626c.lineTo(31.186f, 24.0f);
        this.f30626c.lineTo(23.686f, 28.3301f);
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
