package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gv extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31581d;

    /* renamed from: e  reason: collision with root package name */
    Path f31582e;

    static {
        Covode.recordClassIndex(18320);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31581d = new Paint();
        Path path = new Path();
        this.f31582e = path;
        path.addRect(0.0f, 0.0f, 48.0f, 48.0f, Path.Direction.CW);
        this.f30626c.moveTo(1.37282f, 25.4142f);
        this.f30626c.lineTo(16.2222f, 10.5649f);
        this.f30626c.lineTo(17.8344f, 12.1771f);
        this.f30626c.cubicTo(18.1155f, 12.4582f, 18.5714f, 12.4582f, 18.8526f, 12.1771f);
        this.f30626c.lineTo(20.3092f, 10.7204f);
        this.f30626c.cubicTo(20.5904f, 10.4392f, 20.5904f, 9.98337f, 20.3092f, 9.70219f);
        this.f30626c.lineTo(18.697f, 8.08999f);
        this.f30626c.lineTo(25.4145f, 1.37258f);
        this.f30626c.cubicTo(26.586f, 0.201004f, 28.4855f, 0.201003f, 29.6571f, 1.37258f);
        this.f30626c.lineTo(33.2133f, 4.92882f);
        this.f30626c.cubicTo(33.5774f, 5.29285f, 33.5966f, 5.86997f, 33.334f, 6.3128f);
        this.f30626c.cubicTo(31.983f, 8.59138f, 32.2871f, 11.5791f, 34.2464f, 13.5384f);
        this.f30626c.cubicTo(36.2057f, 15.4978f, 39.1935f, 15.8019f, 41.472f, 14.4508f);
        this.f30626c.cubicTo(41.9149f, 14.1882f, 42.492f, 14.2075f, 42.856f, 14.5715f);
        this.f30626c.lineTo(46.6277f, 18.3431f);
        this.f30626c.cubicTo(47.7992f, 19.5147f, 47.7992f, 21.4142f, 46.6277f, 22.5858f);
        this.f30626c.lineTo(39.9101f, 29.3033f);
        this.f30626c.lineTo(38.2382f, 27.6313f);
        this.f30626c.cubicTo(37.957f, 27.3502f, 37.5011f, 27.3502f, 37.22f, 27.6313f);
        this.f30626c.lineTo(35.7633f, 29.088f);
        this.f30626c.cubicTo(35.4821f, 29.3692f, 35.4821f, 29.825f, 35.7633f, 30.1062f);
        this.f30626c.lineTo(37.4353f, 31.7782f);
        this.f30626c.lineTo(22.586f, 46.6274f);
        this.f30626c.cubicTo(21.4145f, 47.799f, 19.515f, 47.799f, 18.3434f, 46.6274f);
        this.f30626c.lineTo(14.4906f, 42.7747f);
        this.f30626c.cubicTo(14.1453f, 42.4293f, 14.1088f, 41.8886f, 14.3324f, 41.4544f);
        this.f30626c.cubicTo(15.4832f, 39.22f, 15.1224f, 36.4084f, 13.25f, 34.536f);
        this.f30626c.cubicTo(11.3776f, 32.6636f, 8.56602f, 32.3028f, 6.33166f, 33.4536f);
        this.f30626c.cubicTo(5.89748f, 33.6773f, 5.35673f, 33.6408f, 5.01139f, 33.2954f);
        this.f30626c.lineTo(1.37282f, 29.6568f);
        this.f30626c.cubicTo(0.201248f, 28.4853f, 0.201247f, 26.5858f, 1.37282f, 25.4142f);
        this.f30626c.close();
        this.f30626c.moveTo(21.7805f, 15.1052f);
        this.f30626c.cubicTo(21.4993f, 15.3864f, 21.4993f, 15.8422f, 21.7805f, 16.1234f);
        this.f30626c.lineTo(25.0049f, 19.3478f);
        this.f30626c.cubicTo(25.2861f, 19.629f, 25.742f, 19.629f, 26.0232f, 19.3478f);
        this.f30626c.lineTo(27.4798f, 17.8912f);
        this.f30626c.cubicTo(27.761f, 17.61f, 27.761f, 17.1541f, 27.4798f, 16.873f);
        this.f30626c.lineTo(24.2554f, 13.6485f);
        this.f30626c.cubicTo(23.9742f, 13.3674f, 23.5183f, 13.3674f, 23.2372f, 13.6485f);
        this.f30626c.lineTo(21.7805f, 15.1052f);
        this.f30626c.close();
        this.f30626c.moveTo(28.5926f, 22.9356f);
        this.f30626c.cubicTo(28.3115f, 22.6544f, 28.3115f, 22.1985f, 28.5926f, 21.9173f);
        this.f30626c.lineTo(30.0493f, 20.4607f);
        this.f30626c.cubicTo(30.3305f, 20.1795f, 30.7863f, 20.1795f, 31.0675f, 20.4607f);
        this.f30626c.lineTo(34.2919f, 23.6851f);
        this.f30626c.cubicTo(34.5731f, 23.9663f, 34.5731f, 24.4221f, 34.2919f, 24.7033f);
        this.f30626c.lineTo(32.8353f, 26.16f);
        this.f30626c.cubicTo(32.5541f, 26.4411f, 32.0982f, 26.4411f, 31.8171f, 26.16f);
        this.f30626c.lineTo(28.5926f, 22.9356f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.clipPath(this.f31582e);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
