package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class at extends a {
    static {
        Covode.recordClassIndex(18156);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(26.447f, 5.60564f);
        this.f30626c.cubicTo(27.0187f, 5.37893f, 27.6708f, 5.52412f, 28.0923f, 5.97195f);
        this.f30626c.lineTo(44.0923f, 22.9719f);
        this.f30626c.cubicTo(44.6359f, 23.5495f, 44.6359f, 24.4505f, 44.0923f, 25.028f);
        this.f30626c.lineTo(28.0923f, 42.028f);
        this.f30626c.cubicTo(27.6708f, 42.4759f, 27.0187f, 42.6211f, 26.447f, 42.3943f);
        this.f30626c.cubicTo(25.8754f, 42.1676f, 25.5f, 41.615f, 25.5f, 41.0f);
        this.f30626c.lineTo(25.5f, 32.0343f);
        this.f30626c.cubicTo(19.5247f, 32.3084f, 14.7939f, 34.1826f, 11.4895f, 36.055f);
        this.f30626c.cubicTo(9.70078f, 37.0686f, 8.3342f, 38.0797f, 7.42166f, 38.8303f);
        this.f30626c.cubicTo(6.96571f, 39.2054f, 6.62417f, 39.5145f, 6.40103f, 39.7253f);
        this.f30626c.cubicTo(6.28949f, 39.8306f, 6.20765f, 39.9113f, 6.156f, 39.9631f);
        this.f30626c.cubicTo(6.13018f, 39.989f, 6.11192f, 40.0077f, 6.10128f, 40.0187f);
        this.f30626c.lineTo(6.0923f, 40.028f);
        this.f30626c.lineTo(6.09151f, 40.0289f);
        this.f30626c.cubicTo(5.67001f, 40.476f, 5.01834f, 40.6209f, 4.44703f, 40.3943f);
        this.f30626c.cubicTo(3.87537f, 40.1676f, 3.5f, 39.615f, 3.5f, 39.0f);
        this.f30626c.cubicTo(3.5f, 37.4203f, 4.17348f, 35.1808f, 5.24446f, 32.831f);
        this.f30626c.cubicTo(6.34006f, 30.4272f, 7.93443f, 27.7283f, 9.95077f, 25.1916f);
        this.f30626c.cubicTo(13.6603f, 20.5248f, 19.0058f, 16.1613f, 25.5f, 15.5683f);
        this.f30626c.lineTo(25.5f, 7.00061f);
        this.f30626c.cubicTo(25.5f, 6.38564f, 25.8754f, 5.83235f, 26.447f, 5.60564f);
        this.f30626c.close();
        this.f30626c.moveTo(28.5f, 10.7824f);
        this.f30626c.lineTo(28.5f, 17.0f);
        this.f30626c.cubicTo(28.5f, 17.8284f, 27.8284f, 18.5f, 27.0f, 18.5f);
        this.f30626c.cubicTo(21.1725f, 18.5f, 16.0579f, 22.3298f, 12.2992f, 27.0584f);
        this.f30626c.cubicTo(10.4406f, 29.3967f, 8.97244f, 31.8852f, 7.97429f, 34.0752f);
        this.f30626c.cubicTo(7.83637f, 34.3778f, 7.70884f, 34.6716f, 7.59141f, 34.9557f);
        this.f30626c.cubicTo(8.29968f, 34.4694f, 9.10704f, 33.9569f, 10.0105f, 33.445f);
        this.f30626c.cubicTo(13.9343f, 31.2215f, 19.6872f, 29.0f, 27.0f, 29.0f);
        this.f30626c.cubicTo(27.8284f, 29.0f, 28.5f, 29.6716f, 28.5f, 30.5f);
        this.f30626c.lineTo(28.5f, 37.2176f);
        this.f30626c.lineTo(40.9401f, 24.0f);
        this.f30626c.lineTo(28.5f, 10.7824f);
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
