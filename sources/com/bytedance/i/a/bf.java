package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bf extends a {
    static {
        Covode.recordClassIndex(18169);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.677f, 13.446f);
        this.f30626c.cubicTo(10.8042f, 13.446f, 5.97168f, 18.3549f, 5.97168f, 24.5f);
        this.f30626c.cubicTo(5.97168f, 30.6451f, 10.8042f, 35.5541f, 16.677f, 35.5541f);
        this.f30626c.cubicTo(18.4296f, 35.5541f, 20.0837f, 35.12f, 21.5453f, 34.3479f);
        this.f30626c.cubicTo(19.1134f, 31.8089f, 17.6181f, 28.3293f, 17.6181f, 24.5f);
        this.f30626c.cubicTo(17.6181f, 20.6725f, 19.1121f, 17.1943f, 21.542f, 14.6556f);
        this.f30626c.cubicTo(20.1112f, 13.9035f, 18.4511f, 13.446f, 16.677f, 13.446f);
        this.f30626c.close();
        this.f30626c.moveTo(23.998f, 12.6199f);
        this.f30626c.cubicTo(21.9476f, 11.2944f, 19.4256f, 10.446f, 16.677f, 10.446f);
        this.f30626c.cubicTo(9.06821f, 10.446f, 2.97168f, 16.7783f, 2.97168f, 24.5f);
        this.f30626c.cubicTo(2.97168f, 32.2217f, 9.06821f, 38.5541f, 16.677f, 38.5541f);
        this.f30626c.cubicTo(19.371f, 38.5541f, 21.8837f, 37.7558f, 24.0002f, 36.3816f);
        this.f30626c.cubicTo(26.1167f, 37.7558f, 28.6294f, 38.5541f, 31.3234f, 38.5541f);
        this.f30626c.cubicTo(38.9322f, 38.5541f, 45.0287f, 32.2217f, 45.0287f, 24.5f);
        this.f30626c.cubicTo(45.0287f, 16.7783f, 38.9322f, 10.446f, 31.3234f, 10.446f);
        this.f30626c.cubicTo(28.6285f, 10.446f, 26.115f, 11.2448f, 23.998f, 12.6199f);
        this.f30626c.close();
        this.f30626c.moveTo(31.3234f, 13.446f);
        this.f30626c.cubicTo(28.9221f, 13.446f, 26.7057f, 14.2608f, 24.9162f, 15.6437f);
        this.f30626c.cubicTo(22.312f, 17.6562f, 20.6181f, 20.8678f, 20.6181f, 24.5f);
        this.f30626c.cubicTo(20.6181f, 28.1327f, 22.3124f, 31.3447f, 24.9173f, 33.3572f);
        this.f30626c.cubicTo(26.7066f, 34.7396f, 28.9226f, 35.5541f, 31.3234f, 35.5541f);
        this.f30626c.cubicTo(37.1962f, 35.5541f, 42.0287f, 30.6451f, 42.0287f, 24.5f);
        this.f30626c.cubicTo(42.0287f, 18.3549f, 37.1962f, 13.446f, 31.3234f, 13.446f);
        this.f30626c.close();
        this.f30626c.moveTo(27.0f, 19.5f);
        this.f30626c.cubicTo(27.0f, 18.6716f, 27.6716f, 18.0f, 28.5f, 18.0f);
        this.f30626c.cubicTo(29.3284f, 18.0f, 30.0f, 18.6716f, 30.0f, 19.5f);
        this.f30626c.lineTo(30.0f, 24.5f);
        this.f30626c.cubicTo(30.0f, 25.3284f, 29.3284f, 26.0f, 28.5f, 26.0f);
        this.f30626c.cubicTo(27.6716f, 26.0f, 27.0f, 25.3284f, 27.0f, 24.5f);
        this.f30626c.lineTo(27.0f, 19.5f);
        this.f30626c.close();
        this.f30626c.moveTo(35.5f, 18.0f);
        this.f30626c.cubicTo(34.6716f, 18.0f, 34.0f, 18.6716f, 34.0f, 19.5f);
        this.f30626c.lineTo(34.0f, 24.5f);
        this.f30626c.cubicTo(34.0f, 25.3284f, 34.6716f, 26.0f, 35.5f, 26.0f);
        this.f30626c.cubicTo(36.3284f, 26.0f, 37.0f, 25.3284f, 37.0f, 24.5f);
        this.f30626c.lineTo(37.0f, 19.5f);
        this.f30626c.cubicTo(37.0f, 18.6716f, 36.3284f, 18.0f, 35.5f, 18.0f);
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
