package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class da extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31402d;

    /* renamed from: e  reason: collision with root package name */
    Path f31403e;

    static {
        Covode.recordClassIndex(18218);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(0.0f, 5.0f);
        this.f30626c.cubicTo(0.0f, 2.23858f, 2.23858f, 0.0f, 5.0f, 0.0f);
        this.f30626c.lineTo(43.0f, 0.0f);
        this.f30626c.cubicTo(45.7614f, 0.0f, 48.0f, 2.23858f, 48.0f, 5.0f);
        this.f30626c.lineTo(48.0f, 43.0f);
        this.f30626c.cubicTo(48.0f, 45.7614f, 45.7614f, 48.0f, 43.0f, 48.0f);
        this.f30626c.lineTo(5.0f, 48.0f);
        this.f30626c.cubicTo(2.23858f, 48.0f, 0.0f, 45.7614f, 0.0f, 43.0f);
        this.f30626c.lineTo(0.0f, 5.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-3927552);
        this.f31402d = new Paint();
        Path path = new Path();
        this.f31403e = path;
        path.moveTo(13.8899f, 21.8827f);
        this.f31403e.lineTo(20.656f, 25.3449f);
        this.f31403e.cubicTo(21.96f, 26.0145f, 21.7563f, 28.0166f, 20.3504f, 28.387f);
        this.f31403e.lineTo(13.0477f, 30.2965f);
        this.f31403e.cubicTo(12.8333f, 30.3531f, 12.6099f, 30.3608f, 12.3924f, 30.3192f);
        this.f31403e.cubicTo(12.175f, 30.2776f, 11.9686f, 30.1876f, 11.787f, 30.0554f);
        this.f31403e.cubicTo(11.6055f, 29.9231f, 11.4531f, 29.7516f, 11.3401f, 29.5524f);
        this.f31403e.cubicTo(11.227f, 29.3532f, 11.156f, 29.1309f, 11.1317f, 28.9005f);
        this.f31403e.cubicTo(10.9076f, 26.8524f, 11.1163f, 24.7776f, 11.743f, 22.8235f);
        this.f31403e.cubicTo(11.8133f, 22.6047f, 11.9273f, 22.4041f, 12.0774f, 22.2351f);
        this.f31403e.cubicTo(12.2275f, 22.0661f, 12.4102f, 21.9327f, 12.6134f, 21.8436f);
        this.f31403e.cubicTo(12.8166f, 21.7546f, 13.0355f, 21.712f, 13.2557f, 21.7187f);
        this.f31403e.cubicTo(13.4758f, 21.7255f, 13.692f, 21.7813f, 13.8899f, 21.8827f);
        this.f31403e.close();
        this.f31403e.moveTo(16.8783f, 38.9234f);
        this.f31403e.cubicTo(18.4972f, 40.0864f, 20.3377f, 40.8668f, 22.2725f, 41.2104f);
        this.f31403e.cubicTo(22.4902f, 41.2496f, 22.7134f, 41.2394f, 22.9271f, 41.1806f);
        this.f31403e.cubicTo(23.1407f, 41.1218f, 23.3399f, 41.0156f, 23.5112f, 40.8693f);
        this.f31403e.cubicTo(23.6825f, 40.723f, 23.8219f, 40.54f, 23.9201f, 40.3325f);
        this.f31403e.cubicTo(24.0183f, 40.1249f, 24.073f, 39.8978f, 24.0805f, 39.6662f);
        this.f31403e.lineTo(24.3453f, 31.773f);
        this.f31403e.cubicTo(24.3929f, 30.2559f, 22.6134f, 29.5002f, 21.6415f, 30.6263f);
        this.f31403e.lineTo(16.6012f, 36.4953f);
        this.f31403e.cubicTo(16.4536f, 36.6675f, 16.3428f, 36.8708f, 16.2762f, 37.0916f);
        this.f31403e.cubicTo(16.2096f, 37.3123f, 16.1888f, 37.5455f, 16.2151f, 37.7754f);
        this.f31403e.cubicTo(16.2414f, 38.0053f, 16.3142f, 38.2266f, 16.4287f, 38.4246f);
        this.f31403e.cubicTo(16.5432f, 38.6226f, 16.6968f, 38.7926f, 16.879f, 38.9234f);
        this.f31403e.lineTo(16.8783f, 38.9234f);
        this.f31403e.close();
        this.f31403e.moveTo(26.7497f, 31.0943f);
        this.f31403e.lineTo(30.744f, 37.7895f);
        this.f31403e.cubicTo(30.8617f, 37.986f, 31.0181f, 38.154f, 31.2026f, 38.2823f);
        this.f31403e.cubicTo(31.3871f, 38.4105f, 31.5956f, 38.496f, 31.8141f, 38.533f);
        this.f31403e.cubicTo(32.0327f, 38.5701f, 32.2562f, 38.5579f, 32.4699f, 38.4972f);
        this.f31403e.cubicTo(32.6835f, 38.4366f, 32.8824f, 38.3288f, 33.0532f, 38.1812f);
        this.f31403e.cubicTo(34.567f, 36.8689f, 35.7889f, 35.2253f, 36.6333f, 33.3656f);
        this.f31403e.cubicTo(36.7263f, 33.1563f, 36.7761f, 32.9286f, 36.7793f, 32.6976f);
        this.f31403e.cubicTo(36.7825f, 32.4667f, 36.7391f, 32.2376f, 36.6519f, 32.0254f);
        this.f31403e.cubicTo(36.5648f, 31.8133f, 36.4358f, 31.6229f, 36.2735f, 31.4667f);
        this.f31403e.cubicTo(36.1112f, 31.3105f, 35.9193f, 31.1921f, 35.7102f, 31.1192f);
        this.f31403e.lineTo(28.5502f, 28.679f);
        this.f31403e.cubicTo(27.1708f, 28.216f, 25.9822f, 29.8044f, 26.7497f, 31.0943f);
        this.f31403e.close();
        this.f31403e.moveTo(36.8241f, 21.6761f);
        this.f31403e.cubicTo(36.0413f, 19.7875f, 34.8725f, 18.1023f, 33.4003f, 16.7395f);
        this.f31403e.cubicTo(33.2347f, 16.5872f, 33.04f, 16.4737f, 32.8293f, 16.4064f);
        this.f31403e.cubicTo(32.6186f, 16.3392f, 32.3966f, 16.3197f, 32.1782f, 16.3494f);
        this.f31403e.cubicTo(31.9598f, 16.379f, 31.7499f, 16.4571f, 31.5624f, 16.5784f);
        this.f31403e.cubicTo(31.375f, 16.6997f, 31.2143f, 16.8614f, 31.0911f, 17.0529f);
        this.f31403e.lineTo(26.8801f, 23.5999f);
        this.f31403e.cubicTo(26.0718f, 24.8606f, 27.1993f, 26.4924f, 28.5916f, 26.0721f);
        this.f31403e.lineTo(35.8345f, 23.8991f);
        this.f31403e.cubicTo(36.0468f, 23.8335f, 36.2434f, 23.7215f, 36.4113f, 23.5703f);
        this.f31403e.cubicTo(36.5791f, 23.4191f, 36.7145f, 23.2322f, 36.8083f, 23.022f);
        this.f31403e.cubicTo(36.9021f, 22.8119f, 36.9523f, 22.5832f, 36.9555f, 22.3512f);
        this.f31403e.cubicTo(36.9587f, 22.1191f, 36.9148f, 21.889f, 36.8268f, 21.6761f);
        this.f31403e.lineTo(36.8241f, 21.6761f);
        this.f31403e.close();
        this.f31403e.moveTo(15.1946f, 6.91534f);
        this.f31403e.cubicTo(15.0022f, 7.01244f, 14.831f, 7.15011f, 14.6916f, 7.31975f);
        this.f31403e.cubicTo(14.5523f, 7.48939f, 14.4478f, 7.68734f, 14.3847f, 7.90125f);
        this.f31403e.cubicTo(14.3216f, 8.11515f, 14.3012f, 8.34041f, 14.3249f, 8.56294f);
        this.f31403e.cubicTo(14.3486f, 8.78546f, 14.4157f, 9.00048f, 14.5222f, 9.19455f);
        this.f31403e.lineTo(21.5939f, 22.0465f);
        this.f31403e.cubicTo(22.3886f, 23.4852f, 24.488f, 22.8941f, 24.488f, 21.2345f);
        this.f31403e.lineTo(24.488f, 6.39539f);
        this.f31403e.cubicTo(24.4899f, 6.17114f, 24.4473f, 5.94893f, 24.3628f, 5.74292f);
        this.f31403e.cubicTo(24.2783f, 5.53691f, 24.1538f, 5.35161f, 23.9973f, 5.19883f);
        this.f31403e.cubicTo(23.8407f, 5.04606f, 23.6555f, 4.92915f, 23.4535f, 4.85557f);
        this.f31403e.cubicTo(23.2515f, 4.78199f, 23.0371f, 4.75334f, 22.824f, 4.77145f);
        this.f31403e.cubicTo(20.1774f, 4.992f, 17.5917f, 5.7186f, 15.1946f, 6.91534f);
        this.f31403e.close();
        this.f31403e.setFillType(Path.FillType.WINDING);
        this.f31402d.setStyle(Paint.Style.FILL);
        this.f31402d.setColor(-1);
        this.f30624a.add(this.f31402d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31403e, this.f31402d);
    }
}
