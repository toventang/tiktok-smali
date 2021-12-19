package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kl extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31686d;

    /* renamed from: e  reason: collision with root package name */
    Path f31687e;

    static {
        Covode.recordClassIndex(18418);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(33.0f, 33.4249f);
        this.f30626c.cubicTo(37.8043f, 30.421f, 41.0f, 25.0837f, 41.0f, 19.0f);
        this.f30626c.cubicTo(41.0f, 9.61116f, 33.3888f, 2.0f, 24.0f, 2.0f);
        this.f30626c.cubicTo(14.6112f, 2.0f, 7.0f, 9.61116f, 7.0f, 19.0f);
        this.f30626c.cubicTo(7.0f, 25.0837f, 10.1957f, 30.421f, 15.0f, 33.4249f);
        this.f30626c.lineTo(15.0f, 34.0f);
        this.f30626c.cubicTo(15.0f, 37.0f, 16.0f, 38.0f, 19.0f, 38.0f);
        this.f30626c.lineTo(29.0f, 38.0f);
        this.f30626c.cubicTo(32.0f, 38.0f, 33.0f, 37.0f, 33.0f, 34.0f);
        this.f30626c.lineTo(33.0f, 33.4249f);
        this.f30626c.close();
        this.f30626c.moveTo(17.293f, 20.1213f);
        this.f30626c.lineTo(22.0002f, 24.8285f);
        this.f30626c.lineTo(22.0002f, 30.0f);
        this.f30626c.cubicTo(22.0002f, 30.5523f, 22.4479f, 31.0f, 23.0002f, 31.0f);
        this.f30626c.lineTo(25.0002f, 31.0f);
        this.f30626c.cubicTo(25.5524f, 31.0f, 26.0002f, 30.5523f, 26.0002f, 30.0f);
        this.f30626c.lineTo(26.0002f, 24.8285f);
        this.f30626c.lineTo(30.7073f, 20.1213f);
        this.f30626c.cubicTo(31.0978f, 19.7308f, 31.0978f, 19.0977f, 30.7073f, 18.7071f);
        this.f30626c.lineTo(29.293f, 17.2929f);
        this.f30626c.cubicTo(28.9025f, 16.9024f, 28.2694f, 16.9024f, 27.8788f, 17.2929f);
        this.f30626c.lineTo(24.0002f, 21.1716f);
        this.f30626c.lineTo(20.1215f, 17.2929f);
        this.f30626c.cubicTo(19.7309f, 16.9024f, 19.0978f, 16.9024f, 18.7073f, 17.2929f);
        this.f30626c.lineTo(17.293f, 18.7071f);
        this.f30626c.cubicTo(16.9025f, 19.0977f, 16.9025f, 19.7308f, 17.293f, 20.1213f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31686d = new Paint();
        Path path = new Path();
        this.f31687e = path;
        path.moveTo(19.0f, 43.0f);
        this.f31687e.cubicTo(19.0f, 41.8954f, 19.8954f, 41.0f, 21.0f, 41.0f);
        this.f31687e.lineTo(27.0f, 41.0f);
        this.f31687e.cubicTo(28.1046f, 41.0f, 29.0f, 41.8954f, 29.0f, 43.0f);
        this.f31687e.lineTo(29.0f, 44.0f);
        this.f31687e.cubicTo(29.0f, 45.1046f, 28.1046f, 46.0f, 27.0f, 46.0f);
        this.f31687e.lineTo(21.0f, 46.0f);
        this.f31687e.cubicTo(19.8954f, 46.0f, 19.0f, 45.1046f, 19.0f, 44.0f);
        this.f31687e.lineTo(19.0f, 43.0f);
        this.f31687e.close();
        this.f31687e.setFillType(Path.FillType.WINDING);
        this.f31686d.setStyle(Paint.Style.FILL);
        this.f31686d.setColor(-16777216);
        this.f30624a.add(this.f31686d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31687e, this.f31686d);
    }
}
