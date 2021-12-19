package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hh extends a {
    static {
        Covode.recordClassIndex(18333);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 5.0f);
        this.f30626c.cubicTo(26.2091f, 5.0f, 28.0f, 6.79086f, 28.0f, 9.0f);
        this.f30626c.cubicTo(28.0f, 11.2091f, 26.2091f, 13.0f, 24.0f, 13.0f);
        this.f30626c.cubicTo(21.7909f, 13.0f, 20.0f, 11.2091f, 20.0f, 9.0f);
        this.f30626c.cubicTo(20.0f, 6.79086f, 21.7909f, 5.0f, 24.0f, 5.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 20.0f);
        this.f30626c.cubicTo(26.2091f, 20.0f, 28.0f, 21.7909f, 28.0f, 24.0f);
        this.f30626c.cubicTo(28.0f, 26.2091f, 26.2091f, 28.0f, 24.0f, 28.0f);
        this.f30626c.cubicTo(21.7909f, 28.0f, 20.0f, 26.2091f, 20.0f, 24.0f);
        this.f30626c.cubicTo(20.0f, 21.7909f, 21.7909f, 20.0f, 24.0f, 20.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 35.0f);
        this.f30626c.cubicTo(26.2091f, 35.0f, 28.0f, 36.7909f, 28.0f, 39.0f);
        this.f30626c.cubicTo(28.0f, 41.2091f, 26.2091f, 43.0f, 24.0f, 43.0f);
        this.f30626c.cubicTo(21.7909f, 43.0f, 20.0f, 41.2091f, 20.0f, 39.0f);
        this.f30626c.cubicTo(20.0f, 36.7909f, 21.7909f, 35.0f, 24.0f, 35.0f);
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
