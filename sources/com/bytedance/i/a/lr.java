package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class lr extends a {
    static {
        Covode.recordClassIndex(18451);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(28.2929f, 13.8787f);
        this.f30626c.cubicTo(27.9024f, 14.2692f, 27.9024f, 14.9024f, 28.2929f, 15.2929f);
        this.f30626c.lineTo(29.7071f, 16.7071f);
        this.f30626c.cubicTo(30.0977f, 17.0977f, 30.7308f, 17.0977f, 31.1213f, 16.7071f);
        this.f30626c.lineTo(39.7071f, 8.12135f);
        this.f30626c.cubicTo(40.0977f, 7.73083f, 40.0977f, 7.09766f, 39.7071f, 6.70714f);
        this.f30626c.lineTo(38.2929f, 5.29292f);
        this.f30626c.cubicTo(37.9024f, 4.9024f, 37.2692f, 4.9024f, 36.8787f, 5.29292f);
        this.f30626c.lineTo(28.2929f, 13.8787f);
        this.f30626c.close();
        this.f30626c.moveTo(12.0f, 6.0f);
        this.f30626c.cubicTo(9.79086f, 6.0f, 8.0f, 7.79086f, 8.0f, 10.0f);
        this.f30626c.lineTo(8.0f, 38.0f);
        this.f30626c.cubicTo(8.0f, 40.2091f, 9.79086f, 42.0f, 12.0f, 42.0f);
        this.f30626c.lineTo(36.0f, 42.0f);
        this.f30626c.cubicTo(38.2091f, 42.0f, 40.0f, 40.2091f, 40.0f, 38.0f);
        this.f30626c.lineTo(40.0f, 19.0f);
        this.f30626c.cubicTo(40.0f, 18.4477f, 39.5523f, 18.0f, 39.0f, 18.0f);
        this.f30626c.lineTo(37.0f, 18.0f);
        this.f30626c.cubicTo(36.4477f, 18.0f, 36.0f, 18.4477f, 36.0f, 19.0f);
        this.f30626c.lineTo(36.0f, 37.0f);
        this.f30626c.cubicTo(36.0f, 37.5523f, 35.5523f, 38.0f, 35.0f, 38.0f);
        this.f30626c.lineTo(13.0f, 38.0f);
        this.f30626c.cubicTo(12.4477f, 38.0f, 12.0f, 37.5523f, 12.0f, 37.0f);
        this.f30626c.lineTo(12.0f, 11.0f);
        this.f30626c.cubicTo(12.0f, 10.4477f, 12.4477f, 10.0f, 13.0f, 10.0f);
        this.f30626c.lineTo(26.0f, 10.0f);
        this.f30626c.cubicTo(26.5523f, 10.0f, 27.0f, 9.55229f, 27.0f, 9.0f);
        this.f30626c.lineTo(27.0f, 7.0f);
        this.f30626c.cubicTo(27.0f, 6.44772f, 26.5523f, 6.0f, 26.0f, 6.0f);
        this.f30626c.lineTo(12.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.moveTo(18.0f, 19.0f);
        this.f30626c.cubicTo(17.4477f, 19.0f, 17.0f, 19.4477f, 17.0f, 20.0f);
        this.f30626c.lineTo(17.0f, 22.0f);
        this.f30626c.cubicTo(17.0f, 22.5523f, 17.4477f, 23.0f, 18.0f, 23.0f);
        this.f30626c.lineTo(24.0f, 23.0f);
        this.f30626c.cubicTo(24.5523f, 23.0f, 25.0f, 22.5523f, 25.0f, 22.0f);
        this.f30626c.lineTo(25.0f, 20.0f);
        this.f30626c.cubicTo(25.0f, 19.4477f, 24.5523f, 19.0f, 24.0f, 19.0f);
        this.f30626c.lineTo(18.0f, 19.0f);
        this.f30626c.close();
        this.f30626c.moveTo(17.0f, 28.0f);
        this.f30626c.cubicTo(17.0f, 27.4477f, 17.4477f, 27.0f, 18.0f, 27.0f);
        this.f30626c.lineTo(29.0f, 27.0f);
        this.f30626c.cubicTo(29.5523f, 27.0f, 30.0f, 27.4477f, 30.0f, 28.0f);
        this.f30626c.lineTo(30.0f, 30.0f);
        this.f30626c.cubicTo(30.0f, 30.5523f, 29.5523f, 31.0f, 29.0f, 31.0f);
        this.f30626c.lineTo(18.0f, 31.0f);
        this.f30626c.cubicTo(17.4477f, 31.0f, 17.0f, 30.5523f, 17.0f, 30.0f);
        this.f30626c.lineTo(17.0f, 28.0f);
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
