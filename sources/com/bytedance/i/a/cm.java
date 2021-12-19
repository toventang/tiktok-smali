package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cm extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31341d;

    /* renamed from: e  reason: collision with root package name */
    Path f31342e;

    static {
        Covode.recordClassIndex(18203);
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
        this.f30625b.setColor(-119723);
        this.f31341d = new Paint();
        Path path = new Path();
        this.f31342e = path;
        path.moveTo(34.7283f, 11.6936f);
        this.f31342e.cubicTo(35.4809f, 12.4111f, 35.4236f, 13.5972f, 34.6883f, 14.3325f);
        this.f31342e.lineTo(25.0f, 24.0208f);
        this.f31342e.lineTo(34.667f, 33.6878f);
        this.f31342e.cubicTo(35.4032f, 34.424f, 35.4596f, 35.612f, 34.7046f, 36.3289f);
        this.f31342e.cubicTo(31.6564f, 39.2238f, 27.5356f, 41.0f, 23.0f, 41.0f);
        this.f31342e.cubicTo(13.6112f, 41.0f, 6.0f, 33.3888f, 6.0f, 24.0f);
        this.f31342e.cubicTo(6.0f, 14.6112f, 13.6112f, 7.0f, 23.0f, 7.0f);
        this.f31342e.cubicTo(27.5474f, 7.0f, 31.6778f, 8.78547f, 34.7283f, 11.6936f);
        this.f31342e.close();
        this.f31342e.moveTo(22.5f, 17.0f);
        this.f31342e.cubicTo(22.5f, 18.6569f, 21.1569f, 20.0f, 19.5f, 20.0f);
        this.f31342e.cubicTo(17.8431f, 20.0f, 16.5f, 18.6569f, 16.5f, 17.0f);
        this.f31342e.cubicTo(16.5f, 15.3431f, 17.8431f, 14.0f, 19.5f, 14.0f);
        this.f31342e.cubicTo(21.1569f, 14.0f, 22.5f, 15.3431f, 22.5f, 17.0f);
        this.f31342e.close();
        this.f31342e.moveTo(38.0f, 29.0f);
        this.f31342e.cubicTo(40.7614f, 29.0f, 43.0f, 26.7614f, 43.0f, 24.0f);
        this.f31342e.cubicTo(43.0f, 21.2386f, 40.7614f, 19.0f, 38.0f, 19.0f);
        this.f31342e.cubicTo(35.2386f, 19.0f, 33.0f, 21.2386f, 33.0f, 24.0f);
        this.f31342e.cubicTo(33.0f, 26.7614f, 35.2386f, 29.0f, 38.0f, 29.0f);
        this.f31342e.close();
        this.f31342e.setFillType(Path.FillType.EVEN_ODD);
        this.f31341d.setStyle(Paint.Style.FILL);
        this.f31341d.setColor(-1);
        this.f30624a.add(this.f31341d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31342e, this.f31341d);
    }
}
