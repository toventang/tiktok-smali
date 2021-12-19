package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fs extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31463d;

    /* renamed from: e  reason: collision with root package name */
    Path f31464e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31465f;

    /* renamed from: g  reason: collision with root package name */
    Path f31466g;

    static {
        Covode.recordClassIndex(18290);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 48.0f);
        this.f30626c.cubicTo(37.2548f, 48.0f, 48.0f, 37.2548f, 48.0f, 24.0f);
        this.f30626c.cubicTo(48.0f, 10.7452f, 37.2548f, 0.0f, 24.0f, 0.0f);
        this.f30626c.cubicTo(10.7452f, 0.0f, 0.0f, 10.7452f, 0.0f, 24.0f);
        this.f30626c.cubicTo(0.0f, 37.2548f, 10.7452f, 48.0f, 24.0f, 48.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-15998821);
        this.f31463d = new Paint();
        Path path = new Path();
        this.f31464e = path;
        path.moveTo(30.9996f, 28.7908f);
        this.f31464e.lineTo(30.9996f, 26.9843f);
        this.f31464e.cubicTo(31.0148f, 26.373f, 30.5686f, 25.8473f, 29.9619f, 25.7619f);
        this.f31464e.cubicTo(29.3826f, 25.6857f, 28.8138f, 25.5443f, 28.2664f, 25.3404f);
        this.f31464e.cubicTo(27.8254f, 25.175f, 27.3283f, 25.2808f, 26.9933f, 25.6114f);
        this.f31464e.lineTo(26.2271f, 26.3761f);
        this.f31464e.cubicTo(24.7165f, 25.5189f, 23.4658f, 24.2707f, 22.6069f, 22.7632f);
        this.f31464e.lineTo(23.3732f, 21.9984f);
        this.f31464e.cubicTo(23.7045f, 21.6641f, 23.8105f, 21.168f, 23.6447f, 20.7278f);
        this.f31464e.cubicTo(23.4404f, 20.1815f, 23.2988f, 19.6139f, 23.2224f, 19.0358f);
        this.f31464e.cubicTo(23.1376f, 18.4372f, 22.6213f, 17.9941f, 22.0156f, 18.0001f);
        this.f31464e.lineTo(20.2056f, 18.0001f);
        this.f31464e.cubicTo(19.8669f, 18.0004f, 19.5439f, 18.1428f, 19.3155f, 18.3924f);
        this.f31464e.cubicTo(19.0871f, 18.6421f, 18.9744f, 18.9761f, 19.0049f, 19.3128f);
        this.f31464e.cubicTo(19.2029f, 21.174f, 19.8375f, 22.9626f, 20.8572f, 24.5335f);
        this.f31464e.cubicTo(21.7836f, 25.9884f, 23.0195f, 27.222f, 24.4773f, 28.1465f);
        this.f31464e.cubicTo(26.0443f, 29.1606f, 27.8277f, 29.7938f, 29.6843f, 29.9951f);
        this.f31464e.cubicTo(30.0227f, 30.0256f, 30.3583f, 29.9124f, 30.6087f, 29.6831f);
        this.f31464e.cubicTo(30.8591f, 29.4539f, 31.001f, 29.1299f, 30.9996f, 28.7908f);
        this.f31464e.close();
        this.f31464e.setFillType(Path.FillType.WINDING);
        this.f31463d.setStyle(Paint.Style.FILL);
        this.f31463d.setColor(-1);
        this.f30624a.add(this.f31463d);
        this.f31465f = new Paint();
        Path path2 = new Path();
        this.f31466g = path2;
        path2.moveTo(13.0f, 34.0f);
        this.f31466g.lineTo(13.0f, 28.0f);
        this.f31466g.lineTo(11.5f, 28.0f);
        this.f31466g.cubicTo(11.2239f, 28.0f, 11.0f, 27.7761f, 11.0f, 27.5f);
        this.f31466g.lineTo(11.0f, 26.5f);
        this.f31466g.cubicTo(11.0f, 26.2239f, 11.2239f, 26.0f, 11.5f, 26.0f);
        this.f31466g.lineTo(13.0f, 26.0f);
        this.f31466g.lineTo(13.0f, 22.0f);
        this.f31466g.lineTo(11.5f, 22.0f);
        this.f31466g.cubicTo(11.2239f, 22.0f, 11.0f, 21.7761f, 11.0f, 21.5f);
        this.f31466g.lineTo(11.0f, 20.5f);
        this.f31466g.cubicTo(11.0f, 20.2239f, 11.2239f, 20.0f, 11.5f, 20.0f);
        this.f31466g.lineTo(13.0f, 20.0f);
        this.f31466g.lineTo(13.0f, 14.0f);
        this.f31466g.cubicTo(13.0f, 12.3431f, 14.3431f, 11.0f, 16.0f, 11.0f);
        this.f31466g.lineTo(33.0f, 11.0f);
        this.f31466g.cubicTo(34.6569f, 11.0f, 36.0f, 12.3431f, 36.0f, 14.0f);
        this.f31466g.lineTo(36.0f, 34.0f);
        this.f31466g.cubicTo(36.0f, 35.6569f, 34.6569f, 37.0f, 33.0f, 37.0f);
        this.f31466g.lineTo(16.0f, 37.0f);
        this.f31466g.cubicTo(14.3431f, 37.0f, 13.0f, 35.6569f, 13.0f, 34.0f);
        this.f31466g.close();
        this.f31466g.moveTo(16.0f, 13.0f);
        this.f31466g.lineTo(33.0f, 13.0f);
        this.f31466g.cubicTo(33.5523f, 13.0f, 34.0f, 13.4477f, 34.0f, 14.0f);
        this.f31466g.lineTo(34.0f, 34.0f);
        this.f31466g.cubicTo(34.0f, 34.5523f, 33.5523f, 35.0f, 33.0f, 35.0f);
        this.f31466g.lineTo(16.0f, 35.0f);
        this.f31466g.cubicTo(15.4477f, 35.0f, 15.0f, 34.5523f, 15.0f, 34.0f);
        this.f31466g.lineTo(15.0f, 28.0f);
        this.f31466g.lineTo(16.5f, 28.0f);
        this.f31466g.cubicTo(16.7761f, 28.0f, 17.0f, 27.7761f, 17.0f, 27.5f);
        this.f31466g.lineTo(17.0f, 26.5f);
        this.f31466g.cubicTo(17.0f, 26.2239f, 16.7761f, 26.0f, 16.5f, 26.0f);
        this.f31466g.lineTo(15.0f, 26.0f);
        this.f31466g.lineTo(15.0f, 22.0f);
        this.f31466g.lineTo(16.5f, 22.0f);
        this.f31466g.cubicTo(16.7761f, 22.0f, 17.0f, 21.7761f, 17.0f, 21.5f);
        this.f31466g.lineTo(17.0f, 20.5f);
        this.f31466g.cubicTo(17.0f, 20.2239f, 16.7761f, 20.0f, 16.5f, 20.0f);
        this.f31466g.lineTo(15.0f, 20.0f);
        this.f31466g.lineTo(15.0f, 14.0f);
        this.f31466g.cubicTo(15.0f, 13.4477f, 15.4477f, 13.0f, 16.0f, 13.0f);
        this.f31466g.close();
        this.f31466g.setFillType(Path.FillType.EVEN_ODD);
        this.f31465f.setStyle(Paint.Style.FILL);
        this.f31465f.setColor(-1);
        this.f30624a.add(this.f31465f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31464e, this.f31463d);
        canvas.drawPath(this.f31466g, this.f31465f);
    }
}
