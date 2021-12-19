package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kz extends a {
    static {
        Covode.recordClassIndex(18432);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(22.0f, 10.0f);
        this.f30626c.cubicTo(15.3726f, 10.0f, 10.0f, 15.3726f, 10.0f, 22.0f);
        this.f30626c.cubicTo(10.0f, 28.6274f, 15.3726f, 34.0f, 22.0f, 34.0f);
        this.f30626c.cubicTo(28.6274f, 34.0f, 34.0f, 28.6274f, 34.0f, 22.0f);
        this.f30626c.cubicTo(34.0f, 15.3726f, 28.6274f, 10.0f, 22.0f, 10.0f);
        this.f30626c.close();
        this.f30626c.moveTo(6.0f, 22.0f);
        this.f30626c.cubicTo(6.0f, 13.1634f, 13.1634f, 6.0f, 22.0f, 6.0f);
        this.f30626c.cubicTo(30.8366f, 6.0f, 38.0f, 13.1634f, 38.0f, 22.0f);
        this.f30626c.cubicTo(38.0f, 25.6974f, 36.7458f, 29.1019f, 34.6397f, 31.8113f);
        this.f30626c.lineTo(43.3809f, 40.5565f);
        this.f30626c.cubicTo(43.7712f, 40.947f, 43.7712f, 41.5801f, 43.3807f, 41.9705f);
        this.f30626c.lineTo(41.9665f, 43.3847f);
        this.f30626c.cubicTo(41.5759f, 43.7753f, 40.9426f, 43.7752f, 40.5521f, 43.3846f);
        this.f30626c.lineTo(31.8113f, 34.6397f);
        this.f30626c.cubicTo(29.1019f, 36.7458f, 25.6974f, 38.0f, 22.0f, 38.0f);
        this.f30626c.cubicTo(13.1634f, 38.0f, 6.0f, 30.8366f, 6.0f, 22.0f);
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
