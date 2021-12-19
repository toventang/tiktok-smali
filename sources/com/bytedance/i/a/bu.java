package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bu extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31315d;

    /* renamed from: e  reason: collision with root package name */
    Path f31316e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31317f;

    /* renamed from: g  reason: collision with root package name */
    Path f31318g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31319h;

    /* renamed from: i  reason: collision with root package name */
    Path f31320i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31321j;

    /* renamed from: k  reason: collision with root package name */
    Path f31322k;

    /* renamed from: l  reason: collision with root package name */
    Paint f31323l;

    /* renamed from: m  reason: collision with root package name */
    Path f31324m;
    Paint n;
    Path o;

    static {
        Covode.recordClassIndex(18184);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(2.5f, 4.0f);
        this.f30626c.cubicTo(2.5f, 3.17157f, 3.17157f, 2.5f, 4.0f, 2.5f);
        this.f30626c.lineTo(15.5f, 2.5f);
        this.f30626c.cubicTo(15.7761f, 2.5f, 16.0f, 2.72386f, 16.0f, 3.0f);
        this.f30626c.lineTo(16.0f, 5.0f);
        this.f30626c.cubicTo(16.0f, 5.27614f, 15.7761f, 5.5f, 15.5f, 5.5f);
        this.f30626c.lineTo(6.0f, 5.5f);
        this.f30626c.cubicTo(5.72386f, 5.5f, 5.5f, 5.72386f, 5.5f, 6.0f);
        this.f30626c.lineTo(5.5f, 15.5f);
        this.f30626c.cubicTo(5.5f, 15.7761f, 5.27614f, 16.0f, 5.0f, 16.0f);
        this.f30626c.lineTo(3.0f, 16.0f);
        this.f30626c.cubicTo(2.72386f, 16.0f, 2.5f, 15.7761f, 2.5f, 15.5f);
        this.f30626c.lineTo(2.5f, 4.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31315d = new Paint();
        Path path = new Path();
        this.f31316e = path;
        path.moveTo(45.5f, 44.0f);
        this.f31316e.cubicTo(45.5f, 44.8284f, 44.8284f, 45.5f, 44.0f, 45.5f);
        this.f31316e.lineTo(32.5f, 45.5f);
        this.f31316e.cubicTo(32.2239f, 45.5f, 32.0f, 45.2761f, 32.0f, 45.0f);
        this.f31316e.lineTo(32.0f, 43.0f);
        this.f31316e.cubicTo(32.0f, 42.7239f, 32.2239f, 42.5f, 32.5f, 42.5f);
        this.f31316e.lineTo(42.0f, 42.5f);
        this.f31316e.cubicTo(42.2761f, 42.5f, 42.5f, 42.2761f, 42.5f, 42.0f);
        this.f31316e.lineTo(42.5f, 32.5f);
        this.f31316e.cubicTo(42.5f, 32.2239f, 42.7239f, 32.0f, 43.0f, 32.0f);
        this.f31316e.lineTo(45.0f, 32.0f);
        this.f31316e.cubicTo(45.2761f, 32.0f, 45.5f, 32.2239f, 45.5f, 32.5f);
        this.f31316e.lineTo(45.5f, 44.0f);
        this.f31316e.close();
        this.f31316e.setFillType(Path.FillType.EVEN_ODD);
        this.f31315d.setStyle(Paint.Style.FILL);
        this.f31315d.setColor(-16777216);
        this.f30624a.add(this.f31315d);
        this.f31317f = new Paint();
        Path path2 = new Path();
        this.f31318g = path2;
        path2.moveTo(44.0f, 2.5f);
        this.f31318g.cubicTo(44.8284f, 2.5f, 45.5f, 3.17157f, 45.5f, 4.0f);
        this.f31318g.lineTo(45.5f, 15.5f);
        this.f31318g.cubicTo(45.5f, 15.7761f, 45.2761f, 16.0f, 45.0f, 16.0f);
        this.f31318g.lineTo(43.0f, 16.0f);
        this.f31318g.cubicTo(42.7239f, 16.0f, 42.5f, 15.7761f, 42.5f, 15.5f);
        this.f31318g.lineTo(42.5f, 6.0f);
        this.f31318g.cubicTo(42.5f, 5.72386f, 42.2761f, 5.5f, 42.0f, 5.5f);
        this.f31318g.lineTo(32.5f, 5.5f);
        this.f31318g.cubicTo(32.2239f, 5.5f, 32.0f, 5.27614f, 32.0f, 5.0f);
        this.f31318g.lineTo(32.0f, 3.0f);
        this.f31318g.cubicTo(32.0f, 2.72386f, 32.2239f, 2.5f, 32.5f, 2.5f);
        this.f31318g.lineTo(44.0f, 2.5f);
        this.f31318g.close();
        this.f31318g.setFillType(Path.FillType.EVEN_ODD);
        this.f31317f.setStyle(Paint.Style.FILL);
        this.f31317f.setColor(-16777216);
        this.f30624a.add(this.f31317f);
        this.f31319h = new Paint();
        Path path3 = new Path();
        this.f31320i = path3;
        path3.moveTo(4.0f, 45.5f);
        this.f31320i.cubicTo(3.17157f, 45.5f, 2.5f, 44.8284f, 2.5f, 44.0f);
        this.f31320i.lineTo(2.5f, 32.5f);
        this.f31320i.cubicTo(2.5f, 32.2239f, 2.72386f, 32.0f, 3.0f, 32.0f);
        this.f31320i.lineTo(5.0f, 32.0f);
        this.f31320i.cubicTo(5.27614f, 32.0f, 5.5f, 32.2239f, 5.5f, 32.5f);
        this.f31320i.lineTo(5.5f, 42.0f);
        this.f31320i.cubicTo(5.5f, 42.2761f, 5.72386f, 42.5f, 6.0f, 42.5f);
        this.f31320i.lineTo(15.5f, 42.5f);
        this.f31320i.cubicTo(15.7761f, 42.5f, 16.0f, 42.7239f, 16.0f, 43.0f);
        this.f31320i.lineTo(16.0f, 45.0f);
        this.f31320i.cubicTo(16.0f, 45.2761f, 15.7761f, 45.5f, 15.5f, 45.5f);
        this.f31320i.lineTo(4.0f, 45.5f);
        this.f31320i.close();
        this.f31320i.setFillType(Path.FillType.EVEN_ODD);
        this.f31319h.setStyle(Paint.Style.FILL);
        this.f31319h.setColor(-16777216);
        this.f30624a.add(this.f31319h);
        this.f31321j = new Paint();
        Path path4 = new Path();
        this.f31322k = path4;
        path4.moveTo(17.0f, 29.1088f);
        this.f31322k.cubicTo(17.0f, 31.9206f, 20.134f, 36.0f, 24.0f, 36.0f);
        this.f31322k.cubicTo(27.866f, 36.0f, 31.0f, 31.9206f, 31.0f, 29.1088f);
        this.f31322k.cubicTo(31.0f, 26.2971f, 17.0f, 26.2971f, 17.0f, 29.1088f);
        this.f31322k.close();
        this.f31322k.setFillType(Path.FillType.EVEN_ODD);
        this.f31321j.setStyle(Paint.Style.FILL);
        this.f31321j.setColor(-16777216);
        this.f30624a.add(this.f31321j);
        this.f31323l = new Paint();
        Path path5 = new Path();
        this.f31324m = path5;
        path5.moveTo(16.0f, 23.0f);
        this.f31324m.cubicTo(17.6569f, 23.0f, 19.0f, 21.2091f, 19.0f, 19.0f);
        this.f31324m.cubicTo(19.0f, 16.7909f, 17.6569f, 15.0f, 16.0f, 15.0f);
        this.f31324m.cubicTo(14.3431f, 15.0f, 13.0f, 16.7909f, 13.0f, 19.0f);
        this.f31324m.cubicTo(13.0f, 21.2091f, 14.3431f, 23.0f, 16.0f, 23.0f);
        this.f31324m.close();
        this.f31324m.setFillType(Path.FillType.EVEN_ODD);
        this.f31323l.setStyle(Paint.Style.FILL);
        this.f31323l.setColor(-16777216);
        this.f30624a.add(this.f31323l);
        this.n = new Paint();
        Path path6 = new Path();
        this.o = path6;
        path6.moveTo(32.0f, 23.0f);
        this.o.cubicTo(33.6569f, 23.0f, 35.0f, 21.2091f, 35.0f, 19.0f);
        this.o.cubicTo(35.0f, 16.7909f, 33.6569f, 15.0f, 32.0f, 15.0f);
        this.o.cubicTo(30.3431f, 15.0f, 29.0f, 16.7909f, 29.0f, 19.0f);
        this.o.cubicTo(29.0f, 21.2091f, 30.3431f, 23.0f, 32.0f, 23.0f);
        this.o.close();
        this.o.setFillType(Path.FillType.EVEN_ODD);
        this.n.setStyle(Paint.Style.FILL);
        this.n.setColor(-16777216);
        this.f30624a.add(this.n);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31316e, this.f31315d);
        canvas.drawPath(this.f31318g, this.f31317f);
        canvas.drawPath(this.f31320i, this.f31319h);
        canvas.drawPath(this.f31322k, this.f31321j);
        canvas.drawPath(this.f31324m, this.f31323l);
        canvas.drawPath(this.o, this.n);
    }
}
