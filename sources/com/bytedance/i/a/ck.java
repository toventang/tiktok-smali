package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ck extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31333d;

    /* renamed from: e  reason: collision with root package name */
    Path f31334e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31335f;

    /* renamed from: g  reason: collision with root package name */
    Path f31336g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31337h;

    /* renamed from: i  reason: collision with root package name */
    Path f31338i;

    static {
        Covode.recordClassIndex(18201);
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
        this.f30625b.setColor(-119723);
        this.f31333d = new Paint();
        Path path = new Path();
        this.f31334e = path;
        path.moveTo(12.9971f, 11.4663f);
        this.f31334e.cubicTo(12.9971f, 11.3006f, 12.8628f, 11.1663f, 12.6971f, 11.1663f);
        this.f31334e.lineTo(10.2507f, 11.1663f);
        this.f31334e.cubicTo(8.22561f, 11.1663f, 6.58398f, 12.8079f, 6.58398f, 14.833f);
        this.f31334e.lineTo(6.58398f, 34.9997f);
        this.f31334e.cubicTo(6.58398f, 37.0247f, 8.22561f, 38.6663f, 10.2507f, 38.6663f);
        this.f31334e.lineTo(37.7507f, 38.6663f);
        this.f31334e.cubicTo(39.7757f, 38.6663f, 41.4173f, 37.0247f, 41.4173f, 34.9997f);
        this.f31334e.lineTo(41.4173f, 14.833f);
        this.f31334e.cubicTo(41.4173f, 12.8079f, 39.7757f, 11.1663f, 37.7507f, 11.1663f);
        this.f31334e.lineTo(35.2971f, 11.1663f);
        this.f31334e.cubicTo(35.1314f, 11.1663f, 34.9971f, 11.3006f, 34.9971f, 11.4663f);
        this.f31334e.lineTo(34.9971f, 12.0821f);
        this.f31334e.cubicTo(34.9971f, 13.6009f, 33.7659f, 14.8321f, 32.2471f, 14.8321f);
        this.f31334e.lineTo(30.4137f, 14.8321f);
        this.f31334e.cubicTo(28.895f, 14.8321f, 27.6637f, 13.6009f, 27.6637f, 12.0821f);
        this.f31334e.lineTo(27.6637f, 11.4663f);
        this.f31334e.cubicTo(27.6637f, 11.3006f, 27.5294f, 11.1663f, 27.3637f, 11.1663f);
        this.f31334e.lineTo(20.6304f, 11.1663f);
        this.f31334e.cubicTo(20.4647f, 11.1663f, 20.3304f, 11.3006f, 20.3304f, 11.4663f);
        this.f31334e.lineTo(20.3304f, 12.0821f);
        this.f31334e.cubicTo(20.3304f, 13.6009f, 19.0992f, 14.8321f, 17.5804f, 14.8321f);
        this.f31334e.lineTo(15.7471f, 14.8321f);
        this.f31334e.cubicTo(14.2283f, 14.8321f, 12.9971f, 13.6009f, 12.9971f, 12.0821f);
        this.f31334e.lineTo(12.9971f, 11.4663f);
        this.f31334e.close();
        this.f31334e.moveTo(14.8304f, 11.1663f);
        this.f31334e.lineTo(18.4971f, 11.1663f);
        this.f31334e.lineTo(18.4971f, 12.0821f);
        this.f31334e.cubicTo(18.4971f, 12.5884f, 18.0867f, 12.9988f, 17.5804f, 12.9988f);
        this.f31334e.lineTo(15.7471f, 12.9988f);
        this.f31334e.cubicTo(15.2408f, 12.9988f, 14.8304f, 12.5884f, 14.8304f, 12.0821f);
        this.f31334e.lineTo(14.8304f, 11.1663f);
        this.f31334e.close();
        this.f31334e.moveTo(29.4971f, 11.1663f);
        this.f31334e.lineTo(29.4971f, 12.0821f);
        this.f31334e.cubicTo(29.4971f, 12.5884f, 29.9075f, 12.9988f, 30.4137f, 12.9988f);
        this.f31334e.lineTo(32.2471f, 12.9988f);
        this.f31334e.cubicTo(32.7533f, 12.9988f, 33.1637f, 12.5884f, 33.1637f, 12.0821f);
        this.f31334e.lineTo(33.1637f, 11.1663f);
        this.f31334e.lineTo(29.4971f, 11.1663f);
        this.f31334e.close();
        this.f31334e.setFillType(Path.FillType.EVEN_ODD);
        this.f31333d.setStyle(Paint.Style.FILL);
        this.f31333d.setColor(-1);
        this.f30624a.add(this.f31333d);
        this.f31335f = new Paint();
        Path path2 = new Path();
        this.f31336g = path2;
        path2.moveTo(15.7507f, 5.66605f);
        this.f31336g.cubicTo(15.2444f, 5.66605f, 14.834f, 6.07645f, 14.834f, 6.58271f);
        this.f31336g.lineTo(14.834f, 12.0827f);
        this.f31336g.cubicTo(14.834f, 12.589f, 15.2444f, 12.9994f, 15.7507f, 12.9994f);
        this.f31336g.lineTo(17.584f, 12.9994f);
        this.f31336g.cubicTo(18.0902f, 12.9994f, 18.5007f, 12.589f, 18.5007f, 12.0827f);
        this.f31336g.lineTo(18.5007f, 6.58271f);
        this.f31336g.cubicTo(18.5007f, 6.07645f, 18.0902f, 5.66605f, 17.584f, 5.66605f);
        this.f31336g.lineTo(15.7507f, 5.66605f);
        this.f31336g.close();
        this.f31336g.moveTo(30.4173f, 5.66605f);
        this.f31336g.cubicTo(29.9111f, 5.66605f, 29.5006f, 6.07645f, 29.5006f, 6.58271f);
        this.f31336g.lineTo(29.5006f, 12.0827f);
        this.f31336g.cubicTo(29.5006f, 12.589f, 29.9111f, 12.9994f, 30.4173f, 12.9994f);
        this.f31336g.lineTo(32.2506f, 12.9994f);
        this.f31336g.cubicTo(32.7569f, 12.9994f, 33.1673f, 12.589f, 33.1673f, 12.0827f);
        this.f31336g.lineTo(33.1673f, 6.58271f);
        this.f31336g.cubicTo(33.1673f, 6.07645f, 32.7569f, 5.66605f, 32.2506f, 5.66605f);
        this.f31336g.lineTo(30.4173f, 5.66605f);
        this.f31336g.close();
        this.f31336g.setFillType(Path.FillType.EVEN_ODD);
        this.f31335f.setStyle(Paint.Style.FILL);
        this.f31335f.setColor(-1);
        this.f30624a.add(this.f31335f);
        this.f31337h = new Paint();
        Path path3 = new Path();
        this.f31338i = path3;
        path3.moveTo(21.4924f, 21.5068f);
        this.f31338i.lineTo(23.0737f, 18.5162f);
        this.f31338i.cubicTo(23.4701f, 17.7665f, 24.5335f, 17.7589f, 24.9404f, 18.5028f);
        this.f31338i.lineTo(26.5908f, 21.5202f);
        this.f31338i.cubicTo(26.7402f, 21.7932f, 27.0003f, 21.9871f, 27.3031f, 22.0509f);
        this.f31338i.lineTo(30.7145f, 22.7706f);
        this.f31338i.cubicTo(31.5087f, 22.9381f, 31.8304f, 23.9053f, 31.297f, 24.5215f);
        this.f31338i.lineTo(28.843f, 27.3565f);
        this.f31338i.cubicTo(28.6409f, 27.5899f, 28.5491f, 27.9001f, 28.5914f, 28.207f);
        this.f31338i.lineTo(29.0934f, 31.8551f);
        this.f31338i.cubicTo(29.2116f, 32.7136f, 28.3211f, 33.3501f, 27.5563f, 32.9538f);
        this.f31338i.lineTo(24.4802f, 31.36f);
        this.f31338i.cubicTo(24.1756f, 31.2021f, 23.8141f, 31.2021f, 23.5094f, 31.36f);
        this.f31338i.lineTo(20.4333f, 32.9538f);
        this.f31338i.cubicTo(19.6686f, 33.3501f, 18.7781f, 32.7136f, 18.8962f, 31.8551f);
        this.f31338i.lineTo(19.3983f, 28.207f);
        this.f31338i.cubicTo(19.4405f, 27.9001f, 19.3487f, 27.5899f, 19.1467f, 27.3565f);
        this.f31338i.lineTo(16.6972f, 24.5267f);
        this.f31338i.cubicTo(16.1627f, 23.9093f, 16.4869f, 22.9403f, 17.2831f, 22.7751f);
        this.f31338i.lineTo(20.7695f, 22.0517f);
        this.f31338i.cubicTo(21.0789f, 21.9875f, 21.3439f, 21.7878f, 21.4924f, 21.5068f);
        this.f31338i.close();
        this.f31338i.setFillType(Path.FillType.WINDING);
        this.f31337h.setStyle(Paint.Style.FILL);
        this.f31337h.setColor(-119723);
        this.f30624a.add(this.f31337h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31334e, this.f31333d);
        canvas.drawPath(this.f31336g, this.f31335f);
        canvas.drawPath(this.f31338i, this.f31337h);
    }
}
