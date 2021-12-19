package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

/* renamed from: com.bytedance.i.a.do  reason: invalid class name */
public class Cdo extends a {
    static {
        Covode.recordClassIndex(18232);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(30.2886f, 24.9658f);
        this.f30626c.cubicTo(30.8088f, 25.3674f, 30.8068f, 26.153f, 30.2846f, 26.552f);
        this.f30626c.lineTo(18.8634f, 35.2767f);
        this.f30626c.cubicTo(18.2053f, 35.7794f, 17.2563f, 35.3102f, 17.2563f, 34.4821f);
        this.f30626c.lineTo(17.2563f, 16.9397f);
        this.f30626c.cubicTo(17.2563f, 16.1093f, 18.2101f, 15.6407f, 18.8675f, 16.1482f);
        this.f30626c.lineTo(30.2886f, 24.9658f);
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
