package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cw extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31384d;

    /* renamed from: e  reason: collision with root package name */
    Path f31385e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31386f;

    /* renamed from: g  reason: collision with root package name */
    Path f31387g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31388h;

    /* renamed from: i  reason: collision with root package name */
    Path f31389i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31390j;

    /* renamed from: k  reason: collision with root package name */
    Path f31391k;

    /* renamed from: l  reason: collision with root package name */
    Paint f31392l;

    /* renamed from: m  reason: collision with root package name */
    Path f31393m;
    Paint n;
    Path o;
    Paint p;
    Path q;
    Paint r;
    Path s;

    static {
        Covode.recordClassIndex(18213);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31384d = new Paint();
        Path path = new Path();
        this.f31385e = path;
        path.addRoundRect(new RectF(0.0f, 0.0f, 48.0f, 48.0f), 2.5002f, 2.5002f, Path.Direction.CW);
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
        this.f30625b.setColor(-119723);
        this.f31386f = new Paint();
        Path path2 = new Path();
        this.f31387g = path2;
        path2.addCircle(23.9995f, 24.0005f, 17.975f, Path.Direction.CW);
        this.f31386f.setStyle(Paint.Style.STROKE);
        this.f31386f.setStrokeWidth(0.050004f);
        this.f31386f.setAlpha(127);
        this.f31386f.setColor(-6546304);
        this.f30624a.add(this.f31386f);
        this.f31388h = new Paint();
        Path path3 = new Path();
        this.f31389i = path3;
        path3.addRect(8.02451f, 8.02537f, 39.97451f, 39.975372f, Path.Direction.CW);
        this.f31388h.setStyle(Paint.Style.STROKE);
        this.f31388h.setStrokeWidth(0.050004f);
        this.f31388h.setAlpha(127);
        this.f31388h.setColor(-6546304);
        this.f30624a.add(this.f31388h);
        this.f31390j = new Paint();
        Path path4 = new Path();
        this.f31391k = path4;
        path4.addRect(6.02451f, 10.0252f, 41.97451f, 37.9752f, Path.Direction.CW);
        this.f31390j.setStyle(Paint.Style.STROKE);
        this.f31390j.setStrokeWidth(0.050004f);
        this.f31390j.setAlpha(127);
        this.f31390j.setColor(-6546304);
        this.f30624a.add(this.f31390j);
        this.f31392l = new Paint();
        Path path5 = new Path();
        this.f31393m = path5;
        path5.addRect(10.024f, 6.02549f, 37.974f, 41.97549f, Path.Direction.CW);
        this.f31392l.setStyle(Paint.Style.STROKE);
        this.f31392l.setStrokeWidth(0.050004f);
        this.f31392l.setAlpha(127);
        this.f31392l.setColor(-6546304);
        this.f30624a.add(this.f31392l);
        this.n = new Paint();
        Path path6 = new Path();
        this.o = path6;
        path6.moveTo(0.0f, 0.0f);
        this.o.lineTo(48.0f, 48.0f);
        this.o.moveTo(48.0f, 0.0f);
        this.o.lineTo(0.0f, 48.0f);
        this.o.moveTo(24.0f, 0.0f);
        this.o.lineTo(24.0f, 48.0f);
        this.o.moveTo(0.0f, 24.0f);
        this.o.lineTo(48.0f, 24.0f);
        this.o.setFillType(Path.FillType.WINDING);
        this.n.setStyle(Paint.Style.STROKE);
        this.n.setStrokeWidth(0.050004f);
        this.n.setAlpha(51);
        this.n.setColor(-6546304);
        this.f30624a.add(this.n);
        this.p = new Paint();
        Path path7 = new Path();
        this.q = path7;
        path7.addRoundRect(new RectF(0.025002f, 0.025002f, 47.975002f, 47.975002f), 2.4752f, 2.4752f, Path.Direction.CW);
        this.p.setStyle(Paint.Style.STROKE);
        this.p.setStrokeWidth(0.050004f);
        this.p.setAlpha(127);
        this.p.setColor(-6546304);
        this.f30624a.add(this.p);
        this.r = new Paint();
        Path path8 = new Path();
        this.s = path8;
        path8.moveTo(20.7961f, 13.8767f);
        this.s.lineTo(22.5639f, 12.109f);
        this.s.cubicTo(23.3449f, 11.3279f, 23.3449f, 10.0616f, 22.5639f, 9.28055f);
        this.s.lineTo(21.8916f, 8.60824f);
        this.s.cubicTo(21.6963f, 8.41297f, 21.6963f, 8.09639f, 21.8916f, 7.90113f);
        this.s.lineTo(24.0129f, 5.77981f);
        this.s.cubicTo(24.2082f, 5.58455f, 24.5247f, 5.58455f, 24.72f, 5.77981f);
        this.s.lineTo(25.3923f, 6.45212f);
        this.s.cubicTo(27.7355f, 8.79527f, 27.7355f, 12.5943f, 25.3923f, 14.9374f);
        this.s.lineTo(23.6245f, 16.7052f);
        this.s.cubicTo(23.4293f, 16.9004f, 23.1127f, 16.9004f, 22.9174f, 16.7052f);
        this.s.lineTo(20.7961f, 14.5839f);
        this.s.cubicTo(20.6009f, 14.3886f, 20.6009f, 14.072f, 20.7961f, 13.8767f);
        this.s.close();
        this.s.moveTo(36.0111f, 12.803f);
        this.s.cubicTo(36.2063f, 12.9983f, 36.2063f, 13.3148f, 36.0111f, 13.5101f);
        this.s.lineTo(28.2196f, 21.3016f);
        this.s.cubicTo(28.0243f, 21.4969f, 27.7077f, 21.4969f, 27.5125f, 21.3016f);
        this.s.lineTo(25.3912f, 19.1803f);
        this.s.cubicTo(25.1959f, 18.985f, 25.1959f, 18.6684f, 25.3912f, 18.4732f);
        this.s.lineTo(33.1827f, 10.6817f);
        this.s.cubicTo(33.3779f, 10.4864f, 33.6945f, 10.4864f, 33.8898f, 10.6817f);
        this.s.lineTo(36.0111f, 12.803f);
        this.s.close();
        this.s.moveTo(31.8613f, 32.1257f);
        this.s.lineTo(7.86026f, 40.126f);
        this.s.cubicTo(7.06412f, 40.3914f, 6.30671f, 39.634f, 6.57209f, 38.8378f);
        this.s.lineTo(14.5724f, 14.8368f);
        this.s.cubicTo(14.8118f, 14.1186f, 15.7233f, 13.9034f, 16.2587f, 14.4388f);
        this.s.lineTo(32.2593f, 30.4394f);
        this.s.cubicTo(32.7947f, 30.9747f, 32.5795f, 31.8863f, 31.8613f, 32.1257f);
        this.s.close();
        this.s.moveTo(32.8163f, 25.8983f);
        this.s.lineTo(35.2911f, 23.4234f);
        this.s.cubicTo(36.0722f, 22.6424f, 37.3385f, 22.6424f, 38.1196f, 23.4234f);
        this.s.lineTo(38.8267f, 24.1305f);
        this.s.cubicTo(39.0219f, 24.3258f, 39.3385f, 24.3258f, 39.5338f, 24.1305f);
        this.s.lineTo(41.6551f, 22.0092f);
        this.s.cubicTo(41.8504f, 21.8139f, 41.8504f, 21.4974f, 41.6551f, 21.3021f);
        this.s.lineTo(40.948f, 20.595f);
        this.s.cubicTo(38.6048f, 18.2518f, 34.8059f, 18.2518f, 32.4627f, 20.595f);
        this.s.lineTo(29.9878f, 23.0699f);
        this.s.cubicTo(29.7926f, 23.2651f, 29.7926f, 23.5817f, 29.9878f, 23.777f);
        this.s.lineTo(32.1092f, 25.8983f);
        this.s.cubicTo(32.3044f, 26.0935f, 32.621f, 26.0935f, 32.8163f, 25.8983f);
        this.s.close();
        this.s.setFillType(Path.FillType.EVEN_ODD);
        this.r.setStyle(Paint.Style.FILL);
        this.r.setColor(-1);
        this.f30624a.add(this.r);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.clipPath(this.f31385e);
        canvas.drawPath(this.f31387g, this.f31386f);
        canvas.drawPath(this.f31389i, this.f31388h);
        canvas.drawPath(this.f31391k, this.f31390j);
        canvas.drawPath(this.f31393m, this.f31392l);
        canvas.drawPath(this.o, this.n);
        canvas.drawPath(this.q, this.p);
        canvas.drawPath(this.s, this.r);
    }
}
