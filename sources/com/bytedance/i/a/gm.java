package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gm extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31565d;

    /* renamed from: e  reason: collision with root package name */
    Path f31566e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31567f;

    /* renamed from: g  reason: collision with root package name */
    Path f31568g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31569h;

    /* renamed from: i  reason: collision with root package name */
    Path f31570i;

    static {
        Covode.recordClassIndex(18311);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31565d = new Paint();
        Path path = new Path();
        this.f31566e = path;
        path.addRect(0.0f, 0.0f, 48.0f, 48.0f, Path.Direction.CW);
        this.f30626c.moveTo(32.3661f, 2.73199f);
        this.f30626c.cubicTo(32.1432f, 1.85859f, 32.0246f, 0.943195f, 32.0246f, 0.0f);
        this.f30626c.lineTo(24.1709f, 0.0f);
        this.f30626c.lineTo(24.1709f, 15.4286f);
        this.f30626c.lineTo(24.1709f, 17.9707f);
        this.f30626c.lineTo(24.1709f, 31.2f);
        this.f30626c.cubicTo(24.1709f, 34.7977f, 21.2662f, 37.7143f, 17.683f, 37.7143f);
        this.f30626c.cubicTo(14.0999f, 37.7143f, 11.1952f, 34.7977f, 11.1952f, 31.2f);
        this.f30626c.cubicTo(11.1952f, 27.6023f, 14.0999f, 24.6857f, 17.683f, 24.6857f);
        this.f30626c.cubicTo(18.399f, 24.6857f, 19.0878f, 24.8021f, 19.7318f, 25.0172f);
        this.f30626c.lineTo(19.7318f, 16.5995f);
        this.f30626c.cubicTo(19.0623f, 16.5057f, 18.3783f, 16.4571f, 17.683f, 16.4571f);
        this.f30626c.cubicTo(9.57382f, 16.4571f, 3.0f, 23.0577f, 3.0f, 31.2f);
        this.f30626c.cubicTo(3.0f, 39.3423f, 9.57382f, 45.9429f, 17.683f, 45.9429f);
        this.f30626c.cubicTo(25.6781f, 45.9429f, 32.1846f, 39.5267f, 32.3661f, 31.5429f);
        this.f30626c.lineTo(32.3661f, 31.2f);
        this.f30626c.lineTo(32.3661f, 15.5786f);
        this.f30626c.cubicTo(35.3801f, 17.6473f, 39.0251f, 18.8571f, 42.9515f, 18.8571f);
        this.f30626c.lineTo(42.9515f, 10.9714f);
        this.f30626c.cubicTo(37.8561f, 10.9714f, 33.5753f, 7.46955f, 32.3661f, 2.73199f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-14289682);
        this.f31567f = new Paint();
        Path path2 = new Path();
        this.f31568g = path2;
        path2.moveTo(34.4144f, 4.78961f);
        this.f31568g.cubicTo(34.1915f, 3.91621f, 34.073f, 3.00081f, 34.073f, 2.05762f);
        this.f31568g.lineTo(26.2192f, 2.05762f);
        this.f31568g.lineTo(26.2192f, 17.4862f);
        this.f31568g.lineTo(26.2192f, 20.0284f);
        this.f31568g.lineTo(26.2192f, 33.2576f);
        this.f31568g.cubicTo(26.2192f, 36.8554f, 23.3145f, 39.7719f, 19.7314f, 39.7719f);
        this.f31568g.cubicTo(16.1482f, 39.7719f, 13.2435f, 36.8554f, 13.2435f, 33.2576f);
        this.f31568g.cubicTo(13.2435f, 29.6599f, 16.1482f, 26.7433f, 19.7314f, 26.7433f);
        this.f31568g.cubicTo(20.4473f, 26.7433f, 21.1362f, 26.8598f, 21.7802f, 27.0748f);
        this.f31568g.lineTo(21.7802f, 18.6571f);
        this.f31568g.cubicTo(21.1106f, 18.5633f, 20.4267f, 18.5148f, 19.7314f, 18.5148f);
        this.f31568g.cubicTo(11.6222f, 18.5148f, 5.04834f, 25.1154f, 5.04834f, 33.2576f);
        this.f31568g.cubicTo(5.04834f, 41.3999f, 11.6222f, 48.0005f, 19.7314f, 48.0005f);
        this.f31568g.cubicTo(27.7265f, 48.0005f, 34.233f, 41.5844f, 34.4144f, 33.6005f);
        this.f31568g.lineTo(34.4144f, 33.2576f);
        this.f31568g.lineTo(34.4144f, 17.6362f);
        this.f31568g.cubicTo(37.4284f, 19.7049f, 41.0734f, 20.9148f, 44.9999f, 20.9148f);
        this.f31568g.lineTo(44.9999f, 13.029f);
        this.f31568g.cubicTo(39.9045f, 13.029f, 35.6237f, 9.52717f, 34.4144f, 4.78961f);
        this.f31568g.close();
        this.f31568g.setFillType(Path.FillType.EVEN_ODD);
        this.f31567f.setStyle(Paint.Style.FILL);
        this.f31567f.setColor(-1);
        this.f30624a.add(this.f31567f);
        this.f31569h = new Paint();
        Path path3 = new Path();
        this.f31570i = path3;
        path3.moveTo(32.2159f, 2.05664f);
        this.f31570i.cubicTo(32.2589f, 2.28399f, 32.3089f, 2.50886f, 32.3656f, 2.73101f);
        this.f31570i.cubicTo(32.9824f, 5.14784f, 34.3987f, 7.24308f, 36.3146f, 8.71589f);
        this.f31570i.cubicTo(35.4378f, 7.56477f, 34.7828f, 6.23423f, 34.4139f, 4.78863f);
        this.f31570i.cubicTo(34.1909f, 3.91523f, 34.0724f, 2.99984f, 34.0724f, 2.05664f);
        this.f31570i.lineTo(32.2159f, 2.05664f);
        this.f31570i.close();
        this.f31570i.moveTo(42.951f, 12.8356f);
        this.f31570i.lineTo(42.951f, 18.8562f);
        this.f31570i.cubicTo(39.0246f, 18.8562f, 35.3795f, 17.6463f, 32.3656f, 15.5777f);
        this.f31570i.lineTo(32.3656f, 31.199f);
        this.f31570i.lineTo(32.3656f, 31.5419f);
        this.f31570i.cubicTo(32.1841f, 39.5258f, 25.6776f, 45.9419f, 17.6825f, 45.9419f);
        this.f31570i.cubicTo(14.1484f, 45.9419f, 10.9059f, 44.6882f, 8.37207f, 42.5996f);
        this.f31570i.cubicTo(11.0649f, 45.8962f, 15.1532f, 47.9995f, 19.7308f, 47.9995f);
        this.f31570i.cubicTo(27.7259f, 47.9995f, 34.2324f, 41.5834f, 34.4139f, 33.5995f);
        this.f31570i.lineTo(34.4139f, 33.2566f);
        this.f31570i.lineTo(34.4139f, 17.6353f);
        this.f31570i.cubicTo(37.4278f, 19.7039f, 41.0729f, 20.9138f, 44.9993f, 20.9138f);
        this.f31570i.lineTo(44.9993f, 13.0281f);
        this.f31570i.cubicTo(44.2992f, 13.0281f, 43.6145f, 12.962f, 42.951f, 12.8356f);
        this.f31570i.close();
        this.f31570i.moveTo(19.7313f, 18.5138f);
        this.f31570i.lineTo(19.7313f, 25.0162f);
        this.f31570i.cubicTo(19.0873f, 24.8012f, 18.3985f, 24.6847f, 17.6825f, 24.6847f);
        this.f31570i.cubicTo(14.0994f, 24.6847f, 11.1947f, 27.6013f, 11.1947f, 31.199f);
        this.f31570i.cubicTo(11.1947f, 33.5241f, 12.4078f, 35.5646f, 14.2332f, 36.7174f);
        this.f31570i.cubicTo(13.6058f, 35.7147f, 13.243f, 34.5282f, 13.243f, 33.2566f);
        this.f31570i.cubicTo(13.243f, 29.6589f, 16.1477f, 26.7424f, 19.7308f, 26.7424f);
        this.f31570i.cubicTo(20.4467f, 26.7424f, 21.1356f, 26.8588f, 21.7796f, 27.0738f);
        this.f31570i.lineTo(21.7796f, 18.6562f);
        this.f31570i.cubicTo(21.1102f, 18.5623f, 20.4264f, 18.5138f, 19.7313f, 18.5138f);
        this.f31570i.close();
        this.f31570i.setFillType(Path.FillType.EVEN_ODD);
        this.f31569h.setStyle(Paint.Style.FILL);
        this.f31569h.setColor(-119723);
        this.f30624a.add(this.f31569h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.clipPath(this.f31566e);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31568g, this.f31567f);
        canvas.drawPath(this.f31570i, this.f31569h);
    }
}
