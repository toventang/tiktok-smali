package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gp extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31573d;

    /* renamed from: e  reason: collision with root package name */
    Path f31574e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31575f;

    /* renamed from: g  reason: collision with root package name */
    Path f31576g;

    static {
        Covode.recordClassIndex(18314);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 48.0f);
        this.f30626c.cubicTo(37.2548f, 48.0f, 48.0f, 37.2548f, 48.0f, 24.0f);
        this.f30626c.cubicTo(48.0f, 10.7452f, 37.2548f, 0.0f, 24.0f, 0.0f);
        this.f30626c.cubicTo(10.7452f, 0.0f, 0.0f, 10.7452f, 0.0f, 24.0f);
        this.f30626c.cubicTo(0.0f, 37.2548f, 10.7452f, 48.0f, 24.0f, 48.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-21199);
        this.f31573d = new Paint();
        Path path = new Path();
        this.f31574e = path;
        path.moveTo(25.75f, 24.0f);
        this.f31574e.cubicTo(26.7165f, 24.0f, 27.5f, 23.2165f, 27.5f, 22.25f);
        this.f31574e.cubicTo(27.5f, 21.2835f, 26.7165f, 20.5f, 25.75f, 20.5f);
        this.f31574e.cubicTo(24.7835f, 20.5f, 24.0f, 21.2835f, 24.0f, 22.25f);
        this.f31574e.cubicTo(24.0f, 23.2165f, 24.7835f, 24.0f, 25.75f, 24.0f);
        this.f31574e.close();
        this.f31574e.setFillType(Path.FillType.WINDING);
        this.f31573d.setStyle(Paint.Style.FILL);
        this.f31573d.setColor(-1);
        this.f30624a.add(this.f31573d);
        this.f31575f = new Paint();
        Path path2 = new Path();
        this.f31576g = path2;
        path2.moveTo(24.0001f, 14.2f);
        this.f31576g.cubicTo(15.0883f, 14.2f, 10.6084f, 20.4047f, 9.14987f, 22.94f);
        this.f31576g.cubicTo(8.76775f, 23.6042f, 8.76775f, 24.3958f, 9.14987f, 25.06f);
        this.f31576g.cubicTo(10.6084f, 27.5953f, 15.0883f, 33.8f, 24.0001f, 33.8f);
        this.f31576g.cubicTo(32.9119f, 33.8f, 37.3917f, 27.5953f, 38.8503f, 25.06f);
        this.f31576g.cubicTo(39.2324f, 24.3958f, 39.2324f, 23.6042f, 38.8503f, 22.94f);
        this.f31576g.cubicTo(37.3917f, 20.4047f, 32.9119f, 14.2f, 24.0001f, 14.2f);
        this.f31576g.close();
        this.f31576g.moveTo(29.6f, 24.0f);
        this.f31576g.cubicTo(29.6f, 27.0928f, 27.0928f, 29.6f, 24.0f, 29.6f);
        this.f31576g.cubicTo(20.9072f, 29.6f, 18.4f, 27.0928f, 18.4f, 24.0f);
        this.f31576g.cubicTo(18.4f, 20.9072f, 20.9072f, 18.4f, 24.0f, 18.4f);
        this.f31576g.cubicTo(27.0928f, 18.4f, 29.6f, 20.9072f, 29.6f, 24.0f);
        this.f31576g.close();
        this.f31576g.setFillType(Path.FillType.EVEN_ODD);
        this.f31575f.setStyle(Paint.Style.FILL);
        this.f31575f.setColor(-1);
        this.f30624a.add(this.f31575f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31574e, this.f31573d);
        canvas.drawPath(this.f31576g, this.f31575f);
    }
}
