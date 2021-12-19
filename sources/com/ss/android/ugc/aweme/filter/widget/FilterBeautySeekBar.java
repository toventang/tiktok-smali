package com.ss.android.ugc.aweme.filter.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.a;
import com.ss.android.ugc.tools.view.style.c;
import com.ss.android.ugc.tools.view.style.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class FilterBeautySeekBar extends p {

    /* renamed from: a  reason: collision with root package name */
    protected String f95999a;

    /* renamed from: b  reason: collision with root package name */
    protected String f96000b;

    /* renamed from: c  reason: collision with root package name */
    protected Paint f96001c;

    /* renamed from: d  reason: collision with root package name */
    public float f96002d;

    /* renamed from: e  reason: collision with root package name */
    public float f96003e;

    /* renamed from: f  reason: collision with root package name */
    public float f96004f;

    /* renamed from: g  reason: collision with root package name */
    public float f96005g;

    /* renamed from: h  reason: collision with root package name */
    private float f96006h;

    /* renamed from: i  reason: collision with root package name */
    private float f96007i;

    /* renamed from: j  reason: collision with root package name */
    private float f96008j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f96009k;

    /* renamed from: l  reason: collision with root package name */
    private int f96010l;

    /* renamed from: m  reason: collision with root package name */
    private int f96011m;
    private float n;
    private Paint o;
    private boolean p;
    private boolean q;

    static {
        Covode.recordClassIndex(60803);
    }

    public synchronized int getProgress() {
        int progress;
        MethodCollector.i(6737);
        progress = super.getProgress();
        String valueOf = String.valueOf(progress);
        this.f95999a = valueOf;
        if (!"0".equals(valueOf) && this.p) {
            this.f95999a += "%";
        }
        Paint paint = this.f96001c;
        if (paint != null) {
            this.f96007i = paint.measureText(this.f95999a);
        }
        MethodCollector.o(6737);
        return progress;
    }

    public void setDisplayPercent(boolean z) {
        this.p = z;
    }

    public void setShowText(boolean z) {
        this.q = z;
    }

    public void setDefaultDotProgress(int i2) {
        this.f96010l = i2;
        invalidate();
    }

    public void setTextColor(int i2) {
        this.f96001c.setColor(i2);
        invalidate();
    }

    @Override // androidx.appcompat.widget.p
    public synchronized void onDraw(Canvas canvas) {
        MethodCollector.i(6727);
        super.onDraw(canvas);
        Rect bounds = getProgressDrawable().getBounds();
        float progress = ((float) getProgress()) / ((float) getMax());
        float f2 = ((float) this.f96010l) / 100.0f;
        if (r.a(this)) {
            progress = 1.0f - progress;
            f2 = 1.0f - f2;
        }
        if (this.q) {
            float f3 = this.f96008j;
            canvas.drawText(this.f95999a, ((((float) bounds.width()) * progress) - (this.f96007i / 2.0f)) + this.f96002d, f3, this.f96001c);
        }
        if (this.f96010l != -1 && this.f96009k) {
            canvas.drawCircle((((float) bounds.width()) * f2) + a(getContext(), this.n) + this.f96002d, ((((float) getHeight()) + this.f96004f) - this.f96005g) / 2.0f, a(getContext(), this.n), this.o);
        }
        MethodCollector.o(6727);
    }

    public FilterBeautySeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    private static float a(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public FilterBeautySeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 16842875);
        Typeface a2;
        this.f95999a = "";
        this.f96000b = "";
        this.f96008j = a(getContext(), 10.0f);
        this.q = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.kv, R.attr.r1, R.attr.r2, R.attr.r3, R.attr.a1u, R.attr.a8z, R.attr.a90, R.attr.a92, R.attr.a_5, R.attr.abw, R.attr.ai8, R.attr.ajv}, 16842875, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        int i3 = 0;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 5) {
                i3 = obtainStyledAttributes.getColor(index, -1);
            } else if (index == 7) {
                this.f96006h = obtainStyledAttributes.getDimension(index, 15.0f);
            }
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.f96002d = obtainStyledAttributes.getDimension(4, 0.0f);
        } else {
            this.f96002d = a(context, 10.0f);
        }
        if (obtainStyledAttributes.hasValue(8)) {
            this.f96003e = obtainStyledAttributes.getDimension(8, 0.0f);
        } else {
            this.f96003e = this.f96002d;
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f96004f = obtainStyledAttributes.getDimension(11, 0.0f);
        } else {
            this.f96004f = a(context, 13.0f);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f96005g = obtainStyledAttributes.getDimension(0, 0.0f);
        } else {
            this.f96005g = this.f96004f;
        }
        if (obtainStyledAttributes.hasValue(10)) {
            this.f96008j = obtainStyledAttributes.getDimension(10, 10.0f);
        }
        this.f96009k = obtainStyledAttributes.getBoolean(9, false);
        this.f96010l = obtainStyledAttributes.getInt(2, -1);
        this.f96011m = obtainStyledAttributes.getColor(1, -1);
        this.n = obtainStyledAttributes.getFloat(3, 2.5f);
        this.f96000b = obtainStyledAttributes.getString(6);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f96001c = paint;
        paint.setAntiAlias(true);
        this.f96001c.setColor(i3);
        if (!TextUtils.isEmpty(this.f96000b)) {
            Typeface a3 = f.a(this.f96000b);
            this.f96001c.setTypeface(a3 == null ? Typeface.defaultFromStyle(1) : a3);
        } else {
            a aVar = a.MEDIUM;
            l.d(aVar, "");
            c cVar = f.f150193a;
            if (!(cVar == null || (a2 = cVar.a(aVar.getVALUE())) == null)) {
                this.f96001c.setTypeface(a2);
            }
        }
        this.f96001c.setTextSize(this.f96006h);
        Rect rect = new Rect();
        String valueOf = String.valueOf(getProgress());
        this.f95999a = valueOf;
        this.f96001c.getTextBounds(valueOf, 0, valueOf.length(), rect);
        Paint paint2 = new Paint();
        this.o = paint2;
        paint2.setAntiAlias(true);
        this.o.setColor(this.f96011m);
        setPadding((int) this.f96002d, (int) this.f96004f, (int) this.f96003e, (int) this.f96005g);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60804);
            }

            public final void onGlobalLayout() {
                if (r.a(FilterBeautySeekBar.this)) {
                    float f2 = FilterBeautySeekBar.this.f96002d;
                    FilterBeautySeekBar filterBeautySeekBar = FilterBeautySeekBar.this;
                    filterBeautySeekBar.f96002d = filterBeautySeekBar.f96003e;
                    FilterBeautySeekBar.this.f96003e = f2;
                    FilterBeautySeekBar filterBeautySeekBar2 = FilterBeautySeekBar.this;
                    filterBeautySeekBar2.setPadding((int) filterBeautySeekBar2.f96002d, (int) FilterBeautySeekBar.this.f96004f, (int) FilterBeautySeekBar.this.f96003e, (int) FilterBeautySeekBar.this.f96005g);
                }
                FilterBeautySeekBar.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }
}
