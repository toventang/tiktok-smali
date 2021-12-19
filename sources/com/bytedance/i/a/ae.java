package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ae extends a {
    static {
        Covode.recordClassIndex(18141);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(19.9524f, 9.0f);
        this.f30626c.cubicTo(16.928f, 9.0f, 14.4762f, 11.4518f, 14.4762f, 14.4762f);
        this.f30626c.cubicTo(14.4762f, 17.5006f, 16.928f, 19.9524f, 19.9524f, 19.9524f);
        this.f30626c.cubicTo(22.9768f, 19.9524f, 25.4286f, 17.5006f, 25.4286f, 14.4762f);
        this.f30626c.cubicTo(25.4286f, 11.4518f, 22.9768f, 9.0f, 19.9524f, 9.0f);
        this.f30626c.close();
        this.f30626c.moveTo(12.4762f, 14.4762f);
        this.f30626c.cubicTo(12.4762f, 10.3472f, 15.8234f, 7.0f, 19.9524f, 7.0f);
        this.f30626c.cubicTo(24.0814f, 7.0f, 27.4286f, 10.3472f, 27.4286f, 14.4762f);
        this.f30626c.cubicTo(27.4286f, 18.6052f, 24.0814f, 21.9524f, 19.9524f, 21.9524f);
        this.f30626c.cubicTo(15.8234f, 21.9524f, 12.4762f, 18.6052f, 12.4762f, 14.4762f);
        this.f30626c.close();
        this.f30626c.moveTo(33.5858f, 29.5f);
        this.f30626c.lineTo(28.1464f, 24.0607f);
        this.f30626c.cubicTo(27.9512f, 23.8654f, 27.9512f, 23.5488f, 28.1464f, 23.3536f);
        this.f30626c.lineTo(28.8536f, 22.6464f);
        this.f30626c.cubicTo(29.0488f, 22.4512f, 29.3654f, 22.4512f, 29.5607f, 22.6464f);
        this.f30626c.lineTo(35.0f, 28.0858f);
        this.f30626c.lineTo(40.4393f, 22.6464f);
        this.f30626c.cubicTo(40.6346f, 22.4512f, 40.9512f, 22.4512f, 41.1464f, 22.6464f);
        this.f30626c.lineTo(41.8536f, 23.3536f);
        this.f30626c.cubicTo(42.0488f, 23.5488f, 42.0488f, 23.8654f, 41.8536f, 24.0607f);
        this.f30626c.lineTo(36.4142f, 29.5f);
        this.f30626c.lineTo(41.8536f, 34.9393f);
        this.f30626c.cubicTo(42.0488f, 35.1346f, 42.0488f, 35.4512f, 41.8536f, 35.6464f);
        this.f30626c.lineTo(41.1464f, 36.3536f);
        this.f30626c.cubicTo(40.9512f, 36.5488f, 40.6346f, 36.5488f, 40.4393f, 36.3536f);
        this.f30626c.lineTo(35.0f, 30.9142f);
        this.f30626c.lineTo(29.5607f, 36.3536f);
        this.f30626c.cubicTo(29.3654f, 36.5488f, 29.0488f, 36.5488f, 28.8536f, 36.3536f);
        this.f30626c.lineTo(28.1464f, 35.6464f);
        this.f30626c.cubicTo(27.9512f, 35.4512f, 27.9512f, 35.1346f, 28.1464f, 34.9393f);
        this.f30626c.lineTo(33.5858f, 29.5f);
        this.f30626c.close();
        this.f30626c.moveTo(15.6113f, 27.259f);
        this.f30626c.cubicTo(12.2479f, 28.5746f, 9.31466f, 31.4884f, 8.09228f, 36.2808f);
        this.f30626c.cubicTo(8.02403f, 36.5484f, 7.75721f, 36.718f, 7.4878f, 36.6574f);
        this.f30626c.lineTo(6.5122f, 36.4379f);
        this.f30626c.cubicTo(6.24279f, 36.3772f, 6.07295f, 36.1092f, 6.14042f, 35.8414f);
        this.f30626c.cubicTo(7.50854f, 30.4121f, 10.8873f, 26.9593f, 14.8828f, 25.3964f);
        this.f30626c.cubicTo(18.8058f, 23.862f, 23.2747f, 24.1695f, 26.9048f, 26.1306f);
        this.f30626c.cubicTo(27.1478f, 26.2618f, 27.2269f, 26.5691f, 27.0868f, 26.8071f);
        this.f30626c.lineTo(26.5798f, 27.6691f);
        this.f30626c.cubicTo(26.4398f, 27.9071f, 26.1338f, 27.9855f, 25.89f, 27.8558f);
        this.f30626c.cubicTo(22.7857f, 26.2035f, 18.9605f, 25.949f, 15.6113f, 27.259f);
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
