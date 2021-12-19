package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class oj extends a {
    static {
        Covode.recordClassIndex(18524);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 12.6217f);
        this.f30626c.cubicTo(20.0853f, 8.54285f, 14.163f, 8.52339f, 10.3938f, 12.1972f);
        this.f30626c.cubicTo(6.5354f, 15.958f, 6.5354f, 22.0718f, 10.3938f, 25.8326f);
        this.f30626c.lineTo(22.953f, 38.0742f);
        this.f30626c.cubicTo(23.5355f, 38.6419f, 24.4645f, 38.6419f, 25.047f, 38.0742f);
        this.f30626c.lineTo(37.6062f, 25.8326f);
        this.f30626c.cubicTo(41.4646f, 22.0718f, 41.4646f, 15.958f, 37.6062f, 12.1972f);
        this.f30626c.cubicTo(33.837f, 8.52339f, 27.9147f, 8.54285f, 24.0f, 12.6217f);
        this.f30626c.close();
        this.f30626c.moveTo(22.097f, 14.9844f);
        this.f30626c.cubicTo(19.299f, 11.7867f, 15.1116f, 11.788f, 12.4878f, 14.3455f);
        this.f30626c.cubicTo(9.83741f, 16.9289f, 9.83741f, 21.1009f, 12.4878f, 23.6843f);
        this.f30626c.lineTo(24.0f, 34.9053f);
        this.f30626c.lineTo(35.5122f, 23.6843f);
        this.f30626c.cubicTo(38.1626f, 21.1009f, 38.1626f, 16.9289f, 35.5122f, 14.3455f);
        this.f30626c.cubicTo(32.8884f, 11.788f, 28.701f, 11.7867f, 25.903f, 14.9844f);
        this.f30626c.lineTo(25.8637f, 15.0292f);
        this.f30626c.lineTo(25.047f, 15.8253f);
        this.f30626c.cubicTo(24.4645f, 16.3931f, 23.5355f, 16.3931f, 22.953f, 15.8253f);
        this.f30626c.lineTo(22.1363f, 15.0292f);
        this.f30626c.lineTo(22.097f, 14.9844f);
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
