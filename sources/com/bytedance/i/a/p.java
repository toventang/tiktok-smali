package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class p extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31764d;

    /* renamed from: e  reason: collision with root package name */
    Path f31765e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31766f;

    /* renamed from: g  reason: collision with root package name */
    Path f31767g;

    static {
        Covode.recordClassIndex(18541);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(13.5751f, 32.325f);
        this.f30626c.cubicTo(16.2265f, 32.325f, 18.4518f, 31.2363f, 19.9979f, 29.5655f);
        this.f30626c.cubicTo(20.0808f, 29.4759f, 20.1251f, 29.3575f, 20.1251f, 29.2354f);
        this.f30626c.lineTo(20.1251f, 23.925f);
        this.f30626c.cubicTo(20.1251f, 23.6488f, 19.9012f, 23.425f, 19.6251f, 23.425f);
        this.f30626c.lineTo(12.8251f, 23.425f);
        this.f30626c.cubicTo(12.5489f, 23.425f, 12.3251f, 23.6488f, 12.3251f, 23.925f);
        this.f30626c.lineTo(12.3251f, 24.775f);
        this.f30626c.cubicTo(12.3251f, 25.0511f, 12.5489f, 25.275f, 12.8251f, 25.275f);
        this.f30626c.lineTo(18.0751f, 25.275f);
        this.f30626c.lineTo(18.0751f, 28.65f);
        this.f30626c.cubicTo(17.2251f, 29.5f, 15.5751f, 30.45f, 13.5751f, 30.45f);
        this.f30626c.cubicTo(9.92509f, 30.45f, 7.15009f, 27.625f, 7.15009f, 23.675f);
        this.f30626c.cubicTo(7.15009f, 19.675f, 9.92509f, 16.9f, 13.5751f, 16.9f);
        this.f30626c.cubicTo(15.399f, 16.9f, 17.0357f, 17.69f, 18.1061f, 18.853f);
        this.f30626c.cubicTo(18.2808f, 19.0427f, 18.5663f, 19.0942f, 18.7839f, 18.9557f);
        this.f30626c.lineTo(19.5784f, 18.4501f);
        this.f30626c.cubicTo(19.83f, 18.2901f, 19.8873f, 17.9459f, 19.6874f, 17.7247f);
        this.f30626c.cubicTo(18.2634f, 16.1488f, 16.3102f, 15.05f, 13.5751f, 15.05f);
        this.f30626c.cubicTo(8.82509f, 15.05f, 5.00009f, 18.475f, 5.00009f, 23.675f);
        this.f30626c.cubicTo(5.00009f, 28.85f, 8.82509f, 32.325f, 13.5751f, 32.325f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31764d = new Paint();
        Path path = new Path();
        this.f31765e = path;
        path.moveTo(26.0724f, 32.0f);
        this.f31765e.cubicTo(26.3485f, 32.0f, 26.5724f, 31.7761f, 26.5724f, 31.5f);
        this.f31765e.lineTo(26.5724f, 15.825f);
        this.f31765e.cubicTo(26.5724f, 15.5488f, 26.3485f, 15.325f, 26.0724f, 15.325f);
        this.f31765e.lineTo(24.9974f, 15.325f);
        this.f31765e.cubicTo(24.7212f, 15.325f, 24.4974f, 15.5488f, 24.4974f, 15.825f);
        this.f31765e.lineTo(24.4974f, 31.5f);
        this.f31765e.cubicTo(24.4974f, 31.7761f, 24.7212f, 32.0f, 24.9974f, 32.0f);
        this.f31765e.lineTo(26.0724f, 32.0f);
        this.f31765e.close();
        this.f31765e.setFillType(Path.FillType.WINDING);
        this.f31764d.setStyle(Paint.Style.FILL);
        this.f31764d.setColor(-16777216);
        this.f30624a.add(this.f31764d);
        this.f31766f = new Paint();
        Path path2 = new Path();
        this.f31767g = path2;
        path2.moveTo(33.0538f, 32.0f);
        this.f31767g.cubicTo(33.3299f, 32.0f, 33.5538f, 31.7761f, 33.5538f, 31.5f);
        this.f31767g.lineTo(33.5538f, 24.4f);
        this.f31767g.lineTo(41.7288f, 24.4f);
        this.f31767g.cubicTo(42.0049f, 24.4f, 42.2288f, 24.1761f, 42.2288f, 23.9f);
        this.f31767g.lineTo(42.2288f, 23.05f);
        this.f31767g.cubicTo(42.2288f, 22.7738f, 42.0049f, 22.55f, 41.7288f, 22.55f);
        this.f31767g.lineTo(33.5538f, 22.55f);
        this.f31767g.lineTo(33.5538f, 17.175f);
        this.f31767g.lineTo(41.9038f, 17.175f);
        this.f31767g.cubicTo(42.1799f, 17.175f, 42.4038f, 16.9511f, 42.4038f, 16.675f);
        this.f31767g.lineTo(42.4038f, 15.825f);
        this.f31767g.cubicTo(42.4038f, 15.5488f, 42.1799f, 15.325f, 41.9038f, 15.325f);
        this.f31767g.lineTo(31.9788f, 15.325f);
        this.f31767g.cubicTo(31.7027f, 15.325f, 31.4788f, 15.5488f, 31.4788f, 15.825f);
        this.f31767g.lineTo(31.4788f, 31.5f);
        this.f31767g.cubicTo(31.4788f, 31.7761f, 31.7027f, 32.0f, 31.9788f, 32.0f);
        this.f31767g.lineTo(33.0538f, 32.0f);
        this.f31767g.close();
        this.f31767g.setFillType(Path.FillType.WINDING);
        this.f31766f.setStyle(Paint.Style.FILL);
        this.f31766f.setColor(-16777216);
        this.f30624a.add(this.f31766f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31765e, this.f31764d);
        canvas.drawPath(this.f31767g, this.f31766f);
    }
}
