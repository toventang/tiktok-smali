package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class in extends a {
    static {
        Covode.recordClassIndex(18366);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(23.0f, 9.0f);
        this.f30626c.cubicTo(15.268f, 9.0f, 9.0f, 14.268f, 9.0f, 22.0f);
        this.f30626c.lineTo(9.0f, 33.5f);
        this.f30626c.cubicTo(9.0f, 34.0523f, 8.55228f, 34.5f, 8.0f, 34.5f);
        this.f30626c.lineTo(6.0f, 34.5f);
        this.f30626c.cubicTo(5.44772f, 34.5f, 5.0f, 34.0523f, 5.0f, 33.5f);
        this.f30626c.lineTo(5.0f, 22.0f);
        this.f30626c.cubicTo(5.0f, 12.0589f, 13.0589f, 5.0f, 23.0f, 5.0f);
        this.f30626c.lineTo(25.0f, 5.0f);
        this.f30626c.cubicTo(34.9411f, 5.0f, 43.0f, 12.0589f, 43.0f, 22.0f);
        this.f30626c.lineTo(43.0f, 33.5f);
        this.f30626c.cubicTo(43.0f, 34.0523f, 42.5523f, 34.5f, 42.0f, 34.5f);
        this.f30626c.lineTo(40.0f, 34.5f);
        this.f30626c.cubicTo(39.4477f, 34.5f, 39.0f, 34.0523f, 39.0f, 33.5f);
        this.f30626c.lineTo(39.0f, 22.0f);
        this.f30626c.cubicTo(39.0f, 14.268f, 32.732f, 9.0f, 25.0f, 9.0f);
        this.f30626c.lineTo(23.0f, 9.0f);
        this.f30626c.close();
        this.f30626c.moveTo(11.0f, 29.0f);
        this.f30626c.cubicTo(11.0f, 27.8954f, 11.8954f, 27.0f, 13.0f, 27.0f);
        this.f30626c.lineTo(15.0f, 27.0f);
        this.f30626c.cubicTo(17.2091f, 27.0f, 19.0f, 28.7909f, 19.0f, 31.0f);
        this.f30626c.lineTo(19.0f, 39.0f);
        this.f30626c.cubicTo(19.0f, 41.2091f, 17.2091f, 43.0f, 15.0f, 43.0f);
        this.f30626c.lineTo(13.0f, 43.0f);
        this.f30626c.cubicTo(11.8954f, 43.0f, 11.0f, 42.1046f, 11.0f, 41.0f);
        this.f30626c.lineTo(11.0f, 29.0f);
        this.f30626c.close();
        this.f30626c.moveTo(33.0f, 27.0f);
        this.f30626c.cubicTo(30.7909f, 27.0f, 29.0f, 28.7909f, 29.0f, 31.0f);
        this.f30626c.lineTo(29.0f, 39.0f);
        this.f30626c.cubicTo(29.0f, 41.2091f, 30.7909f, 43.0f, 33.0f, 43.0f);
        this.f30626c.lineTo(35.0f, 43.0f);
        this.f30626c.cubicTo(36.1046f, 43.0f, 37.0f, 42.1046f, 37.0f, 41.0f);
        this.f30626c.lineTo(37.0f, 29.0f);
        this.f30626c.cubicTo(37.0f, 27.8954f, 36.1046f, 27.0f, 35.0f, 27.0f);
        this.f30626c.lineTo(33.0f, 27.0f);
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
