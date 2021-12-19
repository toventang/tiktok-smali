package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class oq extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31760d;

    /* renamed from: e  reason: collision with root package name */
    Path f31761e;

    static {
        Covode.recordClassIndex(18531);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(22.6566f, 23.1538f);
        this.f30626c.cubicTo(23.2793f, 23.5461f, 23.2793f, 24.4539f, 22.6566f, 24.8462f);
        this.f30626c.lineTo(17.2829f, 28.2307f);
        this.f30626c.cubicTo(16.617f, 28.6501f, 15.75f, 28.1715f, 15.75f, 27.3845f);
        this.f30626c.lineTo(15.75f, 20.6155f);
        this.f30626c.cubicTo(15.75f, 19.8285f, 16.617f, 19.3499f, 17.2829f, 19.7693f);
        this.f30626c.lineTo(22.6566f, 23.1538f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-1);
        this.f31760d = new Paint();
        Path path = new Path();
        this.f31761e = path;
        path.moveTo(11.6782f, 12.5f);
        this.f31761e.cubicTo(8.86029f, 12.5f, 6.5f, 14.7292f, 6.5f, 17.5714f);
        this.f31761e.lineTo(6.5f, 30.4286f);
        this.f31761e.cubicTo(6.5f, 33.2708f, 8.86029f, 35.5f, 11.6782f, 35.5f);
        this.f31761e.lineTo(27.8621f, 35.5f);
        this.f31761e.cubicTo(30.6799f, 35.5f, 33.0402f, 33.2708f, 33.0402f, 30.4286f);
        this.f31761e.lineTo(33.0402f, 29.3158f);
        this.f31761e.lineTo(36.745f, 32.0565f);
        this.f31761e.cubicTo(37.6399f, 32.7185f, 38.8324f, 32.8269f, 39.8318f, 32.3463f);
        this.f31761e.cubicTo(40.8365f, 31.8631f, 41.5f, 30.8514f, 41.5f, 29.7143f);
        this.f31761e.lineTo(41.5f, 18.2857f);
        this.f31761e.cubicTo(41.5f, 17.1486f, 40.8365f, 16.1369f, 39.8318f, 15.6537f);
        this.f31761e.cubicTo(38.8324f, 15.1731f, 37.6399f, 15.2815f, 36.745f, 15.9435f);
        this.f31761e.lineTo(33.0402f, 18.6843f);
        this.f31761e.lineTo(33.0402f, 17.5714f);
        this.f31761e.cubicTo(33.0402f, 14.7292f, 30.6799f, 12.5f, 27.8621f, 12.5f);
        this.f31761e.lineTo(11.6782f, 12.5f);
        this.f31761e.close();
        this.f31761e.moveTo(22.6565f, 24.8462f);
        this.f31761e.cubicTo(23.2792f, 24.4539f, 23.2792f, 23.5461f, 22.6565f, 23.1538f);
        this.f31761e.lineTo(17.2829f, 19.7693f);
        this.f31761e.cubicTo(16.6169f, 19.3499f, 15.7499f, 19.8285f, 15.7499f, 20.6155f);
        this.f31761e.lineTo(15.7499f, 27.3845f);
        this.f31761e.cubicTo(15.7499f, 28.1715f, 16.6169f, 28.6501f, 17.2829f, 28.2307f);
        this.f31761e.lineTo(22.6565f, 24.8462f);
        this.f31761e.close();
        this.f31761e.setFillType(Path.FillType.EVEN_ODD);
        this.f31760d.setStyle(Paint.Style.FILL);
        this.f31760d.setColor(-16777216);
        this.f30624a.add(this.f31760d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31761e, this.f31760d);
    }
}
