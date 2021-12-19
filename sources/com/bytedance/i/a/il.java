package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class il extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31619d;

    /* renamed from: e  reason: collision with root package name */
    Path f31620e;

    static {
        Covode.recordClassIndex(18364);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(32.9986f, 33.9508f);
        this.f30626c.cubicTo(32.449f, 34.0053f, 32.0f, 34.4477f, 32.0f, 35.0f);
        this.f30626c.lineTo(32.0f, 37.0f);
        this.f30626c.cubicTo(32.0f, 37.5523f, 32.4492f, 38.0037f, 33.0001f, 37.9648f);
        this.f30626c.cubicTo(40.2654f, 37.452f, 46.0f, 31.3957f, 46.0f, 24.0f);
        this.f30626c.cubicTo(46.0f, 16.268f, 39.732f, 10.0f, 32.0f, 10.0f);
        this.f30626c.cubicTo(24.6043f, 10.0f, 18.548f, 15.7347f, 18.0352f, 22.9999f);
        this.f30626c.cubicTo(17.9963f, 23.5508f, 18.4477f, 24.0f, 19.0f, 24.0f);
        this.f30626c.lineTo(21.0f, 24.0f);
        this.f30626c.cubicTo(21.5523f, 24.0f, 21.9947f, 23.551f, 22.0492f, 23.0014f);
        this.f30626c.cubicTo(22.5503f, 17.9474f, 26.8142f, 14.0f, 32.0f, 14.0f);
        this.f30626c.cubicTo(37.5228f, 14.0f, 42.0f, 18.4771f, 42.0f, 24.0f);
        this.f30626c.cubicTo(42.0f, 29.1858f, 38.0526f, 33.4497f, 32.9986f, 33.9508f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31619d = new Paint();
        Path path = new Path();
        this.f31620e = path;
        path.moveTo(15.0014f, 14.0492f);
        this.f31620e.cubicTo(15.551f, 13.9947f, 16.0f, 13.5523f, 16.0f, 13.0f);
        this.f31620e.lineTo(16.0f, 11.0f);
        this.f31620e.cubicTo(16.0f, 10.4477f, 15.5508f, 9.99629f, 14.9999f, 10.0352f);
        this.f31620e.cubicTo(7.73465f, 10.548f, 2.0f, 16.6043f, 2.0f, 24.0f);
        this.f31620e.cubicTo(2.0f, 31.732f, 8.26801f, 38.0f, 16.0f, 38.0f);
        this.f31620e.cubicTo(23.3957f, 38.0f, 29.452f, 32.2654f, 29.9648f, 25.0001f);
        this.f31620e.cubicTo(30.0037f, 24.4492f, 29.5523f, 24.0f, 29.0f, 24.0f);
        this.f31620e.lineTo(27.0f, 24.0f);
        this.f31620e.cubicTo(26.4477f, 24.0f, 26.0053f, 24.449f, 25.9508f, 24.9986f);
        this.f31620e.cubicTo(25.4497f, 30.0526f, 21.1858f, 34.0f, 16.0f, 34.0f);
        this.f31620e.cubicTo(10.4772f, 34.0f, 6.0f, 29.5228f, 6.0f, 24.0f);
        this.f31620e.cubicTo(6.0f, 18.8142f, 9.94741f, 14.5503f, 15.0014f, 14.0492f);
        this.f31620e.close();
        this.f31620e.setFillType(Path.FillType.WINDING);
        this.f31619d.setStyle(Paint.Style.FILL);
        this.f31619d.setColor(-16777216);
        this.f30624a.add(this.f31619d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31620e, this.f31619d);
    }
}
