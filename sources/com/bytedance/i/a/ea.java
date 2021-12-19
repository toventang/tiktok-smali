package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ea extends a {
    static {
        Covode.recordClassIndex(18245);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 7.0f);
        this.f30626c.cubicTo(5.79086f, 7.0f, 4.0f, 8.79086f, 4.0f, 11.0f);
        this.f30626c.lineTo(4.0f, 37.0f);
        this.f30626c.cubicTo(4.0f, 39.2091f, 5.79086f, 41.0f, 8.0f, 41.0f);
        this.f30626c.lineTo(40.0f, 41.0f);
        this.f30626c.cubicTo(42.2091f, 41.0f, 44.0f, 39.2091f, 44.0f, 37.0f);
        this.f30626c.lineTo(44.0f, 11.0f);
        this.f30626c.cubicTo(44.0f, 8.79086f, 42.2091f, 7.0f, 40.0f, 7.0f);
        this.f30626c.lineTo(8.0f, 7.0f);
        this.f30626c.close();
        this.f30626c.moveTo(8.0f, 11.0f);
        this.f30626c.lineTo(40.0f, 11.0f);
        this.f30626c.lineTo(40.0f, 15.5f);
        this.f30626c.lineTo(8.0f, 15.5f);
        this.f30626c.lineTo(8.0f, 11.0f);
        this.f30626c.close();
        this.f30626c.moveTo(8.0f, 19.5f);
        this.f30626c.lineTo(40.0f, 19.5f);
        this.f30626c.lineTo(40.0f, 37.0f);
        this.f30626c.lineTo(8.0f, 37.0f);
        this.f30626c.lineTo(8.0f, 19.5f);
        this.f30626c.close();
        this.f30626c.moveTo(27.0f, 30.0f);
        this.f30626c.cubicTo(26.4477f, 30.0f, 26.0f, 30.4477f, 26.0f, 31.0f);
        this.f30626c.lineTo(26.0f, 33.0f);
        this.f30626c.cubicTo(26.0f, 33.5523f, 26.4477f, 34.0f, 27.0f, 34.0f);
        this.f30626c.lineTo(35.0f, 34.0f);
        this.f30626c.cubicTo(35.5523f, 34.0f, 36.0f, 33.5523f, 36.0f, 33.0f);
        this.f30626c.lineTo(36.0f, 31.0f);
        this.f30626c.cubicTo(36.0f, 30.4477f, 35.5523f, 30.0f, 35.0f, 30.0f);
        this.f30626c.lineTo(27.0f, 30.0f);
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
