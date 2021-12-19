package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class pd extends a {
    static {
        Covode.recordClassIndex(18545);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(21.15f, 7.0f);
        this.f30626c.cubicTo(13.3352f, 7.0f, 7.0f, 13.3352f, 7.0f, 21.15f);
        this.f30626c.cubicTo(7.0f, 23.6101f, 7.62752f, 25.924f, 8.73226f, 27.9402f);
        this.f30626c.cubicTo(8.71086f, 27.5795f, 8.7f, 27.216f, 8.7f, 26.85f);
        this.f30626c.cubicTo(8.7f, 16.826f, 16.826f, 8.7f, 26.85f, 8.7f);
        this.f30626c.cubicTo(27.216f, 8.7f, 27.5795f, 8.71086f, 27.9402f, 8.73226f);
        this.f30626c.cubicTo(25.924f, 7.62752f, 23.6101f, 7.0f, 21.15f, 7.0f);
        this.f30626c.close();
        this.f30626c.moveTo(36.5151f, 11.4849f);
        this.f30626c.cubicTo(33.3046f, 6.39097f, 27.6243f, 3.0f, 21.15f, 3.0f);
        this.f30626c.cubicTo(11.126f, 3.0f, 3.0f, 11.126f, 3.0f, 21.15f);
        this.f30626c.cubicTo(3.0f, 27.6243f, 6.39097f, 33.3046f, 11.4849f, 36.5151f);
        this.f30626c.cubicTo(14.6954f, 41.609f, 20.3757f, 45.0f, 26.85f, 45.0f);
        this.f30626c.cubicTo(36.874f, 45.0f, 45.0f, 36.874f, 45.0f, 26.85f);
        this.f30626c.cubicTo(45.0f, 20.3757f, 41.609f, 14.6954f, 36.5151f, 11.4849f);
        this.f30626c.close();
        this.f30626c.moveTo(26.85f, 12.7f);
        this.f30626c.cubicTo(19.0352f, 12.7f, 12.7f, 19.0352f, 12.7f, 26.85f);
        this.f30626c.cubicTo(12.7f, 29.4797f, 13.4155f, 31.9361f, 14.6611f, 34.0421f);
        this.f30626c.cubicTo(17.1272f, 38.2113f, 21.664f, 41.0f, 26.85f, 41.0f);
        this.f30626c.cubicTo(34.6648f, 41.0f, 41.0f, 34.6648f, 41.0f, 26.85f);
        this.f30626c.cubicTo(41.0f, 21.664f, 38.2113f, 17.1272f, 34.0421f, 14.6611f);
        this.f30626c.cubicTo(31.9361f, 13.4155f, 29.4797f, 12.7f, 26.85f, 12.7f);
        this.f30626c.close();
        this.f30626c.moveTo(27.0f, 19.2775f);
        this.f30626c.cubicTo(24.498f, 17.4044f, 21.1305f, 17.6015f, 18.8989f, 19.7975f);
        this.f30626c.cubicTo(16.367f, 22.2891f, 16.367f, 26.3423f, 18.8989f, 28.8339f);
        this.f30626c.lineTo(25.5972f, 35.4255f);
        this.f30626c.cubicTo(26.3756f, 36.1915f, 27.6244f, 36.1915f, 28.4028f, 35.4255f);
        this.f30626c.lineTo(35.1011f, 28.8339f);
        this.f30626c.cubicTo(37.633f, 26.3423f, 37.633f, 22.2891f, 35.1011f, 19.7975f);
        this.f30626c.cubicTo(32.8695f, 17.6015f, 29.502f, 17.4044f, 27.0f, 19.2775f);
        this.f30626c.close();
        this.f30626c.moveTo(25.0758f, 22.9234f);
        this.f30626c.cubicTo(24.0254f, 21.7115f, 22.5967f, 21.7706f, 21.7046f, 22.6486f);
        this.f30626c.cubicTo(20.7651f, 23.573f, 20.7651f, 25.0584f, 21.7046f, 25.9829f);
        this.f30626c.lineTo(27.0f, 31.194f);
        this.f30626c.lineTo(32.2954f, 25.9829f);
        this.f30626c.cubicTo(33.2349f, 25.0584f, 33.2349f, 23.573f, 32.2954f, 22.6486f);
        this.f30626c.cubicTo(31.4033f, 21.7706f, 29.9746f, 21.7115f, 28.9242f, 22.9234f);
        this.f30626c.lineTo(28.8722f, 22.9834f);
        this.f30626c.lineTo(27.0f, 24.8258f);
        this.f30626c.lineTo(25.1278f, 22.9834f);
        this.f30626c.lineTo(25.0758f, 22.9234f);
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
