package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class lq extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31716d;

    /* renamed from: e  reason: collision with root package name */
    Path f31717e;

    static {
        Covode.recordClassIndex(18450);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(26.5858f, 5.08579f);
        this.f30626c.cubicTo(27.3479f, 4.32371f, 28.5767f, 4.30253f, 29.3646f, 5.03789f);
        this.f30626c.lineTo(36.8646f, 12.0379f);
        this.f30626c.cubicTo(37.2612f, 12.408f, 37.4904f, 12.9232f, 37.4997f, 13.4655f);
        this.f30626c.cubicTo(37.5091f, 14.0078f, 37.2977f, 14.5307f, 36.9142f, 14.9142f);
        this.f30626c.lineTo(16.9142f, 34.9142f);
        this.f30626c.cubicTo(16.5391f, 35.2893f, 16.0304f, 35.5f, 15.5f, 35.5f);
        this.f30626c.lineTo(8.5f, 35.5f);
        this.f30626c.cubicTo(7.39543f, 35.5f, 6.5f, 34.6046f, 6.5f, 33.5f);
        this.f30626c.lineTo(6.5f, 26.0f);
        this.f30626c.cubicTo(6.5f, 25.4696f, 6.71071f, 24.9609f, 7.08579f, 24.5858f);
        this.f30626c.lineTo(26.5858f, 5.08579f);
        this.f30626c.close();
        this.f30626c.moveTo(28.0479f, 9.2805f);
        this.f30626c.lineTo(10.5f, 26.8284f);
        this.f30626c.lineTo(10.5f, 31.5f);
        this.f30626c.lineTo(14.6716f, 31.5f);
        this.f30626c.lineTo(32.622f, 13.5496f);
        this.f30626c.lineTo(28.0479f, 9.2805f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31716d = new Paint();
        Path path = new Path();
        this.f31717e = path;
        path.moveTo(7.0f, 41.0f);
        this.f31717e.cubicTo(7.0f, 40.4477f, 7.44772f, 40.0f, 8.0f, 40.0f);
        this.f31717e.lineTo(41.0f, 40.0f);
        this.f31717e.cubicTo(41.5523f, 40.0f, 42.0f, 40.4477f, 42.0f, 41.0f);
        this.f31717e.lineTo(42.0f, 43.0f);
        this.f31717e.cubicTo(42.0f, 43.5523f, 41.5523f, 44.0f, 41.0f, 44.0f);
        this.f31717e.lineTo(8.0f, 44.0f);
        this.f31717e.cubicTo(7.44772f, 44.0f, 7.0f, 43.5523f, 7.0f, 43.0f);
        this.f31717e.lineTo(7.0f, 41.0f);
        this.f31717e.close();
        this.f31717e.setFillType(Path.FillType.WINDING);
        this.f31716d.setStyle(Paint.Style.FILL);
        this.f31716d.setColor(-16777216);
        this.f30624a.add(this.f31716d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31717e, this.f31716d);
    }
}
