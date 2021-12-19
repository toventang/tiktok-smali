package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class eh extends a {
    static {
        Covode.recordClassIndex(18252);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(9.07558f, 25.8218f);
        this.f30626c.lineTo(17.9535f, 2.71407f);
        this.f30626c.cubicTo(18.119f, 2.28321f, 18.5316f, 1.99902f, 18.9916f, 1.99902f);
        this.f30626c.lineTo(33.8861f, 1.99902f);
        this.f30626c.cubicTo(34.6954f, 1.99902f, 35.234f, 2.83867f, 34.8991f, 3.57823f);
        this.f30626c.lineTo(29.3748f, 15.7784f);
        this.f30626c.cubicTo(29.04f, 16.518f, 29.5786f, 17.3576f, 30.3878f, 17.3576f);
        this.f30626c.lineTo(36.8853f, 17.3576f);
        this.f30626c.cubicTo(37.7986f, 17.3576f, 38.323f, 18.4012f, 37.7801f, 19.1385f);
        this.f30626c.lineTo(18.3398f, 45.5414f);
        this.f30626c.cubicTo(17.6368f, 46.4962f, 16.1317f, 45.8363f, 16.3517f, 44.6698f);
        this.f30626c.lineTo(19.3693f, 28.6654f);
        this.f30626c.cubicTo(19.499f, 27.9775f, 18.9735f, 27.3407f, 18.276f, 27.3407f);
        this.f30626c.lineTo(10.1137f, 27.3407f);
        this.f30626c.cubicTo(9.33244f, 27.3407f, 8.79443f, 26.5536f, 9.07558f, 25.8218f);
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
