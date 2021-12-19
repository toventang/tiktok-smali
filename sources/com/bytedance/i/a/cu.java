package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cu extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31372d;

    /* renamed from: e  reason: collision with root package name */
    Path f31373e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31374f;

    /* renamed from: g  reason: collision with root package name */
    Path f31375g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31376h;

    /* renamed from: i  reason: collision with root package name */
    Path f31377i;

    static {
        Covode.recordClassIndex(18211);
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
        this.f31372d = new Paint();
        Path path = new Path();
        this.f31373e = path;
        path.addRoundRect(new RectF(20.0f, 14.0f, 24.0f, 24.0f), 2.0f, 2.0f, Path.Direction.CW);
        this.f31372d.setStyle(Paint.Style.FILL);
        this.f31372d.setColor(-1);
        this.f30624a.add(this.f31372d);
        this.f31374f = new Paint();
        Path path2 = new Path();
        this.f31375g = path2;
        path2.addRoundRect(new RectF(27.0f, 14.0f, 31.0f, 24.0f), 2.0f, 2.0f, Path.Direction.CW);
        this.f31374f.setStyle(Paint.Style.FILL);
        this.f31374f.setColor(-1);
        this.f30624a.add(this.f31374f);
        this.f31376h = new Paint();
        Path path3 = new Path();
        this.f31377i = path3;
        path3.moveTo(34.0f, 10.0f);
        this.f31377i.lineTo(27.0f, 10.0f);
        this.f31377i.cubicTo(26.4477f, 10.0f, 26.0f, 9.55232f, 26.0f, 9.00003f);
        this.f31377i.lineTo(26.0f, 7.00003f);
        this.f31377i.cubicTo(26.0f, 6.44775f, 26.4477f, 6.00003f, 27.0f, 6.00003f);
        this.f31377i.lineTo(34.0f, 6.0f);
        this.f31377i.cubicTo(36.2091f, 6.0f, 38.0f, 7.79086f, 38.0f, 10.0f);
        this.f31377i.lineTo(38.0f, 38.0f);
        this.f31377i.cubicTo(38.0f, 40.2091f, 36.2091f, 42.0f, 34.0f, 42.0f);
        this.f31377i.lineTo(27.0f, 42.0f);
        this.f31377i.cubicTo(26.4477f, 42.0f, 26.0f, 41.5523f, 26.0f, 41.0f);
        this.f31377i.lineTo(26.0f, 39.0f);
        this.f31377i.cubicTo(26.0f, 38.4477f, 26.4477f, 38.0f, 27.0f, 38.0f);
        this.f31377i.lineTo(34.0f, 38.0f);
        this.f31377i.lineTo(34.0f, 10.0f);
        this.f31377i.close();
        this.f31377i.moveTo(10.0f, 10.0f);
        this.f31377i.cubicTo(10.0f, 7.79089f, 11.7909f, 6.00003f, 14.0f, 6.00003f);
        this.f31377i.lineTo(16.0f, 6.00003f);
        this.f31377i.cubicTo(16.5523f, 6.00003f, 17.0f, 6.44775f, 17.0f, 7.00003f);
        this.f31377i.lineTo(17.0f, 9.00003f);
        this.f31377i.cubicTo(17.0f, 9.55232f, 16.5523f, 10.0f, 16.0f, 10.0f);
        this.f31377i.lineTo(14.0f, 10.0f);
        this.f31377i.lineTo(14.0f, 12.0f);
        this.f31377i.cubicTo(14.0f, 12.5523f, 13.5523f, 13.0f, 13.0f, 13.0f);
        this.f31377i.lineTo(11.0f, 13.0f);
        this.f31377i.cubicTo(10.4477f, 13.0f, 10.0f, 12.5523f, 10.0f, 12.0f);
        this.f31377i.lineTo(10.0f, 10.0f);
        this.f31377i.close();
        this.f31377i.moveTo(19.0f, 7.00003f);
        this.f31377i.cubicTo(19.0f, 6.44775f, 19.4477f, 6.00003f, 20.0f, 6.00003f);
        this.f31377i.lineTo(23.0f, 6.00003f);
        this.f31377i.cubicTo(23.5523f, 6.00003f, 24.0f, 6.44775f, 24.0f, 7.00003f);
        this.f31377i.lineTo(24.0f, 9.00003f);
        this.f31377i.cubicTo(24.0f, 9.55232f, 23.5523f, 10.0f, 23.0f, 10.0f);
        this.f31377i.lineTo(20.0f, 10.0f);
        this.f31377i.cubicTo(19.4477f, 10.0f, 19.0f, 9.55232f, 19.0f, 9.00003f);
        this.f31377i.lineTo(19.0f, 7.00003f);
        this.f31377i.close();
        this.f31377i.moveTo(11.0f, 22.5f);
        this.f31377i.cubicTo(10.4477f, 22.5f, 10.0f, 22.0523f, 10.0f, 21.5f);
        this.f31377i.lineTo(10.0f, 17.0f);
        this.f31377i.cubicTo(10.0f, 16.4477f, 10.4477f, 16.0f, 11.0f, 16.0f);
        this.f31377i.lineTo(13.0f, 16.0f);
        this.f31377i.cubicTo(13.5523f, 16.0f, 14.0f, 16.4477f, 14.0f, 17.0f);
        this.f31377i.lineTo(14.0f, 21.5f);
        this.f31377i.cubicTo(14.0f, 22.0523f, 13.5523f, 22.5f, 13.0f, 22.5f);
        this.f31377i.lineTo(11.0f, 22.5f);
        this.f31377i.close();
        this.f31377i.moveTo(11.0f, 32.0f);
        this.f31377i.cubicTo(10.4477f, 32.0f, 10.0f, 31.5523f, 10.0f, 31.0f);
        this.f31377i.lineTo(10.0f, 26.5f);
        this.f31377i.cubicTo(10.0f, 25.9477f, 10.4477f, 25.5f, 11.0f, 25.5f);
        this.f31377i.lineTo(13.0f, 25.5f);
        this.f31377i.cubicTo(13.5523f, 25.5f, 14.0f, 25.9477f, 14.0f, 26.5f);
        this.f31377i.lineTo(14.0f, 31.0f);
        this.f31377i.cubicTo(14.0f, 31.5523f, 13.5523f, 32.0f, 13.0f, 32.0f);
        this.f31377i.lineTo(11.0f, 32.0f);
        this.f31377i.close();
        this.f31377i.moveTo(13.0f, 35.0f);
        this.f31377i.cubicTo(13.5523f, 35.0f, 14.0f, 35.4477f, 14.0f, 36.0f);
        this.f31377i.lineTo(14.0f, 38.0f);
        this.f31377i.lineTo(16.0f, 38.0f);
        this.f31377i.cubicTo(16.5523f, 38.0f, 17.0f, 38.4477f, 17.0f, 39.0f);
        this.f31377i.lineTo(17.0f, 41.0f);
        this.f31377i.cubicTo(17.0f, 41.5523f, 16.5523f, 42.0f, 16.0f, 42.0f);
        this.f31377i.lineTo(14.0f, 42.0f);
        this.f31377i.cubicTo(11.7909f, 42.0f, 10.0f, 40.2091f, 10.0f, 38.0f);
        this.f31377i.lineTo(10.0f, 36.0f);
        this.f31377i.cubicTo(10.0f, 35.4477f, 10.4477f, 35.0f, 11.0f, 35.0f);
        this.f31377i.lineTo(13.0f, 35.0f);
        this.f31377i.close();
        this.f31377i.moveTo(19.0f, 39.0f);
        this.f31377i.cubicTo(19.0f, 38.4477f, 19.4477f, 38.0f, 20.0f, 38.0f);
        this.f31377i.lineTo(23.0f, 38.0f);
        this.f31377i.cubicTo(23.5523f, 38.0f, 24.0f, 38.4477f, 24.0f, 39.0f);
        this.f31377i.lineTo(24.0f, 41.0f);
        this.f31377i.cubicTo(24.0f, 41.5523f, 23.5523f, 42.0f, 23.0f, 42.0f);
        this.f31377i.lineTo(20.0f, 42.0f);
        this.f31377i.cubicTo(19.4477f, 42.0f, 19.0f, 41.5523f, 19.0f, 41.0f);
        this.f31377i.lineTo(19.0f, 39.0f);
        this.f31377i.close();
        this.f31377i.setFillType(Path.FillType.EVEN_ODD);
        this.f31376h.setStyle(Paint.Style.FILL);
        this.f31376h.setColor(-1);
        this.f30624a.add(this.f31376h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31373e, this.f31372d);
        canvas.drawPath(this.f31375g, this.f31374f);
        canvas.drawPath(this.f31377i, this.f31376h);
    }
}
