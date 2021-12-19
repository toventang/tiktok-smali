package com.bytedance.android.live.design.view.sheet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.design.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class LiveSheetHandleView extends View {

    /* renamed from: a  reason: collision with root package name */
    private float f9539a;

    /* renamed from: b  reason: collision with root package name */
    private float f9540b = (this.f9542d.getStrokeWidth() / 2.0f);

    /* renamed from: c  reason: collision with root package name */
    private int f9541c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f9542d;

    /* renamed from: e  reason: collision with root package name */
    private Path f9543e;

    static {
        Covode.recordClassIndex(4841);
    }

    private void a() {
        this.f9543e.reset();
        if (getWidth() > 0 && getHeight() > 0) {
            this.f9543e.moveTo(this.f9540b, ((float) getHeight()) / 2.0f);
            this.f9543e.lineTo(((float) getWidth()) / 2.0f, (((float) getHeight()) / 2.0f) + (((float) this.f9541c) * this.f9539a));
            this.f9543e.lineTo(((float) getWidth()) - this.f9540b, ((float) getHeight()) / 2.0f);
        }
    }

    public void setOffset(float f2) {
        this.f9539a = f2;
        a();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(3025);
        super.onDraw(canvas);
        canvas.drawPath(this.f9543e, this.f9542d);
        MethodCollector.o(3025);
    }

    public LiveSheetHandleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3017);
        Paint paint = new Paint(1);
        this.f9542d = paint;
        paint.setColor(b.a(this, (int) R.attr.alz));
        this.f9542d.setStyle(Paint.Style.STROKE);
        this.f9542d.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(R.dimen.nw));
        this.f9542d.setStrokeCap(Paint.Cap.ROUND);
        this.f9542d.setStrokeJoin(Paint.Join.ROUND);
        this.f9543e = new Path();
        this.f9541c = getContext().getResources().getDimensionPixelSize(R.dimen.nv);
        MethodCollector.o(3017);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a();
    }
}
