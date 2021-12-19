package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kj extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31680d;

    /* renamed from: e  reason: collision with root package name */
    Path f31681e;

    static {
        Covode.recordClassIndex(18416);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.59922f, 63.1209f);
        this.f30626c.lineTo(51.2069f, 63.1209f);
        this.f30626c.cubicTo(55.3809f, 63.1209f, 58.7776f, 59.7242f, 58.7826f, 55.5503f);
        this.f30626c.lineTo(58.7826f, 45.1431f);
        this.f30626c.lineTo(68.4428f, 53.8141f);
        this.f30626c.cubicTo(68.887f, 54.2128f, 69.5279f, 54.3188f, 70.073f, 54.0715f);
        this.f30626c.cubicTo(70.6181f, 53.8292f, 70.9714f, 53.2841f, 70.9714f, 52.6886f);
        this.f30626c.lineTo(70.9714f, 18.661f);
        this.f30626c.cubicTo(70.9714f, 18.0654f, 70.6181f, 17.5203f, 70.073f, 17.278f);
        this.f30626c.cubicTo(69.5229f, 17.0358f, 68.887f, 17.1367f, 68.4428f, 17.5354f);
        this.f30626c.lineTo(58.7826f, 26.2064f);
        this.f30626c.lineTo(58.7826f, 15.7992f);
        this.f30626c.cubicTo(58.7826f, 11.6253f, 55.3859f, 8.22858f, 51.212f, 8.22858f);
        this.f30626c.lineTo(8.59922f, 8.22858f);
        this.f30626c.cubicTo(4.42526f, 8.22858f, 1.02855f, 11.6253f, 1.02855f, 15.7992f);
        this.f30626c.lineTo(1.02855f, 55.5503f);
        this.f30626c.cubicTo(1.02855f, 59.7242f, 4.42526f, 63.1209f, 8.59922f, 63.1209f);
        this.f30626c.close();
        this.f30626c.moveTo(4.05681f, 15.7995f);
        this.f30626c.cubicTo(4.05681f, 13.2961f, 6.09585f, 11.2571f, 8.59921f, 11.2571f);
        this.f30626c.lineTo(51.212f, 11.2571f);
        this.f30626c.cubicTo(53.7153f, 11.2571f, 55.7544f, 13.2961f, 55.7544f, 15.7995f);
        this.f30626c.lineTo(55.7544f, 29.6033f);
        this.f30626c.cubicTo(55.7544f, 30.1989f, 56.1077f, 30.744f, 56.6528f, 30.9862f);
        this.f30626c.cubicTo(57.2029f, 31.2285f, 57.8388f, 31.1276f, 58.283f, 30.7288f);
        this.f30626c.lineTo(67.9431f, 22.0579f);
        this.f30626c.lineTo(67.9431f, 49.2972f);
        this.f30626c.lineTo(58.283f, 40.6262f);
        this.f30626c.cubicTo(57.8388f, 40.2275f, 57.1978f, 40.1266f, 56.6528f, 40.3688f);
        this.f30626c.cubicTo(56.1077f, 40.6111f, 55.7544f, 41.1562f, 55.7544f, 41.7517f);
        this.f30626c.lineTo(55.7544f, 55.5505f);
        this.f30626c.cubicTo(55.7544f, 58.0539f, 53.7153f, 60.0929f, 51.212f, 60.0929f);
        this.f30626c.lineTo(8.59921f, 60.0929f);
        this.f30626c.cubicTo(6.09585f, 60.0929f, 4.05681f, 58.0539f, 4.05681f, 55.5505f);
        this.f30626c.lineTo(4.05681f, 15.7995f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31680d = new Paint();
        Path path = new Path();
        this.f31681e = path;
        path.moveTo(21.217f, 47.3887f);
        this.f31681e.cubicTo(21.4491f, 47.525f, 21.7116f, 47.5906f, 21.974f, 47.5906f);
        this.f31681e.cubicTo(22.2365f, 47.5906f, 22.4989f, 47.52f, 22.7311f, 47.3837f);
        this.f31681e.lineTo(40.7442f, 36.9866f);
        this.f31681e.cubicTo(41.2136f, 36.7141f, 41.5013f, 36.2144f, 41.5013f, 35.6744f);
        this.f31681e.cubicTo(41.5013f, 35.1344f, 41.2136f, 34.6347f, 40.7442f, 34.3621f);
        this.f31681e.lineTo(22.7311f, 23.9601f);
        this.f31681e.cubicTo(22.2617f, 23.6875f, 21.6864f, 23.6875f, 21.217f, 23.9601f);
        this.f31681e.cubicTo(20.7476f, 24.2326f, 20.4599f, 24.7323f, 20.4599f, 25.2723f);
        this.f31681e.lineTo(20.4599f, 46.0765f);
        this.f31681e.cubicTo(20.4599f, 46.6165f, 20.7476f, 47.1162f, 21.217f, 47.3887f);
        this.f31681e.close();
        this.f31681e.moveTo(36.9589f, 35.6744f);
        this.f31681e.lineTo(23.4882f, 43.452f);
        this.f31681e.lineTo(23.4882f, 27.8968f);
        this.f31681e.lineTo(36.9589f, 35.6744f);
        this.f31681e.close();
        this.f31681e.setFillType(Path.FillType.EVEN_ODD);
        this.f31680d.setStyle(Paint.Style.FILL);
        this.f31680d.setColor(-16777216);
        this.f30624a.add(this.f31680d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31681e, this.f31680d);
    }
}
