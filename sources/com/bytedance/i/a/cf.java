package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cf extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31327d;

    /* renamed from: e  reason: collision with root package name */
    Path f31328e;

    static {
        Covode.recordClassIndex(18196);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(36.8965f, 40.6646f);
        this.f30626c.cubicTo(37.287f, 41.0552f, 37.9202f, 41.0552f, 38.3107f, 40.6646f);
        this.f30626c.lineTo(39.0178f, 39.9575f);
        this.f30626c.cubicTo(39.4083f, 39.567f, 39.4083f, 38.9338f, 39.0178f, 38.5433f);
        this.f30626c.lineTo(8.432f, 7.95753f);
        this.f30626c.cubicTo(8.04148f, 7.56701f, 7.40831f, 7.56701f, 7.01779f, 7.95754f);
        this.f30626c.lineTo(6.31068f, 8.66464f);
        this.f30626c.cubicTo(5.92016f, 9.05517f, 5.92016f, 9.68833f, 6.31068f, 10.0789f);
        this.f30626c.lineTo(6.87423f, 10.6424f);
        this.f30626c.cubicTo(4.93374f, 11.1422f, 3.5f, 12.9039f, 3.5f, 15.0004f);
        this.f30626c.lineTo(3.5f, 33.0004f);
        this.f30626c.cubicTo(3.5f, 35.4857f, 5.51472f, 37.5004f, 8.0f, 37.5004f);
        this.f30626c.lineTo(30.0f, 37.5004f);
        this.f30626c.cubicTo(31.047f, 37.5004f, 32.0105f, 37.1429f, 32.775f, 36.5432f);
        this.f30626c.lineTo(36.8965f, 40.6646f);
        this.f30626c.close();
        this.f30626c.moveTo(30.6052f, 34.3733f);
        this.f30626c.lineTo(9.73226f, 13.5004f);
        this.f30626c.lineTo(8.0f, 13.5004f);
        this.f30626c.cubicTo(7.17157f, 13.5004f, 6.5f, 14.172f, 6.5f, 15.0004f);
        this.f30626c.lineTo(6.5f, 33.0004f);
        this.f30626c.cubicTo(6.5f, 33.8289f, 7.17157f, 34.5004f, 8.0f, 34.5004f);
        this.f30626c.lineTo(30.0f, 34.5004f);
        this.f30626c.cubicTo(30.2153f, 34.5004f, 30.4201f, 34.4551f, 30.6052f, 34.3733f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31327d = new Paint();
        Path path = new Path();
        this.f31328e = path;
        path.moveTo(34.5f, 26.9462f);
        this.f31328e.lineTo(34.5f, 31.0255f);
        this.f31328e.lineTo(31.5f, 28.0255f);
        this.f31328e.lineTo(31.5f, 15.0004f);
        this.f31328e.cubicTo(31.5f, 14.172f, 30.8284f, 13.5004f, 30.0f, 13.5004f);
        this.f31328e.lineTo(16.9749f, 13.5004f);
        this.f31328e.lineTo(13.9749f, 10.5004f);
        this.f31328e.lineTo(30.0f, 10.5004f);
        this.f31328e.cubicTo(32.4853f, 10.5004f, 34.5f, 12.5151f, 34.5f, 15.0004f);
        this.f31328e.lineTo(34.5f, 21.0548f);
        this.f31328e.lineTo(43.1177f, 14.7873f);
        this.f31328e.cubicTo(43.574f, 14.4555f, 44.1779f, 14.4077f, 44.6807f, 14.6638f);
        this.f31328e.cubicTo(45.1834f, 14.9198f, 45.5f, 15.4362f, 45.5f, 16.0004f);
        this.f31328e.lineTo(45.5f, 32.0004f);
        this.f31328e.cubicTo(45.5f, 32.5646f, 45.1834f, 33.0811f, 44.6807f, 33.3371f);
        this.f31328e.cubicTo(44.1779f, 33.5931f, 43.574f, 33.5454f, 43.1177f, 33.2135f);
        this.f31328e.lineTo(34.5f, 26.9462f);
        this.f31328e.close();
        this.f31328e.moveTo(42.5f, 29.0548f);
        this.f31328e.lineTo(35.5503f, 24.0005f);
        this.f31328e.lineTo(42.5f, 18.9461f);
        this.f31328e.lineTo(42.5f, 29.0548f);
        this.f31328e.close();
        this.f31328e.setFillType(Path.FillType.EVEN_ODD);
        this.f31327d.setStyle(Paint.Style.FILL);
        this.f31327d.setColor(-16777216);
        this.f30624a.add(this.f31327d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31328e, this.f31327d);
    }
}
