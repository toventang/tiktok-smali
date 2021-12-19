package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;

public class a extends com.bytedance.h.a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31271d;

    /* renamed from: e  reason: collision with root package name */
    Path f31272e;

    static {
        Covode.recordClassIndex(18136);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(11.5f, 6.0f);
        this.f30626c.cubicTo(11.2239f, 6.0f, 11.0f, 6.22386f, 11.0f, 6.5f);
        this.f30626c.lineTo(11.0f, 7.5f);
        this.f30626c.cubicTo(11.0f, 7.77614f, 11.2239f, 8.0f, 11.5f, 8.0f);
        this.f30626c.lineTo(36.5f, 8.0f);
        this.f30626c.cubicTo(36.7761f, 8.0f, 37.0f, 7.77614f, 37.0f, 7.5f);
        this.f30626c.lineTo(37.0f, 6.5f);
        this.f30626c.cubicTo(37.0f, 6.22386f, 36.7761f, 6.0f, 36.5f, 6.0f);
        this.f30626c.lineTo(11.5f, 6.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31271d = new Paint();
        Path path = new Path();
        this.f31272e = path;
        path.moveTo(25.4591f, 11.5942f);
        this.f31272e.cubicTo(24.6689f, 10.7514f, 23.3311f, 10.7514f, 22.5409f, 11.5942f);
        this.f31272e.lineTo(9.84915f, 25.1321f);
        this.f31272e.cubicTo(8.65165f, 26.4094f, 9.55734f, 28.5f, 11.3082f, 28.5f);
        this.f31272e.lineTo(17.0f, 28.5f);
        this.f31272e.lineTo(17.0f, 39.5f);
        this.f31272e.cubicTo(17.0f, 40.6046f, 17.8954f, 41.5f, 19.0f, 41.5f);
        this.f31272e.lineTo(29.0f, 41.5f);
        this.f31272e.cubicTo(30.1046f, 41.5f, 31.0f, 40.6046f, 31.0f, 39.5f);
        this.f31272e.lineTo(31.0f, 28.5f);
        this.f31272e.lineTo(36.6918f, 28.5f);
        this.f31272e.cubicTo(38.4426f, 28.5f, 39.3483f, 26.4095f, 38.1508f, 25.1321f);
        this.f31272e.lineTo(25.4591f, 11.5942f);
        this.f31272e.close();
        this.f31272e.moveTo(11.3082f, 26.5f);
        this.f31272e.lineTo(24.0f, 12.9621f);
        this.f31272e.lineTo(36.6918f, 26.5f);
        this.f31272e.lineTo(29.0f, 26.5f);
        this.f31272e.lineTo(29.0f, 39.5f);
        this.f31272e.lineTo(19.0f, 39.5f);
        this.f31272e.lineTo(19.0f, 26.5f);
        this.f31272e.lineTo(11.3082f, 26.5f);
        this.f31272e.close();
        this.f31272e.setFillType(Path.FillType.EVEN_ODD);
        this.f31271d.setStyle(Paint.Style.FILL);
        this.f31271d.setColor(-16777216);
        this.f30624a.add(this.f31271d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31272e, this.f31271d);
    }
}
