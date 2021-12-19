package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cz extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31398d;

    /* renamed from: e  reason: collision with root package name */
    Path f31399e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31400f;

    /* renamed from: g  reason: collision with root package name */
    Path f31401g;

    static {
        Covode.recordClassIndex(18216);
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
        this.f30625b.setColor(-1);
        this.f31398d = new Paint();
        Path path = new Path();
        this.f31399e = path;
        path.moveTo(43.0f, 2.0f);
        this.f31399e.lineTo(5.0f, 2.0f);
        this.f31399e.cubicTo(3.34315f, 2.0f, 2.0f, 3.34315f, 2.0f, 5.0f);
        this.f31399e.lineTo(2.0f, 43.0f);
        this.f31399e.cubicTo(2.0f, 44.6569f, 3.34315f, 46.0f, 5.0f, 46.0f);
        this.f31399e.lineTo(43.0f, 46.0f);
        this.f31399e.cubicTo(44.6569f, 46.0f, 46.0f, 44.6569f, 46.0f, 43.0f);
        this.f31399e.lineTo(46.0f, 5.0f);
        this.f31399e.cubicTo(46.0f, 3.34315f, 44.6569f, 2.0f, 43.0f, 2.0f);
        this.f31399e.close();
        this.f31399e.moveTo(5.0f, 0.0f);
        this.f31399e.cubicTo(2.23858f, 0.0f, 0.0f, 2.23858f, 0.0f, 5.0f);
        this.f31399e.lineTo(0.0f, 43.0f);
        this.f31399e.cubicTo(0.0f, 45.7614f, 2.23858f, 48.0f, 5.0f, 48.0f);
        this.f31399e.lineTo(43.0f, 48.0f);
        this.f31399e.cubicTo(45.7614f, 48.0f, 48.0f, 45.7614f, 48.0f, 43.0f);
        this.f31399e.lineTo(48.0f, 5.0f);
        this.f31399e.cubicTo(48.0f, 2.23858f, 45.7614f, 0.0f, 43.0f, 0.0f);
        this.f31399e.lineTo(5.0f, 0.0f);
        this.f31399e.close();
        this.f31399e.setFillType(Path.FillType.EVEN_ODD);
        this.f31398d.setStyle(Paint.Style.FILL);
        this.f31398d.setColor(-15329245);
        this.f31398d.setAlpha(51);
        this.f30624a.add(this.f31398d);
        this.f31400f = new Paint();
        Path path2 = new Path();
        this.f31401g = path2;
        path2.moveTo(42.5586f, 14.3306f);
        this.f31401g.cubicTo(41.8082f, 14.3769f, 41.0926f, 14.6596f, 40.517f, 15.1374f);
        this.f31401g.cubicTo(39.7926f, 15.8988f, 39.2344f, 16.7992f, 38.877f, 17.7826f);
        this.f31401g.lineTo(30.2687f, 37.3508f);
        this.f31401g.cubicTo(30.2107f, 37.5315f, 30.0523f, 37.6219f, 29.7935f, 37.6219f);
        this.f31401g.cubicTo(29.6967f, 37.624f, 29.6013f, 37.5998f, 29.5175f, 37.552f);
        this.f31401g.cubicTo(29.4337f, 37.5042f, 29.3647f, 37.4346f, 29.3182f, 37.3508f);
        this.f31401g.lineTo(24.492f, 27.1534f);
        this.f31401g.lineTo(18.9361f, 37.3442f);
        this.f31401g.cubicTo(18.8896f, 37.428f, 18.8207f, 37.4976f, 18.7369f, 37.5454f);
        this.f31401g.cubicTo(18.6531f, 37.5932f, 18.5576f, 37.6174f, 18.4608f, 37.6153f);
        this.f31401g.cubicTo(18.3608f, 37.6271f, 18.2596f, 37.6072f, 18.1718f, 37.5585f);
        this.f31401g.cubicTo(18.0839f, 37.5097f, 18.0141f, 37.4347f, 17.9722f, 37.3442f);
        this.f31401g.lineTo(9.51792f, 17.7694f);
        this.f31401g.cubicTo(9.15845f, 16.8178f, 8.5891f, 15.9571f, 7.85116f, 15.2498f);
        this.f31401g.cubicTo(7.14144f, 14.7202f, 6.28909f, 14.4096f, 5.40122f, 14.3571f);
        this.f31401g.cubicTo(5.35029f, 14.354f, 5.30078f, 14.3393f, 5.25662f, 14.314f);
        this.f31401g.cubicTo(5.21246f, 14.2888f, 5.17488f, 14.2537f, 5.14686f, 14.2116f);
        this.f31401g.cubicTo(5.06876f, 14.1187f, 5.02612f, 14.0017f, 5.02637f, 13.8809f);
        this.f31401g.cubicTo(5.02637f, 13.5635f, 5.11562f, 13.4048f, 5.29412f, 13.4048f);
        this.f31401g.cubicTo(6.04829f, 13.4048f, 6.83593f, 13.4378f, 7.65704f, 13.504f);
        this.f31401g.cubicTo(8.47814f, 13.5701f, 9.19884f, 13.6032f, 9.81914f, 13.6032f);
        this.f31401g.cubicTo(10.5064f, 13.6032f, 11.3163f, 13.5701f, 12.249f, 13.504f);
        this.f31401g.cubicTo(13.1817f, 13.4378f, 14.0474f, 13.4048f, 14.8462f, 13.4048f);
        this.f31401g.cubicTo(15.0247f, 13.4048f, 15.1139f, 13.5635f, 15.1139f, 13.8809f);
        this.f31401g.cubicTo(15.1139f, 14.1983f, 15.0582f, 14.3571f, 14.9466f, 14.3571f);
        this.f31401g.cubicTo(14.3084f, 14.3757f, 13.6896f, 14.5779f, 13.166f, 14.939f);
        this.f31401g.cubicTo(12.952f, 15.0872f, 12.7788f, 15.2857f, 12.6619f, 15.5166f);
        this.f31401g.cubicTo(12.5451f, 15.7475f, 12.4883f, 16.0036f, 12.4967f, 16.2616f);
        this.f31401g.cubicTo(12.5162f, 16.6175f, 12.6072f, 16.9659f, 12.7644f, 17.2867f);
        this.f31401g.lineTo(19.7862f, 33.1581f);
        this.f31401g.lineTo(23.7557f, 25.5927f);
        this.f31401g.lineTo(20.054f, 17.7694f);
        this.f31401g.cubicTo(19.6528f, 16.7912f, 19.0995f, 15.8808f, 18.414f, 15.0713f);
        this.f31401g.cubicTo(17.867f, 14.6202f, 17.1847f, 14.3599f, 16.4728f, 14.3306f);
        this.f31401g.cubicTo(16.426f, 14.3256f, 16.381f, 14.3098f, 16.3415f, 14.2846f);
        this.f31401g.cubicTo(16.302f, 14.2593f, 16.269f, 14.2252f, 16.2452f, 14.1851f);
        this.f31401g.cubicTo(16.1738f, 14.0895f, 16.1362f, 13.9733f, 16.1381f, 13.8545f);
        this.f31401g.cubicTo(16.1381f, 13.537f, 16.2162f, 13.3783f, 16.3724f, 13.3783f);
        this.f31401g.cubicTo(17.0654f, 13.3743f, 17.7581f, 13.4074f, 18.4475f, 13.4775f);
        this.f31401g.cubicTo(19.0921f, 13.5466f, 19.7402f, 13.5797f, 20.3887f, 13.5767f);
        this.f31401g.cubicTo(21.0625f, 13.5767f, 21.7765f, 13.5436f, 22.5307f, 13.4775f);
        this.f31401g.cubicTo(23.2849f, 13.4114f, 24.0502f, 13.3783f, 24.8267f, 13.3783f);
        this.f31401g.cubicTo(25.0052f, 13.3783f, 25.0944f, 13.537f, 25.0944f, 13.8545f);
        this.f31401g.cubicTo(25.0944f, 14.1719f, 25.0386f, 14.3306f, 24.9271f, 14.3306f);
        this.f31401g.cubicTo(23.4187f, 14.432f, 22.6646f, 14.8729f, 22.6646f, 15.6532f);
        this.f31401g.cubicTo(22.7332f, 16.2095f, 22.9129f, 16.7467f, 23.1934f, 17.2338f);
        this.f31401g.lineTo(25.6433f, 22.2465f);
        this.f31401g.lineTo(28.0732f, 17.6636f);
        this.f31401g.cubicTo(28.3677f, 17.1651f, 28.5418f, 16.6061f, 28.5819f, 16.0302f);
        this.f31401g.cubicTo(28.5819f, 14.9853f, 27.8277f, 14.4276f, 26.3194f, 14.3571f);
        this.f31401g.cubicTo(26.1855f, 14.3571f, 26.1186f, 14.1983f, 26.1186f, 13.8809f);
        this.f31401g.cubicTo(26.1188f, 13.7655f, 26.1537f, 13.6527f, 26.219f, 13.5569f);
        this.f31401g.cubicTo(26.2859f, 13.4555f, 26.3529f, 13.4048f, 26.4198f, 13.4048f);
        this.f31401g.cubicTo(26.9598f, 13.4048f, 27.6291f, 13.4378f, 28.4279f, 13.504f);
        this.f31401g.cubicTo(29.2267f, 13.5701f, 29.8448f, 13.6032f, 30.2821f, 13.6032f);
        this.f31401g.cubicTo(30.6302f, 13.6032f, 31.1412f, 13.5745f, 31.815f, 13.5172f);
        this.f31401g.cubicTo(32.6718f, 13.4378f, 33.3858f, 13.3982f, 33.957f, 13.3982f);
        this.f31401g.cubicTo(34.0909f, 13.3982f, 34.1578f, 13.5348f, 34.1578f, 13.8082f);
        this.f31401g.cubicTo(34.1578f, 14.1697f, 34.0351f, 14.3504f, 33.7897f, 14.3504f);
        this.f31401g.cubicTo(33.0301f, 14.4005f, 32.2988f, 14.6542f, 31.6744f, 15.0845f);
        this.f31401g.cubicTo(30.8451f, 15.8613f, 30.1647f, 16.7799f, 29.6663f, 17.7959f);
        this.f31401g.lineTo(26.4198f, 23.8468f);
        this.f31401g.lineTo(30.8109f, 32.8803f);
        this.f31401g.lineTo(37.2905f, 17.6702f);
        this.f31401g.cubicTo(37.4995f, 17.1844f, 37.6131f, 16.6637f, 37.6252f, 16.136f);
        this.f31401g.cubicTo(37.6252f, 15.0206f, 36.8711f, 14.4298f, 35.3627f, 14.3637f);
        this.f31401g.cubicTo(35.2288f, 14.3637f, 35.1619f, 14.205f, 35.1619f, 13.8875f);
        this.f31401g.cubicTo(35.1619f, 13.5701f, 35.2623f, 13.4114f, 35.4631f, 13.4114f);
        this.f31401g.cubicTo(36.0165f, 13.4114f, 36.6702f, 13.4444f, 37.4244f, 13.5106f);
        this.f31401g.cubicTo(38.1786f, 13.5767f, 38.7632f, 13.6098f, 39.1782f, 13.6098f);
        this.f31401g.cubicTo(39.753f, 13.6061f, 40.3272f, 13.573f, 40.8985f, 13.5106f);
        this.f31401g.cubicTo(41.5094f, 13.4355f, 42.1238f, 13.3914f, 42.7393f, 13.3783f);
        this.f31401g.cubicTo(42.8955f, 13.3783f, 42.9736f, 13.515f, 42.9736f, 13.7883f);
        this.f31401g.cubicTo(42.9741f, 13.9243f, 42.9294f, 14.0568f, 42.8464f, 14.1653f);
        this.f31401g.cubicTo(42.8158f, 14.214f, 42.7735f, 14.2545f, 42.7233f, 14.2834f);
        this.f31401g.cubicTo(42.6732f, 14.3122f, 42.6166f, 14.3284f, 42.5586f, 14.3306f);
        this.f31401g.close();
        this.f31401g.setFillType(Path.FillType.EVEN_ODD);
        this.f31400f.setStyle(Paint.Style.FILL);
        this.f31400f.setColor(-16776670);
        this.f30624a.add(this.f31400f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31399e, this.f31398d);
        canvas.drawPath(this.f31401g, this.f31400f);
    }
}
