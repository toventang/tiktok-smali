package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class nc extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31734d;

    /* renamed from: e  reason: collision with root package name */
    Path f31735e;

    static {
        Covode.recordClassIndex(18490);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(25.0f, 20.0f);
        this.f30626c.cubicTo(25.5523f, 20.0f, 26.0f, 20.4477f, 26.0f, 21.0f);
        this.f30626c.lineTo(26.0f, 26.0f);
        this.f30626c.lineTo(31.0f, 26.0f);
        this.f30626c.cubicTo(31.5523f, 26.0f, 32.0f, 26.4477f, 32.0f, 27.0f);
        this.f30626c.lineTo(32.0f, 29.0f);
        this.f30626c.cubicTo(32.0f, 29.5523f, 31.5523f, 30.0f, 31.0f, 30.0f);
        this.f30626c.lineTo(26.0f, 30.0f);
        this.f30626c.lineTo(26.0f, 35.0f);
        this.f30626c.cubicTo(26.0f, 35.5523f, 25.5523f, 36.0f, 25.0f, 36.0f);
        this.f30626c.lineTo(23.0f, 36.0f);
        this.f30626c.cubicTo(22.4477f, 36.0f, 22.0f, 35.5523f, 22.0f, 35.0f);
        this.f30626c.lineTo(22.0f, 30.0f);
        this.f30626c.lineTo(17.0f, 30.0f);
        this.f30626c.cubicTo(16.4477f, 30.0f, 16.0f, 29.5523f, 16.0f, 29.0f);
        this.f30626c.lineTo(16.0f, 27.0f);
        this.f30626c.cubicTo(16.0f, 26.4477f, 16.4477f, 26.0f, 17.0f, 26.0f);
        this.f30626c.lineTo(22.0f, 26.0f);
        this.f30626c.lineTo(22.0f, 21.0f);
        this.f30626c.cubicTo(22.0f, 20.4477f, 22.4477f, 20.0f, 23.0f, 20.0f);
        this.f30626c.lineTo(25.0f, 20.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31734d = new Paint();
        Path path = new Path();
        this.f31735e = path;
        path.moveTo(18.0122f, 7.23882f);
        this.f31735e.lineTo(17.2459f, 11.0f);
        this.f31735e.lineTo(13.0107f, 11.0f);
        this.f31735e.cubicTo(10.8162f, 11.0f, 8.98676f, 12.8939f, 8.79935f, 15.3596f);
        this.f31735e.lineTo(7.01575f, 38.8263f);
        this.f31735e.cubicTo(6.80423f, 41.6092f, 8.75027f, 44.0f, 11.2271f, 44.0f);
        this.f31735e.lineTo(36.7729f, 44.0f);
        this.f31735e.cubicTo(39.2497f, 44.0f, 41.1958f, 41.6092f, 40.9843f, 38.8263f);
        this.f31735e.lineTo(39.2006f, 15.3596f);
        this.f31735e.cubicTo(39.0132f, 12.8939f, 37.1838f, 11.0f, 34.9893f, 11.0f);
        this.f31735e.lineTo(30.7541f, 11.0f);
        this.f31735e.lineTo(29.9878f, 7.23882f);
        this.f31735e.cubicTo(29.3641f, 4.17784f, 26.8749f, 2.0f, 24.0f, 2.0f);
        this.f31735e.cubicTo(21.1251f, 2.0f, 18.6359f, 4.17784f, 18.0122f, 7.23882f);
        this.f31735e.close();
        this.f31735e.moveTo(24.0f, 5.65635f);
        this.f31735e.cubicTo(22.6963f, 5.65635f, 21.5675f, 6.64393f, 21.2847f, 8.03199f);
        this.f31735e.lineTo(20.68f, 11.0f);
        this.f31735e.lineTo(27.32f, 11.0f);
        this.f31735e.lineTo(26.7153f, 8.03199f);
        this.f31735e.cubicTo(26.4325f, 6.64394f, 25.3037f, 5.65635f, 24.0f, 5.65635f);
        this.f31735e.close();
        this.f31735e.moveTo(13.0107f, 14.6667f);
        this.f31735e.cubicTo(12.5043f, 14.6667f, 12.0821f, 15.1037f, 12.0388f, 15.6727f);
        this.f31735e.lineTo(10.2552f, 39.1394f);
        this.f31735e.cubicTo(10.2064f, 39.7816f, 10.6555f, 40.3333f, 11.2271f, 40.3333f);
        this.f31735e.lineTo(36.7729f, 40.3333f);
        this.f31735e.cubicTo(37.3445f, 40.3333f, 37.7936f, 39.7816f, 37.7448f, 39.1394f);
        this.f31735e.lineTo(35.9612f, 15.6727f);
        this.f31735e.cubicTo(35.9179f, 15.1037f, 35.4957f, 14.6667f, 34.9893f, 14.6667f);
        this.f31735e.lineTo(13.0107f, 14.6667f);
        this.f31735e.close();
        this.f31735e.setFillType(Path.FillType.EVEN_ODD);
        this.f31734d.setStyle(Paint.Style.FILL);
        this.f31734d.setColor(-16777216);
        this.f30624a.add(this.f31734d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31735e, this.f31734d);
    }
}
