package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ge extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31523d;

    /* renamed from: e  reason: collision with root package name */
    Path f31524e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31525f;

    /* renamed from: g  reason: collision with root package name */
    Path f31526g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31527h;

    /* renamed from: i  reason: collision with root package name */
    Path f31528i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31529j;

    /* renamed from: k  reason: collision with root package name */
    Path f31530k;

    /* renamed from: l  reason: collision with root package name */
    Paint f31531l;

    /* renamed from: m  reason: collision with root package name */
    Path f31532m;

    static {
        Covode.recordClassIndex(18303);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(4.0f, 9.0f);
        this.f30626c.cubicTo(4.0f, 6.23858f, 6.23858f, 4.0f, 9.0f, 4.0f);
        this.f30626c.lineTo(39.0f, 4.0f);
        this.f30626c.cubicTo(41.7614f, 4.0f, 44.0f, 6.23858f, 44.0f, 9.0f);
        this.f30626c.lineTo(44.0f, 39.0f);
        this.f30626c.cubicTo(44.0f, 41.7614f, 41.7614f, 44.0f, 39.0f, 44.0f);
        this.f30626c.lineTo(9.0f, 44.0f);
        this.f30626c.cubicTo(6.23858f, 44.0f, 4.0f, 41.7614f, 4.0f, 39.0f);
        this.f30626c.lineTo(4.0f, 9.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16729856);
        this.f31523d = new Paint();
        Path path = new Path();
        this.f31524e = path;
        path.moveTo(38.9999f, 22.5737f);
        this.f31524e.cubicTo(38.9999f, 15.8617f, 32.2712f, 10.4011f, 23.9998f, 10.4011f);
        this.f31524e.cubicTo(15.7295f, 10.4011f, 9.0f, 15.8617f, 9.0f, 22.5737f);
        this.f31524e.cubicTo(9.0f, 28.591f, 14.3364f, 33.6303f, 21.5447f, 34.5833f);
        this.f31524e.cubicTo(22.0332f, 34.6885f, 22.698f, 34.9053f, 22.8663f, 35.3228f);
        this.f31524e.cubicTo(23.0175f, 35.7021f, 22.9652f, 36.2962f, 22.9146f, 36.6792f);
        this.f31524e.cubicTo(22.9146f, 36.6792f, 22.7386f, 37.7377f, 22.7006f, 37.9631f);
        this.f31524e.cubicTo(22.6354f, 38.3424f, 22.3993f, 39.4463f, 23.9998f, 38.7717f);
        this.f31524e.cubicTo(25.6009f, 38.0971f, 32.6384f, 33.6852f, 35.7853f, 30.063f);
        this.f31524e.lineTo(35.7848f, 30.063f);
        this.f31524e.cubicTo(37.9586f, 27.6792f, 38.9999f, 25.26f, 38.9999f, 22.5737f);
        this.f31524e.close();
        this.f31524e.setFillType(Path.FillType.WINDING);
        this.f31523d.setStyle(Paint.Style.FILL);
        this.f31523d.setColor(-1);
        this.f30624a.add(this.f31523d);
        this.f31525f = new Paint();
        Path path2 = new Path();
        this.f31526g = path2;
        path2.moveTo(20.953f, 19.3304f);
        this.f31526g.lineTo(19.9008f, 19.3304f);
        this.f31526g.cubicTo(19.7395f, 19.3304f, 19.6084f, 19.4612f, 19.6084f, 19.622f);
        this.f31526g.lineTo(19.6084f, 26.158f);
        this.f31526g.cubicTo(19.6084f, 26.319f, 19.7395f, 26.4496f, 19.9008f, 26.4496f);
        this.f31526g.lineTo(20.953f, 26.4496f);
        this.f31526g.cubicTo(21.1143f, 26.4496f, 21.2451f, 26.319f, 21.2451f, 26.158f);
        this.f31526g.lineTo(21.2451f, 19.622f);
        this.f31526g.cubicTo(21.2451f, 19.4612f, 21.1143f, 19.3304f, 20.953f, 19.3304f);
        this.f31526g.close();
        this.f31526g.setFillType(Path.FillType.WINDING);
        this.f31525f.setStyle(Paint.Style.FILL);
        this.f31525f.setColor(-16729856);
        this.f30624a.add(this.f31525f);
        this.f31527h = new Paint();
        Path path3 = new Path();
        this.f31528i = path3;
        path3.moveTo(28.1938f, 19.3304f);
        this.f31528i.lineTo(27.1417f, 19.3304f);
        this.f31528i.cubicTo(26.9804f, 19.3304f, 26.8495f, 19.4612f, 26.8495f, 19.622f);
        this.f31528i.lineTo(26.8495f, 23.505f);
        this.f31528i.lineTo(23.8544f, 19.4601f);
        this.f31528i.cubicTo(23.8475f, 19.4497f, 23.8397f, 19.4399f, 23.8317f, 19.4304f);
        this.f31528i.lineTo(23.8297f, 19.4287f);
        this.f31528i.cubicTo(23.8239f, 19.4221f, 23.8182f, 19.4164f, 23.8121f, 19.4106f);
        this.f31528i.cubicTo(23.8104f, 19.4089f, 23.8087f, 19.4074f, 23.8067f, 19.4057f);
        this.f31528i.cubicTo(23.8018f, 19.4011f, 23.7966f, 19.3968f, 23.7912f, 19.3928f);
        this.f31528i.cubicTo(23.7889f, 19.3905f, 23.7863f, 19.3888f, 23.7837f, 19.3867f);
        this.f31528i.cubicTo(23.7785f, 19.3833f, 23.7736f, 19.3796f, 23.7684f, 19.3764f);
        this.f31528i.cubicTo(23.7656f, 19.3744f, 23.7627f, 19.3726f, 23.7595f, 19.3712f);
        this.f31528i.cubicTo(23.7543f, 19.368f, 23.7492f, 19.3649f, 23.744f, 19.3623f);
        this.f31528i.cubicTo(23.7408f, 19.3609f, 23.738f, 19.3591f, 23.7348f, 19.358f);
        this.f31528i.cubicTo(23.7293f, 19.3554f, 23.7239f, 19.3528f, 23.7181f, 19.3508f);
        this.f31528i.cubicTo(23.7147f, 19.3496f, 23.7118f, 19.3485f, 23.7086f, 19.3473f);
        this.f31528i.cubicTo(23.7029f, 19.3453f, 23.6971f, 19.3433f, 23.6911f, 19.3419f);
        this.f31528i.cubicTo(23.6879f, 19.3407f, 23.6845f, 19.3402f, 23.681f, 19.339f);
        this.f31528i.cubicTo(23.6753f, 19.3379f, 23.6698f, 19.3364f, 23.6643f, 19.3353f);
        this.f31528i.cubicTo(23.6603f, 19.3347f, 23.656f, 19.3341f, 23.652f, 19.3338f);
        this.f31528i.cubicTo(23.6468f, 19.3327f, 23.6416f, 19.3324f, 23.6364f, 19.3318f);
        this.f31528i.cubicTo(23.6316f, 19.3312f, 23.6267f, 19.3312f, 23.6215f, 19.331f);
        this.f31528i.cubicTo(23.6178f, 19.331f, 23.6149f, 19.3304f, 23.6111f, 19.3304f);
        this.f31528i.lineTo(22.5593f, 19.3304f);
        this.f31528i.cubicTo(22.398f, 19.3304f, 22.2668f, 19.4612f, 22.2668f, 19.622f);
        this.f31528i.lineTo(22.2668f, 26.158f);
        this.f31528i.cubicTo(22.2668f, 26.319f, 22.398f, 26.4496f, 22.5593f, 26.4496f);
        this.f31528i.lineTo(23.6111f, 26.4496f);
        this.f31528i.cubicTo(23.7727f, 26.4496f, 23.9036f, 26.319f, 23.9036f, 26.158f);
        this.f31528i.lineTo(23.9036f, 22.276f);
        this.f31528i.lineTo(26.9024f, 26.3262f);
        this.f31528i.cubicTo(26.9231f, 26.3555f, 26.9487f, 26.3794f, 26.9766f, 26.3984f);
        this.f31528i.cubicTo(26.9775f, 26.3989f, 26.9786f, 26.3998f, 26.9795f, 26.4007f);
        this.f31528i.cubicTo(26.9855f, 26.4044f, 26.9916f, 26.4081f, 26.9976f, 26.4116f);
        this.f31528i.cubicTo(27.0005f, 26.4133f, 27.0031f, 26.4145f, 27.006f, 26.4159f);
        this.f31528i.cubicTo(27.0103f, 26.4185f, 27.0152f, 26.4208f, 27.0198f, 26.4228f);
        this.f31528i.cubicTo(27.0247f, 26.4248f, 27.029f, 26.4268f, 27.0341f, 26.4289f);
        this.f31528i.cubicTo(27.037f, 26.43f, 27.0399f, 26.4312f, 27.0428f, 26.432f);
        this.f31528i.cubicTo(27.0497f, 26.4346f, 27.056f, 26.4366f, 27.0626f, 26.4386f);
        this.f31528i.cubicTo(27.064f, 26.4386f, 27.0655f, 26.4392f, 27.0669f, 26.4395f);
        this.f31528i.cubicTo(27.0908f, 26.4458f, 27.1158f, 26.4496f, 27.1417f, 26.4496f);
        this.f31528i.lineTo(28.1938f, 26.4496f);
        this.f31528i.cubicTo(28.3554f, 26.4496f, 28.486f, 26.319f, 28.486f, 26.158f);
        this.f31528i.lineTo(28.486f, 19.622f);
        this.f31528i.cubicTo(28.486f, 19.4612f, 28.3554f, 19.3304f, 28.1938f, 19.3304f);
        this.f31528i.close();
        this.f31528i.setFillType(Path.FillType.WINDING);
        this.f31527h.setStyle(Paint.Style.FILL);
        this.f31527h.setColor(-16729856);
        this.f30624a.add(this.f31527h);
        this.f31529j = new Paint();
        Path path4 = new Path();
        this.f31530k = path4;
        path4.moveTo(18.4154f, 24.813f);
        this.f31530k.lineTo(15.5566f, 24.813f);
        this.f31530k.lineTo(15.5566f, 19.6225f);
        this.f31530k.cubicTo(15.5566f, 19.4611f, 15.4258f, 19.3303f, 15.2648f, 19.3303f);
        this.f31530k.lineTo(14.2123f, 19.3303f);
        this.f31530k.cubicTo(14.051f, 19.3303f, 13.9202f, 19.4611f, 13.9202f, 19.6225f);
        this.f31530k.lineTo(13.9202f, 26.1573f);
        this.f31530k.lineTo(13.9202f, 26.1579f);
        this.f31530k.cubicTo(13.9202f, 26.2364f, 13.9515f, 26.3074f, 14.0018f, 26.3598f);
        this.f31530k.cubicTo(14.003f, 26.3612f, 14.0041f, 26.3626f, 14.0059f, 26.3641f);
        this.f31530k.cubicTo(14.0073f, 26.3655f, 14.0087f, 26.3667f, 14.0102f, 26.3681f);
        this.f31530k.cubicTo(14.0628f, 26.4187f, 14.1335f, 26.4498f, 14.212f, 26.4498f);
        this.f31530k.lineTo(14.2123f, 26.4498f);
        this.f31530k.lineTo(18.4154f, 26.4498f);
        this.f31530k.cubicTo(18.5768f, 26.4498f, 18.707f, 26.3186f, 18.707f, 26.1573f);
        this.f31530k.lineTo(18.707f, 25.1052f);
        this.f31530k.cubicTo(18.707f, 24.9439f, 18.5768f, 24.813f, 18.4154f, 24.813f);
        this.f31530k.close();
        this.f31530k.setFillType(Path.FillType.WINDING);
        this.f31529j.setStyle(Paint.Style.FILL);
        this.f31529j.setColor(-16729856);
        this.f30624a.add(this.f31529j);
        this.f31531l = new Paint();
        Path path5 = new Path();
        this.f31532m = path5;
        path5.moveTo(34.0041f, 20.967f);
        this.f31532m.cubicTo(34.1654f, 20.967f, 34.2956f, 20.8365f, 34.2956f, 20.6749f);
        this.f31532m.lineTo(34.2956f, 19.6227f);
        this.f31532m.cubicTo(34.2956f, 19.4614f, 34.1654f, 19.3303f, 34.0041f, 19.3303f);
        this.f31532m.lineTo(29.8009f, 19.3303f);
        this.f31532m.lineTo(29.8004f, 19.3303f);
        this.f31532m.cubicTo(29.7216f, 19.3303f, 29.6506f, 19.3619f, 29.5979f, 19.4128f);
        this.f31532m.cubicTo(29.5968f, 19.414f, 29.5953f, 19.4148f, 29.5945f, 19.416f);
        this.f31532m.cubicTo(29.5928f, 19.4177f, 29.5913f, 19.4194f, 29.5899f, 19.4212f);
        this.f31532m.cubicTo(29.5398f, 19.4735f, 29.5088f, 19.5442f, 29.5088f, 19.6225f);
        this.f31532m.lineTo(29.5088f, 19.6227f);
        this.f31532m.lineTo(29.5088f, 26.1576f);
        this.f31532m.lineTo(29.5088f, 26.1579f);
        this.f31532m.cubicTo(29.5088f, 26.2364f, 29.5401f, 26.3074f, 29.5905f, 26.3598f);
        this.f31532m.cubicTo(29.5916f, 26.3612f, 29.593f, 26.3629f, 29.5945f, 26.3641f);
        this.f31532m.cubicTo(29.5956f, 26.3655f, 29.5974f, 26.367f, 29.5988f, 26.3681f);
        this.f31532m.cubicTo(29.6511f, 26.4184f, 29.7222f, 26.4498f, 29.8004f, 26.4498f);
        this.f31532m.lineTo(29.8009f, 26.4498f);
        this.f31532m.lineTo(34.0041f, 26.4498f);
        this.f31532m.cubicTo(34.1654f, 26.4498f, 34.2956f, 26.3186f, 34.2956f, 26.1576f);
        this.f31532m.lineTo(34.2956f, 25.1052f);
        this.f31532m.cubicTo(34.2956f, 24.9442f, 34.1654f, 24.813f, 34.0041f, 24.813f);
        this.f31532m.lineTo(31.1455f, 24.813f);
        this.f31532m.lineTo(31.1455f, 23.7083f);
        this.f31532m.lineTo(34.0041f, 23.7083f);
        this.f31532m.cubicTo(34.1654f, 23.7083f, 34.2956f, 23.5774f, 34.2956f, 23.4161f);
        this.f31532m.lineTo(34.2956f, 22.364f);
        this.f31532m.cubicTo(34.2956f, 22.2026f, 34.1654f, 22.0715f, 34.0041f, 22.0715f);
        this.f31532m.lineTo(31.1455f, 22.0715f);
        this.f31532m.lineTo(31.1455f, 20.967f);
        this.f31532m.lineTo(34.0041f, 20.967f);
        this.f31532m.close();
        this.f31532m.setFillType(Path.FillType.WINDING);
        this.f31531l.setStyle(Paint.Style.FILL);
        this.f31531l.setColor(-16729856);
        this.f30624a.add(this.f31531l);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31524e, this.f31523d);
        canvas.drawPath(this.f31526g, this.f31525f);
        canvas.drawPath(this.f31528i, this.f31527h);
        canvas.drawPath(this.f31530k, this.f31529j);
        canvas.drawPath(this.f31532m, this.f31531l);
    }
}
