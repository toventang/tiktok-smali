package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ci extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31329d;

    /* renamed from: e  reason: collision with root package name */
    Path f31330e;

    static {
        Covode.recordClassIndex(18199);
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
        this.f30625b.setColor(-15152742);
        this.f31329d = new Paint();
        Path path = new Path();
        this.f31330e = path;
        path.moveTo(9.15816f, 14.75f);
        this.f31330e.lineTo(14.468f, 14.75f);
        this.f31330e.cubicTo(15.1575f, 13.3938f, 16.1793f, 12.2644f, 17.5893f, 11.5468f);
        this.f31330e.cubicTo(16.8812f, 11.3463f, 16.1732f, 11.2248f, 15.5f, 11.2248f);
        this.f31330e.cubicTo(13.7292f, 11.2248f, 12.3715f, 11.6668f, 11.2383f, 12.4961f);
        this.f31330e.cubicTo(10.4926f, 13.0419f, 9.80623f, 13.7831f, 9.15816f, 14.75f);
        this.f31330e.close();
        this.f31330e.moveTo(25.25f, 14.2542f);
        this.f31330e.lineTo(25.25f, 14.75f);
        this.f31330e.lineTo(30.4336f, 14.75f);
        this.f31330e.cubicTo(30.0271f, 14.2639f, 29.5428f, 13.8923f, 28.9832f, 13.6381f);
        this.f31330e.cubicTo(28.3507f, 13.3509f, 27.3787f, 13.4554f, 26.3317f, 13.8111f);
        this.f31330e.cubicTo(25.9176f, 13.9517f, 25.5434f, 14.1139f, 25.25f, 14.2542f);
        this.f31330e.close();
        this.f31330e.moveTo(33.3746f, 14.75f);
        this.f31330e.cubicTo(32.7257f, 13.4042f, 31.7551f, 12.2742f, 30.3988f, 11.5502f);
        this.f31330e.cubicTo(31.1108f, 11.3477f, 31.8231f, 11.2248f, 32.5f, 11.2248f);
        this.f31330e.cubicTo(34.2709f, 11.2248f, 35.6286f, 11.6668f, 36.7618f, 12.4961f);
        this.f31330e.cubicTo(37.5075f, 13.0419f, 38.1938f, 13.7831f, 38.8419f, 14.75f);
        this.f31330e.lineTo(33.3746f, 14.75f);
        this.f31330e.close();
        this.f31330e.moveTo(31.6265f, 17.25f);
        this.f31330e.lineTo(25.25f, 17.25f);
        this.f31330e.lineTo(25.25f, 22.25f);
        this.f31330e.lineTo(31.8313f, 22.25f);
        this.f31330e.cubicTo(32.0505f, 20.383f, 31.9843f, 18.6672f, 31.6265f, 17.25f);
        this.f31330e.close();
        this.f31330e.moveTo(34.3465f, 22.25f);
        this.f31330e.cubicTo(34.5286f, 20.4997f, 34.4931f, 18.7944f, 34.1878f, 17.25f);
        this.f31330e.lineTo(40.1804f, 17.25f);
        this.f31330e.cubicTo(40.6938f, 18.6406f, 40.8441f, 20.3653f, 40.4887f, 22.25f);
        this.f31330e.lineTo(34.3465f, 22.25f);
        this.f31330e.close();
        this.f31330e.moveTo(31.386f, 24.75f);
        this.f31330e.lineTo(25.25f, 24.75f);
        this.f31330e.lineTo(25.25f, 29.7562f);
        this.f31330e.lineTo(29.629f, 29.7562f);
        this.f31330e.cubicTo(30.3896f, 28.144f, 30.9866f, 26.4393f, 31.386f, 24.75f);
        this.f31330e.close();
        this.f31330e.moveTo(32.3662f, 29.7562f);
        this.f31330e.cubicTo(33.0593f, 28.1135f, 33.5934f, 26.4159f, 33.948f, 24.75f);
        this.f31330e.lineTo(39.7409f, 24.75f);
        this.f31330e.cubicTo(39.0676f, 26.3932f, 38.0078f, 28.0946f, 36.4814f, 29.7562f);
        this.f31330e.lineTo(32.3662f, 29.7562f);
        this.f31330e.close();
        this.f31330e.moveTo(28.2677f, 32.2562f);
        this.f31330e.lineTo(25.25f, 32.2562f);
        this.f31330e.lineTo(25.25f, 35.9908f);
        this.f31330e.cubicTo(26.3683f, 34.9454f, 27.3841f, 33.6693f, 28.2677f, 32.2562f);
        this.f31330e.close();
        this.f31330e.moveTo(22.75f, 35.9955f);
        this.f31330e.lineTo(22.75f, 32.2562f);
        this.f31330e.lineTo(19.5673f, 32.2562f);
        this.f31330e.cubicTo(20.4938f, 33.6763f, 21.5647f, 34.9551f, 22.75f, 35.9955f);
        this.f31330e.close();
        this.f31330e.moveTo(18.1529f, 29.7562f);
        this.f31330e.lineTo(22.75f, 29.7562f);
        this.f31330e.lineTo(22.75f, 24.75f);
        this.f31330e.lineTo(16.3519f, 24.75f);
        this.f31330e.cubicTo(16.7551f, 26.4399f, 17.3667f, 28.1452f, 18.1529f, 29.7562f);
        this.f31330e.close();
        this.f31330e.moveTo(13.7891f, 24.75f);
        this.f31330e.cubicTo(14.1453f, 26.4169f, 14.6894f, 28.1146f, 15.4014f, 29.7562f);
        this.f31330e.lineTo(11.5187f, 29.7562f);
        this.f31330e.cubicTo(9.99224f, 28.0946f, 8.93247f, 26.3932f, 8.25913f, 24.75f);
        this.f31330e.lineTo(13.7891f, 24.75f);
        this.f31330e.close();
        this.f31330e.moveTo(15.9089f, 22.25f);
        this.f31330e.lineTo(22.75f, 22.25f);
        this.f31330e.lineTo(22.75f, 17.25f);
        this.f31330e.lineTo(16.1752f, 17.25f);
        this.f31330e.cubicTo(15.7848f, 18.6642f, 15.697f, 20.3806f, 15.9089f, 22.25f);
        this.f31330e.close();
        this.f31330e.moveTo(13.6028f, 17.25f);
        this.f31330e.cubicTo(13.2721f, 18.7955f, 13.2202f, 20.5008f, 13.3948f, 22.25f);
        this.f31330e.lineTo(7.5114f, 22.25f);
        this.f31330e.cubicTo(7.15599f, 20.3653f, 7.30622f, 18.6406f, 7.81964f, 17.25f);
        this.f31330e.lineTo(13.6028f, 17.25f);
        this.f31330e.close();
        this.f31330e.moveTo(17.4612f, 14.75f);
        this.f31330e.lineTo(22.75f, 14.75f);
        this.f31330e.lineTo(22.75f, 14.2463f);
        this.f31330e.cubicTo(22.4675f, 14.1089f, 22.1074f, 13.9507f, 21.7062f, 13.8131f);
        this.f31330e.cubicTo(20.6921f, 13.4652f, 19.6981f, 13.3465f, 18.9924f, 13.6489f);
        this.f31330e.cubicTo(18.4009f, 13.9024f, 17.8904f, 14.2713f, 17.4612f, 14.75f);
        this.f31330e.close();
        this.f31330e.moveTo(14.2084f, 32.2562f);
        this.f31330e.lineTo(16.6437f, 32.2562f);
        this.f31330e.cubicTo(17.2358f, 33.3046f, 17.899f, 34.3071f, 18.6272f, 35.2375f);
        this.f31330e.cubicTo(17.2644f, 34.4872f, 15.7534f, 33.5123f, 14.2084f, 32.2562f);
        this.f31330e.close();
        this.f31330e.moveTo(24.0f, 38.7533f);
        this.f31330e.lineTo(24.2556f, 39.9769f);
        this.f31330e.lineTo(24.0f, 40.0303f);
        this.f31330e.lineTo(23.7444f, 39.9769f);
        this.f31330e.lineTo(24.0f, 38.7533f);
        this.f31330e.close();
        this.f31330e.moveTo(24.0f, 38.7533f);
        this.f31330e.cubicTo(24.2556f, 39.9769f, 24.2561f, 39.9768f, 24.2565f, 39.9768f);
        this.f31330e.lineTo(24.2575f, 39.9765f);
        this.f31330e.lineTo(24.26f, 39.976f);
        this.f31330e.lineTo(24.2665f, 39.9746f);
        this.f31330e.lineTo(24.2862f, 39.9704f);
        this.f31330e.cubicTo(24.3021f, 39.9668f, 24.3238f, 39.962f, 24.3511f, 39.9557f);
        this.f31330e.cubicTo(24.4055f, 39.943f, 24.4822f, 39.9246f, 24.5797f, 39.8997f);
        this.f31330e.cubicTo(24.7745f, 39.8498f, 25.0523f, 39.7737f, 25.4014f, 39.6655f);
        this.f31330e.cubicTo(26.0993f, 39.4492f, 27.0834f, 39.1038f, 28.2581f, 38.5813f);
        this.f31330e.cubicTo(30.6064f, 37.5367f, 33.7267f, 35.7796f, 36.8447f, 32.9214f);
        this.f31330e.cubicTo(43.13f, 27.1599f, 44.4366f, 20.0781f, 42.1181f, 15.441f);
        this.f31330e.cubicTo(41.0678f, 13.3405f, 39.8316f, 11.6448f, 38.2383f, 10.4787f);
        this.f31330e.cubicTo(36.6215f, 9.29544f, 34.7292f, 8.72479f, 32.5f, 8.72479f);
        this.f31330e.cubicTo(30.1816f, 8.72479f, 27.8312f, 9.72903f, 26.1541f, 10.6386f);
        this.f31330e.cubicTo(25.296f, 11.104f, 24.5718f, 11.5682f, 24.0611f, 11.9166f);
        this.f31330e.cubicTo(24.0404f, 11.9308f, 24.0201f, 11.9447f, 24.0f, 11.9585f);
        this.f31330e.cubicTo(23.98f, 11.9447f, 23.9596f, 11.9308f, 23.9389f, 11.9166f);
        this.f31330e.cubicTo(23.4283f, 11.5682f, 22.7041f, 11.104f, 21.846f, 10.6386f);
        this.f31330e.cubicTo(20.1689f, 9.72903f, 17.8185f, 8.72479f, 15.5f, 8.72479f);
        this.f31330e.cubicTo(13.2709f, 8.72479f, 11.3786f, 9.29544f, 9.7618f, 10.4787f);
        this.f31330e.cubicTo(8.16845f, 11.6448f, 6.93225f, 13.3405f, 5.882f, 15.441f);
        this.f31330e.cubicTo(3.56342f, 20.0781f, 4.87009f, 27.1599f, 11.1554f, 32.9214f);
        this.f31330e.cubicTo(14.2733f, 35.7796f, 17.3937f, 37.5367f, 19.742f, 38.5813f);
        this.f31330e.cubicTo(20.9167f, 39.1038f, 21.9008f, 39.4492f, 22.5987f, 39.6655f);
        this.f31330e.cubicTo(22.9477f, 39.7737f, 23.2256f, 39.8498f, 23.4204f, 39.8997f);
        this.f31330e.cubicTo(23.5178f, 39.9246f, 23.5945f, 39.943f, 23.649f, 39.9557f);
        this.f31330e.cubicTo(23.6763f, 39.962f, 23.698f, 39.9668f, 23.7139f, 39.9704f);
        this.f31330e.lineTo(23.7335f, 39.9746f);
        this.f31330e.lineTo(23.7401f, 39.976f);
        this.f31330e.lineTo(23.7425f, 39.9765f);
        this.f31330e.lineTo(23.7436f, 39.9768f);
        this.f31330e.cubicTo(23.744f, 39.9768f, 23.7444f, 39.9769f, 24.0f, 38.7533f);
        this.f31330e.close();
        this.f31330e.moveTo(29.1708f, 35.3478f);
        this.f31330e.cubicTo(29.9019f, 34.3853f, 30.568f, 33.345f, 31.1621f, 32.2562f);
        this.f31330e.lineTo(33.7917f, 32.2562f);
        this.f31330e.cubicTo(32.1698f, 33.5747f, 30.5856f, 34.5834f, 29.1708f, 35.3478f);
        this.f31330e.close();
        this.f31330e.setFillType(Path.FillType.EVEN_ODD);
        this.f31329d.setStyle(Paint.Style.FILL);
        this.f31329d.setColor(-1);
        this.f30624a.add(this.f31329d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31330e, this.f31329d);
    }
}
