package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gr extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31577d;

    /* renamed from: e  reason: collision with root package name */
    Path f31578e;

    static {
        Covode.recordClassIndex(18316);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(48.0f, 24.0f);
        this.f30626c.cubicTo(48.0f, 37.2548f, 37.2548f, 48.0f, 24.0f, 48.0f);
        this.f30626c.cubicTo(10.7452f, 48.0f, 0.0f, 37.2548f, 0.0f, 24.0f);
        this.f30626c.cubicTo(0.0f, 10.7452f, 10.7452f, 0.0f, 24.0f, 0.0f);
        this.f30626c.cubicTo(37.2548f, 0.0f, 48.0f, 10.7452f, 48.0f, 24.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-65536);
        this.f31577d = new Paint();
        Path path = new Path();
        this.f31578e = path;
        path.moveTo(36.6137f, 14.6272f);
        this.f31578e.cubicTo(37.9483f, 14.973f, 38.9971f, 15.9879f, 39.3544f, 17.2794f);
        this.f31578e.cubicTo(40.0f, 19.6179f, 40.0f, 24.5f, 40.0f, 24.5f);
        this.f31578e.cubicTo(40.0f, 24.5f, 40.0f, 29.3821f, 39.3518f, 31.7206f);
        this.f31578e.cubicTo(38.9946f, 33.0121f, 37.9457f, 34.027f, 36.6111f, 34.3728f);
        this.f31578e.cubicTo(34.1945f, 35.0f, 24.5f, 35.0f, 24.5f, 35.0f);
        this.f31578e.cubicTo(24.5f, 35.0f, 14.8055f, 35.0f, 12.3889f, 34.3728f);
        this.f31578e.cubicTo(11.0542f, 34.027f, 10.0054f, 33.0121f, 9.64817f, 31.7206f);
        this.f31578e.cubicTo(9.0f, 29.3821f, 9.0f, 24.5f, 9.0f, 24.5f);
        this.f31578e.cubicTo(9.0f, 24.5f, 9.0f, 19.6179f, 9.64817f, 17.2794f);
        this.f31578e.cubicTo(10.0054f, 15.9879f, 11.0542f, 14.973f, 12.3889f, 14.6272f);
        this.f31578e.cubicTo(14.8055f, 14.0f, 24.5f, 14.0f, 24.5f, 14.0f);
        this.f31578e.cubicTo(24.5f, 14.0f, 34.1945f, 14.0f, 36.6137f, 14.6272f);
        this.f31578e.close();
        this.f31578e.moveTo(29.4558f, 24.5f);
        this.f31578e.lineTo(21.3995f, 28.9993f);
        this.f31578e.lineTo(21.3995f, 20.0007f);
        this.f31578e.lineTo(29.4558f, 24.5f);
        this.f31578e.close();
        this.f31578e.setFillType(Path.FillType.EVEN_ODD);
        this.f31577d.setStyle(Paint.Style.FILL);
        this.f31577d.setColor(-1);
        this.f30624a.add(this.f31577d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31578e, this.f31577d);
    }
}
