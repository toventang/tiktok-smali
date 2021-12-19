package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ih extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31615d;

    /* renamed from: e  reason: collision with root package name */
    Path f31616e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31617f;

    /* renamed from: g  reason: collision with root package name */
    Path f31618g;

    static {
        Covode.recordClassIndex(18360);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(14.2739f, 34.5051f);
        this.f30626c.cubicTo(17.7239f, 34.5051f, 20.5439f, 33.0351f, 22.4939f, 30.8451f);
        this.f30626c.lineTo(22.4939f, 24.3751f);
        this.f30626c.cubicTo(22.4939f, 23.8229f, 22.0462f, 23.3751f, 21.4939f, 23.3751f);
        this.f30626c.lineTo(14.0139f, 23.3751f);
        this.f30626c.cubicTo(13.4616f, 23.3751f, 13.0139f, 23.8229f, 13.0139f, 24.3751f);
        this.f30626c.lineTo(13.0139f, 25.4651f);
        this.f30626c.cubicTo(13.0139f, 26.0174f, 13.4616f, 26.4651f, 14.0139f, 26.4651f);
        this.f30626c.lineTo(19.0139f, 26.4651f);
        this.f30626c.lineTo(19.0139f, 29.5551f);
        this.f30626c.cubicTo(18.1139f, 30.4251f, 16.3139f, 31.3551f, 14.2739f, 31.3551f);
        this.f30626c.cubicTo(10.3139f, 31.3551f, 7.37393f, 28.2951f, 7.37393f, 24.1251f);
        this.f30626c.cubicTo(7.37393f, 19.8951f, 10.3139f, 16.8951f, 14.2739f, 16.8951f);
        this.f30626c.cubicTo(16.1375f, 16.8951f, 17.7686f, 17.7196f, 18.8831f, 18.8717f);
        this.f30626c.cubicTo(19.2404f, 19.241f, 19.8027f, 19.369f, 20.2475f, 19.1115f);
        this.f30626c.lineTo(21.3724f, 18.4602f);
        this.f30626c.cubicTo(21.8791f, 18.1669f, 22.0299f, 17.4993f, 21.6484f, 17.0552f);
        this.f30626c.cubicTo(20.0422f, 15.1854f, 17.6698f, 13.7751f, 14.2739f, 13.7751f);
        this.f30626c.cubicTo(8.45393f, 13.7751f, 3.77393f, 17.8251f, 3.77393f, 24.1251f);
        this.f30626c.cubicTo(3.77393f, 30.3951f, 8.45393f, 34.5051f, 14.2739f, 34.5051f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31615d = new Paint();
        Path path = new Path();
        this.f31616e = path;
        path.moveTo(28.0578f, 34.1151f);
        this.f31616e.cubicTo(28.6101f, 34.1151f, 29.0578f, 33.6674f, 29.0578f, 33.1151f);
        this.f31616e.lineTo(29.0578f, 15.1051f);
        this.f31616e.cubicTo(29.0578f, 14.5529f, 28.6101f, 14.1051f, 28.0578f, 14.1051f);
        this.f31616e.lineTo(26.5478f, 14.1051f);
        this.f31616e.cubicTo(25.9955f, 14.1051f, 25.5478f, 14.5529f, 25.5478f, 15.1051f);
        this.f31616e.lineTo(25.5478f, 33.1151f);
        this.f31616e.cubicTo(25.5478f, 33.6674f, 25.9955f, 34.1151f, 26.5478f, 34.1151f);
        this.f31616e.lineTo(28.0578f, 34.1151f);
        this.f31616e.close();
        this.f31616e.setFillType(Path.FillType.WINDING);
        this.f31615d.setStyle(Paint.Style.FILL);
        this.f31615d.setColor(-16777216);
        this.f30624a.add(this.f31615d);
        this.f31617f = new Paint();
        Path path2 = new Path();
        this.f31618g = path2;
        path2.moveTo(35.2215f, 34.1151f);
        this.f31618g.cubicTo(35.7738f, 34.1151f, 36.2215f, 33.6674f, 36.2215f, 33.1151f);
        this.f31618g.lineTo(36.2215f, 25.4451f);
        this.f31618g.lineTo(45.2115f, 25.4451f);
        this.f31618g.cubicTo(45.7638f, 25.4451f, 46.2115f, 24.9974f, 46.2115f, 24.4451f);
        this.f31618g.lineTo(46.2115f, 23.3551f);
        this.f31618g.cubicTo(46.2115f, 22.8029f, 45.7638f, 22.3551f, 45.2115f, 22.3551f);
        this.f31618g.lineTo(36.2215f, 22.3551f);
        this.f31618g.lineTo(36.2215f, 17.1951f);
        this.f31618g.lineTo(45.4215f, 17.1951f);
        this.f31618g.cubicTo(45.9738f, 17.1951f, 46.4215f, 16.7474f, 46.4215f, 16.1951f);
        this.f31618g.lineTo(46.4215f, 15.1051f);
        this.f31618g.cubicTo(46.4215f, 14.5529f, 45.9738f, 14.1051f, 45.4215f, 14.1051f);
        this.f31618g.lineTo(33.7115f, 14.1051f);
        this.f31618g.cubicTo(33.1592f, 14.1051f, 32.7115f, 14.5529f, 32.7115f, 15.1051f);
        this.f31618g.lineTo(32.7115f, 33.1151f);
        this.f31618g.cubicTo(32.7115f, 33.6674f, 33.1592f, 34.1151f, 33.7115f, 34.1151f);
        this.f31618g.lineTo(35.2215f, 34.1151f);
        this.f31618g.close();
        this.f31618g.setFillType(Path.FillType.WINDING);
        this.f31617f.setStyle(Paint.Style.FILL);
        this.f31617f.setColor(-16777216);
        this.f30624a.add(this.f31617f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31616e, this.f31615d);
        canvas.drawPath(this.f31618g, this.f31617f);
    }
}
