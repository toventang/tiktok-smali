package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bt extends a {
    static {
        Covode.recordClassIndex(18183);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(18.5561f, 11.5853f);
        this.f30626c.lineTo(18.4479f, 11.6052f);
        this.f30626c.cubicTo(17.7864f, 11.7145f, 17.5001f, 12.2018f, 17.5001f, 12.552f);
        this.f30626c.lineTo(17.5001f, 36.6953f);
        this.f30626c.lineTo(17.4827f, 36.7f);
        this.f30626c.cubicTo(17.4942f, 36.7894f, 17.5001f, 36.8815f, 17.5001f, 36.9761f);
        this.f30626c.cubicTo(17.5001f, 39.4448f, 15.567f, 41.5351f, 12.3662f, 42.3928f);
        this.f30626c.cubicTo(9.1654f, 43.2504f, 6.10713f, 42.2158f, 5.53537f, 40.082f);
        this.f30626c.cubicTo(4.9636f, 37.9481f, 7.09485f, 35.523f, 10.2956f, 34.6653f);
        this.f30626c.cubicTo(11.6763f, 34.2954f, 13.2064f, 34.2152f, 14.5001f, 34.4418f);
        this.f30626c.lineTo(14.5001f, 12.552f);
        this.f30626c.cubicTo(14.5001f, 10.6242f, 15.9596f, 8.97568f, 17.9588f, 8.64536f);
        this.f30626c.lineTo(35.611f, 5.05929f);
        this.f30626c.cubicTo(37.8821f, 4.68406f, 40.0434f, 6.12895f, 40.4384f, 8.28654f);
        this.f30626c.cubicTo(40.4794f, 8.51091f, 40.5001f, 8.73822f, 40.5001f, 8.96596f);
        this.f30626c.lineTo(40.5001f, 30.526f);
        this.f30626c.lineTo(40.4526f, 30.526f);
        this.f30626c.cubicTo(40.4839f, 30.6689f, 40.5001f, 30.8189f, 40.5001f, 30.9761f);
        this.f30626c.cubicTo(40.5001f, 33.4448f, 38.567f, 35.5351f, 35.3662f, 36.3928f);
        this.f30626c.cubicTo(32.1654f, 37.2504f, 29.1071f, 36.2158f, 28.5354f, 34.082f);
        this.f30626c.cubicTo(27.9636f, 31.9481f, 30.0949f, 29.523f, 33.2956f, 28.6653f);
        this.f30626c.cubicTo(34.6763f, 28.2954f, 36.2064f, 28.2152f, 37.5001f, 28.4418f);
        this.f30626c.lineTo(37.5001f, 8.96596f);
        this.f30626c.cubicTo(37.5001f, 8.9197f, 37.4959f, 8.87319f, 37.4874f, 8.82675f);
        this.f30626c.cubicTo(37.4121f, 8.41536f, 36.9069f, 7.90656f, 36.1404f, 8.01303f);
        this.f30626c.lineTo(18.5561f, 11.5853f);
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
