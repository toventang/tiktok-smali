package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class nn extends a {
    static {
        Covode.recordClassIndex(18501);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(42.0f, 24.0f);
        this.f30626c.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f30626c.cubicTo(14.0589f, 6.0f, 6.0f, 14.0589f, 6.0f, 24.0f);
        this.f30626c.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f30626c.cubicTo(28.2406f, 42.0f, 32.1386f, 40.5336f, 35.2148f, 38.0802f);
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.STROKE);
        this.f30625b.setStrokeWidth(4.0f);
        this.f30625b.setStrokeCap(Paint.Cap.ROUND);
        this.f30625b.setStrokeJoin(Paint.Join.ROUND);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
