package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kb extends a {
    static {
        Covode.recordClassIndex(18408);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(5.0f, 10.0f);
        this.f30626c.lineTo(67.0f, 10.0f);
        this.f30626c.cubicTo(67.5523f, 10.0f, 68.0f, 10.4477f, 68.0f, 11.0f);
        this.f30626c.lineTo(68.0f, 38.6587f);
        this.f30626c.lineTo(58.5286f, 28.5108f);
        this.f30626c.cubicTo(57.1645f, 27.0493f, 54.8555f, 27.0253f, 53.4614f, 28.4582f);
        this.f30626c.lineTo(38.0517f, 44.2959f);
        this.f30626c.lineTo(32.4507f, 38.8026f);
        this.f30626c.cubicTo(31.0896f, 37.4677f, 28.9104f, 37.4677f, 27.5493f, 38.8026f);
        this.f30626c.lineTo(4.24641f, 61.6574f);
        this.f30626c.cubicTo(4.09296f, 61.4816f, 4.0f, 61.2517f, 4.0f, 61.0f);
        this.f30626c.lineTo(4.0f, 11.0f);
        this.f30626c.cubicTo(4.0f, 10.4477f, 4.44771f, 10.0f, 5.0f, 10.0f);
        this.f30626c.close();
        this.f30626c.moveTo(56.103f, 62.0f);
        this.f30626c.lineTo(40.1936f, 46.3965f);
        this.f30626c.lineTo(55.6115f, 30.5502f);
        this.f30626c.cubicTo(55.8107f, 30.3456f, 56.1406f, 30.349f, 56.3354f, 30.5578f);
        this.f30626c.lineTo(68.0f, 43.0555f);
        this.f30626c.lineTo(68.0f, 61.0f);
        this.f30626c.cubicTo(68.0f, 61.5523f, 67.5523f, 62.0f, 67.0f, 62.0f);
        this.f30626c.lineTo(56.103f, 62.0f);
        this.f30626c.close();
        this.f30626c.moveTo(67.0f, 65.0f);
        this.f30626c.lineTo(55.0193f, 65.0f);
        this.f30626c.lineTo(55.0f, 65.0f);
        this.f30626c.lineTo(54.8774f, 65.0f);
        this.f30626c.lineTo(5.12266f, 65.0f);
        this.f30626c.lineTo(5.0f, 65.0f);
        this.f30626c.lineTo(4.98071f, 65.0f);
        this.f30626c.cubicTo(2.78045f, 64.9896f, 1.0f, 63.2027f, 1.0f, 61.0f);
        this.f30626c.lineTo(1.0f, 11.0f);
        this.f30626c.cubicTo(1.0f, 8.79086f, 2.79086f, 7.0f, 5.0f, 7.0f);
        this.f30626c.lineTo(67.0f, 7.0f);
        this.f30626c.cubicTo(69.2091f, 7.0f, 71.0f, 8.79086f, 71.0f, 11.0f);
        this.f30626c.lineTo(71.0f, 41.873f);
        this.f30626c.lineTo(71.0966f, 41.9765f);
        this.f30626c.lineTo(71.0f, 42.0667f);
        this.f30626c.lineTo(71.0f, 61.0f);
        this.f30626c.cubicTo(71.0f, 63.2091f, 69.2091f, 65.0f, 67.0f, 65.0f);
        this.f30626c.close();
        this.f30626c.moveTo(30.3501f, 40.9444f);
        this.f30626c.lineTo(51.8186f, 62.0f);
        this.f30626c.lineTo(8.18149f, 62.0f);
        this.f30626c.lineTo(29.6499f, 40.9444f);
        this.f30626c.cubicTo(29.8444f, 40.7537f, 30.1557f, 40.7537f, 30.3501f, 40.9444f);
        this.f30626c.close();
        this.f30626c.moveTo(19.5f, 30.0f);
        this.f30626c.cubicTo(21.9853f, 30.0f, 24.0f, 27.9853f, 24.0f, 25.5f);
        this.f30626c.cubicTo(24.0f, 23.0147f, 21.9853f, 21.0f, 19.5f, 21.0f);
        this.f30626c.cubicTo(17.0147f, 21.0f, 15.0f, 23.0147f, 15.0f, 25.5f);
        this.f30626c.cubicTo(15.0f, 27.9853f, 17.0147f, 30.0f, 19.5f, 30.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
