package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class nz extends a {
    static {
        Covode.recordClassIndex(18513);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0003f, 8.5f);
        this.f30626c.cubicTo(19.3059f, 8.5f, 15.5003f, 12.3056f, 15.5003f, 17.0f);
        this.f30626c.cubicTo(15.5003f, 21.6944f, 19.3059f, 25.5f, 24.0003f, 25.5f);
        this.f30626c.cubicTo(28.6947f, 25.5f, 32.5003f, 21.6944f, 32.5003f, 17.0f);
        this.f30626c.cubicTo(32.5003f, 12.3056f, 28.6947f, 8.5f, 24.0003f, 8.5f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0003f, 27.5f);
        this.f30626c.cubicTo(17.824f, 27.5f, 13.0161f, 31.3744f, 11.0087f, 36.877f);
        this.f30626c.cubicTo(10.5186f, 38.2204f, 11.5522f, 39.5363f, 12.88f, 39.5363f);
        this.f30626c.lineTo(35.1186f, 39.5363f);
        this.f30626c.cubicTo(36.4468f, 39.5363f, 37.4805f, 38.2196f, 36.9896f, 36.876f);
        this.f30626c.cubicTo(34.9805f, 31.3773f, 30.1772f, 27.5f, 24.0003f, 27.5f);
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
