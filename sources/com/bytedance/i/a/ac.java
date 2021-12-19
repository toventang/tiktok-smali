package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ac extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31273d;

    /* renamed from: e  reason: collision with root package name */
    Path f31274e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31275f;

    /* renamed from: g  reason: collision with root package name */
    Path f31276g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31277h;

    /* renamed from: i  reason: collision with root package name */
    Path f31278i;

    static {
        Covode.recordClassIndex(18139);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(19.9524f, 7.0f);
        this.f30626c.cubicTo(15.8234f, 7.0f, 12.4762f, 10.3472f, 12.4762f, 14.4762f);
        this.f30626c.cubicTo(12.4762f, 18.6052f, 15.8234f, 21.9524f, 19.9524f, 21.9524f);
        this.f30626c.cubicTo(24.0814f, 21.9524f, 27.4286f, 18.6052f, 27.4286f, 14.4762f);
        this.f30626c.cubicTo(27.4286f, 10.3472f, 24.0814f, 7.0f, 19.9524f, 7.0f);
        this.f30626c.close();
        this.f30626c.moveTo(14.4762f, 14.4762f);
        this.f30626c.cubicTo(14.4762f, 11.4518f, 16.928f, 9.0f, 19.9524f, 9.0f);
        this.f30626c.cubicTo(22.9768f, 9.0f, 25.4286f, 11.4518f, 25.4286f, 14.4762f);
        this.f30626c.cubicTo(25.4286f, 17.5006f, 22.9768f, 19.9524f, 19.9524f, 19.9524f);
        this.f30626c.cubicTo(16.928f, 19.9524f, 14.4762f, 17.5006f, 14.4762f, 14.4762f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31273d = new Paint();
        Path path = new Path();
        this.f31274e = path;
        path.moveTo(8.09228f, 36.2808f);
        this.f31274e.cubicTo(9.31466f, 31.4884f, 12.2479f, 28.5746f, 15.6113f, 27.259f);
        this.f31274e.cubicTo(18.9605f, 25.949f, 22.7857f, 26.2035f, 25.89f, 27.8558f);
        this.f31274e.cubicTo(26.1338f, 27.9855f, 26.4398f, 27.9071f, 26.5798f, 27.6691f);
        this.f31274e.lineTo(27.0868f, 26.8071f);
        this.f31274e.cubicTo(27.2269f, 26.5691f, 27.1478f, 26.2618f, 26.9048f, 26.1306f);
        this.f31274e.cubicTo(23.2747f, 24.1695f, 18.8058f, 23.862f, 14.8828f, 25.3964f);
        this.f31274e.cubicTo(10.8873f, 26.9593f, 7.50854f, 30.4121f, 6.14042f, 35.8414f);
        this.f31274e.cubicTo(6.07295f, 36.1092f, 6.24279f, 36.3772f, 6.5122f, 36.4379f);
        this.f31274e.lineTo(7.4878f, 36.6574f);
        this.f31274e.cubicTo(7.75721f, 36.718f, 8.02403f, 36.5484f, 8.09228f, 36.2808f);
        this.f31274e.close();
        this.f31274e.setFillType(Path.FillType.WINDING);
        this.f31273d.setStyle(Paint.Style.FILL);
        this.f31273d.setColor(-16777216);
        this.f30624a.add(this.f31273d);
        this.f31275f = new Paint();
        Path path2 = new Path();
        this.f31276g = path2;
        path2.moveTo(36.1667f, 34.3023f);
        this.f31276g.cubicTo(36.1667f, 34.9221f, 35.8315f, 35.4632f, 35.3333f, 35.7527f);
        this.f31276g.lineTo(35.3333f, 37.6512f);
        this.f31276g.cubicTo(35.3333f, 37.8824f, 35.1468f, 38.0698f, 34.9167f, 38.0698f);
        this.f31276g.lineTo(34.0833f, 38.0698f);
        this.f31276g.cubicTo(33.8532f, 38.0698f, 33.6667f, 37.8824f, 33.6667f, 37.6512f);
        this.f31276g.lineTo(33.6667f, 35.7527f);
        this.f31276g.cubicTo(33.1685f, 35.4632f, 32.8333f, 34.9221f, 32.8333f, 34.3023f);
        this.f31276g.cubicTo(32.8333f, 33.3776f, 33.5795f, 32.6279f, 34.5f, 32.6279f);
        this.f31276g.cubicTo(35.4205f, 32.6279f, 36.1667f, 33.3776f, 36.1667f, 34.3023f);
        this.f31276g.close();
        this.f31276g.setFillType(Path.FillType.WINDING);
        this.f31275f.setStyle(Paint.Style.FILL);
        this.f31275f.setColor(-16777216);
        this.f30624a.add(this.f31275f);
        this.f31277h = new Paint();
        Path path3 = new Path();
        this.f31278i = path3;
        path3.moveTo(39.0833f, 27.6047f);
        this.f31278i.lineTo(39.0833f, 29.2791f);
        this.f31278i.lineTo(39.5f, 29.2791f);
        this.f31278i.cubicTo(40.8807f, 29.2791f, 42.0f, 30.4036f, 42.0f, 31.7907f);
        this.f31278i.lineTo(42.0f, 38.4884f);
        this.f31278i.cubicTo(42.0f, 39.8755f, 40.8807f, 41.0f, 39.5f, 41.0f);
        this.f31278i.lineTo(29.5f, 41.0f);
        this.f31278i.cubicTo(28.1193f, 41.0f, 27.0f, 39.8755f, 27.0f, 38.4884f);
        this.f31278i.lineTo(27.0f, 31.7907f);
        this.f31278i.cubicTo(27.0f, 30.4036f, 28.1193f, 29.2791f, 29.5f, 29.2791f);
        this.f31278i.lineTo(29.9167f, 29.2791f);
        this.f31278i.lineTo(29.9167f, 27.6047f);
        this.f31278i.cubicTo(29.9167f, 25.0616f, 31.9687f, 23.0f, 34.5f, 23.0f);
        this.f31278i.cubicTo(37.0313f, 23.0f, 39.0833f, 25.0616f, 39.0833f, 27.6047f);
        this.f31278i.close();
        this.f31278i.moveTo(31.5833f, 27.6047f);
        this.f31278i.cubicTo(31.5833f, 25.9863f, 32.8892f, 24.6744f, 34.5f, 24.6744f);
        this.f31278i.cubicTo(36.1108f, 24.6744f, 37.4167f, 25.9863f, 37.4167f, 27.6047f);
        this.f31278i.lineTo(37.4167f, 29.2791f);
        this.f31278i.lineTo(31.5833f, 29.2791f);
        this.f31278i.lineTo(31.5833f, 27.6047f);
        this.f31278i.close();
        this.f31278i.moveTo(28.6667f, 31.7907f);
        this.f31278i.cubicTo(28.6667f, 31.3283f, 29.0398f, 30.9535f, 29.5f, 30.9535f);
        this.f31278i.lineTo(39.5f, 30.9535f);
        this.f31278i.cubicTo(39.9602f, 30.9535f, 40.3333f, 31.3283f, 40.3333f, 31.7907f);
        this.f31278i.lineTo(40.3333f, 38.4884f);
        this.f31278i.cubicTo(40.3333f, 38.9507f, 39.9602f, 39.3256f, 39.5f, 39.3256f);
        this.f31278i.lineTo(29.5f, 39.3256f);
        this.f31278i.cubicTo(29.0398f, 39.3256f, 28.6667f, 38.9507f, 28.6667f, 38.4884f);
        this.f31278i.lineTo(28.6667f, 31.7907f);
        this.f31278i.close();
        this.f31278i.setFillType(Path.FillType.EVEN_ODD);
        this.f31277h.setStyle(Paint.Style.FILL);
        this.f31277h.setColor(-16777216);
        this.f30624a.add(this.f31277h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31274e, this.f31273d);
        canvas.drawPath(this.f31276g, this.f31275f);
        canvas.drawPath(this.f31278i, this.f31277h);
    }
}
