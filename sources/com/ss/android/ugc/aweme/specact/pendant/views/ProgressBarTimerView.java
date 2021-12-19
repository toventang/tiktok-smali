package com.ss.android.ugc.aweme.specact.pendant.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class ProgressBarTimerView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134329a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private float f134330b;

    /* renamed from: c  reason: collision with root package name */
    private int f134331c;

    /* renamed from: d  reason: collision with root package name */
    private int f134332d;

    /* renamed from: e  reason: collision with root package name */
    private int f134333e;

    /* renamed from: f  reason: collision with root package name */
    private float f134334f;

    /* renamed from: g  reason: collision with root package name */
    private float f134335g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f134336h;

    /* renamed from: i  reason: collision with root package name */
    private SweepGradient f134337i;

    /* renamed from: j  reason: collision with root package name */
    private RectF f134338j;

    /* renamed from: k  reason: collision with root package name */
    private float f134339k;

    static {
        Covode.recordClassIndex(87845);
    }

    public ProgressBarTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87846);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumHeight() {
        return (int) n.b(getContext(), 25.0f);
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumWidth() {
        return (int) n.b(getContext(), 25.0f);
    }

    public final void a(float f2) {
        this.f134339k = this.f134335g * f2;
        invalidate();
    }

    public final void setProgressForegroundColor(List<String> list) {
        l.d(list, "");
        try {
            if (list.size() > 1) {
                this.f134331c = Color.parseColor(list.get(0));
                this.f134332d = Color.parseColor(list.get(1));
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(11064);
        super.onDraw(canvas);
        if (this.f134337i == null) {
            SweepGradient sweepGradient = new SweepGradient(0.0f, (float) getMeasuredHeight(), this.f134331c, this.f134332d);
            this.f134337i = sweepGradient;
            this.f134336h.setShader(sweepGradient);
        }
        float f2 = this.f134330b / 2.0f;
        this.f134338j.left = f2;
        this.f134338j.top = f2;
        this.f134338j.right = ((float) getMeasuredWidth()) - f2;
        this.f134338j.bottom = ((float) getMeasuredHeight()) - f2;
        float f3 = this.f134339k;
        if (f3 > this.f134335g || canvas == null) {
            MethodCollector.o(11064);
            return;
        }
        canvas.drawArc(this.f134338j, this.f134334f, f3, false, this.f134336h);
        MethodCollector.o(11064);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(10896);
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i4 = 0;
        if (mode == Integer.MIN_VALUE) {
            size = Math.max(getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight(), size);
        } else if (mode == 0) {
            size = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        } else if (mode != 1073741824) {
            size = 0;
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            i4 = Math.min(getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom(), size2);
        } else if (mode2 == 0) {
            i4 = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        } else if (mode2 == 1073741824) {
            i4 = size2;
        }
        setMeasuredDimension(size, i4);
        MethodCollector.o(10896);
    }

    private /* synthetic */ ProgressBarTimerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProgressBarTimerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(11066);
        this.f134334f = -90.0f;
        this.f134336h = new Paint(1);
        this.f134338j = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.a81, R.attr.a82, R.attr.a83, R.attr.a85, R.attr.a86, R.attr.a88}, 0, 0);
        try {
            this.f134330b = obtainStyledAttributes.getDimension(5, 0.0f);
            this.f134331c = obtainStyledAttributes.getColor(4, 0);
            this.f134332d = obtainStyledAttributes.getColor(3, 0);
            this.f134333e = obtainStyledAttributes.getInteger(0, 0);
            obtainStyledAttributes.recycle();
            this.f134336h.setStrokeWidth(this.f134330b);
            this.f134336h.setStyle(Paint.Style.STROKE);
            this.f134336h.setStrokeCap(Paint.Cap.ROUND);
            this.f134334f = -90.0f;
            this.f134335g = 360.0f;
            MethodCollector.o(11066);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            MethodCollector.o(11066);
            throw th;
        }
    }
}
