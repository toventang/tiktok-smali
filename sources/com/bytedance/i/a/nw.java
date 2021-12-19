package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class nw extends a {
    static {
        Covode.recordClassIndex(18510);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(22.4901f, 5.52778f);
        this.f30626c.cubicTo(22.6152f, 5.06964f, 22.6778f, 4.84058f, 22.7218f, 4.74209f);
        this.f30626c.cubicTo(23.2158f, 3.63732f, 24.7841f, 3.63732f, 25.278f, 4.74209f);
        this.f30626c.cubicTo(25.322f, 4.84058f, 25.3846f, 5.06964f, 25.5097f, 5.52778f);
        this.f30626c.lineTo(25.6343f, 5.98406f);
        this.f30626c.cubicTo(25.8859f, 6.90523f, 26.0117f, 7.36582f, 26.1474f, 7.79316f);
        this.f30626c.cubicTo(28.2767f, 14.5007f, 33.4864f, 19.7849f, 40.1631f, 22.0091f);
        this.f30626c.cubicTo(40.5885f, 22.1508f, 41.0472f, 22.2831f, 41.9647f, 22.5477f);
        this.f30626c.cubicTo(42.2585f, 22.6324f, 42.4054f, 22.6748f, 42.4721f, 22.7017f);
        this.f30626c.cubicTo(43.6402f, 23.1731f, 43.6402f, 24.8269f, 42.4721f, 25.2983f);
        this.f30626c.cubicTo(42.4054f, 25.3252f, 42.2585f, 25.3676f, 41.9647f, 25.4523f);
        this.f30626c.cubicTo(41.0472f, 25.717f, 40.5885f, 25.8493f, 40.1631f, 25.991f);
        this.f30626c.cubicTo(33.4864f, 28.2152f, 28.2767f, 33.4993f, 26.1474f, 40.2069f);
        this.f30626c.cubicTo(26.0117f, 40.6342f, 25.8859f, 41.0948f, 25.6343f, 42.016f);
        this.f30626c.lineTo(25.5097f, 42.4723f);
        this.f30626c.cubicTo(25.3846f, 42.9304f, 25.322f, 43.1595f, 25.278f, 43.258f);
        this.f30626c.cubicTo(24.7841f, 44.3627f, 23.2158f, 44.3627f, 22.7218f, 43.258f);
        this.f30626c.cubicTo(22.6778f, 43.1595f, 22.6152f, 42.9304f, 22.4901f, 42.4723f);
        this.f30626c.lineTo(22.3655f, 42.016f);
        this.f30626c.cubicTo(22.1139f, 41.0948f, 21.9881f, 40.6342f, 21.8524f, 40.2069f);
        this.f30626c.cubicTo(19.7231f, 33.4993f, 14.5134f, 28.2152f, 7.83672f, 25.991f);
        this.f30626c.cubicTo(7.41135f, 25.8493f, 6.95259f, 25.717f, 6.03508f, 25.4523f);
        this.f30626c.cubicTo(5.74133f, 25.3676f, 5.59446f, 25.3252f, 5.5277f, 25.2983f);
        this.f30626c.cubicTo(4.35958f, 24.8269f, 4.35958f, 23.1731f, 5.5277f, 22.7017f);
        this.f30626c.cubicTo(5.59446f, 22.6748f, 5.74133f, 22.6324f, 6.03508f, 22.5477f);
        this.f30626c.cubicTo(6.95259f, 22.2831f, 7.41135f, 22.1508f, 7.83672f, 22.0091f);
        this.f30626c.cubicTo(14.5134f, 19.7849f, 19.7231f, 14.5007f, 21.8524f, 7.79316f);
        this.f30626c.cubicTo(21.9881f, 7.36581f, 22.1139f, 6.90523f, 22.3655f, 5.98406f);
        this.f30626c.lineTo(22.4901f, 5.52778f);
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
