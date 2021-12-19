package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class oc extends a {
    static {
        Covode.recordClassIndex(18517);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(17.7425f, 15.5f);
        this.f30626c.lineTo(18.4158f, 8.89854f);
        this.f30626c.cubicTo(18.4679f, 8.38819f, 18.8976f, 8.0f, 19.4106f, 8.0f);
        this.f30626c.lineTo(20.3898f, 8.0f);
        this.f30626c.cubicTo(20.9806f, 8.0f, 21.4426f, 8.50952f, 21.385f, 9.09754f);
        this.f30626c.lineTo(20.7575f, 15.5f);
        this.f30626c.lineTo(28.7425f, 15.5f);
        this.f30626c.lineTo(29.4158f, 8.89854f);
        this.f30626c.cubicTo(29.4679f, 8.38819f, 29.8976f, 8.0f, 30.4106f, 8.0f);
        this.f30626c.lineTo(31.3898f, 8.0f);
        this.f30626c.cubicTo(31.9806f, 8.0f, 32.4426f, 8.50952f, 32.385f, 9.09754f);
        this.f30626c.lineTo(31.7575f, 15.5f);
        this.f30626c.lineTo(37.0f, 15.5f);
        this.f30626c.cubicTo(37.5523f, 15.5f, 38.0f, 15.9477f, 38.0f, 16.5f);
        this.f30626c.lineTo(38.0f, 17.5f);
        this.f30626c.cubicTo(38.0f, 18.0523f, 37.5523f, 18.5f, 37.0f, 18.5f);
        this.f30626c.lineTo(31.4575f, 18.5f);
        this.f30626c.lineTo(30.6575f, 26.5f);
        this.f30626c.lineTo(36.0f, 26.5f);
        this.f30626c.cubicTo(36.5523f, 26.5f, 37.0f, 26.9477f, 37.0f, 27.5f);
        this.f30626c.lineTo(37.0f, 28.5f);
        this.f30626c.cubicTo(37.0f, 29.0523f, 36.5523f, 29.5f, 36.0f, 29.5f);
        this.f30626c.lineTo(30.3575f, 29.5f);
        this.f30626c.lineTo(29.584f, 37.1012f);
        this.f30626c.cubicTo(29.5321f, 37.6117f, 29.1022f, 38.0f, 28.5891f, 38.0f);
        this.f30626c.lineTo(27.6105f, 38.0f);
        this.f30626c.cubicTo(27.0196f, 38.0f, 26.5575f, 37.4903f, 26.6153f, 36.9022f);
        this.f30626c.lineTo(27.3425f, 29.5f);
        this.f30626c.lineTo(19.3575f, 29.5f);
        this.f30626c.lineTo(18.584f, 37.1012f);
        this.f30626c.cubicTo(18.5321f, 37.6117f, 18.1022f, 38.0f, 17.5891f, 38.0f);
        this.f30626c.lineTo(16.6105f, 38.0f);
        this.f30626c.cubicTo(16.0196f, 38.0f, 15.5575f, 37.4903f, 15.6153f, 36.9022f);
        this.f30626c.lineTo(16.3425f, 29.5f);
        this.f30626c.lineTo(11.0f, 29.5f);
        this.f30626c.cubicTo(10.4477f, 29.5f, 10.0f, 29.0523f, 10.0f, 28.5f);
        this.f30626c.lineTo(10.0f, 27.5f);
        this.f30626c.cubicTo(10.0f, 26.9477f, 10.4477f, 26.5f, 11.0f, 26.5f);
        this.f30626c.lineTo(16.6425f, 26.5f);
        this.f30626c.lineTo(17.4425f, 18.5f);
        this.f30626c.lineTo(12.0f, 18.5f);
        this.f30626c.cubicTo(11.4477f, 18.5f, 11.0f, 18.0523f, 11.0f, 17.5f);
        this.f30626c.lineTo(11.0f, 16.5f);
        this.f30626c.cubicTo(11.0f, 15.9477f, 11.4477f, 15.5f, 12.0f, 15.5f);
        this.f30626c.lineTo(17.7425f, 15.5f);
        this.f30626c.close();
        this.f30626c.moveTo(20.4575f, 18.5f);
        this.f30626c.lineTo(19.6575f, 26.5f);
        this.f30626c.lineTo(27.6425f, 26.5f);
        this.f30626c.lineTo(28.4425f, 18.5f);
        this.f30626c.lineTo(20.4575f, 18.5f);
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
