package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ew extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31428d;

    /* renamed from: e  reason: collision with root package name */
    Path f31429e;

    static {
        Covode.recordClassIndex(18267);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(32.4752f, 22.3536f);
        this.f30626c.cubicTo(32.6704f, 22.1583f, 32.6704f, 21.8418f, 32.4752f, 21.6465f);
        this.f30626c.lineTo(30.3539f, 19.5252f);
        this.f30626c.cubicTo(30.1586f, 19.3299f, 29.842f, 19.3299f, 29.6467f, 19.5252f);
        this.f30626c.lineTo(22.0003f, 27.1716f);
        this.f30626c.lineTo(18.3539f, 23.5252f);
        this.f30626c.cubicTo(18.1586f, 23.3299f, 17.842f, 23.3299f, 17.6467f, 23.5252f);
        this.f30626c.lineTo(15.5254f, 25.6465f);
        this.f30626c.cubicTo(15.3302f, 25.8418f, 15.3302f, 26.1583f, 15.5254f, 26.3536f);
        this.f30626c.lineTo(21.6467f, 32.4749f);
        this.f30626c.cubicTo(21.842f, 32.6702f, 22.1586f, 32.6702f, 22.3539f, 32.4749f);
        this.f30626c.lineTo(32.4752f, 22.3536f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31428d = new Paint();
        Path path = new Path();
        this.f31429e = path;
        path.moveTo(18.0f, 4.5f);
        this.f31429e.cubicTo(18.0f, 4.22386f, 17.7761f, 4.0f, 17.5f, 4.0f);
        this.f31429e.lineTo(14.5f, 4.0f);
        this.f31429e.cubicTo(14.2239f, 4.0f, 14.0f, 4.22386f, 14.0f, 4.5f);
        this.f31429e.lineTo(14.0f, 8.0f);
        this.f31429e.lineTo(10.0f, 8.0f);
        this.f31429e.cubicTo(6.68629f, 8.0f, 4.0f, 10.6863f, 4.0f, 14.0f);
        this.f31429e.lineTo(4.0f, 36.0f);
        this.f31429e.cubicTo(4.0f, 39.3137f, 6.68629f, 42.0f, 10.0f, 42.0f);
        this.f31429e.lineTo(38.0f, 42.0f);
        this.f31429e.cubicTo(41.3137f, 42.0f, 44.0f, 39.3137f, 44.0f, 36.0f);
        this.f31429e.lineTo(44.0f, 14.0f);
        this.f31429e.cubicTo(44.0f, 10.6863f, 41.3137f, 8.0f, 38.0f, 8.0f);
        this.f31429e.lineTo(34.0f, 8.0f);
        this.f31429e.lineTo(34.0f, 4.5f);
        this.f31429e.cubicTo(34.0f, 4.22386f, 33.7761f, 4.0f, 33.5f, 4.0f);
        this.f31429e.lineTo(30.5f, 4.0f);
        this.f31429e.cubicTo(30.2239f, 4.0f, 30.0f, 4.22386f, 30.0f, 4.5f);
        this.f31429e.lineTo(30.0f, 8.0f);
        this.f31429e.lineTo(18.0f, 8.0f);
        this.f31429e.lineTo(18.0f, 4.5f);
        this.f31429e.close();
        this.f31429e.moveTo(30.0f, 15.5f);
        this.f31429e.lineTo(30.0f, 12.0f);
        this.f31429e.lineTo(18.0f, 12.0f);
        this.f31429e.lineTo(18.0f, 15.5f);
        this.f31429e.cubicTo(18.0f, 15.7761f, 17.7761f, 16.0f, 17.5f, 16.0f);
        this.f31429e.lineTo(14.5f, 16.0f);
        this.f31429e.cubicTo(14.2239f, 16.0f, 14.0f, 15.7761f, 14.0f, 15.5f);
        this.f31429e.lineTo(14.0f, 12.0f);
        this.f31429e.lineTo(10.0f, 12.0f);
        this.f31429e.cubicTo(8.89543f, 12.0f, 8.0f, 12.8954f, 8.0f, 14.0f);
        this.f31429e.lineTo(8.0f, 36.0f);
        this.f31429e.cubicTo(8.0f, 37.1046f, 8.89543f, 38.0f, 10.0f, 38.0f);
        this.f31429e.lineTo(38.0f, 38.0f);
        this.f31429e.cubicTo(39.1046f, 38.0f, 40.0f, 37.1046f, 40.0f, 36.0f);
        this.f31429e.lineTo(40.0f, 14.0f);
        this.f31429e.cubicTo(40.0f, 12.8954f, 39.1046f, 12.0f, 38.0f, 12.0f);
        this.f31429e.lineTo(34.0f, 12.0f);
        this.f31429e.lineTo(34.0f, 15.5f);
        this.f31429e.cubicTo(34.0f, 15.7761f, 33.7761f, 16.0f, 33.5f, 16.0f);
        this.f31429e.lineTo(30.5f, 16.0f);
        this.f31429e.cubicTo(30.2239f, 16.0f, 30.0f, 15.7761f, 30.0f, 15.5f);
        this.f31429e.close();
        this.f31429e.setFillType(Path.FillType.EVEN_ODD);
        this.f31428d.setStyle(Paint.Style.FILL);
        this.f31428d.setColor(-16777216);
        this.f30624a.add(this.f31428d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31429e, this.f31428d);
    }
}
