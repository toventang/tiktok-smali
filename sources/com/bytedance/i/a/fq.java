package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fq extends a {

    /* renamed from: d  reason: collision with root package name */
    LinearGradient f31450d;

    /* renamed from: e  reason: collision with root package name */
    Paint f31451e;

    /* renamed from: f  reason: collision with root package name */
    Path f31452f;

    static {
        Covode.recordClassIndex(18288);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31450d = new LinearGradient(31.9055f, -6.66458f, 17.4407f, 0.282088f, new int[]{-14625300, -14638100}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f30626c.moveTo(26.4537f, 4.45742f);
        this.f30626c.cubicTo(23.0312f, 5.36069f, 20.9966f, 8.82569f, 21.9162f, 12.1955f);
        this.f30626c.lineTo(27.182f, 31.547f);
        this.f30626c.cubicTo(27.964f, 34.4176f, 26.4172f, 37.504f, 23.5404f, 38.4115f);
        this.f30626c.cubicTo(20.1953f, 39.4713f, 16.6525f, 37.2818f, 16.2507f, 33.7449f);
        this.f30626c.cubicTo(15.9951f, 31.5153f, 17.1939f, 29.2963f, 19.2199f, 28.2745f);
        this.f30626c.cubicTo(19.5722f, 28.0968f, 19.931f, 27.9593f, 20.2898f, 27.8578f);
        this.f30626c.cubicTo(21.9527f, 27.3924f, 22.9431f, 25.7255f, 22.4963f, 24.084f);
        this.f30626c.lineTo(22.2427f, 23.1511f);
        this.f30626c.cubicTo(21.8066f, 21.5582f, 20.1566f, 20.5407f, 18.5345f, 20.9638f);
        this.f30626c.cubicTo(18.5259f, 20.9659f, 18.5152f, 20.9701f, 18.5045f, 20.9722f);
        this.f30626c.cubicTo(11.4726f, 22.8274f, 7.37985f, 30.0938f, 9.60992f, 37.0026f);
        this.f30626c.cubicTo(11.5908f, 43.133f, 18.1672f, 46.873f, 24.5502f, 45.4959f);
        this.f30626c.cubicTo(31.7431f, 43.9432f, 36.0894f, 36.8207f, 34.2052f, 29.897f);
        this.f30626c.lineTo(29.5131f, 12.6609f);
        this.f30626c.lineTo(33.2019f, 2.67627f);
        this.f30626c.lineTo(26.4537f, 4.45742f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-14625300);
        this.f31451e = new Paint();
        Path path = new Path();
        this.f31452f = path;
        path.moveTo(33.2012f, 2.67643f);
        this.f31452f.cubicTo(29.7831f, 3.57759f, 27.9698f, 6.98336f, 28.8829f, 10.3489f);
        this.f31452f.lineTo(29.5124f, 12.661f);
        this.f31452f.cubicTo(34.2303f, 11.4172f, 37.0276f, 6.64278f, 35.7622f, 1.99951f);
        this.f31452f.lineTo(33.2012f, 2.67643f);
        this.f31452f.close();
        this.f31452f.setFillType(Path.FillType.EVEN_ODD);
        this.f31451e.setStyle(Paint.Style.FILL);
        this.f31451e.setShader(this.f31450d);
        this.f30624a.add(this.f31451e);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31452f, this.f31451e);
    }
}
