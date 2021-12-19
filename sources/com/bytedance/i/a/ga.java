package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ga extends a {

    /* renamed from: d  reason: collision with root package name */
    RadialGradient f31503d;

    /* renamed from: e  reason: collision with root package name */
    Matrix f31504e;

    /* renamed from: f  reason: collision with root package name */
    RadialGradient f31505f;

    /* renamed from: g  reason: collision with root package name */
    Matrix f31506g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31507h;

    /* renamed from: i  reason: collision with root package name */
    Path f31508i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31509j;

    /* renamed from: k  reason: collision with root package name */
    Path f31510k;

    static {
        Covode.recordClassIndex(18299);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31503d = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-8875, -8875, -43970, -3655765}, new float[]{0.0f, 0.1f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        this.f31504e = matrix;
        matrix.preTranslate(14.6258f, 47.0808f);
        this.f31504e.preRotate(-90.0f);
        this.f31504e.preScale(39.643f, 36.8711f);
        this.f31503d.setLocalMatrix(this.f31504e);
        this.f31505f = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-13143608, -13143608, 6684927}, new float[]{0.0f, 0.128f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix2 = new Matrix();
        this.f31506g = matrix2;
        matrix2.preTranslate(-2.69948f, 6.88153f);
        this.f31506g.preRotate(78.6806f);
        this.f31506g.preScale(17.7206f, 73.0449f);
        this.f31505f.setLocalMatrix(this.f31506g);
        this.f30626c.moveTo(24.0073f, 4.0f);
        this.f30626c.cubicTo(15.6574f, 4.0f, 13.2154f, 4.00862f, 12.7408f, 4.048f);
        this.f30626c.cubicTo(11.0272f, 4.19048f, 9.96098f, 4.46035f, 8.79935f, 5.03886f);
        this.f30626c.cubicTo(7.90414f, 5.48351f, 7.19811f, 5.99894f, 6.50132f, 6.72146f);
        this.f30626c.cubicTo(5.23233f, 8.03911f, 4.46324f, 9.66017f, 4.18483f, 11.5871f);
        this.f30626c.cubicTo(4.04948f, 12.5226f, 4.0101f, 12.7134f, 4.0021f, 17.4916f);
        this.f30626c.cubicTo(3.99902f, 19.0844f, 4.0021f, 21.1805f, 4.0021f, 23.9922f);
        this.f30626c.cubicTo(4.0021f, 32.3375f, 4.01133f, 34.7777f, 4.05132f, 35.2516f);
        this.f30626c.cubicTo(4.18976f, 36.9194f, 4.45125f, 37.9687f, 5.00499f, 39.1165f);
        this.f30626c.cubicTo(6.06325f, 41.3136f, 8.08441f, 42.963f, 10.4655f, 43.5784f);
        this.f30626c.cubicTo(11.29f, 43.7908f, 12.2006f, 43.9077f, 13.3696f, 43.9631f);
        this.f30626c.cubicTo(13.8649f, 43.9846f, 18.9131f, 44.0f, 23.9645f, 44.0f);
        this.f30626c.cubicTo(29.0159f, 44.0f, 34.0672f, 43.9938f, 34.5502f, 43.9692f);
        this.f30626c.cubicTo(35.9038f, 43.9055f, 36.6898f, 43.8f, 37.5589f, 43.5753f);
        this.f30626c.cubicTo(39.9553f, 42.9568f, 41.9396f, 41.3321f, 43.0194f, 39.1042f);
        this.f30626c.cubicTo(43.5624f, 37.9841f, 43.8377f, 36.8948f, 43.9623f, 35.314f);
        this.f30626c.cubicTo(43.9894f, 34.9694f, 44.0007f, 29.4745f, 44.0007f, 23.9869f);
        this.f30626c.cubicTo(44.0007f, 18.4985f, 43.9884f, 13.0137f, 43.9614f, 12.669f);
        this.f30626c.cubicTo(43.8352f, 11.0628f, 43.5599f, 9.98266f, 42.9994f, 8.84102f);
        this.f30626c.cubicTo(42.5395f, 7.90648f, 42.0288f, 7.20858f, 41.2874f, 6.49498f);
        this.f30626c.cubicTo(39.9643f, 5.23087f, 38.3461f, 4.46158f, 36.4179f, 4.1834f);
        this.f30626c.cubicTo(35.4836f, 4.04831f, 35.2974f, 4.00831f, 30.5168f, 4.0f);
        this.f30626c.lineTo(24.0073f, 4.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setShader(this.f31503d);
        this.f31507h = new Paint();
        Path path = new Path();
        this.f31508i = path;
        path.moveTo(24.0073f, 4.0f);
        this.f31508i.cubicTo(15.6574f, 4.0f, 13.2154f, 4.00862f, 12.7408f, 4.048f);
        this.f31508i.cubicTo(11.0272f, 4.19048f, 9.96098f, 4.46035f, 8.79935f, 5.03886f);
        this.f31508i.cubicTo(7.90414f, 5.48351f, 7.19811f, 5.99894f, 6.50132f, 6.72146f);
        this.f31508i.cubicTo(5.23233f, 8.03911f, 4.46324f, 9.66017f, 4.18483f, 11.5871f);
        this.f31508i.cubicTo(4.04948f, 12.5226f, 4.0101f, 12.7134f, 4.0021f, 17.4916f);
        this.f31508i.cubicTo(3.99902f, 19.0844f, 4.0021f, 21.1805f, 4.0021f, 23.9922f);
        this.f31508i.cubicTo(4.0021f, 32.3375f, 4.01133f, 34.7777f, 4.05132f, 35.2516f);
        this.f31508i.cubicTo(4.18976f, 36.9194f, 4.45125f, 37.9687f, 5.00499f, 39.1165f);
        this.f31508i.cubicTo(6.06325f, 41.3136f, 8.08441f, 42.963f, 10.4655f, 43.5784f);
        this.f31508i.cubicTo(11.29f, 43.7908f, 12.2006f, 43.9077f, 13.3696f, 43.9631f);
        this.f31508i.cubicTo(13.8649f, 43.9846f, 18.9131f, 44.0f, 23.9645f, 44.0f);
        this.f31508i.cubicTo(29.0159f, 44.0f, 34.0672f, 43.9938f, 34.5502f, 43.9692f);
        this.f31508i.cubicTo(35.9038f, 43.9055f, 36.6898f, 43.8f, 37.5589f, 43.5753f);
        this.f31508i.cubicTo(39.9553f, 42.9568f, 41.9396f, 41.3321f, 43.0194f, 39.1042f);
        this.f31508i.cubicTo(43.5624f, 37.9841f, 43.8377f, 36.8948f, 43.9623f, 35.314f);
        this.f31508i.cubicTo(43.9894f, 34.9694f, 44.0007f, 29.4745f, 44.0007f, 23.9869f);
        this.f31508i.cubicTo(44.0007f, 18.4985f, 43.9884f, 13.0137f, 43.9614f, 12.669f);
        this.f31508i.cubicTo(43.8352f, 11.0628f, 43.5599f, 9.98266f, 42.9994f, 8.84102f);
        this.f31508i.cubicTo(42.5395f, 7.90648f, 42.0288f, 7.20858f, 41.2874f, 6.49498f);
        this.f31508i.cubicTo(39.9643f, 5.23087f, 38.3461f, 4.46158f, 36.4179f, 4.1834f);
        this.f31508i.cubicTo(35.4836f, 4.04831f, 35.2974f, 4.00831f, 30.5168f, 4.0f);
        this.f31508i.lineTo(24.0073f, 4.0f);
        this.f31508i.close();
        this.f31508i.setFillType(Path.FillType.WINDING);
        this.f31507h.setStyle(Paint.Style.FILL);
        this.f31507h.setShader(this.f31505f);
        this.f30624a.add(this.f31507h);
        this.f31509j = new Paint();
        Path path2 = new Path();
        this.f31510k = path2;
        path2.moveTo(23.9984f, 9.2312f);
        this.f31510k.cubicTo(19.9881f, 9.2312f, 19.4848f, 9.24874f, 17.9097f, 9.32044f);
        this.f31510k.cubicTo(16.3377f, 9.39245f, 15.2647f, 9.64139f, 14.3258f, 10.0067f);
        this.f31510k.cubicTo(13.3546f, 10.3839f, 12.5307f, 10.8886f, 11.7099f, 11.7099f);
        this.f31510k.cubicTo(10.8886f, 12.5309f, 10.384f, 13.3549f, 10.0056f, 14.3261f);
        this.f31510k.cubicTo(9.63956f, 15.2656f, 9.39038f, 16.3392f, 9.31962f, 17.911f);
        this.f31510k.cubicTo(9.24917f, 19.4865f, 9.23071f, 19.9903f, 9.23071f, 24.0017f);
        this.f31510k.cubicTo(9.23071f, 28.0131f, 9.24856f, 28.515f, 9.31993f, 30.0905f);
        this.f31510k.cubicTo(9.39222f, 31.6629f, 9.6411f, 32.7363f, 10.006f, 33.6754f);
        this.f31510k.cubicTo(10.3834f, 34.6469f, 10.8879f, 35.471f, 11.709f, 36.292f);
        this.f31510k.cubicTo(12.5295f, 37.1136f, 13.3533f, 37.6195f, 14.3239f, 37.9967f);
        this.f31510k.cubicTo(15.2634f, 38.362f, 16.3368f, 38.6109f, 17.9085f, 38.6829f);
        this.f31510k.cubicTo(19.4836f, 38.7546f, 19.9865f, 38.7722f, 23.9966f, 38.7722f);
        this.f31510k.cubicTo(28.0072f, 38.7722f, 28.5089f, 38.7546f, 30.084f, 38.6829f);
        this.f31510k.cubicTo(31.656f, 38.6109f, 32.7303f, 38.362f, 33.6698f, 37.9967f);
        this.f31510k.cubicTo(34.6407f, 37.6195f, 35.4633f, 37.1136f, 36.2838f, 36.292f);
        this.f31510k.cubicTo(37.1052f, 35.471f, 37.6097f, 34.6469f, 37.9881f, 33.6757f);
        this.f31510k.cubicTo(38.3511f, 32.7363f, 38.6003f, 31.6626f, 38.6741f, 30.0908f);
        this.f31510k.cubicTo(38.7449f, 28.5153f, 38.7633f, 28.0131f, 38.7633f, 24.0017f);
        this.f31510k.cubicTo(38.7633f, 19.9903f, 38.7449f, 19.4868f, 38.6741f, 17.9113f);
        this.f31510k.cubicTo(38.6003f, 16.3389f, 38.3511f, 15.2656f, 37.9881f, 14.3264f);
        this.f31510k.cubicTo(37.6097f, 13.3549f, 37.1052f, 12.5309f, 36.2838f, 11.7099f);
        this.f31510k.cubicTo(35.4624f, 10.8883f, 34.641f, 10.3836f, 33.6689f, 10.0067f);
        this.f31510k.cubicTo(32.7275f, 9.64139f, 31.6539f, 9.39245f, 30.0819f, 9.32044f);
        this.f31510k.cubicTo(28.5068f, 9.24874f, 28.0053f, 9.2312f, 23.9938f, 9.2312f);
        this.f31510k.lineTo(23.9984f, 9.2312f);
        this.f31510k.close();
        this.f31510k.moveTo(22.6737f, 11.893f);
        this.f31510k.cubicTo(23.0669f, 11.8923f, 23.5056f, 11.893f, 23.9984f, 11.893f);
        this.f31510k.cubicTo(27.941f, 11.893f, 28.4083f, 11.9071f, 29.9653f, 11.9779f);
        this.f31510k.cubicTo(31.405f, 12.0437f, 32.1864f, 12.2844f, 32.7069f, 12.4866f);
        this.f31510k.cubicTo(33.396f, 12.7543f, 33.8873f, 13.0743f, 34.4038f, 13.5913f);
        this.f31510k.cubicTo(34.9207f, 14.1082f, 35.2406f, 14.6006f, 35.5088f, 15.2899f);
        this.f31510k.cubicTo(35.711f, 15.8099f, 35.9518f, 16.5915f, 36.0174f, 18.0316f);
        this.f31510k.cubicTo(36.0881f, 19.5887f, 36.1035f, 20.0564f, 36.1035f, 23.9983f);
        this.f31510k.cubicTo(36.1035f, 27.9402f, 36.0881f, 28.4079f, 36.0174f, 29.965f);
        this.f31510k.cubicTo(35.9515f, 31.4051f, 35.711f, 32.1867f, 35.5088f, 32.7067f);
        this.f31510k.cubicTo(35.2412f, 33.396f, 34.9207f, 33.8868f, 34.4038f, 34.4035f);
        this.f31510k.cubicTo(33.887f, 34.9205f, 33.3963f, 35.2405f, 32.7069f, 35.5082f);
        this.f31510k.cubicTo(32.187f, 35.7113f, 31.405f, 35.9513f, 29.9653f, 36.0172f);
        this.f31510k.cubicTo(28.4086f, 36.0879f, 27.941f, 36.1033f, 23.9984f, 36.1033f);
        this.f31510k.cubicTo(20.0554f, 36.1033f, 19.5882f, 36.0879f, 18.0315f, 36.0172f);
        this.f31510k.cubicTo(16.5918f, 35.9507f, 15.8104f, 35.7101f, 15.2896f, 35.5079f);
        this.f31510k.cubicTo(14.6005f, 35.2402f, 14.1083f, 34.9201f, 13.5914f, 34.4032f);
        this.f31510k.cubicTo(13.0746f, 33.8862f, 12.7547f, 33.3951f, 12.4864f, 32.7055f);
        this.f31510k.cubicTo(12.2843f, 32.1855f, 12.0434f, 31.4038f, 11.9779f, 29.9637f);
        this.f31510k.cubicTo(11.9071f, 28.4067f, 11.893f, 27.9389f, 11.893f, 23.9946f);
        this.f31510k.cubicTo(11.893f, 20.0503f, 11.9071f, 19.585f, 11.9779f, 18.0279f);
        this.f31510k.cubicTo(12.0437f, 16.5878f, 12.2843f, 15.8062f, 12.4864f, 15.2856f);
        this.f31510k.cubicTo(12.7541f, 14.5963f, 13.0746f, 14.1039f, 13.5914f, 13.587f);
        this.f31510k.cubicTo(14.1083f, 13.07f, 14.6005f, 12.75f, 15.2896f, 12.4816f);
        this.f31510k.cubicTo(15.8101f, 12.2785f, 16.5918f, 12.0385f, 18.0315f, 11.9724f);
        this.f31510k.cubicTo(19.3937f, 11.9108f, 19.9216f, 11.8923f, 22.6737f, 11.8893f);
        this.f31510k.lineTo(22.6737f, 11.893f);
        this.f31510k.close();
        this.f31510k.moveTo(31.8806f, 14.3455f);
        this.f31510k.cubicTo(30.9023f, 14.3455f, 30.1086f, 15.1385f, 30.1086f, 16.1173f);
        this.f31510k.cubicTo(30.1086f, 17.0959f, 30.9023f, 17.8898f, 31.8806f, 17.8898f);
        this.f31510k.cubicTo(32.8589f, 17.8898f, 33.6526f, 17.0959f, 33.6526f, 16.1173f);
        this.f31510k.cubicTo(33.6526f, 15.1388f, 32.8589f, 14.3449f, 31.8806f, 14.3449f);
        this.f31510k.lineTo(31.8806f, 14.3455f);
        this.f31510k.close();
        this.f31510k.moveTo(23.9984f, 16.4164f);
        this.f31510k.cubicTo(19.8106f, 16.4164f, 16.4152f, 19.8127f, 16.4152f, 24.0017f);
        this.f31510k.cubicTo(16.4152f, 28.1907f, 19.8106f, 31.5854f, 23.9984f, 31.5854f);
        this.f31510k.cubicTo(28.1862f, 31.5854f, 31.5804f, 28.1907f, 31.5804f, 24.0017f);
        this.f31510k.cubicTo(31.5804f, 19.8127f, 28.1859f, 16.4164f, 23.9981f, 16.4164f);
        this.f31510k.lineTo(23.9984f, 16.4164f);
        this.f31510k.close();
        this.f31510k.moveTo(23.9984f, 19.0782f);
        this.f31510k.cubicTo(26.7167f, 19.0782f, 28.9205f, 21.2824f, 28.9205f, 24.0017f);
        this.f31510k.cubicTo(28.9205f, 26.7207f, 26.7167f, 28.9252f, 23.9984f, 28.9252f);
        this.f31510k.cubicTo(21.2798f, 28.9252f, 19.0762f, 26.7207f, 19.0762f, 24.0017f);
        this.f31510k.cubicTo(19.0762f, 21.2824f, 21.2798f, 19.0782f, 23.9984f, 19.0782f);
        this.f31510k.close();
        this.f31510k.setFillType(Path.FillType.WINDING);
        this.f31509j.setStyle(Paint.Style.FILL);
        this.f31509j.setColor(-1);
        this.f30624a.add(this.f31509j);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31508i, this.f31507h);
        canvas.drawPath(this.f31510k, this.f31509j);
    }
}
