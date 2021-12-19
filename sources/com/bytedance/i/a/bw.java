package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bw extends a {
    static {
        Covode.recordClassIndex(18186);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(2.63407f, 7.38018f);
        this.f30626c.cubicTo(2.87728f, 6.84421f, 3.41146f, 6.5f, 4.00002f, 6.5f);
        this.f30626c.lineTo(44.0f, 6.5f);
        this.f30626c.cubicTo(44.5347f, 6.5f, 45.029f, 6.78464f, 45.2974f, 7.24711f);
        this.f30626c.cubicTo(45.5658f, 7.70958f, 45.5677f, 8.27995f, 45.3024f, 8.74421f);
        this.f30626c.lineTo(25.3024f, 43.7442f);
        this.f30626c.cubicTo(25.0067f, 44.2616f, 24.4329f, 44.5549f, 23.8404f, 44.4915f);
        this.f30626c.cubicTo(23.2479f, 44.4281f, 22.7491f, 44.0199f, 22.5697f, 43.4517f);
        this.f30626c.lineTo(16.6643f, 24.7513f);
        this.f30626c.lineTo(2.87116f, 8.98776f);
        this.f30626c.cubicTo(2.48359f, 8.54482f, 2.39087f, 7.91614f, 2.63407f, 7.38018f);
        this.f30626c.close();
        this.f30626c.moveTo(19.7828f, 24.6642f);
        this.f30626c.lineTo(24.3982f, 39.2798f);
        this.f30626c.lineTo(41.4153f, 9.5f);
        this.f30626c.lineTo(7.30568f, 9.5f);
        this.f30626c.lineTo(18.2939f, 22.0579f);
        this.f30626c.lineTo(30.788f, 14.3692f);
        this.f30626c.cubicTo(31.0232f, 14.2245f, 31.3312f, 14.2978f, 31.4759f, 14.533f);
        this.f30626c.lineTo(32.5241f, 16.2363f);
        this.f30626c.cubicTo(32.6688f, 16.4715f, 32.5955f, 16.7794f, 32.3603f, 16.9242f);
        this.f30626c.lineTo(19.7828f, 24.6642f);
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
