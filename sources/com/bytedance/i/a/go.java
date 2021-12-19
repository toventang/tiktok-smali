package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class go extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31571d;

    /* renamed from: e  reason: collision with root package name */
    Path f31572e;

    static {
        Covode.recordClassIndex(18313);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.addCircle(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-14625300);
        this.f31571d = new Paint();
        Path path = new Path();
        this.f31572e = path;
        path.moveTo(37.1213f, 15.8787f);
        this.f31572e.cubicTo(38.2929f, 17.0503f, 38.2929f, 18.9497f, 37.1213f, 20.1213f);
        this.f31572e.lineTo(23.6213f, 33.6213f);
        this.f31572e.cubicTo(22.4497f, 34.7929f, 20.5503f, 34.7929f, 19.3787f, 33.6213f);
        this.f31572e.lineTo(10.8787f, 25.1213f);
        this.f31572e.cubicTo(9.70711f, 23.9497f, 9.70711f, 22.0503f, 10.8787f, 20.8787f);
        this.f31572e.cubicTo(12.0503f, 19.7071f, 13.9497f, 19.7071f, 15.1213f, 20.8787f);
        this.f31572e.lineTo(21.5f, 27.2574f);
        this.f31572e.lineTo(32.8787f, 15.8787f);
        this.f31572e.cubicTo(34.0503f, 14.7071f, 35.9497f, 14.7071f, 37.1213f, 15.8787f);
        this.f31572e.close();
        this.f31572e.setFillType(Path.FillType.EVEN_ODD);
        this.f31571d.setStyle(Paint.Style.FILL);
        this.f31571d.setColor(-1);
        this.f30624a.add(this.f31571d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31572e, this.f31571d);
    }
}
