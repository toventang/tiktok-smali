package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class jo extends a {
    static {
        Covode.recordClassIndex(18394);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(33.4646f, 67.4739f);
        this.f30626c.cubicTo(34.2202f, 68.0266f, 35.1126f, 68.3055f, 36.0f, 68.3055f);
        this.f30626c.cubicTo(36.8874f, 68.3055f, 37.7798f, 68.0266f, 38.5404f, 67.4688f);
        this.f30626c.cubicTo(46.2328f, 61.8504f, 71.3127f, 42.0795f, 70.9679f, 23.769f);
        this.f30626c.cubicTo(70.9679f, 12.3649f, 61.6884f, 3.08545f, 50.2843f, 3.08545f);
        this.f30626c.cubicTo(44.96f, 3.08545f, 39.8386f, 5.16446f, 36.0f, 8.84075f);
        this.f30626c.cubicTo(32.1564f, 5.16953f, 27.04f, 3.09052f, 21.7157f, 3.09052f);
        this.f30626c.cubicTo(10.3116f, 3.09052f, 1.03209f, 12.37f, 1.03209f, 23.7437f);
        this.f30626c.cubicTo(0.687274f, 42.0795f, 25.7672f, 61.8504f, 33.4646f, 67.4739f);
        this.f30626c.close();
        this.f30626c.moveTo(4.07477f, 23.769f);
        this.f30626c.cubicTo(4.07477f, 14.0433f, 11.9902f, 6.12782f, 21.7159f, 6.12782f);
        this.f30626c.cubicTo(26.7208f, 6.12782f, 31.5126f, 8.28289f, 34.8593f, 12.0403f);
        this.f30626c.cubicTo(35.1483f, 12.3648f, 35.5641f, 12.5474f, 35.9952f, 12.5474f);
        this.f30626c.cubicTo(36.4312f, 12.5474f, 36.842f, 12.3648f, 37.131f, 12.0403f);
        this.f30626c.cubicTo(40.4878f, 8.28289f, 45.2797f, 6.12782f, 50.2795f, 6.12782f);
        this.f30626c.cubicTo(60.0052f, 6.12782f, 67.9206f, 14.0433f, 67.9206f, 23.7994f);
        this.f30626c.cubicTo(68.2502f, 41.1059f, 42.004f, 61.1708f, 36.7406f, 65.0145f);
        this.f30626c.cubicTo(36.2943f, 65.339f, 35.701f, 65.339f, 35.2548f, 65.0145f);
        this.f30626c.cubicTo(29.9914f, 61.1658f, 3.74517f, 41.1059f, 4.07477f, 23.769f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
