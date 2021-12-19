package com.bytedance.tux.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.a.g;
import androidx.core.h.x;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.w;
import java.util.Iterator;

public final class TuxSkeletonLayout extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f45305d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private int f45306e;

    /* renamed from: f  reason: collision with root package name */
    private int f45307f;

    /* renamed from: g  reason: collision with root package name */
    private int f45308g;

    /* renamed from: h  reason: collision with root package name */
    private int f45309h;

    /* renamed from: i  reason: collision with root package name */
    private int f45310i;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f45311j;

    static {
        Covode.recordClassIndex(27596);
    }

    public TuxSkeletonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27597);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getPreviewItemRes() {
        return this.f45308g;
    }

    public final int getRepeat() {
        return this.f45306e;
    }

    public final int getRepeatOrientation() {
        return this.f45307f;
    }

    public final void setRepeat(int i2) {
        if (this.f45306e != i2) {
            this.f45306e = i2;
            if (a() && this.f45308g != 0) {
                requestLayout();
            }
        }
    }

    private final void a(int i2) {
        MethodCollector.i(8105);
        while (this.f45311j.getChildCount() < i2) {
            FrameLayout.inflate(getContext(), this.f45308g, this.f45311j);
        }
        while (this.f45311j.getChildCount() > i2) {
            this.f45311j.removeViewAt(0);
        }
        MethodCollector.o(8105);
    }

    public final void setRepeatOrientation(int i2) {
        MethodCollector.i(8078);
        if (this.f45307f != i2) {
            if (a() && this.f45308g != 0) {
                if (i2 == 2 || this.f45307f == 2) {
                    this.f45311j.removeAllViews();
                } else {
                    requestLayout();
                }
            }
            this.f45307f = i2;
        }
        MethodCollector.o(8078);
    }

    public final void setPreviewItemRes(int i2) {
        MethodCollector.i(8084);
        if (this.f45308g != i2) {
            this.f45308g = i2;
            this.f45311j.removeAllViews();
            FrameLayout.inflate(getContext(), this.f45308g, this.f45311j);
            this.f45311j.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f45309h = this.f45311j.getMeasuredWidth();
            this.f45310i = this.f45311j.getMeasuredHeight();
            this.f45311j.removeAllViews();
        }
        MethodCollector.o(8084);
    }

    private static int a(int i2, int i3) {
        int i4;
        int i5 = i2 / i3;
        if (i2 % i3 == 0) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        return i5 + i4;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        boolean z;
        int i4 = 0;
        if (this.f45308g != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!a() || !z) {
            Iterator<View> a2 = x.a(this).a();
            while (a2.hasNext()) {
                a2.next().setVisibility(0);
            }
            this.f45311j.setVisibility(8);
        } else {
            Iterator<View> a3 = x.a(this).a();
            while (a3.hasNext()) {
                a3.next().setVisibility(8);
            }
            this.f45311j.setVisibility(0);
            LinearLayout linearLayout = this.f45311j;
            int i5 = this.f45307f;
            if (i5 != 0) {
                if (i5 == 1 || i5 == 2) {
                    i4 = 1;
                } else {
                    throw new IllegalStateException("wrong repeatOrientation");
                }
            }
            linearLayout.setOrientation(i4);
            int size = (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight();
            int size2 = (View.MeasureSpec.getSize(i3) - getPaddingTop()) - getPaddingBottom();
            if (this.f45307f == 2) {
                a(this.f45306e, size, size2);
            } else {
                int i6 = this.f45306e;
                if (i6 > 0) {
                    a(i6);
                } else if (this.f45311j.getOrientation() == 0) {
                    if (size == 0) {
                        a(1);
                    } else {
                        a(a(size, this.f45309h));
                    }
                } else if (size2 == 0) {
                    a(1);
                } else {
                    a(a(size2, this.f45310i));
                }
            }
        }
        super.onMeasure(i2, i3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ TuxSkeletonLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSkeletonLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(8175);
        this.f45309h = Integer.MAX_VALUE;
        this.f45310i = Integer.MAX_VALUE;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f45311j = linearLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aqt, R.attr.aqw, R.attr.aqz, R.attr.ar0}, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setLoading(g.a(obtainStyledAttributes));
        }
        setPreviewItemRes(obtainStyledAttributes.getResourceId(1, 0));
        setRepeat(obtainStyledAttributes.getInt(2, 0));
        setRepeatOrientation(obtainStyledAttributes.getInt(3, 0));
        obtainStyledAttributes.recycle();
        addView(this.f45311j, new ViewGroup.MarginLayoutParams(-1, -1));
        MethodCollector.o(8175);
    }

    private final void a(int i2, int i3, int i4) {
        int a2;
        int a3;
        int i5;
        MethodCollector.i(8109);
        int i6 = 1;
        if (i3 == 0) {
            a2 = 1;
        } else {
            a2 = a(i3, this.f45309h);
        }
        if (i4 == 0) {
            a3 = 1;
        } else {
            a3 = a(i4, this.f45310i);
        }
        if (i2 <= 0) {
            i2 = a2 * a3;
        }
        int i7 = i2 / a2;
        int i8 = i2 % a2;
        if (i8 != 0) {
            i6 = 0;
        }
        int i9 = i7 - i6;
        if (i8 == 0) {
            i8 = a2;
        }
        while (true) {
            i5 = i9 + 1;
            if (this.f45311j.getChildCount() >= i5) {
                break;
            }
            LinearLayout linearLayout = this.f45311j;
            Context context = getContext();
            l.a((Object) context, "");
            TuxSkeletonLayout tuxSkeletonLayout = new TuxSkeletonLayout(context, (AttributeSet) null, 6);
            tuxSkeletonLayout.setRepeatOrientation(0);
            tuxSkeletonLayout.setPreviewItemRes(this.f45308g);
            linearLayout.addView(tuxSkeletonLayout, new FrameLayout.LayoutParams(-1, -2));
        }
        while (this.f45311j.getChildCount() > i5) {
            this.f45311j.removeViewAt(0);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            View childAt = this.f45311j.getChildAt(i10);
            if (childAt != null) {
                ((TuxSkeletonLayout) childAt).setRepeat(a2);
            } else {
                w wVar = new w("null cannot be cast to non-null type");
                MethodCollector.o(8109);
                throw wVar;
            }
        }
        View childAt2 = this.f45311j.getChildAt(i9);
        if (childAt2 != null) {
            ((TuxSkeletonLayout) childAt2).setRepeat(i8);
            this.f45311j.requestLayout();
            MethodCollector.o(8109);
            return;
        }
        w wVar2 = new w("null cannot be cast to non-null type");
        MethodCollector.o(8109);
        throw wVar2;
    }
}
