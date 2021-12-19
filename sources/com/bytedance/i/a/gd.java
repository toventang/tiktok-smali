package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gd extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31521d;

    /* renamed from: e  reason: collision with root package name */
    Path f31522e;

    static {
        Covode.recordClassIndex(18302);
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
        this.f30625b.setColor(-119723);
        this.f31521d = new Paint();
        Path path = new Path();
        this.f31522e = path;
        path.moveTo(13.1626f, 14.9442f);
        this.f31522e.cubicTo(16.1623f, 11.9237f, 20.8855f, 11.9405f, 24.0f, 15.2778f);
        this.f31522e.cubicTo(27.1145f, 11.9405f, 31.8377f, 11.9237f, 34.8374f, 14.9442f);
        this.f31522e.cubicTo(37.8875f, 18.0156f, 37.8875f, 22.9914f, 34.8374f, 26.0628f);
        this.f31522e.lineTo(24.8471f, 36.1225f);
        this.f31522e.cubicTo(24.623f, 36.3481f, 24.3181f, 36.475f, 24.0f, 36.475f);
        this.f31522e.cubicTo(23.6819f, 36.475f, 23.377f, 36.3481f, 23.1529f, 36.1225f);
        this.f31522e.lineTo(13.1626f, 26.0628f);
        this.f31522e.cubicTo(10.1125f, 22.9914f, 10.1125f, 18.0156f, 13.1626f, 14.9442f);
        this.f31522e.close();
        this.f31522e.setFillType(Path.FillType.EVEN_ODD);
        this.f31521d.setStyle(Paint.Style.FILL);
        this.f31521d.setColor(-1);
        this.f30624a.add(this.f31521d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31522e, this.f31521d);
    }
}
