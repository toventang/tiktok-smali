package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hj extends a {
    static {
        Covode.recordClassIndex(18335);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(7.0f, 8.0f);
        this.f30626c.cubicTo(4.23858f, 8.0f, 2.0f, 10.2386f, 2.0f, 13.0f);
        this.f30626c.lineTo(2.0f, 37.0f);
        this.f30626c.cubicTo(2.0f, 39.7614f, 4.23858f, 42.0f, 7.0f, 42.0f);
        this.f30626c.lineTo(41.0f, 42.0f);
        this.f30626c.cubicTo(43.7614f, 42.0f, 46.0f, 39.7614f, 46.0f, 37.0f);
        this.f30626c.lineTo(46.0f, 13.0f);
        this.f30626c.cubicTo(46.0f, 10.2386f, 43.7614f, 8.0f, 41.0f, 8.0f);
        this.f30626c.lineTo(7.0f, 8.0f);
        this.f30626c.close();
        this.f30626c.moveTo(6.0f, 13.0f);
        this.f30626c.cubicTo(6.0f, 12.4477f, 6.44772f, 12.0f, 7.0f, 12.0f);
        this.f30626c.lineTo(41.0f, 12.0f);
        this.f30626c.cubicTo(41.5523f, 12.0f, 42.0f, 12.4477f, 42.0f, 13.0f);
        this.f30626c.lineTo(42.0f, 37.0f);
        this.f30626c.cubicTo(42.0f, 37.5523f, 41.5523f, 38.0f, 41.0f, 38.0f);
        this.f30626c.lineTo(7.0f, 38.0f);
        this.f30626c.cubicTo(6.44772f, 38.0f, 6.0f, 37.5523f, 6.0f, 37.0f);
        this.f30626c.lineTo(6.0f, 13.0f);
        this.f30626c.close();
        this.f30626c.moveTo(12.5211f, 19.3779f);
        this.f30626c.cubicTo(12.2566f, 19.8627f, 12.4353f, 20.4702f, 12.9201f, 20.7346f);
        this.f30626c.lineTo(23.5211f, 26.517f);
        this.f30626c.cubicTo(23.8196f, 26.6798f, 24.1803f, 26.6798f, 24.4788f, 26.517f);
        this.f30626c.lineTo(35.0798f, 20.7346f);
        this.f30626c.cubicTo(35.5646f, 20.4702f, 35.7433f, 19.8627f, 35.4788f, 19.3779f);
        this.f30626c.lineTo(34.5211f, 17.6221f);
        this.f30626c.cubicTo(34.2566f, 17.1372f, 33.6492f, 16.9586f, 33.1643f, 17.2231f);
        this.f30626c.lineTo(23.9999f, 22.2218f);
        this.f30626c.lineTo(14.8355f, 17.2231f);
        this.f30626c.cubicTo(14.3507f, 16.9586f, 13.7433f, 17.1372f, 13.4788f, 17.6221f);
        this.f30626c.lineTo(12.5211f, 19.3779f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
