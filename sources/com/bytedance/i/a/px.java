package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class px extends a {
    static {
        Covode.recordClassIndex(18565);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(20.4645f, 24.0f);
        this.f30626c.lineTo(12.9394f, 16.4749f);
        this.f30626c.cubicTo(12.5489f, 16.0844f, 12.5489f, 15.4512f, 12.9394f, 15.0607f);
        this.f30626c.lineTo(15.0607f, 12.9393f);
        this.f30626c.cubicTo(15.4512f, 12.5488f, 16.0844f, 12.5488f, 16.4749f, 12.9393f);
        this.f30626c.lineTo(24.0f, 20.4645f);
        this.f30626c.lineTo(31.5252f, 12.9393f);
        this.f30626c.cubicTo(31.9157f, 12.5488f, 32.5489f, 12.5488f, 32.9394f, 12.9393f);
        this.f30626c.lineTo(35.0607f, 15.0607f);
        this.f30626c.cubicTo(35.4512f, 15.4512f, 35.4512f, 16.0844f, 35.0607f, 16.4749f);
        this.f30626c.lineTo(27.5356f, 24.0f);
        this.f30626c.lineTo(35.0607f, 31.5251f);
        this.f30626c.cubicTo(35.4512f, 31.9157f, 35.4512f, 32.5488f, 35.0607f, 32.9393f);
        this.f30626c.lineTo(32.9394f, 35.0607f);
        this.f30626c.cubicTo(32.5489f, 35.4512f, 31.9157f, 35.4512f, 31.5252f, 35.0607f);
        this.f30626c.lineTo(24.0f, 27.5355f);
        this.f30626c.lineTo(16.4749f, 35.0607f);
        this.f30626c.cubicTo(16.0844f, 35.4512f, 15.4512f, 35.4512f, 15.0607f, 35.0607f);
        this.f30626c.lineTo(12.9394f, 32.9393f);
        this.f30626c.cubicTo(12.5489f, 32.5488f, 12.5489f, 31.9157f, 12.9394f, 31.5251f);
        this.f30626c.lineTo(20.4645f, 24.0f);
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
