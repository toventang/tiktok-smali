package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class dt extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31416d;

    /* renamed from: e  reason: collision with root package name */
    Path f31417e;

    static {
        Covode.recordClassIndex(18237);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(22.0f, 6.0f);
        this.f30626c.cubicTo(22.0f, 5.44772f, 22.4477f, 5.0f, 23.0f, 5.0f);
        this.f30626c.lineTo(41.0f, 5.0f);
        this.f30626c.cubicTo(41.5304f, 5.0f, 42.0391f, 5.21071f, 42.4142f, 5.58579f);
        this.f30626c.cubicTo(42.7893f, 5.96086f, 43.0f, 6.46957f, 43.0f, 7.0f);
        this.f30626c.lineTo(43.0f, 25.0f);
        this.f30626c.cubicTo(43.0f, 25.5523f, 42.5523f, 26.0f, 42.0f, 26.0f);
        this.f30626c.lineTo(40.0f, 26.0f);
        this.f30626c.cubicTo(39.4477f, 26.0f, 39.0f, 25.5523f, 39.0f, 25.0f);
        this.f30626c.lineTo(39.0f, 11.8284f);
        this.f30626c.lineTo(28.1213f, 22.7071f);
        this.f30626c.cubicTo(27.7308f, 23.0976f, 27.0976f, 23.0976f, 26.7071f, 22.7071f);
        this.f30626c.lineTo(25.2929f, 21.2929f);
        this.f30626c.cubicTo(24.9024f, 20.9024f, 24.9024f, 20.2692f, 25.2929f, 19.8787f);
        this.f30626c.lineTo(36.1716f, 9.0f);
        this.f30626c.lineTo(23.0f, 9.0f);
        this.f30626c.cubicTo(22.4477f, 9.0f, 22.0f, 8.55228f, 22.0f, 8.0f);
        this.f30626c.lineTo(22.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31416d = new Paint();
        Path path = new Path();
        this.f31417e = path;
        path.moveTo(26.0f, 42.0f);
        this.f31417e.cubicTo(26.0f, 42.5523f, 25.5523f, 43.0f, 25.0f, 43.0f);
        this.f31417e.lineTo(7.0f, 43.0f);
        this.f31417e.cubicTo(6.46957f, 43.0f, 5.96086f, 42.7893f, 5.58579f, 42.4142f);
        this.f31417e.cubicTo(5.21072f, 42.0391f, 5.0f, 41.5304f, 5.0f, 41.0f);
        this.f31417e.lineTo(5.0f, 23.0f);
        this.f31417e.cubicTo(5.0f, 22.4477f, 5.44772f, 22.0f, 6.0f, 22.0f);
        this.f31417e.lineTo(8.0f, 22.0f);
        this.f31417e.cubicTo(8.55228f, 22.0f, 9.0f, 22.4477f, 9.0f, 23.0f);
        this.f31417e.lineTo(9.0f, 36.1716f);
        this.f31417e.lineTo(19.8787f, 25.2929f);
        this.f31417e.cubicTo(20.2692f, 24.9024f, 20.9024f, 24.9024f, 21.2929f, 25.2929f);
        this.f31417e.lineTo(22.7071f, 26.7071f);
        this.f31417e.cubicTo(23.0976f, 27.0976f, 23.0976f, 27.7308f, 22.7071f, 28.1213f);
        this.f31417e.lineTo(11.8284f, 39.0f);
        this.f31417e.lineTo(25.0f, 39.0f);
        this.f31417e.cubicTo(25.5523f, 39.0f, 26.0f, 39.4477f, 26.0f, 40.0f);
        this.f31417e.lineTo(26.0f, 42.0f);
        this.f31417e.close();
        this.f31417e.setFillType(Path.FillType.EVEN_ODD);
        this.f31416d.setStyle(Paint.Style.FILL);
        this.f31416d.setColor(-16777216);
        this.f30624a.add(this.f31416d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31417e, this.f31416d);
    }
}
