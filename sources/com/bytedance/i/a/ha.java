package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ha extends a {
    static {
        Covode.recordClassIndex(18326);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.5f, 14.0f);
        this.f30626c.cubicTo(10.701f, 14.0f, 6.0f, 18.701f, 6.0f, 24.5f);
        this.f30626c.cubicTo(6.0f, 30.299f, 10.701f, 35.0f, 16.5f, 35.0f);
        this.f30626c.cubicTo(17.9811f, 35.0f, 19.3906f, 34.6933f, 20.6684f, 34.1401f);
        this.f30626c.cubicTo(18.3865f, 31.5779f, 17.0f, 28.2009f, 17.0f, 24.5f);
        this.f30626c.cubicTo(17.0f, 20.7991f, 18.3865f, 17.4221f, 20.6684f, 14.8599f);
        this.f30626c.cubicTo(19.3906f, 14.3067f, 17.9811f, 14.0f, 16.5f, 14.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 12.0878f);
        this.f30626c.cubicTo(21.8117f, 10.7627f, 19.2449f, 10.0f, 16.5f, 10.0f);
        this.f30626c.cubicTo(8.49187f, 10.0f, 2.0f, 16.4919f, 2.0f, 24.5f);
        this.f30626c.cubicTo(2.0f, 32.5081f, 8.49187f, 39.0f, 16.5f, 39.0f);
        this.f30626c.cubicTo(19.2449f, 39.0f, 21.8117f, 38.2373f, 24.0f, 36.9122f);
        this.f30626c.cubicTo(26.1883f, 38.2373f, 28.7551f, 39.0f, 31.5f, 39.0f);
        this.f30626c.cubicTo(39.5081f, 39.0f, 46.0f, 32.5081f, 46.0f, 24.5f);
        this.f30626c.cubicTo(46.0f, 16.4919f, 39.5081f, 10.0f, 31.5f, 10.0f);
        this.f30626c.cubicTo(28.7551f, 10.0f, 26.1883f, 10.7627f, 24.0f, 12.0878f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 17.1515f);
        this.f30626c.cubicTo(22.1442f, 19.0453f, 21.0f, 21.639f, 21.0f, 24.5f);
        this.f30626c.cubicTo(21.0f, 27.361f, 22.1442f, 29.9547f, 24.0f, 31.8485f);
        this.f30626c.cubicTo(25.8558f, 29.9547f, 27.0f, 27.361f, 27.0f, 24.5f);
        this.f30626c.cubicTo(27.0f, 21.639f, 25.8558f, 19.0453f, 24.0f, 17.1515f);
        this.f30626c.close();
        this.f30626c.moveTo(27.3316f, 34.1401f);
        this.f30626c.cubicTo(29.6135f, 31.5779f, 31.0f, 28.2009f, 31.0f, 24.5f);
        this.f30626c.cubicTo(31.0f, 20.7991f, 29.6135f, 17.4221f, 27.3316f, 14.8599f);
        this.f30626c.cubicTo(28.6094f, 14.3067f, 30.0189f, 14.0f, 31.5f, 14.0f);
        this.f30626c.cubicTo(37.299f, 14.0f, 42.0f, 18.701f, 42.0f, 24.5f);
        this.f30626c.cubicTo(42.0f, 30.299f, 37.299f, 35.0f, 31.5f, 35.0f);
        this.f30626c.cubicTo(30.0189f, 35.0f, 28.6094f, 34.6933f, 27.3316f, 34.1401f);
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
