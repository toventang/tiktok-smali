package com.ss.android.ugc.aweme.notification.view;

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
    private Paint f113915a;

    /* renamed from: b  reason: collision with root package name */
    private float f113916b;

    /* renamed from: c  reason: collision with root package name */
    private Context f113917c;

    /* renamed from: d  reason: collision with root package name */
    private int f113918d;

    /* renamed from: e  reason: collision with root package name */
    private int f113919e;

    /* renamed from: f  reason: collision with root package name */
    private float f113920f;

    /* renamed from: g  reason: collision with root package name */
    private float f113921g;

    /* renamed from: h  reason: collision with root package name */
    private int f113922h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f113923i;

    static {
        Covode.recordClassIndex(73253);
    }

    public void setStrokeWidth(int i2) {
        this.f113916b = (float) i2;
    }

    public void setFraction(float f2) {
        this.f113921g = this.f113920f + (((float) this.f113922h) * f2);
        this.f113923i.setStrokeWidth(this.f113916b * (1.0f - f2));
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(5062);
        super.onDraw(canvas);
        canvas.drawCircle((float) this.f113918d, (float) this.f113919e, this.f113920f, this.f113915a);
        canvas.drawCircle((float) this.f113918d, (float) this.f113919e, this.f113921g, this.f113923i);
        MethodCollector.o(5062);
    }

    public LiveCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(4755);
        super.onMeasure(i2, i3);
        this.f113918d = getMeasuredWidth() / 2;
        this.f113919e = getMeasuredHeight() / 2;
        float measuredHeight = (float) ((getMeasuredHeight() / 2) - getPaddingBottom());
        this.f113920f = measuredHeight;
        this.f113921g = measuredHeight;
        this.f113922h = getPaddingBottom();
        MethodCollector.o(4755);
    }

    private LiveCircleView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(4434);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3h});
        this.f113916b = (float) ((int) obtainStyledAttributes.getDimension(0, n.b(context, 1.5f)));
        obtainStyledAttributes.recycle();
        this.f113917c = context;
        this.f113915a = new Paint();
        this.f113915a.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, Color.parseColor("#FF1764"), Color.parseColor("#ED3495"), Shader.TileMode.MIRROR));
        this.f113915a.setAntiAlias(true);
        this.f113915a.setDither(true);
        this.f113915a.setStyle(Paint.Style.STROKE);
        this.f113915a.setStrokeWidth(n.b(context, 1.0f));
        this.f113923i = new Paint(this.f113915a);
        MethodCollector.o(4434);
    }
}
