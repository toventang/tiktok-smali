package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class iz extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31621d;

    /* renamed from: e  reason: collision with root package name */
    Path f31622e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31623f;

    /* renamed from: g  reason: collision with root package name */
    Path f31624g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31625h;

    /* renamed from: i  reason: collision with root package name */
    Path f31626i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31627j;

    /* renamed from: k  reason: collision with root package name */
    Path f31628k;

    /* renamed from: l  reason: collision with root package name */
    Paint f31629l;

    /* renamed from: m  reason: collision with root package name */
    Path f31630m;
    Paint n;
    Path o;
    Paint p;
    Path q;

    static {
        Covode.recordClassIndex(18378);
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
        this.f31621d = new Paint();
        Path path = new Path();
        this.f31622e = path;
        path.moveTo(14.0f, 31.0f);
        this.f31622e.cubicTo(14.0f, 30.4477f, 14.4477f, 30.0f, 15.0f, 30.0f);
        this.f31622e.lineTo(33.0f, 30.0f);
        this.f31622e.cubicTo(33.5523f, 30.0f, 34.0f, 30.4477f, 34.0f, 31.0f);
        this.f31622e.lineTo(34.0f, 33.0f);
        this.f31622e.cubicTo(34.0f, 33.5523f, 33.5523f, 34.0f, 33.0f, 34.0f);
        this.f31622e.lineTo(15.0f, 34.0f);
        this.f31622e.cubicTo(14.4477f, 34.0f, 14.0f, 33.5523f, 14.0f, 33.0f);
        this.f31622e.lineTo(14.0f, 31.0f);
        this.f31622e.close();
        this.f31622e.setFillType(Path.FillType.WINDING);
        this.f31621d.setStyle(Paint.Style.FILL);
        this.f31621d.setColor(-16777216);
        this.f30624a.add(this.f31621d);
        this.f31623f = new Paint();
        Path path2 = new Path();
        this.f31624g = path2;
        path2.moveTo(15.0f, 22.0f);
        this.f31624g.cubicTo(14.4477f, 22.0f, 14.0f, 22.4477f, 14.0f, 23.0f);
        this.f31624g.lineTo(14.0f, 25.0f);
        this.f31624g.cubicTo(14.0f, 25.5523f, 14.4477f, 26.0f, 15.0f, 26.0f);
        this.f31624g.lineTo(17.0f, 26.0f);
        this.f31624g.cubicTo(17.5523f, 26.0f, 18.0f, 25.5523f, 18.0f, 25.0f);
        this.f31624g.lineTo(18.0f, 23.0f);
        this.f31624g.cubicTo(18.0f, 22.4477f, 17.5523f, 22.0f, 17.0f, 22.0f);
        this.f31624g.lineTo(15.0f, 22.0f);
        this.f31624g.close();
        this.f31624g.setFillType(Path.FillType.WINDING);
        this.f31623f.setStyle(Paint.Style.FILL);
        this.f31623f.setColor(-16777216);
        this.f30624a.add(this.f31623f);
        this.f31625h = new Paint();
        Path path3 = new Path();
        this.f31626i = path3;
        path3.moveTo(22.0f, 15.0f);
        this.f31626i.cubicTo(22.0f, 14.4477f, 22.4477f, 14.0f, 23.0f, 14.0f);
        this.f31626i.lineTo(25.0f, 14.0f);
        this.f31626i.cubicTo(25.5523f, 14.0f, 26.0f, 14.4477f, 26.0f, 15.0f);
        this.f31626i.lineTo(26.0f, 17.0f);
        this.f31626i.cubicTo(26.0f, 17.5523f, 25.5523f, 18.0f, 25.0f, 18.0f);
        this.f31626i.lineTo(23.0f, 18.0f);
        this.f31626i.cubicTo(22.4477f, 18.0f, 22.0f, 17.5523f, 22.0f, 17.0f);
        this.f31626i.lineTo(22.0f, 15.0f);
        this.f31626i.close();
        this.f31626i.setFillType(Path.FillType.WINDING);
        this.f31625h.setStyle(Paint.Style.FILL);
        this.f31625h.setColor(-16777216);
        this.f30624a.add(this.f31625h);
        this.f31627j = new Paint();
        Path path4 = new Path();
        this.f31628k = path4;
        path4.moveTo(23.0f, 22.0f);
        this.f31628k.cubicTo(22.4477f, 22.0f, 22.0f, 22.4477f, 22.0f, 23.0f);
        this.f31628k.lineTo(22.0f, 25.0f);
        this.f31628k.cubicTo(22.0f, 25.5523f, 22.4477f, 26.0f, 23.0f, 26.0f);
        this.f31628k.lineTo(25.0f, 26.0f);
        this.f31628k.cubicTo(25.5523f, 26.0f, 26.0f, 25.5523f, 26.0f, 25.0f);
        this.f31628k.lineTo(26.0f, 23.0f);
        this.f31628k.cubicTo(26.0f, 22.4477f, 25.5523f, 22.0f, 25.0f, 22.0f);
        this.f31628k.lineTo(23.0f, 22.0f);
        this.f31628k.close();
        this.f31628k.setFillType(Path.FillType.WINDING);
        this.f31627j.setStyle(Paint.Style.FILL);
        this.f31627j.setColor(-16777216);
        this.f30624a.add(this.f31627j);
        this.f31629l = new Paint();
        Path path5 = new Path();
        this.f31630m = path5;
        path5.moveTo(30.0f, 15.0f);
        this.f31630m.cubicTo(30.0f, 14.4477f, 30.4477f, 14.0f, 31.0f, 14.0f);
        this.f31630m.lineTo(33.0f, 14.0f);
        this.f31630m.cubicTo(33.5523f, 14.0f, 34.0f, 14.4477f, 34.0f, 15.0f);
        this.f31630m.lineTo(34.0f, 17.0f);
        this.f31630m.cubicTo(34.0f, 17.5523f, 33.5523f, 18.0f, 33.0f, 18.0f);
        this.f31630m.lineTo(31.0f, 18.0f);
        this.f31630m.cubicTo(30.4477f, 18.0f, 30.0f, 17.5523f, 30.0f, 17.0f);
        this.f31630m.lineTo(30.0f, 15.0f);
        this.f31630m.close();
        this.f31630m.setFillType(Path.FillType.WINDING);
        this.f31629l.setStyle(Paint.Style.FILL);
        this.f31629l.setColor(-16777216);
        this.f30624a.add(this.f31629l);
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
        path7.moveTo(24.0f, 2.0f);
        this.q.cubicTo(11.8497f, 2.0f, 2.0f, 11.8497f, 2.0f, 24.0f);
        this.q.cubicTo(2.0f, 36.1503f, 11.8497f, 46.0f, 24.0f, 46.0f);
        this.q.cubicTo(36.1503f, 46.0f, 46.0f, 36.1503f, 46.0f, 24.0f);
        this.q.cubicTo(46.0f, 11.8497f, 36.1503f, 2.0f, 24.0f, 2.0f);
        this.q.close();
        this.q.moveTo(6.0f, 24.0f);
        this.q.cubicTo(6.0f, 14.0589f, 14.0589f, 6.0f, 24.0f, 6.0f);
        this.q.cubicTo(33.9411f, 6.0f, 42.0f, 14.0589f, 42.0f, 24.0f);
        this.q.cubicTo(42.0f, 33.9411f, 33.9411f, 42.0f, 24.0f, 42.0f);
        this.q.cubicTo(14.0589f, 42.0f, 6.0f, 33.9411f, 6.0f, 24.0f);
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
        canvas.drawPath(this.f31622e, this.f31621d);
        canvas.drawPath(this.f31624g, this.f31623f);
        canvas.drawPath(this.f31626i, this.f31625h);
        canvas.drawPath(this.f31628k, this.f31627j);
        canvas.drawPath(this.f31630m, this.f31629l);
        canvas.drawPath(this.o, this.n);
        canvas.drawPath(this.q, this.p);
    }
}
