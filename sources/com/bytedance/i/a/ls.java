package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ls extends a {
    static {
        Covode.recordClassIndex(18452);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(36.9442f, 5.34354f);
        this.f30626c.cubicTo(36.148f, 4.60044f, 34.9062f, 4.62184f, 34.1362f, 5.39194f);
        this.f30626c.lineTo(19.5401f, 19.9884f);
        this.f30626c.cubicTo(19.1611f, 20.3675f, 18.9482f, 20.8815f, 18.9482f, 21.4175f);
        this.f30626c.lineTo(18.9482f, 27.0316f);
        this.f30626c.cubicTo(18.9482f, 28.1478f, 19.853f, 29.0526f, 20.9692f, 29.0526f);
        this.f30626c.lineTo(26.2088f, 29.0526f);
        this.f30626c.cubicTo(26.7448f, 29.0526f, 27.2588f, 28.8397f, 27.6378f, 28.4607f);
        this.f30626c.lineTo(42.6081f, 13.4899f);
        this.f30626c.cubicTo(42.9957f, 13.1023f, 43.2092f, 12.574f, 43.1997f, 12.026f);
        this.f30626c.cubicTo(43.1903f, 11.478f, 42.9587f, 10.9573f, 42.558f, 10.5833f);
        this.f30626c.lineTo(36.9442f, 5.34354f);
        this.f30626c.close();
        this.f30626c.moveTo(22.9902f, 22.2547f);
        this.f30626c.lineTo(35.6136f, 9.63081f);
        this.f30626c.lineTo(38.2708f, 12.1109f);
        this.f30626c.lineTo(25.3717f, 25.0105f);
        this.f30626c.lineTo(22.9902f, 25.0105f);
        this.f30626c.lineTo(22.9902f, 22.2547f);
        this.f30626c.close();
        this.f30626c.moveTo(22.9889f, 4.79999f);
        this.f30626c.cubicTo(23.547f, 4.79999f, 23.9994f, 5.25242f, 23.9994f, 5.81051f);
        this.f30626c.lineTo(23.9994f, 7.83157f);
        this.f30626c.cubicTo(23.9994f, 8.38966f, 23.547f, 8.84209f, 22.9889f, 8.84209f);
        this.f30626c.lineTo(10.863f, 8.84209f);
        this.f30626c.cubicTo(9.74685f, 8.84209f, 8.84202f, 9.74695f, 8.84202f, 10.8631f);
        this.f30626c.lineTo(8.84202f, 37.1368f);
        this.f30626c.cubicTo(8.84202f, 38.253f, 9.74685f, 39.1579f, 10.863f, 39.1579f);
        this.f30626c.lineTo(37.1359f, 39.1579f);
        this.f30626c.cubicTo(38.252f, 39.1579f, 39.1568f, 38.253f, 39.1568f, 37.1368f);
        this.f30626c.lineTo(39.1568f, 25.0105f);
        this.f30626c.cubicTo(39.1568f, 24.4524f, 39.6093f, 24.0f, 40.1673f, 24.0f);
        this.f30626c.lineTo(42.1883f, 24.0f);
        this.f30626c.cubicTo(42.7464f, 24.0f, 43.1988f, 24.4524f, 43.1988f, 25.0105f);
        this.f30626c.lineTo(43.1988f, 37.1368f);
        this.f30626c.cubicTo(43.1988f, 40.4854f, 40.4843f, 43.2f, 37.1359f, 43.2f);
        this.f30626c.lineTo(10.863f, 43.2f);
        this.f30626c.cubicTo(7.51453f, 43.2f, 4.80005f, 40.4854f, 4.80005f, 37.1368f);
        this.f30626c.lineTo(4.80005f, 10.8631f);
        this.f30626c.cubicTo(4.80005f, 7.51456f, 7.51453f, 4.79999f, 10.863f, 4.79999f);
        this.f30626c.lineTo(22.9889f, 4.79999f);
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
