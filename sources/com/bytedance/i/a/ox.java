package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ox extends a {
    static {
        Covode.recordClassIndex(18538);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(43.3845f, 13.4434f);
        this.f30626c.cubicTo(43.7668f, 13.8419f, 43.7536f, 14.475f, 43.3551f, 14.8573f);
        this.f30626c.lineTo(18.8699f, 38.343f);
        this.f30626c.cubicTo(18.0845f, 39.0964f, 16.8409f, 39.0834f, 16.0713f, 38.3139f);
        this.f30626c.lineTo(4.58586f, 26.8284f);
        this.f30626c.cubicTo(4.19534f, 26.4379f, 4.19534f, 25.8047f, 4.58586f, 25.4142f);
        this.f30626c.lineTo(7.41429f, 22.5858f);
        this.f30626c.cubicTo(7.80481f, 22.1953f, 8.43798f, 22.1953f, 8.8285f, 22.5858f);
        this.f30626c.lineTo(17.5438f, 31.3011f);
        this.f30626c.lineTo(39.2017f, 10.5272f);
        this.f30626c.cubicTo(39.6003f, 10.1449f, 40.2333f, 10.1581f, 40.6156f, 10.5566f);
        this.f30626c.lineTo(43.3845f, 13.4434f);
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
