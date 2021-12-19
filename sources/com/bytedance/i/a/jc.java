package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class jc extends a {
    static {
        Covode.recordClassIndex(18382);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(23.3205f, 17.0f);
        this.f30626c.cubicTo(23.3205f, 10.1144f, 28.9792f, 4.5f, 36.0f, 4.5f);
        this.f30626c.cubicTo(43.0208f, 4.5f, 48.6795f, 10.1144f, 48.6795f, 17.0f);
        this.f30626c.cubicTo(48.6795f, 19.3818f, 48.0051f, 21.6058f, 46.8328f, 23.5f);
        this.f30626c.lineTo(25.1672f, 23.5f);
        this.f30626c.cubicTo(23.9949f, 21.6058f, 23.3205f, 19.3818f, 23.3205f, 17.0f);
        this.f30626c.close();
        this.f30626c.moveTo(51.6795f, 17.0f);
        this.f30626c.cubicTo(51.6795f, 19.3204f, 51.1629f, 21.523f, 50.238f, 23.5f);
        this.f30626c.lineTo(61.9484f, 23.5f);
        this.f30626c.cubicTo(65.1928f, 23.5f, 67.7752f, 26.2578f, 67.4767f, 29.4997f);
        this.f30626c.lineTo(64.162f, 65.4997f);
        this.f30626c.cubicTo(63.8998f, 68.3473f, 61.4885f, 70.5f, 58.6337f, 70.5f);
        this.f30626c.lineTo(13.3663f, 70.5f);
        this.f30626c.cubicTo(10.5115f, 70.5f, 8.10016f, 68.3474f, 7.83796f, 65.4997f);
        this.f30626c.lineTo(4.52327f, 29.4997f);
        this.f30626c.cubicTo(4.22477f, 26.2578f, 6.8072f, 23.5f, 10.0516f, 23.5f);
        this.f30626c.lineTo(21.762f, 23.5f);
        this.f30626c.cubicTo(20.8371f, 21.523f, 20.3205f, 19.3204f, 20.3205f, 17.0f);
        this.f30626c.cubicTo(20.3205f, 8.42163f, 27.3585f, 1.5f, 36.0f, 1.5f);
        this.f30626c.cubicTo(44.6415f, 1.5f, 51.6795f, 8.42163f, 51.6795f, 17.0f);
        this.f30626c.close();
        this.f30626c.moveTo(7.51063f, 29.2246f);
        this.f30626c.cubicTo(7.37777f, 27.7816f, 8.53144f, 26.5f, 10.0516f, 26.5f);
        this.f30626c.lineTo(61.9484f, 26.5f);
        this.f30626c.cubicTo(63.4685f, 26.5f, 64.6222f, 27.7816f, 64.4893f, 29.2246f);
        this.f30626c.lineTo(61.1746f, 65.2246f);
        this.f30626c.cubicTo(61.0574f, 66.4976f, 59.9695f, 67.5f, 58.6337f, 67.5f);
        this.f30626c.lineTo(13.3663f, 67.5f);
        this.f30626c.cubicTo(12.0304f, 67.5f, 10.9425f, 66.4976f, 10.8253f, 65.2246f);
        this.f30626c.lineTo(7.51063f, 29.2246f);
        this.f30626c.close();
        this.f30626c.moveTo(31.8657f, 36.5f);
        this.f30626c.cubicTo(31.8657f, 38.0188f, 30.6345f, 39.25f, 29.1157f, 39.25f);
        this.f30626c.cubicTo(27.5969f, 39.25f, 26.3657f, 38.0188f, 26.3657f, 36.5f);
        this.f30626c.cubicTo(26.3657f, 34.9812f, 27.5969f, 33.75f, 29.1157f, 33.75f);
        this.f30626c.cubicTo(30.6345f, 33.75f, 31.8657f, 34.9812f, 31.8657f, 36.5f);
        this.f30626c.close();
        this.f30626c.moveTo(47.9719f, 36.5f);
        this.f30626c.cubicTo(47.9719f, 38.0188f, 46.7407f, 39.25f, 45.2219f, 39.25f);
        this.f30626c.cubicTo(43.7031f, 39.25f, 42.4719f, 38.0188f, 42.4719f, 36.5f);
        this.f30626c.cubicTo(42.4719f, 34.9812f, 43.7031f, 33.75f, 45.2219f, 33.75f);
        this.f30626c.cubicTo(46.7407f, 33.75f, 47.9719f, 34.9812f, 47.9719f, 36.5f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
