package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pp extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31774d;

    /* renamed from: e  reason: collision with root package name */
    Path f31775e;

    static {
        Covode.recordClassIndex(18557);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(37.2929f, 41.1213f);
        this.f30626c.cubicTo(37.6834f, 41.5118f, 38.3166f, 41.5118f, 38.7071f, 41.1213f);
        this.f30626c.lineTo(40.1213f, 39.7071f);
        this.f30626c.cubicTo(40.5118f, 39.3166f, 40.5118f, 38.6834f, 40.1213f, 38.2929f);
        this.f30626c.lineTo(9.53553f, 7.70708f);
        this.f30626c.cubicTo(9.14501f, 7.31655f, 8.51184f, 7.31655f, 8.12132f, 7.70708f);
        this.f30626c.lineTo(6.70711f, 9.12129f);
        this.f30626c.cubicTo(6.45989f, 9.36851f, 6.36917f, 9.71297f, 6.43495f, 10.0315f);
        this.f30626c.cubicTo(3.93955f, 10.3122f, 2.0f, 12.4296f, 2.0f, 15.0f);
        this.f30626c.lineTo(2.0f, 33.0f);
        this.f30626c.cubicTo(2.0f, 35.7614f, 4.23858f, 38.0f, 7.0f, 38.0f);
        this.f30626c.lineTo(29.0f, 38.0f);
        this.f30626c.cubicTo(30.4243f, 38.0f, 31.7096f, 37.4044f, 32.6203f, 36.4487f);
        this.f30626c.lineTo(37.2929f, 41.1213f);
        this.f30626c.close();
        this.f30626c.moveTo(29.7877f, 33.6161f);
        this.f30626c.lineTo(10.1716f, 14.0f);
        this.f30626c.lineTo(7.0f, 14.0f);
        this.f30626c.cubicTo(6.44772f, 14.0f, 6.0f, 14.4477f, 6.0f, 15.0f);
        this.f30626c.lineTo(6.0f, 33.0f);
        this.f30626c.cubicTo(6.0f, 33.5523f, 6.44771f, 34.0f, 7.0f, 34.0f);
        this.f30626c.lineTo(29.0f, 34.0f);
        this.f30626c.cubicTo(29.3199f, 34.0f, 29.6047f, 33.8498f, 29.7877f, 33.6161f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31774d = new Paint();
        Path path = new Path();
        this.f31775e = path;
        path.moveTo(34.0f, 27.2763f);
        this.f31775e.lineTo(34.0f, 29.1718f);
        this.f31775e.lineTo(30.0f, 25.1718f);
        this.f31775e.lineTo(30.0f, 15.0f);
        this.f31775e.cubicTo(30.0f, 14.4477f, 29.5523f, 14.0f, 29.0f, 14.0f);
        this.f31775e.lineTo(18.8282f, 14.0f);
        this.f31775e.lineTo(14.8282f, 9.99997f);
        this.f31775e.lineTo(29.0f, 9.99997f);
        this.f31775e.cubicTo(31.7614f, 9.99997f, 34.0f, 12.2385f, 34.0f, 15.0f);
        this.f31775e.lineTo(34.0f, 20.7238f);
        this.f31775e.lineTo(42.2879f, 14.4091f);
        this.f31775e.cubicTo(42.8927f, 13.9484f, 43.7063f, 13.8703f, 44.3876f, 14.2078f);
        this.f31775e.cubicTo(45.0689f, 14.5452f, 45.5f, 15.2397f, 45.5f, 16.0f);
        this.f31775e.lineTo(45.5f, 32.0f);
        this.f31775e.cubicTo(45.5f, 32.7603f, 45.0689f, 33.4548f, 44.3876f, 33.7922f);
        this.f31775e.cubicTo(43.7064f, 34.1296f, 42.8927f, 34.0516f, 42.2879f, 33.5909f);
        this.f31775e.lineTo(34.0f, 27.2763f);
        this.f31775e.close();
        this.f31775e.moveTo(41.5f, 27.9618f);
        this.f31775e.lineTo(36.3001f, 24.0001f);
        this.f31775e.lineTo(41.5f, 20.0382f);
        this.f31775e.lineTo(41.5f, 27.9618f);
        this.f31775e.close();
        this.f31775e.setFillType(Path.FillType.EVEN_ODD);
        this.f31774d.setStyle(Paint.Style.FILL);
        this.f31774d.setColor(-16777216);
        this.f30624a.add(this.f31774d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31775e, this.f31774d);
    }
}
