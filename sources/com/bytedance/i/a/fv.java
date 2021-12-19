package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fv extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31479d;

    /* renamed from: e  reason: collision with root package name */
    Path f31480e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31481f;

    /* renamed from: g  reason: collision with root package name */
    Path f31482g;

    static {
        Covode.recordClassIndex(18293);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.addCircle(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-3947581);
        this.f31479d = new Paint();
        Path path = new Path();
        this.f31480e = path;
        path.addCircle(24.0f, 22.0f, 9.0f, Path.Direction.CW);
        this.f31479d.setStyle(Paint.Style.FILL);
        this.f31479d.setColor(-986896);
        this.f30624a.add(this.f31479d);
        this.f31481f = new Paint();
        Path path2 = new Path();
        this.f31482g = path2;
        path2.moveTo(8.28003f, 42.1649f);
        this.f31482g.cubicTo(11.3682f, 36.6939f, 17.2358f, 33.0f, 23.9662f, 33.0f);
        this.f31482g.cubicTo(30.6966f, 33.0f, 36.5642f, 36.6939f, 39.6523f, 42.1649f);
        this.f31482g.cubicTo(35.4456f, 45.8008f, 29.9627f, 48.0f, 23.9662f, 48.0f);
        this.f31482g.cubicTo(17.9696f, 48.0f, 12.4867f, 45.8008f, 8.28003f, 42.1649f);
        this.f31482g.close();
        this.f31482g.setFillType(Path.FillType.EVEN_ODD);
        this.f31481f.setStyle(Paint.Style.FILL);
        this.f31481f.setColor(-986896);
        this.f30624a.add(this.f31481f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31480e, this.f31479d);
        canvas.drawPath(this.f31482g, this.f31481f);
    }
}
