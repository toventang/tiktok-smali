package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class lj extends a {
    static {
        Covode.recordClassIndex(18443);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(35.0001f, 10.7587f);
        this.f30626c.cubicTo(35.0001f, 10.1169f, 34.4041f, 9.64129f, 33.7784f, 9.78359f);
        this.f30626c.lineTo(17.7902f, 13.4192f);
        this.f30626c.cubicTo(17.335f, 13.5227f, 17.0119f, 13.9275f, 17.0119f, 14.3943f);
        this.f30626c.lineTo(17.0119f, 37.9972f);
        this.f30626c.lineTo(17.0109f, 37.9972f);
        this.f30626c.cubicTo(17.0374f, 40.1644f, 14.8022f, 42.4189f, 11.612f, 43.2737f);
        this.f30626c.cubicTo(8.05093f, 44.2279f, 4.64847f, 43.0769f, 4.01236f, 40.7028f);
        this.f30626c.cubicTo(3.37624f, 38.3288f, 5.74735f, 35.6308f, 9.30838f, 34.6766f);
        this.f30626c.cubicTo(10.606f, 34.3289f, 11.8826f, 34.2608f, 13.0119f, 34.4294f);
        this.f30626c.lineTo(13.0119f, 14.3943f);
        this.f30626c.cubicTo(13.0119f, 12.0601f, 14.6271f, 10.0364f, 16.9033f, 9.5188f);
        this.f30626c.lineTo(32.8914f, 5.88317f);
        this.f30626c.cubicTo(36.0204f, 5.17165f, 39.0001f, 7.54986f, 39.0001f, 10.7587f);
        this.f30626c.lineTo(39.0001f, 33.1191f);
        this.f30626c.cubicTo(39.084f, 35.3108f, 36.8331f, 37.6109f, 33.6032f, 38.4763f);
        this.f30626c.cubicTo(30.0421f, 39.4305f, 26.6397f, 38.2795f, 26.0036f, 35.9055f);
        this.f30626c.cubicTo(25.3675f, 33.5315f, 27.7386f, 30.8334f, 31.2996f, 29.8792f);
        this.f30626c.cubicTo(32.5961f, 29.5319f, 33.8715f, 29.4635f, 35.0001f, 29.6316f);
        this.f30626c.lineTo(35.0001f, 10.7587f);
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
