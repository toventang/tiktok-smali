package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fy extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31495d;

    /* renamed from: e  reason: collision with root package name */
    Path f31496e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31497f;

    /* renamed from: g  reason: collision with root package name */
    Path f31498g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31499h;

    /* renamed from: i  reason: collision with root package name */
    Path f31500i;

    static {
        Covode.recordClassIndex(18296);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(43.0f, 24.4313f);
        this.f30626c.cubicTo(43.0f, 23.084f, 42.8767f, 21.7885f, 42.6475f, 20.5449f);
        this.f30626c.lineTo(24.3877f, 20.5449f);
        this.f30626c.lineTo(24.3877f, 27.8945f);
        this.f30626c.lineTo(34.8219f, 27.8945f);
        this.f30626c.cubicTo(34.3724f, 30.2695f, 33.0065f, 32.2818f, 30.9532f, 33.6291f);
        this.f30626c.lineTo(30.9532f, 38.3964f);
        this.f30626c.lineTo(37.2189f, 38.3964f);
        this.f30626c.cubicTo(40.885f, 35.0886f, 43.0f, 30.2177f, 43.0f, 24.4313f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-12417548);
        this.f31495d = new Paint();
        Path path = new Path();
        this.f31496e = path;
        path.moveTo(24.3872f, 43.001f);
        this.f31496e.cubicTo(29.6219f, 43.001f, 34.0107f, 41.2996f, 37.2184f, 38.3978f);
        this.f31496e.lineTo(30.9527f, 33.6305f);
        this.f31496e.cubicTo(29.2165f, 34.7705f, 26.9958f, 35.4441f, 24.3872f, 35.4441f);
        this.f31496e.cubicTo(19.3375f, 35.4441f, 15.0633f, 32.1018f, 13.5388f, 27.6108f);
        this.f31496e.lineTo(7.06152f, 27.6108f);
        this.f31496e.lineTo(7.06152f, 32.5337f);
        this.f31496e.cubicTo(10.2517f, 38.7433f, 16.8082f, 43.001f, 24.3872f, 43.001f);
        this.f31496e.close();
        this.f31496e.setFillType(Path.FillType.EVEN_ODD);
        this.f31495d.setStyle(Paint.Style.FILL);
        this.f31495d.setColor(-13326253);
        this.f30624a.add(this.f31495d);
        this.f31497f = new Paint();
        Path path2 = new Path();
        this.f31498g = path2;
        path2.moveTo(13.5395f, 27.6094f);
        this.f31498g.cubicTo(13.1516f, 26.4695f, 12.9313f, 25.2517f, 12.9313f, 23.9994f);
        this.f31498g.cubicTo(12.9313f, 22.7472f, 13.1516f, 21.5295f, 13.5395f, 20.3894f);
        this.f31498g.lineTo(13.5395f, 15.4668f);
        this.f31498g.lineTo(7.06217f, 15.4668f);
        this.f31498g.cubicTo(5.74911f, 18.0318f, 5.0f, 20.9336f, 5.0f, 23.9994f);
        this.f31498g.cubicTo(5.0f, 27.0654f, 5.74911f, 29.9673f, 7.06217f, 32.5323f);
        this.f31498g.lineTo(13.5395f, 27.6094f);
        this.f31498g.close();
        this.f31498g.setFillType(Path.FillType.EVEN_ODD);
        this.f31497f.setStyle(Paint.Style.FILL);
        this.f31497f.setColor(-279548);
        this.f30624a.add(this.f31497f);
        this.f31499h = new Paint();
        Path path3 = new Path();
        this.f31500i = path3;
        path3.moveTo(24.3872f, 12.5568f);
        this.f31500i.cubicTo(27.2336f, 12.5568f, 29.7894f, 13.5155f, 31.7987f, 15.3982f);
        this.f31500i.lineTo(37.3595f, 9.94866f);
        this.f31500i.cubicTo(34.0018f, 6.88281f, 29.6131f, 5.0f, 24.3872f, 5.0f);
        this.f31500i.cubicTo(16.8082f, 5.0f, 10.2517f, 9.25777f, 7.06152f, 15.4674f);
        this.f31500i.lineTo(13.5388f, 20.39f);
        this.f31500i.cubicTo(15.0633f, 15.8991f, 19.3375f, 12.5568f, 24.3872f, 12.5568f);
        this.f31500i.close();
        this.f31500i.setFillType(Path.FillType.EVEN_ODD);
        this.f31499h.setStyle(Paint.Style.FILL);
        this.f31499h.setColor(-1424587);
        this.f30624a.add(this.f31499h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31496e, this.f31495d);
        canvas.drawPath(this.f31498g, this.f31497f);
        canvas.drawPath(this.f31500i, this.f31499h);
    }
}
