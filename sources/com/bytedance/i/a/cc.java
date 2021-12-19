package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class cc extends a {
    static {
        Covode.recordClassIndex(18193);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(16.5095f, 6.0f);
        this.f30626c.cubicTo(14.7554f, 6.0f, 13.3333f, 7.42203f, 13.3333f, 9.17619f);
        this.f30626c.lineTo(13.3333f, 13.3333f);
        this.f30626c.lineTo(9.17619f, 13.3333f);
        this.f30626c.cubicTo(7.42203f, 13.3333f, 6.0f, 14.7554f, 6.0f, 16.5095f);
        this.f30626c.lineTo(6.0f, 38.8238f);
        this.f30626c.cubicTo(6.0f, 40.578f, 7.42203f, 42.0f, 9.17619f, 42.0f);
        this.f30626c.lineTo(31.4905f, 42.0f);
        this.f30626c.cubicTo(33.2446f, 42.0f, 34.6667f, 40.578f, 34.6667f, 38.8238f);
        this.f30626c.lineTo(34.6667f, 34.5095f);
        this.f30626c.lineTo(38.8238f, 34.5095f);
        this.f30626c.cubicTo(40.578f, 34.5095f, 42.0f, 33.0875f, 42.0f, 31.3333f);
        this.f30626c.lineTo(42.0f, 9.17619f);
        this.f30626c.cubicTo(42.0f, 7.42203f, 40.578f, 6.0f, 38.8238f, 6.0f);
        this.f30626c.lineTo(16.5095f, 6.0f);
        this.f30626c.close();
        this.f30626c.moveTo(31.4905f, 13.3333f);
        this.f30626c.lineTo(16.3333f, 13.3333f);
        this.f30626c.lineTo(16.3333f, 9.17619f);
        this.f30626c.cubicTo(16.3333f, 9.07888f, 16.4122f, 9.0f, 16.5095f, 9.0f);
        this.f30626c.lineTo(38.8238f, 9.0f);
        this.f30626c.cubicTo(38.9211f, 9.0f, 39.0f, 9.07888f, 39.0f, 9.17619f);
        this.f30626c.lineTo(39.0f, 31.3333f);
        this.f30626c.cubicTo(39.0f, 31.4306f, 38.9211f, 31.5095f, 38.8238f, 31.5095f);
        this.f30626c.lineTo(34.6667f, 31.5095f);
        this.f30626c.lineTo(34.6667f, 16.5095f);
        this.f30626c.cubicTo(34.6667f, 14.7554f, 33.2446f, 13.3333f, 31.4905f, 13.3333f);
        this.f30626c.close();
        this.f30626c.moveTo(9.0f, 16.5095f);
        this.f30626c.cubicTo(9.0f, 16.4122f, 9.07888f, 16.3333f, 9.17619f, 16.3333f);
        this.f30626c.lineTo(31.4905f, 16.3333f);
        this.f30626c.cubicTo(31.5878f, 16.3333f, 31.6667f, 16.4122f, 31.6667f, 16.5095f);
        this.f30626c.lineTo(31.6667f, 38.8238f);
        this.f30626c.cubicTo(31.6667f, 38.9211f, 31.5878f, 39.0f, 31.4905f, 39.0f);
        this.f30626c.lineTo(9.17619f, 39.0f);
        this.f30626c.cubicTo(9.07888f, 39.0f, 9.0f, 38.9211f, 9.0f, 38.8238f);
        this.f30626c.lineTo(9.0f, 16.5095f);
        this.f30626c.close();
        this.f30626c.moveTo(17.8498f, 20.7639f);
        this.f30626c.cubicTo(17.3908f, 20.4484f, 16.7947f, 20.4131f, 16.3017f, 20.6725f);
        this.f30626c.cubicTo(15.8087f, 20.9318f, 15.5f, 21.443f, 15.5f, 22.0f);
        this.f30626c.lineTo(15.5f, 33.0f);
        this.f30626c.cubicTo(15.5f, 33.557f, 15.8087f, 34.0682f, 16.3017f, 34.3275f);
        this.f30626c.cubicTo(16.7947f, 34.5869f, 17.3908f, 34.5516f, 17.8498f, 34.2361f);
        this.f30626c.lineTo(25.8498f, 28.7361f);
        this.f30626c.cubicTo(26.2568f, 28.4562f, 26.5f, 27.9939f, 26.5f, 27.5f);
        this.f30626c.cubicTo(26.5f, 27.0061f, 26.2568f, 26.5438f, 25.8498f, 26.2639f);
        this.f30626c.lineTo(17.8498f, 20.7639f);
        this.f30626c.close();
        this.f30626c.moveTo(22.3523f, 27.5f);
        this.f30626c.lineTo(18.5f, 30.1485f);
        this.f30626c.lineTo(18.5f, 24.8515f);
        this.f30626c.lineTo(22.3523f, 27.5f);
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
