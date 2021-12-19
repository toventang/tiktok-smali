package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pl extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31770d;

    /* renamed from: e  reason: collision with root package name */
    Path f31771e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31772f;

    /* renamed from: g  reason: collision with root package name */
    Path f31773g;

    static {
        Covode.recordClassIndex(18553);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(20.1429f, 7.2963f);
        this.f30626c.cubicTo(20.1429f, 6.58037f, 20.7185f, 6.0f, 21.4286f, 6.0f);
        this.f30626c.lineTo(26.5714f, 6.0f);
        this.f30626c.cubicTo(27.2815f, 6.0f, 27.8571f, 6.58037f, 27.8571f, 7.2963f);
        this.f30626c.lineTo(27.8571f, 39.7037f);
        this.f30626c.cubicTo(27.8571f, 40.4196f, 27.2815f, 41.0f, 26.5714f, 41.0f);
        this.f30626c.lineTo(21.4286f, 41.0f);
        this.f30626c.cubicTo(20.7185f, 41.0f, 20.1429f, 40.4196f, 20.1429f, 39.7037f);
        this.f30626c.lineTo(20.1429f, 7.2963f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31770d = new Paint();
        Path path = new Path();
        this.f31771e = path;
        path.moveTo(6.0f, 16.3704f);
        this.f31771e.cubicTo(6.0f, 15.6544f, 6.57563f, 15.0741f, 7.28571f, 15.0741f);
        this.f31771e.lineTo(12.4286f, 15.0741f);
        this.f31771e.cubicTo(13.1387f, 15.0741f, 13.7143f, 15.6544f, 13.7143f, 16.3704f);
        this.f31771e.lineTo(13.7143f, 39.7037f);
        this.f31771e.cubicTo(13.7143f, 40.4196f, 13.1387f, 41.0f, 12.4286f, 41.0f);
        this.f31771e.lineTo(7.28571f, 41.0f);
        this.f31771e.cubicTo(6.57563f, 41.0f, 6.0f, 40.4196f, 6.0f, 39.7037f);
        this.f31771e.lineTo(6.0f, 16.3704f);
        this.f31771e.close();
        this.f31771e.setFillType(Path.FillType.WINDING);
        this.f31770d.setStyle(Paint.Style.FILL);
        this.f31770d.setColor(-16777216);
        this.f30624a.add(this.f31770d);
        this.f31772f = new Paint();
        Path path2 = new Path();
        this.f31773g = path2;
        path2.moveTo(34.2857f, 21.5556f);
        this.f31773g.cubicTo(34.2857f, 20.8396f, 34.8613f, 20.2593f, 35.5714f, 20.2593f);
        this.f31773g.lineTo(40.7143f, 20.2593f);
        this.f31773g.cubicTo(41.4244f, 20.2593f, 42.0f, 20.8396f, 42.0f, 21.5556f);
        this.f31773g.lineTo(42.0f, 39.7037f);
        this.f31773g.cubicTo(42.0f, 40.4196f, 41.4244f, 41.0f, 40.7143f, 41.0f);
        this.f31773g.lineTo(35.5714f, 41.0f);
        this.f31773g.cubicTo(34.8613f, 41.0f, 34.2857f, 40.4196f, 34.2857f, 39.7037f);
        this.f31773g.lineTo(34.2857f, 21.5556f);
        this.f31773g.close();
        this.f31773g.setFillType(Path.FillType.WINDING);
        this.f31772f.setStyle(Paint.Style.FILL);
        this.f31772f.setColor(-16777216);
        this.f30624a.add(this.f31772f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31771e, this.f31770d);
        canvas.drawPath(this.f31773g, this.f31772f);
    }
}
