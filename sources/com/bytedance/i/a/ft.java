package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ft extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31467d;

    /* renamed from: e  reason: collision with root package name */
    Path f31468e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31469f;

    /* renamed from: g  reason: collision with root package name */
    Path f31470g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31471h;

    /* renamed from: i  reason: collision with root package name */
    Path f31472i;

    static {
        Covode.recordClassIndex(18291);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(10.0f, 22.8f);
        this.f30626c.cubicTo(10.0f, 18.3196f, 10.0f, 16.0794f, 10.8719f, 14.3681f);
        this.f30626c.cubicTo(11.6389f, 12.8628f, 12.8628f, 11.6389f, 14.3681f, 10.8719f);
        this.f30626c.cubicTo(16.0794f, 10.0f, 18.3196f, 10.0f, 22.8f, 10.0f);
        this.f30626c.lineTo(32.7f, 10.0f);
        this.f30626c.cubicTo(37.1804f, 10.0f, 39.4206f, 10.0f, 41.1319f, 10.8719f);
        this.f30626c.cubicTo(42.6372f, 11.6389f, 43.8611f, 12.8628f, 44.6281f, 14.3681f);
        this.f30626c.cubicTo(45.5f, 16.0794f, 45.5f, 18.3196f, 45.5f, 22.8f);
        this.f30626c.lineTo(45.5f, 25.2f);
        this.f30626c.cubicTo(45.5f, 29.6804f, 45.5f, 31.9206f, 44.6281f, 33.6319f);
        this.f30626c.cubicTo(43.8611f, 35.1372f, 42.6372f, 36.3611f, 41.1319f, 37.1281f);
        this.f30626c.cubicTo(39.4206f, 38.0f, 37.1804f, 38.0f, 32.7f, 38.0f);
        this.f30626c.lineTo(22.8f, 38.0f);
        this.f30626c.cubicTo(18.3196f, 38.0f, 16.0794f, 38.0f, 14.3681f, 37.1281f);
        this.f30626c.cubicTo(12.8628f, 36.3611f, 11.6389f, 35.1372f, 10.8719f, 33.6319f);
        this.f30626c.cubicTo(10.0f, 31.9206f, 10.0f, 29.6804f, 10.0f, 25.2f);
        this.f30626c.lineTo(10.0f, 22.8f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-381588);
        this.f31467d = new Paint();
        Path path = new Path();
        this.f31468e = path;
        path.moveTo(2.5f, 22.8f);
        this.f31468e.cubicTo(2.5f, 18.3196f, 2.5f, 16.0794f, 3.37195f, 14.3681f);
        this.f31468e.cubicTo(4.13893f, 12.8628f, 5.36278f, 11.6389f, 6.86808f, 10.8719f);
        this.f31468e.cubicTo(8.57937f, 10.0f, 10.8196f, 10.0f, 15.3f, 10.0f);
        this.f31468e.lineTo(25.2f, 10.0f);
        this.f31468e.cubicTo(29.6804f, 10.0f, 31.9206f, 10.0f, 33.6319f, 10.8719f);
        this.f31468e.cubicTo(35.1372f, 11.6389f, 36.3611f, 12.8628f, 37.1281f, 14.3681f);
        this.f31468e.cubicTo(38.0f, 16.0794f, 38.0f, 18.3196f, 38.0f, 22.8f);
        this.f31468e.lineTo(38.0f, 25.2f);
        this.f31468e.cubicTo(38.0f, 29.6804f, 38.0f, 31.9206f, 37.1281f, 33.6319f);
        this.f31468e.cubicTo(36.3611f, 35.1372f, 35.1372f, 36.3611f, 33.6319f, 37.1281f);
        this.f31468e.cubicTo(31.9206f, 38.0f, 29.6804f, 38.0f, 25.2f, 38.0f);
        this.f31468e.lineTo(15.3f, 38.0f);
        this.f31468e.cubicTo(10.8196f, 38.0f, 8.57937f, 38.0f, 6.86808f, 37.1281f);
        this.f31468e.cubicTo(5.36278f, 36.3611f, 4.13893f, 35.1372f, 3.37195f, 33.6319f);
        this.f31468e.cubicTo(2.5f, 31.9206f, 2.5f, 29.6804f, 2.5f, 25.2f);
        this.f31468e.lineTo(2.5f, 22.8f);
        this.f31468e.close();
        this.f31468e.setFillType(Path.FillType.EVEN_ODD);
        this.f31467d.setStyle(Paint.Style.FILL);
        this.f31467d.setColor(-14625300);
        this.f30624a.add(this.f31467d);
        this.f31469f = new Paint();
        Path path2 = new Path();
        this.f31470g = path2;
        path2.moveTo(6.0f, 18.0f);
        this.f31470g.cubicTo(6.0f, 13.5817f, 9.58172f, 10.0f, 14.0f, 10.0f);
        this.f31470g.lineTo(34.0f, 10.0f);
        this.f31470g.cubicTo(38.4183f, 10.0f, 42.0f, 13.5817f, 42.0f, 18.0f);
        this.f31470g.lineTo(42.0f, 30.0f);
        this.f31470g.cubicTo(42.0f, 34.4183f, 38.4183f, 38.0f, 34.0f, 38.0f);
        this.f31470g.lineTo(14.0f, 38.0f);
        this.f31470g.cubicTo(9.58172f, 38.0f, 6.0f, 34.4183f, 6.0f, 30.0f);
        this.f31470g.lineTo(6.0f, 18.0f);
        this.f31470g.close();
        this.f31470g.setFillType(Path.FillType.WINDING);
        this.f31469f.setStyle(Paint.Style.FILL);
        this.f31469f.setColor(-15329245);
        this.f30624a.add(this.f31469f);
        this.f31471h = new Paint();
        Path path3 = new Path();
        this.f31472i = path3;
        path3.moveTo(23.5f, 17.5f);
        this.f31472i.cubicTo(23.2239f, 17.5f, 23.0f, 17.7239f, 23.0f, 18.0f);
        this.f31472i.lineTo(23.0f, 23.0f);
        this.f31472i.lineTo(18.0f, 23.0f);
        this.f31472i.cubicTo(17.7239f, 23.0f, 17.5f, 23.2239f, 17.5f, 23.5f);
        this.f31472i.lineTo(17.5f, 24.5f);
        this.f31472i.cubicTo(17.5f, 24.7761f, 17.7239f, 25.0f, 18.0f, 25.0f);
        this.f31472i.lineTo(23.0f, 25.0f);
        this.f31472i.lineTo(23.0f, 30.0f);
        this.f31472i.cubicTo(23.0f, 30.2761f, 23.2239f, 30.5f, 23.5f, 30.5f);
        this.f31472i.lineTo(24.5f, 30.5f);
        this.f31472i.cubicTo(24.7761f, 30.5f, 25.0f, 30.2761f, 25.0f, 30.0f);
        this.f31472i.lineTo(25.0f, 25.0f);
        this.f31472i.lineTo(30.0f, 25.0f);
        this.f31472i.cubicTo(30.2761f, 25.0f, 30.5f, 24.7761f, 30.5f, 24.5f);
        this.f31472i.lineTo(30.5f, 23.5f);
        this.f31472i.cubicTo(30.5f, 23.2239f, 30.2761f, 23.0f, 30.0f, 23.0f);
        this.f31472i.lineTo(25.0f, 23.0f);
        this.f31472i.lineTo(25.0f, 18.0f);
        this.f31472i.cubicTo(25.0f, 17.7239f, 24.7761f, 17.5f, 24.5f, 17.5f);
        this.f31472i.lineTo(23.5f, 17.5f);
        this.f31472i.close();
        this.f31472i.setFillType(Path.FillType.EVEN_ODD);
        this.f31471h.setStyle(Paint.Style.FILL);
        this.f31471h.setColor(-1);
        this.f30624a.add(this.f31471h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31468e, this.f31467d);
        canvas.drawPath(this.f31470g, this.f31469f);
        canvas.drawPath(this.f31472i, this.f31471h);
    }
}
