package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cj extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31331d;

    /* renamed from: e  reason: collision with root package name */
    Path f31332e;

    static {
        Covode.recordClassIndex(18200);
    }

    @Override // com.bytedance.h.a
    public final void a() {
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
        this.f30625b.setColor(-411877);
        this.f31331d = new Paint();
        Path path = new Path();
        this.f31332e = path;
        path.moveTo(17.6891f, 13.6286f);
        this.f31332e.lineTo(16.9254f, 7.98199f);
        this.f31332e.cubicTo(16.7867f, 6.95666f, 15.7446f, 6.31453f, 14.7664f, 6.65161f);
        this.f31332e.cubicTo(13.7882f, 6.98869f, 13.3629f, 8.13645f, 13.8853f, 9.02957f);
        this.f31332e.lineTo(16.7621f, 13.9481f);
        this.f31332e.cubicTo(17.038f, 14.4198f, 17.7624f, 14.1702f, 17.6891f, 13.6286f);
        this.f31332e.close();
        this.f31332e.moveTo(14.9248f, 16.136f);
        this.f31332e.lineTo(10.2026f, 12.9472f);
        this.f31332e.cubicTo(9.34518f, 12.3681f, 8.17232f, 12.7183f, 7.77268f, 13.6727f);
        this.f31332e.cubicTo(7.37304f, 14.627f, 7.94644f, 15.7084f, 8.96066f, 15.9131f);
        this.f31332e.lineTo(14.5461f, 17.0405f);
        this.f31332e.cubicTo(15.0818f, 17.1486f, 15.3777f, 16.4419f, 14.9248f, 16.136f);
        this.f31332e.close();
        this.f31332e.moveTo(37.3493f, 11.9189f);
        this.f31332e.cubicTo(37.6155f, 11.134f, 36.866f, 10.3845f, 36.0811f, 10.6507f);
        this.f31332e.lineTo(28.7147f, 13.1488f);
        this.f31332e.cubicTo(28.403f, 13.2545f, 28.0592f, 13.2f, 27.7954f, 13.0032f);
        this.f31332e.lineTo(21.5615f, 8.35103f);
        this.f31332e.cubicTo(20.8972f, 7.85532f, 19.9529f, 8.33648f, 19.9635f, 9.16525f);
        this.f31332e.lineTo(20.0629f, 16.9431f);
        this.f31332e.cubicTo(20.0671f, 17.2722f, 19.9091f, 17.5823f, 19.6404f, 17.7723f);
        this.f31332e.lineTo(13.2895f, 22.2636f);
        this.f31332e.cubicTo(12.6128f, 22.7422f, 12.7786f, 23.789f, 13.5701f, 24.035f);
        this.f31332e.lineTo(19.3423f, 25.8293f);
        this.f31332e.lineTo(9.7071f, 35.4645f);
        this.f31332e.cubicTo(9.31658f, 35.855f, 9.31658f, 36.4882f, 9.7071f, 36.8787f);
        this.f31332e.lineTo(11.1213f, 38.2929f);
        this.f31332e.cubicTo(11.5118f, 38.6834f, 12.145f, 38.6834f, 12.5355f, 38.2929f);
        this.f31332e.lineTo(22.1707f, 28.6577f);
        this.f31332e.lineTo(23.965f, 34.4299f);
        this.f31332e.cubicTo(24.211f, 35.2214f, 25.2578f, 35.3872f, 25.7364f, 34.7105f);
        this.f31332e.lineTo(30.2277f, 28.3596f);
        this.f31332e.cubicTo(30.4177f, 28.0909f, 30.7278f, 27.9329f, 31.0569f, 27.9371f);
        this.f31332e.lineTo(38.8348f, 28.0365f);
        this.f31332e.cubicTo(39.6635f, 28.0471f, 40.1447f, 27.1028f, 39.649f, 26.4385f);
        this.f31332e.lineTo(34.9968f, 20.2046f);
        this.f31332e.cubicTo(34.8f, 19.9408f, 34.7456f, 19.597f, 34.8512f, 19.2853f);
        this.f31332e.lineTo(37.3493f, 11.9189f);
        this.f31332e.close();
        this.f31332e.moveTo(38.0781f, 34.2174f);
        this.f31332e.lineTo(33.2469f, 31.1963f);
        this.f31332e.cubicTo(32.7836f, 30.9065f, 33.0545f, 30.1898f, 33.5937f, 30.2791f);
        this.f31332e.lineTo(39.2152f, 31.2097f);
        this.f31332e.cubicTo(40.236f, 31.3787f, 40.847f, 32.4393f, 40.4811f, 33.4071f);
        this.f31332e.cubicTo(40.1152f, 34.3749f, 38.9554f, 34.766f, 38.0781f, 34.2174f);
        this.f31332e.close();
        this.f31332e.moveTo(31.0497f, 39.3397f);
        this.f31332e.lineTo(30.2407f, 33.6994f);
        this.f31332e.cubicTo(30.1631f, 33.1584f, 30.8854f, 32.903f, 31.1652f, 33.3725f);
        this.f31332e.lineTo(34.0813f, 38.2678f);
        this.f31332e.cubicTo(34.6108f, 39.1567f, 34.1948f, 40.3078f, 33.2193f, 40.6527f);
        this.f31332e.cubicTo(32.2438f, 40.9976f, 31.1966f, 40.3639f, 31.0497f, 39.3397f);
        this.f31332e.close();
        this.f31332e.setFillType(Path.FillType.EVEN_ODD);
        this.f31331d.setStyle(Paint.Style.FILL);
        this.f31331d.setColor(-1);
        this.f30624a.add(this.f31331d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31332e, this.f31331d);
    }
}
