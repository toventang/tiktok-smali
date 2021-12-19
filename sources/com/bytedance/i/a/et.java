package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class et extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31426d;

    /* renamed from: e  reason: collision with root package name */
    Path f31427e;

    static {
        Covode.recordClassIndex(18264);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(31.7071f, 20.6213f);
        this.f30626c.cubicTo(32.0976f, 20.2308f, 32.0976f, 19.5976f, 31.7071f, 19.2071f);
        this.f30626c.lineTo(30.2929f, 17.7929f);
        this.f30626c.cubicTo(29.9024f, 17.4024f, 29.2692f, 17.4024f, 28.8787f, 17.7929f);
        this.f30626c.lineTo(23.7071f, 22.9645f);
        this.f30626c.cubicTo(23.3166f, 23.355f, 22.6834f, 23.355f, 22.2929f, 22.9645f);
        this.f30626c.lineTo(19.6213f, 20.2929f);
        this.f30626c.cubicTo(19.2308f, 19.9024f, 18.5976f, 19.9024f, 18.2071f, 20.2929f);
        this.f30626c.lineTo(16.7929f, 21.7071f);
        this.f30626c.cubicTo(16.4024f, 22.0976f, 16.4024f, 22.7308f, 16.7929f, 23.1213f);
        this.f30626c.lineTo(22.2929f, 28.6213f);
        this.f30626c.cubicTo(22.6834f, 29.0118f, 23.3166f, 29.0118f, 23.7071f, 28.6213f);
        this.f30626c.lineTo(31.7071f, 20.6213f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31426d = new Paint();
        Path path = new Path();
        this.f31427e = path;
        path.moveTo(4.0f, 22.0f);
        this.f31427e.cubicTo(4.0f, 12.2852f, 13.3112f, 5.0f, 24.0f, 5.0f);
        this.f31427e.cubicTo(34.6888f, 5.0f, 44.0f, 12.2852f, 44.0f, 22.0f);
        this.f31427e.cubicTo(44.0f, 27.7044f, 41.1445f, 32.4256f, 37.6906f, 36.0123f);
        this.f31427e.cubicTo(34.2346f, 39.6013f, 30.0249f, 42.2236f, 26.8944f, 43.7889f);
        this.f31427e.cubicTo(26.2745f, 44.0988f, 25.5382f, 44.0657f, 24.9485f, 43.7013f);
        this.f31427e.cubicTo(24.3589f, 43.3369f, 24.0f, 42.6932f, 24.0f, 42.0f);
        this.f31427e.lineTo(24.0f, 39.0f);
        this.f31427e.cubicTo(13.3112f, 39.0f, 4.0f, 31.7148f, 4.0f, 22.0f);
        this.f31427e.close();
        this.f31427e.moveTo(24.0f, 9.0f);
        this.f31427e.cubicTo(14.8065f, 9.0f, 8.0f, 15.1462f, 8.0f, 22.0f);
        this.f31427e.cubicTo(8.0f, 28.8538f, 14.8065f, 35.0f, 24.0f, 35.0f);
        this.f31427e.lineTo(28.0f, 35.0f);
        this.f31427e.lineTo(28.0f, 38.6036f);
        this.f31427e.cubicTo(30.2606f, 37.2216f, 32.7121f, 35.4156f, 34.8094f, 33.2377f);
        this.f31427e.cubicTo(37.8555f, 30.0744f, 40.0f, 26.2956f, 40.0f, 22.0f);
        this.f31427e.cubicTo(40.0f, 15.1462f, 33.1935f, 9.0f, 24.0f, 9.0f);
        this.f31427e.close();
        this.f31427e.setFillType(Path.FillType.EVEN_ODD);
        this.f31426d.setStyle(Paint.Style.FILL);
        this.f31426d.setColor(-16777216);
        this.f30624a.add(this.f31426d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31427e, this.f31426d);
    }
}
