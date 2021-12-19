package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ep extends a {
    static {
        Covode.recordClassIndex(18260);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(4.0f, 22.0f);
        this.f30626c.cubicTo(4.0f, 12.2852f, 13.3112f, 5.0f, 24.0f, 5.0f);
        this.f30626c.cubicTo(34.6888f, 5.0f, 44.0f, 12.2852f, 44.0f, 22.0f);
        this.f30626c.cubicTo(44.0f, 27.7044f, 41.1445f, 32.4256f, 37.6906f, 36.0123f);
        this.f30626c.cubicTo(34.2346f, 39.6013f, 30.0249f, 42.2236f, 26.8944f, 43.7889f);
        this.f30626c.cubicTo(26.2745f, 44.0988f, 25.5382f, 44.0657f, 24.9485f, 43.7013f);
        this.f30626c.cubicTo(24.3589f, 43.3369f, 24.0f, 42.6932f, 24.0f, 42.0f);
        this.f30626c.lineTo(24.0f, 39.0f);
        this.f30626c.cubicTo(13.3112f, 39.0f, 4.0f, 31.7148f, 4.0f, 22.0f);
        this.f30626c.close();
        this.f30626c.moveTo(15.5f, 25.0f);
        this.f30626c.cubicTo(16.8807f, 25.0f, 18.0f, 23.8807f, 18.0f, 22.5f);
        this.f30626c.cubicTo(18.0f, 21.1193f, 16.8807f, 20.0f, 15.5f, 20.0f);
        this.f30626c.cubicTo(14.1193f, 20.0f, 13.0f, 21.1193f, 13.0f, 22.5f);
        this.f30626c.cubicTo(13.0f, 23.8807f, 14.1193f, 25.0f, 15.5f, 25.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 25.0f);
        this.f30626c.cubicTo(25.3807f, 25.0f, 26.5f, 23.8807f, 26.5f, 22.5f);
        this.f30626c.cubicTo(26.5f, 21.1193f, 25.3807f, 20.0f, 24.0f, 20.0f);
        this.f30626c.cubicTo(22.6193f, 20.0f, 21.5f, 21.1193f, 21.5f, 22.5f);
        this.f30626c.cubicTo(21.5f, 23.8807f, 22.6193f, 25.0f, 24.0f, 25.0f);
        this.f30626c.close();
        this.f30626c.moveTo(35.0f, 22.5f);
        this.f30626c.cubicTo(35.0f, 23.8807f, 33.8807f, 25.0f, 32.5f, 25.0f);
        this.f30626c.cubicTo(31.1193f, 25.0f, 30.0f, 23.8807f, 30.0f, 22.5f);
        this.f30626c.cubicTo(30.0f, 21.1193f, 31.1193f, 20.0f, 32.5f, 20.0f);
        this.f30626c.cubicTo(33.8807f, 20.0f, 35.0f, 21.1193f, 35.0f, 22.5f);
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
