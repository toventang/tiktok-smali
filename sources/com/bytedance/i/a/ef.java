package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ef extends a {
    static {
        Covode.recordClassIndex(18250);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(5.70711f, 8.29292f);
        this.f30626c.cubicTo(5.31658f, 8.68345f, 5.31658f, 9.31661f, 5.70711f, 9.70713f);
        this.f30626c.lineTo(11.1934f, 15.1934f);
        this.f30626c.cubicTo(10.0495f, 17.3076f, 9.4f, 19.7333f, 9.4f, 22.3074f);
        this.f30626c.lineTo(9.4f, 30.6815f);
        this.f30626c.cubicTo(9.4f, 32.2204f, 9.01537f, 33.6437f, 8.37761f, 34.6161f);
        this.f30626c.cubicTo(7.77825f, 35.53f, 7.00911f, 36.0f, 6.0f, 36.0f);
        this.f30626c.cubicTo(4.89543f, 36.0f, 4.0f, 36.8955f, 4.0f, 38.0f);
        this.f30626c.cubicTo(4.0f, 39.1046f, 4.89543f, 40.0f, 6.0f, 40.0f);
        this.f30626c.lineTo(36.0f, 40.0f);
        this.f30626c.lineTo(39.6482f, 43.6483f);
        this.f30626c.cubicTo(40.0388f, 44.0388f, 40.6719f, 44.0388f, 41.0624f, 43.6483f);
        this.f30626c.lineTo(42.4767f, 42.234f);
        this.f30626c.cubicTo(42.8672f, 41.8435f, 42.8672f, 41.2104f, 42.4767f, 40.8198f);
        this.f30626c.lineTo(8.53553f, 6.87871f);
        this.f30626c.cubicTo(8.14501f, 6.48818f, 7.51184f, 6.48818f, 7.12132f, 6.87871f);
        this.f30626c.lineTo(5.70711f, 8.29292f);
        this.f30626c.close();
        this.f30626c.moveTo(32.0f, 36.0f);
        this.f30626c.lineTo(14.1938f, 18.1938f);
        this.f30626c.cubicTo(13.6825f, 19.4599f, 13.4f, 20.8484f, 13.4f, 22.3074f);
        this.f30626c.lineTo(13.4f, 30.6815f);
        this.f30626c.cubicTo(13.4f, 32.4901f, 13.025f, 34.3828f, 12.1935f, 36.0f);
        this.f30626c.lineTo(32.0f, 36.0f);
        this.f30626c.close();
        this.f30626c.moveTo(34.6f, 22.3074f);
        this.f30626c.lineTo(34.6f, 27.2864f);
        this.f30626c.lineTo(38.6214f, 31.3078f);
        this.f30626c.cubicTo(38.6073f, 31.1018f, 38.6f, 30.8928f, 38.6f, 30.6815f);
        this.f30626c.lineTo(38.6f, 22.3074f);
        this.f30626c.cubicTo(38.6f, 14.1604f, 32.094f, 7.50003f, 24.0f, 7.50003f);
        this.f30626c.cubicTo(21.3606f, 7.50003f, 18.8901f, 8.20827f, 16.7589f, 9.44536f);
        this.f30626c.lineTo(19.7283f, 12.4147f);
        this.f30626c.cubicTo(21.0372f, 11.8262f, 22.4831f, 11.5f, 24.0f, 11.5f);
        this.f30626c.cubicTo(29.8236f, 11.5f, 34.6f, 16.3078f, 34.6f, 22.3074f);
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
