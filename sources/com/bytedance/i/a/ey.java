package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ey extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31430d;

    /* renamed from: e  reason: collision with root package name */
    Path f31431e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31432f;

    /* renamed from: g  reason: collision with root package name */
    Path f31433g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31434h;

    /* renamed from: i  reason: collision with root package name */
    Path f31435i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31436j;

    /* renamed from: k  reason: collision with root package name */
    Path f31437k;

    static {
        Covode.recordClassIndex(18269);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(12.6863f, 5.10424f);
        this.f30626c.cubicTo(13.0768f, 4.71585f, 13.0768f, 4.08615f, 12.6863f, 3.69776f);
        this.f30626c.lineTo(11.2721f, 2.29129f);
        this.f30626c.cubicTo(10.8816f, 1.9029f, 10.2484f, 1.9029f, 9.85786f, 2.29129f);
        this.f30626c.lineTo(9.15076f, 2.99453f);
        this.f30626c.cubicTo(0.949748f, 11.1506f, 0.949748f, 24.3743f, 9.15076f, 32.5305f);
        this.f30626c.lineTo(9.85786f, 33.2337f);
        this.f30626c.cubicTo(10.2484f, 33.6221f, 10.8816f, 33.6221f, 11.2721f, 33.2337f);
        this.f30626c.lineTo(12.6863f, 31.8272f);
        this.f30626c.cubicTo(13.0768f, 31.4388f, 13.0768f, 30.8091f, 12.6863f, 30.4207f);
        this.f30626c.lineTo(11.9792f, 29.7175f);
        this.f30626c.cubicTo(5.34027f, 23.1149f, 5.34027f, 12.41f, 11.9792f, 5.80747f);
        this.f30626c.lineTo(12.6863f, 5.10424f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31430d = new Paint();
        Path path = new Path();
        this.f31431e = path;
        path.moveTo(38.1421f, 2.29129f);
        this.f31431e.cubicTo(37.7516f, 1.9029f, 37.1184f, 1.9029f, 36.7279f, 2.29129f);
        this.f31431e.lineTo(35.3137f, 3.69776f);
        this.f31431e.cubicTo(34.9232f, 4.08615f, 34.9232f, 4.71585f, 35.3137f, 5.10424f);
        this.f31431e.lineTo(36.0208f, 5.80747f);
        this.f31431e.cubicTo(42.6597f, 12.41f, 42.6597f, 23.1149f, 36.0208f, 29.7175f);
        this.f31431e.lineTo(35.3137f, 30.4207f);
        this.f31431e.cubicTo(34.9232f, 30.8091f, 34.9232f, 31.4388f, 35.3137f, 31.8272f);
        this.f31431e.lineTo(36.7279f, 33.2337f);
        this.f31431e.cubicTo(37.1184f, 33.6221f, 37.7516f, 33.6221f, 38.1421f, 33.2337f);
        this.f31431e.lineTo(38.8492f, 32.5305f);
        this.f31431e.cubicTo(47.0503f, 24.3743f, 47.0503f, 11.1506f, 38.8492f, 2.99453f);
        this.f31431e.lineTo(38.1421f, 2.29129f);
        this.f31431e.close();
        this.f31431e.setFillType(Path.FillType.WINDING);
        this.f31430d.setStyle(Paint.Style.FILL);
        this.f31430d.setColor(-16777216);
        this.f30624a.add(this.f31430d);
        this.f31432f = new Paint();
        Path path2 = new Path();
        this.f31433g = path2;
        path2.moveTo(18.4914f, 10.8775f);
        this.f31433g.cubicTo(18.8819f, 10.4891f, 18.8819f, 9.85942f, 18.4914f, 9.47103f);
        this.f31433g.lineTo(17.0772f, 8.06456f);
        this.f31433g.cubicTo(16.6866f, 7.67617f, 16.0535f, 7.67617f, 15.663f, 8.06456f);
        this.f31433g.lineTo(14.9559f, 8.7678f);
        this.f31433g.cubicTo(9.96091f, 13.7354f, 9.96091f, 21.7895f, 14.9559f, 26.7571f);
        this.f31433g.lineTo(15.663f, 27.4603f);
        this.f31433g.cubicTo(16.0535f, 27.8487f, 16.6866f, 27.8487f, 17.0772f, 27.4603f);
        this.f31433g.lineTo(18.4914f, 26.0539f);
        this.f31433g.cubicTo(18.8819f, 25.6655f, 18.8819f, 25.0358f, 18.4914f, 24.6474f);
        this.f31433g.lineTo(17.7843f, 23.9441f);
        this.f31433g.cubicTo(14.3514f, 20.5301f, 14.3514f, 14.9948f, 17.7843f, 11.5807f);
        this.f31433g.lineTo(18.4914f, 10.8775f);
        this.f31433g.close();
        this.f31433g.setFillType(Path.FillType.WINDING);
        this.f31432f.setStyle(Paint.Style.FILL);
        this.f31432f.setColor(-16777216);
        this.f30624a.add(this.f31432f);
        this.f31434h = new Paint();
        Path path3 = new Path();
        this.f31435i = path3;
        path3.moveTo(32.337f, 8.06456f);
        this.f31435i.cubicTo(31.9465f, 7.67617f, 31.3134f, 7.67617f, 30.9228f, 8.06456f);
        this.f31435i.lineTo(29.5086f, 9.47103f);
        this.f31435i.cubicTo(29.1181f, 9.85942f, 29.1181f, 10.4891f, 29.5086f, 10.8775f);
        this.f31435i.lineTo(30.2157f, 11.5807f);
        this.f31435i.cubicTo(33.6486f, 14.9948f, 33.6486f, 20.5301f, 30.2157f, 23.9441f);
        this.f31435i.lineTo(29.5086f, 24.6474f);
        this.f31435i.cubicTo(29.1181f, 25.0358f, 29.1181f, 25.6655f, 29.5086f, 26.0539f);
        this.f31435i.lineTo(30.9228f, 27.4603f);
        this.f31435i.cubicTo(31.3134f, 27.8487f, 31.9465f, 27.8487f, 32.337f, 27.4603f);
        this.f31435i.lineTo(33.0441f, 26.7571f);
        this.f31435i.cubicTo(38.0391f, 21.7895f, 38.0391f, 13.7354f, 33.0441f, 8.7678f);
        this.f31435i.lineTo(32.337f, 8.06456f);
        this.f31435i.close();
        this.f31435i.setFillType(Path.FillType.WINDING);
        this.f31434h.setStyle(Paint.Style.FILL);
        this.f31434h.setColor(-16777216);
        this.f30624a.add(this.f31434h);
        this.f31436j = new Paint();
        Path path4 = new Path();
        this.f31437k = path4;
        path4.moveTo(21.1692f, 20.5668f);
        this.f31437k.cubicTo(20.5235f, 19.8603f, 20.1299f, 18.9217f, 20.1299f, 17.8918f);
        this.f31437k.cubicTo(20.1299f, 15.6947f, 21.9207f, 13.9137f, 24.1299f, 13.9137f);
        this.f31437k.cubicTo(26.339f, 13.9137f, 28.1299f, 15.6947f, 28.1299f, 17.8918f);
        this.f31437k.cubicTo(28.1299f, 18.9217f, 27.7363f, 19.8603f, 27.0905f, 20.5668f);
        this.f31437k.lineTo(34.3395f, 43.0959f);
        this.f31437k.cubicTo(34.5078f, 43.619f, 34.2179f, 44.1788f, 33.6919f, 44.3462f);
        this.f31437k.lineTo(31.787f, 44.9524f);
        this.f31437k.cubicTo(31.261f, 45.1198f, 30.6981f, 44.8314f, 30.5298f, 44.3083f);
        this.f31437k.lineTo(24.1299f, 24.418f);
        this.f31437k.lineTo(17.73f, 44.3083f);
        this.f31437k.cubicTo(17.5616f, 44.8314f, 16.9988f, 45.1198f, 16.4728f, 44.9524f);
        this.f31437k.lineTo(14.5679f, 44.3462f);
        this.f31437k.cubicTo(14.0419f, 44.1788f, 13.7519f, 43.619f, 13.9203f, 43.0959f);
        this.f31437k.lineTo(21.1692f, 20.5668f);
        this.f31437k.close();
        this.f31437k.setFillType(Path.FillType.WINDING);
        this.f31436j.setStyle(Paint.Style.FILL);
        this.f31436j.setColor(-16777216);
        this.f30624a.add(this.f31436j);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31431e, this.f31430d);
        canvas.drawPath(this.f31433g, this.f31432f);
        canvas.drawPath(this.f31435i, this.f31434h);
        canvas.drawPath(this.f31437k, this.f31436j);
    }
}
