package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gu extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31579d;

    /* renamed from: e  reason: collision with root package name */
    Path f31580e;

    static {
        Covode.recordClassIndex(18319);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31579d = new Paint();
        Path path = new Path();
        this.f31580e = path;
        path.addRect(0.0f, 0.0f, 48.0f, 48.0f, Path.Direction.CW);
        this.f30626c.moveTo(20.6604f, 13.1954f);
        this.f30626c.cubicTo(20.9416f, 12.9142f, 20.9416f, 12.4583f, 20.6604f, 12.1772f);
        this.f30626c.lineTo(19.4022f, 10.9189f);
        this.f30626c.lineTo(25.7666f, 4.55455f);
        this.f30626c.cubicTo(26.1571f, 4.16402f, 26.7903f, 4.16403f, 27.1808f, 4.55455f);
        this.f30626c.lineTo(30.6264f, 8.00011f);
        this.f30626c.cubicTo(29.9321f, 10.4727f, 30.5382f, 13.2556f, 32.496f, 15.2134f);
        this.f30626c.cubicTo(34.4537f, 17.1711f, 37.2367f, 17.7773f, 39.7092f, 17.083f);
        this.f30626c.lineTo(43.4443f, 20.818f);
        this.f30626c.cubicTo(43.8348f, 21.2085f, 43.8348f, 21.8417f, 43.4443f, 22.2322f);
        this.f30626c.lineTo(37.0798f, 28.5966f);
        this.f30626c.lineTo(35.8208f, 27.3375f);
        this.f30626c.cubicTo(35.5396f, 27.0564f, 35.0837f, 27.0564f, 34.8025f, 27.3375f);
        this.f30626c.lineTo(33.3459f, 28.7942f);
        this.f30626c.cubicTo(33.0647f, 29.0754f, 33.0647f, 29.5312f, 33.3459f, 29.8124f);
        this.f30626c.lineTo(34.605f, 31.0715f);
        this.f30626c.lineTo(22.2311f, 43.4454f);
        this.f30626c.cubicTo(21.8405f, 43.8359f, 21.2074f, 43.8359f, 20.8168f, 43.4454f);
        this.f30626c.lineTo(17.5208f, 40.1494f);
        this.f30626c.cubicTo(18.9911f, 37.3706f, 18.5866f, 33.8292f, 16.2345f, 31.4771f);
        this.f30626c.cubicTo(13.8824f, 29.125f, 10.341f, 28.7205f, 7.56217f, 30.1907f);
        this.f30626c.lineTo(4.55339f, 27.182f);
        this.f30626c.cubicTo(4.16287f, 26.7914f, 4.16287f, 26.1583f, 4.55339f, 25.7678f);
        this.f30626c.lineTo(16.9273f, 13.3938f);
        this.f30626c.lineTo(18.1856f, 14.652f);
        this.f30626c.cubicTo(18.4667f, 14.9332f, 18.9226f, 14.9332f, 19.2038f, 14.652f);
        this.f30626c.lineTo(20.6604f, 13.1954f);
        this.f30626c.close();
        this.f30626c.moveTo(14.5871f, 10.0772f);
        this.f30626c.lineTo(1.72496f, 22.9393f);
        this.f30626c.cubicTo(-0.227656f, 24.8919f, -0.227658f, 28.0578f, 1.72496f, 30.0104f);
        this.f30626c.lineTo(5.23441f, 33.5198f);
        this.f30626c.cubicTo(6.42829f, 34.7137f, 8.1227f, 34.558f, 9.18065f, 33.8742f);
        this.f30626c.cubicTo(10.501f, 33.0208f, 12.2752f, 33.1747f, 13.406f, 34.3055f);
        this.f30626c.cubicTo(14.5369f, 35.4364f, 14.6907f, 37.2105f, 13.8374f, 38.5309f);
        this.f30626c.cubicTo(13.1536f, 39.5889f, 12.9978f, 41.2833f, 14.1917f, 42.4772f);
        this.f30626c.lineTo(17.9884f, 46.2738f);
        this.f30626c.cubicTo(19.941f, 48.2265f, 23.1069f, 48.2265f, 25.0595f, 46.2738f);
        this.f30626c.lineTo(46.2727f, 25.0606f);
        this.f30626c.cubicTo(48.2253f, 23.108f, 48.2253f, 19.9422f, 46.2727f, 17.9896f);
        this.f30626c.lineTo(42.1356f, 13.8525f);
        this.f30626c.cubicTo(41.1754f, 12.8922f, 39.8452f, 12.8043f, 38.8557f, 13.1592f);
        this.f30626c.cubicTo(37.6474f, 13.5925f, 36.2644f, 13.3249f, 35.3244f, 12.3849f);
        this.f30626c.cubicTo(34.3845f, 11.445f, 34.1168f, 10.0619f, 34.5501f, 8.85367f);
        this.f30626c.cubicTo(34.905f, 7.86412f, 34.8171f, 6.53399f, 33.8569f, 5.57374f);
        this.f30626c.lineTo(30.0092f, 1.72612f);
        this.f30626c.cubicTo(28.0566f, -0.226497f, 24.8908f, -0.226498f, 22.9382f, 1.72612f);
        this.f30626c.lineTo(16.0856f, 8.57867f);
        this.f30626c.cubicTo(16.0784f, 8.58534f, 16.0713f, 8.59218f, 16.0642f, 8.5992f);
        this.f30626c.lineTo(14.6076f, 10.0558f);
        this.f30626c.cubicTo(14.6006f, 10.0629f, 14.5937f, 10.07f, 14.5871f, 10.0772f);
        this.f30626c.close();
        this.f30626c.moveTo(32.9183f, 25.4519f);
        this.f30626c.cubicTo(33.1994f, 25.1707f, 33.1994f, 24.7148f, 32.9183f, 24.4337f);
        this.f30626c.lineTo(30.0474f, 21.5628f);
        this.f30626c.cubicTo(29.7662f, 21.2816f, 29.3103f, 21.2816f, 29.0292f, 21.5628f);
        this.f30626c.lineTo(27.5725f, 23.0195f);
        this.f30626c.cubicTo(27.2913f, 23.3006f, 27.2913f, 23.7565f, 27.5725f, 24.0377f);
        this.f30626c.lineTo(30.4434f, 26.9085f);
        this.f30626c.cubicTo(30.7246f, 27.1897f, 31.1804f, 27.1897f, 31.4616f, 26.9085f);
        this.f30626c.lineTo(32.9183f, 25.4519f);
        this.f30626c.close();
        this.f30626c.moveTo(26.4358f, 17.9519f);
        this.f30626c.cubicTo(26.717f, 18.2331f, 26.717f, 18.6889f, 26.4358f, 18.9701f);
        this.f30626c.lineTo(24.9792f, 20.4268f);
        this.f30626c.cubicTo(24.698f, 20.7079f, 24.2421f, 20.7079f, 23.961f, 20.4268f);
        this.f30626c.lineTo(21.0901f, 17.5559f);
        this.f30626c.cubicTo(20.8089f, 17.2747f, 20.8089f, 16.8188f, 21.0901f, 16.5377f);
        this.f30626c.lineTo(22.5467f, 15.081f);
        this.f30626c.cubicTo(22.8279f, 14.7999f, 23.2838f, 14.7999f, 23.565f, 15.081f);
        this.f30626c.lineTo(26.4358f, 17.9519f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.clipPath(this.f31580e);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
