package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;

public class CloseView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f76504a;

    /* renamed from: b  reason: collision with root package name */
    private Path f76505b;

    /* renamed from: c  reason: collision with root package name */
    private int f76506c;

    /* renamed from: d  reason: collision with root package name */
    private int f76507d;

    /* renamed from: e  reason: collision with root package name */
    private int f76508e;

    /* renamed from: f  reason: collision with root package name */
    private int f76509f;

    /* renamed from: g  reason: collision with root package name */
    private int f76510g;

    /* renamed from: h  reason: collision with root package name */
    private int f76511h;

    /* renamed from: i  reason: collision with root package name */
    private int f76512i;

    /* renamed from: j  reason: collision with root package name */
    private int f76513j;

    static {
        Covode.recordClassIndex(47245);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f76505b.reset();
        if (this.f76508e == 0 || this.f76509f == 0) {
            this.f76508e = getWidth();
            this.f76509f = getHeight();
        }
        this.f76510g = getPaddingLeft();
        this.f76511h = getPaddingRight();
        this.f76512i = getPaddingTop();
        this.f76513j = getPaddingBottom();
        this.f76505b.moveTo((float) this.f76510g, (float) this.f76512i);
        this.f76505b.lineTo((float) (this.f76508e - this.f76511h), (float) (this.f76509f - this.f76513j));
        this.f76505b.moveTo((float) this.f76510g, (float) (this.f76509f - this.f76513j));
        this.f76505b.lineTo((float) (this.f76508e - this.f76511h), (float) this.f76512i);
        canvas.save();
        canvas.drawPath(this.f76505b, this.f76504a);
        canvas.restore();
    }

    public CloseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CloseView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8097);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a2f, R.attr.a2k});
        this.f76506c = obtainStyledAttributes.getColor(0, -16777216);
        this.f76507d = obtainStyledAttributes.getDimensionPixelSize(1, n.a(1.0d));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f76504a = paint;
        paint.setColor(this.f76506c);
        this.f76504a.setStrokeWidth((float) this.f76507d);
        this.f76504a.setAntiAlias(true);
        this.f76504a.setStyle(Paint.Style.STROKE);
        this.f76504a.setStrokeJoin(Paint.Join.ROUND);
        this.f76504a.setStrokeCap(Paint.Cap.ROUND);
        this.f76505b = new Path();
        MethodCollector.o(8097);
    }
}
