package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class r extends a {
    static {
        Covode.recordClassIndex(18569);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.0f, 39.0f);
        this.f30626c.lineTo(8.0f, 8.5f);
        this.f30626c.cubicTo(8.0f, 8.22386f, 8.22386f, 8.0f, 8.5f, 8.0f);
        this.f30626c.lineTo(9.5f, 8.0f);
        this.f30626c.cubicTo(9.77614f, 8.0f, 10.0f, 8.22386f, 10.0f, 8.5f);
        this.f30626c.lineTo(10.0f, 38.0f);
        this.f30626c.lineTo(39.5f, 38.0f);
        this.f30626c.cubicTo(39.7761f, 38.0f, 40.0f, 38.2239f, 40.0f, 38.5f);
        this.f30626c.lineTo(40.0f, 39.5f);
        this.f30626c.cubicTo(40.0f, 39.7761f, 39.7761f, 40.0f, 39.5f, 40.0f);
        this.f30626c.lineTo(9.0f, 40.0f);
        this.f30626c.cubicTo(8.44772f, 40.0f, 8.0f, 39.5523f, 8.0f, 39.0f);
        this.f30626c.close();
        this.f30626c.moveTo(38.7882f, 13.9822f);
        this.f30626c.cubicTo(39.02f, 14.1322f, 39.0864f, 14.4417f, 38.9364f, 14.6736f);
        this.f30626c.lineTo(30.2343f, 28.1222f);
        this.f30626c.cubicTo(30.0851f, 28.3528f, 29.8476f, 28.5119f, 29.5776f, 28.5621f);
        this.f30626c.cubicTo(29.3075f, 28.6123f, 29.0287f, 28.5492f, 28.8066f, 28.3877f);
        this.f30626c.lineTo(20.7164f, 22.504f);
        this.f30626c.lineTo(14.1937f, 33.3752f);
        this.f30626c.cubicTo(14.0516f, 33.612f, 13.7445f, 33.6888f, 13.5077f, 33.5467f);
        this.f30626c.lineTo(12.6502f, 33.0322f);
        this.f30626c.cubicTo(12.4134f, 32.8902f, 12.3366f, 32.583f, 12.4787f, 32.3462f);
        this.f30626c.lineTo(19.5636f, 20.5381f);
        this.f30626c.cubicTo(19.7079f, 20.2976f, 19.9467f, 20.1287f, 20.2216f, 20.0727f);
        this.f30626c.cubicTo(20.4965f, 20.0168f, 20.7823f, 20.0789f, 21.0092f, 20.2439f);
        this.f30626c.lineTo(29.1289f, 26.1491f);
        this.f30626c.lineTo(37.2572f, 13.5871f);
        this.f30626c.cubicTo(37.4072f, 13.3552f, 37.7168f, 13.2889f, 37.9486f, 13.4389f);
        this.f30626c.lineTo(38.7882f, 13.9822f);
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
