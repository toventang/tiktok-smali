package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class nm extends a {
    static {
        Covode.recordClassIndex(18500);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 12.5f);
        this.f30626c.cubicTo(17.6487f, 12.5f, 12.5f, 17.6487f, 12.5f, 24.0f);
        this.f30626c.cubicTo(12.5f, 30.3513f, 17.6487f, 35.5f, 24.0f, 35.5f);
        this.f30626c.cubicTo(26.8172f, 35.5f, 29.3919f, 34.4902f, 31.3919f, 32.8101f);
        this.f30626c.cubicTo(32.4491f, 31.9219f, 34.026f, 32.059f, 34.9142f, 33.1161f);
        this.f30626c.cubicTo(35.8023f, 34.1733f, 35.6653f, 35.7503f, 34.6081f, 36.6384f);
        this.f30626c.cubicTo(31.741f, 39.0471f, 28.0369f, 40.5f, 24.0f, 40.5f);
        this.f30626c.cubicTo(14.8873f, 40.5f, 7.5f, 33.1127f, 7.5f, 24.0f);
        this.f30626c.cubicTo(7.5f, 14.8873f, 14.8873f, 7.5f, 24.0f, 7.5f);
        this.f30626c.cubicTo(33.1127f, 7.5f, 40.5f, 14.8873f, 40.5f, 24.0f);
        this.f30626c.cubicTo(40.5f, 25.3807f, 39.3807f, 26.5f, 38.0f, 26.5f);
        this.f30626c.cubicTo(36.6193f, 26.5f, 35.5f, 25.3807f, 35.5f, 24.0f);
        this.f30626c.cubicTo(35.5f, 17.6487f, 30.3513f, 12.5f, 24.0f, 12.5f);
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
