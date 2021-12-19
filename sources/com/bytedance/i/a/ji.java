package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ji extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31639d;

    /* renamed from: e  reason: collision with root package name */
    Path f31640e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31641f;

    /* renamed from: g  reason: collision with root package name */
    Path f31642g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31643h;

    /* renamed from: i  reason: collision with root package name */
    Path f31644i;

    static {
        Covode.recordClassIndex(18388);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31639d = new Paint();
        Path path = new Path();
        this.f31640e = path;
        path.addRect(0.0f, 0.0f, 72.0f, 72.0f, Path.Direction.CW);
        this.f30626c.moveTo(36.6664f, 18.8333f);
        this.f30626c.cubicTo(33.5039f, 18.8333f, 31.2172f, 21.1943f, 30.0897f, 24.5767f);
        this.f30626c.lineTo(27.2437f, 23.628f);
        this.f30626c.cubicTo(28.5777f, 19.626f, 31.6724f, 15.8333f, 36.6664f, 15.8333f);
        this.f30626c.cubicTo(41.5731f, 15.8333f, 45.5508f, 19.811f, 45.5508f, 24.7177f);
        this.f30626c.cubicTo(45.5508f, 27.3775f, 43.9024f, 29.7605f, 41.9221f, 31.4018f);
        this.f30626c.cubicTo(39.9272f, 33.0554f, 37.2923f, 34.2175f, 34.8203f, 34.2175f);
        this.f30626c.lineTo(34.8203f, 31.2175f);
        this.f30626c.cubicTo(36.4266f, 31.2175f, 38.407f, 30.4188f, 40.0077f, 29.0921f);
        this.f30626c.cubicTo(41.6231f, 27.7531f, 42.5508f, 26.1362f, 42.5508f, 24.7177f);
        this.f30626c.cubicTo(42.5508f, 21.4679f, 39.9163f, 18.8333f, 36.6664f, 18.8333f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31641f = new Paint();
        Path path2 = new Path();
        this.f31642g = path2;
        path2.moveTo(38.4444f, 41.7778f);
        this.f31642g.cubicTo(38.4444f, 43.1278f, 37.35f, 44.2222f, 36.0f, 44.2222f);
        this.f31642g.cubicTo(34.65f, 44.2222f, 33.5555f, 43.1278f, 33.5555f, 41.7778f);
        this.f31642g.cubicTo(33.5555f, 40.4277f, 34.65f, 39.3333f, 36.0f, 39.3333f);
        this.f31642g.cubicTo(37.35f, 39.3333f, 38.4444f, 40.4277f, 38.4444f, 41.7778f);
        this.f31642g.close();
        this.f31642g.setFillType(Path.FillType.WINDING);
        this.f31641f.setStyle(Paint.Style.FILL);
        this.f31641f.setColor(-16777216);
        this.f30624a.add(this.f31641f);
        this.f31643h = new Paint();
        Path path3 = new Path();
        this.f31644i = path3;
        path3.moveTo(1.5f, 8.625f);
        this.f31644i.cubicTo(1.5f, 5.5184f, 4.0184f, 3.0f, 7.125f, 3.0f);
        this.f31644i.lineTo(64.875f, 3.0f);
        this.f31644i.cubicTo(67.9817f, 3.0f, 70.5f, 5.51841f, 70.5f, 8.625f);
        this.f31644i.lineTo(70.5f, 51.9375f);
        this.f31644i.cubicTo(70.5f, 55.0441f, 67.9817f, 57.5625f, 64.875f, 57.5625f);
        this.f31644i.lineTo(18.0588f, 57.5625f);
        this.f31644i.lineTo(4.06066f, 71.5607f);
        this.f31644i.cubicTo(3.63166f, 71.9897f, 2.98649f, 72.118f, 2.42597f, 71.8858f);
        this.f31644i.cubicTo(1.86546f, 71.6536f, 1.5f, 71.1067f, 1.5f, 70.5f);
        this.f31644i.lineTo(1.5f, 8.625f);
        this.f31644i.close();
        this.f31644i.moveTo(4.5f, 66.8787f);
        this.f31644i.lineTo(16.3768f, 55.0018f);
        this.f31644i.cubicTo(16.6582f, 54.7205f, 17.0397f, 54.5625f, 17.4375f, 54.5625f);
        this.f31644i.lineTo(64.875f, 54.5625f);
        this.f31644i.cubicTo(66.3248f, 54.5625f, 67.5f, 53.3873f, 67.5f, 51.9375f);
        this.f31644i.lineTo(67.5f, 8.625f);
        this.f31644i.cubicTo(67.5f, 7.17524f, 66.3248f, 6.0f, 64.875f, 6.0f);
        this.f31644i.lineTo(7.125f, 6.0f);
        this.f31644i.cubicTo(5.67525f, 6.0f, 4.5f, 7.17525f, 4.5f, 8.625f);
        this.f31644i.lineTo(4.5f, 66.8787f);
        this.f31644i.close();
        this.f31644i.setFillType(Path.FillType.EVEN_ODD);
        this.f31643h.setStyle(Paint.Style.FILL);
        this.f31643h.setColor(-16777216);
        this.f30624a.add(this.f31643h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.clipPath(this.f31640e);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31642g, this.f31641f);
        canvas.drawPath(this.f31644i, this.f31643h);
    }
}
