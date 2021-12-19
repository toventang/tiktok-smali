package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fc extends a {
    static {
        Covode.recordClassIndex(18274);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(13.7929f, 21.6213f);
        this.f30626c.cubicTo(13.4024f, 21.2308f, 13.4024f, 20.5976f, 13.7929f, 20.2071f);
        this.f30626c.lineTo(15.2071f, 18.7929f);
        this.f30626c.cubicTo(15.5976f, 18.4024f, 16.2308f, 18.4024f, 16.6213f, 18.7929f);
        this.f30626c.lineTo(24.0f, 26.1716f);
        this.f30626c.lineTo(31.3787f, 18.7929f);
        this.f30626c.cubicTo(31.7692f, 18.4024f, 32.4024f, 18.4024f, 32.7929f, 18.7929f);
        this.f30626c.lineTo(34.2071f, 20.2071f);
        this.f30626c.cubicTo(34.5976f, 20.5976f, 34.5976f, 21.2308f, 34.2071f, 21.6213f);
        this.f30626c.lineTo(24.7071f, 31.1213f);
        this.f30626c.cubicTo(24.3166f, 31.5118f, 23.6834f, 31.5118f, 23.2929f, 31.1213f);
        this.f30626c.lineTo(13.7929f, 21.6213f);
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
