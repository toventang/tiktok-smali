package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kp extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31690d;

    /* renamed from: e  reason: collision with root package name */
    Path f31691e;

    static {
        Covode.recordClassIndex(18422);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(6.0f, 8.0f);
        this.f30626c.cubicTo(6.0f, 5.79086f, 7.79086f, 4.0f, 10.0f, 4.0f);
        this.f30626c.lineTo(38.0f, 4.0f);
        this.f30626c.cubicTo(40.2091f, 4.0f, 42.0f, 5.79086f, 42.0f, 8.0f);
        this.f30626c.lineTo(42.0f, 40.0f);
        this.f30626c.cubicTo(42.0f, 42.2091f, 40.2091f, 44.0f, 38.0f, 44.0f);
        this.f30626c.lineTo(10.0f, 44.0f);
        this.f30626c.cubicTo(7.79086f, 44.0f, 6.0f, 42.2091f, 6.0f, 40.0f);
        this.f30626c.lineTo(6.0f, 8.0f);
        this.f30626c.close();
        this.f30626c.moveTo(38.0f, 8.0f);
        this.f30626c.lineTo(10.0f, 8.0f);
        this.f30626c.lineTo(10.0f, 40.0f);
        this.f30626c.lineTo(38.0f, 40.0f);
        this.f30626c.lineTo(38.0f, 8.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31690d = new Paint();
        Path path = new Path();
        this.f31691e = path;
        path.moveTo(16.0f, 15.0f);
        this.f31691e.cubicTo(16.0f, 14.4477f, 16.4477f, 14.0f, 17.0f, 14.0f);
        this.f31691e.lineTo(31.0f, 14.0f);
        this.f31691e.cubicTo(31.5523f, 14.0f, 32.0f, 14.4477f, 32.0f, 15.0f);
        this.f31691e.lineTo(32.0f, 17.0f);
        this.f31691e.cubicTo(32.0f, 17.5523f, 31.5523f, 18.0f, 31.0f, 18.0f);
        this.f31691e.lineTo(17.0f, 18.0f);
        this.f31691e.cubicTo(16.4477f, 18.0f, 16.0f, 17.5523f, 16.0f, 17.0f);
        this.f31691e.lineTo(16.0f, 15.0f);
        this.f31691e.close();
        this.f31691e.moveTo(16.0f, 23.0f);
        this.f31691e.cubicTo(16.0f, 22.4477f, 16.4477f, 22.0f, 17.0f, 22.0f);
        this.f31691e.lineTo(31.0f, 22.0f);
        this.f31691e.cubicTo(31.5523f, 22.0f, 32.0f, 22.4477f, 32.0f, 23.0f);
        this.f31691e.lineTo(32.0f, 25.0f);
        this.f31691e.cubicTo(32.0f, 25.5523f, 31.5523f, 26.0f, 31.0f, 26.0f);
        this.f31691e.lineTo(17.0f, 26.0f);
        this.f31691e.cubicTo(16.4477f, 26.0f, 16.0f, 25.5523f, 16.0f, 25.0f);
        this.f31691e.lineTo(16.0f, 23.0f);
        this.f31691e.close();
        this.f31691e.moveTo(17.0f, 30.0f);
        this.f31691e.cubicTo(16.4477f, 30.0f, 16.0f, 30.4477f, 16.0f, 31.0f);
        this.f31691e.lineTo(16.0f, 33.0f);
        this.f31691e.cubicTo(16.0f, 33.5523f, 16.4477f, 34.0f, 17.0f, 34.0f);
        this.f31691e.lineTo(25.0f, 34.0f);
        this.f31691e.cubicTo(25.5523f, 34.0f, 26.0f, 33.5523f, 26.0f, 33.0f);
        this.f31691e.lineTo(26.0f, 31.0f);
        this.f31691e.cubicTo(26.0f, 30.4477f, 25.5523f, 30.0f, 25.0f, 30.0f);
        this.f31691e.lineTo(17.0f, 30.0f);
        this.f31691e.close();
        this.f31691e.setFillType(Path.FillType.EVEN_ODD);
        this.f31690d.setStyle(Paint.Style.FILL);
        this.f31690d.setColor(-16777216);
        this.f30624a.add(this.f31690d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31691e, this.f31690d);
    }
}
