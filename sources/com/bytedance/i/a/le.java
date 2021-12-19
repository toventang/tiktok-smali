package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class le extends a {
    static {
        Covode.recordClassIndex(18438);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(32.4852f, 5.61523f);
        this.f30626c.cubicTo(29.361f, 2.49103f, 24.2957f, 2.49103f, 21.1715f, 5.61523f);
        this.f30626c.lineTo(17.1056f, 9.68109f);
        this.f30626c.cubicTo(16.7151f, 10.0716f, 16.7151f, 10.7048f, 17.1056f, 11.0953f);
        this.f30626c.lineTo(18.5198f, 12.5095f);
        this.f30626c.cubicTo(18.9103f, 12.9f, 19.5435f, 12.9f, 19.934f, 12.5095f);
        this.f30626c.lineTo(23.9999f, 8.44365f);
        this.f30626c.cubicTo(25.562f, 6.88156f, 28.0947f, 6.88156f, 29.6567f, 8.44365f);
        this.f30626c.lineTo(39.5562f, 18.3431f);
        this.f30626c.cubicTo(41.1183f, 19.9052f, 41.1183f, 22.4379f, 39.5562f, 24.0f);
        this.f30626c.lineTo(35.4904f, 28.0659f);
        this.f30626c.cubicTo(35.0999f, 28.4564f, 35.0999f, 29.0896f, 35.4904f, 29.4801f);
        this.f30626c.lineTo(36.9046f, 30.8943f);
        this.f30626c.cubicTo(37.2951f, 31.2848f, 37.9283f, 31.2848f, 38.3188f, 30.8943f);
        this.f30626c.lineTo(42.3847f, 26.8284f);
        this.f30626c.cubicTo(45.5089f, 23.7042f, 45.5089f, 18.6389f, 42.3847f, 15.5147f);
        this.f30626c.lineTo(32.4852f, 5.61523f);
        this.f30626c.close();
        this.f30626c.moveTo(12.5094f, 19.9341f);
        this.f30626c.cubicTo(12.8999f, 19.5436f, 12.8999f, 18.9104f, 12.5094f, 18.5199f);
        this.f30626c.lineTo(11.0952f, 17.1057f);
        this.f30626c.cubicTo(10.7047f, 16.7152f, 10.0715f, 16.7152f, 9.68098f, 17.1057f);
        this.f30626c.lineTo(5.61512f, 21.1716f);
        this.f30626c.cubicTo(2.49092f, 24.2958f, 2.49092f, 29.3611f, 5.61512f, 32.4853f);
        this.f30626c.lineTo(15.5146f, 42.3848f);
        this.f30626c.cubicTo(18.6388f, 45.509f, 23.7041f, 45.509f, 26.8283f, 42.3848f);
        this.f30626c.lineTo(30.8942f, 38.3189f);
        this.f30626c.cubicTo(31.2847f, 37.9284f, 31.2847f, 37.2952f, 30.8942f, 36.9047f);
        this.f30626c.lineTo(29.48f, 35.4905f);
        this.f30626c.cubicTo(29.0894f, 35.1f, 28.4563f, 35.1f, 28.0658f, 35.4905f);
        this.f30626c.lineTo(23.9999f, 39.5564f);
        this.f30626c.cubicTo(22.4378f, 41.1184f, 19.9051f, 41.1184f, 18.343f, 39.5564f);
        this.f30626c.lineTo(8.44355f, 29.6569f);
        this.f30626c.cubicTo(6.88145f, 28.0948f, 6.88145f, 25.5621f, 8.44355f, 24.0f);
        this.f30626c.lineTo(12.5094f, 19.9341f);
        this.f30626c.close();
        this.f30626c.moveTo(17.636f, 27.5356f);
        this.f30626c.cubicTo(17.2454f, 27.9261f, 17.2454f, 28.5592f, 17.636f, 28.9498f);
        this.f30626c.lineTo(19.0502f, 30.364f);
        this.f30626c.cubicTo(19.4407f, 30.7545f, 20.0739f, 30.7545f, 20.4644f, 30.364f);
        this.f30626c.lineTo(30.3639f, 20.4645f);
        this.f30626c.cubicTo(30.7544f, 20.074f, 30.7544f, 19.4408f, 30.3639f, 19.0503f);
        this.f30626c.lineTo(28.9497f, 17.6361f);
        this.f30626c.cubicTo(28.5592f, 17.2455f, 27.926f, 17.2455f, 27.5355f, 17.6361f);
        this.f30626c.lineTo(17.636f, 27.5356f);
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
