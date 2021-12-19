package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class eq extends a {
    static {
        Covode.recordClassIndex(18261);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(6.0f, 11.0f);
        this.f30626c.cubicTo(6.0f, 8.79086f, 7.79086f, 7.0f, 10.0f, 7.0f);
        this.f30626c.lineTo(38.0f, 7.0f);
        this.f30626c.cubicTo(40.2092f, 7.0f, 42.0f, 8.79088f, 42.0f, 11.0f);
        this.f30626c.lineTo(42.0f, 32.0f);
        this.f30626c.cubicTo(42.0f, 34.2091f, 40.2092f, 36.0f, 38.0f, 36.0f);
        this.f30626c.lineTo(15.8284f, 36.0f);
        this.f30626c.lineTo(9.41421f, 42.4142f);
        this.f30626c.cubicTo(8.84222f, 42.9862f, 7.98198f, 43.1573f, 7.23463f, 42.8478f);
        this.f30626c.cubicTo(6.48728f, 42.5382f, 6.0f, 41.8089f, 6.0f, 41.0f);
        this.f30626c.lineTo(6.0f, 11.0f);
        this.f30626c.close();
        this.f30626c.moveTo(10.0f, 36.1716f);
        this.f30626c.lineTo(13.5858f, 32.5858f);
        this.f30626c.cubicTo(13.9609f, 32.2107f, 14.4696f, 32.0f, 15.0f, 32.0f);
        this.f30626c.lineTo(38.0f, 32.0f);
        this.f30626c.lineTo(38.0f, 11.0f);
        this.f30626c.lineTo(10.0f, 11.0f);
        this.f30626c.lineTo(10.0f, 36.1716f);
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
