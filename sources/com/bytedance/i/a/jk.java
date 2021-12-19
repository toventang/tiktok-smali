package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class jk extends a {
    static {
        Covode.recordClassIndex(18390);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(9.0f, 11.5f);
        this.f30626c.cubicTo(8.17157f, 11.5f, 7.5f, 12.1716f, 7.5f, 13.0f);
        this.f30626c.lineTo(7.5f, 59.0f);
        this.f30626c.cubicTo(7.5f, 59.8284f, 8.17157f, 60.5f, 9.0f, 60.5f);
        this.f30626c.lineTo(64.0f, 60.5f);
        this.f30626c.cubicTo(64.8284f, 60.5f, 65.5f, 59.8284f, 65.5f, 59.0f);
        this.f30626c.lineTo(65.5f, 21.125f);
        this.f30626c.cubicTo(65.5f, 20.2966f, 64.8284f, 19.625f, 64.0f, 19.625f);
        this.f30626c.lineTo(36.5f, 19.625f);
        this.f30626c.lineTo(35.4799f, 19.625f);
        this.f30626c.lineTo(35.105f, 18.6762f);
        this.f30626c.lineTo(32.6442f, 12.4488f);
        this.f30626c.cubicTo(32.418f, 11.8762f, 31.8648f, 11.5f, 31.2492f, 11.5f);
        this.f30626c.lineTo(9.0f, 11.5f);
        this.f30626c.close();
        this.f30626c.moveTo(4.5f, 13.0f);
        this.f30626c.cubicTo(4.5f, 10.5147f, 6.51472f, 8.5f, 9.0f, 8.5f);
        this.f30626c.lineTo(31.2492f, 8.5f);
        this.f30626c.cubicTo(33.0961f, 8.5f, 34.7556f, 9.62857f, 35.4343f, 11.3463f);
        this.f30626c.lineTo(37.5201f, 16.625f);
        this.f30626c.lineTo(64.0f, 16.625f);
        this.f30626c.cubicTo(66.4853f, 16.625f, 68.5f, 18.6397f, 68.5f, 21.125f);
        this.f30626c.lineTo(68.5f, 59.0f);
        this.f30626c.cubicTo(68.5f, 61.4853f, 66.4853f, 63.5f, 64.0f, 63.5f);
        this.f30626c.lineTo(9.0f, 63.5f);
        this.f30626c.cubicTo(6.51472f, 63.5f, 4.5f, 61.4853f, 4.5f, 59.0f);
        this.f30626c.lineTo(4.5f, 13.0f);
        this.f30626c.close();
        this.f30626c.moveTo(36.901f, 27.0f);
        this.f30626c.cubicTo(37.508f, 27.0f, 38.0f, 27.492f, 38.0f, 28.099f);
        this.f30626c.lineTo(38.0f, 46.8217f);
        this.f30626c.lineTo(43.2745f, 42.478f);
        this.f30626c.cubicTo(43.7008f, 42.1269f, 44.331f, 42.1879f, 44.6821f, 42.6142f);
        this.f30626c.lineTo(45.3178f, 43.3861f);
        this.f30626c.cubicTo(45.6689f, 43.8125f, 45.6079f, 44.4427f, 45.1816f, 44.7938f);
        this.f30626c.lineTo(37.1357f, 51.4198f);
        this.f30626c.cubicTo(36.7664f, 51.7239f, 36.2335f, 51.7239f, 35.8642f, 51.4198f);
        this.f30626c.lineTo(27.8183f, 44.7938f);
        this.f30626c.cubicTo(27.392f, 44.4427f, 27.331f, 43.8125f, 27.6821f, 43.3861f);
        this.f30626c.lineTo(28.3178f, 42.6142f);
        this.f30626c.cubicTo(28.6689f, 42.1879f, 29.2991f, 42.1269f, 29.7254f, 42.478f);
        this.f30626c.lineTo(35.0f, 46.8217f);
        this.f30626c.lineTo(35.0f, 28.099f);
        this.f30626c.cubicTo(35.0f, 27.492f, 35.492f, 27.0f, 36.099f, 27.0f);
        this.f30626c.lineTo(36.901f, 27.0f);
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
