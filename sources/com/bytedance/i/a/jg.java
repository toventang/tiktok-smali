package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class jg extends a {
    static {
        Covode.recordClassIndex(18386);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(2.5491f, 5.14273f);
        this.f30626c.cubicTo(1.94715f, 5.14273f, 1.40187f, 5.49784f, 1.15846f, 6.04838f);
        this.f30626c.cubicTo(0.91505f, 6.59891f, 1.01933f, 7.24122f, 1.42442f, 7.68646f);
        this.f30626c.lineTo(24.4809f, 33.0287f);
        this.f30626c.lineTo(34.5495f, 65.0562f);
        this.f30626c.cubicTo(34.7304f, 65.6316f, 35.2343f, 66.0457f, 35.8338f, 66.1116f);
        this.f30626c.cubicTo(36.4334f, 66.1775f, 37.0152f, 65.8828f, 37.3168f, 65.3605f);
        this.f30626c.lineTo(70.7677f, 7.42349f);
        this.f30626c.cubicTo(71.0393f, 6.95305f, 71.0393f, 6.37344f, 70.7677f, 5.90299f);
        this.f30626c.cubicTo(70.4961f, 5.43254f, 69.9942f, 5.14273f, 69.4509f, 5.14273f);
        this.f30626c.lineTo(2.5491f, 5.14273f);
        this.f30626c.close();
        this.f30626c.moveTo(26.469f, 30.6951f);
        this.f30626c.lineTo(5.98807f, 8.18372f);
        this.f30626c.lineTo(66.8173f, 8.18372f);
        this.f30626c.lineTo(36.413f, 60.844f);
        this.f30626c.lineTo(27.7982f, 33.441f);
        this.f30626c.lineTo(48.0094f, 21.5787f);
        this.f30626c.cubicTo(48.7336f, 21.1536f, 48.9761f, 20.2219f, 48.5511f, 19.4977f);
        this.f30626c.cubicTo(48.126f, 18.7735f, 47.1943f, 18.531f, 46.4701f, 18.956f);
        this.f30626c.lineTo(26.469f, 30.6951f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
