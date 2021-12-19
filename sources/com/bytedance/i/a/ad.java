package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ad extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31279d;

    /* renamed from: e  reason: collision with root package name */
    Path f31280e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31281f;

    /* renamed from: g  reason: collision with root package name */
    Path f31282g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31283h;

    /* renamed from: i  reason: collision with root package name */
    Path f31284i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31285j;

    /* renamed from: k  reason: collision with root package name */
    Path f31286k;

    /* renamed from: l  reason: collision with root package name */
    Paint f31287l;

    /* renamed from: m  reason: collision with root package name */
    Path f31288m;

    static {
        Covode.recordClassIndex(18140);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(19.9524f, 9.0f);
        this.f30626c.cubicTo(16.928f, 9.0f, 14.4762f, 11.4518f, 14.4762f, 14.4762f);
        this.f30626c.cubicTo(14.4762f, 17.5006f, 16.928f, 19.9524f, 19.9524f, 19.9524f);
        this.f30626c.cubicTo(22.9768f, 19.9524f, 25.4286f, 17.5006f, 25.4286f, 14.4762f);
        this.f30626c.cubicTo(25.4286f, 11.4518f, 22.9768f, 9.0f, 19.9524f, 9.0f);
        this.f30626c.close();
        this.f30626c.moveTo(12.4762f, 14.4762f);
        this.f30626c.cubicTo(12.4762f, 10.3472f, 15.8234f, 7.0f, 19.9524f, 7.0f);
        this.f30626c.cubicTo(24.0814f, 7.0f, 27.4286f, 10.3472f, 27.4286f, 14.4762f);
        this.f30626c.cubicTo(27.4286f, 18.6052f, 24.0814f, 21.9524f, 19.9524f, 21.9524f);
        this.f30626c.cubicTo(15.8234f, 21.9524f, 12.4762f, 18.6052f, 12.4762f, 14.4762f);
        this.f30626c.close();
        this.f30626c.moveTo(15.6113f, 27.259f);
        this.f30626c.cubicTo(12.2479f, 28.5746f, 9.31466f, 31.4884f, 8.09228f, 36.2808f);
        this.f30626c.cubicTo(8.02403f, 36.5484f, 7.75721f, 36.718f, 7.4878f, 36.6574f);
        this.f30626c.lineTo(6.5122f, 36.4379f);
        this.f30626c.cubicTo(6.24279f, 36.3772f, 6.07295f, 36.1092f, 6.14042f, 35.8414f);
        this.f30626c.cubicTo(7.50854f, 30.4121f, 10.8873f, 26.9593f, 14.8828f, 25.3964f);
        this.f30626c.cubicTo(18.8058f, 23.862f, 23.2747f, 24.1695f, 26.9048f, 26.1306f);
        this.f30626c.cubicTo(27.1478f, 26.2618f, 27.2269f, 26.5691f, 27.0868f, 26.8071f);
        this.f30626c.lineTo(26.5798f, 27.6691f);
        this.f30626c.cubicTo(26.4398f, 27.9071f, 26.1338f, 27.9855f, 25.89f, 27.8558f);
        this.f30626c.cubicTo(22.7857f, 26.2035f, 18.9605f, 25.949f, 15.6113f, 27.259f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31279d = new Paint();
        Path path = new Path();
        this.f31280e = path;
        path.moveTo(40.0f, 26.0f);
        this.f31280e.lineTo(30.0f, 26.0f);
        this.f31280e.lineTo(30.0f, 33.0f);
        this.f31280e.lineTo(40.0f, 33.0f);
        this.f31280e.lineTo(40.0f, 26.0f);
        this.f31280e.close();
        this.f31280e.moveTo(30.0f, 24.0f);
        this.f31280e.cubicTo(28.8954f, 24.0f, 28.0f, 24.8954f, 28.0f, 26.0f);
        this.f31280e.lineTo(28.0f, 33.0f);
        this.f31280e.cubicTo(28.0f, 34.1046f, 28.8954f, 35.0f, 30.0f, 35.0f);
        this.f31280e.lineTo(40.0f, 35.0f);
        this.f31280e.cubicTo(41.1046f, 35.0f, 42.0f, 34.1046f, 42.0f, 33.0f);
        this.f31280e.lineTo(42.0f, 26.0f);
        this.f31280e.cubicTo(42.0f, 24.8954f, 41.1046f, 24.0f, 40.0f, 24.0f);
        this.f31280e.lineTo(30.0f, 24.0f);
        this.f31280e.close();
        this.f31280e.setFillType(Path.FillType.EVEN_ODD);
        this.f31279d.setStyle(Paint.Style.FILL);
        this.f31279d.setColor(-16777216);
        this.f30624a.add(this.f31279d);
        this.f31281f = new Paint();
        Path path2 = new Path();
        this.f31282g = path2;
        path2.moveTo(28.0f, 36.5f);
        this.f31282g.cubicTo(28.0f, 36.2239f, 28.2239f, 36.0f, 28.5f, 36.0f);
        this.f31282g.lineTo(41.5f, 36.0f);
        this.f31282g.cubicTo(41.7761f, 36.0f, 42.0f, 36.2239f, 42.0f, 36.5f);
        this.f31282g.lineTo(42.0f, 37.5f);
        this.f31282g.cubicTo(42.0f, 37.7761f, 41.7761f, 38.0f, 41.5f, 38.0f);
        this.f31282g.lineTo(28.5f, 38.0f);
        this.f31282g.cubicTo(28.2239f, 38.0f, 28.0f, 37.7761f, 28.0f, 37.5f);
        this.f31282g.lineTo(28.0f, 36.5f);
        this.f31282g.close();
        this.f31282g.setFillType(Path.FillType.WINDING);
        this.f31281f.setStyle(Paint.Style.FILL);
        this.f31281f.setColor(-16777216);
        this.f30624a.add(this.f31281f);
        this.f31283h = new Paint();
        Path path3 = new Path();
        this.f31284i = path3;
        path3.moveTo(31.0f, 29.5f);
        this.f31284i.cubicTo(31.0f, 29.2239f, 31.2239f, 29.0f, 31.5f, 29.0f);
        this.f31284i.lineTo(32.5f, 29.0f);
        this.f31284i.cubicTo(32.7761f, 29.0f, 33.0f, 29.2239f, 33.0f, 29.5f);
        this.f31284i.lineTo(33.0f, 31.5f);
        this.f31284i.cubicTo(33.0f, 31.7761f, 32.7761f, 32.0f, 32.5f, 32.0f);
        this.f31284i.lineTo(31.5f, 32.0f);
        this.f31284i.cubicTo(31.2239f, 32.0f, 31.0f, 31.7761f, 31.0f, 31.5f);
        this.f31284i.lineTo(31.0f, 29.5f);
        this.f31284i.close();
        this.f31284i.setFillType(Path.FillType.WINDING);
        this.f31283h.setStyle(Paint.Style.FILL);
        this.f31283h.setColor(-16777216);
        this.f30624a.add(this.f31283h);
        this.f31285j = new Paint();
        Path path4 = new Path();
        this.f31286k = path4;
        path4.moveTo(34.0f, 30.5f);
        this.f31286k.cubicTo(34.0f, 30.2239f, 34.2239f, 30.0f, 34.5f, 30.0f);
        this.f31286k.lineTo(35.5f, 30.0f);
        this.f31286k.cubicTo(35.7761f, 30.0f, 36.0f, 30.2239f, 36.0f, 30.5f);
        this.f31286k.lineTo(36.0f, 31.5f);
        this.f31286k.cubicTo(36.0f, 31.7761f, 35.7761f, 32.0f, 35.5f, 32.0f);
        this.f31286k.lineTo(34.5f, 32.0f);
        this.f31286k.cubicTo(34.2239f, 32.0f, 34.0f, 31.7761f, 34.0f, 31.5f);
        this.f31286k.lineTo(34.0f, 30.5f);
        this.f31286k.close();
        this.f31286k.setFillType(Path.FillType.WINDING);
        this.f31285j.setStyle(Paint.Style.FILL);
        this.f31285j.setColor(-16777216);
        this.f30624a.add(this.f31285j);
        this.f31287l = new Paint();
        Path path5 = new Path();
        this.f31288m = path5;
        path5.moveTo(37.0f, 27.5f);
        this.f31288m.cubicTo(37.0f, 27.2239f, 37.2239f, 27.0f, 37.5f, 27.0f);
        this.f31288m.lineTo(38.5f, 27.0f);
        this.f31288m.cubicTo(38.7761f, 27.0f, 39.0f, 27.2239f, 39.0f, 27.5f);
        this.f31288m.lineTo(39.0f, 31.5f);
        this.f31288m.cubicTo(39.0f, 31.7761f, 38.7761f, 32.0f, 38.5f, 32.0f);
        this.f31288m.lineTo(37.5f, 32.0f);
        this.f31288m.cubicTo(37.2239f, 32.0f, 37.0f, 31.7761f, 37.0f, 31.5f);
        this.f31288m.lineTo(37.0f, 27.5f);
        this.f31288m.close();
        this.f31288m.setFillType(Path.FillType.WINDING);
        this.f31287l.setStyle(Paint.Style.FILL);
        this.f31287l.setColor(-16777216);
        this.f30624a.add(this.f31287l);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31280e, this.f31279d);
        canvas.drawPath(this.f31282g, this.f31281f);
        canvas.drawPath(this.f31284i, this.f31283h);
        canvas.drawPath(this.f31286k, this.f31285j);
        canvas.drawPath(this.f31288m, this.f31287l);
    }
}
