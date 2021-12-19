package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class lx extends a {
    static {
        Covode.recordClassIndex(18457);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0002f, 3.0f);
        this.f30626c.cubicTo(17.9251f, 3.0f, 13.0002f, 7.92487f, 13.0002f, 14.0f);
        this.f30626c.cubicTo(13.0002f, 20.0751f, 17.9251f, 25.0f, 24.0002f, 25.0f);
        this.f30626c.cubicTo(30.0754f, 25.0f, 35.0002f, 20.0751f, 35.0002f, 14.0f);
        this.f30626c.cubicTo(35.0002f, 7.92487f, 30.0754f, 3.0f, 24.0002f, 3.0f);
        this.f30626c.close();
        this.f30626c.moveTo(10.4885f, 44.0f);
        this.f30626c.cubicTo(8.69328f, 44.0f, 7.28076f, 42.4175f, 7.8388f, 40.7112f);
        this.f30626c.cubicTo(10.0625f, 33.9118f, 16.4577f, 29.0f, 24.0f, 29.0f);
        this.f30626c.cubicTo(31.5424f, 29.0f, 37.9375f, 33.9118f, 40.1612f, 40.7112f);
        this.f30626c.cubicTo(40.7193f, 42.4175f, 39.3067f, 44.0f, 37.5115f, 44.0f);
        this.f30626c.lineTo(10.4885f, 44.0f);
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
