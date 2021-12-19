package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class dx extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31418d;

    /* renamed from: e  reason: collision with root package name */
    Path f31419e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31420f;

    /* renamed from: g  reason: collision with root package name */
    Path f31421g;

    static {
        Covode.recordClassIndex(18241);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(5.0001f, 15.0f);
        this.f30626c.cubicTo(5.0001f, 9.47715f, 9.47725f, 5.0f, 15.0001f, 5.0f);
        this.f30626c.lineTo(33.5001f, 5.0f);
        this.f30626c.cubicTo(38.4096f, 5.0f, 42.4493f, 8.72415f, 42.9483f, 13.5016f);
        this.f30626c.cubicTo(43.0056f, 14.0509f, 42.5524f, 14.5f, 42.0001f, 14.5f);
        this.f30626c.lineTo(40.0001f, 14.5f);
        this.f30626c.cubicTo(39.4478f, 14.5f, 39.0096f, 14.0483f, 38.9103f, 13.505f);
        this.f30626c.cubicTo(38.4421f, 10.9424f, 36.1979f, 9.0f, 33.5001f, 9.0f);
        this.f30626c.lineTo(15.0001f, 9.0f);
        this.f30626c.cubicTo(11.6864f, 9.0f, 9.0001f, 11.6863f, 9.0001f, 15.0f);
        this.f30626c.lineTo(9.0001f, 28.8685f);
        this.f30626c.cubicTo(9.0001f, 29.6672f, 8.10996f, 30.1436f, 7.4454f, 29.7006f);
        this.f30626c.lineTo(0.72275f, 25.2188f);
        this.f30626c.cubicTo(0.263221f, 24.9124f, 0.139047f, 24.2916f, 0.4454f, 23.8321f);
        this.f30626c.lineTo(1.5548f, 22.1679f);
        this.f30626c.cubicTo(1.86115f, 21.7084f, 2.48202f, 21.5842f, 2.94155f, 21.8906f);
        this.f30626c.lineTo(5.0001f, 23.263f);
        this.f30626c.lineTo(5.0001f, 15.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31418d = new Paint();
        Path path = new Path();
        this.f31419e = path;
        path.moveTo(27.9353f, 28.5f);
        this.f31419e.lineTo(29.8992f, 33.1641f);
        this.f31419e.cubicTo(30.0553f, 33.5349f, 30.4184f, 33.776f, 30.8208f, 33.776f);
        this.f31419e.lineTo(32.8237f, 33.776f);
        this.f31419e.cubicTo(33.3882f, 33.776f, 33.7752f, 33.207f, 33.5677f, 32.6819f);
        this.f31419e.lineTo(26.3963f, 14.5371f);
        this.f31419e.cubicTo(25.5031f, 12.4157f, 22.4971f, 12.4157f, 21.6038f, 14.5371f);
        this.f31419e.lineTo(14.1856f, 32.6731f);
        this.f31419e.cubicTo(13.9703f, 33.1994f, 14.3574f, 33.776f, 14.926f, 33.776f);
        this.f31419e.lineTo(17.1794f, 33.776f);
        this.f31419e.cubicTo(17.5817f, 33.776f, 17.9449f, 33.5349f, 18.101f, 33.1641f);
        this.f31419e.lineTo(20.0648f, 28.5f);
        this.f31419e.lineTo(27.9353f, 28.5f);
        this.f31419e.close();
        this.f31419e.moveTo(24.1844f, 19.5915f);
        this.f31419e.cubicTo(24.1157f, 19.4284f, 23.8845f, 19.4284f, 23.8158f, 19.5915f);
        this.f31419e.lineTo(21.749f, 24.5f);
        this.f31419e.lineTo(26.2511f, 24.5f);
        this.f31419e.lineTo(24.1844f, 19.5915f);
        this.f31419e.close();
        this.f31419e.setFillType(Path.FillType.EVEN_ODD);
        this.f31418d.setStyle(Paint.Style.FILL);
        this.f31418d.setColor(-16777216);
        this.f30624a.add(this.f31418d);
        this.f31420f = new Paint();
        Path path2 = new Path();
        this.f31421g = path2;
        path2.moveTo(33.0f, 43.0f);
        this.f31421g.cubicTo(38.5229f, 43.0f, 43.0f, 38.5228f, 43.0f, 33.0f);
        this.f31421g.lineTo(43.0f, 24.737f);
        this.f31421g.lineTo(45.0586f, 26.1094f);
        this.f31421g.cubicTo(45.5181f, 26.4158f, 46.139f, 26.2916f, 46.4454f, 25.8321f);
        this.f31421g.lineTo(47.5548f, 24.1679f);
        this.f31421g.cubicTo(47.8611f, 23.7084f, 47.7369f, 23.0876f, 47.2774f, 22.7812f);
        this.f31421g.lineTo(40.5547f, 18.2994f);
        this.f31421g.cubicTo(39.8902f, 17.8564f, 39.0f, 18.3328f, 39.0f, 19.1315f);
        this.f31421g.lineTo(39.0f, 33.0f);
        this.f31421g.cubicTo(39.0f, 36.3137f, 36.3138f, 39.0f, 33.0f, 39.0f);
        this.f31421g.lineTo(14.5f, 39.0f);
        this.f31421g.cubicTo(11.8022f, 39.0f, 9.55806f, 37.0576f, 9.08982f, 34.495f);
        this.f31421g.cubicTo(8.99055f, 33.9517f, 8.55233f, 33.5f, 8.00005f, 33.5f);
        this.f31421g.lineTo(6.00005f, 33.5f);
        this.f31421g.cubicTo(5.44776f, 33.5f, 4.99452f, 33.9491f, 5.05189f, 34.4984f);
        this.f31421g.cubicTo(5.55086f, 39.2758f, 9.59054f, 43.0f, 14.5f, 43.0f);
        this.f31421g.lineTo(33.0f, 43.0f);
        this.f31421g.close();
        this.f31421g.setFillType(Path.FillType.WINDING);
        this.f31420f.setStyle(Paint.Style.FILL);
        this.f31420f.setColor(-16777216);
        this.f30624a.add(this.f31420f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31419e, this.f31418d);
        canvas.drawPath(this.f31421g, this.f31420f);
    }
}
