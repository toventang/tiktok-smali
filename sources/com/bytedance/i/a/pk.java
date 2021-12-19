package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pk extends a {
    static {
        Covode.recordClassIndex(18552);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(30.6565f, 12.9148f);
        this.f30626c.cubicTo(30.1163f, 13.03f, 29.5935f, 12.6796f, 29.3831f, 12.169f);
        this.f30626c.cubicTo(28.3907f, 9.76043f, 25.7907f, 8.32883f, 23.1522f, 8.89157f);
        this.f30626c.cubicTo(20.1815f, 9.52516f, 18.2868f, 12.4471f, 18.9204f, 15.4178f);
        this.f30626c.lineTo(19.6844f, 19.0f);
        this.f30626c.lineTo(36.0f, 19.0f);
        this.f30626c.cubicTo(38.7614f, 19.0f, 41.0f, 21.2385f, 41.0f, 24.0f);
        this.f30626c.lineTo(41.0f, 38.0f);
        this.f30626c.cubicTo(41.0f, 40.7614f, 38.7614f, 43.0f, 36.0f, 43.0f);
        this.f30626c.lineTo(12.0f, 43.0f);
        this.f30626c.cubicTo(9.23858f, 43.0f, 7.0f, 40.7614f, 7.0f, 38.0f);
        this.f30626c.lineTo(7.0f, 24.0f);
        this.f30626c.cubicTo(7.0f, 21.2385f, 9.23858f, 19.0f, 12.0f, 19.0f);
        this.f30626c.lineTo(15.5944f, 19.0f);
        this.f30626c.lineTo(15.0084f, 16.2522f);
        this.f30626c.cubicTo(13.914f, 11.1209f, 17.1866f, 6.07394f, 22.3179f, 4.97955f);
        this.f30626c.cubicTo(27.1194f, 3.95549f, 31.847f, 6.75511f, 33.3315f, 11.3234f);
        this.f30626c.cubicTo(33.5022f, 11.8486f, 33.1526f, 12.3824f, 32.6125f, 12.4976f);
        this.f30626c.lineTo(30.6565f, 12.9148f);
        this.f30626c.close();
        this.f30626c.moveTo(12.0f, 23.0f);
        this.f30626c.cubicTo(11.4477f, 23.0f, 11.0f, 23.4477f, 11.0f, 24.0f);
        this.f30626c.lineTo(11.0f, 38.0f);
        this.f30626c.cubicTo(11.0f, 38.5522f, 11.4477f, 39.0f, 12.0f, 39.0f);
        this.f30626c.lineTo(36.0f, 39.0f);
        this.f30626c.cubicTo(36.5523f, 39.0f, 37.0f, 38.5522f, 37.0f, 38.0f);
        this.f30626c.lineTo(37.0f, 24.0f);
        this.f30626c.cubicTo(37.0f, 23.4477f, 36.5523f, 23.0f, 36.0f, 23.0f);
        this.f30626c.lineTo(12.0f, 23.0f);
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
