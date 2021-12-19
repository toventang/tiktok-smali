package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class db extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31404d;

    /* renamed from: e  reason: collision with root package name */
    Path f31405e;

    static {
        Covode.recordClassIndex(18219);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(25.9049f, 18.9189f);
        this.f30626c.cubicTo(25.9049f, 18.4114f, 25.4785f, 18.0f, 24.9525f, 18.0f);
        this.f30626c.lineTo(23.0475f, 18.0f);
        this.f30626c.cubicTo(22.5215f, 18.0f, 22.0951f, 18.4114f, 22.0951f, 18.9189f);
        this.f30626c.lineTo(22.0951f, 26.8402f);
        this.f30626c.lineTo(18.8239f, 24.105f);
        this.f30626c.cubicTo(18.4264f, 23.7726f, 17.8248f, 23.8141f, 17.4803f, 24.1976f);
        this.f30626c.lineTo(16.2327f, 25.5864f);
        this.f30626c.cubicTo(15.8882f, 25.9699f, 15.9312f, 26.5503f, 16.3287f, 26.8827f);
        this.f30626c.lineTo(23.3762f, 32.7755f);
        this.f30626c.cubicTo(23.7342f, 33.0748f, 24.2658f, 33.0748f, 24.6238f, 32.7755f);
        this.f30626c.lineTo(31.6713f, 26.8827f);
        this.f30626c.cubicTo(32.0688f, 26.5503f, 32.1118f, 25.9699f, 31.7673f, 25.5864f);
        this.f30626c.lineTo(30.5197f, 24.1976f);
        this.f30626c.cubicTo(30.1752f, 23.8141f, 29.5736f, 23.7726f, 29.1761f, 24.105f);
        this.f30626c.lineTo(25.9049f, 26.8402f);
        this.f30626c.lineTo(25.9049f, 18.9189f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31404d = new Paint();
        Path path = new Path();
        this.f31405e = path;
        path.moveTo(28.5f, 8.0f);
        this.f31405e.cubicTo(25.2433f, 8.0f, 22.3022f, 9.35556f, 20.2121f, 11.5276f);
        this.f31405e.cubicTo(19.2022f, 11.1853f, 18.1212f, 11.0f, 17.0f, 11.0f);
        this.f31405e.cubicTo(11.4773f, 11.0f, 7.00027f, 15.4769f, 7.0f, 20.9995f);
        this.f31405e.cubicTo(4.57434f, 22.8214f, 3.0f, 25.7262f, 3.0f, 29.0f);
        this.f31405e.cubicTo(3.0f, 34.5228f, 7.47715f, 39.0f, 13.0f, 39.0f);
        this.f31405e.lineTo(33.9934f, 39.0f);
        this.f31405e.cubicTo(34.1132f, 39.0f, 34.2305f, 38.9895f, 34.3445f, 38.9694f);
        this.f31405e.cubicTo(40.3023f, 38.5361f, 45.0f, 33.5673f, 45.0f, 27.5f);
        this.f31405e.cubicTo(45.0f, 23.5128f, 42.97f, 20.0019f, 39.895f, 17.9409f);
        this.f31405e.cubicTo(39.1333f, 12.3262f, 34.3227f, 8.0f, 28.5f, 8.0f);
        this.f31405e.close();
        this.f31405e.moveTo(22.6193f, 14.8445f);
        this.f31405e.cubicTo(23.9964f, 13.108f, 26.1182f, 12.0f, 28.5f, 12.0f);
        this.f31405e.cubicTo(32.4665f, 12.0f, 35.7153f, 15.0804f, 35.9822f, 18.978f);
        this.f31405e.cubicTo(36.0397f, 19.8171f, 36.5108f, 20.5762f, 37.2427f, 20.9988f);
        this.f31405e.cubicTo(39.4929f, 22.2977f, 41.0f, 24.7241f, 41.0f, 27.5f);
        this.f31405e.cubicTo(41.0f, 31.5074f, 37.856f, 34.7818f, 33.9014f, 34.9895f);
        this.f31405e.cubicTo(33.8593f, 34.9917f, 33.8175f, 34.9952f, 33.776f, 35.0f);
        this.f31405e.lineTo(13.0f, 35.0f);
        this.f31405e.cubicTo(9.68629f, 35.0f, 7.0f, 32.3137f, 7.0f, 29.0f);
        this.f31405e.cubicTo(7.0f, 26.8512f, 8.12822f, 24.9643f, 9.83414f, 23.9019f);
        this.f31405e.cubicTo(10.6451f, 23.3969f, 11.105f, 22.4786f, 11.0226f, 21.5259f);
        this.f31405e.cubicTo(11.0077f, 21.3531f, 11.0f, 21.1777f, 11.0f, 21.0f);
        this.f31405e.cubicTo(11.0f, 17.6863f, 13.6863f, 15.0f, 17.0f, 15.0f);
        this.f31405e.cubicTo(17.9143f, 15.0f, 18.7755f, 15.2031f, 19.5459f, 15.5648f);
        this.f31405e.cubicTo(20.6034f, 16.0613f, 21.8803f, 15.7764f, 22.6193f, 14.8445f);
        this.f31405e.close();
        this.f31405e.setFillType(Path.FillType.EVEN_ODD);
        this.f31404d.setStyle(Paint.Style.FILL);
        this.f31404d.setColor(-16777216);
        this.f30624a.add(this.f31404d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31405e, this.f31404d);
    }
}
