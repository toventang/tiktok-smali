package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class y extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31780d;

    /* renamed from: e  reason: collision with root package name */
    Path f31781e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31782f;

    /* renamed from: g  reason: collision with root package name */
    Path f31783g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31784h;

    /* renamed from: i  reason: collision with root package name */
    Path f31785i;

    static {
        Covode.recordClassIndex(18576);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(25.9945f, 24.704f);
        this.f30626c.lineTo(25.9872f, 24.7169f);
        this.f30626c.lineTo(25.9848f, 24.721f);
        this.f30626c.cubicTo(25.9763f, 24.736f, 25.967f, 24.7531f, 25.9572f, 24.7723f);
        this.f30626c.cubicTo(25.9378f, 24.8106f, 25.9159f, 24.8583f, 25.8948f, 24.9146f);
        this.f30626c.cubicTo(25.8533f, 25.0255f, 25.8107f, 25.1811f, 25.8033f, 25.3693f);
        this.f30626c.cubicTo(25.7867f, 25.7892f, 25.9514f, 26.2383f, 26.3598f, 26.5987f);
        this.f30626c.cubicTo(26.7278f, 26.9235f, 27.252f, 27.1415f, 27.9211f, 27.2854f);
        this.f30626c.cubicTo(28.6028f, 27.432f, 29.5181f, 27.519f, 30.75f, 27.519f);
        this.f30626c.cubicTo(33.1003f, 27.519f, 34.7264f, 26.2108f, 35.7179f, 25.009f);
        this.f30626c.cubicTo(36.2163f, 24.4048f, 36.5748f, 23.8052f, 36.8088f, 23.3581f);
        this.f30626c.cubicTo(36.9264f, 23.1334f, 37.0141f, 22.9442f, 37.0736f, 22.808f);
        this.f30626c.cubicTo(37.1034f, 22.7399f, 37.1262f, 22.6848f, 37.1423f, 22.6449f);
        this.f30626c.lineTo(37.153f, 22.6181f);
        this.f30626c.cubicTo(37.168f, 22.5848f, 37.1839f, 22.5452f, 37.199f, 22.5f);
        this.f30626c.cubicTo(37.2326f, 22.3995f, 37.2652f, 22.2612f, 37.2672f, 22.0955f);
        this.f30626c.cubicTo(37.2718f, 21.7265f, 37.1226f, 21.3384f, 36.7796f, 21.0305f);
        this.f30626c.cubicTo(36.4717f, 20.7542f, 36.0535f, 20.582f, 35.5625f, 20.4728f);
        this.f30626c.cubicTo(35.0611f, 20.3612f, 34.4053f, 20.2982f, 33.5449f, 20.2982f);
        this.f30626c.cubicTo(30.9727f, 20.2982f, 29.0749f, 21.4158f, 27.842f, 22.5057f);
        this.f30626c.cubicTo(27.2263f, 23.05f, 26.7686f, 23.5934f, 26.4631f, 24.003f);
        this.f30626c.cubicTo(26.3099f, 24.2085f, 26.1937f, 24.382f, 26.1138f, 24.5076f);
        this.f30626c.cubicTo(26.0739f, 24.5705f, 26.0429f, 24.6215f, 26.0209f, 24.6587f);
        this.f30626c.cubicTo(26.0099f, 24.6773f, 26.0011f, 24.6925f, 25.9945f, 24.704f);
        this.f30626c.close();
        this.f30626c.moveTo(35.1423f, 22.361f);
        this.f30626c.lineTo(35.146f, 22.3618f);
        this.f30626c.cubicTo(35.1299f, 22.3937f, 35.1129f, 22.4268f, 35.0949f, 22.4612f);
        this.f30626c.cubicTo(34.9053f, 22.8234f, 34.6176f, 23.303f, 34.2258f, 23.778f);
        this.f30626c.cubicTo(33.4367f, 24.7345f, 32.3058f, 25.5846f, 30.75f, 25.5846f);
        this.f30626c.cubicTo(29.5964f, 25.5846f, 28.8288f, 25.502f, 28.3278f, 25.3943f);
        this.f30626c.cubicTo(28.1556f, 25.3572f, 28.0233f, 25.319f, 27.9229f, 25.284f);
        this.f30626c.cubicTo(27.9509f, 25.2448f, 27.9811f, 25.2032f, 28.0137f, 25.1595f);
        this.f30626c.cubicTo(28.2578f, 24.8323f, 28.6275f, 24.3932f, 29.1232f, 23.955f);
        this.f30626c.cubicTo(30.1131f, 23.0799f, 31.5738f, 22.2325f, 33.5449f, 22.2325f);
        this.f30626c.cubicTo(34.3232f, 22.2325f, 34.8266f, 22.2907f, 35.1423f, 22.361f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31780d = new Paint();
        Path path = new Path();
        this.f31781e = path;
        path.moveTo(21.5125f, 24.7169f);
        this.f31781e.lineTo(21.5052f, 24.704f);
        this.f31781e.cubicTo(21.4986f, 24.6925f, 21.4898f, 24.6773f, 21.4788f, 24.6587f);
        this.f31781e.cubicTo(21.4568f, 24.6215f, 21.4259f, 24.5705f, 21.3859f, 24.5076f);
        this.f31781e.cubicTo(21.306f, 24.382f, 21.1898f, 24.2085f, 21.0366f, 24.003f);
        this.f31781e.cubicTo(20.7311f, 23.5934f, 20.2734f, 23.05f, 19.6577f, 22.5057f);
        this.f31781e.cubicTo(18.4248f, 21.4158f, 16.527f, 20.2982f, 13.9548f, 20.2982f);
        this.f31781e.cubicTo(13.0944f, 20.2982f, 12.4386f, 20.3612f, 11.9372f, 20.4728f);
        this.f31781e.cubicTo(11.4462f, 20.582f, 11.028f, 20.7542f, 10.7201f, 21.0305f);
        this.f31781e.cubicTo(10.3771f, 21.3384f, 10.2279f, 21.7265f, 10.2325f, 22.0955f);
        this.f31781e.cubicTo(10.2345f, 22.2612f, 10.2671f, 22.3995f, 10.3007f, 22.5f);
        this.f31781e.cubicTo(10.3158f, 22.5452f, 10.3317f, 22.5848f, 10.3467f, 22.6181f);
        this.f31781e.lineTo(10.3574f, 22.6449f);
        this.f31781e.cubicTo(10.3735f, 22.6848f, 10.3963f, 22.7399f, 10.4261f, 22.808f);
        this.f31781e.cubicTo(10.4856f, 22.9442f, 10.5733f, 23.1334f, 10.6909f, 23.3581f);
        this.f31781e.cubicTo(10.9249f, 23.8052f, 11.2834f, 24.4048f, 11.7818f, 25.009f);
        this.f31781e.cubicTo(12.7733f, 26.2108f, 14.3994f, 27.519f, 16.7497f, 27.519f);
        this.f31781e.cubicTo(17.9816f, 27.519f, 18.8969f, 27.432f, 19.5786f, 27.2854f);
        this.f31781e.cubicTo(20.2477f, 27.1415f, 20.7719f, 26.9235f, 21.1399f, 26.5987f);
        this.f31781e.cubicTo(21.5483f, 26.2383f, 21.713f, 25.7892f, 21.6964f, 25.3693f);
        this.f31781e.cubicTo(21.689f, 25.1811f, 21.6464f, 25.0255f, 21.6049f, 24.9146f);
        this.f31781e.cubicTo(21.5838f, 24.8583f, 21.562f, 24.8106f, 21.5425f, 24.7723f);
        this.f31781e.cubicTo(21.5328f, 24.7531f, 21.5234f, 24.736f, 21.5149f, 24.721f);
        this.f31781e.lineTo(21.5125f, 24.7169f);
        this.f31781e.close();
        this.f31781e.moveTo(12.3537f, 22.3618f);
        this.f31781e.lineTo(12.3574f, 22.361f);
        this.f31781e.cubicTo(12.6731f, 22.2907f, 13.1765f, 22.2325f, 13.9548f, 22.2325f);
        this.f31781e.cubicTo(15.9259f, 22.2325f, 17.3866f, 23.0799f, 18.3765f, 23.955f);
        this.f31781e.cubicTo(18.8722f, 24.3932f, 19.2419f, 24.8323f, 19.486f, 25.1595f);
        this.f31781e.cubicTo(19.5186f, 25.2032f, 19.5488f, 25.2448f, 19.5768f, 25.284f);
        this.f31781e.cubicTo(19.4764f, 25.319f, 19.3441f, 25.3572f, 19.1719f, 25.3943f);
        this.f31781e.cubicTo(18.6709f, 25.502f, 17.9033f, 25.5846f, 16.7497f, 25.5846f);
        this.f31781e.cubicTo(15.1939f, 25.5846f, 14.063f, 24.7345f, 13.2739f, 23.778f);
        this.f31781e.cubicTo(12.8821f, 23.303f, 12.5944f, 22.8234f, 12.4048f, 22.4612f);
        this.f31781e.cubicTo(12.3868f, 22.4268f, 12.3698f, 22.3937f, 12.3537f, 22.3618f);
        this.f31781e.close();
        this.f31781e.setFillType(Path.FillType.EVEN_ODD);
        this.f31780d.setStyle(Paint.Style.FILL);
        this.f31780d.setColor(-16777216);
        this.f30624a.add(this.f31780d);
        this.f31782f = new Paint();
        Path path2 = new Path();
        this.f31783g = path2;
        path2.moveTo(4.40614f, 15.9672f);
        this.f31783g.lineTo(3.44723f, 16.0935f);
        this.f31783g.cubicTo(3.40612f, 15.7814f, 3.51949f, 15.4688f, 3.75112f, 15.2556f);
        this.f31783g.cubicTo(3.98269f, 15.0424f, 4.30349f, 14.9553f, 4.61108f, 15.022f);
        this.f31783g.lineTo(4.61243f, 15.0223f);
        this.f31783g.lineTo(4.61991f, 15.0239f);
        this.f31783g.lineTo(4.65359f, 15.0309f);
        this.f31783g.cubicTo(4.68428f, 15.0373f, 4.73131f, 15.0469f, 4.79396f, 15.0594f);
        this.f31783g.cubicTo(4.91929f, 15.0842f, 5.10708f, 15.1202f, 5.35166f, 15.1636f);
        this.f31783g.cubicTo(5.84089f, 15.2505f, 6.5568f, 15.3671f, 7.4539f, 15.4839f);
        this.f31783g.cubicTo(9.24934f, 15.7177f, 11.7639f, 15.9516f, 14.6354f, 15.9516f);
        this.f31783g.cubicTo(17.6691f, 15.9516f, 20.0478f, 16.4694f, 21.681f, 16.9954f);
        this.f31783g.cubicTo(22.4972f, 17.2583f, 23.1269f, 17.5232f, 23.5591f, 17.7263f);
        this.f31783g.cubicTo(23.7376f, 17.8101f, 23.8824f, 17.8835f, 23.9929f, 17.9419f);
        this.f31783g.cubicTo(24.0061f, 17.9356f, 24.0196f, 17.9293f, 24.0333f, 17.9228f);
        this.f31783g.cubicTo(24.4578f, 17.7234f, 25.0789f, 17.462f, 25.8856f, 17.2021f);
        this.f31783g.cubicTo(27.4997f, 16.6823f, 29.856f, 16.1688f, 32.8646f, 16.1688f);
        this.f31783g.cubicTo(35.7475f, 16.1688f, 38.2717f, 15.934f, 40.0742f, 15.6993f);
        this.f31783g.cubicTo(40.9749f, 15.582f, 41.6942f, 15.4648f, 42.1863f, 15.3774f);
        this.f31783g.cubicTo(42.4324f, 15.3337f, 42.6216f, 15.2975f, 42.7483f, 15.2724f);
        this.f31783g.cubicTo(42.8116f, 15.2598f, 42.8593f, 15.2501f, 42.8906f, 15.2436f);
        this.f31783g.lineTo(42.9252f, 15.2363f);
        this.f31783g.lineTo(42.9332f, 15.2346f);
        this.f31783g.lineTo(42.9348f, 15.2343f);
        this.f31783g.lineTo(43.8375f, 16.0651f);
        this.f31783g.lineTo(43.0939f, 15.9672f);
        this.f31783g.cubicTo(43.8375f, 16.0651f, 43.8375f, 16.0649f, 43.8375f, 16.0651f);
        this.f31783g.lineTo(43.8373f, 16.0662f);
        this.f31783g.lineTo(43.8362f, 16.0748f);
        this.f31783g.lineTo(43.833f, 16.0979f);
        this.f31783g.cubicTo(43.8302f, 16.1178f, 43.8261f, 16.1465f, 43.8207f, 16.1836f);
        this.f31783g.cubicTo(43.8097f, 16.2577f, 43.7932f, 16.3654f, 43.7705f, 16.503f);
        this.f31783g.cubicTo(43.7251f, 16.7781f, 43.6549f, 17.1735f, 43.5544f, 17.6605f);
        this.f31783g.cubicTo(43.3538f, 18.6338f, 43.0319f, 19.9782f, 42.5461f, 21.4648f);
        this.f31783g.cubicTo(41.5828f, 24.412f, 39.9397f, 28.0306f, 37.2223f, 30.3696f);
        this.f31783g.cubicTo(34.4129f, 32.7877f, 30.8898f, 32.8394f, 28.1884f, 32.3511f);
        this.f31783g.cubicTo(26.827f, 32.1051f, 25.6375f, 31.7163f, 24.7895f, 31.3901f);
        this.f31783g.cubicTo(24.4844f, 31.2728f, 24.2223f, 31.163f, 24.0108f, 31.0702f);
        this.f31783g.cubicTo(23.9543f, 31.0973f, 23.8855f, 31.1297f, 23.8052f, 31.1666f);
        this.f31783g.cubicTo(23.5641f, 31.2771f, 23.2182f, 31.4276f, 22.7885f, 31.5928f);
        this.f31783g.cubicTo(21.9315f, 31.9224f, 20.7286f, 32.3158f, 19.3503f, 32.5649f);
        this.f31783g.cubicTo(16.6212f, 33.0582f, 13.0177f, 33.0145f, 10.1361f, 30.5342f);
        this.f31783g.cubicTo(7.37289f, 28.1559f, 5.71446f, 24.4909f, 4.74751f, 21.5323f);
        this.f31783g.cubicTo(4.25853f, 20.0362f, 3.93471f, 18.6836f, 3.73285f, 17.7044f);
        this.f31783g.cubicTo(3.6318f, 17.2142f, 3.56101f, 16.816f, 3.51519f, 16.5383f);
        this.f31783g.cubicTo(3.49228f, 16.3995f, 3.4756f, 16.2906f, 3.46449f, 16.2153f);
        this.f31783g.cubicTo(3.45894f, 16.1776f, 3.45478f, 16.1484f, 3.45193f, 16.1279f);
        this.f31783g.lineTo(3.44863f, 16.1039f);
        this.f31783g.lineTo(3.4474f, 16.0948f);
        this.f31783g.cubicTo(3.44736f, 16.0945f, 3.44723f, 16.0935f, 4.40614f, 15.9672f);
        this.f31783g.close();
        this.f31783g.moveTo(24.7172f, 29.7417f);
        this.f31783g.cubicTo(24.8898f, 29.8159f, 25.0948f, 29.9004f, 25.3279f, 29.9901f);
        this.f31783g.cubicTo(26.1143f, 30.2925f, 27.2107f, 30.6501f, 28.4552f, 30.8751f);
        this.f31783g.cubicTo(30.9654f, 31.3288f, 33.9338f, 31.2209f, 36.2437f, 29.2327f);
        this.f31783g.cubicTo(38.6455f, 27.1655f, 40.1829f, 23.8671f, 41.1203f, 20.9989f);
        this.f31783g.cubicTo(41.5847f, 19.5778f, 41.8932f, 18.2898f, 42.0853f, 17.3577f);
        this.f31783g.cubicTo(42.119f, 17.1942f, 42.1491f, 17.0418f, 42.1758f, 16.9018f);
        this.f31783g.cubicTo(41.6857f, 16.9853f, 41.0408f, 17.0861f, 40.2679f, 17.1867f);
        this.f31783g.cubicTo(38.4169f, 17.4278f, 35.8264f, 17.6688f, 32.8646f, 17.6688f);
        this.f31783g.cubicTo(30.0286f, 17.6688f, 27.8276f, 18.1525f, 26.3455f, 18.6299f);
        this.f31783g.cubicTo(25.6342f, 18.859f, 25.0882f, 19.0867f, 24.7172f, 19.2589f);
        this.f31783g.lineTo(24.7172f, 29.7417f);
        this.f31783g.close();
        this.f31783g.moveTo(22.7364f, 19.477f);
        this.f31783g.lineTo(22.7828f, 19.4989f);
        this.f31783g.lineTo(22.7828f, 29.5049f);
        this.f31783g.cubicTo(22.5963f, 29.5865f, 22.3645f, 29.6834f, 22.0941f, 29.7874f);
        this.f31783g.cubicTo(21.3167f, 30.0864f, 20.2338f, 30.4395f, 19.0062f, 30.6613f);
        this.f31783g.cubicTo(16.5236f, 31.11f, 13.6356f, 30.9941f, 11.398f, 29.0681f);
        this.f31783g.cubicTo(9.04187f, 27.0402f, 7.51986f, 23.7882f, 6.58619f, 20.9314f);
        this.f31783g.cubicTo(6.12486f, 19.5198f, 5.81833f, 18.24f, 5.62741f, 17.3139f);
        this.f31783g.cubicTo(5.61713f, 17.264f, 5.6072f, 17.2152f, 5.59759f, 17.1675f);
        this.f31783g.cubicTo(6.04129f, 17.2398f, 6.58138f, 17.321f, 7.20409f, 17.4021f);
        this.f31783g.cubicTo(9.06209f, 17.6441f, 11.6621f, 17.886f, 14.6354f, 17.886f);
        this.f31783g.cubicTo(17.4464f, 17.886f, 19.625f, 18.3655f, 21.0879f, 18.8367f);
        this.f31783g.cubicTo(21.8198f, 19.0724f, 22.3728f, 19.3061f, 22.7364f, 19.477f);
        this.f31783g.close();
        this.f31783g.setFillType(Path.FillType.EVEN_ODD);
        this.f31782f.setStyle(Paint.Style.FILL);
        this.f31782f.setColor(-16777216);
        this.f30624a.add(this.f31782f);
        this.f31784h = new Paint();
        Path path3 = new Path();
        this.f31785i = path3;
        path3.moveTo(43.8375f, 16.0651f);
        this.f31785i.lineTo(42.9348f, 15.2343f);
        this.f31785i.cubicTo(43.1733f, 15.1825f, 43.4222f, 15.2501f, 43.6018f, 15.4154f);
        this.f31785i.cubicTo(43.7814f, 15.5807f, 43.8693f, 15.8231f, 43.8375f, 16.0651f);
        this.f31785i.close();
        this.f31785i.setFillType(Path.FillType.WINDING);
        this.f31784h.setStyle(Paint.Style.FILL);
        this.f31784h.setColor(-16777216);
        this.f30624a.add(this.f31784h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31781e, this.f31780d);
        canvas.drawPath(this.f31783g, this.f31782f);
        canvas.drawPath(this.f31785i, this.f31784h);
    }
}
