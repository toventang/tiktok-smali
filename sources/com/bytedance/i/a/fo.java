package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fo extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31444d;

    /* renamed from: e  reason: collision with root package name */
    Path f31445e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31446f;

    /* renamed from: g  reason: collision with root package name */
    Path f31447g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31448h;

    /* renamed from: i  reason: collision with root package name */
    Path f31449i;

    static {
        Covode.recordClassIndex(18286);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.addCircle(13.1998f, 13.2f, 8.4f, Path.Direction.CW);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-1356982);
        this.f31444d = new Paint();
        Path path = new Path();
        this.f31445e = path;
        path.addCircle(13.1998f, 34.7999f, 8.4f, Path.Direction.CW);
        this.f31444d.setStyle(Paint.Style.FILL);
        this.f31444d.setColor(-16003121);
        this.f30624a.add(this.f31444d);
        this.f31446f = new Paint();
        Path path2 = new Path();
        this.f31447g = path2;
        path2.addCircle(34.7999f, 13.2f, 8.4f, Path.Direction.CW);
        this.f31446f.setStyle(Paint.Style.FILL);
        this.f31446f.setColor(-14275);
        this.f30624a.add(this.f31446f);
        this.f31448h = new Paint();
        Path path3 = new Path();
        this.f31449i = path3;
        path3.addCircle(34.7999f, 34.7999f, 8.4f, Path.Direction.CW);
        this.f31448h.setStyle(Paint.Style.FILL);
        this.f31448h.setColor(-16739073);
        this.f30624a.add(this.f31448h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31445e, this.f31444d);
        canvas.drawPath(this.f31447g, this.f31446f);
        canvas.drawPath(this.f31449i, this.f31448h);
    }
}
