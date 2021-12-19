package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class k extends a {
    static {
        Covode.recordClassIndex(18406);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(17.0f, 11.0f);
        this.f30626c.cubicTo(10.3726f, 11.0f, 5.0f, 16.3726f, 5.0f, 23.0f);
        this.f30626c.cubicTo(5.0f, 29.6274f, 10.3726f, 35.0f, 17.0f, 35.0f);
        this.f30626c.cubicTo(18.8426f, 35.0f, 20.5865f, 34.5853f, 22.1451f, 33.8444f);
        this.f30626c.cubicTo(19.0061f, 31.2782f, 17.0f, 27.3736f, 17.0f, 23.0f);
        this.f30626c.cubicTo(17.0f, 18.6264f, 19.0061f, 14.7218f, 22.1451f, 12.1556f);
        this.f30626c.cubicTo(20.5865f, 11.4147f, 18.8426f, 11.0f, 17.0f, 11.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 10.8731f);
        this.f30626c.cubicTo(21.9402f, 9.68177f, 19.5484f, 9.0f, 17.0f, 9.0f);
        this.f30626c.cubicTo(9.26801f, 9.0f, 3.0f, 15.268f, 3.0f, 23.0f);
        this.f30626c.cubicTo(3.0f, 30.732f, 9.26801f, 37.0f, 17.0f, 37.0f);
        this.f30626c.cubicTo(19.5484f, 37.0f, 21.9402f, 36.3182f, 24.0f, 35.1269f);
        this.f30626c.cubicTo(26.0598f, 36.3182f, 28.4516f, 37.0f, 31.0f, 37.0f);
        this.f30626c.cubicTo(38.732f, 37.0f, 45.0f, 30.732f, 45.0f, 23.0f);
        this.f30626c.cubicTo(45.0f, 15.268f, 38.732f, 9.0f, 31.0f, 9.0f);
        this.f30626c.cubicTo(28.4516f, 9.0f, 26.0598f, 9.68177f, 24.0f, 10.8731f);
        this.f30626c.close();
        this.f30626c.moveTo(31.0f, 11.0f);
        this.f30626c.cubicTo(28.6195f, 11.0f, 26.4036f, 11.6921f, 24.5392f, 12.8858f);
        this.f30626c.cubicTo(21.2059f, 15.0199f, 19.0f, 18.7527f, 19.0f, 23.0f);
        this.f30626c.cubicTo(19.0f, 27.2473f, 21.2059f, 30.9801f, 24.5392f, 33.1142f);
        this.f30626c.cubicTo(26.4036f, 34.3079f, 28.6195f, 35.0f, 31.0f, 35.0f);
        this.f30626c.cubicTo(37.6274f, 35.0f, 43.0f, 29.6274f, 43.0f, 23.0f);
        this.f30626c.cubicTo(43.0f, 16.3726f, 37.6274f, 11.0f, 31.0f, 11.0f);
        this.f30626c.close();
        this.f30626c.moveTo(28.0f, 18.0f);
        this.f30626c.cubicTo(28.0f, 17.4477f, 28.4477f, 17.0f, 29.0f, 17.0f);
        this.f30626c.cubicTo(29.5523f, 17.0f, 30.0f, 17.4477f, 30.0f, 18.0f);
        this.f30626c.lineTo(30.0f, 21.0f);
        this.f30626c.cubicTo(30.0f, 21.5523f, 29.5523f, 22.0f, 29.0f, 22.0f);
        this.f30626c.cubicTo(28.4477f, 22.0f, 28.0f, 21.5523f, 28.0f, 21.0f);
        this.f30626c.lineTo(28.0f, 18.0f);
        this.f30626c.close();
        this.f30626c.moveTo(37.0f, 17.0f);
        this.f30626c.cubicTo(36.4477f, 17.0f, 36.0f, 17.4477f, 36.0f, 18.0f);
        this.f30626c.lineTo(36.0f, 21.0f);
        this.f30626c.cubicTo(36.0f, 21.5523f, 36.4477f, 22.0f, 37.0f, 22.0f);
        this.f30626c.cubicTo(37.5523f, 22.0f, 38.0f, 21.5523f, 38.0f, 21.0f);
        this.f30626c.lineTo(38.0f, 18.0f);
        this.f30626c.cubicTo(38.0f, 17.4477f, 37.5523f, 17.0f, 37.0f, 17.0f);
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
