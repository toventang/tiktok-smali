package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class hy extends a {
    static {
        Covode.recordClassIndex(18350);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.4993f, 13.8935f);
        this.f30626c.cubicTo(15.1963f, 15.2809f, 13.8744f, 16.6886f, 12.7499f, 18.1553f);
        this.f30626c.cubicTo(10.6417f, 20.7227f, 9.0f, 24.521f, 9.0f, 28.0932f);
        this.f30626c.cubicTo(9.0f, 36.326f, 15.7157f, 43.0f, 24.0f, 43.0f);
        this.f30626c.cubicTo(32.2843f, 43.0f, 39.0f, 36.326f, 39.0f, 28.0932f);
        this.f30626c.cubicTo(39.0f, 27.1108f, 38.8583f, 25.7769f, 38.7219f, 25.2215f);
        this.f30626c.cubicTo(37.0844f, 18.5526f, 33.4341f, 14.2589f, 31.6625f, 12.7219f);
        this.f30626c.cubicTo(31.3694f, 12.4676f, 30.9637f, 12.6849f, 30.9563f, 13.0729f);
        this.f30626c.cubicTo(30.9442f, 13.7055f, 30.9185f, 14.2542f, 30.8804f, 14.7356f);
        this.f30626c.cubicTo(30.7119f, 16.8656f, 30.4286f, 17.8718f, 29.535f, 18.5941f);
        this.f30626c.cubicTo(28.9547f, 19.0632f, 28.2669f, 18.6563f, 28.2552f, 17.9102f);
        this.f30626c.cubicTo(28.252f, 17.7084f, 28.2499f, 17.5298f, 28.2498f, 17.4099f);
        this.f30626c.cubicTo(28.231f, 16.1837f, 28.1818f, 15.0487f, 28.0902f, 13.9934f);
        this.f30626c.cubicTo(27.6649f, 9.4884f, 26.3956f, 6.18932f, 23.4119f, 3.69855f);
        this.f30626c.cubicTo(23.0765f, 3.41856f, 22.5723f, 3.70961f, 22.5537f, 4.14611f);
        this.f30626c.cubicTo(22.4064f, 7.60315f, 19.5034f, 10.6944f, 16.4993f, 13.8934f);
        this.f30626c.lineTo(16.4993f, 13.8935f);
        this.f30626c.close();
        this.f30626c.moveTo(23.7692f, 23.2779f);
        this.f30626c.lineTo(18.7594f, 29.3098f);
        this.f30626c.cubicTo(17.9672f, 30.3185f, 17.5f, 31.565f, 17.5f, 32.913f);
        this.f30626c.cubicTo(17.5f, 36.2747f, 20.4101f, 39.0f, 24.0f, 39.0f);
        this.f30626c.cubicTo(27.5899f, 39.0f, 30.5f, 36.2747f, 30.5f, 32.913f);
        this.f30626c.cubicTo(30.5f, 31.565f, 30.0328f, 30.3185f, 29.2406f, 29.3098f);
        this.f30626c.lineTo(24.2308f, 23.2779f);
        this.f30626c.cubicTo(24.1108f, 23.1334f, 23.8892f, 23.1334f, 23.7692f, 23.2779f);
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
