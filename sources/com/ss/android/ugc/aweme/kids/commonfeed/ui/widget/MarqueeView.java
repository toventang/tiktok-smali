package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;

public class MarqueeView extends View {

    /* renamed from: a  reason: collision with root package name */
    protected TextPaint f106303a;

    /* renamed from: b  reason: collision with root package name */
    protected Paint.FontMetrics f106304b;

    /* renamed from: c  reason: collision with root package name */
    protected String f106305c;

    /* renamed from: d  reason: collision with root package name */
    protected int f106306d;

    /* renamed from: e  reason: collision with root package name */
    protected long f106307e;

    /* renamed from: f  reason: collision with root package name */
    protected float f106308f;

    /* renamed from: g  reason: collision with root package name */
    protected float f106309g;

    /* renamed from: h  reason: collision with root package name */
    protected int f106310h;

    /* renamed from: i  reason: collision with root package name */
    protected long f106311i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f106312j;

    /* renamed from: k  reason: collision with root package name */
    protected int f106313k;

    static {
        Covode.recordClassIndex(67956);
    }

    public final void b() {
        if (this.f106310h != 1) {
            this.f106310h = 1;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f106310h == 0) {
            c();
        }
    }

    public final void a() {
        int i2 = this.f106310h;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f106310h = 0;
                invalidate();
            } else if (i2 == 2) {
                this.f106308f = 0.0f;
                this.f106311i = 0;
                this.f106310h = 0;
                invalidate();
            }
        }
    }

    public final void c() {
        if (this.f106310h != 2) {
            this.f106310h = 2;
            this.f106308f = 0.0f;
            this.f106311i = 0;
            invalidate();
        }
    }

    public void setSpeed(int i2) {
        this.f106306d = i2;
    }

    public void setTextColor(int i2) {
        TextPaint textPaint = this.f106303a;
        if (textPaint != null) {
            textPaint.setColor(i2);
        }
    }

    public void setText(int i2) {
        setText(getResources().getString(i2));
    }

    public void setTextShadow(int i2) {
        TextPaint textPaint = this.f106303a;
        if (textPaint != null) {
            textPaint.setShadowLayer(1.0f, 1.0f, 1.0f, i2);
        }
    }

    public void setTextSize(int i2) {
        TextPaint textPaint = this.f106303a;
        if (textPaint != null) {
            textPaint.setTextSize((float) i2);
        }
    }

    public void setText(String str) {
        String str2 = str + "    ";
        this.f106305c = str2;
        this.f106309g = this.f106303a.measureText(str2);
        while (this.f106309g < ((float) this.f106313k)) {
            String str3 = this.f106305c + this.f106305c;
            this.f106305c = str3;
            this.f106309g = this.f106303a.measureText(str3);
        }
        this.f106308f = 0.0f;
        this.f106311i = 0;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        MethodCollector.i(5812);
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f106305c)) {
            float f2 = 0.0f;
            if (this.f106309g != 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j2 = this.f106311i;
                if (j2 > 0) {
                    float f3 = ((float) ((uptimeMillis - j2) * ((long) this.f106306d))) / 1000.0f;
                    float f4 = this.f106308f;
                    if (this.f106312j) {
                        i4 = 1;
                    } else {
                        i4 = -1;
                    }
                    float f5 = f4 + (f3 * ((float) i4));
                    this.f106308f = f5;
                    this.f106308f = f5 % this.f106309g;
                }
                if (this.f106310h == 0) {
                    this.f106311i = uptimeMillis;
                }
                this.f106303a.getFontMetrics(this.f106304b);
                while (true) {
                    float measuredWidth = (float) getMeasuredWidth();
                    float f6 = this.f106308f;
                    boolean z = this.f106312j;
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    if (f2 >= measuredWidth + (((float) i2) * f6)) {
                        break;
                    }
                    String str = this.f106305c;
                    if (z) {
                        i3 = -1;
                    } else {
                        i3 = 1;
                    }
                    canvas.drawText(str, f6 + (((float) i3) * f2), -this.f106304b.top, this.f106303a);
                    f2 += this.f106309g;
                }
                if (this.f106310h == 0) {
                    postInvalidateDelayed(this.f106307e);
                }
                MethodCollector.o(5812);
                return;
            }
        }
        MethodCollector.o(5812);
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        MethodCollector.i(5820);
        super.onMeasure(i2, i3);
        this.f106303a.getFontMetrics(this.f106304b);
        int i5 = (int) (this.f106304b.bottom - this.f106304b.top);
        boolean z = false;
        if (!TextUtils.isEmpty(this.f106305c)) {
            i4 = (int) this.f106303a.measureText(this.f106305c);
        } else {
            i4 = 0;
        }
        if (View.MeasureSpec.getSize(i2) <= i4) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i4, i5);
        if (v.e(this) == 1) {
            z = true;
        }
        this.f106312j = z;
        MethodCollector.o(5820);
    }

    private MarqueeView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(5599);
        this.f106304b = new Paint.FontMetrics();
        this.f106306d = 25;
        this.f106307e = 16;
        this.f106313k = 0;
        TextPaint textPaint = new TextPaint();
        this.f106303a = textPaint;
        textPaint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ad0, R.attr.ase, R.attr.asf, R.attr.asg});
        this.f106306d = obtainStyledAttributes.getDimensionPixelSize(0, this.f106306d);
        int color = obtainStyledAttributes.getColor(1, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 28);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        this.f106303a.setTextSize((float) dimensionPixelSize);
        this.f106303a.setShadowLayer(1.0f, 1.0f, 1.0f, color2);
        this.f106303a.setColor(color);
        Typeface a2 = b.a().a(d.f33795a);
        if (a2 != null) {
            this.f106303a.setTypeface(a2);
        }
        this.f106310h = 2;
        this.f106313k = context.getResources().getDimensionPixelSize(R.dimen.n3);
        MethodCollector.o(5599);
    }
}
