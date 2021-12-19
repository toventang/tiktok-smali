package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class LandscapePanelBackgroundView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f22483a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f22484b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f22485c;

    static {
        Covode.recordClassIndex(13273);
    }

    /* access modifiers changed from: protected */
    public float[] b() {
        return new float[]{0.0f, 0.13f, 0.22f, 0.31f, 0.55f};
    }

    /* access modifiers changed from: protected */
    public int[] a() {
        return new int[]{Color.parseColor("#00000000"), Color.parseColor("#80000000"), Color.parseColor("#b3000000"), Color.parseColor("#cc000000"), Color.parseColor("#e6000000")};
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(11258);
        super.onDraw(canvas);
        this.f22483a.setShader(new LinearGradient(0.0f, 0.0f, (float) getMeasuredWidth(), 0.0f, this.f22484b, this.f22485c, Shader.TileMode.CLAMP));
        canvas.drawPaint(this.f22483a);
        MethodCollector.o(11258);
    }

    public LandscapePanelBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LandscapePanelBackgroundView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(10938);
        Paint paint = new Paint();
        this.f22483a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f22484b = a();
        this.f22485c = b();
        MethodCollector.o(10938);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(11098);
        super.onLayout(z, i2, i3, i4, i5);
        MethodCollector.o(11098);
    }
}
