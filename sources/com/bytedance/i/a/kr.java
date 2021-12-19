package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kr extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31692d;

    /* renamed from: e  reason: collision with root package name */
    Path f31693e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31694f;

    /* renamed from: g  reason: collision with root package name */
    Path f31695g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31696h;

    /* renamed from: i  reason: collision with root package name */
    Path f31697i;

    static {
        Covode.recordClassIndex(18424);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(34.0f, 6.0f);
        this.f30626c.lineTo(34.0f, 34.1716f);
        this.f30626c.lineTo(30.1213f, 30.2929f);
        this.f30626c.cubicTo(29.7308f, 29.9024f, 29.0976f, 29.9024f, 28.7071f, 30.2929f);
        this.f30626c.lineTo(27.2929f, 31.7071f);
        this.f30626c.cubicTo(26.9024f, 32.0976f, 26.9024f, 32.7308f, 27.2929f, 33.1213f);
        this.f30626c.lineTo(34.5858f, 40.4142f);
        this.f30626c.cubicTo(35.3668f, 41.1953f, 36.6332f, 41.1953f, 37.4142f, 40.4142f);
        this.f30626c.lineTo(44.7071f, 33.1213f);
        this.f30626c.cubicTo(45.0976f, 32.7308f, 45.0976f, 32.0976f, 44.7071f, 31.7071f);
        this.f30626c.lineTo(43.2929f, 30.2929f);
        this.f30626c.cubicTo(42.9024f, 29.9024f, 42.2692f, 29.9024f, 41.8787f, 30.2929f);
        this.f30626c.lineTo(38.0f, 34.1716f);
        this.f30626c.lineTo(38.0f, 6.0f);
        this.f30626c.cubicTo(38.0f, 5.44772f, 37.5523f, 5.0f, 37.0f, 5.0f);
        this.f30626c.lineTo(35.0f, 5.0f);
        this.f30626c.cubicTo(34.4477f, 5.0f, 34.0f, 5.44772f, 34.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31692d = new Paint();
        Path path = new Path();
        this.f31693e = path;
        path.moveTo(5.0f, 10.0f);
        this.f31693e.cubicTo(4.44772f, 10.0f, 4.0f, 10.4477f, 4.0f, 11.0f);
        this.f31693e.lineTo(4.0f, 13.0f);
        this.f31693e.cubicTo(4.0f, 13.5523f, 4.44772f, 14.0f, 5.0f, 14.0f);
        this.f31693e.lineTo(28.0f, 14.0f);
        this.f31693e.cubicTo(28.5523f, 14.0f, 29.0f, 13.5523f, 29.0f, 13.0f);
        this.f31693e.lineTo(29.0f, 11.0f);
        this.f31693e.cubicTo(29.0f, 10.4477f, 28.5523f, 10.0f, 28.0f, 10.0f);
        this.f31693e.lineTo(5.0f, 10.0f);
        this.f31693e.close();
        this.f31693e.setFillType(Path.FillType.WINDING);
        this.f31692d.setStyle(Paint.Style.FILL);
        this.f31692d.setColor(-16777216);
        this.f30624a.add(this.f31692d);
        this.f31694f = new Paint();
        Path path2 = new Path();
        this.f31695g = path2;
        path2.moveTo(5.0f, 21.0f);
        this.f31695g.cubicTo(4.44772f, 21.0f, 4.0f, 21.4477f, 4.0f, 22.0f);
        this.f31695g.lineTo(4.0f, 24.0f);
        this.f31695g.cubicTo(4.0f, 24.5523f, 4.44772f, 25.0f, 5.0f, 25.0f);
        this.f31695g.lineTo(28.0f, 25.0f);
        this.f31695g.cubicTo(28.5523f, 25.0f, 29.0f, 24.5523f, 29.0f, 24.0f);
        this.f31695g.lineTo(29.0f, 22.0f);
        this.f31695g.cubicTo(29.0f, 21.4477f, 28.5523f, 21.0f, 28.0f, 21.0f);
        this.f31695g.lineTo(5.0f, 21.0f);
        this.f31695g.close();
        this.f31695g.setFillType(Path.FillType.WINDING);
        this.f31694f.setStyle(Paint.Style.FILL);
        this.f31694f.setColor(-16777216);
        this.f30624a.add(this.f31694f);
        this.f31696h = new Paint();
        Path path3 = new Path();
        this.f31697i = path3;
        path3.moveTo(4.0f, 33.0f);
        this.f31697i.cubicTo(4.0f, 32.4477f, 4.44772f, 32.0f, 5.0f, 32.0f);
        this.f31697i.lineTo(22.0f, 32.0f);
        this.f31697i.cubicTo(22.5523f, 32.0f, 23.0f, 32.4477f, 23.0f, 33.0f);
        this.f31697i.lineTo(23.0f, 35.0f);
        this.f31697i.cubicTo(23.0f, 35.5523f, 22.5523f, 36.0f, 22.0f, 36.0f);
        this.f31697i.lineTo(5.0f, 36.0f);
        this.f31697i.cubicTo(4.44771f, 36.0f, 4.0f, 35.5523f, 4.0f, 35.0f);
        this.f31697i.lineTo(4.0f, 33.0f);
        this.f31697i.close();
        this.f31697i.setFillType(Path.FillType.WINDING);
        this.f31696h.setStyle(Paint.Style.FILL);
        this.f31696h.setColor(-16777216);
        this.f30624a.add(this.f31696h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31693e, this.f31692d);
        canvas.drawPath(this.f31695g, this.f31694f);
        canvas.drawPath(this.f31697i, this.f31696h);
    }
}
