package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class nu extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31746d;

    /* renamed from: e  reason: collision with root package name */
    Path f31747e;

    static {
        Covode.recordClassIndex(18508);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(23.4144f, 17.1734f);
        this.f30626c.cubicTo(23.3942f, 17.2186f, 23.3655f, 17.3236f, 23.3082f, 17.5335f);
        this.f30626c.lineTo(23.2511f, 17.7427f);
        this.f30626c.cubicTo(23.1358f, 18.1649f, 23.0781f, 18.376f, 23.0159f, 18.5718f);
        this.f30626c.cubicTo(22.04f, 21.6461f, 19.6522f, 24.068f, 16.5921f, 25.0875f);
        this.f30626c.cubicTo(16.3971f, 25.1524f, 16.1869f, 25.213f, 15.7665f, 25.3343f);
        this.f30626c.cubicTo(15.6318f, 25.3731f, 15.5644f, 25.3926f, 15.5338f, 25.4049f);
        this.f30626c.cubicTo(14.9984f, 25.621f, 14.9984f, 26.379f, 15.5338f, 26.595f);
        this.f30626c.cubicTo(15.5643f, 26.6074f, 15.6316f, 26.6268f, 15.7661f, 26.6656f);
        this.f30626c.cubicTo(16.1865f, 26.7868f, 16.3971f, 26.8476f, 16.5921f, 26.9125f);
        this.f30626c.cubicTo(19.6522f, 27.9319f, 22.04f, 30.3538f, 23.0159f, 33.4281f);
        this.f30626c.cubicTo(23.0781f, 33.624f, 23.1358f, 33.8351f, 23.2511f, 34.2573f);
        this.f30626c.lineTo(23.3082f, 34.4664f);
        this.f30626c.cubicTo(23.3655f, 34.6764f, 23.3942f, 34.7814f, 23.4144f, 34.8265f);
        this.f30626c.cubicTo(23.6408f, 35.3329f, 24.3596f, 35.3329f, 24.586f, 34.8265f);
        this.f30626c.cubicTo(24.6061f, 34.7814f, 24.6348f, 34.6764f, 24.6922f, 34.4665f);
        this.f30626c.lineTo(24.7493f, 34.2573f);
        this.f30626c.cubicTo(24.8645f, 33.8353f, 24.9223f, 33.6239f, 24.9844f, 33.4281f);
        this.f30626c.cubicTo(25.9604f, 30.3538f, 28.3482f, 27.9319f, 31.4083f, 26.9125f);
        this.f30626c.cubicTo(31.6033f, 26.8476f, 31.8135f, 26.7869f, 32.234f, 26.6657f);
        this.f30626c.cubicTo(32.3685f, 26.6269f, 32.436f, 26.6074f, 32.4666f, 26.595f);
        this.f30626c.cubicTo(33.002f, 26.379f, 33.002f, 25.621f, 32.4666f, 25.4049f);
        this.f30626c.cubicTo(32.436f, 25.3926f, 32.3687f, 25.3732f, 32.2341f, 25.3343f);
        this.f30626c.cubicTo(31.8137f, 25.2131f, 31.6032f, 25.1524f, 31.4083f, 25.0875f);
        this.f30626c.cubicTo(28.3482f, 24.068f, 25.9604f, 21.6461f, 24.9844f, 18.5718f);
        this.f30626c.cubicTo(24.9223f, 18.376f, 24.8646f, 18.1649f, 24.7493f, 17.7428f);
        this.f30626c.lineTo(24.6922f, 17.5335f);
        this.f30626c.cubicTo(24.6348f, 17.3236f, 24.6061f, 17.2186f, 24.586f, 17.1734f);
        this.f30626c.cubicTo(24.3596f, 16.6671f, 23.6408f, 16.6671f, 23.4144f, 17.1734f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31746d = new Paint();
        Path path = new Path();
        this.f31747e = path;
        path.moveTo(17.1099f, 6.60901f);
        this.f31747e.cubicTo(15.7038f, 6.60901f, 14.4863f, 7.5856f, 14.1813f, 8.95822f);
        this.f31747e.lineTo(13.6777f, 11.2244f);
        this.f31747e.lineTo(8.0f, 11.2244f);
        this.f31747e.cubicTo(4.68629f, 11.2244f, 2.0f, 13.9107f, 2.0f, 17.2244f);
        this.f31747e.lineTo(2.0f, 35.8911f);
        this.f31747e.cubicTo(2.0f, 39.2048f, 4.68629f, 41.8911f, 8.0f, 41.8911f);
        this.f31747e.lineTo(40.0f, 41.8911f);
        this.f31747e.cubicTo(43.3137f, 41.8911f, 46.0f, 39.2048f, 46.0f, 35.8911f);
        this.f31747e.lineTo(46.0f, 17.2244f);
        this.f31747e.cubicTo(46.0f, 13.9107f, 43.3137f, 11.2244f, 40.0f, 11.2244f);
        this.f31747e.lineTo(34.3223f, 11.2244f);
        this.f31747e.lineTo(33.8187f, 8.95822f);
        this.f31747e.cubicTo(33.5137f, 7.58561f, 32.2962f, 6.60901f, 30.8901f, 6.60901f);
        this.f31747e.lineTo(17.1099f, 6.60901f);
        this.f31747e.close();
        this.f31747e.moveTo(17.4084f, 12.8752f);
        this.f31747e.lineTo(17.912f, 10.609f);
        this.f31747e.lineTo(30.088f, 10.609f);
        this.f31747e.lineTo(30.5916f, 12.8752f);
        this.f31747e.cubicTo(30.8966f, 14.2478f, 32.114f, 15.2244f, 33.5201f, 15.2244f);
        this.f31747e.lineTo(40.0f, 15.2244f);
        this.f31747e.cubicTo(41.1046f, 15.2244f, 42.0f, 16.1198f, 42.0f, 17.2244f);
        this.f31747e.lineTo(42.0f, 35.8911f);
        this.f31747e.cubicTo(42.0f, 36.9956f, 41.1046f, 37.8911f, 40.0f, 37.8911f);
        this.f31747e.lineTo(8.0f, 37.8911f);
        this.f31747e.cubicTo(6.89543f, 37.8911f, 6.0f, 36.9956f, 6.0f, 35.8911f);
        this.f31747e.lineTo(6.0f, 17.2244f);
        this.f31747e.cubicTo(6.0f, 16.1198f, 6.89543f, 15.2244f, 8.0f, 15.2244f);
        this.f31747e.lineTo(14.4799f, 15.2244f);
        this.f31747e.cubicTo(15.886f, 15.2244f, 17.1034f, 14.2478f, 17.4084f, 12.8752f);
        this.f31747e.close();
        this.f31747e.setFillType(Path.FillType.EVEN_ODD);
        this.f31746d.setStyle(Paint.Style.FILL);
        this.f31746d.setColor(-16777216);
        this.f30624a.add(this.f31746d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31747e, this.f31746d);
    }
}
