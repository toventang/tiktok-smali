package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gw extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31583d;

    /* renamed from: e  reason: collision with root package name */
    Path f31584e;

    static {
        Covode.recordClassIndex(18321);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(38.0f, 3.0f);
        this.f30626c.cubicTo(38.0f, 2.44772f, 37.5523f, 2.0f, 37.0f, 2.0f);
        this.f30626c.lineTo(35.0f, 2.0f);
        this.f30626c.cubicTo(34.4477f, 2.0f, 34.0f, 2.44772f, 34.0f, 3.0f);
        this.f30626c.lineTo(34.0f, 9.0f);
        this.f30626c.lineTo(28.0f, 9.0f);
        this.f30626c.cubicTo(27.4477f, 9.0f, 27.0f, 9.44772f, 27.0f, 10.0f);
        this.f30626c.lineTo(27.0f, 12.0f);
        this.f30626c.cubicTo(27.0f, 12.5523f, 27.4477f, 13.0f, 28.0f, 13.0f);
        this.f30626c.lineTo(34.0f, 13.0f);
        this.f30626c.lineTo(34.0f, 19.0f);
        this.f30626c.cubicTo(34.0f, 19.5523f, 34.4477f, 20.0f, 35.0f, 20.0f);
        this.f30626c.lineTo(37.0f, 20.0f);
        this.f30626c.cubicTo(37.5523f, 20.0f, 38.0f, 19.5523f, 38.0f, 19.0f);
        this.f30626c.lineTo(38.0f, 13.0f);
        this.f30626c.lineTo(44.0f, 13.0f);
        this.f30626c.cubicTo(44.5523f, 13.0f, 45.0f, 12.5523f, 45.0f, 12.0f);
        this.f30626c.lineTo(45.0f, 10.0f);
        this.f30626c.cubicTo(45.0f, 9.44772f, 44.5523f, 9.0f, 44.0f, 9.0f);
        this.f30626c.lineTo(38.0f, 9.0f);
        this.f30626c.lineTo(38.0f, 3.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31583d = new Paint();
        Path path = new Path();
        this.f31584e = path;
        path.moveTo(23.0f, 9.0f);
        this.f31584e.cubicTo(23.5523f, 9.0f, 24.0f, 9.44772f, 24.0f, 10.0f);
        this.f31584e.lineTo(24.0f, 12.0f);
        this.f31584e.cubicTo(24.0f, 12.5523f, 23.5523f, 13.0f, 23.0f, 13.0f);
        this.f31584e.lineTo(8.0f, 13.0f);
        this.f31584e.cubicTo(7.44775f, 13.0f, 7.0f, 13.4478f, 7.0f, 14.0f);
        this.f31584e.lineTo(7.0f, 35.0562f);
        this.f31584e.cubicTo(7.0f, 35.4575f, 7.44897f, 35.6953f, 7.78076f, 35.47f);
        this.f31584e.lineTo(12.6155f, 32.1875f);
        this.f31584e.lineTo(15.7522f, 30.1602f);
        this.f31584e.cubicTo(15.9141f, 30.0557f, 16.1025f, 30.0f, 16.2949f, 30.0f);
        this.f31584e.lineTo(33.0f, 30.0f);
        this.f31584e.cubicTo(33.5522f, 30.0f, 34.0f, 29.5522f, 34.0f, 29.0f);
        this.f31584e.lineTo(34.0f, 24.0f);
        this.f31584e.cubicTo(34.0f, 23.4477f, 34.4477f, 23.0f, 35.0f, 23.0f);
        this.f31584e.lineTo(41.0f, 23.0f);
        this.f31584e.cubicTo(43.2091f, 23.0f, 45.0f, 24.7909f, 45.0f, 27.0f);
        this.f31584e.lineTo(45.0f, 38.0f);
        this.f31584e.cubicTo(45.0f, 40.2091f, 43.2091f, 42.0f, 41.0f, 42.0f);
        this.f31584e.lineTo(26.4721f, 42.0f);
        this.f31584e.cubicTo(26.1616f, 42.0f, 25.8554f, 42.0723f, 25.5777f, 42.2111f);
        this.f31584e.lineTo(19.4472f, 45.2764f);
        this.f31584e.cubicTo(18.7823f, 45.6088f, 18.0f, 45.1253f, 18.0f, 44.382f);
        this.f31584e.lineTo(18.0f, 34.0f);
        this.f31584e.lineTo(17.5825f, 34.0f);
        this.f31584e.cubicTo(17.2021f, 34.0f, 16.8296f, 34.1084f, 16.5085f, 34.3127f);
        this.f31584e.lineTo(11.5f, 37.5f);
        this.f31584e.lineTo(4.54321f, 42.0015f);
        this.f31584e.cubicTo(3.87793f, 42.4319f, 3.0f, 41.9543f, 3.0f, 41.1619f);
        this.f31584e.lineTo(3.0f, 13.0f);
        this.f31584e.cubicTo(3.0f, 10.8955f, 4.89551f, 9.0f, 7.0f, 9.0f);
        this.f31584e.lineTo(23.0f, 9.0f);
        this.f31584e.close();
        this.f31584e.moveTo(22.0f, 34.0f);
        this.f31584e.lineTo(22.0f, 39.691f);
        this.f31584e.cubicTo(22.0f, 40.0627f, 22.3912f, 40.3044f, 22.7236f, 40.1382f);
        this.f31584e.lineTo(25.7889f, 38.6056f);
        this.f31584e.cubicTo(25.9277f, 38.5361f, 26.0808f, 38.5f, 26.2361f, 38.5f);
        this.f31584e.lineTo(40.5f, 38.5f);
        this.f31584e.cubicTo(41.0523f, 38.5f, 41.5f, 38.0523f, 41.5f, 37.5f);
        this.f31584e.lineTo(41.5f, 27.5f);
        this.f31584e.cubicTo(41.5f, 26.9477f, 41.0523f, 26.5f, 40.5f, 26.5f);
        this.f31584e.lineTo(38.0f, 26.5f);
        this.f31584e.lineTo(38.0f, 30.0f);
        this.f31584e.cubicTo(38.0f, 32.1045f, 36.1045f, 34.0f, 34.0f, 34.0f);
        this.f31584e.lineTo(22.0f, 34.0f);
        this.f31584e.close();
        this.f31584e.setFillType(Path.FillType.EVEN_ODD);
        this.f31583d.setStyle(Paint.Style.FILL);
        this.f31583d.setColor(-16777216);
        this.f30624a.add(this.f31583d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31584e, this.f31583d);
    }
}
