package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class bd extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31295d;

    /* renamed from: e  reason: collision with root package name */
    Path f31296e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31297f;

    /* renamed from: g  reason: collision with root package name */
    Path f31298g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31299h;

    /* renamed from: i  reason: collision with root package name */
    Path f31300i;

    static {
        Covode.recordClassIndex(18167);
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
        this.f31295d = new Paint();
        Path path = new Path();
        this.f31296e = path;
        path.moveTo(17.0f, 23.0f);
        this.f31296e.cubicTo(18.6569f, 23.0f, 20.0f, 21.2091f, 20.0f, 19.0f);
        this.f31296e.cubicTo(20.0f, 16.7909f, 18.6569f, 15.0f, 17.0f, 15.0f);
        this.f31296e.cubicTo(15.3431f, 15.0f, 14.0f, 16.7909f, 14.0f, 19.0f);
        this.f31296e.cubicTo(14.0f, 21.2091f, 15.3431f, 23.0f, 17.0f, 23.0f);
        this.f31296e.close();
        this.f31296e.setFillType(Path.FillType.EVEN_ODD);
        this.f31295d.setStyle(Paint.Style.FILL);
        this.f31295d.setColor(-16777216);
        this.f30624a.add(this.f31295d);
        this.f31297f = new Paint();
        Path path2 = new Path();
        this.f31298g = path2;
        path2.moveTo(31.0f, 23.0f);
        this.f31298g.cubicTo(32.6569f, 23.0f, 34.0f, 21.2091f, 34.0f, 19.0f);
        this.f31298g.cubicTo(34.0f, 16.7909f, 32.6569f, 15.0f, 31.0f, 15.0f);
        this.f31298g.cubicTo(29.3431f, 15.0f, 28.0f, 16.7909f, 28.0f, 19.0f);
        this.f31298g.cubicTo(28.0f, 21.2091f, 29.3431f, 23.0f, 31.0f, 23.0f);
        this.f31298g.close();
        this.f31298g.setFillType(Path.FillType.EVEN_ODD);
        this.f31297f.setStyle(Paint.Style.FILL);
        this.f31297f.setColor(-16777216);
        this.f30624a.add(this.f31297f);
        this.f31299h = new Paint();
        Path path3 = new Path();
        this.f31300i = path3;
        path3.moveTo(16.0f, 28.3431f);
        this.f31300i.cubicTo(16.0f, 31.4673f, 19.5817f, 36.0f, 24.0f, 36.0f);
        this.f31300i.cubicTo(28.4183f, 36.0f, 32.0f, 31.4673f, 32.0f, 28.3431f);
        this.f31300i.cubicTo(32.0f, 25.219f, 16.0f, 25.219f, 16.0f, 28.3431f);
        this.f31300i.close();
        this.f31300i.setFillType(Path.FillType.EVEN_ODD);
        this.f31299h.setStyle(Paint.Style.FILL);
        this.f31299h.setColor(-16777216);
        this.f30624a.add(this.f31299h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31296e, this.f31295d);
        canvas.drawPath(this.f31298g, this.f31297f);
        canvas.drawPath(this.f31300i, this.f31299h);
    }
}
