package com.bytedance.tux.status.loading;

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
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TuxCircularProgress extends View {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45365a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f45366b;

    /* renamed from: c  reason: collision with root package name */
    private int f45367c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f45368d;

    /* renamed from: e  reason: collision with root package name */
    private float f45369e;

    static {
        Covode.recordClassIndex(27630);
    }

    public TuxCircularProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27631);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void setProgress(float f2) {
        if (f2 < 0.0f) {
            this.f45369e = 0.0f;
        } else if (f2 > 100.0f) {
            this.f45369e = 100.0f;
        } else {
            this.f45369e = f2;
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int height;
        MethodCollector.i(7516);
        l.c(canvas, "");
        super.onDraw(canvas);
        if (getWidth() < getHeight()) {
            height = getWidth();
        } else {
            height = getHeight();
        }
        float f2 = (float) height;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        float width = ((((float) getWidth()) - f2) / 2.0f) + (TypedValue.applyDimension(1, 3.0f, system.getDisplayMetrics()) / 2.0f);
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        float height2 = ((((float) getHeight()) - f2) / 2.0f) + (TypedValue.applyDimension(1, 3.0f, system2.getDisplayMetrics()) / 2.0f);
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        float applyDimension = (width + f2) - TypedValue.applyDimension(1, 3.0f, system3.getDisplayMetrics());
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        float applyDimension2 = (f2 + height2) - TypedValue.applyDimension(1, 3.0f, system4.getDisplayMetrics());
        this.f45368d.setColor(this.f45366b);
        canvas.drawArc(width, height2, applyDimension, applyDimension2, -90.0f, 360.0f, false, this.f45368d);
        this.f45368d.setColor(this.f45367c);
        canvas.drawArc(width, height2, applyDimension, applyDimension2, -90.0f, (this.f45369e / 100.0f) * 360.0f, false, this.f45368d);
        MethodCollector.o(7516);
    }

    private /* synthetic */ TuxCircularProgress(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxCircularProgress(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.bq);
        l.c(context, "");
        MethodCollector.i(7602);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        paint.setStrokeWidth(TypedValue.applyDimension(1, 3.0f, system.getDisplayMetrics()));
        this.f45368d = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aoy, R.attr.aoz}, R.attr.bq, 0);
        l.a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(1, 0);
        int color2 = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.f45366b = color;
        this.f45367c = color2;
        MethodCollector.o(7602);
    }
}
