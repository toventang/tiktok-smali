package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class RoundIndicatorView extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f17268a;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager f17269b;

    /* renamed from: c  reason: collision with root package name */
    private int f17270c;

    /* renamed from: d  reason: collision with root package name */
    private int f17271d;

    /* renamed from: e  reason: collision with root package name */
    private float f17272e;

    /* renamed from: f  reason: collision with root package name */
    private float f17273f;

    /* renamed from: g  reason: collision with root package name */
    private float f17274g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f17275h;

    /* renamed from: i  reason: collision with root package name */
    private float f17276i;

    /* renamed from: j  reason: collision with root package name */
    private float f17277j;

    /* renamed from: k  reason: collision with root package name */
    private int f17278k;

    static {
        Covode.recordClassIndex(9589);
    }

    class a implements ViewPager.e {
        static {
            Covode.recordClassIndex(9590);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            if (RoundIndicatorView.this.f17268a > 0) {
                int i3 = i2 % RoundIndicatorView.this.f17268a;
                if (i3 < RoundIndicatorView.this.f17268a) {
                    RoundIndicatorView.this.setPosition(i3);
                } else {
                    RoundIndicatorView.this.setPosition(0);
                }
            }
        }
    }

    public void setPosition(int i2) {
        this.f17278k = i2;
        invalidate();
    }

    public void setCount(int i2) {
        this.f17268a = i2;
        measure(0, 0);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f17269b = viewPager;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new a());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(904);
        super.onDraw(canvas);
        this.f17276i = (float) getPaddingLeft();
        this.f17277j = (float) getPaddingTop();
        this.f17275h.setColor(this.f17271d);
        float f2 = this.f17276i;
        for (int i2 = 0; i2 < this.f17268a; i2++) {
            if (this.f17278k == i2) {
                this.f17275h.setColor(this.f17270c);
            } else {
                this.f17275h.setColor(this.f17271d);
            }
            float f3 = this.f17274g;
            canvas.drawCircle(f2 + f3, this.f17277j + f3, f3, this.f17275h);
            f2 += this.f17273f + this.f17272e;
        }
        MethodCollector.o(904);
    }

    public RoundIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            size = getPaddingLeft() + getPaddingRight();
            int i4 = this.f17268a;
            if (i4 > 0) {
                size = (int) (((float) size) + (((float) i4) * this.f17273f) + (((float) (i4 - 1)) * this.f17272e));
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.max(size, getSuggestedMinimumWidth());
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop();
            if (this.f17268a > 0) {
                size2 += (int) this.f17273f;
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.max(size2, getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }

    private RoundIndicatorView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(901);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a_0, R.attr.a_1, R.attr.a_2, R.attr.a_3, R.attr.a_4, R.attr.and, R.attr.ane, R.attr.anf, R.attr.ang, R.attr.anh}, 0, 0);
        this.f17272e = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f17273f = dimension;
        this.f17274g = dimension / 2.0f;
        this.f17271d = obtainStyledAttributes.getColor(1, -1726079458);
        this.f17270c = obtainStyledAttributes.getColor(2, -10704);
        this.f17268a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f17275h = paint;
        paint.setAntiAlias(true);
        this.f17278k = 0;
        MethodCollector.o(901);
    }
}
