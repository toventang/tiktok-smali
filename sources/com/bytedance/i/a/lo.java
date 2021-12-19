package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class lo extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31712d;

    /* renamed from: e  reason: collision with root package name */
    Path f31713e;

    static {
        Covode.recordClassIndex(18448);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 6.0f);
        this.f30626c.cubicTo(8.0f, 5.44771f, 8.44772f, 5.0f, 9.0f, 5.0f);
        this.f30626c.lineTo(17.0f, 5.0f);
        this.f30626c.cubicTo(17.5523f, 5.0f, 18.0f, 5.44772f, 18.0f, 6.0f);
        this.f30626c.lineTo(18.0f, 42.0f);
        this.f30626c.cubicTo(18.0f, 42.5523f, 17.5523f, 43.0f, 17.0f, 43.0f);
        this.f30626c.lineTo(9.0f, 43.0f);
        this.f30626c.cubicTo(8.44772f, 43.0f, 8.0f, 42.5523f, 8.0f, 42.0f);
        this.f30626c.lineTo(8.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31712d = new Paint();
        Path path = new Path();
        this.f31713e = path;
        path.moveTo(30.0f, 6.0f);
        this.f31713e.cubicTo(30.0f, 5.44771f, 30.4477f, 5.0f, 31.0f, 5.0f);
        this.f31713e.lineTo(39.0f, 5.0f);
        this.f31713e.cubicTo(39.5523f, 5.0f, 40.0f, 5.44772f, 40.0f, 6.0f);
        this.f31713e.lineTo(40.0f, 42.0f);
        this.f31713e.cubicTo(40.0f, 42.5523f, 39.5523f, 43.0f, 39.0f, 43.0f);
        this.f31713e.lineTo(31.0f, 43.0f);
        this.f31713e.cubicTo(30.4477f, 43.0f, 30.0f, 42.5523f, 30.0f, 42.0f);
        this.f31713e.lineTo(30.0f, 6.0f);
        this.f31713e.close();
        this.f31713e.setFillType(Path.FillType.WINDING);
        this.f31712d.setStyle(Paint.Style.FILL);
        this.f31712d.setColor(-16777216);
        this.f30624a.add(this.f31712d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31713e, this.f31712d);
    }
}
