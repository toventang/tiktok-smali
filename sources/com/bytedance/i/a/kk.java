package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class kk extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31682d;

    /* renamed from: e  reason: collision with root package name */
    Path f31683e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31684f;

    /* renamed from: g  reason: collision with root package name */
    Path f31685g;

    static {
        Covode.recordClassIndex(18417);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(36.2544f, 66.8965f);
        this.f30626c.cubicTo(38.3507f, 66.8965f, 40.05f, 65.1971f, 40.05f, 63.1008f);
        this.f30626c.cubicTo(40.05f, 61.0045f, 38.3507f, 59.3052f, 36.2544f, 59.3052f);
        this.f30626c.cubicTo(34.1581f, 59.3052f, 32.4587f, 61.0045f, 32.4587f, 63.1008f);
        this.f30626c.cubicTo(32.4587f, 65.1971f, 34.1581f, 66.8965f, 36.2544f, 66.8965f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31682d = new Paint();
        Path path = new Path();
        this.f31683e = path;
        path.moveTo(44.0911f, 16.0463f);
        this.f31683e.lineTo(41.8628f, 18.7804f);
        this.f31683e.cubicTo(39.935f, 18.56f, 37.9871f, 18.4349f, 36.0341f, 18.4349f);
        this.f31683e.cubicTo(24.1665f, 18.4349f, 12.6093f, 22.5961f, 3.48571f, 30.1523f);
        this.f31683e.cubicTo(3.20529f, 30.3826f, 2.86479f, 30.4978f, 2.52929f, 30.4978f);
        this.f31683e.cubicTo(2.09865f, 30.4978f, 1.66801f, 30.3125f, 1.37257f, 29.952f);
        this.f31683e.cubicTo(0.846784f, 29.3161f, 0.931911f, 28.3696f, 1.57286f, 27.8389f);
        this.f31683e.cubicTo(11.2322f, 19.8369f, 23.4755f, 15.4304f, 36.0392f, 15.4304f);
        this.f31683e.cubicTo(38.7482f, 15.4304f, 41.4372f, 15.6457f, 44.0911f, 16.0463f);
        this.f31683e.close();
        this.f31683e.moveTo(32.779f, 29.9221f);
        this.f31683e.cubicTo(25.0625f, 30.5381f, 17.8117f, 33.3573f, 11.6475f, 38.1594f);
        this.f31683e.cubicTo(10.9915f, 38.6702f, 10.8764f, 39.6116f, 11.3871f, 40.2675f);
        this.f31683e.cubicTo(11.8979f, 40.9235f, 12.8393f, 41.0387f, 13.4953f, 40.5279f);
        this.f31683e.cubicTo(18.3926f, 36.7123f, 24.0309f, 34.2536f, 30.0449f, 33.2771f);
        this.f31683e.lineTo(32.779f, 29.9221f);
        this.f31683e.close();
        this.f31683e.moveTo(50.2049f, 48.4843f);
        this.f31683e.cubicTo(46.0137f, 45.6501f, 41.1114f, 44.1528f, 36.0338f, 44.1528f);
        this.f31683e.cubicTo(34.8821f, 44.1528f, 33.7454f, 44.233f, 32.6187f, 44.3832f);
        this.f31683e.lineTo(29.5892f, 48.0987f);
        this.f31683e.cubicTo(31.6623f, 47.4778f, 33.8255f, 47.1523f, 36.0338f, 47.1523f);
        this.f31683e.cubicTo(40.5105f, 47.1523f, 44.8269f, 48.4693f, 48.5224f, 50.968f);
        this.f31683e.cubicTo(49.2134f, 51.4337f, 50.1448f, 51.2534f, 50.6105f, 50.5624f);
        this.f31683e.cubicTo(51.0762f, 49.8814f, 50.8909f, 48.95f, 50.2049f, 48.4843f);
        this.f31683e.close();
        this.f31683e.moveTo(60.4207f, 38.1653f);
        this.f31683e.cubicTo(55.4934f, 34.3245f, 49.875f, 31.7607f, 43.8811f, 30.5689f);
        this.f31683e.lineTo(41.7079f, 33.2379f);
        this.f31683e.cubicTo(47.842f, 34.1793f, 53.5906f, 36.653f, 58.573f, 40.5338f);
        this.f31683e.cubicTo(58.8484f, 40.7491f, 59.1739f, 40.8493f, 59.4943f, 40.8493f);
        this.f31683e.cubicTo(59.94f, 40.8493f, 60.3857f, 40.649f, 60.6811f, 40.2684f);
        this.f31683e.cubicTo(61.1969f, 39.6174f, 61.0767f, 38.676f, 60.4207f, 38.1653f);
        this.f31683e.close();
        this.f31683e.moveTo(53.7655f, 18.4401f);
        this.f31683e.cubicTo(59.7944f, 20.5282f, 65.4529f, 23.6729f, 70.4253f, 27.779f);
        this.f31683e.cubicTo(71.0662f, 28.3048f, 71.1563f, 29.2512f, 70.6255f, 29.8972f);
        this.f31683e.cubicTo(70.0998f, 30.5331f, 69.1534f, 30.6232f, 68.5124f, 30.0975f);
        this.f31683e.cubicTo(63.53f, 25.9863f, 57.8215f, 22.8967f, 51.7374f, 20.9288f);
        this.f31683e.lineTo(53.7655f, 18.4401f);
        this.f31683e.close();
        this.f31683e.setFillType(Path.FillType.EVEN_ODD);
        this.f31682d.setStyle(Paint.Style.FILL);
        this.f31682d.setColor(-16777216);
        this.f30624a.add(this.f31682d);
        this.f31684f = new Paint();
        Path path2 = new Path();
        this.f31685g = path2;
        path2.moveTo(14.4869f, 61.0034f);
        this.f31685g.cubicTo(14.1514f, 61.0034f, 13.8159f, 60.8932f, 13.5405f, 60.6679f);
        this.f31685g.cubicTo(12.8996f, 60.1421f, 12.7994f, 59.1957f, 13.3252f, 58.5547f);
        this.f31685g.lineTo(56.3993f, 5.69607f);
        this.f31685g.cubicTo(56.9251f, 5.05512f, 57.8715f, 4.95497f, 58.5125f, 5.48075f);
        this.f31685g.cubicTo(59.1534f, 6.00653f, 59.2536f, 6.95294f, 58.7278f, 7.5939f);
        this.f31685g.lineTo(15.6537f, 60.4526f);
        this.f31685g.cubicTo(15.3532f, 60.8181f, 14.9226f, 61.0034f, 14.4869f, 61.0034f);
        this.f31685g.close();
        this.f31685g.setFillType(Path.FillType.WINDING);
        this.f31684f.setStyle(Paint.Style.FILL);
        this.f31684f.setColor(-16777216);
        this.f30624a.add(this.f31684f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31683e, this.f31682d);
        canvas.drawPath(this.f31685g, this.f31684f);
    }
}
