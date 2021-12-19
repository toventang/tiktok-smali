package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bz extends a {
    static {
        Covode.recordClassIndex(18189);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 6.5f);
        this.f30626c.cubicTo(8.0f, 5.11929f, 9.11929f, 4.0f, 10.5f, 4.0f);
        this.f30626c.lineTo(26.5f, 4.0f);
        this.f30626c.cubicTo(27.8807f, 4.0f, 29.0f, 5.11929f, 29.0f, 6.5f);
        this.f30626c.lineTo(29.0f, 7.0f);
        this.f30626c.lineTo(37.5f, 7.0f);
        this.f30626c.cubicTo(38.8807f, 7.0f, 40.0f, 8.11929f, 40.0f, 9.5f);
        this.f30626c.lineTo(40.0f, 41.5f);
        this.f30626c.cubicTo(40.0f, 42.8807f, 38.8807f, 44.0f, 37.5f, 44.0f);
        this.f30626c.lineTo(14.5f, 44.0f);
        this.f30626c.cubicTo(13.1193f, 44.0f, 12.0f, 42.8807f, 12.0f, 41.5f);
        this.f30626c.lineTo(12.0f, 30.0f);
        this.f30626c.lineTo(10.5f, 30.0f);
        this.f30626c.cubicTo(9.11929f, 30.0f, 8.0f, 28.8807f, 8.0f, 27.5f);
        this.f30626c.lineTo(8.0f, 6.5f);
        this.f30626c.close();
        this.f30626c.moveTo(15.0f, 30.0f);
        this.f30626c.lineTo(15.0f, 41.0f);
        this.f30626c.lineTo(37.0f, 41.0f);
        this.f30626c.lineTo(37.0f, 10.0f);
        this.f30626c.lineTo(29.0f, 10.0f);
        this.f30626c.lineTo(29.0f, 27.5f);
        this.f30626c.cubicTo(29.0f, 28.8807f, 27.8807f, 30.0f, 26.5f, 30.0f);
        this.f30626c.lineTo(15.0f, 30.0f);
        this.f30626c.close();
        this.f30626c.moveTo(11.0f, 7.0f);
        this.f30626c.lineTo(11.0f, 27.0f);
        this.f30626c.lineTo(26.0f, 27.0f);
        this.f30626c.lineTo(26.0f, 7.0f);
        this.f30626c.lineTo(11.0f, 7.0f);
        this.f30626c.close();
        this.f30626c.moveTo(17.5f, 14.0f);
        this.f30626c.cubicTo(17.5f, 15.933f, 16.6046f, 17.5f, 15.5f, 17.5f);
        this.f30626c.cubicTo(14.3954f, 17.5f, 13.5f, 15.933f, 13.5f, 14.0f);
        this.f30626c.cubicTo(13.5f, 12.067f, 14.3954f, 10.5f, 15.5f, 10.5f);
        this.f30626c.cubicTo(16.6046f, 10.5f, 17.5f, 12.067f, 17.5f, 14.0f);
        this.f30626c.close();
        this.f30626c.moveTo(21.5f, 17.5f);
        this.f30626c.cubicTo(22.6046f, 17.5f, 23.5f, 15.933f, 23.5f, 14.0f);
        this.f30626c.cubicTo(23.5f, 12.067f, 22.6046f, 10.5f, 21.5f, 10.5f);
        this.f30626c.cubicTo(20.3954f, 10.5f, 19.5f, 12.067f, 19.5f, 14.0f);
        this.f30626c.cubicTo(19.5f, 15.933f, 20.3954f, 17.5f, 21.5f, 17.5f);
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
