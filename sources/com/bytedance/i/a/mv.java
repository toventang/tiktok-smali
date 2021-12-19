package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mv extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31728d;

    /* renamed from: e  reason: collision with root package name */
    Path f31729e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31730f;

    /* renamed from: g  reason: collision with root package name */
    Path f31731g;

    static {
        Covode.recordClassIndex(18482);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(15.7682f, 4.2318f);
        this.f30626c.cubicTo(16.1925f, 3.87824f, 16.8231f, 3.93556f, 17.1766f, 4.35984f);
        this.f30626c.lineTo(22.9033f, 11.2318f);
        this.f30626c.cubicTo(23.446f, 11.8831f, 22.9829f, 12.872f, 22.135f, 12.872f);
        this.f30626c.lineTo(17.0001f, 12.872f);
        this.f30626c.cubicTo(10.9249f, 12.872f, 6.0f, 17.7969f, 6.0f, 23.872f);
        this.f30626c.cubicTo(6.0f, 29.9472f, 10.9249f, 34.8721f, 17.0001f, 34.8721f);
        this.f30626c.lineTo(18.4444f, 34.8721f);
        this.f30626c.cubicTo(18.9967f, 34.8721f, 19.4444f, 35.3198f, 19.4444f, 35.8721f);
        this.f30626c.lineTo(19.4444f, 37.8721f);
        this.f30626c.cubicTo(19.4444f, 38.4244f, 18.9967f, 38.8721f, 18.4444f, 38.8721f);
        this.f30626c.lineTo(17.0001f, 38.8721f);
        this.f30626c.cubicTo(8.71575f, 38.8721f, 2.0f, 32.1563f, 2.0f, 23.872f);
        this.f30626c.cubicTo(2.0f, 16.0015f, 8.06172f, 9.54668f, 15.7713f, 8.9216f);
        this.f30626c.lineTo(14.1037f, 6.92058f);
        this.f30626c.cubicTo(13.7502f, 6.4963f, 13.8075f, 5.86574f, 14.2318f, 5.51217f);
        this.f30626c.lineTo(15.7682f, 4.2318f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31728d = new Paint();
        Path path = new Path();
        this.f31729e = path;
        path.moveTo(32.2318f, 43.512f);
        this.f31729e.cubicTo(31.8075f, 43.8655f, 31.1769f, 43.8082f, 30.8234f, 43.3839f);
        this.f31729e.lineTo(25.0967f, 36.512f);
        this.f31729e.cubicTo(24.554f, 35.8607f, 25.0171f, 34.8718f, 25.865f, 34.8718f);
        this.f31729e.lineTo(30.9999f, 34.8718f);
        this.f31729e.cubicTo(37.0751f, 34.8718f, 42.0f, 29.9469f, 42.0f, 23.8717f);
        this.f31729e.cubicTo(42.0f, 17.7966f, 37.0751f, 12.8717f, 30.9999f, 12.8717f);
        this.f31729e.lineTo(29.5556f, 12.8717f);
        this.f31729e.cubicTo(29.0033f, 12.8717f, 28.5556f, 12.424f, 28.5556f, 11.8717f);
        this.f31729e.lineTo(28.5556f, 9.87169f);
        this.f31729e.cubicTo(28.5556f, 9.3194f, 29.0033f, 8.87169f, 29.5556f, 8.87169f);
        this.f31729e.lineTo(30.9999f, 8.87169f);
        this.f31729e.cubicTo(39.2842f, 8.87169f, 46.0f, 15.5874f, 46.0f, 23.8717f);
        this.f31729e.cubicTo(46.0f, 31.7423f, 39.9383f, 38.1971f, 32.2287f, 38.8222f);
        this.f31729e.lineTo(33.8963f, 40.8232f);
        this.f31729e.cubicTo(34.2498f, 41.2475f, 34.1925f, 41.878f, 33.7682f, 42.2316f);
        this.f31729e.lineTo(32.2318f, 43.512f);
        this.f31729e.close();
        this.f31729e.setFillType(Path.FillType.WINDING);
        this.f31728d.setStyle(Paint.Style.FILL);
        this.f31728d.setColor(-16777216);
        this.f30624a.add(this.f31728d);
        this.f31730f = new Paint();
        Path path2 = new Path();
        this.f31731g = path2;
        path2.moveTo(26.168f, 18.8719f);
        this.f31731g.cubicTo(26.168f, 18.1343f, 25.762f, 17.4566f, 25.1117f, 17.1085f);
        this.f31731g.cubicTo(24.4614f, 16.7605f, 23.6723f, 16.7987f, 23.0586f, 17.2078f);
        this.f31731g.lineTo(19.1679f, 19.821f);
        this.f31731g.cubicTo(18.7084f, 20.1274f, 18.5842f, 20.7483f, 18.8906f, 21.2078f);
        this.f31731g.lineTo(20.0f, 22.8719f);
        this.f31731g.cubicTo(20.3064f, 23.3314f, 20.9272f, 23.4556f, 21.3867f, 23.1492f);
        this.f31731g.lineTo(22.168f, 22.6089f);
        this.f31731g.lineTo(22.168f, 30.8719f);
        this.f31731g.cubicTo(22.168f, 31.4242f, 22.6157f, 31.8719f, 23.168f, 31.8719f);
        this.f31731g.lineTo(25.168f, 31.8719f);
        this.f31731g.cubicTo(25.7203f, 31.8719f, 26.168f, 31.4242f, 26.168f, 30.8719f);
        this.f31731g.lineTo(26.168f, 18.8719f);
        this.f31731g.close();
        this.f31731g.setFillType(Path.FillType.WINDING);
        this.f31730f.setStyle(Paint.Style.FILL);
        this.f31730f.setColor(-16777216);
        this.f30624a.add(this.f31730f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31729e, this.f31728d);
        canvas.drawPath(this.f31731g, this.f31730f);
    }
}
