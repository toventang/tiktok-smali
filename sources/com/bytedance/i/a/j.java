package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class j extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31631d;

    /* renamed from: e  reason: collision with root package name */
    Path f31632e;

    static {
        Covode.recordClassIndex(18379);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(33.4021f, 15.9315f);
        this.f30626c.cubicTo(33.5851f, 15.549f, 33.5069f, 15.0927f, 33.2071f, 14.7929f);
        this.f30626c.cubicTo(32.9073f, 14.4931f, 32.451f, 14.4149f, 32.0685f, 14.5979f);
        this.f30626c.lineTo(20.5685f, 20.0979f);
        this.f30626c.cubicTo(20.3625f, 20.1964f, 20.1964f, 20.3625f, 20.0979f, 20.5685f);
        this.f30626c.lineTo(14.5979f, 32.0685f);
        this.f30626c.cubicTo(14.4149f, 32.451f, 14.4931f, 32.9073f, 14.7929f, 33.2071f);
        this.f30626c.cubicTo(15.0927f, 33.5069f, 15.549f, 33.5851f, 15.9315f, 33.4021f);
        this.f30626c.lineTo(27.4315f, 27.9021f);
        this.f30626c.cubicTo(27.6375f, 27.8036f, 27.8036f, 27.6375f, 27.9021f, 27.4315f);
        this.f30626c.lineTo(33.4021f, 15.9315f);
        this.f30626c.close();
        this.f30626c.moveTo(17.6246f, 30.3754f);
        this.f30626c.lineTo(21.2923f, 22.7065f);
        this.f30626c.lineTo(25.2935f, 26.7077f);
        this.f30626c.lineTo(17.6246f, 30.3754f);
        this.f30626c.close();
        this.f30626c.moveTo(22.7065f, 21.2923f);
        this.f30626c.lineTo(30.3754f, 17.6246f);
        this.f30626c.lineTo(26.7077f, 25.2935f);
        this.f30626c.lineTo(22.7065f, 21.2923f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31631d = new Paint();
        Path path = new Path();
        this.f31632e = path;
        path.moveTo(24.0f, 6.0f);
        this.f31632e.cubicTo(19.0409f, 6.0f, 14.5486f, 8.00674f, 11.2941f, 11.2501f);
        this.f31632e.cubicTo(8.02491f, 14.5081f, 6.0f, 19.0185f, 6.0f, 24.0f);
        this.f31632e.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f31632e.cubicTo(28.9815f, 42.0f, 33.4919f, 39.9751f, 36.7499f, 36.7059f);
        this.f31632e.cubicTo(39.9933f, 33.4514f, 42.0f, 28.9591f, 42.0f, 24.0f);
        this.f31632e.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f31632e.close();
        this.f31632e.moveTo(12.7059f, 12.6667f);
        this.f31632e.cubicTo(15.6008f, 9.78171f, 19.5914f, 8.0f, 24.0f, 8.0f);
        this.f31632e.cubicTo(32.8366f, 8.0f, 40.0f, 15.1634f, 40.0f, 24.0f);
        this.f31632e.cubicTo(40.0f, 28.4086f, 38.2183f, 32.3992f, 35.3333f, 35.2941f);
        this.f31632e.cubicTo(32.4352f, 38.2022f, 28.4285f, 40.0f, 24.0f, 40.0f);
        this.f31632e.cubicTo(15.1634f, 40.0f, 8.0f, 32.8366f, 8.0f, 24.0f);
        this.f31632e.cubicTo(8.0f, 19.5715f, 9.79784f, 15.5648f, 12.7059f, 12.6667f);
        this.f31632e.close();
        this.f31632e.setFillType(Path.FillType.EVEN_ODD);
        this.f31631d.setStyle(Paint.Style.FILL);
        this.f31631d.setColor(-16777216);
        this.f30624a.add(this.f31631d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31632e, this.f31631d);
    }
}
