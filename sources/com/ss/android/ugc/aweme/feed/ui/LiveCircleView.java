package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class LiveCircleView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f94109a;

    /* renamed from: b  reason: collision with root package name */
    private float f94110b;

    /* renamed from: c  reason: collision with root package name */
    private int f94111c;

    /* renamed from: d  reason: collision with root package name */
    private int f94112d;

    /* renamed from: e  reason: collision with root package name */
    private float f94113e;

    /* renamed from: f  reason: collision with root package name */
    private float f94114f;

    /* renamed from: g  reason: collision with root package name */
    private int f94115g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f94116h;

    static {
        Covode.recordClassIndex(59823);
    }

    public void setStrokeWidth(int i2) {
        this.f94110b = (float) i2;
    }

    public LiveCircleView(Context context) {
        this(context, null);
    }

    public void setFraction(float f2) {
        this.f94114f = this.f94113e + (((float) this.f94115g) * f2);
        this.f94116h.setStrokeWidth(this.f94110b * (1.0f - f2));
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(5274);
        super.onDraw(canvas);
        canvas.drawCircle((float) this.f94111c, (float) this.f94112d, this.f94113e, this.f94109a);
        canvas.drawCircle((float) this.f94111c, (float) this.f94112d, this.f94114f, this.f94116h);
        MethodCollector.o(5274);
    }

    public LiveCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(5152);
        super.onMeasure(i2, i3);
        this.f94111c = getMeasuredWidth() / 2;
        this.f94112d = getMeasuredHeight() / 2;
        float measuredHeight = (float) ((getMeasuredHeight() / 2) - getPaddingBottom());
        this.f94113e = measuredHeight;
        this.f94114f = measuredHeight;
        this.f94115g = getPaddingBottom();
        MethodCollector.o(5152);
    }

    private LiveCircleView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(5147);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3h});
        this.f94110b = (float) ((int) obtainStyledAttributes.getDimension(0, n.b(context, 1.5f)));
        obtainStyledAttributes.recycle();
        this.f94109a = new Paint();
        this.f94109a.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, Color.parseColor("#FF1764"), Color.parseColor("#ED3495"), Shader.TileMode.MIRROR));
        this.f94109a.setAntiAlias(true);
        this.f94109a.setDither(true);
        this.f94109a.setStyle(Paint.Style.STROKE);
        this.f94109a.setStrokeWidth(n.b(context, 1.0f));
        this.f94116h = new Paint(this.f94109a);
        MethodCollector.o(5147);
    }
}
