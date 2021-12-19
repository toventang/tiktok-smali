package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pv extends a {
    static {
        Covode.recordClassIndex(18563);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(21.1718f, 23.9999f);
        this.f30626c.lineTo(10.2931f, 13.1212f);
        this.f30626c.cubicTo(9.90261f, 12.7307f, 9.90261f, 12.0975f, 10.2931f, 11.707f);
        this.f30626c.lineTo(11.7074f, 10.2928f);
        this.f30626c.cubicTo(12.0979f, 9.90228f, 12.731f, 9.90228f, 13.1216f, 10.2928f);
        this.f30626c.lineTo(24.0002f, 21.1715f);
        this.f30626c.lineTo(34.8789f, 10.2928f);
        this.f30626c.cubicTo(35.2694f, 9.90228f, 35.9026f, 9.90228f, 36.2931f, 10.2928f);
        this.f30626c.lineTo(37.7073f, 11.707f);
        this.f30626c.cubicTo(38.0979f, 12.0975f, 38.0979f, 12.7307f, 37.7073f, 13.1212f);
        this.f30626c.lineTo(26.8287f, 23.9999f);
        this.f30626c.lineTo(37.7073f, 34.8786f);
        this.f30626c.cubicTo(38.0979f, 35.2691f, 38.0979f, 35.9023f, 37.7073f, 36.2928f);
        this.f30626c.lineTo(36.2931f, 37.707f);
        this.f30626c.cubicTo(35.9026f, 38.0975f, 35.2694f, 38.0975f, 34.8789f, 37.707f);
        this.f30626c.lineTo(24.0002f, 26.8283f);
        this.f30626c.lineTo(13.1216f, 37.707f);
        this.f30626c.cubicTo(12.731f, 38.0975f, 12.0979f, 38.0975f, 11.7074f, 37.707f);
        this.f30626c.lineTo(10.2931f, 36.2928f);
        this.f30626c.cubicTo(9.90261f, 35.9023f, 9.90261f, 35.2691f, 10.2931f, 34.8786f);
        this.f30626c.lineTo(21.1718f, 23.9999f);
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
