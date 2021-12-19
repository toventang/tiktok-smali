package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kt extends a {
    Path A;
    Paint B;
    Path C;
    Paint D;
    Path E;
    Paint F;
    Path G;
    Paint H;
    Path I;

    /* renamed from: d  reason: collision with root package name */
    Paint f31698d;

    /* renamed from: e  reason: collision with root package name */
    Path f31699e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31700f;

    /* renamed from: g  reason: collision with root package name */
    Path f31701g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31702h;

    /* renamed from: i  reason: collision with root package name */
    Path f31703i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31704j;

    /* renamed from: k  reason: collision with root package name */
    Path f31705k;

    /* renamed from: l  reason: collision with root package name */
    Paint f31706l;

    /* renamed from: m  reason: collision with root package name */
    Path f31707m;
    Paint n;
    Path o;
    Paint p;
    Path q;
    Paint r;
    Path s;
    Paint t;
    Path u;
    Paint v;
    Path w;
    Paint x;
    Path y;
    Paint z;

    static {
        Covode.recordClassIndex(18426);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 8.00012f);
        this.f30626c.cubicTo(25.1046f, 8.00012f, 26.0f, 7.10469f, 26.0f, 6.00012f);
        this.f30626c.cubicTo(26.0f, 4.89555f, 25.1046f, 4.00012f, 24.0f, 4.00012f);
        this.f30626c.cubicTo(22.8954f, 4.00012f, 22.0f, 4.89555f, 22.0f, 6.00012f);
        this.f30626c.cubicTo(22.0f, 7.10469f, 22.8954f, 8.00012f, 24.0f, 8.00012f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31698d = new Paint();
        Path path = new Path();
        this.f31699e = path;
        path.moveTo(24.0f, 44.0001f);
        this.f31699e.cubicTo(25.1046f, 44.0001f, 26.0f, 43.1047f, 26.0f, 42.0001f);
        this.f31699e.cubicTo(26.0f, 40.8956f, 25.1046f, 40.0001f, 24.0f, 40.0001f);
        this.f31699e.cubicTo(22.8954f, 40.0001f, 22.0f, 40.8956f, 22.0f, 42.0001f);
        this.f31699e.cubicTo(22.0f, 43.1047f, 22.8954f, 44.0001f, 24.0f, 44.0001f);
        this.f31699e.close();
        this.f31699e.setFillType(Path.FillType.WINDING);
        this.f31698d.setStyle(Paint.Style.FILL);
        this.f31698d.setColor(-16777216);
        this.f30624a.add(this.f31698d);
        this.f31700f = new Paint();
        Path path2 = new Path();
        this.f31701g = path2;
        path2.moveTo(40.0f, 24.0001f);
        this.f31701g.cubicTo(40.0f, 25.1047f, 40.8954f, 26.0001f, 42.0f, 26.0001f);
        this.f31701g.cubicTo(43.1046f, 26.0001f, 44.0f, 25.1047f, 44.0f, 24.0001f);
        this.f31701g.cubicTo(44.0f, 22.8956f, 43.1046f, 22.0001f, 42.0f, 22.0001f);
        this.f31701g.cubicTo(40.8954f, 22.0001f, 40.0f, 22.8956f, 40.0f, 24.0001f);
        this.f31701g.close();
        this.f31701g.setFillType(Path.FillType.WINDING);
        this.f31700f.setStyle(Paint.Style.FILL);
        this.f31700f.setColor(-16777216);
        this.f30624a.add(this.f31700f);
        this.f31702h = new Paint();
        Path path3 = new Path();
        this.f31703i = path3;
        path3.moveTo(4.0f, 24.0001f);
        this.f31703i.cubicTo(4.0f, 25.1047f, 4.89543f, 26.0001f, 6.0f, 26.0001f);
        this.f31703i.cubicTo(7.10457f, 26.0001f, 8.0f, 25.1047f, 8.0f, 24.0001f);
        this.f31703i.cubicTo(8.0f, 22.8956f, 7.10457f, 22.0001f, 6.0f, 22.0001f);
        this.f31703i.cubicTo(4.89543f, 22.0001f, 4.0f, 22.8956f, 4.0f, 24.0001f);
        this.f31703i.close();
        this.f31703i.setFillType(Path.FillType.WINDING);
        this.f31702h.setStyle(Paint.Style.FILL);
        this.f31702h.setColor(-16777216);
        this.f30624a.add(this.f31702h);
        this.f31704j = new Paint();
        Path path4 = new Path();
        this.f31705k = path4;
        path4.moveTo(18.9594f, 6.60487f);
        this.f31705k.cubicTo(18.5367f, 5.58438f, 17.3667f, 5.09978f, 16.3462f, 5.52248f);
        this.f31705k.cubicTo(15.3258f, 5.94518f, 14.8412f, 7.11512f, 15.2639f, 8.13561f);
        this.f31705k.cubicTo(15.6866f, 9.1561f, 16.8565f, 9.6407f, 17.877f, 9.218f);
        this.f31705k.cubicTo(18.8975f, 8.7953f, 19.3821f, 7.62536f, 18.9594f, 6.60487f);
        this.f31705k.close();
        this.f31705k.setFillType(Path.FillType.WINDING);
        this.f31704j.setStyle(Paint.Style.FILL);
        this.f31704j.setColor(-16777216);
        this.f30624a.add(this.f31704j);
        this.f31706l = new Paint();
        Path path5 = new Path();
        this.f31707m = path5;
        path5.moveTo(29.0405f, 41.3953f);
        this.f31707m.cubicTo(29.4632f, 42.4158f, 30.6331f, 42.9004f, 31.6536f, 42.4777f);
        this.f31707m.cubicTo(32.6741f, 42.055f, 33.1587f, 40.885f, 32.736f, 39.8645f);
        this.f31707m.cubicTo(32.3133f, 38.8441f, 31.1433f, 38.3594f, 30.1229f, 38.7822f);
        this.f31707m.cubicTo(29.1024f, 39.2048f, 28.6178f, 40.3748f, 29.0405f, 41.3953f);
        this.f31707m.close();
        this.f31707m.setFillType(Path.FillType.WINDING);
        this.f31706l.setStyle(Paint.Style.FILL);
        this.f31706l.setColor(-16777216);
        this.f30624a.add(this.f31706l);
        this.n = new Paint();
        Path path6 = new Path();
        this.o = path6;
        path6.moveTo(39.8644f, 15.264f);
        this.o.cubicTo(38.8439f, 15.6867f, 38.3593f, 16.8566f, 38.782f, 17.8771f);
        this.o.cubicTo(39.2047f, 18.8976f, 40.3746f, 19.3822f, 41.3951f, 18.9595f);
        this.o.cubicTo(42.4156f, 18.5368f, 42.9002f, 17.3669f, 42.4775f, 16.3464f);
        this.o.cubicTo(42.0548f, 15.3259f, 40.8849f, 14.8413f, 39.8644f, 15.264f);
        this.o.close();
        this.o.setFillType(Path.FillType.WINDING);
        this.n.setStyle(Paint.Style.FILL);
        this.n.setColor(-16777216);
        this.f30624a.add(this.n);
        this.p = new Paint();
        Path path7 = new Path();
        this.q = path7;
        path7.moveTo(6.60471f, 29.0406f);
        this.q.cubicTo(5.58422f, 29.4633f, 5.09962f, 30.6333f, 5.52232f, 31.6537f);
        this.q.cubicTo(5.94502f, 32.6742f, 7.11496f, 33.1588f, 8.13545f, 32.7361f);
        this.q.cubicTo(9.15593f, 32.3134f, 9.64054f, 31.1435f, 9.21784f, 30.123f);
        this.q.cubicTo(8.79514f, 29.1025f, 7.6252f, 28.6179f, 6.60471f, 29.0406f);
        this.q.close();
        this.q.setFillType(Path.FillType.WINDING);
        this.p.setStyle(Paint.Style.FILL);
        this.p.setColor(-16777216);
        this.f30624a.add(this.p);
        this.r = new Paint();
        Path path8 = new Path();
        this.s = path8;
        path8.moveTo(38.1421f, 12.6865f);
        this.s.cubicTo(37.3611f, 13.4676f, 36.0948f, 13.4676f, 35.3137f, 12.6865f);
        this.s.cubicTo(34.5327f, 11.9055f, 34.5327f, 10.6391f, 35.3137f, 9.85808f);
        this.s.cubicTo(36.0948f, 9.07703f, 37.3611f, 9.07703f, 38.1421f, 9.85808f);
        this.s.cubicTo(38.9232f, 10.6391f, 38.9232f, 11.9055f, 38.1421f, 12.6865f);
        this.s.close();
        this.s.setFillType(Path.FillType.WINDING);
        this.r.setStyle(Paint.Style.FILL);
        this.r.setColor(-16777216);
        this.f30624a.add(this.r);
        this.t = new Paint();
        Path path9 = new Path();
        this.u = path9;
        path9.moveTo(12.6863f, 38.1424f);
        this.u.cubicTo(11.9052f, 38.9234f, 10.6389f, 38.9234f, 9.85787f, 38.1424f);
        this.u.cubicTo(9.07682f, 37.3613f, 9.07682f, 36.095f, 9.85787f, 35.3139f);
        this.u.cubicTo(10.6389f, 34.5329f, 11.9052f, 34.5329f, 12.6863f, 35.3139f);
        this.u.cubicTo(13.4673f, 36.095f, 13.4673f, 37.3613f, 12.6863f, 38.1424f);
        this.u.close();
        this.u.setFillType(Path.FillType.WINDING);
        this.t.setStyle(Paint.Style.FILL);
        this.t.setColor(-16777216);
        this.f30624a.add(this.t);
        this.v = new Paint();
        Path path10 = new Path();
        this.w = path10;
        path10.moveTo(35.3137f, 38.1424f);
        this.w.cubicTo(34.5327f, 37.3613f, 34.5327f, 36.095f, 35.3137f, 35.3139f);
        this.w.cubicTo(36.0948f, 34.5329f, 37.3611f, 34.5329f, 38.1421f, 35.3139f);
        this.w.cubicTo(38.9232f, 36.095f, 38.9232f, 37.3613f, 38.1421f, 38.1424f);
        this.w.cubicTo(37.3611f, 38.9234f, 36.0948f, 38.9234f, 35.3137f, 38.1424f);
        this.w.close();
        this.w.setFillType(Path.FillType.WINDING);
        this.v.setStyle(Paint.Style.FILL);
        this.v.setColor(-16777216);
        this.f30624a.add(this.v);
        this.x = new Paint();
        Path path11 = new Path();
        this.y = path11;
        path11.moveTo(9.85787f, 12.6865f);
        this.y.cubicTo(9.07682f, 11.9055f, 9.07682f, 10.6391f, 9.85787f, 9.85808f);
        this.y.cubicTo(10.6389f, 9.07703f, 11.9052f, 9.07703f, 12.6863f, 9.85808f);
        this.y.cubicTo(13.4673f, 10.6391f, 13.4673f, 11.9055f, 12.6863f, 12.6865f);
        this.y.cubicTo(11.9052f, 13.4676f, 10.6389f, 13.4676f, 9.85787f, 12.6865f);
        this.y.close();
        this.y.setFillType(Path.FillType.WINDING);
        this.x.setStyle(Paint.Style.FILL);
        this.x.setColor(-16777216);
        this.f30624a.add(this.x);
        this.z = new Paint();
        Path path12 = new Path();
        this.A = path12;
        path12.moveTo(30.1231f, 9.21796f);
        this.A.cubicTo(31.1436f, 9.64066f, 32.3136f, 9.15606f, 32.7363f, 8.13557f);
        this.A.cubicTo(33.159f, 7.11508f, 32.6744f, 5.94514f, 31.6539f, 5.52244f);
        this.A.cubicTo(30.6334f, 5.09974f, 29.4634f, 5.58435f, 29.0407f, 6.60484f);
        this.A.cubicTo(28.618f, 7.62533f, 29.1026f, 8.79526f, 30.1231f, 9.21796f);
        this.A.close();
        this.A.setFillType(Path.FillType.WINDING);
        this.z.setStyle(Paint.Style.FILL);
        this.z.setColor(-16777216);
        this.f30624a.add(this.z);
        this.B = new Paint();
        Path path13 = new Path();
        this.C = path13;
        path13.moveTo(15.2641f, 39.8645f);
        this.C.cubicTo(14.8414f, 40.885f, 15.326f, 42.0549f, 16.3465f, 42.4776f);
        this.C.cubicTo(17.367f, 42.9003f, 18.537f, 42.4157f, 18.9597f, 41.3952f);
        this.C.cubicTo(19.3824f, 40.3748f, 18.8978f, 39.2048f, 17.8773f, 38.7821f);
        this.C.cubicTo(16.8568f, 38.3594f, 15.6868f, 38.844f, 15.2641f, 39.8645f);
        this.C.close();
        this.C.setFillType(Path.FillType.WINDING);
        this.B.setStyle(Paint.Style.FILL);
        this.B.setColor(-16777216);
        this.f30624a.add(this.B);
        this.D = new Paint();
        Path path14 = new Path();
        this.E = path14;
        path14.moveTo(38.7823f, 30.123f);
        this.E.cubicTo(38.3596f, 31.1435f, 38.8442f, 32.3134f, 39.8647f, 32.7361f);
        this.E.cubicTo(40.8852f, 33.1588f, 42.0551f, 32.6742f, 42.4778f, 31.6537f);
        this.E.cubicTo(42.9005f, 30.6332f, 42.4159f, 29.4633f, 41.3954f, 29.0406f);
        this.E.cubicTo(40.3749f, 28.6179f, 39.205f, 29.1025f, 38.7823f, 30.123f);
        this.E.close();
        this.E.setFillType(Path.FillType.WINDING);
        this.D.setStyle(Paint.Style.FILL);
        this.D.setColor(-16777216);
        this.f30624a.add(this.D);
        this.F = new Paint();
        Path path15 = new Path();
        this.G = path15;
        path15.moveTo(5.5226f, 16.3464f);
        this.G.cubicTo(5.0999f, 17.3669f, 5.58451f, 18.5368f, 6.60499f, 18.9595f);
        this.G.cubicTo(7.62548f, 19.3822f, 8.79542f, 18.8976f, 9.21812f, 17.8771f);
        this.G.cubicTo(9.64082f, 16.8566f, 9.15622f, 15.6867f, 8.13573f, 15.264f);
        this.G.cubicTo(7.11524f, 14.8413f, 5.9453f, 15.3259f, 5.5226f, 16.3464f);
        this.G.close();
        this.G.setFillType(Path.FillType.WINDING);
        this.F.setStyle(Paint.Style.FILL);
        this.F.setColor(-16777216);
        this.f30624a.add(this.F);
        this.H = new Paint();
        Path path16 = new Path();
        this.I = path16;
        path16.moveTo(22.1742f, 14.8885f);
        this.I.cubicTo(20.1814f, 13.5483f, 17.5f, 14.9763f, 17.5f, 17.3779f);
        this.I.lineTo(17.5f, 30.6805f);
        this.I.cubicTo(17.5f, 33.0466f, 20.1112f, 34.4814f, 22.1085f, 33.2128f);
        this.I.lineTo(32.281f, 26.7516f);
        this.I.cubicTo(34.1077f, 25.5913f, 34.1424f, 22.9375f, 32.3467f, 21.7298f);
        this.I.lineTo(22.1742f, 14.8885f);
        this.I.close();
        this.I.moveTo(21.5f, 28.8606f);
        this.I.lineTo(21.5f, 19.2556f);
        this.I.lineTo(28.845f, 24.1953f);
        this.I.lineTo(21.5f, 28.8606f);
        this.I.close();
        this.I.setFillType(Path.FillType.EVEN_ODD);
        this.H.setStyle(Paint.Style.FILL);
        this.H.setColor(-16777216);
        this.f30624a.add(this.H);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31699e, this.f31698d);
        canvas.drawPath(this.f31701g, this.f31700f);
        canvas.drawPath(this.f31703i, this.f31702h);
        canvas.drawPath(this.f31705k, this.f31704j);
        canvas.drawPath(this.f31707m, this.f31706l);
        canvas.drawPath(this.o, this.n);
        canvas.drawPath(this.q, this.p);
        canvas.drawPath(this.s, this.r);
        canvas.drawPath(this.u, this.t);
        canvas.drawPath(this.w, this.v);
        canvas.drawPath(this.y, this.x);
        canvas.drawPath(this.A, this.z);
        canvas.drawPath(this.C, this.B);
        canvas.drawPath(this.E, this.D);
        canvas.drawPath(this.G, this.F);
        canvas.drawPath(this.I, this.H);
    }
}
