package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kg extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31678d;

    /* renamed from: e  reason: collision with root package name */
    Path f31679e;

    static {
        Covode.recordClassIndex(18413);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(35.2012f, 25.9638f);
        this.f30626c.cubicTo(35.1737f, 26.0253f, 35.1346f, 26.1685f, 35.0564f, 26.4548f);
        this.f30626c.lineTo(34.9785f, 26.74f);
        this.f30626c.cubicTo(34.8213f, 27.3157f, 34.7426f, 27.6036f, 34.6579f, 27.8707f);
        this.f30626c.cubicTo(33.3271f, 32.0629f, 30.071f, 35.3655f, 25.898f, 36.7556f);
        this.f30626c.cubicTo(25.6322f, 36.8442f, 25.3455f, 36.9269f, 24.7722f, 37.0923f);
        this.f30626c.cubicTo(24.5886f, 37.1452f, 24.4966f, 37.1717f, 24.4549f, 37.1886f);
        this.f30626c.cubicTo(23.7248f, 37.4832f, 23.7248f, 38.5168f, 24.4549f, 38.8114f);
        this.f30626c.cubicTo(24.4966f, 38.8283f, 24.5884f, 38.8547f, 24.772f, 38.9077f);
        this.f30626c.cubicTo(25.3454f, 39.0731f, 25.6322f, 39.1558f, 25.898f, 39.2443f);
        this.f30626c.cubicTo(30.071f, 40.6345f, 33.3271f, 43.937f, 34.6579f, 48.1293f);
        this.f30626c.cubicTo(34.7426f, 48.3964f, 34.8213f, 48.6842f, 34.9785f, 49.2598f);
        this.f30626c.lineTo(35.0564f, 49.5451f);
        this.f30626c.cubicTo(35.1346f, 49.8315f, 35.1737f, 49.9746f, 35.2012f, 50.0362f);
        this.f30626c.cubicTo(35.51f, 50.7267f, 36.4901f, 50.7267f, 36.7988f, 50.0362f);
        this.f30626c.cubicTo(36.8264f, 49.9746f, 36.8655f, 49.8315f, 36.9437f, 49.5452f);
        this.f30626c.lineTo(37.0216f, 49.26f);
        this.f30626c.cubicTo(37.1788f, 48.6843f, 37.2574f, 48.3964f, 37.3422f, 48.1293f);
        this.f30626c.cubicTo(38.673f, 43.937f, 41.9291f, 40.6345f, 46.102f, 39.2443f);
        this.f30626c.cubicTo(46.3679f, 39.1558f, 46.6546f, 39.0731f, 47.2281f, 38.9077f);
        this.f30626c.cubicTo(47.4117f, 38.8547f, 47.5034f, 38.8283f, 47.5452f, 38.8114f);
        this.f30626c.cubicTo(48.2752f, 38.5168f, 48.2752f, 37.4832f, 47.5452f, 37.1886f);
        this.f30626c.cubicTo(47.5034f, 37.1717f, 47.4117f, 37.1453f, 47.2281f, 37.0923f);
        this.f30626c.cubicTo(46.6546f, 36.9269f, 46.3679f, 36.8442f, 46.102f, 36.7556f);
        this.f30626c.cubicTo(41.9291f, 35.3655f, 38.673f, 32.0629f, 37.3422f, 27.8707f);
        this.f30626c.cubicTo(37.2574f, 27.6036f, 37.1788f, 27.3158f, 37.0216f, 26.7401f);
        this.f30626c.lineTo(36.9437f, 26.4548f);
        this.f30626c.cubicTo(36.8655f, 26.1685f, 36.8264f, 26.0253f, 36.7988f, 25.9638f);
        this.f30626c.cubicTo(36.4901f, 25.2733f, 35.51f, 25.2733f, 35.2012f, 25.9638f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31678d = new Paint();
        Path path = new Path();
        this.f31679e = path;
        path.moveTo(46.022f, 10.0f);
        this.f31679e.cubicTo(48.0672f, 10.0f, 49.8381f, 11.4172f, 50.2817f, 13.4091f);
        this.f31679e.lineTo(50.874f, 16.9302f);
        this.f31679e.cubicTo(50.9549f, 17.4117f, 51.3718f, 17.7643f, 51.8601f, 17.7643f);
        this.f31679e.lineTo(59.2727f, 17.7643f);
        this.f31679e.cubicTo(64.0927f, 17.7643f, 68.0f, 21.6626f, 68.0f, 26.4713f);
        this.f31679e.lineTo(68.0f, 53.5597f);
        this.f31679e.cubicTo(68.0f, 58.3684f, 64.0927f, 62.2667f, 59.2727f, 62.2667f);
        this.f31679e.lineTo(12.7273f, 62.2667f);
        this.f31679e.cubicTo(7.90734f, 62.2667f, 4.0f, 58.3684f, 4.0f, 53.5597f);
        this.f31679e.lineTo(4.0f, 26.4713f);
        this.f31679e.cubicTo(4.0f, 21.6626f, 7.90734f, 17.7643f, 12.7273f, 17.7643f);
        this.f31679e.lineTo(20.1399f, 17.7643f);
        this.f31679e.cubicTo(20.6282f, 17.7643f, 21.0451f, 17.4117f, 21.126f, 16.9302f);
        this.f31679e.lineTo(21.7183f, 13.4091f);
        this.f31679e.cubicTo(22.1619f, 11.4172f, 23.9328f, 10.0f, 25.978f, 10.0f);
        this.f31679e.lineTo(46.022f, 10.0f);
        this.f31679e.close();
        this.f31679e.moveTo(24.0845f, 17.4278f);
        this.f31679e.lineTo(24.6599f, 14.0065f);
        this.f31679e.cubicTo(24.8166f, 13.4195f, 25.353f, 13.0f, 25.978f, 13.0f);
        this.f31679e.lineTo(46.022f, 13.0f);
        this.f31679e.cubicTo(46.647f, 13.0f, 47.1834f, 13.4195f, 47.3401f, 14.0065f);
        this.f31679e.lineTo(47.9155f, 17.4278f);
        this.f31679e.cubicTo(48.2394f, 19.3538f, 49.907f, 20.7643f, 51.8601f, 20.7643f);
        this.f31679e.lineTo(59.2727f, 20.7643f);
        this.f31679e.cubicTo(62.4424f, 20.7643f, 65.0f, 23.326f, 65.0f, 26.4713f);
        this.f31679e.lineTo(65.0f, 53.5597f);
        this.f31679e.cubicTo(65.0f, 56.705f, 62.4424f, 59.2667f, 59.2727f, 59.2667f);
        this.f31679e.lineTo(12.7273f, 59.2667f);
        this.f31679e.cubicTo(9.5576f, 59.2667f, 7.0f, 56.705f, 7.0f, 53.5597f);
        this.f31679e.lineTo(7.0f, 26.4713f);
        this.f31679e.cubicTo(7.0f, 23.326f, 9.5576f, 20.7643f, 12.7273f, 20.7643f);
        this.f31679e.lineTo(20.1399f, 20.7643f);
        this.f31679e.cubicTo(22.093f, 20.7643f, 23.7606f, 19.3538f, 24.0845f, 17.4278f);
        this.f31679e.close();
        this.f31679e.setFillType(Path.FillType.EVEN_ODD);
        this.f31678d.setStyle(Paint.Style.FILL);
        this.f31678d.setColor(-16777216);
        this.f30624a.add(this.f31678d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31679e, this.f31678d);
    }
}
