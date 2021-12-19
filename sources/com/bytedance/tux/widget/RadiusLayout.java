package com.bytedance.tux.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class RadiusLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f45639a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f45640b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f45641c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f45642d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f45643e;

    /* renamed from: f  reason: collision with root package name */
    private final Path f45644f;

    static {
        Covode.recordClassIndex(27784);
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
        this.f45643e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        int i2 = Build.VERSION.SDK_INT;
        this.f45644f.reset();
        Path path = this.f45644f;
        RectF rectF = this.f45643e;
        float[] fArr = this.f45642d;
        if (fArr == null) {
            l.a("radiusArray");
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(this.f45644f);
    }

    public final void setRadius(float f2) {
        this.f45642d = new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        l.c(canvas, "");
        a(canvas);
        super.dispatchDraw(canvas);
        if (this.f45641c && this.f45639a && (paint = this.f45640b) != null) {
            this.f45643e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            int i2 = Build.VERSION.SDK_INT;
            this.f45644f.reset();
            Path path = this.f45644f;
            RectF rectF = this.f45643e;
            float[] fArr = this.f45642d;
            if (fArr == null) {
                l.a("radiusArray");
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(this.f45644f, paint);
        }
    }

    private /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RadiusLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        boolean z = false;
        MethodCollector.i(7590);
        this.f45639a = true;
        this.f45643e = new RectF();
        this.f45644f = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.q1, R.attr.q2, R.attr.q3, R.attr.q4, R.attr.q5, R.attr.a0s, R.attr.a0t, R.attr.a0u, R.attr.a0v, R.attr.a0w, R.attr.a8q, R.attr.a8r, R.attr.a8s, R.attr.a8t, R.attr.a8u, R.attr.a8v, R.attr.a8w, R.attr.a8x}, 0, 0);
        l.a((Object) obtainStyledAttributes, "");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(2, dimension);
        float dimension3 = obtainStyledAttributes.getDimension(4, dimension);
        float dimension4 = obtainStyledAttributes.getDimension(1, dimension);
        float dimension5 = obtainStyledAttributes.getDimension(3, dimension);
        int color = obtainStyledAttributes.getColor(10, -16777216);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(13, 0);
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(12, 0);
        int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(11, 0);
        a(dimension2, dimension3, dimension4, dimension5);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        if (!(dimensionPixelOffset2 == 0 || dimensionPixelOffset3 == 0)) {
            paint.setPathEffect(new DashPathEffect(new float[]{(float) dimensionPixelOffset2, (float) dimensionPixelOffset3}, 0.0f));
        }
        paint.setStrokeWidth((float) dimensionPixelOffset);
        this.f45640b = paint;
        if (!((color & -16777216) == 0 || dimensionPixelOffset == 0)) {
            z = true;
        }
        this.f45641c = z;
        invalidate();
        obtainStyledAttributes.recycle();
        MethodCollector.o(7590);
    }

    public final void a(float f2, float f3, float f4, float f5) {
        Context context = getContext();
        l.a((Object) context, "");
        this.f45642d = i.a(context) ? new float[]{f3, f3, f2, f2, f4, f4, f5, f5} : new float[]{f2, f2, f3, f3, f5, f5, f4, f4};
        invalidate();
    }
}
