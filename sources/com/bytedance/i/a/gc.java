package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gc extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31519d;

    /* renamed from: e  reason: collision with root package name */
    Path f31520e;

    static {
        Covode.recordClassIndex(18301);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.addRoundRect(new RectF(4.0f, 4.0f, 44.0f, 44.0f), 5.0f, 5.0f, Path.Direction.CW);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-6126);
        this.f31519d = new Paint();
        Path path = new Path();
        this.f31520e = path;
        path.moveTo(7.75f, 22.4375f);
        this.f31520e.cubicTo(7.75f, 15.3614f, 15.0253f, 9.625f, 24.0f, 9.625f);
        this.f31520e.cubicTo(32.9747f, 9.625f, 40.25f, 15.3614f, 40.25f, 22.4375f);
        this.f31520e.cubicTo(40.25f, 29.5137f, 32.9747f, 35.25f, 24.0f, 35.25f);
        this.f31520e.cubicTo(23.015f, 35.25f, 22.0505f, 35.1811f, 21.1138f, 35.0484f);
        this.f31520e.cubicTo(20.1761f, 35.7092f, 14.7587f, 39.5145f, 14.2475f, 39.5859f);
        this.f31520e.cubicTo(14.2475f, 39.5859f, 14.0378f, 39.6675f, 13.8595f, 39.5625f);
        this.f31520e.cubicTo(13.6813f, 39.4575f, 13.7136f, 39.1822f, 13.7136f, 39.1822f);
        this.f31520e.cubicTo(13.7673f, 38.8158f, 15.118f, 34.1517f, 15.3669f, 33.2933f);
        this.f31520e.cubicTo(10.7916f, 31.0266f, 7.75f, 27.0123f, 7.75f, 22.4375f);
        this.f31520e.close();
        this.f31520e.moveTo(14.0781f, 26.0148f);
        this.f31520e.cubicTo(14.0781f, 26.5086f, 14.4986f, 26.9102f, 15.0156f, 26.9102f);
        this.f31520e.cubicTo(15.5327f, 26.9102f, 15.9531f, 26.5086f, 15.9531f, 26.0148f);
        this.f31520e.lineTo(15.9531f, 20.4453f);
        this.f31520e.lineTo(17.4159f, 20.4453f);
        this.f31520e.cubicTo(17.9231f, 20.4453f, 18.3359f, 20.0334f, 18.3359f, 19.5273f);
        this.f31520e.cubicTo(18.3359f, 19.0212f, 17.9233f, 18.6094f, 17.4159f, 18.6094f);
        this.f31520e.lineTo(12.6153f, 18.6094f);
        this.f31520e.cubicTo(12.1081f, 18.6094f, 11.6953f, 19.0212f, 11.6953f, 19.5273f);
        this.f31520e.cubicTo(11.6953f, 20.0334f, 12.108f, 20.4453f, 12.6153f, 20.4453f);
        this.f31520e.lineTo(14.0781f, 20.4453f);
        this.f31520e.lineTo(14.0781f, 26.0148f);
        this.f31520e.close();
        this.f31520e.moveTo(22.4561f, 26.4839f);
        this.f31520e.cubicTo(22.5462f, 26.7392f, 22.8453f, 26.898f, 23.2362f, 26.898f);
        this.f31520e.cubicTo(23.4419f, 26.8981f, 23.6451f, 26.8541f, 23.8322f, 26.7687f);
        this.f31520e.cubicTo(24.0906f, 26.6498f, 24.3391f, 26.3219f, 24.0537f, 25.4356f);
        this.f31520e.lineTo(21.8122f, 19.5358f);
        this.f31520e.cubicTo(21.6539f, 19.0859f, 21.1741f, 18.6233f, 20.5617f, 18.6095f);
        this.f31520e.cubicTo(19.9511f, 18.6234f, 19.4712f, 19.0859f, 19.3133f, 19.5348f);
        this.f31520e.lineTo(17.0708f, 25.4373f);
        this.f31520e.cubicTo(16.7861f, 26.3216f, 17.0345f, 26.6494f, 17.293f, 26.7686f);
        this.f31520e.cubicTo(17.48f, 26.8541f, 17.6833f, 26.8982f, 17.8889f, 26.898f);
        this.f31520e.cubicTo(18.2798f, 26.898f, 18.5787f, 26.7394f, 18.6686f, 26.4845f);
        this.f31520e.lineTo(19.1331f, 25.2684f);
        this.f31520e.lineTo(21.9919f, 25.2686f);
        this.f31520e.lineTo(22.4561f, 26.4839f);
        this.f31520e.close();
        this.f31520e.moveTo(20.5625f, 20.9478f);
        this.f31520e.lineTo(21.4989f, 23.608f);
        this.f31520e.lineTo(19.6261f, 23.608f);
        this.f31520e.lineTo(20.5625f, 20.9478f);
        this.f31520e.close();
        this.f31520e.moveTo(24.6641f, 25.9141f);
        this.f31520e.cubicTo(24.6641f, 26.3878f, 25.067f, 26.7734f, 25.5625f, 26.7734f);
        this.f31520e.lineTo(28.5703f, 26.7734f);
        this.f31520e.cubicTo(29.0658f, 26.7734f, 29.4687f, 26.3878f, 29.4687f, 25.9141f);
        this.f31520e.cubicTo(29.4687f, 25.4403f, 29.0658f, 25.0547f, 28.5703f, 25.0547f);
        this.f31520e.lineTo(26.5781f, 25.0547f);
        this.f31520e.lineTo(26.5781f, 19.5469f);
        this.f31520e.cubicTo(26.5781f, 19.0298f, 26.1487f, 18.6094f, 25.6211f, 18.6094f);
        this.f31520e.cubicTo(25.0934f, 18.6094f, 24.6641f, 19.0298f, 24.6641f, 19.5469f);
        this.f31520e.lineTo(24.6641f, 25.9141f);
        this.f31520e.close();
        this.f31520e.moveTo(29.8334f, 25.9605f);
        this.f31520e.cubicTo(29.8334f, 26.4775f, 30.2539f, 26.898f, 30.7709f, 26.898f);
        this.f31520e.cubicTo(31.0196f, 26.8976f, 31.258f, 26.7987f, 31.4338f, 26.6229f);
        this.f31520e.cubicTo(31.6096f, 26.447f, 31.7085f, 26.2087f, 31.7087f, 25.96f);
        this.f31520e.lineTo(31.7087f, 23.9145f);
        this.f31520e.lineTo(32.0341f, 23.5892f);
        this.f31520e.lineTo(34.2327f, 26.5023f);
        this.f31520e.cubicTo(34.3197f, 26.6186f, 34.4328f, 26.7129f, 34.5629f, 26.7776f);
        this.f31520e.cubicTo(34.6929f, 26.8423f, 34.8363f, 26.8757f, 34.9816f, 26.875f);
        this.f31520e.cubicTo(35.1852f, 26.8755f, 35.3833f, 26.809f, 35.5455f, 26.6858f);
        this.f31520e.cubicTo(35.644f, 26.6119f, 35.7269f, 26.5192f, 35.7893f, 26.4131f);
        this.f31520e.cubicTo(35.8517f, 26.307f, 35.8925f, 26.1895f, 35.9092f, 26.0675f);
        this.f31520e.cubicTo(35.9267f, 25.9456f, 35.9198f, 25.8214f, 35.8889f, 25.7022f);
        this.f31520e.cubicTo(35.858f, 25.5829f, 35.8037f, 25.471f, 35.7292f, 25.373f);
        this.f31520e.lineTo(33.4216f, 22.3158f);
        this.f31520e.lineTo(35.558f, 20.1797f);
        this.f31520e.cubicTo(35.7048f, 20.0327f, 35.7784f, 19.83f, 35.7648f, 19.6089f);
        this.f31520e.cubicTo(35.7514f, 19.3897f, 35.6534f, 19.1786f, 35.4892f, 19.0145f);
        this.f31520e.cubicTo(35.3131f, 18.8386f, 35.0781f, 18.7377f, 34.8441f, 18.7377f);
        this.f31520e.cubicTo(34.6434f, 18.7377f, 34.4586f, 18.8117f, 34.3241f, 18.9462f);
        this.f31520e.lineTo(31.7084f, 21.5619f);
        this.f31520e.lineTo(31.7084f, 19.5469f);
        this.f31520e.cubicTo(31.7084f, 19.0298f, 31.288f, 18.6094f, 30.7709f, 18.6094f);
        this.f31520e.cubicTo(30.2539f, 18.6094f, 29.8334f, 19.0298f, 29.8334f, 19.5469f);
        this.f31520e.lineTo(29.8334f, 25.9605f);
        this.f31520e.close();
        this.f31520e.setFillType(Path.FillType.EVEN_ODD);
        this.f31519d.setStyle(Paint.Style.FILL);
        this.f31519d.setColor(-16777216);
        this.f30624a.add(this.f31519d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31520e, this.f31519d);
    }
}
