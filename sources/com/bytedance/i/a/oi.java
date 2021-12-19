package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class oi extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31752d;

    /* renamed from: e  reason: collision with root package name */
    Path f31753e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31754f;

    /* renamed from: g  reason: collision with root package name */
    Path f31755g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31756h;

    /* renamed from: i  reason: collision with root package name */
    Path f31757i;

    static {
        Covode.recordClassIndex(18523);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(25.5f, 17.0f);
        this.f30626c.cubicTo(25.5f, 21.1421f, 22.1421f, 24.5f, 18.0f, 24.5f);
        this.f30626c.cubicTo(13.8579f, 24.5f, 10.5f, 21.1421f, 10.5f, 17.0f);
        this.f30626c.cubicTo(10.5f, 12.8579f, 13.8579f, 9.5f, 18.0f, 9.5f);
        this.f30626c.cubicTo(22.1421f, 9.5f, 25.5f, 12.8579f, 25.5f, 17.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31752d = new Paint();
        Path path = new Path();
        this.f31753e = path;
        path.moveTo(7.10396f, 34.7906f);
        this.f31753e.cubicTo(8.78769f, 30.2189f, 12.8204f, 27.0f, 18.0009f, 27.0f);
        this.f31753e.cubicTo(23.1818f, 27.0f, 27.2107f, 30.2213f, 28.8958f, 34.7898f);
        this.f31753e.cubicTo(29.3075f, 35.906f, 28.6141f, 37.0f, 27.5f, 37.0f);
        this.f31753e.lineTo(8.5f, 37.0f);
        this.f31753e.cubicTo(7.38629f, 37.0f, 6.69289f, 35.9067f, 7.10396f, 34.7906f);
        this.f31753e.close();
        this.f31753e.setFillType(Path.FillType.WINDING);
        this.f31752d.setStyle(Paint.Style.FILL);
        this.f31752d.setColor(-16777216);
        this.f30624a.add(this.f31752d);
        this.f31754f = new Paint();
        Path path2 = new Path();
        this.f31755g = path2;
        path2.moveTo(40.6308f, 37.0f);
        this.f31755g.lineTo(32.0f, 37.0f);
        this.f31755g.cubicTo(31.2264f, 34.1633f, 30.0098f, 31.5927f, 28.144f, 29.7682f);
        this.f31755g.cubicTo(29.5384f, 28.9406f, 31.1829f, 28.5f, 33.0f, 28.5f);
        this.f31755g.cubicTo(37.239f, 28.5f, 40.536f, 30.8992f, 41.9148f, 35.0108f);
        this.f31755g.cubicTo(42.2516f, 36.0154f, 41.5423f, 37.0f, 40.6308f, 37.0f);
        this.f31755g.close();
        this.f31755g.setFillType(Path.FillType.WINDING);
        this.f31754f.setStyle(Paint.Style.FILL);
        this.f31754f.setColor(-16777216);
        this.f30624a.add(this.f31754f);
        this.f31756h = new Paint();
        Path path3 = new Path();
        this.f31757i = path3;
        path3.moveTo(33.0f, 26.5f);
        this.f31757i.cubicTo(36.0376f, 26.5f, 38.5f, 24.0376f, 38.5f, 21.0f);
        this.f31757i.cubicTo(38.5f, 17.9624f, 36.0376f, 15.5f, 33.0f, 15.5f);
        this.f31757i.cubicTo(29.9624f, 15.5f, 27.5f, 17.9624f, 27.5f, 21.0f);
        this.f31757i.cubicTo(27.5f, 24.0376f, 29.9624f, 26.5f, 33.0f, 26.5f);
        this.f31757i.close();
        this.f31757i.setFillType(Path.FillType.WINDING);
        this.f31756h.setStyle(Paint.Style.FILL);
        this.f31756h.setColor(-16777216);
        this.f30624a.add(this.f31756h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31753e, this.f31752d);
        canvas.drawPath(this.f31755g, this.f31754f);
        canvas.drawPath(this.f31757i, this.f31756h);
    }
}
