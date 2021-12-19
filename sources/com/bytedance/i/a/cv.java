package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cv extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31378d;

    /* renamed from: e  reason: collision with root package name */
    Path f31379e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31380f;

    /* renamed from: g  reason: collision with root package name */
    Path f31381g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31382h;

    /* renamed from: i  reason: collision with root package name */
    Path f31383i;

    static {
        Covode.recordClassIndex(18212);
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
        this.f30625b.setColor(-411877);
        this.f31378d = new Paint();
        Path path = new Path();
        this.f31379e = path;
        path.moveTo(15.0f, 11.0f);
        this.f31379e.cubicTo(15.0f, 8.79086f, 16.7909f, 7.0f, 19.0f, 7.0f);
        this.f31379e.lineTo(37.0f, 7.0f);
        this.f31379e.cubicTo(39.2091f, 7.0f, 41.0f, 8.79086f, 41.0f, 11.0f);
        this.f31379e.lineTo(41.0f, 29.0f);
        this.f31379e.cubicTo(41.0f, 31.2091f, 39.2091f, 33.0f, 37.0f, 33.0f);
        this.f31379e.lineTo(19.0f, 33.0f);
        this.f31379e.cubicTo(16.7909f, 33.0f, 15.0f, 31.2091f, 15.0f, 29.0f);
        this.f31379e.lineTo(15.0f, 11.0f);
        this.f31379e.close();
        this.f31379e.moveTo(37.0f, 11.0f);
        this.f31379e.lineTo(19.0f, 11.0f);
        this.f31379e.lineTo(19.0f, 29.0f);
        this.f31379e.lineTo(37.0f, 29.0f);
        this.f31379e.lineTo(37.0f, 11.0f);
        this.f31379e.close();
        this.f31379e.setFillType(Path.FillType.EVEN_ODD);
        this.f31378d.setStyle(Paint.Style.FILL);
        this.f31378d.setColor(-1);
        this.f30624a.add(this.f31378d);
        this.f31380f = new Paint();
        Path path2 = new Path();
        this.f31381g = path2;
        path2.moveTo(7.0f, 19.0f);
        this.f31381g.cubicTo(7.0f, 16.7909f, 8.79086f, 15.0f, 11.0f, 15.0f);
        this.f31381g.lineTo(29.0f, 15.0f);
        this.f31381g.cubicTo(31.2091f, 15.0f, 33.0f, 16.7909f, 33.0f, 19.0f);
        this.f31381g.lineTo(33.0f, 37.0f);
        this.f31381g.cubicTo(33.0f, 39.2091f, 31.2091f, 41.0f, 29.0f, 41.0f);
        this.f31381g.lineTo(11.0f, 41.0f);
        this.f31381g.cubicTo(8.79086f, 41.0f, 7.0f, 39.2091f, 7.0f, 37.0f);
        this.f31381g.lineTo(7.0f, 19.0f);
        this.f31381g.close();
        this.f31381g.setFillType(Path.FillType.WINDING);
        this.f31380f.setStyle(Paint.Style.FILL);
        this.f31380f.setColor(-1);
        this.f30624a.add(this.f31380f);
        this.f31382h = new Paint();
        Path path3 = new Path();
        this.f31383i = path3;
        path3.moveTo(16.0f, 32.6573f);
        this.f31383i.lineTo(16.0f, 23.3427f);
        this.f31383i.cubicTo(16.0f, 22.5493f, 16.8797f, 22.0719f, 17.545f, 22.5043f);
        this.f31383i.lineTo(24.7101f, 27.1616f);
        this.f31383i.cubicTo(25.3168f, 27.5559f, 25.3168f, 28.4441f, 24.7101f, 28.8385f);
        this.f31383i.lineTo(17.545f, 33.4958f);
        this.f31383i.cubicTo(16.8797f, 33.9282f, 16.0f, 33.4508f, 16.0f, 32.6573f);
        this.f31383i.close();
        this.f31383i.setFillType(Path.FillType.WINDING);
        this.f31382h.setStyle(Paint.Style.FILL);
        this.f31382h.setColor(-411877);
        this.f30624a.add(this.f31382h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31379e, this.f31378d);
        canvas.drawPath(this.f31381g, this.f31380f);
        canvas.drawPath(this.f31383i, this.f31382h);
    }
}
