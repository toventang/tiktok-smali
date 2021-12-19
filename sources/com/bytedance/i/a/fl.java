package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fl extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31438d;

    /* renamed from: e  reason: collision with root package name */
    Path f31439e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31440f;

    /* renamed from: g  reason: collision with root package name */
    Path f31441g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31442h;

    /* renamed from: i  reason: collision with root package name */
    Path f31443i;

    static {
        Covode.recordClassIndex(18283);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.0f, 15.0f);
        this.f30626c.cubicTo(16.0f, 14.4477f, 16.4477f, 14.0f, 17.0f, 14.0f);
        this.f30626c.lineTo(31.0f, 14.0f);
        this.f30626c.cubicTo(31.5523f, 14.0f, 32.0f, 14.4477f, 32.0f, 15.0f);
        this.f30626c.lineTo(32.0f, 17.0f);
        this.f30626c.cubicTo(32.0f, 17.5523f, 31.5523f, 18.0f, 31.0f, 18.0f);
        this.f30626c.lineTo(17.0f, 18.0f);
        this.f30626c.cubicTo(16.4477f, 18.0f, 16.0f, 17.5523f, 16.0f, 17.0f);
        this.f30626c.lineTo(16.0f, 15.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31438d = new Paint();
        Path path = new Path();
        this.f31439e = path;
        path.moveTo(16.0f, 23.0f);
        this.f31439e.cubicTo(16.0f, 22.4477f, 16.4477f, 22.0f, 17.0f, 22.0f);
        this.f31439e.lineTo(31.0f, 22.0f);
        this.f31439e.cubicTo(31.5523f, 22.0f, 32.0f, 22.4477f, 32.0f, 23.0f);
        this.f31439e.lineTo(32.0f, 25.0f);
        this.f31439e.cubicTo(32.0f, 25.5523f, 31.5523f, 26.0f, 31.0f, 26.0f);
        this.f31439e.lineTo(17.0f, 26.0f);
        this.f31439e.cubicTo(16.4477f, 26.0f, 16.0f, 25.5523f, 16.0f, 25.0f);
        this.f31439e.lineTo(16.0f, 23.0f);
        this.f31439e.close();
        this.f31439e.setFillType(Path.FillType.WINDING);
        this.f31438d.setStyle(Paint.Style.FILL);
        this.f31438d.setColor(-16777216);
        this.f30624a.add(this.f31438d);
        this.f31440f = new Paint();
        Path path2 = new Path();
        this.f31441g = path2;
        path2.moveTo(17.0f, 30.0f);
        this.f31441g.cubicTo(16.4477f, 30.0f, 16.0f, 30.4477f, 16.0f, 31.0f);
        this.f31441g.lineTo(16.0f, 33.0f);
        this.f31441g.cubicTo(16.0f, 33.5523f, 16.4477f, 34.0f, 17.0f, 34.0f);
        this.f31441g.lineTo(25.0f, 34.0f);
        this.f31441g.cubicTo(25.5523f, 34.0f, 26.0f, 33.5523f, 26.0f, 33.0f);
        this.f31441g.lineTo(26.0f, 31.0f);
        this.f31441g.cubicTo(26.0f, 30.4477f, 25.5523f, 30.0f, 25.0f, 30.0f);
        this.f31441g.lineTo(17.0f, 30.0f);
        this.f31441g.close();
        this.f31441g.setFillType(Path.FillType.WINDING);
        this.f31440f.setStyle(Paint.Style.FILL);
        this.f31440f.setColor(-16777216);
        this.f30624a.add(this.f31440f);
        this.f31442h = new Paint();
        Path path3 = new Path();
        this.f31443i = path3;
        path3.moveTo(19.0f, 2.8f);
        this.f31443i.cubicTo(19.0f, 2.35817f, 18.5523f, 2.0f, 18.0f, 2.0f);
        this.f31443i.lineTo(16.0f, 2.0f);
        this.f31443i.cubicTo(15.4477f, 2.0f, 15.0f, 2.35817f, 15.0f, 2.8f);
        this.f31443i.lineTo(15.0f, 4.0f);
        this.f31443i.lineTo(10.0f, 4.0f);
        this.f31443i.cubicTo(7.79086f, 4.0f, 6.0f, 5.79086f, 6.0f, 8.0f);
        this.f31443i.lineTo(6.0f, 40.0f);
        this.f31443i.cubicTo(6.0f, 42.2091f, 7.79086f, 44.0f, 10.0f, 44.0f);
        this.f31443i.lineTo(38.0f, 44.0f);
        this.f31443i.cubicTo(40.2091f, 44.0f, 42.0f, 42.2091f, 42.0f, 40.0f);
        this.f31443i.lineTo(42.0f, 8.0f);
        this.f31443i.cubicTo(42.0f, 5.79086f, 40.2091f, 4.0f, 38.0f, 4.0f);
        this.f31443i.lineTo(33.0f, 4.0f);
        this.f31443i.lineTo(33.0f, 2.8f);
        this.f31443i.cubicTo(33.0f, 2.35817f, 32.5523f, 2.0f, 32.0f, 2.0f);
        this.f31443i.lineTo(30.0f, 2.0f);
        this.f31443i.cubicTo(29.4477f, 2.0f, 29.0f, 2.35817f, 29.0f, 2.8f);
        this.f31443i.lineTo(29.0f, 4.0f);
        this.f31443i.lineTo(19.0f, 4.0f);
        this.f31443i.lineTo(19.0f, 2.8f);
        this.f31443i.close();
        this.f31443i.moveTo(29.0f, 8.0f);
        this.f31443i.lineTo(19.0f, 8.0f);
        this.f31443i.lineTo(19.0f, 9.2f);
        this.f31443i.cubicTo(19.0f, 9.64183f, 18.5523f, 10.0f, 18.0f, 10.0f);
        this.f31443i.lineTo(16.0f, 10.0f);
        this.f31443i.cubicTo(15.4477f, 10.0f, 15.0f, 9.64183f, 15.0f, 9.2f);
        this.f31443i.lineTo(15.0f, 8.0f);
        this.f31443i.lineTo(10.0f, 8.0f);
        this.f31443i.lineTo(10.0f, 40.0f);
        this.f31443i.lineTo(38.0f, 40.0f);
        this.f31443i.lineTo(38.0f, 8.0f);
        this.f31443i.lineTo(33.0f, 8.0f);
        this.f31443i.lineTo(33.0f, 9.2f);
        this.f31443i.cubicTo(33.0f, 9.64183f, 32.5523f, 10.0f, 32.0f, 10.0f);
        this.f31443i.lineTo(30.0f, 10.0f);
        this.f31443i.cubicTo(29.4477f, 10.0f, 29.0f, 9.64183f, 29.0f, 9.2f);
        this.f31443i.lineTo(29.0f, 8.0f);
        this.f31443i.close();
        this.f31443i.setFillType(Path.FillType.EVEN_ODD);
        this.f31442h.setStyle(Paint.Style.FILL);
        this.f31442h.setColor(-16777216);
        this.f30624a.add(this.f31442h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31439e, this.f31438d);
        canvas.drawPath(this.f31441g, this.f31440f);
        canvas.drawPath(this.f31443i, this.f31442h);
    }
}
