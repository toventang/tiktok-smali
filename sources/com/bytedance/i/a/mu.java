package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mu extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31726d;

    /* renamed from: e  reason: collision with root package name */
    Path f31727e;

    static {
        Covode.recordClassIndex(18481);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(6.0f, 8.0f);
        this.f30626c.cubicTo(6.0f, 5.79086f, 7.79086f, 4.0f, 10.0f, 4.0f);
        this.f30626c.lineTo(38.0f, 4.0f);
        this.f30626c.cubicTo(40.2091f, 4.0f, 42.0f, 5.79086f, 42.0f, 8.0f);
        this.f30626c.lineTo(42.0f, 40.0f);
        this.f30626c.cubicTo(42.0f, 42.2091f, 40.2091f, 44.0f, 38.0f, 44.0f);
        this.f30626c.lineTo(10.0f, 44.0f);
        this.f30626c.cubicTo(7.79086f, 44.0f, 6.0f, 42.2091f, 6.0f, 40.0f);
        this.f30626c.lineTo(6.0f, 8.0f);
        this.f30626c.close();
        this.f30626c.moveTo(38.0f, 8.0f);
        this.f30626c.lineTo(10.0f, 8.0f);
        this.f30626c.lineTo(10.0f, 40.0f);
        this.f30626c.lineTo(38.0f, 40.0f);
        this.f30626c.lineTo(38.0f, 8.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31726d = new Paint();
        Path path = new Path();
        this.f31727e = path;
        path.moveTo(13.5887f, 15.9171f);
        this.f31727e.lineTo(12.8787f, 15.2071f);
        this.f31727e.cubicTo(12.4882f, 14.8166f, 12.4882f, 14.1834f, 12.8787f, 13.7929f);
        this.f31727e.lineTo(14.2929f, 12.3787f);
        this.f31727e.cubicTo(14.6834f, 11.9882f, 15.3166f, 11.9882f, 15.7071f, 12.3787f);
        this.f31727e.lineTo(16.4031f, 13.0747f);
        this.f31727e.cubicTo(16.4105f, 13.0816f, 16.4286f, 13.0984f, 16.4576f, 13.1238f);
        this.f31727e.cubicTo(16.5159f, 13.1748f, 16.6176f, 13.2601f, 16.7625f, 13.3687f);
        this.f31727e.cubicTo(17.0526f, 13.5863f, 17.5134f, 13.8957f, 18.1444f, 14.2111f);
        this.f31727e.cubicTo(19.3999f, 14.8389f, 21.3455f, 15.5f, 24.0f, 15.5f);
        this.f31727e.cubicTo(26.6545f, 15.5f, 28.6001f, 14.8389f, 29.8556f, 14.2111f);
        this.f31727e.cubicTo(30.4866f, 13.8957f, 30.9474f, 13.5863f, 31.2375f, 13.3687f);
        this.f31727e.cubicTo(31.3824f, 13.2601f, 31.4841f, 13.1748f, 31.5424f, 13.1238f);
        this.f31727e.cubicTo(31.5714f, 13.0984f, 31.5895f, 13.0816f, 31.5969f, 13.0747f);
        this.f31727e.lineTo(32.2929f, 12.3787f);
        this.f31727e.cubicTo(32.6834f, 11.9882f, 33.3166f, 11.9882f, 33.7071f, 12.3787f);
        this.f31727e.lineTo(35.1213f, 13.7929f);
        this.f31727e.cubicTo(35.5118f, 14.1834f, 35.5118f, 14.8166f, 35.1213f, 15.2071f);
        this.f31727e.lineTo(34.4142f, 15.9142f);
        this.f31727e.lineTo(34.4008f, 15.9275f);
        this.f31727e.lineTo(34.4128f, 15.9156f);
        this.f31727e.lineTo(34.4113f, 15.9171f);
        this.f31727e.lineTo(34.4081f, 15.9203f);
        this.f31727e.lineTo(34.4008f, 15.9275f);
        this.f31727e.lineTo(34.3828f, 15.9451f);
        this.f31727e.cubicTo(34.3692f, 15.9582f, 34.3525f, 15.9742f, 34.3327f, 15.9928f);
        this.f31727e.cubicTo(34.2931f, 16.0299f, 34.241f, 16.0775f, 34.1764f, 16.1341f);
        this.f31727e.cubicTo(34.0472f, 16.2471f, 33.8676f, 16.3962f, 33.6375f, 16.5687f);
        this.f31727e.cubicTo(33.1776f, 16.9137f, 32.5134f, 17.3543f, 31.6444f, 17.7889f);
        this.f31727e.cubicTo(29.8998f, 18.6611f, 27.3455f, 19.5f, 24.0f, 19.5f);
        this.f31727e.cubicTo(20.6545f, 19.5f, 18.1001f, 18.6611f, 16.3556f, 17.7889f);
        this.f31727e.cubicTo(15.4866f, 17.3543f, 14.8224f, 16.9137f, 14.3625f, 16.5687f);
        this.f31727e.cubicTo(14.1324f, 16.3962f, 13.9528f, 16.2471f, 13.8236f, 16.1341f);
        this.f31727e.cubicTo(13.759f, 16.0775f, 13.7069f, 16.0299f, 13.6673f, 15.9928f);
        this.f31727e.cubicTo(13.6475f, 15.9742f, 13.6308f, 15.9582f, 13.6172f, 15.9451f);
        this.f31727e.lineTo(13.5992f, 15.9275f);
        this.f31727e.lineTo(13.5919f, 15.9203f);
        this.f31727e.lineTo(13.5887f, 15.9171f);
        this.f31727e.close();
        this.f31727e.setFillType(Path.FillType.EVEN_ODD);
        this.f31726d.setStyle(Paint.Style.FILL);
        this.f31726d.setColor(-16777216);
        this.f30624a.add(this.f31726d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31727e, this.f31726d);
    }
}
