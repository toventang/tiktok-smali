package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cp extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31353d;

    /* renamed from: e  reason: collision with root package name */
    Path f31354e;

    static {
        Covode.recordClassIndex(18206);
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
        this.f30625b.setColor(-15483504);
        this.f31353d = new Paint();
        Path path = new Path();
        this.f31354e = path;
        path.moveTo(24.0f, 40.5f);
        this.f31354e.cubicTo(24.875f, 40.5f, 38.0f, 29.0686f, 38.0f, 21.3947f);
        this.f31354e.cubicTo(38.0f, 13.7209f, 31.732f, 7.5f, 24.0f, 7.5f);
        this.f31354e.cubicTo(16.268f, 7.5f, 10.0f, 13.7209f, 10.0f, 21.3947f);
        this.f31354e.cubicTo(10.0f, 29.0686f, 23.125f, 40.5f, 24.0f, 40.5f);
        this.f31354e.close();
        this.f31354e.moveTo(24.0f, 25.7368f);
        this.f31354e.cubicTo(26.8995f, 25.7368f, 29.25f, 23.4039f, 29.25f, 20.5263f);
        this.f31354e.cubicTo(29.25f, 17.6486f, 26.8995f, 15.3157f, 24.0f, 15.3157f);
        this.f31354e.cubicTo(21.1005f, 15.3157f, 18.75f, 17.6486f, 18.75f, 20.5263f);
        this.f31354e.cubicTo(18.75f, 23.4039f, 21.1005f, 25.7368f, 24.0f, 25.7368f);
        this.f31354e.close();
        this.f31354e.setFillType(Path.FillType.EVEN_ODD);
        this.f31353d.setStyle(Paint.Style.FILL);
        this.f31353d.setColor(-1);
        this.f30624a.add(this.f31353d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31354e, this.f31353d);
    }
}
