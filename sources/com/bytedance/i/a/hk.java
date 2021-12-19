package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hk extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31603d;

    /* renamed from: e  reason: collision with root package name */
    Path f31604e;

    static {
        Covode.recordClassIndex(18336);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(21.0f, 7.0f);
        this.f30626c.cubicTo(21.0f, 6.44772f, 21.4477f, 6.0f, 22.0f, 6.0f);
        this.f30626c.lineTo(26.0f, 6.0f);
        this.f30626c.cubicTo(26.5523f, 6.0f, 27.0f, 6.44772f, 27.0f, 7.0f);
        this.f30626c.lineTo(27.0f, 30.0f);
        this.f30626c.cubicTo(27.0f, 30.5523f, 26.5523f, 31.0f, 26.0f, 31.0f);
        this.f30626c.lineTo(22.0f, 31.0f);
        this.f30626c.cubicTo(21.4477f, 31.0f, 21.0f, 30.5523f, 21.0f, 30.0f);
        this.f30626c.lineTo(21.0f, 7.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31603d = new Paint();
        Path path = new Path();
        this.f31604e = path;
        path.moveTo(21.0f, 36.0f);
        this.f31604e.cubicTo(21.0f, 35.4477f, 21.4477f, 35.0f, 22.0f, 35.0f);
        this.f31604e.lineTo(26.0f, 35.0f);
        this.f31604e.cubicTo(26.5523f, 35.0f, 27.0f, 35.4477f, 27.0f, 36.0f);
        this.f31604e.lineTo(27.0f, 40.0f);
        this.f31604e.cubicTo(27.0f, 40.5523f, 26.5523f, 41.0f, 26.0f, 41.0f);
        this.f31604e.lineTo(22.0f, 41.0f);
        this.f31604e.cubicTo(21.4477f, 41.0f, 21.0f, 40.5523f, 21.0f, 40.0f);
        this.f31604e.lineTo(21.0f, 36.0f);
        this.f31604e.close();
        this.f31604e.setFillType(Path.FillType.WINDING);
        this.f31603d.setStyle(Paint.Style.FILL);
        this.f31603d.setColor(-16777216);
        this.f30624a.add(this.f31603d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31604e, this.f31603d);
    }
}
