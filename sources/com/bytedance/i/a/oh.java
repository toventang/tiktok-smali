package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class oh extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31748d;

    /* renamed from: e  reason: collision with root package name */
    Path f31749e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31750f;

    /* renamed from: g  reason: collision with root package name */
    Path f31751g;

    static {
        Covode.recordClassIndex(18522);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(18.0f, 12.5f);
        this.f30626c.cubicTo(15.5897f, 12.5f, 13.5849f, 14.5018f, 13.5849f, 17.0345f);
        this.f30626c.cubicTo(13.5849f, 19.5672f, 15.5897f, 21.569f, 18.0f, 21.569f);
        this.f30626c.cubicTo(20.4103f, 21.569f, 22.4151f, 19.5672f, 22.4151f, 17.0345f);
        this.f30626c.cubicTo(22.4151f, 14.5018f, 20.4103f, 12.5f, 18.0f, 12.5f);
        this.f30626c.close();
        this.f30626c.moveTo(10.5849f, 17.0345f);
        this.f30626c.cubicTo(10.5849f, 12.9017f, 13.8766f, 9.5f, 18.0f, 9.5f);
        this.f30626c.cubicTo(22.1234f, 9.5f, 25.4151f, 12.9017f, 25.4151f, 17.0345f);
        this.f30626c.cubicTo(25.4151f, 21.1673f, 22.1234f, 24.569f, 18.0f, 24.569f);
        this.f30626c.cubicTo(13.8766f, 24.569f, 10.5849f, 21.1673f, 10.5849f, 17.0345f);
        this.f30626c.close();
        this.f30626c.moveTo(18.0f, 29.8793f);
        this.f30626c.cubicTo(14.0801f, 29.8793f, 10.7403f, 32.5616f, 9.69697f, 36.2673f);
        this.f30626c.cubicTo(9.5473f, 36.7989f, 9.03833f, 37.1708f, 8.49337f, 37.0811f);
        this.f30626c.lineTo(7.50662f, 36.9189f);
        this.f30626c.cubicTo(6.96166f, 36.8292f, 6.58837f, 36.3131f, 6.72325f, 35.7776f);
        this.f30626c.cubicTo(8.00732f, 30.6788f, 12.5509f, 26.8793f, 18.0f, 26.8793f);
        this.f30626c.cubicTo(23.449f, 26.8793f, 27.9927f, 30.6788f, 29.2767f, 35.7776f);
        this.f30626c.cubicTo(29.4116f, 36.3131f, 29.0383f, 36.8292f, 28.4934f, 36.9189f);
        this.f30626c.lineTo(27.5066f, 37.0811f);
        this.f30626c.cubicTo(26.9617f, 37.1708f, 26.4527f, 36.7989f, 26.303f, 36.2673f);
        this.f30626c.cubicTo(25.2597f, 32.5616f, 21.9199f, 29.8793f, 18.0f, 29.8793f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31748d = new Paint();
        Path path = new Path();
        this.f31749e = path;
        path.moveTo(33.0f, 31.5371f);
        this.f31749e.cubicTo(32.2445f, 31.5371f, 31.5198f, 31.668f, 30.8447f, 31.9093f);
        this.f31749e.cubicTo(30.3246f, 32.0951f, 29.7189f, 31.9243f, 29.4549f, 31.4392f);
        this.f31749e.lineTo(28.9769f, 30.5608f);
        this.f31749e.cubicTo(28.713f, 30.0757f, 28.8907f, 29.463f, 29.4009f, 29.2516f);
        this.f31749e.cubicTo(30.513f, 28.791f, 31.7285f, 28.5371f, 33.0f, 28.5371f);
        this.f31749e.cubicTo(37.4554f, 28.5371f, 41.1594f, 31.6303f, 42.2706f, 35.7812f);
        this.f31749e.cubicTo(42.4135f, 36.3147f, 42.0386f, 36.8308f, 41.4935f, 36.9196f);
        this.f31749e.lineTo(40.5065f, 37.0804f);
        this.f31749e.cubicTo(39.9614f, 37.1692f, 39.4546f, 36.7956f, 39.2894f, 36.2686f);
        this.f31749e.cubicTo(38.4217f, 33.5f, 35.91f, 31.5371f, 33.0f, 31.5371f);
        this.f31749e.close();
        this.f31749e.setFillType(Path.FillType.EVEN_ODD);
        this.f31748d.setStyle(Paint.Style.FILL);
        this.f31748d.setColor(-16777216);
        this.f30624a.add(this.f31748d);
        this.f31750f = new Paint();
        Path path2 = new Path();
        this.f31751g = path2;
        path2.moveTo(33.0f, 18.5f);
        this.f31751g.cubicTo(31.6193f, 18.5f, 30.5f, 19.6193f, 30.5f, 21.0f);
        this.f31751g.cubicTo(30.5f, 22.3807f, 31.6193f, 23.5f, 33.0f, 23.5f);
        this.f31751g.cubicTo(34.3807f, 23.5f, 35.5f, 22.3807f, 35.5f, 21.0f);
        this.f31751g.cubicTo(35.5f, 19.6193f, 34.3807f, 18.5f, 33.0f, 18.5f);
        this.f31751g.close();
        this.f31751g.moveTo(27.5f, 21.0f);
        this.f31751g.cubicTo(27.5f, 17.9624f, 29.9624f, 15.5f, 33.0f, 15.5f);
        this.f31751g.cubicTo(36.0376f, 15.5f, 38.5f, 17.9624f, 38.5f, 21.0f);
        this.f31751g.cubicTo(38.5f, 24.0376f, 36.0376f, 26.5f, 33.0f, 26.5f);
        this.f31751g.cubicTo(29.9624f, 26.5f, 27.5f, 24.0376f, 27.5f, 21.0f);
        this.f31751g.close();
        this.f31751g.setFillType(Path.FillType.EVEN_ODD);
        this.f31750f.setStyle(Paint.Style.FILL);
        this.f31750f.setColor(-16777216);
        this.f30624a.add(this.f31750f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31749e, this.f31748d);
        canvas.drawPath(this.f31751g, this.f31750f);
    }
}
