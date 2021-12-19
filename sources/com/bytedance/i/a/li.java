package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class li extends a {
    static {
        Covode.recordClassIndex(18442);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(20.3019f, 6.38068f);
        this.f30626c.cubicTo(21.723f, 6.08373f, 22.9615f, 7.16986f, 23.009f, 8.50693f);
        this.f30626c.cubicTo(23.2751f, 16.0034f, 29.4377f, 22.0f, 37.0f, 22.0f);
        this.f30626c.cubicTo(37.8141f, 22.0f, 38.6105f, 21.9307f, 39.3839f, 21.7982f);
        this.f30626c.cubicTo(40.7019f, 21.5723f, 42.0f, 22.5655f, 42.0f, 24.0f);
        this.f30626c.cubicTo(42.0f, 33.9411f, 33.9411f, 42.0f, 24.0f, 42.0f);
        this.f30626c.cubicTo(14.0589f, 42.0f, 6.0f, 33.9411f, 6.0f, 24.0f);
        this.f30626c.cubicTo(6.0f, 15.3248f, 12.1351f, 8.0871f, 20.3019f, 6.38068f);
        this.f30626c.close();
        this.f30626c.moveTo(19.2223f, 10.8358f);
        this.f30626c.cubicTo(13.8426f, 12.7885f, 10.0f, 17.9473f, 10.0f, 24.0f);
        this.f30626c.cubicTo(10.0f, 31.732f, 16.268f, 38.0f, 24.0f, 38.0f);
        this.f30626c.cubicTo(31.06f, 38.0f, 36.8994f, 32.7742f, 37.8611f, 25.9797f);
        this.f30626c.cubicTo(37.5756f, 25.9932f, 37.2886f, 26.0f, 37.0f, 26.0f);
        this.f30626c.cubicTo(28.0237f, 26.0f, 20.5827f, 19.4301f, 19.2223f, 10.8358f);
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
