package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bx extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31325d;

    /* renamed from: e  reason: collision with root package name */
    Path f31326e;

    static {
        Covode.recordClassIndex(18187);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 42.5682f);
        this.f30626c.cubicTo(34.2549f, 42.5682f, 42.5682f, 34.2549f, 42.5682f, 24.0f);
        this.f30626c.cubicTo(42.5682f, 13.7451f, 34.2549f, 5.43182f, 24.0f, 5.43182f);
        this.f30626c.cubicTo(13.7451f, 5.43182f, 5.43182f, 13.7451f, 5.43182f, 24.0f);
        this.f30626c.cubicTo(5.43182f, 34.2549f, 13.7451f, 42.5682f, 24.0f, 42.5682f);
        this.f30626c.close();
        this.f30626c.moveTo(45.5f, 24.0f);
        this.f30626c.cubicTo(45.5f, 35.8741f, 35.8741f, 45.5f, 24.0f, 45.5f);
        this.f30626c.cubicTo(12.1259f, 45.5f, 2.5f, 35.8741f, 2.5f, 24.0f);
        this.f30626c.cubicTo(2.5f, 12.1259f, 12.1259f, 2.5f, 24.0f, 2.5f);
        this.f30626c.cubicTo(35.8741f, 2.5f, 45.5f, 12.1259f, 45.5f, 24.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31325d = new Paint();
        Path path = new Path();
        this.f31326e = path;
        path.moveTo(25.5f, 13.25f);
        this.f31326e.cubicTo(25.5f, 12.8358f, 25.1642f, 12.5f, 24.75f, 12.5f);
        this.f31326e.lineTo(23.25f, 12.5f);
        this.f31326e.cubicTo(22.8358f, 12.5f, 22.5f, 12.8358f, 22.5f, 13.25f);
        this.f31326e.lineTo(22.5f, 22.5f);
        this.f31326e.lineTo(13.25f, 22.5f);
        this.f31326e.cubicTo(12.8358f, 22.5f, 12.5f, 22.8358f, 12.5f, 23.25f);
        this.f31326e.lineTo(12.5f, 24.75f);
        this.f31326e.cubicTo(12.5f, 25.1642f, 12.8358f, 25.5f, 13.25f, 25.5f);
        this.f31326e.lineTo(22.5f, 25.5f);
        this.f31326e.lineTo(22.5f, 34.75f);
        this.f31326e.cubicTo(22.5f, 35.1642f, 22.8358f, 35.5f, 23.25f, 35.5f);
        this.f31326e.lineTo(24.75f, 35.5f);
        this.f31326e.cubicTo(25.1642f, 35.5f, 25.5f, 35.1642f, 25.5f, 34.75f);
        this.f31326e.lineTo(25.5f, 25.5f);
        this.f31326e.lineTo(34.75f, 25.5f);
        this.f31326e.cubicTo(35.1642f, 25.5f, 35.5f, 25.1642f, 35.5f, 24.75f);
        this.f31326e.lineTo(35.5f, 23.25f);
        this.f31326e.cubicTo(35.5f, 22.8358f, 35.1642f, 22.5f, 34.75f, 22.5f);
        this.f31326e.lineTo(25.5f, 22.5f);
        this.f31326e.lineTo(25.5f, 13.25f);
        this.f31326e.close();
        this.f31326e.setFillType(Path.FillType.EVEN_ODD);
        this.f31325d.setStyle(Paint.Style.FILL);
        this.f31325d.setColor(-16777216);
        this.f30624a.add(this.f31325d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31326e, this.f31325d);
    }
}
