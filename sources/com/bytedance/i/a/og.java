package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class og extends a {
    static {
        Covode.recordClassIndex(18521);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(13.5f, 9.0f);
        this.f30626c.cubicTo(11.0147f, 9.0f, 9.0f, 11.0147f, 9.0f, 13.5f);
        this.f30626c.lineTo(9.0f, 34.5f);
        this.f30626c.cubicTo(9.0f, 36.9853f, 11.0147f, 39.0f, 13.5f, 39.0f);
        this.f30626c.lineTo(34.5f, 39.0f);
        this.f30626c.cubicTo(36.9853f, 39.0f, 39.0f, 36.9853f, 39.0f, 34.5f);
        this.f30626c.lineTo(39.0f, 13.5f);
        this.f30626c.cubicTo(39.0f, 11.0147f, 36.9853f, 9.0f, 34.5f, 9.0f);
        this.f30626c.lineTo(13.5f, 9.0f);
        this.f30626c.close();
        this.f30626c.moveTo(20.0959f, 16.3259f);
        this.f30626c.cubicTo(19.6318f, 16.0579f, 19.06f, 16.0579f, 18.5959f, 16.3259f);
        this.f30626c.cubicTo(18.1318f, 16.5938f, 17.8459f, 17.089f, 17.8459f, 17.6249f);
        this.f30626c.lineTo(17.8459f, 29.3162f);
        this.f30626c.cubicTo(17.8459f, 29.8521f, 18.1318f, 30.3473f, 18.5959f, 30.6153f);
        this.f30626c.cubicTo(19.06f, 30.8832f, 19.6318f, 30.8832f, 20.0959f, 30.6153f);
        this.f30626c.lineTo(30.2209f, 24.7696f);
        this.f30626c.cubicTo(30.685f, 24.5017f, 30.9709f, 24.0065f, 30.9709f, 23.4706f);
        this.f30626c.cubicTo(30.9709f, 22.9347f, 30.685f, 22.4395f, 30.2209f, 22.1715f);
        this.f30626c.lineTo(20.0959f, 16.3259f);
        this.f30626c.close();
        this.f30626c.moveTo(4.5f, 12.0f);
        this.f30626c.cubicTo(5.32843f, 12.0f, 6.0f, 12.6716f, 6.0f, 13.5f);
        this.f30626c.lineTo(6.0f, 34.5f);
        this.f30626c.cubicTo(6.0f, 35.3284f, 5.32843f, 36.0f, 4.5f, 36.0f);
        this.f30626c.cubicTo(3.67157f, 36.0f, 3.0f, 35.3284f, 3.0f, 34.5f);
        this.f30626c.lineTo(3.0f, 13.5f);
        this.f30626c.cubicTo(3.0f, 12.6716f, 3.67157f, 12.0f, 4.5f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(45.0f, 13.5f);
        this.f30626c.cubicTo(45.0f, 12.6716f, 44.3284f, 12.0f, 43.5f, 12.0f);
        this.f30626c.cubicTo(42.6716f, 12.0f, 42.0f, 12.6716f, 42.0f, 13.5f);
        this.f30626c.lineTo(42.0f, 34.5f);
        this.f30626c.cubicTo(42.0f, 35.3284f, 42.6716f, 36.0f, 43.5f, 36.0f);
        this.f30626c.cubicTo(44.3284f, 36.0f, 45.0f, 35.3284f, 45.0f, 34.5f);
        this.f30626c.lineTo(45.0f, 13.5f);
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
