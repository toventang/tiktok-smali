package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hr extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31607d;

    /* renamed from: e  reason: collision with root package name */
    Path f31608e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31609f;

    /* renamed from: g  reason: collision with root package name */
    Path f31610g;

    static {
        Covode.recordClassIndex(18343);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(37.1761f, 41.4742f);
        this.f30626c.cubicTo(37.4715f, 41.7646f, 37.9451f, 41.7593f, 38.2339f, 41.4625f);
        this.f30626c.lineTo(39.9721f, 39.6759f);
        this.f30626c.cubicTo(40.261f, 39.3791f, 40.2557f, 38.903f, 39.9603f, 38.6126f);
        this.f30626c.lineTo(7.31902f, 6.52578f);
        this.f30626c.cubicTo(7.02363f, 6.2354f, 6.55001f, 6.24068f, 6.26116f, 6.53756f);
        this.f30626c.lineTo(4.52299f, 8.32408f);
        this.f30626c.cubicTo(4.23414f, 8.62096f, 4.23944f, 9.09702f, 4.53483f, 9.3874f);
        this.f30626c.lineTo(9.31245f, 14.0839f);
        this.f30626c.cubicTo(6.12244f, 16.5681f, 4.17993f, 19.8606f, 4.17993f, 23.4723f);
        this.f30626c.cubicTo(4.17993f, 31.2092f, 13.0939f, 37.4812f, 24.0899f, 37.4812f);
        this.f30626c.cubicTo(26.8845f, 37.4812f, 29.5446f, 37.0761f, 31.958f, 36.3448f);
        this.f30626c.lineTo(37.1761f, 41.4742f);
        this.f30626c.close();
        this.f30626c.moveTo(17.2918f, 21.9277f);
        this.f30626c.lineTo(12.1944f, 16.9169f);
        this.f30626c.cubicTo(9.39676f, 18.9204f, 8.16192f, 21.2943f, 8.16192f, 23.4723f);
        this.f30626c.cubicTo(8.16192f, 25.6762f, 9.42632f, 28.0807f, 12.2949f, 30.0991f);
        this.f30626c.cubicTo(15.151f, 32.1087f, 19.3087f, 33.4787f, 24.0899f, 33.4787f);
        this.f30626c.cubicTo(25.6734f, 33.4787f, 27.1886f, 33.3284f, 28.6107f, 33.0544f);
        this.f30626c.lineTo(25.7781f, 30.2699f);
        this.f30626c.cubicTo(25.2377f, 30.405f, 24.6723f, 30.4767f, 24.0903f, 30.4767f);
        this.f30626c.cubicTo(20.2417f, 30.4767f, 17.1218f, 27.3407f, 17.1218f, 23.4723f);
        this.f30626c.cubicTo(17.1218f, 22.9416f, 17.1805f, 22.4246f, 17.2918f, 21.9277f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31607d = new Paint();
        Path path = new Path();
        this.f31608e = path;
        path.moveTo(15.8806f, 10.7059f);
        this.f31608e.cubicTo(18.3836f, 9.90776f, 21.163f, 9.46338f, 24.0899f, 9.46338f);
        this.f31608e.cubicTo(35.0858f, 9.46338f, 43.9998f, 15.7354f, 43.9998f, 23.4723f);
        this.f31608e.cubicTo(43.9998f, 27.1784f, 41.9544f, 30.5484f, 38.6146f, 33.0539f);
        this.f31608e.lineTo(35.7229f, 30.2114f);
        this.f31608e.cubicTo(35.7773f, 30.1742f, 35.8313f, 30.1367f, 35.8848f, 30.0991f);
        this.f31608e.cubicTo(38.7534f, 28.0807f, 40.0178f, 25.6762f, 40.0178f, 23.4723f);
        this.f31608e.cubicTo(40.0178f, 21.2684f, 38.7534f, 18.8639f, 35.8848f, 16.8455f);
        this.f31608e.cubicTo(33.0288f, 14.836f, 28.871f, 13.4659f, 24.0899f, 13.4659f);
        this.f31608e.cubicTo(22.3672f, 13.4659f, 20.7255f, 13.6438f, 19.1964f, 13.9653f);
        this.f31608e.lineTo(15.8806f, 10.7059f);
        this.f31608e.close();
        this.f31608e.setFillType(Path.FillType.WINDING);
        this.f31607d.setStyle(Paint.Style.FILL);
        this.f31607d.setColor(-16777216);
        this.f30624a.add(this.f31607d);
        this.f31609f = new Paint();
        Path path2 = new Path();
        this.f31610g = path2;
        path2.moveTo(24.0903f, 16.4678f);
        this.f31610g.cubicTo(23.3813f, 16.4678f, 22.697f, 16.5742f, 22.0524f, 16.7721f);
        this.f31610g.lineTo(30.7998f, 25.3709f);
        this.f31610g.cubicTo(30.9685f, 24.7671f, 31.0588f, 24.1303f, 31.0588f, 23.4723f);
        this.f31610g.cubicTo(31.0588f, 19.6038f, 27.9389f, 16.4678f, 24.0903f, 16.4678f);
        this.f31610g.close();
        this.f31610g.setFillType(Path.FillType.WINDING);
        this.f31609f.setStyle(Paint.Style.FILL);
        this.f31609f.setColor(-16777216);
        this.f30624a.add(this.f31609f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31608e, this.f31607d);
        canvas.drawPath(this.f31610g, this.f31609f);
    }
}
