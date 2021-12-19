package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class nt extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31744d;

    /* renamed from: e  reason: collision with root package name */
    Path f31745e;

    static {
        Covode.recordClassIndex(18507);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.3425f, 18.3801f);
        this.f30626c.cubicTo(24.6695f, 18.3801f, 24.9759f, 18.4855f, 25.2162f, 18.6644f);
        this.f30626c.lineTo(25.587f, 18.9802f);
        this.f30626c.cubicTo(26.6217f, 19.8159f, 27.9223f, 20.2692f, 29.2591f, 20.2692f);
        this.f30626c.cubicTo(30.5959f, 20.2692f, 31.8964f, 19.8159f, 32.931f, 18.9802f);
        this.f30626c.lineTo(33.165f, 18.7805f);
        this.f30626c.lineTo(33.3229f, 18.6477f);
        this.f30626c.cubicTo(33.5534f, 18.4816f, 33.8444f, 18.3837f, 34.155f, 18.3837f);
        this.f30626c.cubicTo(34.5275f, 18.3837f, 34.8718f, 18.5244f, 35.1173f, 18.7549f);
        this.f30626c.cubicTo(35.8547f, 19.4495f, 36.7687f, 19.9272f, 37.7547f, 20.1466f);
        this.f30626c.lineTo(38.0858f, 20.2101f);
        this.f30626c.lineTo(38.4464f, 20.2529f);
        this.f30626c.cubicTo(38.6617f, 20.2725f, 38.8775f, 20.2819f, 39.093f, 20.2816f);
        this.f30626c.cubicTo(40.0757f, 20.2231f, 41.0294f, 20.0489f, 41.7158f, 19.7591f);
        this.f30626c.lineTo(42.0009f, 19.6278f);
        this.f30626c.cubicTo(42.2374f, 19.5093f, 42.5252f, 19.6049f, 42.6437f, 19.8414f);
        this.f30626c.cubicTo(42.6771f, 19.908f, 42.6945f, 19.9815f, 42.6945f, 20.056f);
        this.f30626c.lineTo(42.6945f, 39.9427f);
        this.f30626c.cubicTo(42.6945f, 42.1863f, 40.8757f, 44.0051f, 38.6321f, 44.0051f);
        this.f30626c.lineTo(29.5712f, 44.004f);
        this.f30626c.cubicTo(28.8701f, 44.0039f, 28.3019f, 43.4356f, 28.3019f, 42.7345f);
        this.f30626c.lineTo(28.3019f, 32.8901f);
        this.f30626c.cubicTo(28.3019f, 32.4448f, 28.3019f, 32.0174f, 28.3019f, 31.6202f);
        this.f30626c.cubicTo(28.3019f, 30.218f, 27.1651f, 29.0816f, 25.7628f, 29.0816f);
        this.f30626c.lineTo(23.426f, 29.0816f);
        this.f30626c.cubicTo(22.0238f, 29.0816f, 20.887f, 30.218f, 20.887f, 31.6202f);
        this.f30626c.cubicTo(20.887f, 32.0174f, 20.887f, 32.4448f, 20.887f, 32.8901f);
        this.f30626c.lineTo(20.8864f, 42.7346f);
        this.f30626c.cubicTo(20.8863f, 43.4356f, 20.3181f, 44.0039f, 19.617f, 44.004f);
        this.f30626c.lineTo(10.587f, 44.0051f);
        this.f30626c.cubicTo(8.3434f, 44.0051f, 6.52457f, 42.1863f, 6.52457f, 39.9427f);
        this.f30626c.lineTo(6.52457f, 20.4454f);
        this.f30626c.cubicTo(6.52449f, 20.0489f, 6.84592f, 19.7274f, 7.24243f, 19.7274f);
        this.f30626c.cubicTo(7.30609f, 19.7274f, 7.36932f, 19.7359f, 7.43049f, 19.7525f);
        this.f30626c.lineTo(7.52049f, 19.7835f);
        this.f30626c.cubicTo(8.09608f, 20.0252f, 8.35751f, 20.1826f, 9.19814f, 20.2554f);
        this.f30626c.lineTo(9.56003f, 20.2811f);
        this.f30626c.lineTo(9.89405f, 20.2756f);
        this.f30626c.lineTo(10.2279f, 20.2539f);
        this.f30626c.lineTo(10.561f, 20.2158f);
        this.f30626c.lineTo(10.9303f, 20.1466f);
        this.f30626c.cubicTo(11.9163f, 19.9272f, 12.8303f, 19.4495f, 13.5677f, 18.7549f);
        this.f30626c.cubicTo(13.8133f, 18.5244f, 14.1575f, 18.3837f, 14.5299f, 18.3837f);
        this.f30626c.cubicTo(14.8405f, 18.3837f, 15.1315f, 18.4816f, 15.3621f, 18.6477f);
        this.f30626c.lineTo(15.4928f, 18.7554f);
        this.f30626c.lineTo(15.7539f, 18.9802f);
        this.f30626c.cubicTo(16.7886f, 19.8159f, 18.0892f, 20.2692f, 19.426f, 20.2692f);
        this.f30626c.cubicTo(20.7627f, 20.2692f, 22.0633f, 19.8159f, 23.0979f, 18.9802f);
        this.f30626c.lineTo(23.4688f, 18.6644f);
        this.f30626c.cubicTo(23.709f, 18.4855f, 24.0154f, 18.3801f, 24.3425f, 18.3801f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31744d = new Paint();
        Path path = new Path();
        this.f31745e = path;
        path.moveTo(37.9448f, 2.57513f);
        this.f31745e.cubicTo(38.781f, 2.57666f, 39.6034f, 2.79962f, 40.3225f, 3.22294f);
        this.f31745e.lineTo(40.5958f, 3.39692f);
        this.f31745e.cubicTo(41.5158f, 4.12525f, 41.8823f, 4.728f, 42.3336f, 5.70273f);
        this.f31745e.lineTo(44.2963f, 9.85696f);
        this.f31745e.cubicTo(44.7224f, 10.9431f, 44.7745f, 12.1359f, 44.4428f, 13.2549f);
        this.f31745e.cubicTo(44.1248f, 14.3275f, 43.8103f, 14.9975f, 42.5946f, 15.9527f);
        this.f31745e.cubicTo(41.379f, 16.908f, 39.5309f, 17.0427f, 39.093f, 17.0427f);
        this.f31745e.cubicTo(38.8886f, 17.0427f, 38.6617f, 17.0339f, 38.4464f, 17.0143f);
        this.f31745e.lineTo(38.0858f, 16.9715f);
        this.f31745e.cubicTo(36.974f, 16.792f, 35.9367f, 16.288f, 35.1173f, 15.5163f);
        this.f31745e.cubicTo(34.8718f, 15.2857f, 34.5275f, 15.1451f, 34.155f, 15.1451f);
        this.f31745e.cubicTo(33.8444f, 15.1451f, 33.5534f, 15.2429f, 33.3229f, 15.4091f);
        this.f31745e.lineTo(33.1649f, 15.5419f);
        this.f31745e.cubicTo(32.0963f, 16.5049f, 30.6987f, 17.0306f, 29.2591f, 17.0306f);
        this.f31745e.cubicTo(27.9223f, 17.0306f, 26.6217f, 16.5773f, 25.587f, 15.7415f);
        this.f31745e.lineTo(25.3306f, 15.5212f);
        this.f31745e.cubicTo(25.0774f, 15.285f, 24.724f, 15.1415f, 24.3425f, 15.1415f);
        this.f31745e.cubicTo(24.0154f, 15.1415f, 23.709f, 15.2469f, 23.4688f, 15.4258f);
        this.f31745e.lineTo(23.3319f, 15.5419f);
        this.f31745e.cubicTo(22.2632f, 16.5049f, 20.8655f, 17.0306f, 19.426f, 17.0306f);
        this.f31745e.cubicTo(18.0892f, 17.0306f, 16.7886f, 16.5773f, 15.7539f, 15.7415f);
        this.f31745e.lineTo(15.4928f, 15.5168f);
        this.f31745e.cubicTo(15.2471f, 15.286f, 14.9026f, 15.1451f, 14.5299f, 15.1451f);
        this.f31745e.cubicTo(14.1575f, 15.1451f, 13.8132f, 15.2857f, 13.5677f, 15.5163f);
        this.f31745e.cubicTo(12.8303f, 16.2109f, 11.9162f, 16.6885f, 10.9303f, 16.908f);
        this.f31745e.lineTo(10.561f, 16.9772f);
        this.f31745e.cubicTo(10.3394f, 17.008f, 10.1167f, 17.028f, 9.89404f, 17.037f);
        this.f31745e.cubicTo(9.89404f, 17.037f, 9.6904f, 17.0468f, 9.56001f, 17.0425f);
        this.f31745e.cubicTo(8.65845f, 17.0044f, 7.24017f, 16.6787f, 6.40418f, 16.0125f);
        this.f31745e.cubicTo(5.39683f, 15.2098f, 4.94f, 14.0965f, 4.68057f, 13.2005f);
        this.f31745e.cubicTo(4.42115f, 12.3044f, 4.50984f, 10.6491f, 4.86839f, 9.75477f);
        this.f31745e.lineTo(6.53703f, 5.71631f);
        this.f31745e.cubicTo(6.99503f, 4.64642f, 7.33162f, 4.17862f, 8.041f, 3.57349f);
        this.f31745e.lineTo(8.28793f, 3.39101f);
        this.f31745e.cubicTo(9.06626f, 2.85879f, 9.98958f, 2.57685f, 10.9303f, 2.57513f);
        this.f31745e.lineTo(37.9448f, 2.57513f);
        this.f31745e.close();
        this.f31745e.setFillType(Path.FillType.EVEN_ODD);
        this.f31744d.setStyle(Paint.Style.FILL);
        this.f31744d.setColor(-16777216);
        this.f30624a.add(this.f31744d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31745e, this.f31744d);
    }
}
