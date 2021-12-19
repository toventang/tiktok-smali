package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cq extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31355d;

    /* renamed from: e  reason: collision with root package name */
    Path f31356e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31357f;

    /* renamed from: g  reason: collision with root package name */
    Path f31358g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31359h;

    /* renamed from: i  reason: collision with root package name */
    Path f31360i;

    static {
        Covode.recordClassIndex(18207);
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
        this.f30625b.setColor(-11348301);
        this.f31355d = new Paint();
        Path path = new Path();
        this.f31356e = path;
        path.moveTo(26.6205f, 31.3295f);
        this.f31356e.lineTo(24.862f, 33.0881f);
        this.f31356e.cubicTo(23.9437f, 34.0064f, 22.6082f, 34.2525f, 21.4649f, 33.8293f);
        this.f31356e.lineTo(21.4619f, 33.8353f);
        this.f31356e.cubicTo(20.5916f, 33.4782f, 19.8293f, 33.0311f, 17.4046f, 30.6063f);
        this.f31356e.cubicTo(15.3279f, 28.5296f, 14.7007f, 27.6714f, 14.3406f, 26.9211f);
        this.f31356e.cubicTo(14.3346f, 26.9121f, 14.3316f, 26.9031f, 14.3286f, 26.8941f);
        this.f31356e.cubicTo(14.3136f, 26.8611f, 14.2986f, 26.8311f, 14.2836f, 26.7981f);
        this.f31356e.cubicTo(14.2446f, 26.7201f, 14.2116f, 26.639f, 14.1815f, 26.558f);
        this.f31356e.cubicTo(14.1785f, 26.555f, 14.1785f, 26.549f, 14.1755f, 26.546f);
        this.f31356e.cubicTo(13.7494f, 25.3996f, 13.9925f, 24.0612f, 14.9138f, 23.1399f);
        this.f31356e.lineTo(16.6723f, 21.3814f);
        this.f31356e.cubicTo(16.8704f, 21.1833f, 16.8704f, 20.8592f, 16.6723f, 20.6581f);
        this.f31356e.lineTo(14.1425f, 18.1283f);
        this.f31356e.cubicTo(13.9445f, 17.9302f, 13.6204f, 17.9272f, 13.4193f, 18.1283f);
        this.f31356e.lineTo(11.0275f, 20.5231f);
        this.f31356e.cubicTo(9.00189f, 22.5487f, 8.49473f, 25.5167f, 9.50305f, 28.0135f);
        this.f31356e.cubicTo(9.50305f, 28.0165f, 9.50605f, 28.0195f, 9.50605f, 28.0225f);
        this.f31356e.cubicTo(9.50905f, 28.0255f, 9.50905f, 28.0285f, 9.51206f, 28.0345f);
        this.f31356e.cubicTo(10.0222f, 29.2799f, 10.6794f, 30.3842f, 14.1545f, 33.8593f);
        this.f31356e.cubicTo(17.6447f, 37.3525f, 18.74f, 37.9947f, 19.9944f, 38.5078f);
        this.f31356e.lineTo(19.9974f, 38.5018f);
        this.f31356e.cubicTo(22.4942f, 39.5041f, 25.4561f, 38.994f, 27.4758f, 36.9713f);
        this.f31356e.lineTo(29.8706f, 34.5766f);
        this.f31356e.cubicTo(30.0686f, 34.3785f, 30.0686f, 34.0544f, 29.8706f, 33.8533f);
        this.f31356e.lineTo(27.3407f, 31.3235f);
        this.f31356e.cubicTo(27.1427f, 31.1315f, 26.8186f, 31.1315f, 26.6205f, 31.3295f);
        this.f31356e.close();
        this.f31356e.setFillType(Path.FillType.WINDING);
        this.f31355d.setStyle(Paint.Style.FILL);
        this.f31355d.setColor(-1);
        this.f30624a.add(this.f31355d);
        this.f31357f = new Paint();
        Path path2 = new Path();
        this.f31358g = path2;
        path2.moveTo(30.9222f, 26.6235f);
        this.f31358g.lineTo(32.6807f, 24.865f);
        this.f31358g.cubicTo(33.599f, 23.9467f, 33.8451f, 22.6112f, 33.422f, 21.4679f);
        this.f31358g.lineTo(33.428f, 21.4649f);
        this.f31358g.cubicTo(33.0709f, 20.5946f, 32.6237f, 19.8323f, 30.1989f, 17.4076f);
        this.f31358g.cubicTo(28.1223f, 15.3309f, 27.264f, 14.7037f, 26.5138f, 14.3436f);
        this.f31358g.cubicTo(26.5048f, 14.3376f, 26.4958f, 14.3346f, 26.4868f, 14.3316f);
        this.f31358g.cubicTo(26.4538f, 14.3166f, 26.4237f, 14.3016f, 26.3907f, 14.2866f);
        this.f31358g.cubicTo(26.3127f, 14.2476f, 26.2317f, 14.2146f, 26.1507f, 14.1845f);
        this.f31358g.cubicTo(26.1477f, 14.1815f, 26.1417f, 14.1815f, 26.1387f, 14.1785f);
        this.f31358g.cubicTo(24.9923f, 13.7524f, 23.6539f, 13.9955f, 22.7326f, 14.9168f);
        this.f31358g.lineTo(20.974f, 16.6753f);
        this.f31358g.cubicTo(20.7759f, 16.8734f, 20.4518f, 16.8734f, 20.2508f, 16.6753f);
        this.f31358g.lineTo(17.721f, 14.1455f);
        this.f31358g.cubicTo(17.5229f, 13.9475f, 17.5199f, 13.6234f, 17.721f, 13.4223f);
        this.f31358g.lineTo(20.1157f, 11.0275f);
        this.f31358g.cubicTo(22.1414f, 9.00189f, 25.1093f, 8.49473f, 27.6061f, 9.50305f);
        this.f31358g.cubicTo(27.6091f, 9.50305f, 27.6121f, 9.50605f, 27.6151f, 9.50605f);
        this.f31358g.cubicTo(27.6181f, 9.50905f, 27.6211f, 9.50905f, 27.6271f, 9.51206f);
        this.f31358g.cubicTo(28.8725f, 10.0222f, 29.9769f, 10.6794f, 33.452f, 14.1545f);
        this.f31358g.cubicTo(36.9451f, 17.6477f, 37.5903f, 18.743f, 38.1035f, 19.9974f);
        this.f31358g.lineTo(38.0975f, 20.0004f);
        this.f31358g.cubicTo(39.0998f, 22.4972f, 38.5896f, 25.4591f, 36.567f, 27.4788f);
        this.f31358g.lineTo(34.1722f, 29.8736f);
        this.f31358g.cubicTo(33.9742f, 30.0716f, 33.65f, 30.0716f, 33.449f, 29.8736f);
        this.f31358g.lineTo(30.9192f, 27.3437f);
        this.f31358g.cubicTo(30.7211f, 27.1487f, 30.7211f, 26.8246f, 30.9222f, 26.6235f);
        this.f31358g.close();
        this.f31358g.setFillType(Path.FillType.WINDING);
        this.f31357f.setStyle(Paint.Style.FILL);
        this.f31357f.setColor(-1);
        this.f30624a.add(this.f31357f);
        this.f31359h = new Paint();
        Path path3 = new Path();
        this.f31360i = path3;
        path3.moveTo(18.4199f, 25.6755f);
        this.f31360i.cubicTo(18.4199f, 25.6755f, 18.4199f, 25.6785f, 18.4199f, 25.6755f);
        this.f31360i.cubicTo(18.63f, 26.1647f, 19.4372f, 26.993f, 20.1094f, 27.6682f);
        this.f31360i.cubicTo(20.7847f, 28.3434f, 21.6129f, 29.1506f, 22.1021f, 29.3577f);
        this.f31360i.lineTo(22.0991f, 29.3517f);
        this.f31360i.cubicTo(22.3242f, 29.4387f, 22.5912f, 29.3937f, 22.7713f, 29.2137f);
        this.f31360i.lineTo(29.2114f, 22.7736f);
        this.f31360i.cubicTo(29.3944f, 22.5905f, 29.4394f, 22.3265f, 29.3494f, 22.1014f);
        this.f31360i.lineTo(29.3494f, 22.0984f);
        this.f31360i.cubicTo(29.3464f, 22.0924f, 29.3434f, 22.0894f, 29.3404f, 22.0834f);
        this.f31360i.cubicTo(29.1213f, 21.5942f, 28.3261f, 20.775f, 27.6599f, 20.1088f);
        this.f31360i.cubicTo(26.9906f, 19.4395f, 26.1744f, 18.6443f, 25.6852f, 18.4282f);
        this.f31360i.cubicTo(25.6792f, 18.4252f, 25.6762f, 18.4222f, 25.6702f, 18.4192f);
        this.f31360i.lineTo(25.6672f, 18.4192f);
        this.f31360i.cubicTo(25.4421f, 18.3292f, 25.1751f, 18.3772f, 24.995f, 18.5573f);
        this.f31360i.lineTo(18.5579f, 24.9973f);
        this.f31360i.cubicTo(18.3749f, 25.1804f, 18.3299f, 25.4505f, 18.4199f, 25.6755f);
        this.f31360i.close();
        this.f31360i.setFillType(Path.FillType.WINDING);
        this.f31359h.setStyle(Paint.Style.FILL);
        this.f31359h.setColor(-1);
        this.f30624a.add(this.f31359h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31356e, this.f31355d);
        canvas.drawPath(this.f31358g, this.f31357f);
        canvas.drawPath(this.f31360i, this.f31359h);
    }
}
