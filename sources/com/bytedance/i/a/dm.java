package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class dm extends a {
    static {
        Covode.recordClassIndex(18230);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.7125f, 32.0323f);
        this.f30626c.cubicTo(24.3109f, 32.5525f, 23.5252f, 32.5505f, 23.1263f, 32.0282f);
        this.f30626c.lineTo(14.4015f, 20.6071f);
        this.f30626c.cubicTo(13.8988f, 19.949f, 14.368f, 19.0f, 15.1962f, 19.0f);
        this.f30626c.lineTo(32.7385f, 19.0f);
        this.f30626c.cubicTo(33.569f, 19.0f, 34.0375f, 19.9537f, 33.53f, 20.6111f);
        this.f30626c.lineTo(24.7125f, 32.0323f);
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
