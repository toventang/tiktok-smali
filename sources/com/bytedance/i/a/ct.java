package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class ct extends a {

    /* renamed from: d  reason: collision with root package name */
    LinearGradient f31369d;

    /* renamed from: e  reason: collision with root package name */
    Paint f31370e;

    /* renamed from: f  reason: collision with root package name */
    Path f31371f;

    static {
        Covode.recordClassIndex(18210);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31369d = new LinearGradient(11.7862f, 36.9843f, 33.4832f, 14.9132f, new int[]{-196252, -195484, -192924, -188572, -182428, -174748, -170908}, new float[]{0.0f, 0.2404f, 0.4335f, 0.6101f, 0.7769f, 0.9355f, 1.0f}, Shader.TileMode.CLAMP);
        this.f30626c.moveTo(0.0f, 5.0f);
        this.f30626c.cubicTo(0.0f, 2.23858f, 2.23858f, 0.0f, 5.0f, 0.0f);
        this.f30626c.lineTo(43.0f, 0.0f);
        this.f30626c.cubicTo(45.7614f, 0.0f, 48.0f, 2.23858f, 48.0f, 5.0f);
        this.f30626c.lineTo(48.0f, 43.0f);
        this.f30626c.cubicTo(48.0f, 45.7614f, 45.7614f, 48.0f, 43.0f, 48.0f);
        this.f30626c.lineTo(5.0f, 48.0f);
        this.f30626c.cubicTo(2.23858f, 48.0f, 0.0f, 45.7614f, 0.0f, 43.0f);
        this.f30626c.lineTo(0.0f, 5.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.WINDING);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777161);
        this.f31370e = new Paint();
        Path path = new Path();
        this.f31371f = path;
        path.moveTo(37.4351f, 32.8847f);
        this.f31371f.lineTo(34.3486f, 31.0305f);
        this.f31371f.lineTo(36.8492f, 29.5275f);
        this.f31371f.cubicTo(41.0503f, 26.999f, 41.0503f, 21.015f, 36.8492f, 18.4865f);
        this.f31371f.lineTo(21.0168f, 8.96266f);
        this.f31371f.cubicTo(16.63f, 6.32182f, 11.0f, 9.42622f, 11.0f, 14.4831f);
        this.f31371f.cubicTo(11.0f, 14.4831f, 11.0f, 18.936f, 11.0f, 21.7876f);
        this.f31371f.cubicTo(11.0f, 21.914f, 11.1572f, 21.9702f, 11.2429f, 21.8859f);
        this.f31371f.cubicTo(12.6004f, 20.5234f, 14.4008f, 19.6103f, 16.5156f, 19.3715f);
        this.f31371f.cubicTo(16.5871f, 19.3575f, 16.6442f, 19.3013f, 16.6442f, 19.231f);
        this.f31371f.lineTo(16.6442f, 15.2979f);
        this.f31371f.cubicTo(16.6442f, 14.2162f, 17.8588f, 13.542f, 18.7876f, 14.1179f);
        this.f31371f.lineTo(33.2341f, 22.813f);
        this.f31371f.cubicTo(34.1343f, 23.3609f, 34.1343f, 24.6391f, 33.2341f, 25.1729f);
        this.f31371f.lineTo(28.933f, 27.7576f);
        this.f31371f.lineTo(21.0168f, 22.9956f);
        this.f31371f.cubicTo(16.63f, 20.3688f, 11.0f, 23.4732f, 11.0f, 28.5302f);
        this.f31371f.lineTo(11.0f, 33.5169f);
        this.f31371f.cubicTo(11.0f, 38.5738f, 16.63f, 41.6782f, 21.0168f, 39.0373f);
        this.f31371f.lineTo(28.933f, 34.2754f);
        this.f31371f.lineTo(34.4772f, 37.6186f);
        this.f31371f.cubicTo(35.3917f, 38.1664f, 36.5349f, 38.1664f, 37.4351f, 37.6186f);
        this.f31371f.cubicTo(39.2355f, 36.537f, 39.2355f, 33.9664f, 37.4351f, 32.8847f);
        this.f31371f.close();
        this.f31371f.moveTo(18.7876f, 33.8821f);
        this.f31371f.cubicTo(17.8445f, 34.444f, 16.6442f, 33.7837f, 16.6442f, 32.7021f);
        this.f31371f.lineTo(16.6442f, 29.3589f);
        this.f31371f.cubicTo(16.6442f, 28.2773f, 17.8588f, 27.6031f, 18.7876f, 28.179f);
        this.f31371f.lineTo(23.5317f, 31.0305f);
        this.f31371f.lineTo(18.7876f, 33.8821f);
        this.f31371f.close();
        this.f31371f.setFillType(Path.FillType.WINDING);
        this.f31370e.setStyle(Paint.Style.FILL);
        this.f31370e.setShader(this.f31369d);
        this.f30624a.add(this.f31370e);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31371f, this.f31370e);
    }
}
