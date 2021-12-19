package com.ss.android.ugc.aweme.feed.widget;

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
import androidx.core.f.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.ss.android.ugc.aweme.lego.p;
import com.zhiliaoapp.musically.R;

public class MarqueeView extends View {

    /* renamed from: a  reason: collision with root package name */
    public TextPaint f95215a;

    /* renamed from: b  reason: collision with root package name */
    protected Paint.FontMetrics f95216b;

    /* renamed from: c  reason: collision with root package name */
    protected String f95217c;

    /* renamed from: d  reason: collision with root package name */
    protected int f95218d;

    /* renamed from: e  reason: collision with root package name */
    protected long f95219e;

    /* renamed from: f  reason: collision with root package name */
    protected float f95220f;

    /* renamed from: g  reason: collision with root package name */
    protected float f95221g;

    /* renamed from: h  reason: collision with root package name */
    protected int f95222h;

    /* renamed from: i  reason: collision with root package name */
    protected long f95223i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f95224j;

    /* renamed from: k  reason: collision with root package name */
    protected int f95225k;

    static {
        Covode.recordClassIndex(60332);
    }

    public final void b() {
        if (this.f95222h != 1) {
            this.f95222h = 1;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f95222h == 0) {
            c();
        }
    }

    public final void a() {
        int i2 = this.f95222h;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f95222h = 0;
                invalidate();
            } else if (i2 == 2) {
                this.f95220f = 0.0f;
                this.f95223i = 0;
                this.f95222h = 0;
                invalidate();
            }
        }
    }

    public final void c() {
        if (this.f95222h != 2) {
            this.f95222h = 2;
            this.f95220f = 0.0f;
            this.f95223i = 0;
            invalidate();
        }
    }

    public void setSpeed(int i2) {
        this.f95218d = i2;
    }

    public MarqueeView(Context context) {
        this(context, null);
    }

    public void setTextColor(int i2) {
        TextPaint textPaint = this.f95215a;
        if (textPaint != null) {
            textPaint.setColor(i2);
        }
    }

    public void setText(int i2) {
        setText(getResources().getString(i2));
    }

    public void setTextShadow(int i2) {
        TextPaint textPaint = this.f95215a;
        if (textPaint != null) {
            textPaint.setShadowLayer(1.0f, 1.0f, 1.0f, i2);
        }
    }

    public void setTextSize(int i2) {
        TextPaint textPaint = this.f95215a;
        if (textPaint != null) {
            textPaint.setTextSize((float) i2);
            this.f95215a.getFontMetrics(this.f95216b);
        }
    }

    public void setText(String str) {
        this.f95217c = str + "    ";
        p.a(false).execute(new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.widget.MarqueeView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60333);
            }

            public final void run() {
                MarqueeView marqueeView = MarqueeView.this;
                marqueeView.f95221g = marqueeView.f95215a.measureText(MarqueeView.this.f95217c);
                while (MarqueeView.this.f95221g < ((float) MarqueeView.this.f95225k)) {
                    StringBuilder sb = new StringBuilder();
                    MarqueeView marqueeView2 = MarqueeView.this;
                    marqueeView2.f95217c = sb.append(marqueeView2.f95217c).append(MarqueeView.this.f95217c).toString();
                    MarqueeView marqueeView3 = MarqueeView.this;
                    marqueeView3.f95221g = marqueeView3.f95215a.measureText(MarqueeView.this.f95217c);
                }
                MarqueeView.this.f95220f = 0.0f;
                MarqueeView.this.f95223i = 0;
                MarqueeView.this.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.feed.widget.MarqueeView.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(60334);
                    }

                    public final void run() {
                        MarqueeView.this.requestLayout();
                    }
                });
            }
        });
        this.f95224j = a.a().a(this.f95217c);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        MethodCollector.i(8693);
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f95217c)) {
            float f2 = 0.0f;
            if (this.f95221g != 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j2 = this.f95223i;
                if (j2 > 0) {
                    float f3 = ((float) ((uptimeMillis - j2) * ((long) this.f95218d))) / 1000.0f;
                    float f4 = this.f95220f;
                    if (this.f95224j) {
                        i4 = 1;
                    } else {
                        i4 = -1;
                    }
                    float f5 = f4 + (f3 * ((float) i4));
                    this.f95220f = f5;
                    this.f95220f = f5 % this.f95221g;
                }
                if (this.f95222h == 0) {
                    this.f95223i = uptimeMillis;
                }
                while (true) {
                    float measuredWidth = (float) getMeasuredWidth();
                    float f6 = this.f95220f;
                    boolean z = this.f95224j;
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    if (f2 >= measuredWidth + (((float) i2) * f6)) {
                        break;
                    }
                    String str = this.f95217c;
                    if (z) {
                        i3 = -1;
                    } else {
                        i3 = 1;
                    }
                    canvas.drawText(str, f6 + (((float) i3) * f2), -this.f95216b.top, this.f95215a);
                    f2 += this.f95221g;
                }
                if (this.f95222h == 0) {
                    postInvalidateDelayed(this.f95219e);
                }
                MethodCollector.o(8693);
                return;
            }
        }
        MethodCollector.o(8693);
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void onMeasure(int i2, int i3) {
        MethodCollector.i(8694);
        super.onMeasure(i2, i3);
        int i4 = (int) this.f95221g;
        int i5 = (int) (this.f95216b.bottom - this.f95216b.top);
        if (View.MeasureSpec.getSize(i2) <= i4) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i4, i5);
        MethodCollector.o(8694);
    }

    private MarqueeView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8684);
        this.f95216b = new Paint.FontMetrics();
        this.f95218d = 25;
        this.f95219e = 16;
        this.f95225k = 0;
        TextPaint textPaint = new TextPaint();
        this.f95215a = textPaint;
        textPaint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ad0, R.attr.ase, R.attr.asf, R.attr.asg});
        this.f95218d = obtainStyledAttributes.getDimensionPixelSize(0, this.f95218d);
        int color = obtainStyledAttributes.getColor(1, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 28);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        this.f95215a.setTextSize((float) dimensionPixelSize);
        this.f95215a.setShadowLayer(1.0f, 1.0f, 1.0f, color2);
        this.f95215a.setColor(color);
        Typeface a2 = b.a().a(d.f33795a);
        if (a2 != null) {
            this.f95215a.setTypeface(a2);
        }
        this.f95215a.getFontMetrics(this.f95216b);
        this.f95222h = 2;
        this.f95225k = context.getResources().getDimensionPixelSize(R.dimen.g1);
        MethodCollector.o(8684);
    }
}
