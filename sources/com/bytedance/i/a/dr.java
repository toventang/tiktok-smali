package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class dr extends a {
    static {
        Covode.recordClassIndex(18235);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(9.0f, 10.7647f);
        this.f30626c.cubicTo(9.0f, 9.79009f, 9.79009f, 9.0f, 10.7647f, 9.0f);
        this.f30626c.lineTo(31.9412f, 9.0f);
        this.f30626c.cubicTo(32.4285f, 9.0f, 32.8235f, 9.39504f, 32.8235f, 9.88235f);
        this.f30626c.lineTo(32.8235f, 11.6471f);
        this.f30626c.cubicTo(32.8235f, 12.1344f, 32.4285f, 12.5294f, 31.9412f, 12.5294f);
        this.f30626c.lineTo(15.0251f, 12.5294f);
        this.f30626c.lineTo(38.7416f, 36.2459f);
        this.f30626c.cubicTo(39.0861f, 36.5905f, 39.0861f, 37.1492f, 38.7416f, 37.4937f);
        this.f30626c.lineTo(37.4937f, 38.7416f);
        this.f30626c.cubicTo(37.1492f, 39.0861f, 36.5905f, 39.0861f, 36.2459f, 38.7416f);
        this.f30626c.lineTo(12.5294f, 15.0251f);
        this.f30626c.lineTo(12.5294f, 31.9412f);
        this.f30626c.cubicTo(12.5294f, 32.4285f, 12.1344f, 32.8235f, 11.6471f, 32.8235f);
        this.f30626c.lineTo(9.88235f, 32.8235f);
        this.f30626c.cubicTo(9.39504f, 32.8235f, 9.0f, 32.4285f, 9.0f, 31.9412f);
        this.f30626c.lineTo(9.0f, 10.7647f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-15329245);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
