package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ai extends a {
    static {
        Covode.recordClassIndex(18145);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.5f, 8.0f);
        this.f30626c.lineTo(32.0f, 8.0f);
        this.f30626c.cubicTo(36.4183f, 8.0f, 40.0f, 11.5817f, 40.0f, 16.0f);
        this.f30626c.lineTo(40.0f, 31.5f);
        this.f30626c.cubicTo(40.0f, 31.7761f, 39.7761f, 32.0f, 39.5f, 32.0f);
        this.f30626c.lineTo(38.5f, 32.0f);
        this.f30626c.cubicTo(38.2239f, 32.0f, 38.0f, 31.7761f, 38.0f, 31.5f);
        this.f30626c.lineTo(38.0f, 16.0f);
        this.f30626c.cubicTo(38.0f, 12.6863f, 35.3137f, 10.0f, 32.0f, 10.0f);
        this.f30626c.lineTo(16.5f, 10.0f);
        this.f30626c.cubicTo(16.2239f, 10.0f, 16.0f, 9.77614f, 16.0f, 9.5f);
        this.f30626c.lineTo(16.0f, 8.5f);
        this.f30626c.cubicTo(16.0f, 8.22386f, 16.2239f, 8.0f, 16.5f, 8.0f);
        this.f30626c.close();
        this.f30626c.moveTo(12.0f, 12.0f);
        this.f30626c.cubicTo(9.79086f, 12.0f, 8.0f, 13.7909f, 8.0f, 16.0f);
        this.f30626c.lineTo(8.0f, 36.0f);
        this.f30626c.cubicTo(8.0f, 38.2091f, 9.79086f, 40.0f, 12.0f, 40.0f);
        this.f30626c.lineTo(32.0f, 40.0f);
        this.f30626c.cubicTo(34.2091f, 40.0f, 36.0f, 38.2091f, 36.0f, 36.0f);
        this.f30626c.lineTo(36.0f, 16.0f);
        this.f30626c.cubicTo(36.0f, 13.7909f, 34.2091f, 12.0f, 32.0f, 12.0f);
        this.f30626c.lineTo(12.0f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(19.5665f, 19.676f);
        this.f30626c.cubicTo(19.2605f, 19.4656f, 18.8631f, 19.4421f, 18.5345f, 19.615f);
        this.f30626c.cubicTo(18.2058f, 19.7879f, 18.0f, 20.1286f, 18.0f, 20.5f);
        this.f30626c.lineTo(18.0f, 31.5f);
        this.f30626c.cubicTo(18.0f, 31.8714f, 18.2058f, 32.2121f, 18.5345f, 32.385f);
        this.f30626c.cubicTo(18.8631f, 32.5579f, 19.2605f, 32.5344f, 19.5665f, 32.324f);
        this.f30626c.lineTo(27.5665f, 26.824f);
        this.f30626c.cubicTo(27.8379f, 26.6375f, 28.0f, 26.3293f, 28.0f, 26.0f);
        this.f30626c.cubicTo(28.0f, 25.6707f, 27.8379f, 25.3625f, 27.5665f, 25.176f);
        this.f30626c.lineTo(19.5665f, 19.676f);
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
