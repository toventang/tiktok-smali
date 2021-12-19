package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class as extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31289d;

    /* renamed from: e  reason: collision with root package name */
    Path f31290e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31291f;

    /* renamed from: g  reason: collision with root package name */
    Path f31292g;

    static {
        Covode.recordClassIndex(18155);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(9.0f, 12.5f);
        this.f30626c.cubicTo(9.0f, 12.2239f, 9.22386f, 12.0f, 9.5f, 12.0f);
        this.f30626c.lineTo(38.5f, 12.0f);
        this.f30626c.cubicTo(38.7761f, 12.0f, 39.0f, 12.2239f, 39.0f, 12.5f);
        this.f30626c.lineTo(39.0f, 14.5f);
        this.f30626c.cubicTo(39.0f, 14.7761f, 38.7761f, 15.0f, 38.5f, 15.0f);
        this.f30626c.lineTo(9.5f, 15.0f);
        this.f30626c.cubicTo(9.22386f, 15.0f, 9.0f, 14.7761f, 9.0f, 14.5f);
        this.f30626c.lineTo(9.0f, 12.5f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31289d = new Paint();
        Path path = new Path();
        this.f31290e = path;
        path.moveTo(9.0f, 23.0f);
        this.f31290e.cubicTo(9.0f, 22.7239f, 9.22386f, 22.5f, 9.5f, 22.5f);
        this.f31290e.lineTo(38.5f, 22.5f);
        this.f31290e.cubicTo(38.7761f, 22.5f, 39.0f, 22.7239f, 39.0f, 23.0f);
        this.f31290e.lineTo(39.0f, 25.0f);
        this.f31290e.cubicTo(39.0f, 25.2761f, 38.7761f, 25.5f, 38.5f, 25.5f);
        this.f31290e.lineTo(9.5f, 25.5f);
        this.f31290e.cubicTo(9.22386f, 25.5f, 9.0f, 25.2761f, 9.0f, 25.0f);
        this.f31290e.lineTo(9.0f, 23.0f);
        this.f31290e.close();
        this.f31290e.setFillType(Path.FillType.WINDING);
        this.f31289d.setStyle(Paint.Style.FILL);
        this.f31289d.setColor(-16777216);
        this.f30624a.add(this.f31289d);
        this.f31291f = new Paint();
        Path path2 = new Path();
        this.f31292g = path2;
        path2.moveTo(9.0f, 33.5f);
        this.f31292g.cubicTo(9.0f, 33.2239f, 9.22386f, 33.0f, 9.5f, 33.0f);
        this.f31292g.lineTo(38.5f, 33.0f);
        this.f31292g.cubicTo(38.7761f, 33.0f, 39.0f, 33.2239f, 39.0f, 33.5f);
        this.f31292g.lineTo(39.0f, 35.5f);
        this.f31292g.cubicTo(39.0f, 35.7761f, 38.7761f, 36.0f, 38.5f, 36.0f);
        this.f31292g.lineTo(9.5f, 36.0f);
        this.f31292g.cubicTo(9.22386f, 36.0f, 9.0f, 35.7761f, 9.0f, 35.5f);
        this.f31292g.lineTo(9.0f, 33.5f);
        this.f31292g.close();
        this.f31292g.setFillType(Path.FillType.WINDING);
        this.f31291f.setStyle(Paint.Style.FILL);
        this.f31291f.setColor(-16777216);
        this.f30624a.add(this.f31291f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31290e, this.f31289d);
        canvas.drawPath(this.f31292g, this.f31291f);
    }
}
