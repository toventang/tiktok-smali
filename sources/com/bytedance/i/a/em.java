package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class em extends a {
    static {
        Covode.recordClassIndex(18257);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(8.8f, 39.0f);
        this.f30626c.lineTo(8.8f, 17.8f);
        this.f30626c.lineTo(39.2f, 17.8f);
        this.f30626c.lineTo(39.2f, 39.0f);
        this.f30626c.cubicTo(39.2f, 39.1105f, 39.1105f, 39.2f, 39.0f, 39.2f);
        this.f30626c.lineTo(9.0f, 39.2f);
        this.f30626c.cubicTo(8.88954f, 39.2f, 8.8f, 39.1105f, 8.8f, 39.0f);
        this.f30626c.close();
        this.f30626c.moveTo(31.3998f, 9.83359f);
        this.f30626c.lineTo(37.6495f, 14.0f);
        this.f30626c.lineTo(10.1978f, 14.0f);
        this.f30626c.lineTo(16.1462f, 9.83615f);
        this.f30626c.cubicTo(16.1798f, 9.81262f, 16.2199f, 9.8f, 16.2609f, 9.8f);
        this.f30626c.lineTo(31.2889f, 9.8f);
        this.f30626c.cubicTo(31.3284f, 9.8f, 31.367f, 9.81169f, 31.3998f, 9.83359f);
        this.f30626c.close();
        this.f30626c.moveTo(5.0f, 39.0f);
        this.f30626c.cubicTo(5.0f, 41.2091f, 6.79086f, 43.0f, 9.0f, 43.0f);
        this.f30626c.lineTo(39.0f, 43.0f);
        this.f30626c.cubicTo(41.2091f, 43.0f, 43.0f, 41.2091f, 43.0f, 39.0f);
        this.f30626c.lineTo(43.0f, 15.1407f);
        this.f30626c.cubicTo(43.0f, 13.8033f, 42.3316f, 12.5544f, 41.2188f, 11.8125f);
        this.f30626c.lineTo(33.5077f, 6.6718f);
        this.f30626c.cubicTo(32.8506f, 6.23375f, 32.0786f, 6.0f, 31.2889f, 6.0f);
        this.f30626c.lineTo(16.2609f, 6.0f);
        this.f30626c.cubicTo(15.4402f, 6.0f, 14.6394f, 6.25244f, 13.967f, 6.72307f);
        this.f30626c.lineTo(6.70615f, 11.8057f);
        this.f30626c.cubicTo(5.63684f, 12.5542f, 5.0f, 13.7774f, 5.0f, 15.0826f);
        this.f30626c.lineTo(5.0f, 39.0f);
        this.f30626c.close();
        this.f30626c.moveTo(21.811f, 23.0453f);
        this.f30626c.lineTo(19.5345f, 25.3592f);
        this.f30626c.lineTo(29.6296f, 25.3592f);
        this.f30626c.cubicTo(32.5403f, 25.3592f, 34.9f, 27.7189f, 34.9f, 30.6296f);
        this.f30626c.cubicTo(34.9f, 33.5403f, 32.5403f, 35.9f, 29.6296f, 35.9f);
        this.f30626c.lineTo(24.0526f, 35.9f);
        this.f30626c.cubicTo(23.5003f, 35.9f, 23.0526f, 35.4523f, 23.0526f, 34.9f);
        this.f30626c.lineTo(23.0526f, 33.1f);
        this.f30626c.cubicTo(23.0526f, 32.5477f, 23.5003f, 32.1f, 24.0526f, 32.1f);
        this.f30626c.lineTo(29.6296f, 32.1f);
        this.f30626c.cubicTo(30.4417f, 32.1f, 31.1f, 31.4417f, 31.1f, 30.6296f);
        this.f30626c.cubicTo(31.1f, 29.8175f, 30.4417f, 29.1592f, 29.6296f, 29.1592f);
        this.f30626c.lineTo(15.5698f, 29.1592f);
        this.f30626c.cubicTo(13.6728f, 29.1592f, 12.7147f, 26.8728f, 14.0452f, 25.5205f);
        this.f30626c.lineTo(19.1021f, 20.3803f);
        this.f30626c.cubicTo(19.4894f, 19.9866f, 20.1226f, 19.9815f, 20.5163f, 20.3688f);
        this.f30626c.lineTo(21.7994f, 21.6312f);
        this.f30626c.cubicTo(22.1931f, 22.0185f, 22.1983f, 22.6516f, 21.811f, 23.0453f);
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
