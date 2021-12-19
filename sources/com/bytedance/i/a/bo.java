package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bo extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31305d;

    /* renamed from: e  reason: collision with root package name */
    Path f31306e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31307f;

    /* renamed from: g  reason: collision with root package name */
    Path f31308g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31309h;

    /* renamed from: i  reason: collision with root package name */
    Path f31310i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31311j;

    /* renamed from: k  reason: collision with root package name */
    Path f31312k;

    /* renamed from: l  reason: collision with root package name */
    Paint f31313l;

    /* renamed from: m  reason: collision with root package name */
    Path f31314m;
    Paint n;
    Path o;
    Paint p;
    Path q;

    static {
        Covode.recordClassIndex(18178);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(15.0f, 14.0f);
        this.f30626c.cubicTo(14.4477f, 14.0f, 14.0f, 14.4477f, 14.0f, 15.0f);
        this.f30626c.lineTo(14.0f, 17.0f);
        this.f30626c.cubicTo(14.0f, 17.5523f, 14.4477f, 18.0f, 15.0f, 18.0f);
        this.f30626c.lineTo(17.0f, 18.0f);
        this.f30626c.cubicTo(17.5523f, 18.0f, 18.0f, 17.5523f, 18.0f, 17.0f);
        this.f30626c.lineTo(18.0f, 15.0f);
        this.f30626c.cubicTo(18.0f, 14.4477f, 17.5523f, 14.0f, 17.0f, 14.0f);
        this.f30626c.lineTo(15.0f, 14.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31305d = new Paint();
        Path path = new Path();
        this.f31306e = path;
        path.moveTo(14.0f, 31.0f);
        this.f31306e.cubicTo(14.0f, 30.4477f, 14.4477f, 30.0f, 15.0f, 30.0f);
        this.f31306e.lineTo(33.0f, 30.0f);
        this.f31306e.cubicTo(33.5523f, 30.0f, 34.0f, 30.4477f, 34.0f, 31.0f);
        this.f31306e.lineTo(34.0f, 33.0f);
        this.f31306e.cubicTo(34.0f, 33.5523f, 33.5523f, 34.0f, 33.0f, 34.0f);
        this.f31306e.lineTo(15.0f, 34.0f);
        this.f31306e.cubicTo(14.4477f, 34.0f, 14.0f, 33.5523f, 14.0f, 33.0f);
        this.f31306e.lineTo(14.0f, 31.0f);
        this.f31306e.close();
        this.f31306e.setFillType(Path.FillType.WINDING);
        this.f31305d.setStyle(Paint.Style.FILL);
        this.f31305d.setColor(-16777216);
        this.f30624a.add(this.f31305d);
        this.f31307f = new Paint();
        Path path2 = new Path();
        this.f31308g = path2;
        path2.moveTo(15.0f, 22.0f);
        this.f31308g.cubicTo(14.4477f, 22.0f, 14.0f, 22.4477f, 14.0f, 23.0f);
        this.f31308g.lineTo(14.0f, 25.0f);
        this.f31308g.cubicTo(14.0f, 25.5523f, 14.4477f, 26.0f, 15.0f, 26.0f);
        this.f31308g.lineTo(17.0f, 26.0f);
        this.f31308g.cubicTo(17.5523f, 26.0f, 18.0f, 25.5523f, 18.0f, 25.0f);
        this.f31308g.lineTo(18.0f, 23.0f);
        this.f31308g.cubicTo(18.0f, 22.4477f, 17.5523f, 22.0f, 17.0f, 22.0f);
        this.f31308g.lineTo(15.0f, 22.0f);
        this.f31308g.close();
        this.f31308g.setFillType(Path.FillType.WINDING);
        this.f31307f.setStyle(Paint.Style.FILL);
        this.f31307f.setColor(-16777216);
        this.f30624a.add(this.f31307f);
        this.f31309h = new Paint();
        Path path3 = new Path();
        this.f31310i = path3;
        path3.moveTo(22.0f, 15.0f);
        this.f31310i.cubicTo(22.0f, 14.4477f, 22.4477f, 14.0f, 23.0f, 14.0f);
        this.f31310i.lineTo(25.0f, 14.0f);
        this.f31310i.cubicTo(25.5523f, 14.0f, 26.0f, 14.4477f, 26.0f, 15.0f);
        this.f31310i.lineTo(26.0f, 17.0f);
        this.f31310i.cubicTo(26.0f, 17.5523f, 25.5523f, 18.0f, 25.0f, 18.0f);
        this.f31310i.lineTo(23.0f, 18.0f);
        this.f31310i.cubicTo(22.4477f, 18.0f, 22.0f, 17.5523f, 22.0f, 17.0f);
        this.f31310i.lineTo(22.0f, 15.0f);
        this.f31310i.close();
        this.f31310i.setFillType(Path.FillType.WINDING);
        this.f31309h.setStyle(Paint.Style.FILL);
        this.f31309h.setColor(-16777216);
        this.f30624a.add(this.f31309h);
        this.f31311j = new Paint();
        Path path4 = new Path();
        this.f31312k = path4;
        path4.moveTo(23.0f, 22.0f);
        this.f31312k.cubicTo(22.4477f, 22.0f, 22.0f, 22.4477f, 22.0f, 23.0f);
        this.f31312k.lineTo(22.0f, 25.0f);
        this.f31312k.cubicTo(22.0f, 25.5523f, 22.4477f, 26.0f, 23.0f, 26.0f);
        this.f31312k.lineTo(25.0f, 26.0f);
        this.f31312k.cubicTo(25.5523f, 26.0f, 26.0f, 25.5523f, 26.0f, 25.0f);
        this.f31312k.lineTo(26.0f, 23.0f);
        this.f31312k.cubicTo(26.0f, 22.4477f, 25.5523f, 22.0f, 25.0f, 22.0f);
        this.f31312k.lineTo(23.0f, 22.0f);
        this.f31312k.close();
        this.f31312k.setFillType(Path.FillType.WINDING);
        this.f31311j.setStyle(Paint.Style.FILL);
        this.f31311j.setColor(-16777216);
        this.f30624a.add(this.f31311j);
        this.f31313l = new Paint();
        Path path5 = new Path();
        this.f31314m = path5;
        path5.moveTo(30.0f, 15.0f);
        this.f31314m.cubicTo(30.0f, 14.4477f, 30.4477f, 14.0f, 31.0f, 14.0f);
        this.f31314m.lineTo(33.0f, 14.0f);
        this.f31314m.cubicTo(33.5523f, 14.0f, 34.0f, 14.4477f, 34.0f, 15.0f);
        this.f31314m.lineTo(34.0f, 17.0f);
        this.f31314m.cubicTo(34.0f, 17.5523f, 33.5523f, 18.0f, 33.0f, 18.0f);
        this.f31314m.lineTo(31.0f, 18.0f);
        this.f31314m.cubicTo(30.4477f, 18.0f, 30.0f, 17.5523f, 30.0f, 17.0f);
        this.f31314m.lineTo(30.0f, 15.0f);
        this.f31314m.close();
        this.f31314m.setFillType(Path.FillType.WINDING);
        this.f31313l.setStyle(Paint.Style.FILL);
        this.f31313l.setColor(-16777216);
        this.f30624a.add(this.f31313l);
        this.n = new Paint();
        Path path6 = new Path();
        this.o = path6;
        path6.moveTo(31.0f, 22.0f);
        this.o.cubicTo(30.4477f, 22.0f, 30.0f, 22.4477f, 30.0f, 23.0f);
        this.o.lineTo(30.0f, 25.0f);
        this.o.cubicTo(30.0f, 25.5523f, 30.4477f, 26.0f, 31.0f, 26.0f);
        this.o.lineTo(33.0f, 26.0f);
        this.o.cubicTo(33.5523f, 26.0f, 34.0f, 25.5523f, 34.0f, 25.0f);
        this.o.lineTo(34.0f, 23.0f);
        this.o.cubicTo(34.0f, 22.4477f, 33.5523f, 22.0f, 33.0f, 22.0f);
        this.o.lineTo(31.0f, 22.0f);
        this.o.close();
        this.o.setFillType(Path.FillType.WINDING);
        this.n.setStyle(Paint.Style.FILL);
        this.n.setColor(-16777216);
        this.f30624a.add(this.n);
        this.p = new Paint();
        Path path7 = new Path();
        this.q = path7;
        path7.moveTo(24.0f, 2.5f);
        this.q.cubicTo(12.1259f, 2.5f, 2.5f, 12.1259f, 2.5f, 24.0f);
        this.q.cubicTo(2.5f, 35.8741f, 12.1259f, 45.5f, 24.0f, 45.5f);
        this.q.cubicTo(35.8741f, 45.5f, 45.5f, 35.8741f, 45.5f, 24.0f);
        this.q.cubicTo(45.5f, 12.1259f, 35.8741f, 2.5f, 24.0f, 2.5f);
        this.q.close();
        this.q.moveTo(5.5f, 24.0f);
        this.q.cubicTo(5.5f, 13.7827f, 13.7827f, 5.5f, 24.0f, 5.5f);
        this.q.cubicTo(34.2173f, 5.5f, 42.5f, 13.7827f, 42.5f, 24.0f);
        this.q.cubicTo(42.5f, 34.2173f, 34.2173f, 42.5f, 24.0f, 42.5f);
        this.q.cubicTo(13.7827f, 42.5f, 5.5f, 34.2173f, 5.5f, 24.0f);
        this.q.close();
        this.q.setFillType(Path.FillType.EVEN_ODD);
        this.p.setStyle(Paint.Style.FILL);
        this.p.setColor(-16777216);
        this.f30624a.add(this.p);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31306e, this.f31305d);
        canvas.drawPath(this.f31308g, this.f31307f);
        canvas.drawPath(this.f31310i, this.f31309h);
        canvas.drawPath(this.f31312k, this.f31311j);
        canvas.drawPath(this.f31314m, this.f31313l);
        canvas.drawPath(this.o, this.n);
        canvas.drawPath(this.q, this.p);
    }
}
