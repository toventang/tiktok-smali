package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class jz extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31674d;

    /* renamed from: e  reason: collision with root package name */
    Path f31675e;

    static {
        Covode.recordClassIndex(18405);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(15.6396f, 12.0357f);
        this.f30626c.cubicTo(18.9476f, 6.90766f, 24.5796f, 3.5f, 31.0f, 3.5f);
        this.f30626c.lineTo(55.3893f, 3.5f);
        this.f30626c.cubicTo(60.0047f, 3.5f, 64.0665f, 6.00858f, 66.9225f, 9.83301f);
        this.f30626c.cubicTo(69.7783f, 13.6572f, 71.5f, 18.8708f, 71.5f, 24.5652f);
        this.f30626c.lineTo(71.5f, 50.0f);
        this.f30626c.cubicTo(71.5f, 50.8284f, 70.8284f, 51.5f, 70.0f, 51.5f);
        this.f30626c.lineTo(49.5f, 51.5f);
        this.f30626c.lineTo(49.5f, 68.5f);
        this.f30626c.lineTo(58.0f, 68.5f);
        this.f30626c.cubicTo(58.8284f, 68.5f, 59.5f, 69.1716f, 59.5f, 70.0f);
        this.f30626c.cubicTo(59.5f, 70.8284f, 58.8284f, 71.5f, 58.0f, 71.5f);
        this.f30626c.lineTo(28.0f, 71.5f);
        this.f30626c.cubicTo(27.1716f, 71.5f, 26.5f, 70.8284f, 26.5f, 70.0f);
        this.f30626c.cubicTo(26.5f, 69.1716f, 27.1716f, 68.5f, 28.0f, 68.5f);
        this.f30626c.lineTo(37.5f, 68.5f);
        this.f30626c.lineTo(37.5f, 51.5f);
        this.f30626c.lineTo(7.0f, 51.5f);
        this.f30626c.cubicTo(6.17157f, 51.5f, 5.5f, 50.8284f, 5.5f, 50.0f);
        this.f30626c.cubicTo(5.5f, 49.1716f, 6.17157f, 48.5f, 7.0f, 48.5f);
        this.f30626c.lineTo(12.5f, 48.5f);
        this.f30626c.lineTo(12.5f, 36.3953f);
        this.f30626c.cubicTo(12.5f, 35.5669f, 13.1716f, 34.8953f, 14.0f, 34.8953f);
        this.f30626c.cubicTo(14.8284f, 34.8953f, 15.5f, 35.5669f, 15.5f, 36.3953f);
        this.f30626c.lineTo(15.5f, 48.5f);
        this.f30626c.lineTo(46.5f, 48.5f);
        this.f30626c.lineTo(46.5f, 22.7907f);
        this.f30626c.cubicTo(46.5f, 13.7286f, 39.4969f, 6.5f, 31.0f, 6.5f);
        this.f30626c.cubicTo(25.6801f, 6.5f, 20.9617f, 9.31958f, 18.1605f, 13.662f);
        this.f30626c.cubicTo(17.7115f, 14.3581f, 16.7831f, 14.5584f, 16.0869f, 14.1093f);
        this.f30626c.cubicTo(15.3908f, 13.6603f, 15.1905f, 12.7319f, 15.6396f, 12.0357f);
        this.f30626c.close();
        this.f30626c.moveTo(40.5f, 68.5f);
        this.f30626c.lineTo(46.5f, 68.5f);
        this.f30626c.lineTo(46.5f, 51.5f);
        this.f30626c.lineTo(40.5f, 51.5f);
        this.f30626c.lineTo(40.5f, 68.5f);
        this.f30626c.close();
        this.f30626c.moveTo(49.5f, 22.7907f);
        this.f30626c.cubicTo(49.5f, 15.9707f, 46.0905f, 9.93363f, 40.9167f, 6.5f);
        this.f30626c.lineTo(55.3893f, 6.5f);
        this.f30626c.cubicTo(58.8431f, 6.5f, 62.0867f, 8.37124f, 64.5188f, 11.628f);
        this.f30626c.cubicTo(66.951f, 14.8851f, 68.5f, 19.4541f, 68.5f, 24.5652f);
        this.f30626c.lineTo(68.5f, 48.5f);
        this.f30626c.lineTo(49.5f, 48.5f);
        this.f30626c.lineTo(49.5f, 22.7907f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31674d = new Paint();
        Path path = new Path();
        this.f31675e = path;
        path.moveTo(0.56445f, 17.5666f);
        this.f31675e.cubicTo(0.774771f, 16.9371f, 1.3641f, 16.5127f, 2.02779f, 16.5127f);
        this.f31675e.lineTo(40.0f, 16.5127f);
        this.f31675e.cubicTo(40.6003f, 16.5127f, 41.1461f, 16.8609f, 41.3991f, 17.4054f);
        this.f31675e.cubicTo(41.6521f, 17.9498f, 41.5663f, 18.5916f, 41.1792f, 19.0504f);
        this.f31675e.lineTo(22.1931f, 41.5548f);
        this.f31675e.cubicTo(21.8526f, 41.9584f, 21.3293f, 42.1598f, 20.8061f, 42.0887f);
        this.f31675e.cubicTo(20.2828f, 42.0176f, 19.8323f, 41.6838f, 19.6119f, 41.2039f);
        this.f31675e.lineTo(14.0029f, 28.9939f);
        this.f31675e.lineTo(1.10034f, 19.2885f);
        this.f31675e.cubicTo(0.569944f, 18.8896f, 0.354128f, 18.1961f, 0.56445f, 17.5666f);
        this.f31675e.close();
        this.f31675e.moveTo(17.4073f, 29.0128f);
        this.f31675e.lineTo(27.9682f, 24.7709f);
        this.f31675e.cubicTo(28.7589f, 24.4533f, 29.1424f, 23.5549f, 28.8248f, 22.7642f);
        this.f31675e.cubicTo(28.5072f, 21.9735f, 27.6087f, 21.5899f, 26.818f, 21.9075f);
        this.f31675e.lineTo(15.6688f, 26.3858f);
        this.f31675e.lineTo(6.64552f, 19.5984f);
        this.f31675e.lineTo(36.6797f, 19.5984f);
        this.f31675e.lineTo(21.4015f, 37.7077f);
        this.f31675e.lineTo(17.4073f, 29.0128f);
        this.f31675e.close();
        this.f31675e.setFillType(Path.FillType.EVEN_ODD);
        this.f31674d.setStyle(Paint.Style.FILL);
        this.f31674d.setColor(-16777216);
        this.f30624a.add(this.f31674d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31675e, this.f31674d);
    }
}
