package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class mp extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31722d;

    /* renamed from: e  reason: collision with root package name */
    Path f31723e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31724f;

    /* renamed from: g  reason: collision with root package name */
    Path f31725g;

    static {
        Covode.recordClassIndex(18476);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.1166f, 16.0636f);
        this.f30626c.cubicTo(23.2166f, 16.0636f, 22.3766f, 16.6457f, 21.8279f, 17.9205f);
        this.f30626c.cubicTo(21.7187f, 18.1742f, 21.4381f, 18.3175f, 21.1761f, 18.2301f);
        this.f30626c.lineTo(18.3301f, 17.2814f);
        this.f30626c.cubicTo(18.0681f, 17.1941f, 17.9252f, 16.9104f, 18.0266f, 16.6536f);
        this.f30626c.cubicTo(18.9286f, 14.3688f, 20.8926f, 12.0636f, 24.1166f, 12.0636f);
        this.f30626c.cubicTo(27.4457f, 12.0636f, 30.1444f, 14.7624f, 30.1444f, 18.0914f);
        this.f30626c.cubicTo(30.1444f, 20.0312f, 28.9614f, 21.6328f, 27.7375f, 22.6472f);
        this.f30626c.cubicTo(26.6166f, 23.5763f, 25.1288f, 24.2993f, 23.609f, 24.4328f);
        this.f30626c.cubicTo(23.3339f, 24.4569f, 23.1096f, 24.2311f, 23.1096f, 23.9549f);
        this.f30626c.lineTo(23.1096f, 20.9549f);
        this.f30626c.cubicTo(23.1096f, 20.6788f, 23.3356f, 20.4543f, 23.604f, 20.3894f);
        this.f30626c.cubicTo(24.0859f, 20.2728f, 24.663f, 20.0001f, 25.1849f, 19.5676f);
        this.f30626c.cubicTo(25.9223f, 18.9564f, 26.1444f, 18.3761f, 26.1444f, 18.0914f);
        this.f30626c.cubicTo(26.1444f, 16.9715f, 25.2365f, 16.0636f, 24.1166f, 16.0636f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31722d = new Paint();
        Path path = new Path();
        this.f31723e = path;
        path.moveTo(26.0f, 28.0636f);
        this.f31723e.cubicTo(26.0f, 29.1682f, 25.1046f, 30.0636f, 24.0f, 30.0636f);
        this.f31723e.cubicTo(22.8954f, 30.0636f, 22.0f, 29.1682f, 22.0f, 28.0636f);
        this.f31723e.cubicTo(22.0f, 26.959f, 22.8954f, 26.0636f, 24.0f, 26.0636f);
        this.f31723e.cubicTo(25.1046f, 26.0636f, 26.0f, 26.959f, 26.0f, 28.0636f);
        this.f31723e.close();
        this.f31723e.setFillType(Path.FillType.WINDING);
        this.f31722d.setStyle(Paint.Style.FILL);
        this.f31722d.setColor(-16777216);
        this.f30624a.add(this.f31722d);
        this.f31724f = new Paint();
        Path path2 = new Path();
        this.f31725g = path2;
        path2.moveTo(8.25f, 5.0f);
        this.f31725g.cubicTo(5.90279f, 5.0f, 4.0f, 6.90279f, 4.0f, 9.25f);
        this.f31725g.lineTo(4.0f, 43.0f);
        this.f31725g.cubicTo(4.0f, 43.8089f, 4.48728f, 44.5382f, 5.23463f, 44.8478f);
        this.f31725g.cubicTo(5.98198f, 45.1573f, 6.84222f, 44.9862f, 7.41421f, 44.4142f);
        this.f31725g.lineTo(14.7034f, 37.125f);
        this.f31725g.lineTo(39.75f, 37.125f);
        this.f31725g.cubicTo(42.0973f, 37.125f, 44.0f, 35.2222f, 44.0f, 32.875f);
        this.f31725g.lineTo(44.0f, 9.25f);
        this.f31725g.cubicTo(44.0f, 6.90281f, 42.0973f, 5.0f, 39.75f, 5.0f);
        this.f31725g.lineTo(8.25f, 5.0f);
        this.f31725g.close();
        this.f31725g.moveTo(12.4608f, 33.7108f);
        this.f31725g.lineTo(8.0f, 38.1716f);
        this.f31725g.lineTo(8.0f, 9.25f);
        this.f31725g.cubicTo(8.0f, 9.11193f, 8.11193f, 9.0f, 8.25f, 9.0f);
        this.f31725g.lineTo(39.75f, 9.0f);
        this.f31725g.cubicTo(39.8881f, 9.0f, 40.0f, 9.11191f, 40.0f, 9.25f);
        this.f31725g.lineTo(40.0f, 32.875f);
        this.f31725g.cubicTo(40.0f, 33.0131f, 39.8881f, 33.125f, 39.75f, 33.125f);
        this.f31725g.lineTo(13.875f, 33.125f);
        this.f31725g.cubicTo(13.3446f, 33.125f, 12.8359f, 33.3357f, 12.4608f, 33.7108f);
        this.f31725g.close();
        this.f31725g.setFillType(Path.FillType.EVEN_ODD);
        this.f31724f.setStyle(Paint.Style.FILL);
        this.f31724f.setColor(-16777216);
        this.f30624a.add(this.f31724f);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31723e, this.f31722d);
        canvas.drawPath(this.f31725g, this.f31724f);
    }
}
