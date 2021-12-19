package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gz extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31585d;

    /* renamed from: e  reason: collision with root package name */
    Path f31586e;

    static {
        Covode.recordClassIndex(18324);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(25.0f, 10.0f);
        this.f30626c.cubicTo(25.5523f, 10.0f, 26.0f, 10.4477f, 26.0f, 11.0f);
        this.f30626c.lineTo(26.0f, 13.4684f);
        this.f30626c.cubicTo(28.0382f, 13.7793f, 29.8033f, 14.5588f, 31.2455f, 15.7238f);
        this.f30626c.cubicTo(31.6401f, 16.0426f, 31.6814f, 16.6166f, 31.3749f, 17.0207f);
        this.f30626c.lineTo(30.4935f, 18.1825f);
        this.f30626c.cubicTo(30.127f, 18.6656f, 29.4198f, 18.7093f, 28.9337f, 18.3469f);
        this.f30626c.cubicTo(28.0402f, 17.6808f, 27.0342f, 17.22f, 26.0f, 16.9458f);
        this.f30626c.lineTo(26.0f, 22.4979f);
        this.f30626c.cubicTo(29.1738f, 23.3616f, 32.4245f, 24.6944f, 32.4245f, 28.76f);
        this.f30626c.cubicTo(32.4245f, 31.9038f, 30.4355f, 34.6914f, 26.0f, 35.2641f);
        this.f30626c.lineTo(26.0f, 37.0f);
        this.f30626c.cubicTo(26.0f, 37.5523f, 25.5523f, 38.0f, 25.0f, 38.0f);
        this.f30626c.lineTo(23.0f, 38.0f);
        this.f30626c.cubicTo(22.4477f, 38.0f, 22.0f, 37.5523f, 22.0f, 37.0f);
        this.f30626c.lineTo(22.0f, 35.2185f);
        this.f30626c.cubicTo(19.5162f, 34.8608f, 17.5499f, 33.8777f, 16.0693f, 32.571f);
        this.f30626c.cubicTo(15.706f, 32.2503f, 15.6717f, 31.7063f, 15.9562f, 31.3141f);
        this.f30626c.lineTo(16.8517f, 30.0794f);
        this.f30626c.cubicTo(17.225f, 29.5646f, 17.9781f, 29.5267f, 18.4659f, 29.9345f);
        this.f30626c.cubicTo(19.4086f, 30.7227f, 20.6062f, 31.4013f, 22.0f, 31.7688f);
        this.f30626c.lineTo(22.0f, 25.5087f);
        this.f30626c.cubicTo(19.0118f, 24.6742f, 16.1685f, 23.3493f, 16.1685f, 19.576f);
        this.f30626c.cubicTo(16.1685f, 16.5617f, 18.4064f, 14.1205f, 22.0f, 13.4874f);
        this.f30626c.lineTo(22.0f, 11.0f);
        this.f30626c.cubicTo(22.0f, 10.4477f, 22.4477f, 10.0f, 23.0f, 10.0f);
        this.f30626c.lineTo(25.0f, 10.0f);
        this.f30626c.close();
        this.f30626c.moveTo(26.0f, 26.5943f);
        this.f30626c.lineTo(26.0f, 31.8932f);
        this.f30626c.cubicTo(27.8301f, 31.4561f, 28.5845f, 30.2571f, 28.5845f, 29.112f);
        this.f30626c.cubicTo(28.5845f, 27.8174f, 27.4982f, 27.1177f, 26.0f, 26.5943f);
        this.f30626c.close();
        this.f30626c.moveTo(22.0f, 21.3748f);
        this.f30626c.lineTo(22.0f, 16.8642f);
        this.f30626c.cubicTo(20.7533f, 17.2682f, 20.0085f, 18.1398f, 20.0085f, 19.288f);
        this.f30626c.cubicTo(20.0085f, 20.2959f, 20.8015f, 20.9072f, 22.0f, 21.3748f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31585d = new Paint();
        Path path = new Path();
        this.f31586e = path;
        path.moveTo(24.0f, 2.0f);
        this.f31586e.cubicTo(11.8497f, 2.0f, 2.0f, 11.8497f, 2.0f, 24.0f);
        this.f31586e.cubicTo(2.0f, 36.1503f, 11.8497f, 46.0f, 24.0f, 46.0f);
        this.f31586e.cubicTo(36.1503f, 46.0f, 46.0f, 36.1503f, 46.0f, 24.0f);
        this.f31586e.cubicTo(46.0f, 11.8497f, 36.1503f, 2.0f, 24.0f, 2.0f);
        this.f31586e.close();
        this.f31586e.moveTo(6.0f, 24.0f);
        this.f31586e.cubicTo(6.0f, 14.0589f, 14.0589f, 6.0f, 24.0f, 6.0f);
        this.f31586e.cubicTo(33.9411f, 6.0f, 42.0f, 14.0589f, 42.0f, 24.0f);
        this.f31586e.cubicTo(42.0f, 33.9411f, 33.9411f, 42.0f, 24.0f, 42.0f);
        this.f31586e.cubicTo(14.0589f, 42.0f, 6.0f, 33.9411f, 6.0f, 24.0f);
        this.f31586e.close();
        this.f31586e.setFillType(Path.FillType.EVEN_ODD);
        this.f31585d.setStyle(Paint.Style.FILL);
        this.f31585d.setColor(-16777216);
        this.f30624a.add(this.f31585d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31586e, this.f31585d);
    }
}
