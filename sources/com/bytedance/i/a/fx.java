package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fx extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31485d;

    /* renamed from: e  reason: collision with root package name */
    Path f31486e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31487f;

    /* renamed from: g  reason: collision with root package name */
    Path f31488g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31489h;

    /* renamed from: i  reason: collision with root package name */
    Path f31490i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31491j;

    /* renamed from: k  reason: collision with root package name */
    Path f31492k;

    /* renamed from: l  reason: collision with root package name */
    Paint f31493l;

    /* renamed from: m  reason: collision with root package name */
    Path f31494m;
    Paint n;
    Path o;

    static {
        Covode.recordClassIndex(18295);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(6.0f, 20.0f);
        this.f30626c.lineTo(42.0f, 20.0f);
        this.f30626c.lineTo(42.0f, 42.0f);
        this.f30626c.cubicTo(42.0f, 43.6569f, 40.6569f, 45.0f, 39.0f, 45.0f);
        this.f30626c.lineTo(9.0f, 45.0f);
        this.f30626c.cubicTo(7.34315f, 45.0f, 6.0f, 43.6569f, 6.0f, 42.0f);
        this.f30626c.lineTo(6.0f, 20.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-572557);
        this.f31485d = new Paint();
        Path path = new Path();
        this.f31486e = path;
        path.moveTo(3.0f, 15.0f);
        this.f31486e.cubicTo(3.0f, 13.5f, 3.5f, 13.0f, 5.0f, 13.0f);
        this.f31486e.lineTo(43.0f, 13.0f);
        this.f31486e.cubicTo(44.5f, 13.0f, 45.0f, 13.5f, 45.0f, 15.0f);
        this.f31486e.lineTo(45.0f, 20.0f);
        this.f31486e.cubicTo(45.0f, 20.5523f, 44.5523f, 21.0f, 44.0f, 21.0f);
        this.f31486e.lineTo(4.0f, 21.0f);
        this.f31486e.cubicTo(3.44772f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f);
        this.f31486e.lineTo(3.0f, 15.0f);
        this.f31486e.close();
        this.f31486e.setFillType(Path.FillType.WINDING);
        this.f31485d.setStyle(Paint.Style.FILL);
        this.f31485d.setColor(-38245);
        this.f30624a.add(this.f31485d);
        this.f31487f = new Paint();
        Path path2 = new Path();
        this.f31488g = path2;
        path2.moveTo(20.0f, 13.0f);
        this.f31488g.lineTo(28.0f, 13.0f);
        this.f31488g.lineTo(28.0f, 37.0f);
        this.f31488g.lineTo(24.0f, 34.0f);
        this.f31488g.lineTo(20.0f, 37.0f);
        this.f31488g.lineTo(20.0f, 13.0f);
        this.f31488g.close();
        this.f31488g.setFillType(Path.FillType.WINDING);
        this.f31487f.setStyle(Paint.Style.FILL);
        this.f31487f.setColor(-1);
        this.f30624a.add(this.f31487f);
        this.f31489h = new Paint();
        Path path3 = new Path();
        this.f31490i = path3;
        path3.moveTo(6.0f, 21.0f);
        this.f31490i.lineTo(42.0f, 21.0f);
        this.f31490i.lineTo(42.0f, 26.0f);
        this.f31490i.cubicTo(42.0f, 26.0f, 31.0403f, 25.0f, 24.0f, 25.0f);
        this.f31490i.cubicTo(16.9597f, 25.0f, 6.0f, 26.0f, 6.0f, 26.0f);
        this.f31490i.lineTo(6.0f, 21.0f);
        this.f31490i.close();
        this.f31490i.setFillType(Path.FillType.WINDING);
        this.f31489h.setStyle(Paint.Style.FILL);
        this.f31489h.setColor(-16777216);
        this.f31489h.setAlpha(25);
        this.f30624a.add(this.f31489h);
        this.f31491j = new Paint();
        Path path4 = new Path();
        this.f31492k = path4;
        path4.moveTo(15.2606f, 5.1899f);
        this.f31492k.cubicTo(14.6292f, 5.00557f, 14.0702f, 5.00001f, 13.5f, 5.00001f);
        this.f31492k.cubicTo(12.1193f, 5.00001f, 11.0f, 6.11929f, 11.0f, 7.50001f);
        this.f31492k.cubicTo(11.0f, 8.88072f, 12.1193f, 10.0f, 13.5f, 10.0f);
        this.f31492k.lineTo(19.9507f, 10.0f);
        this.f31492k.cubicTo(19.2141f, 8.77439f, 18.2973f, 7.41863f, 17.4393f, 6.56067f);
        this.f31492k.cubicTo(16.6146f, 5.73595f, 15.8711f, 5.36814f, 15.2606f, 5.1899f);
        this.f31492k.close();
        this.f31492k.moveTo(23.8415f, 10.8289f);
        this.f31492k.lineTo(23.8391f, 10.8242f);
        this.f31492k.lineTo(23.8337f, 10.8134f);
        this.f31492k.lineTo(23.8143f, 10.775f);
        this.f31492k.cubicTo(23.7976f, 10.7422f, 23.7735f, 10.6951f, 23.7425f, 10.6351f);
        this.f31492k.cubicTo(23.6805f, 10.5152f, 23.5907f, 10.3438f, 23.477f, 10.1326f);
        this.f31492k.cubicTo(23.2499f, 9.71098f, 22.9258f, 9.1276f, 22.5362f, 8.47826f);
        this.f31492k.cubicTo(21.775f, 7.20956f, 20.6976f, 5.5763f, 19.5607f, 4.43935f);
        this.f31492k.cubicTo(18.3854f, 3.26407f, 17.2035f, 2.63187f, 16.1013f, 2.31011f);
        this.f31492k.cubicTo(15.0382f, 1.99976f, 14.1107f, 1.99991f, 13.5296f, 2.0f);
        this.f31492k.cubicTo(13.5196f, 2.0f, 13.5098f, 2.00001f, 13.5f, 2.00001f);
        this.f31492k.cubicTo(10.4624f, 2.00001f, 8.0f, 4.46244f, 8.0f, 7.50001f);
        this.f31492k.cubicTo(8.0f, 10.5376f, 10.4624f, 13.0f, 13.5f, 13.0f);
        this.f31492k.lineTo(24.9271f, 13.0f);
        this.f31492k.lineTo(23.8415f, 10.8289f);
        this.f31492k.close();
        this.f31492k.setFillType(Path.FillType.EVEN_ODD);
        this.f31491j.setStyle(Paint.Style.FILL);
        this.f31491j.setColor(-33122);
        this.f30624a.add(this.f31491j);
        this.f31493l = new Paint();
        Path path5 = new Path();
        this.f31494m = path5;
        path5.moveTo(32.2081f, 5.1899f);
        this.f31494m.cubicTo(32.8423f, 5.00556f, 33.4037f, 5.0f, 33.9763f, 5.0f);
        this.f31494m.cubicTo(35.363f, 5.0f, 36.4871f, 6.11929f, 36.4871f, 7.5f);
        this.f31494m.cubicTo(36.4871f, 8.88071f, 35.363f, 10.0f, 33.9763f, 10.0f);
        this.f31494m.lineTo(27.4978f, 10.0f);
        this.f31494m.cubicTo(28.2375f, 8.77439f, 29.1583f, 7.41863f, 30.02f, 6.56066f);
        this.f31494m.cubicTo(30.8483f, 5.73594f, 31.595f, 5.36813f, 32.2081f, 5.1899f);
        this.f31494m.close();
        this.f31494m.moveTo(23.5902f, 10.8289f);
        this.f31494m.lineTo(23.5926f, 10.8242f);
        this.f31494m.lineTo(23.5981f, 10.8134f);
        this.f31494m.lineTo(23.6176f, 10.775f);
        this.f31494m.cubicTo(23.6343f, 10.7422f, 23.6585f, 10.6951f, 23.6897f, 10.6351f);
        this.f31494m.cubicTo(23.752f, 10.5152f, 23.8422f, 10.3437f, 23.9563f, 10.1326f);
        this.f31494m.cubicTo(24.1844f, 9.71098f, 24.5098f, 9.12759f, 24.9011f, 8.47826f);
        this.f31494m.cubicTo(25.6656f, 7.20955f, 26.7477f, 5.5763f, 27.8895f, 4.43934f);
        this.f31494m.cubicTo(29.0699f, 3.26406f, 30.2569f, 2.63187f, 31.3638f, 2.31011f);
        this.f31494m.cubicTo(32.4314f, 1.99976f, 33.3629f, 1.99991f, 33.9466f, 2.0f);
        this.f31494m.cubicTo(33.9566f, 2.0f, 33.9665f, 2.0f, 33.9763f, 2.0f);
        this.f31494m.cubicTo(37.027f, 2.0f, 39.5f, 4.46244f, 39.5f, 7.5f);
        this.f31494m.cubicTo(39.5f, 10.5376f, 37.027f, 13.0f, 33.9763f, 13.0f);
        this.f31494m.lineTo(22.5f, 13.0f);
        this.f31494m.lineTo(23.5902f, 10.8289f);
        this.f31494m.close();
        this.f31494m.setFillType(Path.FillType.EVEN_ODD);
        this.f31493l.setStyle(Paint.Style.FILL);
        this.f31493l.setColor(-30294);
        this.f30624a.add(this.f31493l);
        this.n = new Paint();
        Path path6 = new Path();
        this.o = path6;
        path6.moveTo(23.1799f, 9.56723f);
        this.o.lineTo(23.7227f, 10.5859f);
        this.o.lineTo(22.5119f, 12.9856f);
        this.o.lineTo(21.5012f, 12.9856f);
        this.o.lineTo(23.1799f, 9.56723f);
        this.o.close();
        this.o.setFillType(Path.FillType.WINDING);
        this.n.setStyle(Paint.Style.FILL);
        this.n.setColor(-16777216);
        this.n.setAlpha(25);
        this.f30624a.add(this.n);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31486e, this.f31485d);
        canvas.drawPath(this.f31488g, this.f31487f);
        canvas.drawPath(this.f31490i, this.f31489h);
        canvas.drawPath(this.f31492k, this.f31491j);
        canvas.drawPath(this.f31494m, this.f31493l);
        canvas.drawPath(this.o, this.n);
    }
}
