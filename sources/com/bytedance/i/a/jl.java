package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class jl extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31645d;

    /* renamed from: e  reason: collision with root package name */
    Path f31646e;

    /* renamed from: f  reason: collision with root package name */
    Matrix f31647f;

    /* renamed from: g  reason: collision with root package name */
    Paint f31648g;

    /* renamed from: h  reason: collision with root package name */
    Path f31649h;

    /* renamed from: i  reason: collision with root package name */
    Paint f31650i;

    /* renamed from: j  reason: collision with root package name */
    Path f31651j;

    /* renamed from: k  reason: collision with root package name */
    Paint f31652k;

    /* renamed from: l  reason: collision with root package name */
    Path f31653l;

    static {
        Covode.recordClassIndex(18391);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31645d = new Paint();
        Path path = new Path();
        this.f31646e = path;
        path.addRect(0.0f, 0.0f, 72.0f, 72.0f, Path.Direction.CW);
        Matrix matrix = new Matrix();
        this.f31647f = matrix;
        matrix.preTranslate(0.0f, 0.942383f);
        this.f31646e.transform(this.f31647f);
        this.f30626c.moveTo(16.6276f, 21.1668f);
        this.f30626c.cubicTo(16.6276f, 31.7501f, 25.2394f, 40.3619f, 35.8227f, 40.3619f);
        this.f30626c.cubicTo(46.4059f, 40.3619f, 55.0178f, 31.7501f, 55.0178f, 21.1668f);
        this.f30626c.cubicTo(55.0178f, 10.5835f, 46.4059f, 1.97168f, 35.8227f, 1.97168f);
        this.f30626c.cubicTo(25.2394f, 1.97168f, 16.6276f, 10.5835f, 16.6276f, 21.1668f);
        this.f30626c.close();
        this.f30626c.moveTo(19.7405f, 21.1671f);
        this.f30626c.cubicTo(19.7405f, 12.301f, 26.9568f, 5.08471f, 35.8229f, 5.08471f);
        this.f30626c.cubicTo(44.689f, 5.08471f, 51.9053f, 12.301f, 51.9053f, 21.1671f);
        this.f30626c.cubicTo(51.9053f, 30.0332f, 44.689f, 37.2495f, 35.8229f, 37.2495f);
        this.f30626c.cubicTo(26.9568f, 37.2495f, 19.7405f, 30.0332f, 19.7405f, 21.1671f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31648g = new Paint();
        Path path2 = new Path();
        this.f31649h = path2;
        path2.addCircle(56.0f, 59.9424f, 11.5f, Path.Direction.CW);
        this.f31648g.setStyle(Paint.Style.STROKE);
        this.f31648g.setStrokeWidth(3.0f);
        this.f31648g.setColor(-16777216);
        this.f30624a.add(this.f31648g);
        this.f31650i = new Paint();
        Path path3 = new Path();
        this.f31651j = path3;
        path3.moveTo(45.6153f, 47.77f);
        this.f31651j.cubicTo(42.5149f, 46.76f, 39.2196f, 46.2188f, 35.8228f, 46.2188f);
        this.f31651j.cubicTo(21.3954f, 46.2188f, 8.79922f, 55.9875f, 5.19365f, 69.9688f);
        this.f31651j.cubicTo(4.97576f, 70.7989f, 5.47898f, 71.6497f, 6.30904f, 71.8624f);
        this.f31651j.cubicTo(6.43874f, 71.8987f, 6.56844f, 71.9143f, 6.69813f, 71.9143f);
        this.f31651j.cubicTo(7.39331f, 71.9143f, 8.02104f, 71.4474f, 8.19743f, 70.7366f);
        this.f31651j.cubicTo(11.4554f, 58.1301f, 22.8117f, 49.3263f, 35.8176f, 49.3263f);
        this.f31651j.cubicTo(38.3677f, 49.3263f, 40.8541f, 49.6644f, 43.2284f, 50.3031f);
        this.f31651j.cubicTo(43.9303f, 49.3746f, 44.7312f, 48.525f, 45.6153f, 47.77f);
        this.f31651j.close();
        this.f31651j.setFillType(Path.FillType.EVEN_ODD);
        this.f31650i.setStyle(Paint.Style.FILL);
        this.f31650i.setColor(-16777216);
        this.f30624a.add(this.f31650i);
        this.f31652k = new Paint();
        Path path4 = new Path();
        this.f31653l = path4;
        path4.moveTo(53.5327f, 65.4043f);
        this.f31653l.cubicTo(53.728f, 65.5995f, 54.0446f, 65.5995f, 54.2398f, 65.4043f);
        this.f31653l.lineTo(55.6541f, 63.99f);
        this.f31653l.lineTo(63.004f, 56.6401f);
        this.f31653l.cubicTo(63.1992f, 56.4449f, 63.1992f, 56.1283f, 63.004f, 55.933f);
        this.f31653l.lineTo(61.5897f, 54.5188f);
        this.f31653l.cubicTo(61.3945f, 54.3236f, 61.0779f, 54.3236f, 60.8826f, 54.5188f);
        this.f31653l.lineTo(53.8863f, 61.5152f);
        this.f31653l.lineTo(50.7047f, 58.3336f);
        this.f31653l.cubicTo(50.5094f, 58.1383f, 50.1928f, 58.1383f, 49.9976f, 58.3336f);
        this.f31653l.lineTo(48.5834f, 59.7478f);
        this.f31653l.cubicTo(48.3881f, 59.943f, 48.3881f, 60.2596f, 48.5834f, 60.4549f);
        this.f31653l.lineTo(52.1185f, 63.99f);
        this.f31653l.lineTo(53.5327f, 65.4043f);
        this.f31653l.close();
        this.f31653l.setFillType(Path.FillType.EVEN_ODD);
        this.f31652k.setStyle(Paint.Style.FILL);
        this.f31652k.setColor(-16777216);
        this.f30624a.add(this.f31652k);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f, 73.0f);
        canvas.clipPath(this.f31646e);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31649h, this.f31648g);
        canvas.drawPath(this.f31651j, this.f31650i);
        canvas.drawPath(this.f31653l, this.f31652k);
    }
}
