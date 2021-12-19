package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ib extends a {
    static {
        Covode.recordClassIndex(18354);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(22.5f, 2.0f);
        this.f30626c.cubicTo(22.2239f, 2.0f, 22.0f, 2.22386f, 22.0f, 2.5f);
        this.f30626c.lineTo(22.0f, 9.5f);
        this.f30626c.cubicTo(22.0f, 9.77614f, 22.2239f, 10.0f, 22.5f, 10.0f);
        this.f30626c.lineTo(25.5f, 10.0f);
        this.f30626c.cubicTo(25.7761f, 10.0f, 26.0f, 9.77614f, 26.0f, 9.5f);
        this.f30626c.lineTo(26.0f, 2.5f);
        this.f30626c.cubicTo(26.0f, 2.22386f, 25.7761f, 2.0f, 25.5f, 2.0f);
        this.f30626c.lineTo(22.5f, 2.0f);
        this.f30626c.close();
        this.f30626c.moveTo(9.09665f, 12.0f);
        this.f30626c.cubicTo(6.95239f, 12.0f, 5.80312f, 14.5224f, 7.21014f, 16.1404f);
        this.f30626c.lineTo(14.0445f, 24.0f);
        this.f30626c.lineTo(33.954f, 24.0f);
        this.f30626c.lineTo(40.7884f, 16.1404f);
        this.f30626c.cubicTo(42.1954f, 14.5224f, 41.0462f, 12.0f, 38.9019f, 12.0f);
        this.f30626c.lineTo(9.09665f, 12.0f);
        this.f30626c.close();
        this.f30626c.moveTo(15.9993f, 43.5f);
        this.f30626c.lineTo(15.9993f, 28.0f);
        this.f30626c.lineTo(31.9993f, 28.0f);
        this.f30626c.lineTo(31.9993f, 43.5f);
        this.f30626c.cubicTo(31.9993f, 44.8807f, 30.88f, 46.0f, 29.4993f, 46.0f);
        this.f30626c.lineTo(18.4993f, 46.0f);
        this.f30626c.cubicTo(17.1186f, 46.0f, 15.9993f, 44.8807f, 15.9993f, 43.5f);
        this.f30626c.close();
        this.f30626c.moveTo(11.6364f, 5.18936f);
        this.f30626c.cubicTo(11.478f, 4.96316f, 11.533f, 4.65139f, 11.7592f, 4.493f);
        this.f30626c.lineTo(14.2166f, 2.77227f);
        this.f30626c.cubicTo(14.4428f, 2.61388f, 14.7546f, 2.66885f, 14.913f, 2.89506f);
        this.f30626c.lineTo(18.6413f, 8.21954f);
        this.f30626c.cubicTo(18.7996f, 8.44575f, 18.7447f, 8.75752f, 18.5185f, 8.91591f);
        this.f30626c.lineTo(16.061f, 10.6366f);
        this.f30626c.cubicTo(15.8348f, 10.795f, 15.523f, 10.7401f, 15.3646f, 10.5138f);
        this.f30626c.lineTo(11.6364f, 5.18936f);
        this.f30626c.close();
        this.f30626c.moveTo(33.7787f, 2.78679f);
        this.f30626c.cubicTo(33.5525f, 2.6284f, 33.2407f, 2.68337f, 33.0824f, 2.90958f);
        this.f30626c.lineTo(29.3541f, 8.23406f);
        this.f30626c.cubicTo(29.1957f, 8.46027f, 29.2507f, 8.77204f, 29.4769f, 8.93043f);
        this.f30626c.lineTo(31.9343f, 10.6512f);
        this.f30626c.cubicTo(32.1606f, 10.8095f, 32.4723f, 10.7546f, 32.6307f, 10.5284f);
        this.f30626c.lineTo(36.359f, 5.20388f);
        this.f30626c.cubicTo(36.5173f, 4.97768f, 36.4624f, 4.66591f, 36.2362f, 4.50752f);
        this.f30626c.lineTo(33.7787f, 2.78679f);
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
