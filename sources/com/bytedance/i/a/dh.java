package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class dh extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31410d;

    /* renamed from: e  reason: collision with root package name */
    Path f31411e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31412f;

    /* renamed from: g  reason: collision with root package name */
    Path f31413g;

    static {
        Covode.recordClassIndex(18225);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(29.2188f, 14.2227f);
        this.f30626c.cubicTo(28.9125f, 13.7631f, 28.2916f, 13.6389f, 27.8321f, 13.9453f);
        this.f30626c.lineTo(26.168f, 15.0547f);
        this.f30626c.cubicTo(25.7084f, 15.3611f, 25.5843f, 15.9819f, 25.8906f, 16.4415f);
        this.f30626c.lineTo(27.263f, 18.5f);
        this.f30626c.lineTo(16.0f, 18.5f);
        this.f30626c.cubicTo(15.4477f, 18.5f, 15.0f, 18.9477f, 15.0f, 19.5f);
        this.f30626c.lineTo(15.0f, 21.5f);
        this.f30626c.cubicTo(15.0f, 22.0523f, 15.4477f, 22.5f, 16.0f, 22.5f);
        this.f30626c.lineTo(31.0f, 22.5f);
        this.f30626c.cubicTo(31.7376f, 22.5f, 32.4153f, 22.094f, 32.7634f, 21.4437f);
        this.f30626c.cubicTo(33.1114f, 20.7934f, 33.0732f, 20.0043f, 32.6641f, 19.3906f);
        this.f30626c.lineTo(29.2188f, 14.2227f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31410d = new Paint();
        Path path = new Path();
        this.f31411e = path;
        path.moveTo(17.0f, 25.5f);
        this.f31411e.cubicTo(16.2624f, 25.5f, 15.5847f, 25.906f, 15.2367f, 26.5563f);
        this.f31411e.cubicTo(14.8886f, 27.2066f, 14.9268f, 27.9957f, 15.3359f, 28.6094f);
        this.f31411e.lineTo(18.7812f, 33.7774f);
        this.f31411e.cubicTo(19.0876f, 34.2369f, 19.7084f, 34.3611f, 20.168f, 34.0547f);
        this.f31411e.lineTo(21.8321f, 32.9453f);
        this.f31411e.cubicTo(22.2916f, 32.6389f, 22.4158f, 32.0181f, 22.1094f, 31.5585f);
        this.f31411e.lineTo(20.737f, 29.5f);
        this.f31411e.lineTo(32.0f, 29.5f);
        this.f31411e.cubicTo(32.5523f, 29.5f, 33.0f, 29.0523f, 33.0f, 28.5f);
        this.f31411e.lineTo(33.0f, 26.5f);
        this.f31411e.cubicTo(33.0f, 25.9477f, 32.5523f, 25.5f, 32.0f, 25.5f);
        this.f31411e.lineTo(17.0f, 25.5f);
        this.f31411e.close();
        this.f31411e.setFillType(Path.FillType.WINDING);
        this.f31410d.setStyle(Paint.Style.FILL);
        this.f31410d.setColor(-16777216);
        this.f30624a.add(this.f31410d);
        this.f31412f = new Paint();
        Path path2 = new Path();
        this.f31413g = path2;
        path2.moveTo(10.0f, 2.0f);
        this.f31413g.cubicTo(7.23858f, 2.0f, 5.0f, 4.23858f, 5.0f, 7.0f);
        this.f31413g.lineTo(5.0f, 41.0f);
        this.f31413g.cubicTo(5.0f, 43.7614f, 7.23858f, 46.0f, 10.0f, 46.0f);
        this.f31413g.lineTo(38.0f, 46.0f);
        this.f31413g.cubicTo(40.7614f, 46.0f, 43.0f, 43.7614f, 43.0f, 41.0f);
        this.f31413g.lineTo(43.0f, 7.0f);
        this.f31413g.cubicTo(43.0f, 4.23858f, 40.7614f, 2.0f, 38.0f, 2.0f);
        this.f31413g.lineTo(10.0f, 2.0f);
        this.f31413g.close();
        this.f31413g.moveTo(9.0f, 7.0f);
        this.f31413g.cubicTo(9.0f, 6.44772f, 9.44771f, 6.0f, 10.0f, 6.0f);
        this.f31413g.lineTo(38.0f, 6.0f);
        this.f31413g.cubicTo(38.5523f, 6.0f, 39.0f, 6.44772f, 39.0f, 7.0f);
        this.f31413g.lineTo(39.0f, 41.0f);
        this.f31413g.cubicTo(39.0f, 41.5523f, 38.5523f, 42.0f, 38.0f, 42.0f);
        this.f31413g.lineTo(10.0f, 42.0f);
        this.f31413g.cubicTo(9.44772f, 42.0f, 9.0f, 41.5523f, 9.0f, 41.0f);
        this.f31413g.lineTo(9.0f, 7.0f);
        this.f31413g.close();
        this.f31413g.setFillType(Path.FillType.EVEN_ODD);
        this.f31412f.setStyle(Paint.Style.FILL);
        this.f31412f.setColor(-16777216);
        this.f30624a.add(this.f31412f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31411e, this.f31410d);
        canvas.drawPath(this.f31413g, this.f31412f);
    }
}
