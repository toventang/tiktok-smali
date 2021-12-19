package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mt extends a {
    static {
        Covode.recordClassIndex(18480);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 6.0f);
        this.f30626c.cubicTo(8.0f, 4.34315f, 9.34315f, 3.0f, 11.0f, 3.0f);
        this.f30626c.lineTo(28.0f, 3.0f);
        this.f30626c.cubicTo(29.6569f, 3.0f, 31.0f, 4.34315f, 31.0f, 6.0f);
        this.f30626c.lineTo(37.0f, 6.0f);
        this.f30626c.cubicTo(38.6569f, 6.0f, 40.0f, 7.34315f, 40.0f, 9.0f);
        this.f30626c.lineTo(40.0f, 42.0f);
        this.f30626c.cubicTo(40.0f, 43.6569f, 38.6569f, 45.0f, 37.0f, 45.0f);
        this.f30626c.lineTo(14.0f, 45.0f);
        this.f30626c.cubicTo(12.3431f, 45.0f, 11.0f, 43.6569f, 11.0f, 42.0f);
        this.f30626c.lineTo(11.0f, 31.0f);
        this.f30626c.cubicTo(9.34315f, 31.0f, 8.0f, 29.6569f, 8.0f, 28.0f);
        this.f30626c.lineTo(8.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.moveTo(15.0f, 31.0f);
        this.f30626c.lineTo(15.0f, 41.0f);
        this.f30626c.lineTo(36.0f, 41.0f);
        this.f30626c.lineTo(36.0f, 10.0f);
        this.f30626c.lineTo(31.0f, 10.0f);
        this.f30626c.lineTo(31.0f, 28.0f);
        this.f30626c.cubicTo(31.0f, 29.6569f, 29.6569f, 31.0f, 28.0f, 31.0f);
        this.f30626c.lineTo(15.0f, 31.0f);
        this.f30626c.close();
        this.f30626c.moveTo(12.0f, 7.0f);
        this.f30626c.lineTo(12.0f, 27.0f);
        this.f30626c.lineTo(27.0f, 27.0f);
        this.f30626c.lineTo(27.0f, 7.0f);
        this.f30626c.lineTo(12.0f, 7.0f);
        this.f30626c.close();
        this.f30626c.moveTo(18.5f, 14.0f);
        this.f30626c.cubicTo(18.5f, 15.933f, 17.6046f, 17.5f, 16.5f, 17.5f);
        this.f30626c.cubicTo(15.3954f, 17.5f, 14.5f, 15.933f, 14.5f, 14.0f);
        this.f30626c.cubicTo(14.5f, 12.067f, 15.3954f, 10.5f, 16.5f, 10.5f);
        this.f30626c.cubicTo(17.6046f, 10.5f, 18.5f, 12.067f, 18.5f, 14.0f);
        this.f30626c.close();
        this.f30626c.moveTo(22.5f, 17.5f);
        this.f30626c.cubicTo(23.6046f, 17.5f, 24.5f, 15.933f, 24.5f, 14.0f);
        this.f30626c.cubicTo(24.5f, 12.067f, 23.6046f, 10.5f, 22.5f, 10.5f);
        this.f30626c.cubicTo(21.3954f, 10.5f, 20.5f, 12.067f, 20.5f, 14.0f);
        this.f30626c.cubicTo(20.5f, 15.933f, 21.3954f, 17.5f, 22.5f, 17.5f);
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
