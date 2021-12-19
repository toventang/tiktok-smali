package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class LineProgressBarView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f95182a;

    /* renamed from: b  reason: collision with root package name */
    private int f95183b = 100;

    /* renamed from: c  reason: collision with root package name */
    private int f95184c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f95185d;

    /* renamed from: e  reason: collision with root package name */
    private Rect f95186e;

    static {
        Covode.recordClassIndex(60319);
    }

    public int getProgress() {
        return this.f95182a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f95185d = new Paint(1);
        this.f95186e = new Rect();
    }

    public void setMaxProgress(int i2) {
        this.f95183b = i2;
        postInvalidate();
    }

    public void setProgress(int i2) {
        this.f95182a = i2;
        postInvalidate();
    }

    public void setColor(int i2) {
        this.f95184c = i2;
        this.f95185d.setColor(i2);
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(11798);
        super.onDraw(canvas);
        this.f95186e.set(0, 0, (getMeasuredWidth() * this.f95182a) / this.f95183b, getMeasuredHeight());
        canvas.drawRect(this.f95186e, this.f95185d);
        MethodCollector.o(11798);
    }

    public LineProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(11796);
        MethodCollector.o(11796);
    }
}
