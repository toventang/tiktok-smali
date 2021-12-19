package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class oy extends a {
    static {
        Covode.recordClassIndex(18539);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(36.0398f, 13.3599f);
        this.f30626c.cubicTo(36.237f, 13.1621f, 36.5581f, 13.1643f, 36.7526f, 13.3647f);
        this.f30626c.lineTo(39.2574f, 15.9456f);
        this.f30626c.cubicTo(39.4475f, 16.1415f, 39.4454f, 16.4536f, 39.2526f, 16.6469f);
        this.f30626c.lineTo(21.1164f, 34.8325f);
        this.f30626c.cubicTo(20.2099f, 35.7415f, 18.7467f, 35.7193f, 17.8673f, 34.7832f);
        this.f30626c.lineTo(9.33681f, 25.7027f);
        this.f30626c.cubicTo(9.14991f, 25.5037f, 9.15711f, 25.1916f, 9.35299f, 25.0015f);
        this.f30626c.lineTo(11.9322f, 22.4982f);
        this.f30626c.cubicTo(12.1326f, 22.3036f, 12.4536f, 22.3111f, 12.6448f, 22.5146f);
        this.f30626c.lineTo(19.5643f, 29.8803f);
        this.f30626c.lineTo(36.0398f, 13.3599f);
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
