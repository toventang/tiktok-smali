package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class g extends a {
    static {
        Covode.recordClassIndex(18298);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.22193f, 11.0884f);
        this.f30626c.cubicTo(11.9433f, 7.36815f, 17.5911f, 6.92801f, 21.9054f, 10.2092f);
        this.f30626c.cubicTo(22.1754f, 10.4146f, 22.3229f, 10.743f, 22.2971f, 11.0813f);
        this.f30626c.lineTo(21.8943f, 16.3584f);
        this.f30626c.lineTo(25.8614f, 18.719f);
        this.f30626c.cubicTo(26.2915f, 18.9749f, 26.4661f, 19.5094f, 26.2702f, 19.9699f);
        this.f30626c.lineTo(24.1742f, 24.8953f);
        this.f30626c.lineTo(26.0132f, 28.4966f);
        this.f30626c.cubicTo(26.1388f, 28.7425f, 26.0412f, 29.0437f, 25.7953f, 29.1693f);
        this.f30626c.lineTo(24.9047f, 29.624f);
        this.f30626c.cubicTo(24.6588f, 29.7496f, 24.3576f, 29.6521f, 24.232f, 29.4061f);
        this.f30626c.lineTo(22.1805f, 25.3886f);
        this.f30626c.cubicTo(22.0457f, 25.1248f, 22.0349f, 24.8148f, 22.1509f, 24.5422f);
        this.f30626c.lineTo(24.0877f, 19.9909f);
        this.f30626c.lineTo(20.3386f, 17.76f);
        this.f30626c.cubicTo(20.0122f, 17.5658f, 19.824f, 17.2033f, 19.8529f, 16.8246f);
        this.f30626c.lineTo(20.2601f, 11.4894f);
        this.f30626c.cubicTo(16.812f, 9.1606f, 12.5286f, 9.61103f, 9.63593f, 12.5028f);
        this.f30626c.cubicTo(6.12136f, 16.0163f, 6.12136f, 21.7127f, 9.63593f, 25.2263f);
        this.f30626c.lineTo(24.0f, 39.586f);
        this.f30626c.lineTo(38.3641f, 25.2263f);
        this.f30626c.cubicTo(41.8786f, 21.7127f, 41.8786f, 16.0163f, 38.3641f, 12.5028f);
        this.f30626c.cubicTo(35.8173f, 9.95676f, 31.1812f, 8.69605f, 26.9948f, 12.0068f);
        this.f30626c.cubicTo(26.7782f, 12.1781f, 26.4629f, 12.1565f, 26.2822f, 11.9476f);
        this.f30626c.lineTo(25.628f, 11.1914f);
        this.f30626c.cubicTo(25.4473f, 10.9825f, 25.4708f, 10.6649f, 25.6861f, 10.492f);
        this.f30626c.cubicTo(30.8111f, 6.37855f, 36.6278f, 7.93902f, 39.7781f, 11.0884f);
        this.f30626c.cubicTo(44.074f, 15.383f, 44.074f, 22.3461f, 39.7781f, 26.6407f);
        this.f30626c.lineTo(24.707f, 41.7072f);
        this.f30626c.cubicTo(24.3165f, 42.0976f, 23.6835f, 42.0976f, 23.293f, 41.7072f);
        this.f30626c.lineTo(8.22193f, 26.6407f);
        this.f30626c.cubicTo(3.92602f, 22.3461f, 3.92602f, 15.383f, 8.22193f, 11.0884f);
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
