package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class af extends a {
    static {
        Covode.recordClassIndex(18142);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(23.0f, 33.0f);
        this.f30626c.lineTo(12.0f, 33.0f);
        this.f30626c.cubicTo(10.8954f, 33.0f, 10.0f, 32.1046f, 10.0f, 31.0f);
        this.f30626c.lineTo(10.0f, 27.0f);
        this.f30626c.cubicTo(10.0f, 25.8954f, 10.8954f, 25.0f, 12.0f, 25.0f);
        this.f30626c.lineTo(14.6071f, 25.0f);
        this.f30626c.lineTo(16.75f, 12.0f);
        this.f30626c.lineTo(16.0f, 12.0f);
        this.f30626c.cubicTo(15.5928f, 12.0f, 15.214f, 11.8783f, 14.898f, 11.6693f);
        this.f30626c.cubicTo(14.3569f, 11.3114f, 14.0f, 10.6974f, 14.0f, 10.0f);
        this.f30626c.lineTo(14.0f, 7.0f);
        this.f30626c.cubicTo(14.0f, 5.89543f, 14.8954f, 5.0f, 16.0f, 5.0f);
        this.f30626c.lineTo(32.0f, 5.0f);
        this.f30626c.cubicTo(33.1046f, 5.0f, 34.0f, 5.89543f, 34.0f, 7.0f);
        this.f30626c.lineTo(34.0f, 10.0f);
        this.f30626c.cubicTo(34.0f, 10.791f, 33.5408f, 11.4747f, 32.8745f, 11.7992f);
        this.f30626c.cubicTo(32.6103f, 11.9278f, 32.3136f, 12.0f, 32.0f, 12.0f);
        this.f30626c.lineTo(31.625f, 12.0f);
        this.f30626c.lineTo(33.5536f, 25.0f);
        this.f30626c.lineTo(36.0f, 25.0f);
        this.f30626c.cubicTo(37.1046f, 25.0f, 38.0f, 25.8954f, 38.0f, 27.0f);
        this.f30626c.lineTo(38.0f, 31.0f);
        this.f30626c.cubicTo(38.0f, 32.1046f, 37.1046f, 33.0f, 36.0f, 33.0f);
        this.f30626c.lineTo(25.0f, 33.0f);
        this.f30626c.lineTo(25.0f, 42.0f);
        this.f30626c.cubicTo(25.0f, 42.5523f, 24.5523f, 43.0f, 24.0f, 43.0f);
        this.f30626c.cubicTo(23.4477f, 43.0f, 23.0f, 42.5523f, 23.0f, 42.0f);
        this.f30626c.lineTo(23.0f, 33.0f);
        this.f30626c.close();
        this.f30626c.moveTo(15.4357f, 27.0f);
        this.f30626c.cubicTo(15.924f, 27.0f, 16.3409f, 26.6473f, 16.4218f, 26.1657f);
        this.f30626c.lineTo(18.982f, 10.9326f);
        this.f30626c.cubicTo(19.0641f, 10.4446f, 18.6879f, 10.0f, 18.1931f, 10.0f);
        this.f30626c.lineTo(16.0f, 10.0f);
        this.f30626c.lineTo(16.0f, 7.0f);
        this.f30626c.lineTo(32.0f, 7.0f);
        this.f30626c.lineTo(32.0f, 10.0f);
        this.f30626c.lineTo(30.208f, 10.0f);
        this.f30626c.cubicTo(29.7185f, 10.0f, 29.3438f, 10.4357f, 29.417f, 10.9196f);
        this.f30626c.lineTo(31.7207f, 26.1496f);
        this.f30626c.cubicTo(31.7947f, 26.6385f, 32.2149f, 27.0f, 32.7095f, 27.0f);
        this.f30626c.lineTo(36.0f, 27.0f);
        this.f30626c.lineTo(36.0f, 31.0f);
        this.f30626c.lineTo(12.0f, 31.0f);
        this.f30626c.lineTo(12.0f, 27.0f);
        this.f30626c.lineTo(15.4357f, 27.0f);
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
