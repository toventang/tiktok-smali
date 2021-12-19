package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class co extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31345d;

    /* renamed from: e  reason: collision with root package name */
    Path f31346e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31347f;

    /* renamed from: g  reason: collision with root package name */
    Path f31348g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31349h;

    /* renamed from: i  reason: collision with root package name */
    Path f31350i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31351j;

    /* renamed from: k  reason: collision with root package name */
    Path f31352k;

    static {
        Covode.recordClassIndex(18205);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.addRoundRect(new RectF(0.0f, 0.0f, 48.0f, 48.0f), 5.0f, 5.0f, Path.Direction.CW);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-799213);
        this.f31345d = new Paint();
        Path path = new Path();
        this.f31346e = path;
        path.moveTo(19.2555f, 21.3975f);
        this.f31346e.cubicTo(19.0667f, 22.8447f, 18.8734f, 24.2873f, 18.6889f, 25.7345f);
        this.f31346e.cubicTo(18.522f, 27.0361f, 18.3595f, 28.3422f, 18.1926f, 29.6484f);
        this.f31346e.cubicTo(18.1443f, 30.0397f, 18.0828f, 30.4266f, 18.0344f, 30.818f);
        this.f31346e.cubicTo(18.0169f, 30.9499f, 17.9598f, 30.9954f, 17.8368f, 30.9954f);
        this.f31346e.cubicTo(17.1648f, 30.9909f, 16.4883f, 30.9909f, 15.8163f, 30.9954f);
        this.f31346e.cubicTo(15.6933f, 30.9954f, 15.6362f, 30.959f, 15.6186f, 30.818f);
        this.f31346e.cubicTo(15.4166f, 29.3343f, 15.2101f, 27.8553f, 15.0037f, 26.3762f);
        this.f31346e.cubicTo(14.806f, 24.9563f, 14.5996f, 23.5364f, 14.4019f, 22.112f);
        this.f31346e.cubicTo(14.38f, 21.9663f, 14.3624f, 21.8161f, 14.3273f, 21.6705f);
        this.f31346e.cubicTo(14.3273f, 24.665f, 14.3317f, 27.6596f, 14.3317f, 30.6587f);
        this.f31346e.cubicTo(14.3317f, 30.9954f, 14.3317f, 30.9954f, 14.011f, 30.9954f);
        this.f31346e.cubicTo(13.0974f, 30.9954f, 12.1794f, 30.9909f, 11.2658f, 31.0f);
        this.f31346e.cubicTo(11.0637f, 31.0f, 11.0066f, 30.9408f, 11.0066f, 30.7315f);
        this.f31346e.cubicTo(11.011f, 25.9075f, 11.0066f, 21.0834f, 10.9978f, 16.264f);
        this.f31346e.cubicTo(10.9978f, 16.0455f, 11.0681f, 16.0f, 11.2614f, 16.0f);
        this.f31346e.cubicTo(12.7197f, 16.0046f, 14.1735f, 16.0046f, 15.6318f, 16.0f);
        this.f31346e.cubicTo(15.8119f, 16.0f, 15.8866f, 16.0501f, 15.9129f, 16.2458f);
        this.f31346e.cubicTo(16.1369f, 17.8841f, 16.3741f, 19.5225f, 16.6025f, 21.1608f);
        this.f31346e.cubicTo(16.6728f, 21.6523f, 16.7387f, 22.1438f, 16.8397f, 22.6353f);
        this.f31346e.cubicTo(16.9012f, 22.1484f, 16.9627f, 21.6569f, 17.0242f, 21.1699f);
        this.f31346e.cubicTo(17.1516f, 20.1414f, 17.279f, 19.1174f, 17.4063f, 18.0889f);
        this.f31346e.cubicTo(17.4854f, 17.4609f, 17.5645f, 16.8283f, 17.6347f, 16.2002f);
        this.f31346e.cubicTo(17.6523f, 16.0546f, 17.705f, 16.0046f, 17.8412f, 16.0046f);
        this.f31346e.cubicTo(19.3565f, 16.0046f, 20.8719f, 16.0046f, 22.3873f, 16.0f);
        this.f31346e.cubicTo(22.5278f, 16.0f, 22.5937f, 16.0501f, 22.5806f, 16.2002f);
        this.f31346e.cubicTo(22.5762f, 16.2549f, 22.5806f, 16.3049f, 22.5806f, 16.3595f);
        this.f31346e.cubicTo(22.5806f, 21.1198f, 22.5849f, 25.8847f, 22.5849f, 30.645f);
        this.f31346e.cubicTo(22.5849f, 30.9954f, 22.5849f, 30.9954f, 22.2511f, 30.9954f);
        this.f31346e.cubicTo(21.3639f, 30.9954f, 20.481f, 30.9954f, 19.5937f, 30.9954f);
        this.f31346e.cubicTo(19.2687f, 30.9954f, 19.2687f, 30.9955f, 19.2687f, 30.6678f);
        this.f31346e.cubicTo(19.2687f, 27.5822f, 19.2643f, 24.4967f, 19.2643f, 21.4066f);
        this.f31346e.cubicTo(19.2643f, 21.3975f, 19.2599f, 21.3975f, 19.2555f, 21.3975f);
        this.f31346e.close();
        this.f31346e.setFillType(Path.FillType.WINDING);
        this.f31345d.setStyle(Paint.Style.FILL);
        this.f31345d.setColor(-16777216);
        this.f30624a.add(this.f31345d);
        this.f31347f = new Paint();
        Path path2 = new Path();
        this.f31348g = path2;
        path2.moveTo(23.7936f, 23.4932f);
        this.f31348g.cubicTo(23.7936f, 21.0941f, 23.7892f, 18.6995f, 23.7892f, 16.3005f);
        this.f31348g.cubicTo(23.7892f, 16.0f, 23.7892f, 16.0f, 24.0747f, 16.0f);
        this.f31348g.cubicTo(25.2562f, 16.0046f, 26.4334f, 15.9909f, 27.6106f, 16.0182f);
        this.f31348g.cubicTo(28.4934f, 16.041f, 29.3807f, 16.0546f, 30.2372f, 16.3141f);
        this.f31348g.cubicTo(31.4276f, 16.6783f, 32.1348f, 17.607f, 32.2094f, 18.8816f);
        this.f31348g.cubicTo(32.3807f, 21.7451f, 32.2709f, 24.6131f, 32.2841f, 27.4765f);
        this.f31348g.cubicTo(32.2885f, 27.9863f, 32.2314f, 28.5053f, 32.1479f, 29.0106f);
        this.f31348g.cubicTo(31.9722f, 30.0303f, 31.2694f, 30.6995f, 30.2284f, 30.8498f);
        this.f31348g.cubicTo(29.6926f, 30.9272f, 29.1523f, 30.9772f, 28.6164f, 30.9863f);
        this.f31348g.cubicTo(27.101f, 31.0046f, 25.5857f, 30.9909f, 24.0703f, 31.0f);
        this.f31348g.cubicTo(23.8463f, 31.0f, 23.7892f, 30.9317f, 23.7892f, 30.7041f);
        this.f31348g.cubicTo(23.7979f, 28.305f, 23.7936f, 25.9014f, 23.7936f, 23.4932f);
        this.f31348g.close();
        this.f31348g.moveTo(27.571f, 28.3323f);
        this.f31348g.cubicTo(27.694f, 28.3323f, 27.8038f, 28.3414f, 27.9092f, 28.3323f);
        this.f31348g.cubicTo(28.3441f, 28.2914f, 28.5198f, 28.1366f, 28.5901f, 27.6859f);
        this.f31348g.cubicTo(28.634f, 27.4173f, 28.6647f, 27.1442f, 28.6691f, 26.8756f);
        this.f31348g.cubicTo(28.6735f, 24.6313f, 28.6735f, 22.387f, 28.6735f, 20.1426f);
        this.f31348g.cubicTo(28.6735f, 19.9469f, 28.6867f, 19.7466f, 28.6647f, 19.5508f);
        this.f31348g.cubicTo(28.634f, 19.264f, 28.656f, 18.9363f, 28.3573f, 18.7678f);
        this.f31348g.cubicTo(28.1157f, 18.6358f, 27.8478f, 18.6039f, 27.5666f, 18.6404f);
        this.f31348g.cubicTo(27.5666f, 21.868f, 27.5666f, 25.0774f, 27.571f, 28.3323f);
        this.f31348g.close();
        this.f31348g.setFillType(Path.FillType.WINDING);
        this.f31347f.setStyle(Paint.Style.FILL);
        this.f31347f.setColor(-16777216);
        this.f30624a.add(this.f31347f);
        this.f31349h = new Paint();
        Path path3 = new Path();
        this.f31350i = path3;
        path3.moveTo(37.1371f, 29.8949f);
        this.f31350i.cubicTo(37.0669f, 30.1737f, 37.001f, 30.3896f, 36.9615f, 30.6144f);
        this.f31350i.cubicTo(36.9307f, 30.7718f, 36.856f, 30.8168f, 36.7067f, 30.8168f);
        this.f31350i.cubicTo(35.7184f, 30.8123f, 34.7301f, 30.8078f, 33.7418f, 30.8213f);
        this.f31350i.cubicTo(33.5398f, 30.8213f, 33.5003f, 30.7403f, 33.5003f, 30.556f);
        this.f31350i.cubicTo(33.5046f, 28.375f, 33.5003f, 26.1941f, 33.5003f, 24.0177f);
        this.f31350i.cubicTo(33.5003f, 21.4501f, 33.4959f, 18.8779f, 33.4959f, 16.3103f);
        this.f31350i.cubicTo(33.4959f, 16.0045f, 33.4959f, 16.0045f, 33.7989f, 16.0045f);
        this.f31350i.cubicTo(34.8311f, 16.0045f, 35.8634f, 16.009f, 36.8956f, 16.0f);
        this.f31350i.cubicTo(37.102f, 16.0f, 37.1591f, 16.0719f, 37.1591f, 16.2698f);
        this.f31350i.cubicTo(37.1547f, 17.6638f, 37.1591f, 19.0578f, 37.1591f, 20.4518f);
        this.f31350i.cubicTo(37.1591f, 20.5237f, 37.1635f, 20.5957f, 37.1679f, 20.7036f);
        this.f31350i.cubicTo(37.2338f, 20.6451f, 37.2777f, 20.6092f, 37.3172f, 20.5687f);
        this.f31350i.cubicTo(37.9541f, 19.9212f, 38.7492f, 19.7233f, 39.6101f, 19.7593f);
        this.f31350i.cubicTo(39.9527f, 19.7728f, 40.3085f, 19.8447f, 40.6335f, 19.9571f);
        this.f31350i.cubicTo(41.4593f, 20.2404f, 41.9468f, 20.9599f, 41.96f, 21.8503f);
        this.f31350i.cubicTo(41.9776f, 23.2667f, 41.9951f, 24.6787f, 41.9995f, 26.0952f);
        this.f31350i.cubicTo(42.0039f, 26.8641f, 41.982f, 27.6376f, 41.96f, 28.4065f);
        this.f31350i.cubicTo(41.9336f, 29.4138f, 41.5998f, 30.2412f, 40.6598f, 30.7268f);
        this.f31350i.cubicTo(39.7594f, 31.19f, 38.244f, 31.0956f, 37.4007f, 30.2007f);
        this.f31350i.cubicTo(37.3216f, 30.1153f, 37.247f, 30.0209f, 37.1371f, 29.8949f);
        this.f31350i.close();
        this.f31350i.moveTo(37.1723f, 25.3397f);
        this.f31350i.cubicTo(37.1679f, 25.3397f, 37.1635f, 25.3397f, 37.1591f, 25.3397f);
        this.f31350i.cubicTo(37.1591f, 26.0862f, 37.1547f, 26.8372f, 37.1635f, 27.5836f);
        this.f31350i.cubicTo(37.1679f, 27.8534f, 37.1855f, 28.1232f, 37.2206f, 28.3885f);
        this.f31350i.cubicTo(37.2601f, 28.6718f, 37.4227f, 28.8067f, 37.6774f, 28.8067f);
        this.f31350i.cubicTo(38.0068f, 28.8067f, 38.2396f, 28.6449f, 38.2792f, 28.375f);
        this.f31350i.cubicTo(38.3099f, 28.1772f, 38.3275f, 27.9748f, 38.3275f, 27.7725f);
        this.f31350i.cubicTo(38.3319f, 26.1851f, 38.3319f, 24.5978f, 38.3275f, 23.0149f);
        this.f31350i.cubicTo(38.3275f, 22.8306f, 38.3055f, 22.6417f, 38.2836f, 22.4573f);
        this.f31350i.cubicTo(38.244f, 22.1291f, 38.0552f, 21.9672f, 37.695f, 21.9582f);
        this.f31350i.cubicTo(37.3568f, 21.9492f, 37.2601f, 22.0346f, 37.1899f, 22.4034f);
        this.f31350i.cubicTo(37.1767f, 22.4753f, 37.1679f, 22.5518f, 37.1679f, 22.6237f);
        this.f31350i.cubicTo(37.1723f, 23.5276f, 37.1723f, 24.4359f, 37.1723f, 25.3397f);
        this.f31350i.close();
        this.f31350i.setFillType(Path.FillType.WINDING);
        this.f31349h.setStyle(Paint.Style.FILL);
        this.f31349h.setColor(-16777216);
        this.f30624a.add(this.f31349h);
        this.f31351j = new Paint();
        Path path4 = new Path();
        this.f31352k = path4;
        path4.moveTo(9.79502f, 23.5001f);
        this.f31352k.cubicTo(9.79502f, 25.8803f, 9.79941f, 28.2649f, 9.79941f, 30.645f);
        this.f31352k.cubicTo(9.79941f, 30.9954f, 9.79941f, 30.9954f, 9.46559f, 30.9954f);
        this.f31352k.cubicTo(8.41142f, 30.9954f, 7.35725f, 30.9909f, 6.30307f, 31.0f);
        this.f31352k.cubicTo(6.09224f, 31.0f, 6.00878f, 30.9545f, 6.00878f, 30.7133f);
        this.f31352k.cubicTo(6.00878f, 25.9076f, 6.00878f, 21.0973f, 6.0f, 16.287f);
        this.f31352k.cubicTo(6.0f, 16.0458f, 6.07906f, 15.9957f, 6.29429f, 16.0003f);
        this.f31352k.cubicTo(7.36164f, 16.0094f, 8.43338f, 16.0048f, 9.50073f, 16.0048f);
        this.f31352k.cubicTo(9.79063f, 16.0048f, 9.79063f, 16.0048f, 9.79063f, 16.3097f);
        this.f31352k.cubicTo(9.79063f, 18.7081f, 9.79063f, 21.1018f, 9.79502f, 23.5001f);
        this.f31352k.close();
        this.f31352k.setFillType(Path.FillType.WINDING);
        this.f31351j.setStyle(Paint.Style.FILL);
        this.f31351j.setColor(-16777216);
        this.f30624a.add(this.f31351j);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31346e, this.f31345d);
        canvas.drawPath(this.f31348g, this.f31347f);
        canvas.drawPath(this.f31350i, this.f31349h);
        canvas.drawPath(this.f31352k, this.f31351j);
    }
}
