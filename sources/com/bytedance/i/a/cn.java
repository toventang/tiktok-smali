package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cn extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31343d;

    /* renamed from: e  reason: collision with root package name */
    Path f31344e;

    static {
        Covode.recordClassIndex(18204);
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
        this.f30625b.setColor(-11877110);
        this.f31343d = new Paint();
        Path path = new Path();
        this.f31344e = path;
        path.moveTo(15.9829f, 12.1263f);
        this.f31344e.lineTo(23.3356f, 5.59054f);
        this.f31344e.cubicTo(23.7145f, 5.25375f, 24.2855f, 5.25375f, 24.6644f, 5.59054f);
        this.f31344e.lineTo(32.0171f, 12.1263f);
        this.f31344e.cubicTo(32.3607f, 12.4317f, 32.1447f, 13.0f, 31.6849f, 13.0f);
        this.f31344e.lineTo(26.0f, 13.0f);
        this.f31344e.lineTo(26.0f, 16.0f);
        this.f31344e.lineTo(37.0f, 16.0f);
        this.f31344e.cubicTo(38.6569f, 16.0f, 40.0f, 17.3431f, 40.0f, 19.0f);
        this.f31344e.lineTo(40.0f, 38.0f);
        this.f31344e.cubicTo(40.0f, 39.6569f, 38.6569f, 41.0f, 37.0f, 41.0f);
        this.f31344e.lineTo(11.0f, 41.0f);
        this.f31344e.cubicTo(9.34315f, 41.0f, 8.0f, 39.6569f, 8.0f, 38.0f);
        this.f31344e.lineTo(8.0f, 19.0f);
        this.f31344e.cubicTo(8.0f, 17.3431f, 9.34315f, 16.0f, 11.0f, 16.0f);
        this.f31344e.lineTo(22.0f, 16.0f);
        this.f31344e.lineTo(22.0f, 13.0f);
        this.f31344e.lineTo(16.3151f, 13.0f);
        this.f31344e.cubicTo(15.8553f, 13.0f, 15.6393f, 12.4317f, 15.9829f, 12.1263f);
        this.f31344e.close();
        this.f31344e.moveTo(22.0f, 23.5f);
        this.f31344e.cubicTo(22.0f, 25.433f, 20.433f, 27.0f, 18.5f, 27.0f);
        this.f31344e.cubicTo(16.567f, 27.0f, 15.0f, 25.433f, 15.0f, 23.5f);
        this.f31344e.cubicTo(15.0f, 21.567f, 16.567f, 20.0f, 18.5f, 20.0f);
        this.f31344e.cubicTo(20.433f, 20.0f, 22.0f, 21.567f, 22.0f, 23.5f);
        this.f31344e.close();
        this.f31344e.moveTo(36.7071f, 30.7071f);
        this.f31344e.cubicTo(36.8946f, 30.8946f, 37.0f, 31.149f, 37.0f, 31.4142f);
        this.f31344e.lineTo(37.0f, 37.0f);
        this.f31344e.cubicTo(37.0f, 37.5523f, 36.5523f, 38.0f, 36.0f, 38.0f);
        this.f31344e.lineTo(12.0f, 38.0f);
        this.f31344e.cubicTo(11.4477f, 38.0f, 11.0f, 37.5523f, 11.0f, 37.0f);
        this.f31344e.lineTo(11.0f, 34.7038f);
        this.f31344e.cubicTo(11.0f, 34.4155f, 11.1245f, 34.1411f, 11.3415f, 33.9512f);
        this.f31344e.lineTo(15.5919f, 30.2322f);
        this.f31344e.cubicTo(16.3843f, 29.5388f, 17.5785f, 29.5786f, 18.3231f, 30.3231f);
        this.f31344e.lineTo(20.6464f, 32.6464f);
        this.f31344e.cubicTo(20.8417f, 32.8417f, 21.1583f, 32.8416f, 21.3535f, 32.6464f);
        this.f31344e.lineTo(28.5858f, 25.4142f);
        this.f31344e.cubicTo(29.3668f, 24.6331f, 30.6332f, 24.6331f, 31.4142f, 25.4142f);
        this.f31344e.lineTo(36.7071f, 30.7071f);
        this.f31344e.close();
        this.f31344e.setFillType(Path.FillType.EVEN_ODD);
        this.f31343d.setStyle(Paint.Style.FILL);
        this.f31343d.setColor(-1);
        this.f30624a.add(this.f31343d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31344e, this.f31343d);
    }
}
