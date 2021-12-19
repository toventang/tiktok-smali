package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class jd extends a {
    static {
        Covode.recordClassIndex(18383);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(37.1216f, 51.378f);
        this.f30626c.lineTo(36.2057f, 50.7025f);
        this.f30626c.lineTo(35.2899f, 51.378f);
        this.f30626c.lineTo(11.0281f, 69.2741f);
        this.f30626c.cubicTo(10.6776f, 69.5326f, 10.1839f, 69.458f, 9.9254f, 69.1075f);
        this.f30626c.lineTo(8.68679f, 70.0212f);
        this.f30626c.lineTo(9.9254f, 69.1075f);
        this.f30626c.cubicTo(9.82539f, 68.972f, 9.77143f, 68.8079f, 9.77143f, 68.6394f);
        this.f30626c.lineTo(9.77143f, 7.67403f);
        this.f30626c.cubicTo(9.77143f, 6.0322f, 10.2845f, 4.77917f, 11.0869f, 3.94616f);
        this.f30626c.cubicTo(11.8821f, 3.12073f, 13.0924f, 2.57102f, 14.7616f, 2.57102f);
        this.f30626c.lineTo(57.6499f, 2.57102f);
        this.f30626c.cubicTo(59.3191f, 2.57102f, 60.5293f, 3.12073f, 61.3245f, 3.94616f);
        this.f30626c.cubicTo(62.127f, 4.77917f, 62.64f, 6.0322f, 62.64f, 7.67403f);
        this.f30626c.lineTo(62.64f, 68.6394f);
        this.f30626c.cubicTo(62.64f, 69.075f, 62.2869f, 69.428f, 61.8514f, 69.428f);
        this.f30626c.cubicTo(61.683f, 69.428f, 61.5189f, 69.3741f, 61.3833f, 69.2741f);
        this.f30626c.lineTo(37.1216f, 51.378f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.STROKE);
        this.f30625b.setStrokeWidth(3.08571f);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
