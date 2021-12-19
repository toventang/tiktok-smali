package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gb extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31511d;

    /* renamed from: e  reason: collision with root package name */
    Path f31512e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31513f;

    /* renamed from: g  reason: collision with root package name */
    Path f31514g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31515h;

    /* renamed from: i  reason: collision with root package name */
    Path f31516i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31517j;

    /* renamed from: k  reason: collision with root package name */
    Path f31518k;

    static {
        Covode.recordClassIndex(18300);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.addCircle(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-119723);
        this.f31511d = new Paint();
        Path path = new Path();
        this.f31512e = path;
        path.moveTo(17.0f, 11.0f);
        this.f31512e.cubicTo(15.8954f, 11.0f, 15.0f, 11.8954f, 15.0f, 13.0f);
        this.f31512e.lineTo(15.0f, 20.628f);
        this.f31512e.cubicTo(15.0f, 20.8488f, 15.1448f, 21.0435f, 15.3563f, 21.1069f);
        this.f31512e.lineTo(16.3563f, 21.4069f);
        this.f31512e.cubicTo(16.6771f, 21.5031f, 17.0f, 21.2629f, 17.0f, 20.928f);
        this.f31512e.lineTo(17.0f, 13.0f);
        this.f31512e.lineTo(31.0f, 13.0f);
        this.f31512e.lineTo(31.0f, 20.928f);
        this.f31512e.cubicTo(31.0f, 21.2629f, 31.3229f, 21.5031f, 31.6437f, 21.4069f);
        this.f31512e.lineTo(32.6437f, 21.1069f);
        this.f31512e.cubicTo(32.8552f, 21.0435f, 33.0f, 20.8488f, 33.0f, 20.628f);
        this.f31512e.lineTo(33.0f, 13.0f);
        this.f31512e.cubicTo(33.0f, 11.8954f, 32.1046f, 11.0f, 31.0f, 11.0f);
        this.f31512e.lineTo(17.0f, 11.0f);
        this.f31512e.close();
        this.f31512e.setFillType(Path.FillType.WINDING);
        this.f31511d.setStyle(Paint.Style.FILL);
        this.f31511d.setColor(-1);
        this.f30624a.add(this.f31511d);
        this.f31513f = new Paint();
        Path path2 = new Path();
        this.f31514g = path2;
        path2.moveTo(19.5f, 15.0f);
        this.f31514g.cubicTo(19.2239f, 15.0f, 19.0f, 15.2239f, 19.0f, 15.5f);
        this.f31514g.lineTo(19.0f, 16.5f);
        this.f31514g.cubicTo(19.0f, 16.7761f, 19.2239f, 17.0f, 19.5f, 17.0f);
        this.f31514g.lineTo(26.5f, 17.0f);
        this.f31514g.cubicTo(26.7761f, 17.0f, 27.0f, 16.7761f, 27.0f, 16.5f);
        this.f31514g.lineTo(27.0f, 15.5f);
        this.f31514g.cubicTo(27.0f, 15.2239f, 26.7761f, 15.0f, 26.5f, 15.0f);
        this.f31514g.lineTo(19.5f, 15.0f);
        this.f31514g.close();
        this.f31514g.setFillType(Path.FillType.WINDING);
        this.f31513f.setStyle(Paint.Style.FILL);
        this.f31513f.setColor(-1);
        this.f30624a.add(this.f31513f);
        this.f31515h = new Paint();
        Path path3 = new Path();
        this.f31516i = path3;
        path3.moveTo(19.0f, 19.5f);
        this.f31516i.cubicTo(19.0f, 19.2239f, 19.2239f, 19.0f, 19.5f, 19.0f);
        this.f31516i.lineTo(23.5f, 19.0f);
        this.f31516i.cubicTo(23.7761f, 19.0f, 24.0f, 19.2239f, 24.0f, 19.5f);
        this.f31516i.lineTo(24.0f, 20.5f);
        this.f31516i.cubicTo(24.0f, 20.7761f, 23.7761f, 21.0f, 23.5f, 21.0f);
        this.f31516i.lineTo(19.5f, 21.0f);
        this.f31516i.cubicTo(19.2239f, 21.0f, 19.0f, 20.7761f, 19.0f, 20.5f);
        this.f31516i.lineTo(19.0f, 19.5f);
        this.f31516i.close();
        this.f31516i.setFillType(Path.FillType.WINDING);
        this.f31515h.setStyle(Paint.Style.FILL);
        this.f31515h.setColor(-1);
        this.f30624a.add(this.f31515h);
        this.f31517j = new Paint();
        Path path4 = new Path();
        this.f31518k = path4;
        path4.moveTo(12.3356f, 21.4758f);
        this.f31518k.lineTo(24.0f, 25.6316f);
        this.f31518k.lineTo(35.6644f, 21.4758f);
        this.f31518k.cubicTo(36.3155f, 21.2439f, 37.0f, 21.7266f, 37.0f, 22.4178f);
        this.f31518k.lineTo(37.0f, 34.0f);
        this.f31518k.cubicTo(37.0f, 35.6569f, 35.6569f, 37.0f, 34.0f, 37.0f);
        this.f31518k.lineTo(14.0f, 37.0f);
        this.f31518k.cubicTo(12.3431f, 37.0f, 11.0f, 35.6569f, 11.0f, 34.0f);
        this.f31518k.lineTo(11.0f, 22.4178f);
        this.f31518k.cubicTo(11.0f, 21.7266f, 11.6845f, 21.2439f, 12.3356f, 21.4758f);
        this.f31518k.close();
        this.f31518k.moveTo(13.0f, 23.8357f);
        this.f31518k.lineTo(24.0f, 27.7547f);
        this.f31518k.lineTo(35.0f, 23.8357f);
        this.f31518k.lineTo(35.0f, 34.0f);
        this.f31518k.cubicTo(35.0f, 34.5523f, 34.5523f, 35.0f, 34.0f, 35.0f);
        this.f31518k.lineTo(14.0f, 35.0f);
        this.f31518k.cubicTo(13.4477f, 35.0f, 13.0f, 34.5523f, 13.0f, 34.0f);
        this.f31518k.lineTo(13.0f, 23.8357f);
        this.f31518k.close();
        this.f31518k.setFillType(Path.FillType.EVEN_ODD);
        this.f31517j.setStyle(Paint.Style.FILL);
        this.f31517j.setColor(-1);
        this.f30624a.add(this.f31517j);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31512e, this.f31511d);
        canvas.drawPath(this.f31514g, this.f31513f);
        canvas.drawPath(this.f31516i, this.f31515h);
        canvas.drawPath(this.f31518k, this.f31517j);
    }
}
