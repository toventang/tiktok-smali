package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class m extends a {
    static {
        Covode.recordClassIndex(18460);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(6.85407f, 10.9036f);
        this.f30626c.cubicTo(7.39762f, 10.3472f, 8.15915f, 10.0f, 9.0f, 10.0f);
        this.f30626c.lineTo(39.0f, 10.0f);
        this.f30626c.cubicTo(39.8408f, 10.0f, 40.6024f, 10.3472f, 41.1459f, 10.9036f);
        this.f30626c.cubicTo(41.6733f, 11.4434f, 42.0f, 12.1845f, 42.0f, 13.0f);
        this.f30626c.lineTo(42.0f, 34.0f);
        this.f30626c.cubicTo(42.0f, 35.6569f, 40.6569f, 37.0f, 39.0f, 37.0f);
        this.f30626c.lineTo(9.0f, 37.0f);
        this.f30626c.cubicTo(7.34315f, 37.0f, 6.0f, 35.6569f, 6.0f, 34.0f);
        this.f30626c.lineTo(6.0f, 13.0f);
        this.f30626c.cubicTo(6.0f, 12.1845f, 6.32667f, 11.4434f, 6.85407f, 10.9036f);
        this.f30626c.close();
        this.f30626c.moveTo(9.58786f, 12.0f);
        this.f30626c.lineTo(23.3542f, 23.644f);
        this.f30626c.cubicTo(23.727f, 23.9593f, 24.273f, 23.9593f, 24.6458f, 23.644f);
        this.f30626c.lineTo(38.4121f, 12.0f);
        this.f30626c.lineTo(9.58786f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(40.0f, 13.2764f);
        this.f30626c.lineTo(25.9374f, 25.171f);
        this.f30626c.cubicTo(24.819f, 26.117f, 23.181f, 26.117f, 22.0626f, 25.171f);
        this.f30626c.lineTo(8.0f, 13.2764f);
        this.f30626c.lineTo(8.0f, 34.0f);
        this.f30626c.cubicTo(8.0f, 34.5523f, 8.44772f, 35.0f, 9.0f, 35.0f);
        this.f30626c.lineTo(39.0f, 35.0f);
        this.f30626c.cubicTo(39.5523f, 35.0f, 40.0f, 34.5523f, 40.0f, 34.0f);
        this.f30626c.lineTo(40.0f, 13.2764f);
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
