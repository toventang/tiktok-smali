package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ku extends a {
    static {
        Covode.recordClassIndex(18427);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(22.186f, 4.91561f);
        this.f30626c.cubicTo(22.9022f, 3.37017f, 25.0991f, 3.37017f, 25.8153f, 4.91561f);
        this.f30626c.lineTo(40.7669f, 37.1798f);
        this.f30626c.cubicTo(41.5429f, 38.8542f, 39.8303f, 40.5965f, 38.1428f, 39.8495f);
        this.f30626c.lineTo(24.0006f, 33.5896f);
        this.f30626c.lineTo(9.85846f, 39.8496f);
        this.f30626c.cubicTo(8.17094f, 40.5965f, 6.45838f, 38.8542f, 7.23432f, 37.1798f);
        this.f30626c.lineTo(22.186f, 4.91561f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
