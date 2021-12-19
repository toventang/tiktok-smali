package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ka extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31676d;

    /* renamed from: e  reason: collision with root package name */
    Path f31677e;

    static {
        Covode.recordClassIndex(18407);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.6276f, 20.2241f);
        this.f30626c.cubicTo(16.6276f, 30.8074f, 25.2394f, 39.4192f, 35.8227f, 39.4192f);
        this.f30626c.cubicTo(46.4059f, 39.4192f, 55.0178f, 30.8074f, 55.0178f, 20.2241f);
        this.f30626c.cubicTo(55.0178f, 9.64086f, 46.4059f, 1.02899f, 35.8227f, 1.02899f);
        this.f30626c.cubicTo(25.2394f, 1.02899f, 16.6276f, 9.64086f, 16.6276f, 20.2241f);
        this.f30626c.close();
        this.f30626c.moveTo(19.7405f, 20.2244f);
        this.f30626c.cubicTo(19.7405f, 11.3583f, 26.9568f, 4.14202f, 35.8229f, 4.14202f);
        this.f30626c.cubicTo(44.689f, 4.14202f, 51.9053f, 11.3583f, 51.9053f, 20.2244f);
        this.f30626c.cubicTo(51.9053f, 29.0905f, 44.689f, 36.3068f, 35.8229f, 36.3068f);
        this.f30626c.cubicTo(26.9568f, 36.3068f, 19.7405f, 29.0905f, 19.7405f, 20.2244f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31676d = new Paint();
        Path path = new Path();
        this.f31677e = path;
        path.moveTo(6.69813f, 70.9717f);
        this.f31677e.cubicTo(6.56844f, 70.9717f, 6.43874f, 70.9562f, 6.30904f, 70.9199f);
        this.f31677e.cubicTo(5.47898f, 70.7072f, 4.97576f, 69.8563f, 5.19365f, 69.0263f);
        this.f31677e.cubicTo(8.79922f, 55.045f, 21.3954f, 45.2762f, 35.8228f, 45.2762f);
        this.f31677e.cubicTo(50.2503f, 45.2762f, 62.8465f, 55.0398f, 66.4572f, 69.0211f);
        this.f31677e.cubicTo(66.6699f, 69.8512f, 66.1719f, 70.702f, 65.3366f, 70.9147f);
        this.f31677e.cubicTo(64.5014f, 71.1326f, 63.6558f, 70.6293f, 63.4379f, 69.7941f);
        this.f31677e.cubicTo(60.1851f, 57.1876f, 48.8288f, 48.3837f, 35.8176f, 48.3837f);
        this.f31677e.cubicTo(22.8117f, 48.3837f, 11.4554f, 57.1876f, 8.19743f, 69.7941f);
        this.f31677e.cubicTo(8.02104f, 70.5048f, 7.39331f, 70.9717f, 6.69813f, 70.9717f);
        this.f31677e.close();
        this.f31677e.setFillType(Path.FillType.WINDING);
        this.f31676d.setStyle(Paint.Style.FILL);
        this.f31676d.setColor(-16777216);
        this.f30624a.add(this.f31676d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31677e, this.f31676d);
    }
}
