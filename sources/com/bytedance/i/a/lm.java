package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class lm extends a {
    static {
        Covode.recordClassIndex(18446);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(2.17877f, 7.17357f);
        this.f30626c.cubicTo(2.50304f, 6.45894f, 3.21528f, 6.0f, 4.00003f, 6.0f);
        this.f30626c.lineTo(44.0f, 6.0f);
        this.f30626c.cubicTo(44.713f, 6.0f, 45.372f, 6.37952f, 45.7299f, 6.99615f);
        this.f30626c.cubicTo(46.0877f, 7.61278f, 46.0902f, 8.37327f, 45.7365f, 8.99228f);
        this.f30626c.lineTo(25.7365f, 43.9923f);
        this.f30626c.cubicTo(25.3423f, 44.6821f, 24.5772f, 45.0732f, 23.7872f, 44.9886f);
        this.f30626c.cubicTo(22.9972f, 44.9041f, 22.3321f, 44.3599f, 22.0929f, 43.6023f);
        this.f30626c.lineTo(16.219f, 25.0017f);
        this.f30626c.lineTo(2.49488f, 9.31701f);
        this.f30626c.cubicTo(1.97811f, 8.72642f, 1.85449f, 7.88819f, 2.17877f, 7.17357f);
        this.f30626c.close();
        this.f30626c.moveTo(20.377f, 24.8856f);
        this.f30626c.lineTo(24.531f, 38.0397f);
        this.f30626c.lineTo(40.5537f, 10.0f);
        this.f30626c.lineTo(8.40757f, 10.0f);
        this.f30626c.lineTo(18.3918f, 21.4106f);
        this.f30626c.lineTo(30.1002f, 14.2054f);
        this.f30626c.cubicTo(30.5705f, 13.9159f, 31.1865f, 14.0626f, 31.4759f, 14.533f);
        this.f30626c.lineTo(32.5241f, 16.2363f);
        this.f30626c.cubicTo(32.8136f, 16.7066f, 32.6669f, 17.3226f, 32.1966f, 17.612f);
        this.f30626c.lineTo(20.377f, 24.8856f);
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
