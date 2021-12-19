package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mm extends a {
    static {
        Covode.recordClassIndex(18473);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(22.0996f, 9.59961f);
        this.f30626c.cubicTo(21.8235f, 9.59961f, 21.5996f, 9.82347f, 21.5996f, 10.0996f);
        this.f30626c.lineTo(21.5996f, 21.5996f);
        this.f30626c.lineTo(10.0996f, 21.5996f);
        this.f30626c.cubicTo(9.82347f, 21.5996f, 9.59961f, 21.8235f, 9.59961f, 22.0996f);
        this.f30626c.lineTo(9.59961f, 25.8996f);
        this.f30626c.cubicTo(9.59961f, 26.1758f, 9.82347f, 26.3996f, 10.0996f, 26.3996f);
        this.f30626c.lineTo(21.5996f, 26.3996f);
        this.f30626c.lineTo(21.5996f, 37.8996f);
        this.f30626c.cubicTo(21.5996f, 38.1758f, 21.8235f, 38.3996f, 22.0996f, 38.3996f);
        this.f30626c.lineTo(25.8996f, 38.3996f);
        this.f30626c.cubicTo(26.1758f, 38.3996f, 26.3996f, 38.1758f, 26.3996f, 37.8996f);
        this.f30626c.lineTo(26.3996f, 26.3996f);
        this.f30626c.lineTo(37.8996f, 26.3996f);
        this.f30626c.cubicTo(38.1758f, 26.3996f, 38.3996f, 26.1758f, 38.3996f, 25.8996f);
        this.f30626c.lineTo(38.3996f, 22.0996f);
        this.f30626c.cubicTo(38.3996f, 21.8235f, 38.1758f, 21.5996f, 37.8996f, 21.5996f);
        this.f30626c.lineTo(26.3996f, 21.5996f);
        this.f30626c.lineTo(26.3996f, 10.0996f);
        this.f30626c.cubicTo(26.3996f, 9.82347f, 26.1758f, 9.59961f, 25.8996f, 9.59961f);
        this.f30626c.lineTo(22.0996f, 9.59961f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
