package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class oz extends a {
    static {
        Covode.recordClassIndex(18540);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(42.0f, 13.875f);
        this.f30626c.cubicTo(36.4081f, 13.875f, 31.875f, 9.34188f, 31.875f, 3.75f);
        this.f30626c.lineTo(25.125f, 3.75f);
        this.f30626c.lineTo(25.125f, 31.3125f);
        this.f30626c.cubicTo(25.125f, 34.7298f, 22.3548f, 37.5f, 18.9375f, 37.5f);
        this.f30626c.cubicTo(15.5202f, 37.5f, 12.75f, 34.7298f, 12.75f, 31.3125f);
        this.f30626c.cubicTo(12.75f, 27.8952f, 15.5202f, 25.125f, 18.9375f, 25.125f);
        this.f30626c.cubicTo(19.4439f, 25.125f, 19.9318f, 25.1851f, 20.3962f, 25.2971f);
        this.f30626c.cubicTo(20.4731f, 25.3157f, 20.5493f, 25.3356f, 20.625f, 25.357f);
        this.f30626c.lineTo(20.625f, 18.4844f);
        this.f30626c.cubicTo(20.0716f, 18.4122f, 19.5082f, 18.375f, 18.9375f, 18.375f);
        this.f30626c.cubicTo(11.7923f, 18.375f, 6.0f, 24.1673f, 6.0f, 31.3125f);
        this.f30626c.cubicTo(6.0f, 38.4577f, 11.7923f, 44.25f, 18.9375f, 44.25f);
        this.f30626c.cubicTo(26.0827f, 44.25f, 31.875f, 38.4577f, 31.875f, 31.3125f);
        this.f30626c.lineTo(31.875f, 17.2512f);
        this.f30626c.cubicTo(34.6954f, 19.3697f, 38.2011f, 20.625f, 42.0f, 20.625f);
        this.f30626c.lineTo(42.0f, 13.875f);
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
