package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class na extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31732d;

    /* renamed from: e  reason: collision with root package name */
    Path f31733e;

    static {
        Covode.recordClassIndex(18488);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(25.4142f, 2.58579f);
        this.f30626c.cubicTo(24.6332f, 1.80474f, 23.3668f, 1.80474f, 22.5858f, 2.58579f);
        this.f30626c.cubicTo(21.8425f, 3.32905f, 20.6045f, 4.08438f, 19.0002f, 4.79737f);
        this.f30626c.cubicTo(17.4279f, 5.4962f, 15.649f, 6.09169f, 13.9506f, 6.57694f);
        this.f30626c.cubicTo(12.258f, 7.06052f, 10.681f, 7.42462f, 9.52548f, 7.66787f);
        this.f30626c.cubicTo(8.94887f, 7.78926f, 8.48002f, 7.87998f, 8.15763f, 7.93996f);
        this.f30626c.cubicTo(7.9965f, 7.96994f, 7.87214f, 7.9922f, 7.78941f, 8.00675f);
        this.f30626c.lineTo(7.69721f, 8.02276f);
        this.f30626c.lineTo(7.6757f, 8.02642f);
        this.f30626c.lineTo(7.67089f, 8.02723f);
        this.f30626c.cubicTo(6.7067f, 8.18809f, 6.00003f, 9.02235f, 6.0f, 9.9999f);
        this.f30626c.lineTo(6.0f, 10.0009f);
        this.f30626c.lineTo(6.00013f, 10.2264f);
        this.f30626c.cubicTo(6.00026f, 10.3735f, 6.00052f, 10.589f, 6.00106f, 10.8632f);
        this.f30626c.cubicTo(6.00212f, 11.4116f, 6.00426f, 12.1946f, 6.00857f, 13.1341f);
        this.f30626c.cubicTo(6.01716f, 15.0092f, 6.03438f, 17.5102f, 6.0689f, 20.0141f);
        this.f30626c.cubicTo(6.073f, 28.6446f, 9.84799f, 34.8734f, 13.867f, 38.9109f);
        this.f30626c.cubicTo(15.8704f, 40.9236f, 17.9455f, 42.4054f, 19.6754f, 43.3931f);
        this.f30626c.cubicTo(20.5398f, 43.8866f, 21.3373f, 44.2678f, 22.0161f, 44.5319f);
        this.f30626c.cubicTo(22.6125f, 44.7638f, 23.3489f, 45.0f, 24.0f, 45.0f);
        this.f30626c.cubicTo(24.6511f, 45.0f, 25.3875f, 44.7638f, 25.9839f, 44.5319f);
        this.f30626c.cubicTo(26.6627f, 44.2678f, 27.4602f, 43.8866f, 28.3246f, 43.3931f);
        this.f30626c.cubicTo(30.0545f, 42.4054f, 32.1296f, 40.9236f, 34.133f, 38.9109f);
        this.f30626c.cubicTo(38.1523f, 34.8731f, 41.9276f, 28.6436f, 41.9311f, 20.0119f);
        this.f30626c.cubicTo(41.9655f, 17.0118f, 41.9827f, 14.5114f, 41.9914f, 12.7598f);
        this.f30626c.cubicTo(41.9957f, 11.883f, 41.9978f, 11.1937f, 41.9989f, 10.7233f);
        this.f30626c.cubicTo(41.9995f, 10.4881f, 41.9997f, 10.3076f, 41.9999f, 10.1858f);
        this.f30626c.lineTo(42.0f, 9.99997f);
        this.f30626c.cubicTo(42.0f, 9.02229f, 41.2931f, 8.18789f, 40.3287f, 8.02716f);
        this.f30626c.lineTo(40.3243f, 8.02642f);
        this.f30626c.lineTo(40.3028f, 8.02276f);
        this.f30626c.lineTo(40.2106f, 8.00675f);
        this.f30626c.cubicTo(40.1279f, 7.9922f, 40.0035f, 7.96994f, 39.8424f, 7.93996f);
        this.f30626c.cubicTo(39.52f, 7.87998f, 39.0511f, 7.78926f, 38.4745f, 7.66787f);
        this.f30626c.cubicTo(37.319f, 7.42462f, 35.742f, 7.06052f, 34.0494f, 6.57694f);
        this.f30626c.cubicTo(32.3511f, 6.09169f, 30.5721f, 5.4962f, 28.9998f, 4.79737f);
        this.f30626c.cubicTo(27.3955f, 4.08438f, 26.1575f, 3.32905f, 25.4142f, 2.58579f);
        this.f30626c.close();
        this.f30626c.moveTo(10.0085f, 13.1158f);
        this.f30626c.cubicTo(10.006f, 12.5704f, 10.0043f, 12.078f, 10.003f, 11.6541f);
        this.f30626c.cubicTo(10.114f, 11.6313f, 10.2296f, 11.6073f, 10.3495f, 11.5821f);
        this.f30626c.cubicTo(11.569f, 11.3253f, 13.242f, 10.9394f, 15.0494f, 10.423f);
        this.f30626c.cubicTo(16.8511f, 9.90829f, 18.8221f, 9.25378f, 20.6248f, 8.45262f);
        this.f30626c.cubicTo(21.8024f, 7.92922f, 22.9762f, 7.31398f, 24.0f, 6.59088f);
        this.f30626c.cubicTo(25.0238f, 7.31398f, 26.1976f, 7.92922f, 27.3752f, 8.45262f);
        this.f30626c.cubicTo(29.1779f, 9.25378f, 31.1489f, 9.90829f, 32.9506f, 10.423f);
        this.f30626c.cubicTo(34.758f, 10.9394f, 36.431f, 11.3253f, 37.6505f, 11.5821f);
        this.f30626c.cubicTo(37.77f, 11.6072f, 37.8853f, 11.6312f, 37.9961f, 11.6539f);
        this.f30626c.cubicTo(37.9949f, 11.974f, 37.9934f, 12.3371f, 37.9914f, 12.7401f);
        this.f30626c.cubicTo(37.9828f, 14.4865f, 37.9656f, 16.9821f, 37.9312f, 19.977f);
        this.f30626c.lineTo(37.9311f, 20.0f);
        this.f30626c.cubicTo(37.9311f, 27.3621f, 34.7425f, 32.6288f, 31.2981f, 36.089f);
        this.f30626c.cubicTo(29.5687f, 37.8263f, 27.786f, 39.0945f, 26.3413f, 39.9194f);
        this.f30626c.cubicTo(25.6184f, 40.3321f, 24.9995f, 40.6228f, 24.5336f, 40.804f);
        this.f30626c.cubicTo(24.2544f, 40.9126f, 24.082f, 40.9614f, 24.0f, 40.9832f);
        this.f30626c.cubicTo(23.918f, 40.9614f, 23.7456f, 40.9126f, 23.4664f, 40.804f);
        this.f30626c.cubicTo(23.0006f, 40.6228f, 22.3816f, 40.3321f, 21.6587f, 39.9194f);
        this.f30626c.cubicTo(20.214f, 39.0945f, 18.4313f, 37.8263f, 16.7019f, 36.089f);
        this.f30626c.cubicTo(13.2575f, 32.6288f, 10.0689f, 27.3621f, 10.0689f, 20.0f);
        this.f30626c.lineTo(10.0687f, 19.9724f);
        this.f30626c.cubicTo(10.0343f, 17.4807f, 10.0171f, 14.9874f, 10.0085f, 13.1158f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31732d = new Paint();
        Path path = new Path();
        this.f31733e = path;
        path.moveTo(26.0002f, 16.0f);
        this.f31733e.cubicTo(26.0002f, 15.4477f, 25.5525f, 15.0f, 25.0002f, 15.0f);
        this.f31733e.lineTo(23.0002f, 15.0f);
        this.f31733e.cubicTo(22.448f, 15.0f, 22.0002f, 15.4477f, 22.0002f, 16.0f);
        this.f31733e.lineTo(22.0002f, 21.0f);
        this.f31733e.lineTo(17.0002f, 21.0f);
        this.f31733e.cubicTo(16.448f, 21.0f, 16.0002f, 21.4477f, 16.0002f, 22.0f);
        this.f31733e.lineTo(16.0002f, 24.0f);
        this.f31733e.cubicTo(16.0002f, 24.5523f, 16.448f, 25.0f, 17.0002f, 25.0f);
        this.f31733e.lineTo(22.0002f, 25.0f);
        this.f31733e.lineTo(22.0002f, 30.0f);
        this.f31733e.cubicTo(22.0002f, 30.5523f, 22.448f, 31.0f, 23.0002f, 31.0f);
        this.f31733e.lineTo(25.0002f, 31.0f);
        this.f31733e.cubicTo(25.5525f, 31.0f, 26.0002f, 30.5523f, 26.0002f, 30.0f);
        this.f31733e.lineTo(26.0002f, 25.0f);
        this.f31733e.lineTo(31.0002f, 25.0f);
        this.f31733e.cubicTo(31.5525f, 25.0f, 32.0002f, 24.5523f, 32.0002f, 24.0f);
        this.f31733e.lineTo(32.0002f, 22.0f);
        this.f31733e.cubicTo(32.0002f, 21.4477f, 31.5525f, 21.0f, 31.0002f, 21.0f);
        this.f31733e.lineTo(26.0002f, 21.0f);
        this.f31733e.lineTo(26.0002f, 16.0f);
        this.f31733e.close();
        this.f31733e.setFillType(Path.FillType.WINDING);
        this.f31732d.setStyle(Paint.Style.FILL);
        this.f31732d.setColor(-16777216);
        this.f30624a.add(this.f31732d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31733e, this.f31732d);
    }
}
