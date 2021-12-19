package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mh extends a {
    static {
        Covode.recordClassIndex(18468);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(12.0f, 8.77702f);
        this.f30626c.cubicTo(12.0f, 6.43812f, 14.5577f, 4.99881f, 16.5569f, 6.21266f);
        this.f30626c.lineTo(41.6301f, 21.4356f);
        this.f30626c.cubicTo(43.5542f, 22.6038f, 43.5542f, 25.3962f, 41.6301f, 26.5644f);
        this.f30626c.lineTo(16.5569f, 41.7873f);
        this.f30626c.cubicTo(14.5577f, 43.0012f, 12.0f, 41.5619f, 12.0f, 39.223f);
        this.f30626c.lineTo(12.0f, 8.77702f);
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
