package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fw extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31483d;

    /* renamed from: e  reason: collision with root package name */
    Path f31484e;

    static {
        Covode.recordClassIndex(18294);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(48.0f, 24.0f);
        this.f30626c.cubicTo(48.0f, 37.2548f, 37.2548f, 48.0f, 24.0f, 48.0f);
        this.f30626c.cubicTo(10.7452f, 48.0f, 0.0f, 37.2548f, 0.0f, 24.0f);
        this.f30626c.cubicTo(0.0f, 10.7452f, 10.7452f, 0.0f, 24.0f, 0.0f);
        this.f30626c.cubicTo(37.2548f, 0.0f, 48.0f, 10.7452f, 48.0f, 24.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-119723);
        this.f31483d = new Paint();
        Path path = new Path();
        this.f31484e = path;
        path.moveTo(25.2375f, 11.7095f);
        this.f31484e.cubicTo(25.5814f, 11.7426f, 25.9157f, 11.9367f, 26.1018f, 12.2828f);
        this.f31484e.cubicTo(26.2485f, 12.5555f, 26.2726f, 12.8644f, 26.2824f, 13.0112f);
        this.f31484e.cubicTo(26.2956f, 13.2085f, 26.2943f, 13.4348f, 26.2873f, 13.6654f);
        this.f31484e.cubicTo(26.2766f, 14.0157f, 26.25f, 14.4439f, 26.2218f, 14.8983f);
        this.f31484e.cubicTo(26.213f, 15.0399f, 26.2041f, 15.184f, 26.1954f, 15.329f);
        this.f31484e.cubicTo(26.1198f, 16.5946f, 26.0605f, 18.0134f, 26.2125f, 19.1638f);
        this.f31484e.cubicTo(26.3648f, 20.3165f, 26.7756f, 21.68f, 27.2898f, 22.6001f);
        this.f31484e.cubicTo(27.443f, 22.8743f, 27.5852f, 23.0722f, 27.7056f, 23.2079f);
        this.f31484e.cubicTo(27.7078f, 23.1684f, 27.7101f, 23.1267f, 27.7126f, 23.0826f);
        this.f31484e.lineTo(27.7137f, 23.0609f);
        this.f31484e.cubicTo(27.7438f, 22.5133f, 27.7886f, 21.6979f, 28.0412f, 20.9401f);
        this.f31484e.cubicTo(28.3018f, 20.1583f, 29.0f, 19.0518f, 29.6151f, 18.2464f);
        this.f31484e.cubicTo(29.9282f, 17.8364f, 30.2692f, 17.4389f, 30.5789f, 17.1666f);
        this.f31484e.cubicTo(30.7177f, 17.0447f, 30.9367f, 16.8688f, 31.2019f, 16.7725f);
        this.f31484e.cubicTo(31.3389f, 16.7227f, 31.5857f, 16.6578f, 31.8775f, 16.7257f);
        this.f31484e.cubicTo(32.2162f, 16.8046f, 32.4639f, 17.0262f, 32.6018f, 17.2828f);
        this.f31484e.cubicTo(32.7802f, 17.6146f, 32.824f, 18.0284f, 32.8454f, 18.2937f);
        this.f31484e.cubicTo(32.8708f, 18.6098f, 32.8775f, 18.9814f, 32.8819f, 19.3496f);
        this.f31484e.cubicTo(32.8827f, 19.4173f, 32.8834f, 19.4853f, 32.8841f, 19.5535f);
        this.f31484e.cubicTo(32.8918f, 20.2597f, 32.8997f, 20.9864f, 32.9818f, 21.6297f);
        this.f31484e.cubicTo(33.0847f, 22.4353f, 33.3131f, 22.8558f, 33.6183f, 23.4176f);
        this.f31484e.cubicTo(33.72f, 23.6048f, 33.8303f, 23.8078f, 33.9473f, 24.046f);
        this.f31484e.cubicTo(34.4368f, 25.0427f, 34.7521f, 26.2204f, 34.4822f, 28.3802f);
        this.f31484e.cubicTo(33.9015f, 33.026f, 29.1404f, 36.2271f, 24.2348f, 36.2947f);
        this.f31484e.cubicTo(21.8911f, 36.3269f, 19.3852f, 35.6889f, 17.3734f, 34.3865f);
        this.f31484e.cubicTo(15.3472f, 33.0748f, 13.7822f, 31.0556f, 13.4903f, 28.364f);
        this.f31484e.cubicTo(13.2202f, 25.8737f, 13.7546f, 23.8499f, 14.4172f, 22.4796f);
        this.f31484e.cubicTo(14.7455f, 21.8006f, 15.1172f, 21.2575f, 15.4621f, 20.8912f);
        this.f31484e.cubicTo(15.6251f, 20.718f, 15.8309f, 20.5318f, 16.0663f, 20.4091f);
        this.f31484e.cubicTo(16.1784f, 20.3506f, 16.3812f, 20.2616f, 16.6381f, 20.2594f);
        this.f31484e.cubicTo(16.9462f, 20.2567f, 17.3101f, 20.3867f, 17.5449f, 20.7283f);
        this.f31484e.cubicTo(17.6594f, 20.8947f, 17.7275f, 21.0789f, 17.7663f, 21.1924f);
        this.f31484e.cubicTo(17.8118f, 21.3254f, 17.8533f, 21.4739f, 17.8914f, 21.6204f);
        this.f31484e.cubicTo(17.9334f, 21.7817f, 17.9817f, 21.9826f, 18.0317f, 22.1907f);
        this.f31484e.cubicTo(18.0674f, 22.3393f, 18.104f, 22.4915f, 18.1398f, 22.6357f);
        this.f31484e.cubicTo(18.328f, 23.3929f, 18.556f, 24.1835f, 18.8752f, 24.791f);
        this.f31484e.cubicTo(18.9278f, 24.8913f, 18.9802f, 24.9836f, 19.0317f, 25.0685f);
        this.f31484e.cubicTo(19.0184f, 24.5351f, 19.0042f, 23.8897f, 19.0135f, 23.1982f);
        this.f31484e.cubicTo(19.0377f, 21.4084f, 19.2169f, 19.1072f, 20.0914f, 17.3173f);
        this.f31484e.cubicTo(20.7039f, 16.0639f, 21.7526f, 14.6164f, 22.6684f, 13.5541f);
        this.f31484e.cubicTo(23.1262f, 13.023f, 23.5834f, 12.5501f, 23.9674f, 12.2327f);
        this.f31484e.cubicTo(24.1466f, 12.0846f, 24.3762f, 11.9138f, 24.622f, 11.8109f);
        this.f31484e.cubicTo(24.7388f, 11.7621f, 24.9631f, 11.683f, 25.2375f, 11.7095f);
        this.f31484e.close();
        this.f31484e.moveTo(19.0379f, 26.3946f);
        this.f31484e.cubicTo(19.0356f, 26.4115f, 19.0348f, 26.4088f, 19.0382f, 26.3921f);
        this.f31484e.cubicTo(19.0381f, 26.393f, 19.038f, 26.3938f, 19.0379f, 26.3946f);
        this.f31484e.close();
        this.f31484e.moveTo(19.7598f, 25.8907f);
        this.f31484e.cubicTo(19.7634f, 25.892f, 19.7653f, 25.8928f, 19.7653f, 25.8929f);
        this.f31484e.cubicTo(19.7653f, 25.893f, 19.7635f, 25.8924f, 19.7598f, 25.8907f);
        this.f31484e.close();
        this.f31484e.moveTo(27.9766f, 23.4354f);
        this.f31484e.cubicTo(27.9775f, 23.4357f, 27.978f, 23.4358f, 27.978f, 23.4358f);
        this.f31484e.lineTo(27.9766f, 23.4354f);
        this.f31484e.close();
        this.f31484e.moveTo(24.1832f, 14.8599f);
        this.f31484e.cubicTo(23.3314f, 15.848f, 22.3989f, 17.1505f, 21.8884f, 18.1954f);
        this.f31484e.cubicTo(21.2236f, 19.5559f, 21.0371f, 21.4662f, 21.0134f, 23.2252f);
        this.f31484e.cubicTo(21.0038f, 23.934f, 21.0202f, 24.5852f, 21.0343f, 25.1427f);
        this.f31484e.cubicTo(21.0373f, 25.2646f, 21.0403f, 25.3819f, 21.0428f, 25.4945f);
        this.f31484e.cubicTo(21.0498f, 25.7996f, 21.0541f, 26.0851f, 21.0464f, 26.3149f);
        this.f31484e.cubicTo(21.0425f, 26.4295f, 21.0351f, 26.5521f, 21.0191f, 26.6679f);
        this.f31484e.cubicTo(21.0071f, 26.7553f, 20.9767f, 26.9555f, 20.8707f, 27.1528f);
        this.f31484e.cubicTo(20.6317f, 27.5973f, 20.1978f, 27.8551f, 19.7157f, 27.8754f);
        this.f31484e.cubicTo(19.2974f, 27.8931f, 18.9258f, 27.7326f, 18.6475f, 27.5569f);
        this.f31484e.cubicTo(18.0792f, 27.1982f, 17.5425f, 26.5547f, 17.1046f, 25.7212f);
        this.f31484e.cubicTo(16.6971f, 24.9454f, 16.4319f, 24.0347f, 16.2438f, 23.2968f);
        this.f31484e.cubicTo(16.2351f, 23.3145f, 16.2264f, 23.3323f, 16.2177f, 23.3503f);
        this.f31484e.cubicTo(15.7041f, 24.4125f, 15.2523f, 26.0616f, 15.4787f, 28.1483f);
        this.f31484e.cubicTo(15.6926f, 30.1211f, 16.8284f, 31.6511f, 18.4602f, 32.7076f);
        this.f31484e.cubicTo(20.1064f, 33.7733f, 22.2159f, 34.3223f, 24.2073f, 34.2949f);
        this.f31484e.cubicTo(28.4512f, 34.2364f, 32.0783f, 31.4867f, 32.4976f, 28.1321f);
        this.f31484e.cubicTo(32.7238f, 26.3227f, 32.4541f, 25.5426f, 32.1521f, 24.9277f);
        this.f31484e.cubicTo(32.0883f, 24.7977f, 32.0122f, 24.6593f, 31.9298f, 24.5093f);
        this.f31484e.cubicTo(31.5943f, 23.8986f, 31.1528f, 23.0951f, 30.998f, 21.883f);
        this.f31484e.cubicTo(30.9143f, 21.2283f, 30.8958f, 20.5158f, 30.8878f, 19.8946f);
        this.f31484e.cubicTo(30.4395f, 20.5372f, 30.0633f, 21.1985f, 29.9386f, 21.5726f);
        this.f31484e.cubicTo(29.7808f, 22.0461f, 29.7418f, 22.6066f, 29.7095f, 23.1925f);
        this.f31484e.cubicTo(29.7086f, 23.2088f, 29.7077f, 23.2252f, 29.7068f, 23.2418f);
        this.f31484e.cubicTo(29.6931f, 23.4928f, 29.6774f, 23.7812f, 29.64f, 24.0211f);
        this.f31484e.cubicTo(29.6198f, 24.1513f, 29.5862f, 24.3177f, 29.5203f, 24.4832f);
        this.f31484e.cubicTo(29.4582f, 24.6394f, 29.3262f, 24.9004f, 29.0446f, 25.0882f);
        this.f31484e.cubicTo(28.7089f, 25.312f, 28.3244f, 25.441f, 27.9115f, 25.4324f);
        this.f31484e.cubicTo(27.5061f, 25.4239f, 27.1497f, 25.2846f, 26.8566f, 25.0984f);
        this.f31484e.cubicTo(26.2979f, 24.7435f, 25.868f, 24.1555f, 25.544f, 23.5758f);
        this.f31484e.cubicTo(24.8814f, 22.3902f, 24.4077f, 20.773f, 24.2297f, 19.4258f);
        this.f31484e.cubicTo(24.0492f, 18.0596f, 24.1243f, 16.4592f, 24.199f, 15.2097f);
        this.f31484e.cubicTo(24.2071f, 15.0728f, 24.2153f, 14.9408f, 24.2232f, 14.8138f);
        this.f31484e.cubicTo(24.2099f, 14.829f, 24.1966f, 14.8444f, 24.1832f, 14.8599f);
        this.f31484e.close();
        this.f31484e.moveTo(24.2784f, 13.0657f);
        this.f31484e.cubicTo(24.2785f, 13.0656f, 24.2792f, 13.0688f, 24.2802f, 13.0758f);
        this.f31484e.cubicTo(24.2788f, 13.0694f, 24.2783f, 13.0659f, 24.2784f, 13.0657f);
        this.f31484e.close();
        this.f31484e.setFillType(Path.FillType.EVEN_ODD);
        this.f31483d.setStyle(Paint.Style.FILL);
        this.f31483d.setColor(-1);
        this.f30624a.add(this.f31483d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31484e, this.f31483d);
    }
}
