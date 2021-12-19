package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hi extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31597d;

    /* renamed from: e  reason: collision with root package name */
    Path f31598e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31599f;

    /* renamed from: g  reason: collision with root package name */
    Path f31600g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31601h;

    /* renamed from: i  reason: collision with root package name */
    Path f31602i;

    static {
        Covode.recordClassIndex(18334);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 6.0f);
        this.f30626c.cubicTo(14.0589f, 6.0f, 6.0f, 14.0589f, 6.0f, 24.0f);
        this.f30626c.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f30626c.cubicTo(33.9411f, 42.0f, 42.0f, 33.9411f, 42.0f, 24.0f);
        this.f30626c.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.moveTo(2.0f, 24.0f);
        this.f30626c.cubicTo(2.0f, 11.8497f, 11.8497f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(36.1503f, 2.0f, 46.0f, 11.8497f, 46.0f, 24.0f);
        this.f30626c.cubicTo(46.0f, 36.1503f, 36.1503f, 46.0f, 24.0f, 46.0f);
        this.f30626c.cubicTo(11.8497f, 46.0f, 2.0f, 36.1503f, 2.0f, 24.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31597d = new Paint();
        Path path = new Path();
        this.f31598e = path;
        path.moveTo(17.0f, 23.0f);
        this.f31598e.cubicTo(18.6569f, 23.0f, 20.0f, 21.2091f, 20.0f, 19.0f);
        this.f31598e.cubicTo(20.0f, 16.7909f, 18.6569f, 15.0f, 17.0f, 15.0f);
        this.f31598e.cubicTo(15.3431f, 15.0f, 14.0f, 16.7909f, 14.0f, 19.0f);
        this.f31598e.cubicTo(14.0f, 21.2091f, 15.3431f, 23.0f, 17.0f, 23.0f);
        this.f31598e.close();
        this.f31598e.setFillType(Path.FillType.EVEN_ODD);
        this.f31597d.setStyle(Paint.Style.FILL);
        this.f31597d.setColor(-16777216);
        this.f30624a.add(this.f31597d);
        this.f31599f = new Paint();
        Path path2 = new Path();
        this.f31600g = path2;
        path2.moveTo(31.0f, 23.0f);
        this.f31600g.cubicTo(32.6569f, 23.0f, 34.0f, 21.2091f, 34.0f, 19.0f);
        this.f31600g.cubicTo(34.0f, 16.7909f, 32.6569f, 15.0f, 31.0f, 15.0f);
        this.f31600g.cubicTo(29.3431f, 15.0f, 28.0f, 16.7909f, 28.0f, 19.0f);
        this.f31600g.cubicTo(28.0f, 21.2091f, 29.3431f, 23.0f, 31.0f, 23.0f);
        this.f31600g.close();
        this.f31600g.setFillType(Path.FillType.EVEN_ODD);
        this.f31599f.setStyle(Paint.Style.FILL);
        this.f31599f.setColor(-16777216);
        this.f30624a.add(this.f31599f);
        this.f31601h = new Paint();
        Path path3 = new Path();
        this.f31602i = path3;
        path3.moveTo(16.0f, 28.3431f);
        this.f31602i.cubicTo(16.0f, 31.4673f, 19.5817f, 36.0f, 24.0f, 36.0f);
        this.f31602i.cubicTo(28.4183f, 36.0f, 32.0f, 31.4673f, 32.0f, 28.3431f);
        this.f31602i.cubicTo(32.0f, 25.219f, 16.0f, 25.219f, 16.0f, 28.3431f);
        this.f31602i.close();
        this.f31602i.setFillType(Path.FillType.EVEN_ODD);
        this.f31601h.setStyle(Paint.Style.FILL);
        this.f31601h.setColor(-16777216);
        this.f30624a.add(this.f31601h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31598e, this.f31597d);
        canvas.drawPath(this.f31600g, this.f31599f);
        canvas.drawPath(this.f31602i, this.f31601h);
    }
}
