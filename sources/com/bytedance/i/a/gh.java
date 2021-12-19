package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gh extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31535d;

    /* renamed from: e  reason: collision with root package name */
    Path f31536e;

    static {
        Covode.recordClassIndex(18306);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 48.0f);
        this.f30626c.cubicTo(10.7472f, 48.0f, 0.0f, 37.2528f, 0.0f, 24.0f);
        this.f30626c.cubicTo(0.0f, 10.7472f, 10.7472f, 0.0f, 24.0f, 0.0f);
        this.f30626c.cubicTo(37.2528f, 0.0f, 48.0f, 10.7472f, 48.0f, 24.0f);
        this.f30626c.cubicTo(48.0f, 37.2528f, 37.2528f, 48.0f, 24.0f, 48.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-47872);
        this.f31535d = new Paint();
        Path path = new Path();
        this.f31536e = path;
        path.moveTo(29.1531f, 28.4744f);
        this.f31536e.cubicTo(27.8609f, 28.4744f, 26.8073f, 27.4104f, 26.8073f, 26.1054f);
        this.f31536e.cubicTo(26.8073f, 24.8004f, 27.8609f, 23.7364f, 29.1531f, 23.7364f);
        this.f31536e.cubicTo(30.4453f, 23.7364f, 31.4989f, 24.8004f, 31.4989f, 26.1054f);
        this.f31536e.cubicTo(31.4989f, 27.4104f, 30.4453f, 28.4744f, 29.1531f, 28.4744f);
        this.f31536e.close();
        this.f31536e.moveTo(29.5673f, 32.3621f);
        this.f31536e.cubicTo(27.9644f, 33.9763f, 24.8982f, 34.1036f, 23.9977f, 34.1036f);
        this.f31536e.cubicTo(23.0973f, 34.1036f, 20.0266f, 33.9763f, 18.4282f, 32.3621f);
        this.f31536e.cubicTo(18.1896f, 32.1211f, 18.1896f, 31.7346f, 18.4282f, 31.4936f);
        this.f31536e.cubicTo(18.6668f, 31.2526f, 19.0495f, 31.2526f, 19.2882f, 31.4936f);
        this.f31536e.cubicTo(20.2967f, 32.5121f, 22.4534f, 32.8759f, 23.9977f, 32.8759f);
        this.f31536e.cubicTo(25.5376f, 32.8759f, 27.6988f, 32.5121f, 28.7073f, 31.4936f);
        this.f31536e.cubicTo(28.946f, 31.2526f, 29.3287f, 31.2526f, 29.5673f, 31.4936f);
        this.f31536e.cubicTo(29.8014f, 31.7346f, 29.8014f, 32.1211f, 29.5673f, 32.3621f);
        this.f31536e.close();
        this.f31536e.moveTo(16.4876f, 26.1054f);
        this.f31536e.cubicTo(16.4876f, 24.8004f, 17.5412f, 23.7364f, 18.8334f, 23.7364f);
        this.f31536e.cubicTo(20.1256f, 23.7364f, 21.1792f, 24.8004f, 21.1792f, 26.1054f);
        this.f31536e.cubicTo(21.1792f, 27.4104f, 20.1256f, 28.4744f, 18.8334f, 28.4744f);
        this.f31536e.cubicTo(17.5412f, 28.4744f, 16.4876f, 27.4104f, 16.4876f, 26.1054f);
        this.f31536e.close();
        this.f31536e.moveTo(39.0f, 23.7364f);
        this.f31536e.cubicTo(39.0f, 21.904f, 37.5322f, 20.4217f, 35.7177f, 20.4217f);
        this.f31536e.cubicTo(34.8307f, 20.4217f, 34.0293f, 20.7764f, 33.4394f, 21.3538f);
        this.f31536e.cubicTo(31.1972f, 19.7169f, 28.104f, 18.662f, 24.6596f, 18.5392f);
        this.f31536e.lineTo(26.1544f, 11.4323f);
        this.f31536e.lineTo(31.0396f, 12.4827f);
        this.f31536e.cubicTo(31.0982f, 13.7376f, 32.1157f, 14.738f, 33.3719f, 14.738f);
        this.f31536e.cubicTo(34.6686f, 14.738f, 35.7177f, 13.6785f, 35.7177f, 12.369f);
        this.f31536e.cubicTo(35.7177f, 11.0594f, 34.6686f, 10.0f, 33.3719f, 10.0f);
        this.f31536e.cubicTo(32.4489f, 10.0f, 31.661f, 10.5411f, 31.2783f, 11.3232f);
        this.f31536e.lineTo(25.8213f, 10.1501f);
        this.f31536e.cubicTo(25.6682f, 10.1182f, 25.5106f, 10.1455f, 25.38f, 10.2319f);
        this.f31536e.cubicTo(25.2494f, 10.3183f, 25.1594f, 10.4502f, 25.1279f, 10.6047f);
        this.f31536e.lineTo(23.489f, 18.4028f);
        this.f31536e.cubicTo(23.48f, 18.4483f, 23.489f, 18.4892f, 23.489f, 18.5347f);
        this.f31536e.cubicTo(19.9815f, 18.6256f, 16.8298f, 19.6851f, 14.5516f, 21.3447f);
        this.f31536e.cubicTo(13.9617f, 20.7718f, 13.1648f, 20.4217f, 12.2823f, 20.4217f);
        this.f31536e.cubicTo(10.4678f, 20.4217f, 9.0f, 21.9086f, 9.0f, 23.7364f);
        this.f31536e.cubicTo(9.0f, 25.0823f, 9.79694f, 26.2418f, 10.9406f, 26.7602f);
        this.f31536e.cubicTo(10.891f, 27.0876f, 10.864f, 27.424f, 10.864f, 27.7651f);
        this.f31536e.cubicTo(10.864f, 32.8668f, 16.7443f, 37.0f, 23.9977f, 37.0f);
        this.f31536e.cubicTo(31.2512f, 37.0f, 37.1315f, 32.8668f, 37.1315f, 27.7651f);
        this.f31536e.cubicTo(37.1315f, 27.4286f, 37.1045f, 27.0967f, 37.0549f, 26.7693f);
        this.f31536e.cubicTo(38.1941f, 26.2509f, 39.0f, 25.0914f, 39.0f, 23.7364f);
        this.f31536e.close();
        this.f31536e.setFillType(Path.FillType.WINDING);
        this.f31535d.setStyle(Paint.Style.FILL);
        this.f31535d.setColor(-1);
        this.f30624a.add(this.f31535d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31536e, this.f31535d);
    }
}
