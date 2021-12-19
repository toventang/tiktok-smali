package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class t extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31778d;

    /* renamed from: e  reason: collision with root package name */
    Path f31779e;

    static {
        Covode.recordClassIndex(18571);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(12.6865f, 23.2929f);
        this.f30626c.cubicTo(12.4912f, 23.0976f, 12.1746f, 23.0976f, 11.9794f, 23.2929f);
        this.f30626c.lineTo(9.85806f, 25.4142f);
        this.f30626c.cubicTo(5.95282f, 29.3195f, 5.24571f, 34.944f, 9.15095f, 38.8493f);
        this.f30626c.cubicTo(13.0562f, 42.7545f, 18.6807f, 42.0474f, 22.586f, 38.1421f);
        this.f30626c.lineTo(27.5357f, 33.1924f);
        this.f30626c.cubicTo(31.3218f, 29.4064f, 32.1019f, 24.0044f, 28.5876f, 20.1197f);
        this.f30626c.cubicTo(28.4023f, 19.9149f, 28.0845f, 19.9157f, 27.8893f, 20.1109f);
        this.f30626c.lineTo(27.1822f, 20.818f);
        this.f30626c.cubicTo(26.9869f, 21.0133f, 26.989f, 21.3294f, 27.1715f, 21.5366f);
        this.f30626c.cubicTo(29.895f, 24.6285f, 29.1258f, 28.7739f, 26.1215f, 31.7782f);
        this.f30626c.lineTo(21.1718f, 36.7279f);
        this.f30626c.cubicTo(18.0476f, 39.8521f, 13.6894f, 40.5592f, 10.5652f, 37.435f);
        this.f30626c.cubicTo(7.44097f, 34.3108f, 8.14808f, 29.9526f, 11.2723f, 26.8284f);
        this.f30626c.lineTo(13.3936f, 24.7071f);
        this.f30626c.cubicTo(13.5889f, 24.5119f, 13.5889f, 24.1953f, 13.3936f, 24.0f);
        this.f30626c.lineTo(12.6865f, 23.2929f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31778d = new Paint();
        Path path = new Path();
        this.f31779e = path;
        path.moveTo(35.3139f, 24.7071f);
        this.f31779e.cubicTo(35.5092f, 24.9024f, 35.8257f, 24.9024f, 36.021f, 24.7071f);
        this.f31779e.lineTo(38.1423f, 22.5858f);
        this.f31779e.cubicTo(42.0476f, 18.6806f, 42.7547f, 13.056f, 38.8494f, 9.15077f);
        this.f31779e.cubicTo(34.9442f, 5.24553f, 29.3197f, 5.95263f, 25.4144f, 9.85788f);
        this.f31779e.lineTo(20.4647f, 14.8076f);
        this.f31779e.cubicTo(16.6786f, 18.5937f, 15.8985f, 23.9956f, 19.4128f, 27.8803f);
        this.f31779e.cubicTo(19.5981f, 28.0851f, 19.9159f, 28.0844f, 20.1111f, 27.8891f);
        this.f31779e.lineTo(20.8182f, 27.182f);
        this.f31779e.cubicTo(21.0135f, 26.9867f, 21.0114f, 26.6706f, 20.8289f, 26.4634f);
        this.f31779e.cubicTo(18.1054f, 23.3715f, 18.8746f, 19.2261f, 21.8789f, 16.2218f);
        this.f31779e.lineTo(26.8286f, 11.2721f);
        this.f31779e.cubicTo(29.9528f, 8.1479f, 34.311f, 7.44079f, 37.4352f, 10.565f);
        this.f31779e.cubicTo(40.5594f, 13.6892f, 39.8523f, 18.0474f, 36.7281f, 21.1716f);
        this.f31779e.lineTo(34.6068f, 23.2929f);
        this.f31779e.cubicTo(34.4115f, 23.4882f, 34.4115f, 23.8047f, 34.6068f, 24.0f);
        this.f31779e.lineTo(35.3139f, 24.7071f);
        this.f31779e.close();
        this.f31779e.setFillType(Path.FillType.WINDING);
        this.f31778d.setStyle(Paint.Style.FILL);
        this.f31778d.setColor(-16777216);
        this.f30624a.add(this.f31778d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31779e, this.f31778d);
    }
}
