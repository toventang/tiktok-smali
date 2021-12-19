package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class df extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31408d;

    /* renamed from: e  reason: collision with root package name */
    Path f31409e;

    static {
        Covode.recordClassIndex(18223);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(43.4143f, 16.5858f);
        this.f30626c.lineTo(31.1214f, 4.29289f);
        this.f30626c.cubicTo(30.7309f, 3.90237f, 30.0977f, 3.90237f, 29.7072f, 4.29289f);
        this.f30626c.lineTo(28.2929f, 5.70711f);
        this.f30626c.cubicTo(27.9024f, 6.09763f, 27.9024f, 6.7308f, 28.293f, 7.12132f);
        this.f30626c.lineTo(37.1716f, 16.0f);
        this.f30626c.lineTo(5.00006f, 16.0f);
        this.f30626c.cubicTo(4.44777f, 16.0f, 4.00006f, 16.4477f, 4.00006f, 17.0f);
        this.f30626c.lineTo(4.00006f, 19.0f);
        this.f30626c.cubicTo(4.00006f, 19.5523f, 4.44777f, 20.0f, 5.00006f, 20.0f);
        this.f30626c.lineTo(42.0001f, 20.0f);
        this.f30626c.cubicTo(42.809f, 20.0f, 43.5383f, 19.5127f, 43.8478f, 18.7654f);
        this.f30626c.cubicTo(44.1574f, 18.018f, 43.9863f, 17.1578f, 43.4143f, 16.5858f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31408d = new Paint();
        Path path = new Path();
        this.f31409e = path;
        path.moveTo(4.58584f, 31.4142f);
        this.f31409e.lineTo(16.8787f, 43.7071f);
        this.f31409e.cubicTo(17.2693f, 44.0976f, 17.9024f, 44.0976f, 18.293f, 43.7071f);
        this.f31409e.lineTo(19.7072f, 42.2929f);
        this.f31409e.cubicTo(20.0977f, 41.9024f, 20.0977f, 41.2692f, 19.7072f, 40.8787f);
        this.f31409e.lineTo(10.8285f, 32.0f);
        this.f31409e.lineTo(43.0001f, 32.0f);
        this.f31409e.cubicTo(43.5523f, 32.0f, 44.0001f, 31.5523f, 44.0001f, 31.0f);
        this.f31409e.lineTo(44.0001f, 29.0f);
        this.f31409e.cubicTo(44.0001f, 28.4477f, 43.5523f, 28.0f, 43.0001f, 28.0f);
        this.f31409e.lineTo(6.00006f, 28.0f);
        this.f31409e.cubicTo(5.19113f, 28.0f, 4.46186f, 28.4873f, 4.1523f, 29.2346f);
        this.f31409e.cubicTo(3.84274f, 29.982f, 4.01385f, 30.8422f, 4.58584f, 31.4142f);
        this.f31409e.close();
        this.f31409e.setFillType(Path.FillType.WINDING);
        this.f31408d.setStyle(Paint.Style.FILL);
        this.f31408d.setColor(-16777216);
        this.f30624a.add(this.f31408d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31409e, this.f31408d);
    }
}
