package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class iw extends a {
    static {
        Covode.recordClassIndex(18375);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(11.0f, 6.64f);
        this.f30626c.cubicTo(11.0f, 5.18197f, 12.182f, 4.0f, 13.64f, 4.0f);
        this.f30626c.lineTo(34.36f, 4.0f);
        this.f30626c.cubicTo(35.818f, 4.0f, 37.0f, 5.18197f, 37.0f, 6.64f);
        this.f30626c.lineTo(37.0f, 11.0f);
        this.f30626c.cubicTo(37.0f, 15.5211f, 34.6921f, 19.5032f, 31.1901f, 21.8323f);
        this.f30626c.cubicTo(35.8439f, 24.3789f, 39.0f, 29.3209f, 39.0f, 35.0f);
        this.f30626c.lineTo(39.0f, 41.16f);
        this.f30626c.cubicTo(39.0f, 42.7285f, 37.7285f, 44.0f, 36.16f, 44.0f);
        this.f30626c.lineTo(11.84f, 44.0f);
        this.f30626c.cubicTo(10.2715f, 44.0f, 9.0f, 42.7285f, 9.0f, 41.16f);
        this.f30626c.lineTo(9.0f, 35.0f);
        this.f30626c.cubicTo(9.0f, 29.3209f, 12.1561f, 24.3789f, 16.8099f, 21.8323f);
        this.f30626c.cubicTo(13.3079f, 19.5032f, 11.0f, 15.5211f, 11.0f, 11.0f);
        this.f30626c.lineTo(11.0f, 6.64f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 20.0f);
        this.f30626c.cubicTo(28.9706f, 20.0f, 33.0f, 15.9706f, 33.0f, 11.0f);
        this.f30626c.lineTo(33.0f, 8.0f);
        this.f30626c.lineTo(15.0f, 8.0f);
        this.f30626c.lineTo(15.0f, 11.0f);
        this.f30626c.cubicTo(15.0f, 15.9706f, 19.0294f, 20.0f, 24.0f, 20.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 24.0f);
        this.f30626c.cubicTo(17.9249f, 24.0f, 13.0f, 28.9249f, 13.0f, 35.0f);
        this.f30626c.lineTo(13.0f, 40.0f);
        this.f30626c.lineTo(35.0f, 40.0f);
        this.f30626c.lineTo(35.0f, 35.0f);
        this.f30626c.cubicTo(35.0f, 28.9249f, 30.0751f, 24.0f, 24.0f, 24.0f);
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
