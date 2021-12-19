package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class er extends a {
    static {
        Covode.recordClassIndex(18262);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.6016f, 27.835f);
        this.f30626c.cubicTo(16.398f, 27.835f, 16.1992f, 27.8972f, 16.0319f, 28.0132f);
        this.f30626c.lineTo(8.78485f, 33.0367f);
        this.f30626c.cubicTo(8.45325f, 33.2665f, 8.0f, 33.0292f, 8.0f, 32.6257f);
        this.f30626c.lineTo(8.0f, 11.1591f);
        this.f30626c.cubicTo(8.0f, 10.6068f, 8.44772f, 10.1591f, 9.0f, 10.1591f);
        this.f30626c.lineTo(33.0f, 10.1591f);
        this.f30626c.cubicTo(33.5523f, 10.1591f, 34.0f, 10.6068f, 34.0f, 11.1591f);
        this.f30626c.lineTo(34.0f, 26.835f);
        this.f30626c.cubicTo(34.0f, 27.3873f, 33.5523f, 27.835f, 33.0f, 27.835f);
        this.f30626c.lineTo(16.6016f, 27.835f);
        this.f30626c.close();
        this.f30626c.moveTo(34.0f, 31.9941f);
        this.f30626c.lineTo(17.5f, 31.9941f);
        this.f30626c.lineTo(6.33205f, 39.7354f);
        this.f30626c.cubicTo(5.33522f, 40.4264f, 4.0f, 39.6834f, 4.0f, 38.4377f);
        this.f30626c.lineTo(4.0f, 10.1591f);
        this.f30626c.cubicTo(4.0f, 7.86207f, 5.79086f, 6.0f, 8.0f, 6.0f);
        this.f30626c.lineTo(34.0f, 6.0f);
        this.f30626c.cubicTo(36.2091f, 6.0f, 38.0f, 7.86207f, 38.0f, 10.1591f);
        this.f30626c.lineTo(38.0f, 18.8994f);
        this.f30626c.lineTo(41.5f, 18.8994f);
        this.f30626c.cubicTo(43.7091f, 18.8994f, 45.5f, 20.6774f, 45.5f, 22.8707f);
        this.f30626c.lineTo(45.5f, 41.5092f);
        this.f30626c.cubicTo(45.5f, 42.5696f, 44.4155f, 43.2902f, 43.4281f, 42.886f);
        this.f30626c.lineTo(36.0857f, 38.8798f);
        this.f30626c.lineTo(22.5f, 38.8798f);
        this.f30626c.cubicTo(20.2909f, 38.8798f, 18.5f, 37.1018f, 18.5f, 34.9085f);
        this.f30626c.lineTo(18.5f, 32.0f);
        this.f30626c.lineTo(22.5f, 32.0f);
        this.f30626c.lineTo(22.5f, 33.9085f);
        this.f30626c.cubicTo(22.5f, 34.4608f, 22.9477f, 34.9085f, 23.5f, 34.9085f);
        this.f30626c.lineTo(36.591f, 34.9085f);
        this.f30626c.cubicTo(36.7786f, 34.9085f, 36.9625f, 34.9613f, 37.1215f, 35.0608f);
        this.f30626c.lineTo(41.1939f, 37.6093f);
        this.f30626c.cubicTo(41.3271f, 37.6926f, 41.5f, 37.5969f, 41.5f, 37.4397f);
        this.f30626c.lineTo(41.5f, 23.8707f);
        this.f30626c.cubicTo(41.5f, 23.3184f, 41.0523f, 22.8707f, 40.5f, 22.8707f);
        this.f30626c.lineTo(38.0f, 22.8707f);
        this.f30626c.lineTo(38.0f, 27.835f);
        this.f30626c.cubicTo(38.0f, 30.132f, 36.2091f, 31.9941f, 34.0f, 31.9941f);
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
