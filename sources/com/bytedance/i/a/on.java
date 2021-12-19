package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class on extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31758d;

    /* renamed from: e  reason: collision with root package name */
    Path f31759e;

    static {
        Covode.recordClassIndex(18528);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.99767f, 11.4934f);
        this.f30626c.cubicTo(9.0013f, 10.1153f, 10.1195f, 9.0f, 11.4977f, 9.0f);
        this.f30626c.lineTo(36.5029f, 9.0f);
        this.f30626c.cubicTo(37.8811f, 9.0f, 38.9993f, 10.1152f, 39.0029f, 11.4934f);
        this.f30626c.lineTo(39.0587f, 32.4934f);
        this.f30626c.cubicTo(39.0623f, 33.8767f, 37.942f, 35.0f, 36.5587f, 35.0f);
        this.f30626c.lineTo(29.2111f, 35.0f);
        this.f30626c.lineTo(25.9354f, 39.0039f);
        this.f30626c.cubicTo(24.9352f, 40.2264f, 23.0659f, 40.2265f, 22.0656f, 39.004f);
        this.f30626c.lineTo(18.7895f, 35.0f);
        this.f30626c.lineTo(11.4424f, 35.0f);
        this.f30626c.cubicTo(10.0591f, 35.0f, 8.93875f, 33.8767f, 8.94239f, 32.4934f);
        this.f30626c.lineTo(8.99767f, 11.4934f);
        this.f30626c.close();
        this.f30626c.moveTo(11.9964f, 12.0f);
        this.f30626c.lineTo(11.9437f, 32.0f);
        this.f30626c.lineTo(20.2111f, 32.0f);
        this.f30626c.lineTo(24.0005f, 36.6312f);
        this.f30626c.lineTo(27.7895f, 32.0f);
        this.f30626c.lineTo(36.0573f, 32.0f);
        this.f30626c.lineTo(36.0043f, 12.0f);
        this.f30626c.lineTo(11.9964f, 12.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31758d = new Paint();
        Path path = new Path();
        this.f31759e = path;
        path.moveTo(18.0f, 22.0f);
        this.f31759e.cubicTo(18.0f, 21.4477f, 18.4477f, 21.0f, 19.0f, 21.0f);
        this.f31759e.lineTo(29.0f, 21.0f);
        this.f31759e.cubicTo(29.5523f, 21.0f, 30.0f, 21.4477f, 30.0f, 22.0f);
        this.f31759e.lineTo(30.0f, 23.0f);
        this.f31759e.cubicTo(30.0f, 23.5523f, 29.5523f, 24.0f, 29.0f, 24.0f);
        this.f31759e.lineTo(19.0f, 24.0f);
        this.f31759e.cubicTo(18.4477f, 24.0f, 18.0f, 23.5523f, 18.0f, 23.0f);
        this.f31759e.lineTo(18.0f, 22.0f);
        this.f31759e.close();
        this.f31759e.setFillType(Path.FillType.WINDING);
        this.f31758d.setStyle(Paint.Style.FILL);
        this.f31758d.setColor(-16777216);
        this.f30624a.add(this.f31758d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31759e, this.f31758d);
    }
}
