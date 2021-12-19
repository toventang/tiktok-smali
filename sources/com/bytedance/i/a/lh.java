package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class lh extends a {
    static {
        Covode.recordClassIndex(18441);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(25.2657f, 15.88f);
        this.f30626c.cubicTo(23.8116f, 14.4259f, 23.8116f, 12.0684f, 25.2657f, 10.6143f);
        this.f30626c.lineTo(32.3743f, 3.5056f);
        this.f30626c.cubicTo(33.8284f, 2.05152f, 36.1859f, 2.05152f, 37.64f, 3.5056f);
        this.f30626c.lineTo(44.7487f, 10.6143f);
        this.f30626c.cubicTo(46.2028f, 12.0684f, 46.2028f, 14.4259f, 44.7487f, 15.88f);
        this.f30626c.lineTo(37.64f, 22.9886f);
        this.f30626c.cubicTo(36.1859f, 24.4427f, 33.8284f, 24.4427f, 32.3743f, 22.9886f);
        this.f30626c.lineTo(25.2657f, 15.88f);
        this.f30626c.close();
        this.f30626c.moveTo(4.13135f, 8.00005f);
        this.f30626c.cubicTo(4.13135f, 5.79092f, 5.92221f, 4.00005f, 8.13135f, 4.00005f);
        this.f30626c.lineTo(18.9313f, 4.00005f);
        this.f30626c.cubicTo(21.1405f, 4.00005f, 22.9313f, 5.79091f, 22.9313f, 8.00005f);
        this.f30626c.lineTo(22.9313f, 18.8f);
        this.f30626c.cubicTo(22.9313f, 21.0092f, 21.1405f, 22.8001f, 18.9313f, 22.8001f);
        this.f30626c.lineTo(8.13135f, 22.8001f);
        this.f30626c.cubicTo(5.92221f, 22.8001f, 4.13135f, 21.0092f, 4.13135f, 18.8001f);
        this.f30626c.lineTo(4.13135f, 8.00005f);
        this.f30626c.close();
        this.f30626c.moveTo(8.13135f, 25.2f);
        this.f30626c.cubicTo(5.92221f, 25.2f, 4.13135f, 26.9909f, 4.13135f, 29.2f);
        this.f30626c.lineTo(4.13135f, 40.0f);
        this.f30626c.cubicTo(4.13135f, 42.2091f, 5.92221f, 44.0f, 8.13135f, 44.0f);
        this.f30626c.lineTo(18.9313f, 44.0f);
        this.f30626c.cubicTo(21.1405f, 44.0f, 22.9313f, 42.2091f, 22.9313f, 40.0f);
        this.f30626c.lineTo(22.9313f, 29.2f);
        this.f30626c.cubicTo(22.9313f, 26.9909f, 21.1405f, 25.2f, 18.9313f, 25.2f);
        this.f30626c.lineTo(8.13135f, 25.2f);
        this.f30626c.close();
        this.f30626c.moveTo(25.3315f, 29.2002f);
        this.f30626c.cubicTo(25.3315f, 26.9911f, 27.1224f, 25.2002f, 29.3315f, 25.2002f);
        this.f30626c.lineTo(40.1315f, 25.2002f);
        this.f30626c.cubicTo(42.3407f, 25.2002f, 44.1315f, 26.9911f, 44.1315f, 29.2002f);
        this.f30626c.lineTo(44.1315f, 40.0002f);
        this.f30626c.cubicTo(44.1315f, 42.2094f, 42.3407f, 44.0002f, 40.1315f, 44.0002f);
        this.f30626c.lineTo(29.3315f, 44.0002f);
        this.f30626c.cubicTo(27.1224f, 44.0002f, 25.3315f, 42.2094f, 25.3315f, 40.0002f);
        this.f30626c.lineTo(25.3315f, 29.2002f);
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
