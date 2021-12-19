package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gi extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31537d;

    /* renamed from: e  reason: collision with root package name */
    Path f31538e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31539f;

    /* renamed from: g  reason: collision with root package name */
    Path f31540g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31541h;

    /* renamed from: i  reason: collision with root package name */
    Path f31542i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31543j;

    /* renamed from: k  reason: collision with root package name */
    Path f31544k;

    static {
        Covode.recordClassIndex(18307);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 40.4004f);
        this.f30626c.lineTo(30.2858f, 28.9708f);
        this.f30626c.cubicTo(30.49f, 28.5996f, 30.8067f, 28.3028f, 31.1904f, 28.1232f);
        this.f30626c.lineTo(40.0f, 23.9996f);
        this.f30626c.lineTo(24.0f, 23.9996f);
        this.f30626c.lineTo(24.0f, 40.4004f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-14289682);
        this.f31537d = new Paint();
        Path path = new Path();
        this.f31538e = path;
        path.moveTo(24.0f, 40.4004f);
        this.f31538e.lineTo(17.7142f, 28.9708f);
        this.f31538e.cubicTo(17.51f, 28.5996f, 17.1933f, 28.3028f, 16.8096f, 28.1232f);
        this.f31538e.lineTo(8.0f, 23.9996f);
        this.f31538e.lineTo(24.0f, 23.9996f);
        this.f31538e.lineTo(24.0f, 40.4004f);
        this.f31538e.close();
        this.f31538e.setFillType(Path.FillType.WINDING);
        this.f31537d.setStyle(Paint.Style.FILL);
        this.f31537d.setColor(-16725559);
        this.f30624a.add(this.f31537d);
        this.f31539f = new Paint();
        Path path2 = new Path();
        this.f31540g = path2;
        path2.moveTo(24.0f, 7.59961f);
        this.f31540g.lineTo(30.284f, 19.0636f);
        this.f31540g.cubicTo(30.4893f, 19.438f, 30.809f, 19.7369f, 31.1963f, 19.9166f);
        this.f31540g.lineTo(40.0f, 24.0f);
        this.f31540g.lineTo(24.0f, 24.0f);
        this.f31540g.lineTo(24.0f, 7.59961f);
        this.f31540g.close();
        this.f31540g.setFillType(Path.FillType.WINDING);
        this.f31539f.setStyle(Paint.Style.FILL);
        this.f31539f.setColor(-3080967);
        this.f30624a.add(this.f31539f);
        this.f31541h = new Paint();
        Path path3 = new Path();
        this.f31542i = path3;
        path3.moveTo(24.0f, 7.6001f);
        this.f31542i.lineTo(17.716f, 19.0641f);
        this.f31542i.cubicTo(17.5107f, 19.4385f, 17.191f, 19.7374f, 16.8037f, 19.9171f);
        this.f31542i.lineTo(8.0f, 24.0001f);
        this.f31542i.lineTo(24.0f, 24.0001f);
        this.f31542i.lineTo(24.0f, 7.6001f);
        this.f31542i.close();
        this.f31542i.setFillType(Path.FillType.WINDING);
        this.f31541h.setStyle(Paint.Style.FILL);
        this.f31541h.setColor(-14289682);
        this.f30624a.add(this.f31541h);
        this.f31543j = new Paint();
        Path path4 = new Path();
        this.f31544k = path4;
        path4.moveTo(24.0f, 7.62567f);
        this.f31544k.lineTo(17.7292f, 19.0657f);
        this.f31544k.cubicTo(17.5238f, 19.4404f, 17.2037f, 19.7395f, 16.8159f, 19.9191f);
        this.f31544k.lineTo(8.02577f, 23.9902f);
        this.f31544k.lineTo(16.8192f, 28.0824f);
        this.f31544k.cubicTo(17.2056f, 28.2622f, 17.5244f, 28.5607f, 17.7292f, 28.9343f);
        this.f31544k.lineTo(24.0071f, 40.3873f);
        this.f31544k.lineTo(30.2708f, 28.9603f);
        this.f31544k.cubicTo(30.4756f, 28.5866f, 30.7944f, 28.2881f, 31.1808f, 28.1083f);
        this.f31544k.lineTo(39.981f, 24.013f);
        this.f31544k.lineTo(31.1808f, 19.9176f);
        this.f31544k.cubicTo(30.7944f, 19.7378f, 30.4756f, 19.4393f, 30.2708f, 19.0657f);
        this.f31544k.lineTo(24.0f, 7.62567f);
        this.f31544k.close();
        this.f31544k.moveTo(21.6776f, 3.54073f);
        this.f31544k.cubicTo(22.0755f, 2.56667f, 23.0416f, 2.0f, 24.0f, 2.0f);
        this.f31544k.cubicTo(25.1328f, 2.0f, 25.9291f, 2.71197f, 26.2879f, 3.47787f);
        this.f31544k.lineTo(33.4631f, 16.5678f);
        this.f31544k.lineTo(44.462f, 21.6863f);
        this.f31544k.cubicTo(45.3968f, 22.0803f, 46.0f, 22.9829f, 46.0f, 24.013f);
        this.f31544k.cubicTo(46.0f, 25.043f, 45.3968f, 25.9456f, 44.462f, 26.3396f);
        this.f31544k.lineTo(33.4631f, 31.4581f);
        this.f31544k.lineTo(26.2722f, 44.5767f);
        this.f31544k.cubicTo(25.8866f, 45.3487f, 25.0457f, 46.0f, 24.0f, 46.0f);
        this.f31544k.cubicTo(22.8672f, 46.0f, 22.0709f, 45.2881f, 21.7121f, 44.5221f);
        this.f31544k.lineTo(14.5369f, 31.4322f);
        this.f31544k.lineTo(3.53804f, 26.3137f);
        this.f31544k.cubicTo(2.60323f, 25.9197f, 2.0f, 25.0171f, 2.0f, 23.987f);
        this.f31544k.cubicTo(2.0f, 22.9561f, 2.60422f, 22.0529f, 3.54032f, 21.6594f);
        this.f31544k.lineTo(14.5378f, 16.566f);
        this.f31544k.lineTo(21.6776f, 3.54073f);
        this.f31544k.close();
        this.f31544k.setFillType(Path.FillType.EVEN_ODD);
        this.f31543j.setStyle(Paint.Style.FILL);
        this.f31543j.setColor(-15329245);
        this.f30624a.add(this.f31543j);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31538e, this.f31537d);
        canvas.drawPath(this.f31540g, this.f31539f);
        canvas.drawPath(this.f31542i, this.f31541h);
        canvas.drawPath(this.f31544k, this.f31543j);
    }
}
