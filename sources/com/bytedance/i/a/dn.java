package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class dn extends a {
    static {
        Covode.recordClassIndex(18231);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(25.5187f, 35.2284f);
        this.f30626c.cubicTo(24.7205f, 36.1596f, 23.2798f, 36.1596f, 22.4816f, 35.2284f);
        this.f30626c.lineTo(8.83008f, 19.3016f);
        this.f30626c.cubicTo(7.71807f, 18.0042f, 8.63988f, 16.0f, 10.3486f, 16.0f);
        this.f30626c.lineTo(37.6517f, 16.0f);
        this.f30626c.cubicTo(39.3604f, 16.0f, 40.2822f, 18.0042f, 39.1702f, 19.3016f);
        this.f30626c.lineTo(25.5187f, 35.2284f);
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
