package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hw extends a {
    static {
        Covode.recordClassIndex(18348);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(4.73798f, 10.8741f);
        this.f30626c.cubicTo(3.16655f, 8.90981f, 4.56505f, 6.0f, 7.08058f, 6.0f);
        this.f30626c.lineTo(40.6987f, 6.0f);
        this.f30626c.cubicTo(43.3219f, 6.0f, 44.6817f, 9.12929f, 42.8919f, 11.047f);
        this.f30626c.lineTo(31.0f, 23.7883f);
        this.f30626c.lineTo(31.0f, 41.259f);
        this.f30626c.cubicTo(31.0f, 43.5743f, 28.4883f, 45.0169f, 26.4883f, 43.8503f);
        this.f30626c.lineTo(16.4883f, 38.017f);
        this.f30626c.cubicTo(15.5667f, 37.4793f, 15.0f, 36.4926f, 15.0f, 35.4256f);
        this.f30626c.lineTo(15.0f, 23.7016f);
        this.f30626c.lineTo(4.73798f, 10.8741f);
        this.f30626c.close();
        this.f30626c.moveTo(9.16121f, 10.0f);
        this.f30626c.lineTo(18.3426f, 21.4767f);
        this.f30626c.cubicTo(18.7681f, 22.0086f, 19.0f, 22.6696f, 19.0f, 23.3508f);
        this.f30626c.lineTo(19.0f, 34.8513f);
        this.f30626c.lineTo(27.0f, 39.5179f);
        this.f30626c.lineTo(27.0f, 23.3942f);
        this.f30626c.cubicTo(27.0f, 22.6343f, 27.2883f, 21.9027f, 27.8068f, 21.3472f);
        this.f30626c.lineTo(38.3975f, 10.0f);
        this.f30626c.lineTo(9.16121f, 10.0f);
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
