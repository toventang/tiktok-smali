package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class js extends a {
    static {
        Covode.recordClassIndex(18398);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(30.4228f, 1.02815f);
        this.f30626c.cubicTo(14.1888f, 1.02815f, 1.02856f, 14.1884f, 1.02856f, 30.4224f);
        this.f30626c.cubicTo(1.02856f, 46.6564f, 14.1888f, 59.8167f, 30.4228f, 59.8167f);
        this.f30626c.cubicTo(37.8213f, 59.8167f, 44.5813f, 57.0833f, 49.7482f, 52.5714f);
        this.f30626c.lineTo(67.6959f, 70.519f);
        this.f30626c.cubicTo(68.3f, 71.1232f, 69.2796f, 71.1232f, 69.8837f, 70.519f);
        this.f30626c.cubicTo(70.4879f, 69.9149f, 70.4879f, 68.9353f, 69.8837f, 68.3311f);
        this.f30626c.lineTo(51.9694f, 50.4168f);
        this.f30626c.cubicTo(56.8393f, 45.1712f, 59.8171f, 38.1446f, 59.8171f, 30.4224f);
        this.f30626c.cubicTo(59.8171f, 14.1884f, 46.6568f, 1.02815f, 30.4228f, 1.02815f);
        this.f30626c.close();
        this.f30626c.moveTo(4.1227f, 30.4224f);
        this.f30626c.cubicTo(4.1227f, 15.8973f, 15.8977f, 4.12228f, 30.4228f, 4.12228f);
        this.f30626c.cubicTo(44.948f, 4.12228f, 56.7229f, 15.8973f, 56.7229f, 30.4224f);
        this.f30626c.cubicTo(56.7229f, 44.9476f, 44.948f, 56.7225f, 30.4228f, 56.7225f);
        this.f30626c.cubicTo(15.8977f, 56.7225f, 4.1227f, 44.9476f, 4.1227f, 30.4224f);
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
