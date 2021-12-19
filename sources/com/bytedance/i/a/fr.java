package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fr extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31453d;

    /* renamed from: e  reason: collision with root package name */
    Path f31454e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31455f;

    /* renamed from: g  reason: collision with root package name */
    Path f31456g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31457h;

    /* renamed from: i  reason: collision with root package name */
    Path f31458i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31459j;

    /* renamed from: k  reason: collision with root package name */
    Path f31460k;

    /* renamed from: l  reason: collision with root package name */
    Paint f31461l;

    /* renamed from: m  reason: collision with root package name */
    Path f31462m;
    Paint n;
    Path o;
    Paint p;
    Path q;
    Paint r;
    Path s;

    static {
        Covode.recordClassIndex(18289);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31453d = new Paint();
        Path path = new Path();
        this.f31454e = path;
        path.addRect(0.0f, 0.0f, 48.0f, 48.0f, Path.Direction.CW);
        this.f30626c.moveTo(23.9392f, 0.00425038f);
        this.f30626c.cubicTo(23.9392f, 0.00425038f, 38.0858f, -0.628314f, 45.586f, 13.5404f);
        this.f30626c.lineTo(22.7355f, 13.5404f);
        this.f30626c.cubicTo(22.7355f, 13.5404f, 18.4232f, 13.4019f, 14.7395f, 18.6147f);
        this.f30626c.cubicTo(13.6813f, 20.8027f, 12.5438f, 23.0565f, 13.8203f, 27.4983f);
        this.f30626c.cubicTo(11.9815f, 24.3943f, 4.05835f, 10.6474f, 4.05835f, 10.6474f);
        this.f30626c.cubicTo(4.05835f, 10.6474f, 9.64692f, 0.564388f, 23.939f, 0.00425038f);
        this.f30626c.lineTo(23.9392f, 0.00425038f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-2272956);
        this.f31455f = new Paint();
        Path path2 = new Path();
        this.f31456g = path2;
        path2.moveTo(44.8518f, 35.9731f);
        this.f31456g.cubicTo(44.8518f, 35.9731f, 38.324f, 48.5008f, 22.2661f, 47.8814f);
        this.f31456g.cubicTo(24.2502f, 44.461f, 33.6945f, 28.1638f, 33.6945f, 28.1638f);
        this.f31456g.cubicTo(33.6945f, 28.1638f, 35.9763f, 24.5129f, 33.2845f, 18.7268f);
        this.f31456g.cubicTo(31.9153f, 16.7168f, 29.4604f, 14.6146f, 24.9633f, 13.4941f);
        this.f31456g.cubicTo(28.581f, 13.4614f, 45.5463f, 13.4941f, 45.5463f, 13.4941f);
        this.f31456g.cubicTo(45.5463f, 13.4941f, 51.5051f, 23.3597f, 44.8518f, 35.9731f);
        this.f31456g.close();
        this.f31456g.setFillType(Path.FillType.WINDING);
        this.f31455f.setStyle(Paint.Style.FILL);
        this.f31455f.setColor(-12986);
        this.f30624a.add(this.f31455f);
        this.f31457h = new Paint();
        Path path3 = new Path();
        this.f31458i = path3;
        path3.moveTo(3.12545f, 36.072f);
        this.f31458i.cubicTo(3.12545f, 36.072f, -4.50021f, 24.1768f, 4.07112f, 10.6275f);
        this.f31458i.cubicTo(6.04867f, 14.0479f, 15.493f, 30.3452f, 15.493f, 30.3452f);
        this.f31458i.cubicTo(15.493f, 30.3452f, 17.5301f, 34.1412f, 23.899f, 34.7077f);
        this.f31458i.cubicTo(26.3264f, 34.5299f, 28.8528f, 34.3783f, 32.0805f, 31.0635f);
        this.f31458i.cubicTo(30.3011f, 34.2005f, 22.3182f, 47.9079f, 22.3182f, 47.9079f);
        this.f31458i.cubicTo(22.3182f, 47.9079f, 10.7575f, 48.1188f, 3.12526f, 36.072f);
        this.f31458i.lineTo(3.12545f, 36.072f);
        this.f31458i.close();
        this.f31458i.setFillType(Path.FillType.WINDING);
        this.f31457h.setStyle(Paint.Style.FILL);
        this.f31457h.setColor(-14834590);
        this.f30624a.add(this.f31457h);
        this.f31459j = new Paint();
        Path path4 = new Path();
        this.f31460k = path4;
        path4.moveTo(22.2593f, 48.0f);
        this.f31460k.lineTo(25.4735f, 34.6354f);
        this.f31460k.cubicTo(25.4735f, 34.6354f, 29.0053f, 34.3584f, 31.9684f, 31.1228f);
        this.f31460k.cubicTo(30.1296f, 34.3455f, 22.2593f, 48.0f, 22.2593f, 48.0f);
        this.f31460k.close();
        this.f31460k.setFillType(Path.FillType.WINDING);
        this.f31459j.setStyle(Paint.Style.FILL);
        this.f31459j.setColor(-16777216);
        this.f31459j.setAlpha(25);
        this.f30624a.add(this.f31459j);
        this.f31461l = new Paint();
        Path path5 = new Path();
        this.f31462m = path5;
        path5.moveTo(45.5396f, 13.5008f);
        this.f31462m.lineTo(32.3055f, 17.3692f);
        this.f31462m.cubicTo(32.3055f, 17.3692f, 29.3034f, 14.4497f, 25.0112f, 13.5008f);
        this.f31462m.cubicTo(28.7347f, 13.481f, 45.5396f, 13.5008f, 45.5396f, 13.5008f);
        this.f31462m.close();
        this.f31462m.setFillType(Path.FillType.WINDING);
        this.f31461l.setStyle(Paint.Style.FILL);
        this.f31461l.setColor(-16777216);
        this.f31461l.setAlpha(25);
        this.f30624a.add(this.f31461l);
        this.n = new Paint();
        Path path6 = new Path();
        this.o = path6;
        path6.moveTo(13.5624f, 27.0108f);
        this.o.cubicTo(11.7037f, 23.8013f, 4.05835f, 10.6474f, 4.05835f, 10.6474f);
        this.o.lineTo(13.8599f, 20.3085f);
        this.o.cubicTo(13.8599f, 20.3085f, 12.8545f, 22.3713f, 13.2316f, 25.3236f);
        this.o.lineTo(13.5622f, 27.0108f);
        this.o.lineTo(13.5624f, 27.0108f);
        this.o.close();
        this.o.setFillType(Path.FillType.WINDING);
        this.n.setStyle(Paint.Style.FILL);
        this.n.setColor(-16777216);
        this.n.setAlpha(25);
        this.f30624a.add(this.n);
        this.p = new Paint();
        Path path7 = new Path();
        this.q = path7;
        path7.moveTo(13.1719f, 24.1503f);
        this.q.cubicTo(13.1719f, 18.2589f, 17.9669f, 13.481f, 23.8795f, 13.481f);
        this.q.cubicTo(29.792f, 13.481f, 34.5871f, 18.2589f, 34.5871f, 24.1503f);
        this.q.cubicTo(34.5871f, 30.0419f, 29.792f, 34.8196f, 23.8795f, 34.8196f);
        this.q.cubicTo(17.9669f, 34.813f, 13.1719f, 30.0419f, 13.1719f, 24.1503f);
        this.q.close();
        this.q.setFillType(Path.FillType.WINDING);
        this.p.setStyle(Paint.Style.FILL);
        this.p.setColor(-1);
        this.f30624a.add(this.p);
        this.r = new Paint();
        Path path8 = new Path();
        this.s = path8;
        path8.moveTo(14.9644f, 24.1504f);
        this.s.cubicTo(14.9644f, 19.2474f, 18.9525f, 15.2669f, 23.8798f, 15.2669f);
        this.s.cubicTo(28.8004f, 15.2669f, 32.7951f, 19.2409f, 32.7951f, 24.1504f);
        this.s.cubicTo(32.7951f, 29.0535f, 28.8071f, 33.034f, 23.8798f, 33.034f);
        this.s.cubicTo(18.9591f, 33.034f, 14.9644f, 29.0535f, 14.9644f, 24.1504f);
        this.s.close();
        this.s.setFillType(Path.FillType.WINDING);
        this.r.setStyle(Paint.Style.FILL);
        this.r.setColor(-11760651);
        this.f30624a.add(this.r);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.clipPath(this.f31454e);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31456g, this.f31455f);
        canvas.drawPath(this.f31458i, this.f31457h);
        canvas.drawPath(this.f31460k, this.f31459j);
        canvas.drawPath(this.f31462m, this.f31461l);
        canvas.drawPath(this.o, this.n);
        canvas.drawPath(this.q, this.p);
        canvas.drawPath(this.s, this.r);
    }
}
