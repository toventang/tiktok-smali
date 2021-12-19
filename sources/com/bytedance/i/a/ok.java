package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ok extends a {
    static {
        Covode.recordClassIndex(18525);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(10.3938f, 12.1972f);
        this.f30626c.cubicTo(14.163f, 8.52339f, 20.0853f, 8.54285f, 24.0f, 12.6217f);
        this.f30626c.cubicTo(27.9147f, 8.54285f, 33.837f, 8.52339f, 37.6062f, 12.1972f);
        this.f30626c.cubicTo(41.4646f, 15.958f, 41.4646f, 22.0718f, 37.6062f, 25.8326f);
        this.f30626c.lineTo(25.047f, 38.0742f);
        this.f30626c.cubicTo(24.4645f, 38.6419f, 23.5355f, 38.6419f, 22.953f, 38.0742f);
        this.f30626c.lineTo(10.3938f, 25.8326f);
        this.f30626c.cubicTo(6.5354f, 22.0718f, 6.5354f, 15.958f, 10.3938f, 12.1972f);
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
