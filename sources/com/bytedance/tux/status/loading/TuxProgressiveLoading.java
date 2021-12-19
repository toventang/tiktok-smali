package com.bytedance.tux.status.loading;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TuxProgressiveLoading extends View {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45385a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f45386b;

    /* renamed from: c  reason: collision with root package name */
    private int f45387c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f45388d;

    /* renamed from: e  reason: collision with root package name */
    private int f45389e;

    /* renamed from: f  reason: collision with root package name */
    private final ObjectAnimator f45390f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f45391g;

    static {
        Covode.recordClassIndex(27636);
    }

    public TuxProgressiveLoading(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27637);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void a() {
        if (this.f45389e != 100 || !this.f45391g) {
            this.f45390f.cancel();
            setAlpha(1.0f);
            return;
        }
        this.f45390f.setDuration(200L);
        this.f45390f.start();
    }

    public final void setAutoDisappear(boolean z) {
        this.f45391g = z;
        a();
    }

    public final void setProgress(int i2) {
        if (i2 < 0) {
            this.f45389e = 0;
        } else if (i2 > 100) {
            this.f45389e = 100;
        } else {
            this.f45389e = i2;
        }
        invalidate();
        a();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(7161);
        l.c(canvas, "");
        super.onDraw(canvas);
        this.f45388d.setStrokeWidth((float) getHeight());
        this.f45388d.setColor(this.f45386b);
        float height = ((float) getHeight()) / 2.0f;
        canvas.drawLine(0.0f, height, (float) getWidth(), height, this.f45388d);
        this.f45388d.setColor(this.f45387c);
        if (i.a(this)) {
            canvas.drawLine((float) getWidth(), height, ((float) getWidth()) - (((float) getWidth()) * (((float) this.f45389e) / 100.0f)), height, this.f45388d);
            MethodCollector.o(7161);
            return;
        }
        canvas.drawLine(0.0f, height, ((float) getWidth()) * (((float) this.f45389e) / 100.0f), height, this.f45388d);
        MethodCollector.o(7161);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            size2 = h.g.a.a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
        }
        setMeasuredDimension(size, size2);
    }

    private /* synthetic */ TuxProgressiveLoading(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxProgressiveLoading(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.c1);
        l.c(context, "");
        MethodCollector.i(7230);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.f45388d = paint;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        l.a((Object) ofFloat, "");
        this.f45390f = ofFloat;
        this.f45391g = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aoa, R.attr.art}, R.attr.c1, 0);
        l.a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(1, 0);
        int color2 = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.f45386b = color;
        this.f45387c = color2;
        this.f45391g = true;
        MethodCollector.o(7230);
    }
}
