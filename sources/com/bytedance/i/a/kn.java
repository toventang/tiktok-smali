package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kn extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31688d;

    /* renamed from: e  reason: collision with root package name */
    Path f31689e;

    static {
        Covode.recordClassIndex(18420);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(4.0f, 5.0f);
        this.f30626c.lineTo(4.0f, 42.0f);
        this.f30626c.cubicTo(4.0f, 43.1045f, 4.89551f, 44.0f, 6.0f, 44.0f);
        this.f30626c.lineTo(43.0f, 44.0f);
        this.f30626c.cubicTo(43.5522f, 44.0f, 44.0f, 43.5522f, 44.0f, 43.0f);
        this.f30626c.lineTo(44.0f, 41.0f);
        this.f30626c.cubicTo(44.0f, 40.4478f, 43.5522f, 40.0f, 43.0f, 40.0f);
        this.f30626c.lineTo(8.0f, 40.0f);
        this.f30626c.lineTo(8.0f, 5.0f);
        this.f30626c.cubicTo(8.0f, 4.44775f, 7.55225f, 4.0f, 7.0f, 4.0f);
        this.f30626c.lineTo(5.0f, 4.0f);
        this.f30626c.cubicTo(4.44775f, 4.0f, 4.0f, 4.44775f, 4.0f, 5.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31688d = new Paint();
        Path path = new Path();
        this.f31689e = path;
        path.moveTo(43.2964f, 12.3984f);
        this.f31689e.cubicTo(43.3013f, 12.0654f, 43.1396f, 11.7378f, 42.8394f, 11.5435f);
        this.f31689e.lineTo(41.1606f, 10.4565f);
        this.f31689e.cubicTo(40.6968f, 10.1567f, 40.0776f, 10.2896f, 39.7778f, 10.7529f);
        this.f31689e.lineTo(30.4683f, 25.1401f);
        this.f31689e.lineTo(21.1763f, 18.3823f);
        this.f31689e.cubicTo(20.7227f, 18.0527f, 20.1509f, 17.9282f, 19.6011f, 18.04f);
        this.f31689e.cubicTo(19.0513f, 18.1519f, 18.5737f, 18.4897f, 18.2852f, 18.9712f);
        this.f31689e.lineTo(9.79932f, 33.1133f);
        this.f31689e.cubicTo(9.68994f, 33.2959f, 9.64551f, 33.5f, 9.65918f, 33.6973f);
        this.f31689e.lineTo(9.65918f, 37.3472f);
        this.f31689e.cubicTo(9.65918f, 37.8995f, 10.1069f, 38.3472f, 10.6592f, 38.3472f);
        this.f31689e.lineTo(42.2988f, 38.3472f);
        this.f31689e.cubicTo(42.8511f, 38.3472f, 43.2988f, 37.8995f, 43.2988f, 37.3472f);
        this.f31689e.lineTo(43.2988f, 12.395f);
        this.f31689e.lineTo(43.2964f, 12.3984f);
        this.f31689e.close();
        this.f31689e.setFillType(Path.FillType.WINDING);
        this.f31688d.setStyle(Paint.Style.FILL);
        this.f31688d.setColor(-16777216);
        this.f30624a.add(this.f31688d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31689e, this.f31688d);
    }
}
