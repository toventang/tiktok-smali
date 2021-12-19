package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class fz extends a {

    /* renamed from: d  reason: collision with root package name */
    RadialGradient f31501d;

    /* renamed from: e  reason: collision with root package name */
    Matrix f31502e;

    static {
        Covode.recordClassIndex(18297);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f31501d = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-27988, -119723}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        this.f31502e = matrix;
        matrix.preTranslate(15.8323f, 13.252f);
        this.f31502e.preRotate(54.9757f);
        this.f31502e.preScale(27.8344f, 30.3834f);
        this.f31501d.setLocalMatrix(this.f31502e);
        this.f30626c.moveTo(15.0f, 4.5f);
        this.f30626c.cubicTo(21.0f, 4.5f, 24.0f, 8.5f, 24.0f, 8.5f);
        this.f30626c.cubicTo(24.0f, 8.5f, 27.0f, 4.5f, 33.0f, 4.5f);
        this.f30626c.cubicTo(40.0f, 4.5f, 45.0f, 9.99998f, 45.0f, 17.0f);
        this.f30626c.cubicTo(45.0f, 25.0f, 38.4622f, 32.1314f, 32.5f, 37.5f);
        this.f30626c.cubicTo(28.8191f, 40.8144f, 26.0f, 43.0f, 24.0f, 43.0f);
        this.f30626c.cubicTo(22.0f, 43.0f, 19.101f, 40.7978f, 15.5f, 37.5f);
        this.f30626c.cubicTo(9.63898f, 32.1325f, 3.0f, 25.0f, 3.0f, 17.0f);
        this.f30626c.cubicTo(3.0f, 9.99998f, 8.0f, 4.5f, 15.0f, 4.5f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setShader(this.f31501d);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
    }
}
