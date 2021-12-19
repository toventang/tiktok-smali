package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class nf extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31736d;

    /* renamed from: e  reason: collision with root package name */
    Path f31737e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31738f;

    /* renamed from: g  reason: collision with root package name */
    Path f31739g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31740h;

    /* renamed from: i  reason: collision with root package name */
    Path f31741i;

    static {
        Covode.recordClassIndex(18493);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(21.4001f, 12.7672f);
        this.f30626c.cubicTo(21.2049f, 12.572f, 21.2049f, 12.2554f, 21.4001f, 12.0601f);
        this.f30626c.lineTo(23.875f, 9.58524f);
        this.f30626c.cubicTo(24.656f, 8.80419f, 24.656f, 7.53786f, 23.875f, 6.75681f);
        this.f30626c.lineTo(23.2027f, 6.08449f);
        this.f30626c.cubicTo(23.0074f, 5.88923f, 23.0074f, 5.57265f, 23.2027f, 5.37739f);
        this.f30626c.lineTo(25.324f, 3.25607f);
        this.f30626c.cubicTo(25.5193f, 3.0608f, 25.8358f, 3.0608f, 26.0311f, 3.25607f);
        this.f30626c.lineTo(26.7034f, 3.92838f);
        this.f30626c.cubicTo(29.0466f, 6.27153f, 29.0466f, 10.0705f, 26.7034f, 12.4137f);
        this.f30626c.lineTo(24.2286f, 14.8885f);
        this.f30626c.cubicTo(24.0333f, 15.0838f, 23.7167f, 15.0838f, 23.5214f, 14.8885f);
        this.f30626c.lineTo(21.4001f, 12.7672f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31736d = new Paint();
        Path path = new Path();
        this.f31737e = path;
        path.moveTo(29.5296f, 20.1918f);
        this.f31737e.cubicTo(29.3344f, 20.3871f, 29.0178f, 20.3871f, 28.8225f, 20.1918f);
        this.f31737e.lineTo(26.7012f, 18.0705f);
        this.f31737e.cubicTo(26.5059f, 17.8752f, 26.5059f, 17.5587f, 26.7012f, 17.3634f);
        this.f31737e.lineTo(36.614f, 7.45057f);
        this.f31737e.cubicTo(36.8093f, 7.25531f, 37.1259f, 7.25531f, 37.3211f, 7.45057f);
        this.f31737e.lineTo(39.4425f, 9.57189f);
        this.f31737e.cubicTo(39.6377f, 9.76715f, 39.6377f, 10.0837f, 39.4425f, 10.279f);
        this.f31737e.lineTo(29.5296f, 20.1918f);
        this.f31737e.close();
        this.f31737e.setFillType(Path.FillType.WINDING);
        this.f31736d.setStyle(Paint.Style.FILL);
        this.f31736d.setColor(-16777216);
        this.f30624a.add(this.f31736d);
        this.f31738f = new Paint();
        Path path2 = new Path();
        this.f31739g = path2;
        path2.moveTo(16.8685f, 12.3399f);
        this.f31739g.cubicTo(16.3808f, 11.8522f, 15.6764f, 11.6502f, 15.0044f, 11.8053f);
        this.f31739g.cubicTo(14.3324f, 11.9605f, 13.7878f, 12.4508f, 13.5633f, 13.1029f);
        this.f31739g.lineTo(4.10904f, 40.5571f);
        this.f31739g.cubicTo(3.86006f, 41.2801f, 4.04513f, 42.0818f, 4.58584f, 42.6225f);
        this.f31739g.cubicTo(5.12655f, 43.1632f, 5.92824f, 43.3483f, 6.65125f, 43.0993f);
        this.f31739g.lineTo(34.1055f, 33.6451f);
        this.f31739g.cubicTo(34.7575f, 33.4206f, 35.2479f, 32.8759f, 35.403f, 32.204f);
        this.f31739g.cubicTo(35.5581f, 31.532f, 35.3561f, 30.8275f, 34.8685f, 30.3399f);
        this.f31739g.lineTo(16.8685f, 12.3399f);
        this.f31739g.close();
        this.f31739g.moveTo(9.22633f, 37.982f);
        this.f31739g.lineTo(16.3032f, 17.4314f);
        this.f31739g.lineTo(29.7769f, 30.9052f);
        this.f31739g.lineTo(9.22633f, 37.982f);
        this.f31739g.close();
        this.f31739g.setFillType(Path.FillType.EVEN_ODD);
        this.f31738f.setStyle(Paint.Style.FILL);
        this.f31738f.setColor(-16777216);
        this.f30624a.add(this.f31738f);
        this.f31740h = new Paint();
        Path path3 = new Path();
        this.f31741i = path3;
        path3.moveTo(34.8343f, 25.495f);
        this.f31741i.lineTo(38.7234f, 21.606f);
        this.f31741i.cubicTo(39.5045f, 20.8249f, 40.7708f, 20.8249f, 41.5518f, 21.606f);
        this.f31741i.lineTo(42.9661f, 23.0202f);
        this.f31741i.cubicTo(43.1613f, 23.2154f, 43.4779f, 23.2154f, 43.6732f, 23.0202f);
        this.f31741i.lineTo(45.7945f, 20.8988f);
        this.f31741i.cubicTo(45.9897f, 20.7036f, 45.9897f, 20.387f, 45.7945f, 20.1917f);
        this.f31741i.lineTo(44.3803f, 18.7775f);
        this.f31741i.cubicTo(42.0371f, 16.4344f, 38.2381f, 16.4344f, 35.895f, 18.7775f);
        this.f31741i.lineTo(32.0059f, 22.6666f);
        this.f31741i.cubicTo(31.8106f, 22.8619f, 31.8106f, 23.1785f, 32.0059f, 23.3737f);
        this.f31741i.lineTo(34.1272f, 25.495f);
        this.f31741i.cubicTo(34.3225f, 25.6903f, 34.6391f, 25.6903f, 34.8343f, 25.495f);
        this.f31741i.close();
        this.f31741i.setFillType(Path.FillType.WINDING);
        this.f31740h.setStyle(Paint.Style.FILL);
        this.f31740h.setColor(-16777216);
        this.f30624a.add(this.f31740h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31737e, this.f31736d);
        canvas.drawPath(this.f31739g, this.f31738f);
        canvas.drawPath(this.f31741i, this.f31740h);
    }
}
