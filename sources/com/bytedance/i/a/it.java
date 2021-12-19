package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class it extends a {
    static {
        Covode.recordClassIndex(18372);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(6.66022f, 8.55074f);
        this.f30626c.cubicTo(11.4597f, 3.71786f, 19.0168f, 3.74482f, 24.0f, 9.08441f);
        this.f30626c.cubicTo(28.9832f, 3.74482f, 36.5403f, 3.71786f, 41.3398f, 8.55074f);
        this.f30626c.cubicTo(46.2201f, 13.465f, 46.2201f, 21.4262f, 41.3398f, 26.3404f);
        this.f30626c.lineTo(25.3553f, 42.436f);
        this.f30626c.cubicTo(24.9969f, 42.797f, 24.509f, 43.0f, 24.0f, 43.0f);
        this.f30626c.cubicTo(23.491f, 43.0f, 23.0031f, 42.797f, 22.6447f, 42.436f);
        this.f30626c.lineTo(6.66022f, 26.3404f);
        this.f30626c.cubicTo(1.77993f, 21.4262f, 1.77993f, 13.465f, 6.66022f, 8.55074f);
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
