package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hu extends a {
    static {
        Covode.recordClassIndex(18346);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.8f, 38.0f);
        this.f30626c.lineTo(8.8f, 10.0f);
        this.f30626c.lineTo(39.2f, 10.0f);
        this.f30626c.lineTo(39.2f, 38.0f);
        this.f30626c.lineTo(8.8f, 38.0f);
        this.f30626c.close();
        this.f30626c.moveTo(8.8f, 42.0f);
        this.f30626c.cubicTo(6.70132f, 42.0f, 5.0f, 40.2091f, 5.0f, 38.0f);
        this.f30626c.lineTo(5.0f, 10.0f);
        this.f30626c.cubicTo(5.0f, 7.79086f, 6.70132f, 6.0f, 8.8f, 6.0f);
        this.f30626c.lineTo(39.2f, 6.0f);
        this.f30626c.cubicTo(41.2987f, 6.0f, 43.0f, 7.79086f, 43.0f, 10.0f);
        this.f30626c.lineTo(43.0f, 38.0f);
        this.f30626c.cubicTo(43.0f, 40.2091f, 41.2987f, 42.0f, 39.2f, 42.0f);
        this.f30626c.lineTo(8.8f, 42.0f);
        this.f30626c.close();
        this.f30626c.moveTo(14.0f, 14.0f);
        this.f30626c.cubicTo(13.4477f, 14.0f, 13.0f, 14.4477f, 13.0f, 15.0f);
        this.f30626c.lineTo(13.0f, 16.6f);
        this.f30626c.cubicTo(13.0f, 17.1523f, 13.4477f, 17.6f, 14.0f, 17.6f);
        this.f30626c.lineTo(29.0f, 17.6f);
        this.f30626c.cubicTo(29.5523f, 17.6f, 30.0f, 17.1523f, 30.0f, 16.6f);
        this.f30626c.lineTo(30.0f, 15.0f);
        this.f30626c.cubicTo(30.0f, 14.4477f, 29.5523f, 14.0f, 29.0f, 14.0f);
        this.f30626c.lineTo(14.0f, 14.0f);
        this.f30626c.close();
        this.f30626c.moveTo(13.0f, 22.0f);
        this.f30626c.cubicTo(13.0f, 21.4477f, 13.4477f, 21.0f, 14.0f, 21.0f);
        this.f30626c.lineTo(23.0f, 21.0f);
        this.f30626c.cubicTo(23.5523f, 21.0f, 24.0f, 21.4477f, 24.0f, 22.0f);
        this.f30626c.lineTo(24.0f, 23.6f);
        this.f30626c.cubicTo(24.0f, 24.1523f, 23.5523f, 24.6f, 23.0f, 24.6f);
        this.f30626c.lineTo(14.0f, 24.6f);
        this.f30626c.cubicTo(13.4477f, 24.6f, 13.0f, 24.1523f, 13.0f, 23.6f);
        this.f30626c.lineTo(13.0f, 22.0f);
        this.f30626c.close();
        this.f30626c.moveTo(36.0803f, 27.067f);
        this.f30626c.cubicTo(36.4812f, 26.6871f, 36.4984f, 26.0542f, 36.1185f, 25.6533f);
        this.f30626c.lineTo(34.8806f, 24.3466f);
        this.f30626c.cubicTo(34.5007f, 23.9456f, 33.8678f, 23.9285f, 33.4669f, 24.3083f);
        this.f30626c.lineTo(25.9665f, 31.414f);
        this.f30626c.lineTo(23.0139f, 28.7566f);
        this.f30626c.cubicTo(22.6034f, 28.3872f, 21.9711f, 28.4204f, 21.6016f, 28.831f);
        this.f30626c.lineTo(20.3975f, 30.1689f);
        this.f30626c.cubicTo(20.028f, 30.5794f, 20.0613f, 31.2117f, 20.4718f, 31.5811f);
        this.f30626c.lineTo(24.3853f, 35.1033f);
        this.f30626c.cubicTo(25.3155f, 35.9405f, 26.7329f, 35.9224f, 27.6414f, 35.0617f);
        this.f30626c.lineTo(36.0803f, 27.067f);
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
