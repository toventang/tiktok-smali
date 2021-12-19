package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cs extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31367d;

    /* renamed from: e  reason: collision with root package name */
    Path f31368e;

    static {
        Covode.recordClassIndex(18209);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(0.0f, 5.0f);
        this.f30626c.cubicTo(0.0f, 2.23858f, 2.23858f, 0.0f, 5.0f, 0.0f);
        this.f30626c.lineTo(43.0f, 0.0f);
        this.f30626c.cubicTo(45.7614f, 0.0f, 48.0f, 2.23858f, 48.0f, 5.0f);
        this.f30626c.lineTo(48.0f, 43.0f);
        this.f30626c.cubicTo(48.0f, 45.7614f, 45.7614f, 48.0f, 43.0f, 48.0f);
        this.f30626c.lineTo(5.0f, 48.0f);
        this.f30626c.cubicTo(2.23858f, 48.0f, 0.0f, 45.7614f, 0.0f, 43.0f);
        this.f30626c.lineTo(0.0f, 5.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-411877);
        this.f31367d = new Paint();
        Path path = new Path();
        this.f31368e = path;
        path.moveTo(18.5f, 14.0f);
        this.f31368e.cubicTo(18.5f, 10.9624f, 20.9624f, 8.5f, 24.0f, 8.5f);
        this.f31368e.cubicTo(27.0376f, 8.5f, 29.5f, 10.9624f, 29.5f, 14.0f);
        this.f31368e.cubicTo(29.5f, 14.7056f, 29.3671f, 15.3801f, 29.1251f, 16.0f);
        this.f31368e.lineTo(18.8749f, 16.0f);
        this.f31368e.cubicTo(18.6329f, 15.3801f, 18.5f, 14.7056f, 18.5f, 14.0f);
        this.f31368e.close();
        this.f31368e.moveTo(15.7366f, 16.0f);
        this.f31368e.cubicTo(15.5819f, 15.3586f, 15.5f, 14.6889f, 15.5f, 14.0f);
        this.f31368e.cubicTo(15.5f, 9.30558f, 19.3056f, 5.5f, 24.0f, 5.5f);
        this.f31368e.cubicTo(28.6944f, 5.5f, 32.5f, 9.30558f, 32.5f, 14.0f);
        this.f31368e.cubicTo(32.5f, 14.6889f, 32.4181f, 15.3586f, 32.2634f, 16.0f);
        this.f31368e.lineTo(36.1719f, 16.0f);
        this.f31368e.cubicTo(39.2363f, 16.0f, 41.5797f, 18.7315f, 41.1137f, 21.7603f);
        this.f31368e.lineTo(38.6522f, 37.7603f);
        this.f31368e.cubicTo(38.2769f, 40.1994f, 36.1782f, 42.0f, 33.7103f, 42.0f);
        this.f31368e.lineTo(14.2895f, 42.0f);
        this.f31368e.cubicTo(11.8217f, 42.0f, 9.72291f, 40.1994f, 9.34766f, 37.7603f);
        this.f31368e.lineTo(6.88612f, 21.7603f);
        this.f31368e.cubicTo(6.42015f, 18.7315f, 8.76355f, 16.0f, 11.828f, 16.0f);
        this.f31368e.lineTo(15.7366f, 16.0f);
        this.f31368e.close();
        this.f31368e.moveTo(17.4999f, 27.0f);
        this.f31368e.cubicTo(18.8806f, 27.0f, 19.9999f, 25.8807f, 19.9999f, 24.5f);
        this.f31368e.cubicTo(19.9999f, 23.1193f, 18.8806f, 22.0f, 17.4999f, 22.0f);
        this.f31368e.cubicTo(16.1192f, 22.0f, 14.9999f, 23.1193f, 14.9999f, 24.5f);
        this.f31368e.cubicTo(14.9999f, 25.8807f, 16.1192f, 27.0f, 17.4999f, 27.0f);
        this.f31368e.close();
        this.f31368e.moveTo(30.4999f, 27.0f);
        this.f31368e.cubicTo(31.8806f, 27.0f, 32.9999f, 25.8807f, 32.9999f, 24.5f);
        this.f31368e.cubicTo(32.9999f, 23.1193f, 31.8806f, 22.0f, 30.4999f, 22.0f);
        this.f31368e.cubicTo(29.1192f, 22.0f, 27.9999f, 23.1193f, 27.9999f, 24.5f);
        this.f31368e.cubicTo(27.9999f, 25.8807f, 29.1192f, 27.0f, 30.4999f, 27.0f);
        this.f31368e.close();
        this.f31368e.setFillType(Path.FillType.EVEN_ODD);
        this.f31367d.setStyle(Paint.Style.FILL);
        this.f31367d.setColor(-1);
        this.f30624a.add(this.f31367d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31368e, this.f31367d);
    }
}
