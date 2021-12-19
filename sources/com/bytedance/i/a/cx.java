package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cx extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31394d;

    /* renamed from: e  reason: collision with root package name */
    Path f31395e;

    static {
        Covode.recordClassIndex(18214);
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
        this.f30625b.setColor(-13377375);
        this.f31394d = new Paint();
        Path path = new Path();
        this.f31395e = path;
        path.moveTo(15.0037f, 34.3756f);
        this.f31395e.cubicTo(10.0361f, 34.3756f, 6.00932f, 30.3493f, 6.00932f, 25.3813f);
        this.f31395e.cubicTo(6.00771f, 24.1299f, 6.26789f, 22.892f, 6.77314f, 21.7471f);
        this.f31395e.cubicTo(7.27839f, 20.6022f, 8.01755f, 19.5757f, 8.94311f, 18.7335f);
        this.f31395e.lineTo(6.0f, 15.5313f);
        this.f31395e.lineTo(12.5427f, 15.5313f);
        this.f31395e.cubicTo(15.924f, 13.2304f, 19.9192f, 12.0f, 24.0091f, 12.0f);
        this.f31395e.cubicTo(28.099f, 12.0f, 32.0942f, 13.2304f, 35.4755f, 15.5313f);
        this.f31395e.lineTo(42.0f, 15.5313f);
        this.f31395e.lineTo(39.0569f, 18.7335f);
        this.f31395e.cubicTo(39.9827f, 19.5755f, 40.7222f, 20.6019f, 41.2277f, 21.7467f);
        this.f31395e.cubicTo(41.7333f, 22.8915f, 41.9938f, 24.1294f, 41.9925f, 25.3809f);
        this.f31395e.cubicTo(41.9925f, 30.348f, 37.9622f, 34.3752f, 32.9941f, 34.3752f);
        this.f31395e.cubicTo(30.7275f, 34.3785f, 28.5438f, 33.5226f, 26.883f, 31.9799f);
        this.f31395e.lineTo(23.9998f, 35.1155f);
        this.f31395e.lineTo(21.1166f, 31.9781f);
        this.f31395e.cubicTo(19.4557f, 33.522f, 17.2713f, 34.3788f, 15.0037f, 34.3756f);
        this.f31395e.close();
        this.f31395e.moveTo(38.0541f, 28.7631f);
        this.f31395e.cubicTo(38.723f, 27.7621f, 39.08f, 26.5852f, 39.08f, 25.3813f);
        this.f31395e.cubicTo(39.08f, 23.7669f, 38.4387f, 22.2186f, 37.2971f, 21.077f);
        this.f31395e.cubicTo(36.1555f, 19.9355f, 34.6072f, 19.2941f, 32.9928f, 19.2941f);
        this.f31395e.cubicTo(31.7889f, 19.2941f, 30.612f, 19.6511f, 29.611f, 20.32f);
        this.f31395e.cubicTo(28.6099f, 20.9889f, 27.8297f, 21.9396f, 27.369f, 23.0518f);
        this.f31395e.cubicTo(26.9083f, 24.1641f, 26.7877f, 25.3881f, 27.0226f, 26.5688f);
        this.f31395e.cubicTo(27.2575f, 27.7496f, 27.8372f, 28.8343f, 28.6885f, 29.6856f);
        this.f31395e.cubicTo(29.5398f, 30.5369f, 30.6245f, 31.1166f, 31.8053f, 31.3515f);
        this.f31395e.cubicTo(32.9861f, 31.5864f, 34.21f, 31.4658f, 35.3223f, 31.0051f);
        this.f31395e.cubicTo(36.4346f, 30.5444f, 37.3852f, 29.7642f, 38.0541f, 28.7631f);
        this.f31395e.close();
        this.f31395e.moveTo(30.7563f, 16.2938f);
        this.f31395e.cubicTo(28.6158f, 15.3991f, 26.3185f, 14.9398f, 23.9985f, 14.9427f);
        this.f31395e.cubicTo(21.6801f, 14.9402f, 19.3845f, 15.3994f, 17.2455f, 16.2934f);
        this.f31395e.cubicTo(21.0877f, 17.7629f, 24.0016f, 21.2002f, 24.0016f, 25.2056f);
        this.f31395e.cubicTo(24.0016f, 21.2006f, 26.9145f, 17.7638f, 30.7563f, 16.2938f);
        this.f31395e.close();
        this.f31395e.moveTo(18.3855f, 20.32f);
        this.f31395e.cubicTo(17.3845f, 19.6511f, 16.2076f, 19.2941f, 15.0037f, 19.2941f);
        this.f31395e.cubicTo(13.3892f, 19.2941f, 11.841f, 19.9355f, 10.6994f, 21.077f);
        this.f31395e.cubicTo(9.55782f, 22.2186f, 8.9165f, 23.7669f, 8.9165f, 25.3813f);
        this.f31395e.cubicTo(8.9165f, 26.5852f, 9.27351f, 27.7621f, 9.94237f, 28.7631f);
        this.f31395e.cubicTo(10.6112f, 29.7642f, 11.5619f, 30.5444f, 12.6742f, 31.0051f);
        this.f31395e.cubicTo(13.7865f, 31.4658f, 15.0104f, 31.5864f, 16.1912f, 31.3515f);
        this.f31395e.cubicTo(17.372f, 31.1166f, 18.4566f, 30.5369f, 19.3079f, 29.6856f);
        this.f31395e.cubicTo(20.1592f, 28.8343f, 20.739f, 27.7496f, 20.9739f, 26.5688f);
        this.f31395e.cubicTo(21.2087f, 25.3881f, 21.0882f, 24.1641f, 20.6275f, 23.0518f);
        this.f31395e.cubicTo(20.1667f, 21.9396f, 19.3865f, 20.9889f, 18.3855f, 20.32f);
        this.f31395e.close();
        this.f31395e.moveTo(15.0036f, 28.572f);
        this.f31395e.cubicTo(15.6348f, 28.5721f, 16.2518f, 28.385f, 16.7766f, 28.0344f);
        this.f31395e.cubicTo(17.3015f, 27.6838f, 17.7106f, 27.1854f, 17.9521f, 26.6023f);
        this.f31395e.cubicTo(18.1937f, 26.0192f, 18.257f, 25.3775f, 18.1338f, 24.7585f);
        this.f31395e.cubicTo(18.0107f, 24.1394f, 17.7068f, 23.5708f, 17.2605f, 23.1245f);
        this.f31395e.cubicTo(16.8142f, 22.6782f, 16.2455f, 22.3742f, 15.6265f, 22.2511f);
        this.f31395e.cubicTo(15.0075f, 22.128f, 14.3658f, 22.1912f, 13.7827f, 22.4328f);
        this.f31395e.cubicTo(13.1996f, 22.6744f, 12.7012f, 23.0835f, 12.3506f, 23.6083f);
        this.f31395e.cubicTo(12.0f, 24.1331f, 11.8129f, 24.7502f, 11.813f, 25.3813f);
        this.f31395e.cubicTo(11.8131f, 26.2275f, 12.1493f, 27.039f, 12.7476f, 27.6373f);
        this.f31395e.cubicTo(13.346f, 28.2357f, 14.1574f, 28.5718f, 15.0036f, 28.572f);
        this.f31395e.close();
        this.f31395e.moveTo(32.9928f, 28.5724f);
        this.f31395e.cubicTo(34.7552f, 28.5724f, 36.1839f, 27.1437f, 36.1839f, 25.3813f);
        this.f31395e.cubicTo(36.1839f, 23.6189f, 34.7552f, 22.1902f, 32.9928f, 22.1902f);
        this.f31395e.cubicTo(31.2304f, 22.1902f, 29.8018f, 23.6189f, 29.8018f, 25.3813f);
        this.f31395e.cubicTo(29.8018f, 27.1437f, 31.2304f, 28.5724f, 32.9928f, 28.5724f);
        this.f31395e.close();
        this.f31395e.setFillType(Path.FillType.EVEN_ODD);
        this.f31394d.setStyle(Paint.Style.FILL);
        this.f31394d.setColor(-16777216);
        this.f30624a.add(this.f31394d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31395e, this.f31394d);
    }
}
