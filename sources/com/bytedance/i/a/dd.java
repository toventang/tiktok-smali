package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class dd extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31406d;

    /* renamed from: e  reason: collision with root package name */
    Path f31407e;

    static {
        Covode.recordClassIndex(18221);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 42.0f);
        this.f30626c.cubicTo(33.9411f, 42.0f, 42.0f, 33.9411f, 42.0f, 24.0f);
        this.f30626c.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f30626c.cubicTo(14.0589f, 6.0f, 6.0f, 14.0589f, 6.0f, 24.0f);
        this.f30626c.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 46.0f);
        this.f30626c.cubicTo(36.1503f, 46.0f, 46.0f, 36.1503f, 46.0f, 24.0f);
        this.f30626c.cubicTo(46.0f, 11.8497f, 36.1503f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(11.8497f, 2.0f, 2.0f, 11.8497f, 2.0f, 24.0f);
        this.f30626c.cubicTo(2.0f, 36.1503f, 11.8497f, 46.0f, 24.0f, 46.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31406d = new Paint();
        Path path = new Path();
        this.f31407e = path;
        path.moveTo(13.5858f, 22.5858f);
        this.f31407e.lineTo(22.8787f, 13.2929f);
        this.f31407e.cubicTo(23.2692f, 12.9024f, 23.9024f, 12.9024f, 24.2929f, 13.2929f);
        this.f31407e.lineTo(25.7071f, 14.7071f);
        this.f31407e.cubicTo(26.0976f, 15.0976f, 26.0976f, 15.7308f, 25.7071f, 16.1213f);
        this.f31407e.lineTo(19.8284f, 22.0f);
        this.f31407e.lineTo(34.0f, 22.0f);
        this.f31407e.cubicTo(34.5523f, 22.0f, 35.0f, 22.4477f, 35.0f, 23.0f);
        this.f31407e.lineTo(35.0f, 25.0f);
        this.f31407e.cubicTo(35.0f, 25.5523f, 34.5523f, 26.0f, 34.0f, 26.0f);
        this.f31407e.lineTo(19.8284f, 26.0f);
        this.f31407e.cubicTo(19.8284f, 26.0f, 25.3166f, 31.4882f, 25.7071f, 31.8787f);
        this.f31407e.cubicTo(26.0976f, 32.2692f, 26.0976f, 32.9024f, 25.7071f, 33.2929f);
        this.f31407e.cubicTo(25.3166f, 33.6834f, 24.6834f, 34.3166f, 24.2929f, 34.7071f);
        this.f31407e.cubicTo(23.9024f, 35.0976f, 23.2692f, 35.0976f, 22.8787f, 34.7071f);
        this.f31407e.cubicTo(22.4882f, 34.3166f, 13.5858f, 25.4142f, 13.5858f, 25.4142f);
        this.f31407e.cubicTo(12.8047f, 24.6332f, 12.8047f, 23.3668f, 13.5858f, 22.5858f);
        this.f31407e.close();
        this.f31407e.setFillType(Path.FillType.EVEN_ODD);
        this.f31406d.setStyle(Paint.Style.FILL);
        this.f31406d.setColor(-16777216);
        this.f30624a.add(this.f31406d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31407e, this.f31406d);
    }
}
