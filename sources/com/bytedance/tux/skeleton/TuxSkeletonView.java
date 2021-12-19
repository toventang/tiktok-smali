package com.bytedance.tux.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TuxSkeletonView extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final a f45312d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private int f45313e;

    /* renamed from: f  reason: collision with root package name */
    private int f45314f;

    static {
        Covode.recordClassIndex(27598);
    }

    public TuxSkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27599);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getSkeletonHeight() {
        return this.f45314f;
    }

    public final int getSkeletonWidth() {
        return this.f45313e;
    }

    public final void setSkeletonHeight(int i2) {
        this.f45314f = i2;
        requestLayout();
    }

    public final void setSkeletonWidth(int i2) {
        this.f45313e = i2;
        requestLayout();
    }

    private static int a(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            mode = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(size, mode);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        super.onMeasure(a(i2), a(i3));
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (a()) {
            int i4 = this.f45313e;
            if (i4 == -2) {
                measuredWidth = measuredWidth2;
            } else if (i4 != -1) {
                if (i4 != 0) {
                    measuredWidth = i4;
                } else {
                    measuredWidth = measuredHeight;
                }
            }
            int i5 = this.f45314f;
            if (i5 == -2) {
                measuredHeight = measuredHeight2;
            } else if (i5 != -1) {
                if (i5 != 0) {
                    measuredHeight = i5;
                } else {
                    measuredHeight = getMeasuredWidth();
                }
            }
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        getPlaceholders().get(0).setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
    }

    private /* synthetic */ TuxSkeletonView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSkeletonView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        this.f45313e = -2;
        this.f45314f = -2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aqs, R.attr.ar1}, 0, 0);
        setSkeletonWidth(obtainStyledAttributes.getLayoutDimension(1, -2));
        setSkeletonHeight(obtainStyledAttributes.getLayoutDimension(0, -2));
        obtainStyledAttributes.recycle();
        b();
    }
}
