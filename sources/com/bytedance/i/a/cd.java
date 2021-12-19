package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cd extends a {
    static {
        Covode.recordClassIndex(18194);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(39.0f, 14.5f);
        this.f30626c.cubicTo(34.3401f, 14.5f, 30.5625f, 10.6944f, 30.5625f, 6.0f);
        this.f30626c.lineTo(24.9375f, 6.0f);
        this.f30626c.lineTo(24.9375f, 29.1389f);
        this.f30626c.cubicTo(24.9375f, 32.0077f, 22.629f, 34.3333f, 19.7812f, 34.3333f);
        this.f30626c.cubicTo(16.9335f, 34.3333f, 14.625f, 32.0077f, 14.625f, 29.1389f);
        this.f30626c.cubicTo(14.625f, 26.2701f, 16.9335f, 23.9444f, 19.7812f, 23.9444f);
        this.f30626c.cubicTo(20.2033f, 23.9444f, 20.6099f, 23.9949f, 20.9969f, 24.089f);
        this.f30626c.cubicTo(21.0609f, 24.1045f, 21.1244f, 24.1213f, 21.1875f, 24.1392f);
        this.f30626c.lineTo(21.1875f, 18.3697f);
        this.f30626c.cubicTo(20.7263f, 18.309f, 20.2568f, 18.2778f, 19.7812f, 18.2778f);
        this.f30626c.cubicTo(13.8269f, 18.2778f, 9.0f, 23.1405f, 9.0f, 29.1389f);
        this.f30626c.cubicTo(9.0f, 35.1373f, 13.8269f, 40.0f, 19.7812f, 40.0f);
        this.f30626c.cubicTo(25.7356f, 40.0f, 30.5625f, 35.1373f, 30.5625f, 29.1389f);
        this.f30626c.lineTo(30.5625f, 17.3344f);
        this.f30626c.cubicTo(32.9128f, 19.1128f, 35.8342f, 20.1667f, 39.0f, 20.1667f);
        this.f30626c.lineTo(39.0f, 14.5f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
