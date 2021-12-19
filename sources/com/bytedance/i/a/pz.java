package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pz extends a {
    static {
        Covode.recordClassIndex(18567);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(21.1716f, 24.0f);
        this.f30626c.lineTo(13.2929f, 16.1213f);
        this.f30626c.cubicTo(12.9024f, 15.7308f, 12.9024f, 15.0976f, 13.2929f, 14.7071f);
        this.f30626c.lineTo(14.7071f, 13.2929f);
        this.f30626c.cubicTo(15.0976f, 12.9024f, 15.7308f, 12.9024f, 16.1213f, 13.2929f);
        this.f30626c.lineTo(24.0f, 21.1716f);
        this.f30626c.lineTo(31.8787f, 13.2929f);
        this.f30626c.cubicTo(32.2692f, 12.9024f, 32.9024f, 12.9024f, 33.2929f, 13.2929f);
        this.f30626c.lineTo(34.7071f, 14.7071f);
        this.f30626c.cubicTo(35.0976f, 15.0976f, 35.0976f, 15.7308f, 34.7071f, 16.1213f);
        this.f30626c.lineTo(26.8284f, 24.0f);
        this.f30626c.lineTo(34.7071f, 31.8787f);
        this.f30626c.cubicTo(35.0976f, 32.2692f, 35.0976f, 32.9024f, 34.7071f, 33.2929f);
        this.f30626c.lineTo(33.2929f, 34.7071f);
        this.f30626c.cubicTo(32.9024f, 35.0976f, 32.2692f, 35.0976f, 31.8787f, 34.7071f);
        this.f30626c.lineTo(24.0f, 26.8284f);
        this.f30626c.lineTo(16.1213f, 34.7071f);
        this.f30626c.cubicTo(15.7308f, 35.0976f, 15.0976f, 35.0976f, 14.7071f, 34.7071f);
        this.f30626c.lineTo(13.2929f, 33.2929f);
        this.f30626c.cubicTo(12.9024f, 32.9024f, 12.9024f, 32.2692f, 13.2929f, 31.8787f);
        this.f30626c.lineTo(21.1716f, 24.0f);
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
