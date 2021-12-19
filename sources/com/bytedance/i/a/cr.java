package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cr extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31361d;

    /* renamed from: e  reason: collision with root package name */
    Path f31362e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31363f;

    /* renamed from: g  reason: collision with root package name */
    Path f31364g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31365h;

    /* renamed from: i  reason: collision with root package name */
    Path f31366i;

    static {
        Covode.recordClassIndex(18208);
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
        this.f31361d = new Paint();
        Path path = new Path();
        this.f31362e = path;
        path.moveTo(8.0f, 11.0f);
        this.f31362e.cubicTo(8.0f, 9.34315f, 9.34315f, 8.0f, 11.0f, 8.0f);
        this.f31362e.lineTo(37.0f, 8.0f);
        this.f31362e.cubicTo(38.6569f, 8.0f, 40.0f, 9.34315f, 40.0f, 11.0f);
        this.f31362e.lineTo(40.0f, 37.0f);
        this.f31362e.cubicTo(40.0f, 38.6569f, 38.6569f, 40.0f, 37.0f, 40.0f);
        this.f31362e.lineTo(11.0f, 40.0f);
        this.f31362e.cubicTo(9.34315f, 40.0f, 8.0f, 38.6569f, 8.0f, 37.0f);
        this.f31362e.lineTo(8.0f, 11.0f);
        this.f31362e.close();
        this.f31362e.setFillType(Path.FillType.WINDING);
        this.f31361d.setStyle(Paint.Style.FILL);
        this.f31361d.setColor(-1);
        this.f30624a.add(this.f31361d);
        this.f31363f = new Paint();
        Path path2 = new Path();
        this.f31364g = path2;
        path2.moveTo(15.6583f, 29.2415f);
        this.f31364g.lineTo(11.2929f, 33.6069f);
        this.f31364g.cubicTo(11.1054f, 33.7944f, 11.0f, 34.0488f, 11.0f, 34.314f);
        this.f31364g.lineTo(11.0f, 36.0f);
        this.f31364g.cubicTo(11.0f, 36.5523f, 11.4477f, 37.0f, 12.0f, 37.0f);
        this.f31364g.lineTo(36.0f, 37.0f);
        this.f31364g.cubicTo(36.5523f, 37.0f, 37.0f, 36.5523f, 37.0f, 36.0f);
        this.f31364g.lineTo(37.0f, 31.2925f);
        this.f31364g.cubicTo(37.0f, 31.0401f, 36.9045f, 30.797f, 36.7328f, 30.612f);
        this.f31364g.lineTo(31.9122f, 25.4207f);
        this.f31364g.cubicTo(31.1409f, 24.59f, 29.834f, 24.5658f, 29.0324f, 25.3673f);
        this.f31364g.lineTo(22.0f, 32.3998f);
        this.f31364g.lineTo(18.4104f, 29.1691f);
        this.f31364g.cubicTo(17.6197f, 28.4576f, 16.4104f, 28.4894f, 15.6583f, 29.2415f);
        this.f31364g.close();
        this.f31364g.setFillType(Path.FillType.WINDING);
        this.f31363f.setStyle(Paint.Style.FILL);
        this.f31363f.setColor(-411877);
        this.f30624a.add(this.f31363f);
        this.f31365h = new Paint();
        Path path3 = new Path();
        this.f31366i = path3;
        path3.addCircle(18.5f, 18.5f, 3.5f, Path.Direction.CW);
        this.f31365h.setStyle(Paint.Style.FILL);
        this.f31365h.setColor(-411877);
        this.f30624a.add(this.f31365h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31362e, this.f31361d);
        canvas.drawPath(this.f31364g, this.f31363f);
        canvas.drawPath(this.f31366i, this.f31365h);
    }
}
