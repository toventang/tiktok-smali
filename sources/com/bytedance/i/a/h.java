package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class h extends a {
    static {
        Covode.recordClassIndex(18325);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(7.0f, 21.5f);
        this.f30626c.cubicTo(7.0f, 13.9698f, 14.385f, 8.0f, 24.0f, 8.0f);
        this.f30626c.cubicTo(33.615f, 8.0f, 41.0f, 13.9698f, 41.0f, 21.5f);
        this.f30626c.cubicTo(41.0f, 26.1275f, 38.6972f, 29.7551f, 35.5717f, 32.6402f);
        this.f30626c.cubicTo(32.9194f, 35.0885f, 29.7308f, 36.9481f, 27.0f, 38.3688f);
        this.f30626c.lineTo(27.0f, 37.0f);
        this.f30626c.cubicTo(27.0f, 35.8954f, 26.1046f, 35.0f, 25.0f, 35.0f);
        this.f30626c.lineTo(24.0f, 35.0f);
        this.f30626c.cubicTo(14.385f, 35.0f, 7.0f, 29.0302f, 7.0f, 21.5f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 6.0f);
        this.f30626c.cubicTo(13.7328f, 6.0f, 5.0f, 12.4616f, 5.0f, 21.5f);
        this.f30626c.cubicTo(5.0f, 30.5384f, 13.7328f, 37.0f, 24.0f, 37.0f);
        this.f30626c.lineTo(25.0f, 37.0f);
        this.f30626c.lineTo(25.0f, 40.0f);
        this.f30626c.cubicTo(25.0f, 40.3466f, 25.1795f, 40.6684f, 25.4743f, 40.8507f);
        this.f30626c.cubicTo(25.7691f, 41.0329f, 26.1372f, 41.0494f, 26.4472f, 40.8944f);
        this.f30626c.cubicTo(29.4542f, 39.3909f, 33.566f, 37.2134f, 36.9283f, 34.1098f);
        this.f30626c.cubicTo(40.3028f, 30.9949f, 43.0f, 26.8725f, 43.0f, 21.5f);
        this.f30626c.cubicTo(43.0f, 12.4616f, 34.2672f, 6.0f, 24.0f, 6.0f);
        this.f30626c.close();
        this.f30626c.moveTo(17.0f, 24.5f);
        this.f30626c.cubicTo(18.1046f, 24.5f, 19.0f, 23.6046f, 19.0f, 22.5f);
        this.f30626c.cubicTo(19.0f, 21.3954f, 18.1046f, 20.5f, 17.0f, 20.5f);
        this.f30626c.cubicTo(15.8954f, 20.5f, 15.0f, 21.3954f, 15.0f, 22.5f);
        this.f30626c.cubicTo(15.0f, 23.6046f, 15.8954f, 24.5f, 17.0f, 24.5f);
        this.f30626c.close();
        this.f30626c.moveTo(26.0f, 22.5f);
        this.f30626c.cubicTo(26.0f, 23.6046f, 25.1046f, 24.5f, 24.0f, 24.5f);
        this.f30626c.cubicTo(22.8954f, 24.5f, 22.0f, 23.6046f, 22.0f, 22.5f);
        this.f30626c.cubicTo(22.0f, 21.3954f, 22.8954f, 20.5f, 24.0f, 20.5f);
        this.f30626c.cubicTo(25.1046f, 20.5f, 26.0f, 21.3954f, 26.0f, 22.5f);
        this.f30626c.close();
        this.f30626c.moveTo(31.0f, 24.5f);
        this.f30626c.cubicTo(32.1046f, 24.5f, 33.0f, 23.6046f, 33.0f, 22.5f);
        this.f30626c.cubicTo(33.0f, 21.3954f, 32.1046f, 20.5f, 31.0f, 20.5f);
        this.f30626c.cubicTo(29.8954f, 20.5f, 29.0f, 21.3954f, 29.0f, 22.5f);
        this.f30626c.cubicTo(29.0f, 23.6046f, 29.8954f, 24.5f, 31.0f, 24.5f);
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
