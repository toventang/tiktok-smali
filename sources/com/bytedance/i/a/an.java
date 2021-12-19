package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class an extends a {
    static {
        Covode.recordClassIndex(18150);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.0f, 8.0f);
        this.f30626c.cubicTo(14.8954f, 8.0f, 14.0f, 8.89543f, 14.0f, 10.0f);
        this.f30626c.lineTo(14.0f, 14.0f);
        this.f30626c.lineTo(10.0f, 14.0f);
        this.f30626c.cubicTo(8.89543f, 14.0f, 8.0f, 14.8954f, 8.0f, 16.0f);
        this.f30626c.lineTo(8.0f, 38.0f);
        this.f30626c.cubicTo(8.0f, 39.1046f, 8.89543f, 40.0f, 10.0f, 40.0f);
        this.f30626c.lineTo(32.0f, 40.0f);
        this.f30626c.cubicTo(33.1046f, 40.0f, 34.0f, 39.1046f, 34.0f, 38.0f);
        this.f30626c.lineTo(34.0f, 34.0f);
        this.f30626c.lineTo(38.0f, 34.0f);
        this.f30626c.cubicTo(39.1046f, 34.0f, 40.0f, 33.1046f, 40.0f, 32.0f);
        this.f30626c.lineTo(40.0f, 10.0f);
        this.f30626c.cubicTo(40.0f, 8.89543f, 39.1046f, 8.0f, 38.0f, 8.0f);
        this.f30626c.lineTo(16.0f, 8.0f);
        this.f30626c.close();
        this.f30626c.moveTo(32.0f, 14.0f);
        this.f30626c.lineTo(16.0f, 14.0f);
        this.f30626c.lineTo(16.0f, 10.0f);
        this.f30626c.lineTo(38.0f, 10.0f);
        this.f30626c.lineTo(38.0f, 32.0f);
        this.f30626c.lineTo(34.0f, 32.0f);
        this.f30626c.lineTo(34.0f, 16.0f);
        this.f30626c.cubicTo(34.0f, 14.8954f, 33.1046f, 14.0f, 32.0f, 14.0f);
        this.f30626c.close();
        this.f30626c.moveTo(10.0f, 38.0f);
        this.f30626c.lineTo(10.0f, 16.0f);
        this.f30626c.lineTo(32.0f, 16.0f);
        this.f30626c.lineTo(32.0f, 38.0f);
        this.f30626c.lineTo(10.0f, 38.0f);
        this.f30626c.close();
        this.f30626c.moveTo(20.1094f, 22.2044f);
        this.f30626c.cubicTo(18.7803f, 21.3184f, 17.0f, 22.2711f, 17.0f, 23.8685f);
        this.f30626c.lineTo(17.0f, 29.7338f);
        this.f30626c.cubicTo(17.0f, 31.2884f, 18.6959f, 32.2486f, 20.029f, 31.4488f);
        this.f30626c.lineTo(24.6595f, 28.6705f);
        this.f30626c.cubicTo(25.9185f, 27.9151f, 25.9615f, 26.1059f, 24.7399f, 25.2914f);
        this.f30626c.lineTo(20.1094f, 22.2044f);
        this.f30626c.close();
        this.f30626c.moveTo(19.0f, 23.8685f);
        this.f30626c.lineTo(23.6305f, 26.9555f);
        this.f30626c.lineTo(19.0f, 29.7338f);
        this.f30626c.lineTo(19.0f, 23.8685f);
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
