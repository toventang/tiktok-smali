package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pa extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31768d;

    /* renamed from: e  reason: collision with root package name */
    Path f31769e;

    static {
        Covode.recordClassIndex(18542);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 6.0f);
        this.f30626c.cubicTo(14.0589f, 6.0f, 6.0f, 14.0589f, 6.0f, 24.0f);
        this.f30626c.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f30626c.cubicTo(33.9411f, 42.0f, 42.0f, 33.9411f, 42.0f, 24.0f);
        this.f30626c.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.moveTo(2.0f, 24.0f);
        this.f30626c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f30626c.cubicTo(46.0f, 36.1503f, 36.1503f, 46.0f, 24.0f, 46.0f);
        this.f30626c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31768d = new Paint();
        Path path = new Path();
        this.f31769e = path;
        path.moveTo(29.1379f, 12.0f);
        this.f31769e.cubicTo(29.1379f, 15.0584f, 31.7072f, 17.6364f, 35.0f, 17.6364f);
        this.f31769e.lineTo(35.0f, 21.6364f);
        this.f31769e.cubicTo(32.8163f, 21.6364f, 30.7837f, 20.9375f, 29.1379f, 19.7487f);
        this.f31769e.lineTo(29.1379f, 27.5909f);
        this.f31769e.cubicTo(29.1379f, 31.7374f, 25.6939f, 35.0f, 21.569f, 35.0f);
        this.f31769e.cubicTo(17.4441f, 35.0f, 14.0f, 31.7374f, 14.0f, 27.5909f);
        this.f31769e.cubicTo(14.0f, 23.4445f, 17.4441f, 20.1818f, 21.569f, 20.1818f);
        this.f31769e.lineTo(21.569f, 24.1818f);
        this.f31769e.cubicTo(19.5426f, 24.1818f, 18.0f, 25.7626f, 18.0f, 27.5909f);
        this.f31769e.cubicTo(18.0f, 29.4192f, 19.5426f, 31.0f, 21.569f, 31.0f);
        this.f31769e.cubicTo(23.5954f, 31.0f, 25.1379f, 29.4192f, 25.1379f, 27.5909f);
        this.f31769e.lineTo(25.1379f, 12.0f);
        this.f31769e.lineTo(29.1379f, 12.0f);
        this.f31769e.close();
        this.f31769e.setFillType(Path.FillType.EVEN_ODD);
        this.f31768d.setStyle(Paint.Style.FILL);
        this.f31768d.setColor(-16777216);
        this.f30624a.add(this.f31768d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31769e, this.f31768d);
    }
}
