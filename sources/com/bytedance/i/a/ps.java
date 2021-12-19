package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ps extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31776d;

    /* renamed from: e  reason: collision with root package name */
    Path f31777e;

    static {
        Covode.recordClassIndex(18560);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(39.0f, 13.0f);
        this.f30626c.lineTo(24.0f, 13.0f);
        this.f30626c.cubicTo(23.4477f, 13.0f, 23.0f, 12.5523f, 23.0f, 12.0f);
        this.f30626c.lineTo(23.0f, 10.0f);
        this.f30626c.cubicTo(23.0f, 9.44772f, 23.4477f, 9.0f, 24.0f, 9.0f);
        this.f30626c.lineTo(39.0f, 9.0f);
        this.f30626c.cubicTo(41.7614f, 9.0f, 44.0f, 11.2386f, 44.0f, 14.0f);
        this.f30626c.lineTo(44.0f, 37.0f);
        this.f30626c.cubicTo(44.0f, 39.7614f, 41.7614f, 42.0f, 39.0f, 42.0f);
        this.f30626c.lineTo(9.0f, 42.0f);
        this.f30626c.cubicTo(6.23858f, 42.0f, 4.0f, 39.7614f, 4.0f, 37.0f);
        this.f30626c.lineTo(4.0f, 19.0f);
        this.f30626c.cubicTo(4.0f, 18.4477f, 4.44772f, 18.0f, 5.0f, 18.0f);
        this.f30626c.lineTo(7.0f, 18.0f);
        this.f30626c.cubicTo(7.55228f, 18.0f, 8.0f, 18.4477f, 8.0f, 19.0f);
        this.f30626c.lineTo(8.0f, 37.0f);
        this.f30626c.cubicTo(8.0f, 37.5523f, 8.44771f, 38.0f, 9.0f, 38.0f);
        this.f30626c.lineTo(39.0f, 38.0f);
        this.f30626c.cubicTo(39.5523f, 38.0f, 40.0f, 37.5523f, 40.0f, 37.0f);
        this.f30626c.lineTo(40.0f, 32.0f);
        this.f30626c.lineTo(31.5f, 32.0f);
        this.f30626c.cubicTo(27.9101f, 32.0f, 25.0f, 29.0899f, 25.0f, 25.5f);
        this.f30626c.cubicTo(25.0f, 21.9101f, 27.9101f, 19.0f, 31.5f, 19.0f);
        this.f30626c.lineTo(40.0f, 19.0f);
        this.f30626c.lineTo(40.0f, 14.0f);
        this.f30626c.cubicTo(40.0f, 13.4477f, 39.5523f, 13.0f, 39.0f, 13.0f);
        this.f30626c.close();
        this.f30626c.moveTo(40.0f, 23.0f);
        this.f30626c.lineTo(31.5f, 23.0f);
        this.f30626c.cubicTo(30.1193f, 23.0f, 29.0f, 24.1193f, 29.0f, 25.5f);
        this.f30626c.cubicTo(29.0f, 26.8807f, 30.1193f, 28.0f, 31.5f, 28.0f);
        this.f30626c.lineTo(40.0f, 28.0f);
        this.f30626c.lineTo(40.0f, 23.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31776d = new Paint();
        Path path = new Path();
        this.f31777e = path;
        path.moveTo(11.0f, 13.0f);
        this.f31777e.lineTo(11.0f, 17.0f);
        this.f31777e.cubicTo(11.0f, 17.5523f, 11.4477f, 18.0f, 12.0f, 18.0f);
        this.f31777e.lineTo(14.0f, 18.0f);
        this.f31777e.cubicTo(14.5523f, 18.0f, 15.0f, 17.5523f, 15.0f, 17.0f);
        this.f31777e.lineTo(15.0f, 13.0f);
        this.f31777e.lineTo(19.0f, 13.0f);
        this.f31777e.cubicTo(19.5523f, 13.0f, 20.0f, 12.5523f, 20.0f, 12.0f);
        this.f31777e.lineTo(20.0f, 10.0f);
        this.f31777e.cubicTo(20.0f, 9.44772f, 19.5523f, 9.0f, 19.0f, 9.0f);
        this.f31777e.lineTo(15.0f, 9.0f);
        this.f31777e.lineTo(15.0f, 5.0f);
        this.f31777e.cubicTo(15.0f, 4.44772f, 14.5523f, 4.0f, 14.0f, 4.0f);
        this.f31777e.lineTo(12.0f, 4.0f);
        this.f31777e.cubicTo(11.4477f, 4.0f, 11.0f, 4.44772f, 11.0f, 5.0f);
        this.f31777e.lineTo(11.0f, 9.0f);
        this.f31777e.lineTo(7.0f, 9.0f);
        this.f31777e.cubicTo(6.44772f, 9.0f, 6.0f, 9.44772f, 6.0f, 10.0f);
        this.f31777e.lineTo(6.0f, 12.0f);
        this.f31777e.cubicTo(6.0f, 12.5523f, 6.44772f, 13.0f, 7.0f, 13.0f);
        this.f31777e.lineTo(11.0f, 13.0f);
        this.f31777e.close();
        this.f31777e.setFillType(Path.FillType.EVEN_ODD);
        this.f31776d.setStyle(Paint.Style.FILL);
        this.f31776d.setColor(-16777216);
        this.f30624a.add(this.f31776d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31777e, this.f31776d);
    }
}
