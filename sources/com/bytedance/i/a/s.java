package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class s extends a {
    static {
        Covode.recordClassIndex(18570);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(12.7059f, 12.6667f);
        this.f30626c.cubicTo(15.6008f, 9.78171f, 19.5914f, 8.0f, 24.0f, 8.0f);
        this.f30626c.cubicTo(32.8366f, 8.0f, 40.0f, 15.1634f, 40.0f, 24.0f);
        this.f30626c.cubicTo(40.0f, 28.4086f, 38.2183f, 32.3992f, 35.3333f, 35.2941f);
        this.f30626c.cubicTo(32.4352f, 38.2022f, 28.4285f, 40.0f, 24.0f, 40.0f);
        this.f30626c.cubicTo(15.1634f, 40.0f, 8.0f, 32.8366f, 8.0f, 24.0f);
        this.f30626c.cubicTo(8.0f, 19.5715f, 9.79784f, 15.5648f, 12.7059f, 12.6667f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 6.0f);
        this.f30626c.cubicTo(19.0409f, 6.0f, 14.5486f, 8.00674f, 11.2941f, 11.2501f);
        this.f30626c.cubicTo(8.02491f, 14.5081f, 6.0f, 19.0185f, 6.0f, 24.0f);
        this.f30626c.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f30626c.cubicTo(28.9815f, 42.0f, 33.4919f, 39.9751f, 36.7499f, 36.7059f);
        this.f30626c.cubicTo(39.9933f, 33.4514f, 42.0f, 28.9591f, 42.0f, 24.0f);
        this.f30626c.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.moveTo(14.0f, 24.5f);
        this.f30626c.cubicTo(14.0f, 24.7761f, 14.2239f, 25.0f, 14.5f, 25.0f);
        this.f30626c.lineTo(33.5f, 25.0f);
        this.f30626c.cubicTo(33.7761f, 25.0f, 34.0f, 24.7761f, 34.0f, 24.5f);
        this.f30626c.lineTo(34.0f, 23.5f);
        this.f30626c.cubicTo(34.0f, 23.2239f, 33.7761f, 23.0f, 33.5f, 23.0f);
        this.f30626c.lineTo(14.5f, 23.0f);
        this.f30626c.cubicTo(14.2239f, 23.0f, 14.0f, 23.2239f, 14.0f, 23.5f);
        this.f30626c.lineTo(14.0f, 24.5f);
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
