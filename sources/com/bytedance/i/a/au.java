package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class au extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31293d;

    /* renamed from: e  reason: collision with root package name */
    Path f31294e;

    static {
        Covode.recordClassIndex(18157);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(21.1464f, 19.2678f);
        this.f30626c.lineTo(25.8786f, 24.0f);
        this.f30626c.lineTo(21.1464f, 28.7322f);
        this.f30626c.cubicTo(20.7559f, 29.1227f, 20.7559f, 29.7559f, 21.1464f, 30.1464f);
        this.f30626c.lineTo(21.8535f, 30.8535f);
        this.f30626c.cubicTo(22.244f, 31.2441f, 22.8772f, 31.2441f, 23.2677f, 30.8535f);
        this.f30626c.lineTo(28.0f, 26.1213f);
        this.f30626c.lineTo(32.7322f, 30.8535f);
        this.f30626c.cubicTo(33.1227f, 31.2441f, 33.7559f, 31.2441f, 34.1464f, 30.8535f);
        this.f30626c.lineTo(34.8535f, 30.1464f);
        this.f30626c.cubicTo(35.244f, 29.7559f, 35.244f, 29.1228f, 34.8535f, 28.7322f);
        this.f30626c.lineTo(30.1213f, 24.0f);
        this.f30626c.lineTo(34.8535f, 19.2678f);
        this.f30626c.cubicTo(35.244f, 18.8772f, 35.244f, 18.2441f, 34.8535f, 17.8535f);
        this.f30626c.lineTo(34.1464f, 17.1464f);
        this.f30626c.cubicTo(33.7559f, 16.7559f, 33.1227f, 16.7559f, 32.7322f, 17.1464f);
        this.f30626c.lineTo(28.0f, 21.8787f);
        this.f30626c.lineTo(23.2677f, 17.1464f);
        this.f30626c.cubicTo(22.8772f, 16.7559f, 22.244f, 16.7559f, 21.8535f, 17.1464f);
        this.f30626c.lineTo(21.1464f, 17.8535f);
        this.f30626c.cubicTo(20.7559f, 18.2441f, 20.7559f, 18.8772f, 21.1464f, 19.2678f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31293d = new Paint();
        Path path = new Path();
        this.f31294e = path;
        path.moveTo(19.5818f, 7.5f);
        this.f31294e.cubicTo(18.1845f, 7.5f, 16.8395f, 8.03185f, 15.8201f, 8.98755f);
        this.f31294e.lineTo(3.30862f, 20.7171f);
        this.f31294e.cubicTo(1.41226f, 22.4949f, 1.41227f, 25.5051f, 3.30862f, 27.2829f);
        this.f31294e.lineTo(15.8201f, 39.0125f);
        this.f31294e.cubicTo(16.8395f, 39.9681f, 18.1845f, 40.5f, 19.5818f, 40.5f);
        this.f31294e.lineTo(39.0f, 40.5f);
        this.f31294e.cubicTo(42.0376f, 40.5f, 44.5f, 38.0376f, 44.5f, 35.0f);
        this.f31294e.lineTo(44.5f, 13.0f);
        this.f31294e.cubicTo(44.5f, 9.96243f, 42.0376f, 7.5f, 39.0f, 7.5f);
        this.f31294e.lineTo(19.5818f, 7.5f);
        this.f31294e.close();
        this.f31294e.moveTo(17.8719f, 11.1762f);
        this.f31294e.cubicTo(18.3353f, 10.7418f, 18.9466f, 10.5f, 19.5818f, 10.5f);
        this.f31294e.lineTo(39.0f, 10.5f);
        this.f31294e.cubicTo(40.3807f, 10.5f, 41.5f, 11.6193f, 41.5f, 13.0f);
        this.f31294e.lineTo(41.5f, 35.0f);
        this.f31294e.cubicTo(41.5f, 36.3807f, 40.3807f, 37.5f, 39.0f, 37.5f);
        this.f31294e.lineTo(19.5818f, 37.5f);
        this.f31294e.cubicTo(18.9466f, 37.5f, 18.3353f, 37.2582f, 17.8719f, 36.8238f);
        this.f31294e.lineTo(5.36044f, 25.0943f);
        this.f31294e.cubicTo(4.72832f, 24.5017f, 4.72832f, 23.4983f, 5.36044f, 22.9057f);
        this.f31294e.lineTo(17.8719f, 11.1762f);
        this.f31294e.close();
        this.f31294e.setFillType(Path.FillType.EVEN_ODD);
        this.f31293d.setStyle(Paint.Style.FILL);
        this.f31293d.setColor(-16777216);
        this.f30624a.add(this.f31293d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31294e, this.f31293d);
    }
}
