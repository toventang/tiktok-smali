package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kh extends a {
    static {
        Covode.recordClassIndex(18414);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(49.55f, 2.05728f);
        this.f30626c.lineTo(38.1855f, 2.05728f);
        this.f30626c.lineTo(38.1855f, 48.2983f);
        this.f30626c.cubicTo(38.1855f, 53.8078f, 33.8145f, 58.3336f, 28.375f, 58.3336f);
        this.f30626c.cubicTo(22.9355f, 58.3336f, 18.5646f, 53.8078f, 18.5646f, 48.2983f);
        this.f30626c.cubicTo(18.5646f, 42.8871f, 22.8384f, 38.4598f, 28.0836f, 38.263f);
        this.f30626c.lineTo(28.0836f, 26.6536f);
        this.f30626c.cubicTo(16.5248f, 26.8503f, 7.19997f, 36.3937f, 7.19997f, 48.2983f);
        this.f30626c.cubicTo(7.19997f, 60.3013f, 16.719f, 69.943f, 28.4721f, 69.943f);
        this.f30626c.cubicTo(40.2253f, 69.943f, 49.7443f, 60.2029f, 49.7443f, 48.2983f);
        this.f30626c.lineTo(49.7443f, 24.5875f);
        this.f30626c.cubicTo(54.0182f, 27.7358f, 59.2634f, 29.6051f, 64.8f, 29.7035f);
        this.f30626c.lineTo(64.8f, 18.0941f);
        this.f30626c.cubicTo(56.2522f, 17.7989f, 49.55f, 10.7152f, 49.55f, 2.05728f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
