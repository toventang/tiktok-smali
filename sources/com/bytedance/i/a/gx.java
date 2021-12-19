package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gx extends a {
    static {
        Covode.recordClassIndex(18322);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(14.4444f, 11.0f);
        this.f30626c.cubicTo(14.4444f, 7.68629f, 17.1307f, 5.0f, 20.4444f, 5.0f);
        this.f30626c.lineTo(37.0f, 5.0f);
        this.f30626c.cubicTo(40.3137f, 5.0f, 43.0f, 7.68629f, 43.0f, 11.0f);
        this.f30626c.lineTo(43.0f, 27.5556f);
        this.f30626c.cubicTo(43.0f, 30.8693f, 40.3137f, 33.5556f, 37.0f, 33.5556f);
        this.f30626c.lineTo(33.5556f, 33.5556f);
        this.f30626c.lineTo(33.5556f, 37.0f);
        this.f30626c.cubicTo(33.5556f, 40.3137f, 30.8693f, 43.0f, 27.5556f, 43.0f);
        this.f30626c.lineTo(11.0f, 43.0f);
        this.f30626c.cubicTo(7.6863f, 43.0f, 5.0f, 40.3137f, 5.0f, 37.0f);
        this.f30626c.lineTo(5.0f, 20.4444f);
        this.f30626c.cubicTo(5.0f, 17.1307f, 7.68629f, 14.4444f, 11.0f, 14.4444f);
        this.f30626c.lineTo(14.4444f, 14.4444f);
        this.f30626c.lineTo(14.4444f, 11.0f);
        this.f30626c.close();
        this.f30626c.moveTo(14.4444f, 18.4444f);
        this.f30626c.lineTo(11.0f, 18.4444f);
        this.f30626c.cubicTo(9.89543f, 18.4444f, 9.0f, 19.3399f, 9.0f, 20.4444f);
        this.f30626c.lineTo(9.0f, 37.0f);
        this.f30626c.cubicTo(9.0f, 38.1046f, 9.89543f, 39.0f, 11.0f, 39.0f);
        this.f30626c.lineTo(27.5556f, 39.0f);
        this.f30626c.cubicTo(28.6601f, 39.0f, 29.5556f, 38.1046f, 29.5556f, 37.0f);
        this.f30626c.lineTo(29.5556f, 33.5556f);
        this.f30626c.lineTo(20.4444f, 33.5556f);
        this.f30626c.cubicTo(17.1307f, 33.5556f, 14.4444f, 30.8693f, 14.4444f, 27.5556f);
        this.f30626c.lineTo(14.4444f, 18.4444f);
        this.f30626c.close();
        this.f30626c.moveTo(20.4444f, 9.0f);
        this.f30626c.cubicTo(19.3399f, 9.0f, 18.4444f, 9.89543f, 18.4444f, 11.0f);
        this.f30626c.lineTo(18.4444f, 27.5556f);
        this.f30626c.cubicTo(18.4444f, 28.6601f, 19.3399f, 29.5556f, 20.4444f, 29.5556f);
        this.f30626c.lineTo(37.0f, 29.5556f);
        this.f30626c.cubicTo(38.1046f, 29.5556f, 39.0f, 28.6601f, 39.0f, 27.5556f);
        this.f30626c.lineTo(39.0f, 11.0f);
        this.f30626c.cubicTo(39.0f, 9.89543f, 38.1046f, 9.0f, 37.0f, 9.0f);
        this.f30626c.lineTo(20.4444f, 9.0f);
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
