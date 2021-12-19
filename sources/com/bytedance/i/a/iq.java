package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class iq extends a {
    static {
        Covode.recordClassIndex(18369);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 9.01703f);
        this.f30626c.cubicTo(28.9975f, 3.74266f, 36.5326f, 3.736f, 41.327f, 8.56049f);
        this.f30626c.cubicTo(46.2243f, 13.4886f, 46.2243f, 21.4735f, 41.327f, 26.4016f);
        this.f30626c.lineTo(25.4186f, 42.4098f);
        this.f30626c.cubicTo(25.0432f, 42.7876f, 24.5326f, 43.0f, 24.0f, 43.0f);
        this.f30626c.cubicTo(23.4674f, 43.0f, 22.9568f, 42.7876f, 22.5814f, 42.4098f);
        this.f30626c.lineTo(6.67302f, 26.4016f);
        this.f30626c.cubicTo(1.77566f, 21.4735f, 1.77566f, 13.4886f, 6.67302f, 8.56049f);
        this.f30626c.cubicTo(11.4674f, 3.736f, 19.0025f, 3.74266f, 24.0f, 9.01703f);
        this.f30626c.close();
        this.f30626c.moveTo(38.4897f, 11.3801f);
        this.f30626c.cubicTo(35.2175f, 8.08727f, 30.0151f, 8.07195f, 26.5062f, 12.2118f);
        this.f30626c.lineTo(26.455f, 12.2722f);
        this.f30626c.lineTo(24.0f, 14.7426f);
        this.f30626c.lineTo(21.545f, 12.2722f);
        this.f30626c.lineTo(21.4938f, 12.2118f);
        this.f30626c.cubicTo(17.9849f, 8.07195f, 12.7825f, 8.08727f, 9.51028f, 11.3801f);
        this.f30626c.cubicTo(6.16324f, 14.7481f, 6.16324f, 20.214f, 9.51028f, 23.582f);
        this.f30626c.lineTo(24.0f, 38.1627f);
        this.f30626c.lineTo(38.4897f, 23.582f);
        this.f30626c.cubicTo(41.8368f, 20.214f, 41.8368f, 14.7481f, 38.4897f, 11.3801f);
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
