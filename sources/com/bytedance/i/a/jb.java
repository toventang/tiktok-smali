package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class jb extends a {
    static {
        Covode.recordClassIndex(18381);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(36.0f, 3.59978f);
        this.f30626c.cubicTo(18.106f, 3.59978f, 3.6f, 18.1058f, 3.6f, 35.9998f);
        this.f30626c.cubicTo(3.6f, 53.8938f, 18.106f, 68.3998f, 36.0f, 68.3998f);
        this.f30626c.cubicTo(44.2229f, 68.3998f, 51.727f, 65.3386f, 57.4407f, 60.2913f);
        this.f30626c.cubicTo(58.0794f, 59.7272f, 59.0544f, 59.7876f, 59.6185f, 60.4262f);
        this.f30626c.cubicTo(60.1826f, 61.0649f, 60.1222f, 62.0399f, 59.4836f, 62.604f);
        this.f30626c.cubicTo(53.2277f, 68.1302f, 45.0038f, 71.4855f, 36.0f, 71.4855f);
        this.f30626c.cubicTo(16.4018f, 71.4855f, 0.514282f, 55.598f, 0.514282f, 35.9998f);
        this.f30626c.cubicTo(0.514282f, 16.4016f, 16.4018f, 0.514069f, 36.0f, 0.514069f);
        this.f30626c.cubicTo(55.5982f, 0.514069f, 71.4857f, 16.4016f, 71.4857f, 35.9998f);
        this.f30626c.cubicTo(71.4857f, 42.8834f, 66.1416f, 48.5875f, 59.4f, 48.5875f);
        this.f30626c.cubicTo(54.9024f, 48.5875f, 51.0268f, 46.0488f, 48.9451f, 42.3148f);
        this.f30626c.cubicTo(46.6052f, 47.1023f, 41.6877f, 50.3998f, 36.0f, 50.3998f);
        this.f30626c.cubicTo(28.0471f, 50.3998f, 21.6f, 43.9527f, 21.6f, 35.9998f);
        this.f30626c.cubicTo(21.6f, 28.0469f, 28.0471f, 21.5998f, 36.0f, 21.5998f);
        this.f30626c.cubicTo(43.9529f, 21.5998f, 50.4f, 28.0469f, 50.4f, 35.9998f);
        this.f30626c.cubicTo(50.4f, 41.316f, 54.4963f, 45.5018f, 59.4f, 45.5018f);
        this.f30626c.cubicTo(64.3037f, 45.5018f, 68.4f, 41.316f, 68.4f, 35.9998f);
        this.f30626c.cubicTo(68.4f, 18.1058f, 53.894f, 3.59978f, 36.0f, 3.59978f);
        this.f30626c.close();
        this.f30626c.moveTo(47.3143f, 35.9998f);
        this.f30626c.cubicTo(47.3143f, 29.7511f, 42.2487f, 24.6855f, 36.0f, 24.6855f);
        this.f30626c.cubicTo(29.7513f, 24.6855f, 24.6857f, 29.7511f, 24.6857f, 35.9998f);
        this.f30626c.cubicTo(24.6857f, 42.2485f, 29.7513f, 47.3141f, 36.0f, 47.3141f);
        this.f30626c.cubicTo(42.2487f, 47.3141f, 47.3143f, 42.2485f, 47.3143f, 35.9998f);
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
