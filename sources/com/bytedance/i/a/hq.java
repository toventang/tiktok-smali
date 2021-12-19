package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hq extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31605d;

    /* renamed from: e  reason: collision with root package name */
    Path f31606e;

    static {
        Covode.recordClassIndex(18342);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(26.5001f, 24.0f);
        this.f30626c.cubicTo(27.8808f, 24.0f, 29.0001f, 22.8807f, 29.0001f, 21.5f);
        this.f30626c.cubicTo(29.0001f, 20.1193f, 27.8808f, 19.0f, 26.5001f, 19.0f);
        this.f30626c.cubicTo(25.1194f, 19.0f, 24.0001f, 20.1193f, 24.0001f, 21.5f);
        this.f30626c.cubicTo(24.0001f, 22.8807f, 25.1194f, 24.0f, 26.5001f, 24.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31605d = new Paint();
        Path path = new Path();
        this.f31606e = path;
        path.moveTo(24.0002f, 10.0f);
        this.f31606e.cubicTo(11.2691f, 10.0f, 4.86926f, 18.8638f, 2.78564f, 22.4857f);
        this.f31606e.cubicTo(2.23975f, 23.4346f, 2.23975f, 24.5654f, 2.78564f, 25.5143f);
        this.f31606e.cubicTo(4.86926f, 29.1362f, 11.2691f, 38.0f, 24.0002f, 38.0f);
        this.f31606e.cubicTo(36.7313f, 38.0f, 43.1311f, 29.1362f, 45.2148f, 25.5143f);
        this.f31606e.cubicTo(45.7607f, 24.5654f, 45.7607f, 23.4346f, 45.2148f, 22.4857f);
        this.f31606e.cubicTo(43.1311f, 18.8638f, 36.7313f, 10.0f, 24.0002f, 10.0f);
        this.f31606e.close();
        this.f31606e.moveTo(32.0001f, 24.0f);
        this.f31606e.cubicTo(32.0001f, 28.4183f, 28.4184f, 32.0f, 24.0001f, 32.0f);
        this.f31606e.cubicTo(19.5818f, 32.0f, 16.0001f, 28.4183f, 16.0001f, 24.0f);
        this.f31606e.cubicTo(16.0001f, 19.5817f, 19.5818f, 16.0f, 24.0001f, 16.0f);
        this.f31606e.cubicTo(28.4184f, 16.0f, 32.0001f, 19.5817f, 32.0001f, 24.0f);
        this.f31606e.close();
        this.f31606e.setFillType(Path.FillType.EVEN_ODD);
        this.f31605d.setStyle(Paint.Style.FILL);
        this.f31605d.setColor(-16777216);
        this.f30624a.add(this.f31605d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31606e, this.f31605d);
    }
}
