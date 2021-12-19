package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class aw extends a {
    static {
        Covode.recordClassIndex(18159);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 4.5f);
        this.f30626c.cubicTo(24.8284f, 4.5f, 25.5f, 5.17157f, 25.5f, 6.0f);
        this.f30626c.lineTo(25.5f, 8.59284f);
        this.f30626c.cubicTo(31.4195f, 9.33098f, 36.0f, 14.3806f, 36.0f, 20.5f);
        this.f30626c.lineTo(36.0f, 26.8394f);
        this.f30626c.cubicTo(36.0f, 27.0188f, 36.0962f, 27.1845f, 36.2519f, 27.2735f);
        this.f30626c.lineTo(37.8611f, 28.193f);
        this.f30626c.cubicTo(38.8322f, 28.7479f, 39.4796f, 29.7336f, 39.6032f, 30.8453f);
        this.f30626c.lineTo(39.7441f, 32.1135f);
        this.f30626c.cubicTo(39.9744f, 34.1868f, 38.3515f, 36.0f, 36.2655f, 36.0f);
        this.f30626c.lineTo(28.5f, 36.0f);
        this.f30626c.cubicTo(28.5f, 38.4853f, 26.4853f, 40.5f, 24.0f, 40.5f);
        this.f30626c.cubicTo(21.5147f, 40.5f, 19.5f, 38.4853f, 19.5f, 36.0f);
        this.f30626c.lineTo(11.7345f, 36.0f);
        this.f30626c.cubicTo(9.6485f, 36.0f, 8.02559f, 34.1868f, 8.25595f, 32.1135f);
        this.f30626c.lineTo(8.39686f, 30.8453f);
        this.f30626c.cubicTo(8.52038f, 29.7336f, 9.16781f, 28.7479f, 10.139f, 28.193f);
        this.f30626c.lineTo(11.7481f, 27.2735f);
        this.f30626c.cubicTo(11.9039f, 27.1845f, 12.0f, 27.0188f, 12.0f, 26.8394f);
        this.f30626c.lineTo(12.0f, 20.5f);
        this.f30626c.cubicTo(12.0f, 14.3806f, 16.5805f, 9.331f, 22.5f, 8.59284f);
        this.f30626c.lineTo(22.5f, 6.0f);
        this.f30626c.cubicTo(22.5f, 5.17157f, 23.1716f, 4.5f, 24.0f, 4.5f);
        this.f30626c.close();
        this.f30626c.moveTo(22.5f, 36.0f);
        this.f30626c.cubicTo(22.5f, 36.8284f, 23.1716f, 37.5f, 24.0f, 37.5f);
        this.f30626c.cubicTo(24.8284f, 37.5f, 25.5f, 36.8284f, 25.5f, 36.0f);
        this.f30626c.lineTo(22.5f, 36.0f);
        this.f30626c.close();
        this.f30626c.moveTo(24.0f, 11.5f);
        this.f30626c.cubicTo(19.0295f, 11.5f, 15.0f, 15.5294f, 15.0f, 20.5f);
        this.f30626c.lineTo(15.0f, 26.8394f);
        this.f30626c.cubicTo(15.0f, 28.0954f, 14.327f, 29.2551f, 13.2365f, 29.8782f);
        this.f30626c.lineTo(11.6274f, 30.7977f);
        this.f30626c.cubicTo(11.4886f, 30.877f, 11.3962f, 31.0178f, 11.3785f, 31.1766f);
        this.f30626c.lineTo(11.2376f, 32.4448f);
        this.f30626c.cubicTo(11.2047f, 32.741f, 11.4365f, 33.0f, 11.7345f, 33.0f);
        this.f30626c.lineTo(36.2655f, 33.0f);
        this.f30626c.cubicTo(36.5635f, 33.0f, 36.7953f, 32.741f, 36.7624f, 32.4448f);
        this.f30626c.lineTo(36.6215f, 31.1766f);
        this.f30626c.cubicTo(36.6039f, 31.0178f, 36.5114f, 30.877f, 36.3726f, 30.7977f);
        this.f30626c.lineTo(34.7635f, 29.8782f);
        this.f30626c.cubicTo(33.673f, 29.2551f, 33.0f, 28.0954f, 33.0f, 26.8394f);
        this.f30626c.lineTo(33.0f, 20.5f);
        this.f30626c.cubicTo(33.0f, 15.5294f, 28.9706f, 11.5f, 24.0f, 11.5f);
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
