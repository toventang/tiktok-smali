package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class f extends a {
    static {
        Covode.recordClassIndex(18271);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.0f, 8.0f);
        this.f30626c.cubicTo(13.7909f, 8.0f, 12.0f, 9.79086f, 12.0f, 12.0f);
        this.f30626c.lineTo(12.0f, 37.0f);
        this.f30626c.cubicTo(12.0f, 37.3748f, 12.2096f, 37.7181f, 12.5429f, 37.8894f);
        this.f30626c.cubicTo(12.8762f, 38.0607f, 13.2774f, 38.0313f, 13.5821f, 37.8131f);
        this.f30626c.lineTo(24.0f, 30.3548f);
        this.f30626c.lineTo(34.4179f, 37.8131f);
        this.f30626c.cubicTo(34.7226f, 38.0313f, 35.1238f, 38.0607f, 35.4571f, 37.8894f);
        this.f30626c.cubicTo(35.7904f, 37.7181f, 36.0f, 37.3748f, 36.0f, 37.0f);
        this.f30626c.lineTo(36.0f, 12.0f);
        this.f30626c.cubicTo(36.0f, 9.79086f, 34.2091f, 8.0f, 32.0f, 8.0f);
        this.f30626c.lineTo(16.0f, 8.0f);
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
