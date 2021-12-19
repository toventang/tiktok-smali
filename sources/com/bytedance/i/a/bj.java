package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bj extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31301d;

    /* renamed from: e  reason: collision with root package name */
    Path f31302e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31303f;

    /* renamed from: g  reason: collision with root package name */
    Path f31304g;

    static {
        Covode.recordClassIndex(18173);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(13.4292f, 34.0472f);
        this.f30626c.cubicTo(16.6492f, 34.0472f, 19.2812f, 32.6752f, 21.1012f, 30.6312f);
        this.f30626c.lineTo(21.1012f, 24.3403f);
        this.f30626c.cubicTo(21.1012f, 23.788f, 20.6534f, 23.3403f, 20.1012f, 23.3403f);
        this.f30626c.lineTo(13.2532f, 23.3403f);
        this.f30626c.cubicTo(12.7009f, 23.3403f, 12.2532f, 23.788f, 12.2532f, 24.3403f);
        this.f30626c.lineTo(12.2532f, 25.2243f);
        this.f30626c.cubicTo(12.2532f, 25.7765f, 12.7009f, 26.2243f, 13.2532f, 26.2243f);
        this.f30626c.lineTo(17.8532f, 26.2243f);
        this.f30626c.lineTo(17.8532f, 29.4272f);
        this.f30626c.cubicTo(17.0132f, 30.2392f, 15.3332f, 31.1072f, 13.4292f, 31.1072f);
        this.f30626c.cubicTo(9.73315f, 31.1072f, 6.98915f, 27.9323f, 6.98915f, 24.0403f);
        this.f30626c.cubicTo(6.98915f, 20.0923f, 9.73315f, 16.8648f, 13.4292f, 16.8648f);
        this.f30626c.cubicTo(15.1452f, 16.8648f, 16.6499f, 17.6138f, 17.6889f, 18.6665f);
        this.f30626c.cubicTo(18.0499f, 19.0322f, 18.6119f, 19.1607f, 19.0567f, 18.9032f);
        this.f30626c.lineTo(19.9916f, 18.3619f);
        this.f30626c.cubicTo(20.4983f, 18.0686f, 20.6494f, 17.4006f, 20.2646f, 16.9594f);
        this.f30626c.cubicTo(18.7663f, 15.2416f, 16.5654f, 13.9528f, 13.4292f, 13.9528f);
        this.f30626c.cubicTo(7.99715f, 13.9528f, 3.62915f, 18.1603f, 3.62915f, 24.0403f);
        this.f30626c.cubicTo(3.62915f, 30.2112f, 7.99715f, 34.0472f, 13.4292f, 34.0472f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31301d = new Paint();
        Path path = new Path();
        this.f31302e = path;
        path.moveTo(26.7875f, 33.6832f);
        this.f31302e.cubicTo(27.3397f, 33.6832f, 27.7875f, 33.2355f, 27.7875f, 32.6832f);
        this.f31302e.lineTo(27.7875f, 15.2608f);
        this.f31302e.cubicTo(27.7875f, 14.7085f, 27.3397f, 14.2608f, 26.7875f, 14.2608f);
        this.f31302e.lineTo(25.5115f, 14.2608f);
        this.f31302e.cubicTo(24.9592f, 14.2608f, 24.5115f, 14.7085f, 24.5115f, 15.2608f);
        this.f31302e.lineTo(24.5115f, 32.6832f);
        this.f31302e.cubicTo(24.5115f, 33.2355f, 24.9592f, 33.6832f, 25.5115f, 33.6832f);
        this.f31302e.lineTo(26.7875f, 33.6832f);
        this.f31302e.close();
        this.f31302e.setFillType(Path.FillType.WINDING);
        this.f31301d.setStyle(Paint.Style.FILL);
        this.f31301d.setColor(-16777216);
        this.f30624a.add(this.f31301d);
        this.f31303f = new Paint();
        Path path2 = new Path();
        this.f31304g = path2;
        path2.moveTo(34.0336f, 33.6832f);
        this.f31304g.cubicTo(34.5858f, 33.6832f, 35.0336f, 33.2355f, 35.0336f, 32.6832f);
        this.f31304g.lineTo(35.0336f, 25.2723f);
        this.f31304g.lineTo(43.3576f, 25.2723f);
        this.f31304g.cubicTo(43.9098f, 25.2723f, 44.3576f, 24.8245f, 44.3576f, 24.2723f);
        this.f31304g.lineTo(44.3576f, 23.3883f);
        this.f31304g.cubicTo(44.3576f, 22.836f, 43.9098f, 22.3883f, 43.3576f, 22.3883f);
        this.f31304g.lineTo(35.0336f, 22.3883f);
        this.f31304g.lineTo(35.0336f, 17.1448f);
        this.f31304g.lineTo(43.5536f, 17.1448f);
        this.f31304g.cubicTo(44.1058f, 17.1448f, 44.5536f, 16.6971f, 44.5536f, 16.1448f);
        this.f31304g.lineTo(44.5536f, 15.2608f);
        this.f31304g.cubicTo(44.5536f, 14.7085f, 44.1058f, 14.2608f, 43.5536f, 14.2608f);
        this.f31304g.lineTo(32.7576f, 14.2608f);
        this.f31304g.cubicTo(32.2053f, 14.2608f, 31.7576f, 14.7085f, 31.7576f, 15.2608f);
        this.f31304g.lineTo(31.7576f, 32.6832f);
        this.f31304g.cubicTo(31.7576f, 33.2355f, 32.2053f, 33.6832f, 32.7576f, 33.6832f);
        this.f31304g.lineTo(34.0336f, 33.6832f);
        this.f31304g.close();
        this.f31304g.setFillType(Path.FillType.WINDING);
        this.f31303f.setStyle(Paint.Style.FILL);
        this.f31303f.setColor(-16777216);
        this.f30624a.add(this.f31303f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31302e, this.f31301d);
        canvas.drawPath(this.f31304g, this.f31303f);
    }
}
