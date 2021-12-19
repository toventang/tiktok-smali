package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pi extends a {
    static {
        Covode.recordClassIndex(18550);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(18.3149f, 23.1174f);
        this.f30626c.cubicTo(22.2013f, 23.1174f, 25.3517f, 19.9571f, 25.3517f, 16.0587f);
        this.f30626c.cubicTo(25.3517f, 12.1603f, 22.2013f, 9.0f, 18.3149f, 9.0f);
        this.f30626c.cubicTo(14.4286f, 9.0f, 11.2781f, 12.1603f, 11.2781f, 16.0587f);
        this.f30626c.cubicTo(11.2781f, 19.9571f, 14.4286f, 23.1174f, 18.3149f, 23.1174f);
        this.f30626c.close();
        this.f30626c.moveTo(30.6289f, 37.2347f);
        this.f30626c.cubicTo(30.6289f, 30.4125f, 25.1155f, 24.882f, 18.3145f, 24.882f);
        this.f30626c.cubicTo(11.5134f, 24.882f, 6.0f, 30.4125f, 6.0f, 37.2347f);
        this.f30626c.cubicTo(6.0f, 38.2093f, 6.78762f, 39.0f, 7.75921f, 39.0f);
        this.f30626c.cubicTo(7.77558f, 39.0f, 7.7919f, 38.9998f, 7.80817f, 38.9993f);
        this.f30626c.lineTo(28.8205f, 38.9993f);
        this.f30626c.cubicTo(28.8367f, 38.9998f, 28.853f, 39.0f, 28.8694f, 39.0f);
        this.f30626c.cubicTo(29.841f, 39.0f, 30.6289f, 38.2093f, 30.6289f, 37.2347f);
        this.f30626c.close();
        this.f30626c.moveTo(32.9979f, 37.2347f);
        this.f30626c.cubicTo(32.9979f, 34.2847f, 32.1257f, 31.5298f, 30.6216f, 29.2211f);
        this.f30626c.cubicTo(30.9879f, 28.7879f, 31.685f, 28.5483f, 32.8836f, 28.5483f);
        this.f30626c.cubicTo(37.9184f, 28.5483f, 42.0f, 32.6426f, 42.0f, 37.6931f);
        this.f30626c.cubicTo(42.0f, 38.4146f, 41.4167f, 39.0f, 40.6974f, 39.0f);
        this.f30626c.cubicTo(40.68f, 39.0f, 40.6627f, 38.9997f, 40.6454f, 38.999f);
        this.f30626c.lineTo(32.9979f, 38.999f);
        this.f30626c.lineTo(32.9979f, 37.2347f);
        this.f30626c.close();
        this.f30626c.moveTo(38.0933f, 22.0166f);
        this.f30626c.cubicTo(38.0933f, 24.9026f, 35.761f, 27.2422f, 32.8839f, 27.2422f);
        this.f30626c.cubicTo(30.0068f, 27.2422f, 27.6745f, 24.9026f, 27.6745f, 22.0166f);
        this.f30626c.cubicTo(27.6745f, 19.1306f, 30.0068f, 16.791f, 32.8839f, 16.791f);
        this.f30626c.cubicTo(35.761f, 16.791f, 38.0933f, 19.1306f, 38.0933f, 22.0166f);
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
