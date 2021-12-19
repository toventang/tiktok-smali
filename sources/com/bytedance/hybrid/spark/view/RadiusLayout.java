package com.bytedance.hybrid.spark.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class RadiusLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f31265a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f31266b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f31267c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f31268d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f31269e;

    /* renamed from: f  reason: collision with root package name */
    private final Path f31270f;

    static {
        Covode.recordClassIndex(18135);
    }

    public RadiusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void draw(Canvas canvas) {
        l.c(canvas, "");
        a(canvas);
        super.draw(canvas);
    }

    private final void a(Canvas canvas) {
        this.f31269e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        int i2 = Build.VERSION.SDK_INT;
        this.f31270f.reset();
        Path path = this.f31270f;
        RectF rectF = this.f31269e;
        float[] fArr = this.f31266b;
        if (fArr == null) {
            l.a("radiusArray");
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(this.f31270f);
    }

    public final void setRadius(float f2) {
        this.f31266b = new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        l.c(canvas, "");
        a(canvas);
        super.dispatchDraw(canvas);
        if (this.f31268d && this.f31265a && (paint = this.f31267c) != null) {
            this.f31269e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            int i2 = Build.VERSION.SDK_INT;
            this.f31270f.reset();
            Path path = this.f31270f;
            RectF rectF = this.f31269e;
            float[] fArr = this.f31266b;
            if (fArr == null) {
                l.a("radiusArray");
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(this.f31270f, paint);
        }
    }

    private /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RadiusLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(5964);
        this.f31265a = true;
        this.f31269e = new RectF();
        this.f31270f = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
        this.f31267c = paint;
        this.f31268d = false;
        invalidate();
        MethodCollector.o(5964);
    }
}
