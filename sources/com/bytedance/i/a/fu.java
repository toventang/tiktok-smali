package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fu extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31473d;

    /* renamed from: e  reason: collision with root package name */
    Path f31474e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31475f;

    /* renamed from: g  reason: collision with root package name */
    Path f31476g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31477h;

    /* renamed from: i  reason: collision with root package name */
    Path f31478i;

    static {
        Covode.recordClassIndex(18292);
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
        this.f31473d = new Paint();
        Path path = new Path();
        this.f31474e = path;
        path.moveTo(2.5f, 22.8f);
        this.f31474e.cubicTo(2.5f, 18.3196f, 2.5f, 16.0794f, 3.37195f, 14.3681f);
        this.f31474e.cubicTo(4.13893f, 12.8628f, 5.36278f, 11.6389f, 6.86808f, 10.8719f);
        this.f31474e.cubicTo(8.57937f, 10.0f, 10.8196f, 10.0f, 15.3f, 10.0f);
        this.f31474e.lineTo(25.2f, 10.0f);
        this.f31474e.cubicTo(29.6804f, 10.0f, 31.9206f, 10.0f, 33.6319f, 10.8719f);
        this.f31474e.cubicTo(35.1372f, 11.6389f, 36.3611f, 12.8628f, 37.1281f, 14.3681f);
        this.f31474e.cubicTo(38.0f, 16.0794f, 38.0f, 18.3196f, 38.0f, 22.8f);
        this.f31474e.lineTo(38.0f, 25.2f);
        this.f31474e.cubicTo(38.0f, 29.6804f, 38.0f, 31.9206f, 37.1281f, 33.6319f);
        this.f31474e.cubicTo(36.3611f, 35.1372f, 35.1372f, 36.3611f, 33.6319f, 37.1281f);
        this.f31474e.cubicTo(31.9206f, 38.0f, 29.6804f, 38.0f, 25.2f, 38.0f);
        this.f31474e.lineTo(15.3f, 38.0f);
        this.f31474e.cubicTo(10.8196f, 38.0f, 8.57937f, 38.0f, 6.86808f, 37.1281f);
        this.f31474e.cubicTo(5.36278f, 36.3611f, 4.13893f, 35.1372f, 3.37195f, 33.6319f);
        this.f31474e.cubicTo(2.5f, 31.9206f, 2.5f, 29.6804f, 2.5f, 25.2f);
        this.f31474e.lineTo(2.5f, 22.8f);
        this.f31474e.close();
        this.f31474e.setFillType(Path.FillType.EVEN_ODD);
        this.f31473d.setStyle(Paint.Style.FILL);
        this.f31473d.setColor(-14625300);
        this.f30624a.add(this.f31473d);
        this.f31475f = new Paint();
        Path path2 = new Path();
        this.f31476g = path2;
        path2.moveTo(6.0f, 18.0f);
        this.f31476g.cubicTo(6.0f, 13.5817f, 9.58172f, 10.0f, 14.0f, 10.0f);
        this.f31476g.lineTo(34.0f, 10.0f);
        this.f31476g.cubicTo(38.4183f, 10.0f, 42.0f, 13.5817f, 42.0f, 18.0f);
        this.f31476g.lineTo(42.0f, 30.0f);
        this.f31476g.cubicTo(42.0f, 34.4183f, 38.4183f, 38.0f, 34.0f, 38.0f);
        this.f31476g.lineTo(14.0f, 38.0f);
        this.f31476g.cubicTo(9.58172f, 38.0f, 6.0f, 34.4183f, 6.0f, 30.0f);
        this.f31476g.lineTo(6.0f, 18.0f);
        this.f31476g.close();
        this.f31476g.setFillType(Path.FillType.WINDING);
        this.f31475f.setStyle(Paint.Style.FILL);
        this.f31475f.setColor(-1);
        this.f30624a.add(this.f31475f);
        this.f31477h = new Paint();
        Path path3 = new Path();
        this.f31478i = path3;
        path3.moveTo(23.5f, 17.5f);
        this.f31478i.cubicTo(23.2239f, 17.5f, 23.0f, 17.7239f, 23.0f, 18.0f);
        this.f31478i.lineTo(23.0f, 23.0f);
        this.f31478i.lineTo(18.0f, 23.0f);
        this.f31478i.cubicTo(17.7239f, 23.0f, 17.5f, 23.2239f, 17.5f, 23.5f);
        this.f31478i.lineTo(17.5f, 24.5f);
        this.f31478i.cubicTo(17.5f, 24.7761f, 17.7239f, 25.0f, 18.0f, 25.0f);
        this.f31478i.lineTo(23.0f, 25.0f);
        this.f31478i.lineTo(23.0f, 30.0f);
        this.f31478i.cubicTo(23.0f, 30.2761f, 23.2239f, 30.5f, 23.5f, 30.5f);
        this.f31478i.lineTo(24.5f, 30.5f);
        this.f31478i.cubicTo(24.7761f, 30.5f, 25.0f, 30.2761f, 25.0f, 30.0f);
        this.f31478i.lineTo(25.0f, 25.0f);
        this.f31478i.lineTo(30.0f, 25.0f);
        this.f31478i.cubicTo(30.2761f, 25.0f, 30.5f, 24.7761f, 30.5f, 24.5f);
        this.f31478i.lineTo(30.5f, 23.5f);
        this.f31478i.cubicTo(30.5f, 23.2239f, 30.2761f, 23.0f, 30.0f, 23.0f);
        this.f31478i.lineTo(25.0f, 23.0f);
        this.f31478i.lineTo(25.0f, 18.0f);
        this.f31478i.cubicTo(25.0f, 17.7239f, 24.7761f, 17.5f, 24.5f, 17.5f);
        this.f31478i.lineTo(23.5f, 17.5f);
        this.f31478i.close();
        this.f31478i.setFillType(Path.FillType.EVEN_ODD);
        this.f31477h.setStyle(Paint.Style.FILL);
        this.f31477h.setColor(-15329245);
        this.f30624a.add(this.f31477h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31474e, this.f31473d);
        canvas.drawPath(this.f31476g, this.f31475f);
        canvas.drawPath(this.f31478i, this.f31477h);
    }
}
