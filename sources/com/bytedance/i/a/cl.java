package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cl extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31339d;

    /* renamed from: e  reason: collision with root package name */
    Path f31340e;

    static {
        Covode.recordClassIndex(18202);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(0.0f, 5.0f);
        this.f30626c.cubicTo(0.0f, 2.23858f, 2.23858f, 0.0f, 5.0f, 0.0f);
        this.f30626c.lineTo(43.0f, 0.0f);
        this.f30626c.cubicTo(45.7614f, 0.0f, 48.0f, 2.23858f, 48.0f, 5.0f);
        this.f30626c.lineTo(48.0f, 43.0f);
        this.f30626c.cubicTo(48.0f, 45.7614f, 45.7614f, 48.0f, 43.0f, 48.0f);
        this.f30626c.lineTo(5.0f, 48.0f);
        this.f30626c.cubicTo(2.23858f, 48.0f, 0.0f, 45.7614f, 0.0f, 43.0f);
        this.f30626c.lineTo(0.0f, 5.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-119723);
        this.f31339d = new Paint();
        Path path = new Path();
        this.f31340e = path;
        path.moveTo(42.0f, 24.0f);
        this.f31340e.cubicTo(42.0f, 29.6545f, 39.3927f, 34.7001f, 35.3147f, 38.0f);
        this.f31340e.lineTo(41.0f, 38.0f);
        this.f31340e.cubicTo(41.5523f, 38.0f, 42.0f, 38.4477f, 42.0f, 39.0f);
        this.f31340e.lineTo(42.0f, 41.0f);
        this.f31340e.cubicTo(42.0f, 41.5523f, 41.5523f, 42.0f, 41.0f, 42.0f);
        this.f31340e.lineTo(24.0f, 42.0f);
        this.f31340e.cubicTo(14.0589f, 42.0f, 6.0f, 33.9411f, 6.0f, 24.0f);
        this.f31340e.cubicTo(6.0f, 14.0589f, 14.0589f, 6.0f, 24.0f, 6.0f);
        this.f31340e.cubicTo(33.9411f, 6.0f, 42.0f, 14.0589f, 42.0f, 24.0f);
        this.f31340e.close();
        this.f31340e.moveTo(27.0f, 16.0f);
        this.f31340e.cubicTo(27.0f, 17.6569f, 25.6569f, 19.0f, 24.0f, 19.0f);
        this.f31340e.cubicTo(22.3431f, 19.0f, 21.0f, 17.6569f, 21.0f, 16.0f);
        this.f31340e.cubicTo(21.0f, 14.3431f, 22.3431f, 13.0f, 24.0f, 13.0f);
        this.f31340e.cubicTo(25.6569f, 13.0f, 27.0f, 14.3431f, 27.0f, 16.0f);
        this.f31340e.close();
        this.f31340e.moveTo(27.0f, 32.0f);
        this.f31340e.cubicTo(27.0f, 33.6569f, 25.6569f, 35.0f, 24.0f, 35.0f);
        this.f31340e.cubicTo(22.3431f, 35.0f, 21.0f, 33.6569f, 21.0f, 32.0f);
        this.f31340e.cubicTo(21.0f, 30.3431f, 22.3431f, 29.0f, 24.0f, 29.0f);
        this.f31340e.cubicTo(25.6569f, 29.0f, 27.0f, 30.3431f, 27.0f, 32.0f);
        this.f31340e.close();
        this.f31340e.moveTo(16.0f, 27.0f);
        this.f31340e.cubicTo(17.6569f, 27.0f, 19.0f, 25.6569f, 19.0f, 24.0f);
        this.f31340e.cubicTo(19.0f, 22.3431f, 17.6569f, 21.0f, 16.0f, 21.0f);
        this.f31340e.cubicTo(14.3431f, 21.0f, 13.0f, 22.3431f, 13.0f, 24.0f);
        this.f31340e.cubicTo(13.0f, 25.6569f, 14.3431f, 27.0f, 16.0f, 27.0f);
        this.f31340e.close();
        this.f31340e.moveTo(35.0f, 24.0f);
        this.f31340e.cubicTo(35.0f, 25.6569f, 33.6569f, 27.0f, 32.0f, 27.0f);
        this.f31340e.cubicTo(30.3431f, 27.0f, 29.0f, 25.6569f, 29.0f, 24.0f);
        this.f31340e.cubicTo(29.0f, 22.3431f, 30.3431f, 21.0f, 32.0f, 21.0f);
        this.f31340e.cubicTo(33.6569f, 21.0f, 35.0f, 22.3431f, 35.0f, 24.0f);
        this.f31340e.close();
        this.f31340e.setFillType(Path.FillType.EVEN_ODD);
        this.f31339d.setStyle(Paint.Style.FILL);
        this.f31339d.setColor(-1);
        this.f30624a.add(this.f31339d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31340e, this.f31339d);
    }
}
