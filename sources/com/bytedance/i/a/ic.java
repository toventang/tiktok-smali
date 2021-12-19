package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ic extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31611d;

    /* renamed from: e  reason: collision with root package name */
    Path f31612e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31613f;

    /* renamed from: g  reason: collision with root package name */
    Path f31614g;

    static {
        Covode.recordClassIndex(18355);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(17.3994f, 7.0f);
        this.f30626c.cubicTo(12.0867f, 7.0f, 7.77985f, 11.2548f, 7.77985f, 16.5034f);
        this.f30626c.lineTo(7.77985f, 21.4868f);
        this.f30626c.lineTo(6.25067f, 20.3563f);
        this.f30626c.cubicTo(5.35184f, 19.6919f, 4.07795f, 19.8731f, 3.40535f, 20.761f);
        this.f30626c.cubicTo(2.73272f, 21.6491f, 2.91614f, 22.9076f, 3.81499f, 23.5721f);
        this.f30626c.lineTo(8.59472f, 27.1056f);
        this.f30626c.cubicTo(9.93497f, 28.0964f, 11.8453f, 27.1516f, 11.8453f, 25.4977f);
        this.f30626c.lineTo(11.8453f, 16.5034f);
        this.f30626c.cubicTo(11.8453f, 13.4731f, 14.3319f, 11.0164f, 17.3994f, 11.0164f);
        this.f30626c.lineTo(32.1966f, 11.0164f);
        this.f30626c.cubicTo(32.7408f, 11.0164f, 33.2703f, 11.1905f, 33.706f, 11.5126f);
        this.f30626c.lineTo(35.6798f, 12.9717f);
        this.f30626c.cubicTo(36.5787f, 13.6362f, 37.8525f, 13.455f, 38.5252f, 12.567f);
        this.f30626c.cubicTo(39.1978f, 11.679f, 39.0144f, 10.4204f, 38.1155f, 9.75596f);
        this.f30626c.lineTo(36.1417f, 8.29681f);
        this.f30626c.cubicTo(35.0029f, 7.45495f, 33.6189f, 7.0f, 32.1966f, 7.0f);
        this.f30626c.lineTo(17.3994f, 7.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31611d = new Paint();
        Path path = new Path();
        this.f31612e = path;
        path.moveTo(23.9999f, 16.7443f);
        this.f31612e.cubicTo(19.9443f, 16.7443f, 16.6564f, 19.9924f, 16.6564f, 23.9992f);
        this.f31612e.cubicTo(16.6564f, 28.006f, 19.9443f, 31.254f, 23.9999f, 31.254f);
        this.f31612e.cubicTo(28.0556f, 31.254f, 31.3435f, 28.006f, 31.3435f, 23.9992f);
        this.f31612e.cubicTo(31.3435f, 19.9924f, 28.0556f, 16.7443f, 23.9999f, 16.7443f);
        this.f31612e.close();
        this.f31612e.moveTo(20.7219f, 23.9996f);
        this.f31612e.cubicTo(20.7219f, 22.2111f, 22.1895f, 20.7611f, 24.0f, 20.7611f);
        this.f31612e.cubicTo(25.8104f, 20.7611f, 27.278f, 22.2111f, 27.278f, 23.9996f);
        this.f31612e.cubicTo(27.278f, 25.7881f, 25.8104f, 27.2381f, 24.0f, 27.2381f);
        this.f31612e.cubicTo(22.1895f, 27.2381f, 20.7219f, 25.7881f, 20.7219f, 23.9996f);
        this.f31612e.close();
        this.f31612e.setFillType(Path.FillType.EVEN_ODD);
        this.f31611d.setStyle(Paint.Style.FILL);
        this.f31611d.setColor(-16777216);
        this.f30624a.add(this.f31611d);
        this.f31613f = new Paint();
        Path path2 = new Path();
        this.f31614g = path2;
        path2.moveTo(39.4053f, 20.8944f);
        this.f31614g.cubicTo(38.065f, 19.9036f, 36.1547f, 20.8484f, 36.1547f, 22.5023f);
        this.f31614g.lineTo(36.1547f, 31.4966f);
        this.f31614g.cubicTo(36.1547f, 34.5269f, 33.6681f, 36.9836f, 30.6006f, 36.9836f);
        this.f31614g.lineTo(15.8034f, 36.9836f);
        this.f31614g.cubicTo(15.2592f, 36.9836f, 14.7297f, 36.8095f, 14.294f, 36.4874f);
        this.f31614g.lineTo(12.3202f, 35.0283f);
        this.f31614g.cubicTo(11.4213f, 34.3638f, 10.1475f, 34.545f, 9.47485f, 35.433f);
        this.f31614g.cubicTo(8.80222f, 36.321f, 8.98564f, 37.5796f, 9.88449f, 38.244f);
        this.f31614g.lineTo(11.8583f, 39.7032f);
        this.f31614g.cubicTo(12.9971f, 40.545f, 14.3811f, 41.0f, 15.8034f, 41.0f);
        this.f31614g.lineTo(30.6006f, 41.0f);
        this.f31614g.cubicTo(35.9133f, 41.0f, 40.2201f, 36.7452f, 40.2201f, 31.4966f);
        this.f31614g.lineTo(40.2201f, 26.5132f);
        this.f31614g.lineTo(41.7493f, 27.6437f);
        this.f31614g.cubicTo(42.6482f, 28.3081f, 43.922f, 28.1269f, 44.5946f, 27.239f);
        this.f31614g.cubicTo(45.2673f, 26.3509f, 45.0839f, 25.0924f, 44.185f, 24.4279f);
        this.f31614g.lineTo(39.4053f, 20.8944f);
        this.f31614g.close();
        this.f31614g.setFillType(Path.FillType.WINDING);
        this.f31613f.setStyle(Paint.Style.FILL);
        this.f31613f.setColor(-16777216);
        this.f30624a.add(this.f31613f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31612e, this.f31611d);
        canvas.drawPath(this.f31614g, this.f31613f);
    }
}
