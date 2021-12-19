package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gk extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31553d;

    /* renamed from: e  reason: collision with root package name */
    Path f31554e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31555f;

    /* renamed from: g  reason: collision with root package name */
    Path f31556g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31557h;

    /* renamed from: i  reason: collision with root package name */
    Path f31558i;

    static {
        Covode.recordClassIndex(18309);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.addCircle(24.0f, 24.0f, 22.0f, Path.Direction.CW);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-4965);
        this.f31553d = new Paint();
        Path path = new Path();
        this.f31554e = path;
        path.addCircle(24.0f, 24.0f, 17.0f, Path.Direction.CW);
        this.f31553d.setStyle(Paint.Style.FILL);
        this.f31553d.setColor(-340459);
        this.f30624a.add(this.f31553d);
        this.f31555f = new Paint();
        Path path2 = new Path();
        this.f31556g = path2;
        path2.moveTo(40.9347f, 25.5f);
        this.f31556g.cubicTo(40.9779f, 25.0058f, 41.0f, 24.5055f, 41.0f, 24.0f);
        this.f31556g.cubicTo(41.0f, 14.6112f, 33.3888f, 7.0f, 24.0f, 7.0f);
        this.f31556g.cubicTo(14.6112f, 7.0f, 7.0f, 14.6112f, 7.0f, 24.0f);
        this.f31556g.cubicTo(7.0f, 24.5055f, 7.02206f, 25.0058f, 7.06527f, 25.5f);
        this.f31556g.cubicTo(7.82466f, 16.8137f, 15.1166f, 10.0f, 24.0f, 10.0f);
        this.f31556g.cubicTo(32.8834f, 10.0f, 40.1753f, 16.8137f, 40.9347f, 25.5f);
        this.f31556g.close();
        this.f31556g.setFillType(Path.FillType.EVEN_ODD);
        this.f31555f.setStyle(Paint.Style.FILL);
        this.f31555f.setColor(-345067);
        this.f30624a.add(this.f31555f);
        this.f31557h = new Paint();
        Path path3 = new Path();
        this.f31558i = path3;
        path3.moveTo(33.0f, 19.0f);
        this.f31558i.cubicTo(30.2041f, 19.0f, 27.9375f, 16.7614f, 27.9375f, 14.0f);
        this.f31558i.lineTo(24.5625f, 14.0f);
        this.f31558i.lineTo(24.5625f, 27.6111f);
        this.f31558i.cubicTo(24.5625f, 29.2986f, 23.1774f, 30.6667f, 21.4688f, 30.6667f);
        this.f31558i.cubicTo(19.7601f, 30.6667f, 18.375f, 29.2986f, 18.375f, 27.6111f);
        this.f31558i.cubicTo(18.375f, 25.9236f, 19.7601f, 24.5556f, 21.4688f, 24.5556f);
        this.f31558i.cubicTo(21.722f, 24.5556f, 21.9659f, 24.5853f, 22.1981f, 24.6406f);
        this.f31558i.cubicTo(22.2365f, 24.6497f, 22.2747f, 24.6596f, 22.3125f, 24.6701f);
        this.f31558i.lineTo(22.3125f, 21.2763f);
        this.f31558i.cubicTo(22.0358f, 21.2406f, 21.7541f, 21.2222f, 21.4688f, 21.2222f);
        this.f31558i.cubicTo(17.8962f, 21.2222f, 15.0f, 24.0826f, 15.0f, 27.6111f);
        this.f31558i.cubicTo(15.0f, 31.1396f, 17.8962f, 34.0f, 21.4688f, 34.0f);
        this.f31558i.cubicTo(25.0413f, 34.0f, 27.9375f, 31.1396f, 27.9375f, 27.6111f);
        this.f31558i.lineTo(27.9375f, 20.6673f);
        this.f31558i.cubicTo(29.3477f, 21.7134f, 31.1005f, 22.3333f, 33.0f, 22.3333f);
        this.f31558i.lineTo(33.0f, 19.0f);
        this.f31558i.close();
        this.f31558i.setFillType(Path.FillType.WINDING);
        this.f31557h.setStyle(Paint.Style.FILL);
        this.f31557h.setColor(-68147);
        this.f30624a.add(this.f31557h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31554e, this.f31553d);
        canvas.drawPath(this.f31556g, this.f31555f);
        canvas.drawPath(this.f31558i, this.f31557h);
    }
}
