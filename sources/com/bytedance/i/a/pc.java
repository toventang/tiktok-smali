package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pc extends a {
    static {
        Covode.recordClassIndex(18544);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(14.0f, 8.0f);
        this.f30626c.cubicTo(14.0f, 8.55228f, 14.4477f, 9.0f, 15.0f, 9.0f);
        this.f30626c.lineTo(20.0f, 9.0f);
        this.f30626c.lineTo(20.0f, 12.1164f);
        this.f30626c.cubicTo(11.5537f, 13.1063f, 5.0f, 20.2878f, 5.0f, 29.0f);
        this.f30626c.cubicTo(5.0f, 35.5745f, 8.73188f, 41.2734f, 14.1857f, 44.1011f);
        this.f30626c.cubicTo(14.676f, 44.3553f, 15.269f, 44.126f, 15.4938f, 43.6215f);
        this.f30626c.lineTo(16.3078f, 41.7947f);
        this.f30626c.cubicTo(16.5326f, 41.2902f, 16.3036f, 40.7024f, 15.818f, 40.4393f);
        this.f30626c.cubicTo(11.7545f, 38.2385f, 9.0f, 33.939f, 9.0f, 29.0f);
        this.f30626c.cubicTo(9.0f, 21.8203f, 14.8203f, 16.0f, 22.0f, 16.0f);
        this.f30626c.cubicTo(23.9892f, 16.0f, 25.8699f, 16.4455f, 27.5519f, 17.2412f);
        this.f30626c.cubicTo(28.0511f, 17.4774f, 28.6605f, 17.3146f, 28.9345f, 16.8351f);
        this.f30626c.lineTo(29.9267f, 15.0986f);
        this.f30626c.cubicTo(30.2007f, 14.619f, 30.0353f, 14.0053f, 29.5404f, 13.7601f);
        this.f30626c.cubicTo(27.8351f, 12.9149f, 25.9679f, 12.3475f, 24.0f, 12.1166f);
        this.f30626c.lineTo(24.0f, 9.0f);
        this.f30626c.lineTo(29.0f, 9.0f);
        this.f30626c.cubicTo(29.5523f, 9.0f, 30.0f, 8.55228f, 30.0f, 8.0f);
        this.f30626c.lineTo(30.0f, 6.0f);
        this.f30626c.cubicTo(30.0f, 5.44772f, 29.5523f, 5.0f, 29.0f, 5.0f);
        this.f30626c.lineTo(15.0f, 5.0f);
        this.f30626c.cubicTo(14.4477f, 5.0f, 14.0f, 5.44772f, 14.0f, 6.0f);
        this.f30626c.lineTo(14.0f, 8.0f);
        this.f30626c.close();
        this.f30626c.moveTo(25.0f, 25.5f);
        this.f30626c.cubicTo(25.0f, 21.9101f, 27.9101f, 19.0f, 31.5f, 19.0f);
        this.f30626c.cubicTo(35.0899f, 19.0f, 38.0f, 21.9101f, 38.0f, 25.5f);
        this.f30626c.lineTo(38.0f, 28.0f);
        this.f30626c.lineTo(41.0f, 28.0f);
        this.f30626c.cubicTo(42.1046f, 28.0f, 43.0f, 28.8954f, 43.0f, 30.0f);
        this.f30626c.lineTo(43.0f, 42.0f);
        this.f30626c.cubicTo(43.0f, 43.1046f, 42.1046f, 44.0f, 41.0f, 44.0f);
        this.f30626c.lineTo(22.0f, 44.0f);
        this.f30626c.cubicTo(20.8954f, 44.0f, 20.0f, 43.1046f, 20.0f, 42.0f);
        this.f30626c.lineTo(20.0f, 30.0f);
        this.f30626c.cubicTo(20.0f, 28.8954f, 20.8954f, 28.0f, 22.0f, 28.0f);
        this.f30626c.lineTo(25.0f, 28.0f);
        this.f30626c.lineTo(25.0f, 25.5f);
        this.f30626c.close();
        this.f30626c.moveTo(29.0f, 28.0f);
        this.f30626c.lineTo(34.0f, 28.0f);
        this.f30626c.lineTo(34.0f, 25.5f);
        this.f30626c.cubicTo(34.0f, 24.1193f, 32.8807f, 23.0f, 31.5f, 23.0f);
        this.f30626c.cubicTo(30.1193f, 23.0f, 29.0f, 24.1193f, 29.0f, 25.5f);
        this.f30626c.lineTo(29.0f, 28.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 40.0f);
        this.f30626c.lineTo(24.0f, 32.0f);
        this.f30626c.lineTo(39.0f, 32.0f);
        this.f30626c.lineTo(39.0f, 40.0f);
        this.f30626c.lineTo(24.0f, 40.0f);
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
