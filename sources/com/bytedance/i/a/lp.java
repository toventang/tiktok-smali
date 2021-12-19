package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class lp extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31714d;

    /* renamed from: e  reason: collision with root package name */
    Path f31715e;

    static {
        Covode.recordClassIndex(18449);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(10.0f, 7.89474f);
        this.f30626c.cubicTo(10.0f, 7.40059f, 10.3918f, 7.0f, 10.875f, 7.0f);
        this.f30626c.lineTo(17.875f, 7.0f);
        this.f30626c.cubicTo(18.3582f, 7.0f, 18.75f, 7.40059f, 18.75f, 7.89474f);
        this.f30626c.lineTo(18.75f, 40.1053f);
        this.f30626c.cubicTo(18.75f, 40.5994f, 18.3582f, 41.0f, 17.875f, 41.0f);
        this.f30626c.lineTo(10.875f, 41.0f);
        this.f30626c.cubicTo(10.3918f, 41.0f, 10.0f, 40.5994f, 10.0f, 40.1053f);
        this.f30626c.lineTo(10.0f, 7.89474f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31714d = new Paint();
        Path path = new Path();
        this.f31715e = path;
        path.moveTo(29.25f, 7.89474f);
        this.f31715e.cubicTo(29.25f, 7.40059f, 29.6418f, 7.0f, 30.125f, 7.0f);
        this.f31715e.lineTo(37.125f, 7.0f);
        this.f31715e.cubicTo(37.6082f, 7.0f, 38.0f, 7.40059f, 38.0f, 7.89474f);
        this.f31715e.lineTo(38.0f, 40.1053f);
        this.f31715e.cubicTo(38.0f, 40.5994f, 37.6082f, 41.0f, 37.125f, 41.0f);
        this.f31715e.lineTo(30.125f, 41.0f);
        this.f31715e.cubicTo(29.6418f, 41.0f, 29.25f, 40.5994f, 29.25f, 40.1053f);
        this.f31715e.lineTo(29.25f, 7.89474f);
        this.f31715e.close();
        this.f31715e.setFillType(Path.FillType.WINDING);
        this.f31714d.setStyle(Paint.Style.FILL);
        this.f31714d.setColor(-16777216);
        this.f30624a.add(this.f31714d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31715e, this.f31714d);
    }
}
