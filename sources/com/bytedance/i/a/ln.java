package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ln extends a {
    static {
        Covode.recordClassIndex(18447);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(45.7321f, 7.00001f);
        this.f30626c.cubicTo(45.3748f, 6.3812f, 44.7146f, 6.0f, 44.0f, 6.0f);
        this.f30626c.lineTo(4.00004f, 6.0f);
        this.f30626c.cubicTo(3.20826f, 6.0f, 2.49103f, 6.4671f, 2.17085f, 7.19125f);
        this.f30626c.cubicTo(1.85068f, 7.9154f, 1.98785f, 8.76026f, 2.52068f, 9.34592f);
        this.f30626c.lineTo(12.9607f, 20.8209f);
        this.f30626c.cubicTo(13.5137f, 21.4288f, 14.3824f, 21.6365f, 15.1506f, 21.3445f);
        this.f30626c.lineTo(29.65f, 15.8336f);
        this.f30626c.cubicTo(29.8188f, 15.7694f, 29.8953f, 15.796f, 29.9287f, 15.8092f);
        this.f30626c.cubicTo(29.9872f, 15.8325f, 30.0709f, 15.8928f, 30.1366f, 16.0041f);
        this.f30626c.cubicTo(30.2023f, 16.1154f, 30.2147f, 16.2179f, 30.2068f, 16.2802f);
        this.f30626c.cubicTo(30.2023f, 16.3159f, 30.1885f, 16.3958f, 30.0509f, 16.5125f);
        this.f30626c.lineTo(18.1464f, 26.6098f);
        this.f30626c.cubicTo(17.5329f, 27.1301f, 17.2908f, 27.9674f, 17.5321f, 28.7348f);
        this.f30626c.lineTo(22.0921f, 43.2398f);
        this.f30626c.cubicTo(22.33f, 43.9967f, 22.9928f, 44.5413f, 23.7815f, 44.628f);
        this.f30626c.cubicTo(24.5701f, 44.7147f, 25.3354f, 44.3271f, 25.7321f, 43.64f);
        this.f30626c.lineTo(45.7321f, 9.00002f);
        this.f30626c.cubicTo(46.0894f, 8.38122f, 46.0894f, 7.61882f, 45.7321f, 7.00001f);
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
