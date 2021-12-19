package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.f.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class c extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75981a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private List<List<View>> f75982b;

    /* renamed from: c  reason: collision with root package name */
    private List<Integer> f75983c;

    /* renamed from: d  reason: collision with root package name */
    private List<Integer> f75984d;

    /* renamed from: e  reason: collision with root package name */
    private int f75985e;

    /* renamed from: f  reason: collision with root package name */
    private List<View> f75986f;

    /* renamed from: g  reason: collision with root package name */
    private int f75987g;

    /* renamed from: h  reason: collision with root package name */
    private int f75988h;

    /* renamed from: i  reason: collision with root package name */
    private int f75989i;

    static {
        Covode.recordClassIndex(46859);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46860);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getMaxLine() {
        return this.f75989i;
    }

    public final int getSpaceH() {
        return this.f75988h;
    }

    public final int getSpaceV() {
        return this.f75987g;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final void setMaxLine(int i2) {
        this.f75989i = i2;
    }

    public final void setSpaceH(int i2) {
        this.f75988h = i2;
    }

    public final void setSpaceV(int i2) {
        this.f75987g = i2;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l.d(attributeSet, "");
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l.d(layoutParams, "");
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            l.b(childAt, "");
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i6 + measuredWidth > paddingLeft) {
                    i7 = Math.max(i7, i6);
                    i4 = measuredWidth + this.f75988h;
                    i8 += i9;
                    i10++;
                    int i11 = this.f75989i;
                    if (i11 > 0 && i10 > i11) {
                        i9 = measuredHeight;
                        break;
                    }
                } else {
                    i4 = measuredWidth + this.f75988h + i6;
                    measuredHeight = Math.max(i9, measuredHeight);
                }
                if (i5 == childCount - 1) {
                    i7 = Math.max(i4, i7);
                    i8 += measuredHeight;
                }
                i6 = i4;
                i9 = measuredHeight;
            } else if (i5 == childCount - 1) {
                i7 = Math.max(i6, i7);
                i8 += i9;
            }
            i5++;
        }
        if (i9 > 0) {
            i8 += ((i8 / i9) - 1) * this.f75987g;
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + i7 + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i8 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    private /* synthetic */ c(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9871);
        this.f75982b = new ArrayList();
        this.f75983c = new ArrayList();
        this.f75984d = new ArrayList();
        int i3 = -1;
        this.f75985e = -1;
        this.f75986f = new ArrayList();
        this.f75987g = 5;
        this.f75988h = 10;
        if (g.a(Locale.getDefault()) == 1) {
            this.f75985e = this.f75985e == -1 ? 1 : i3;
        }
        MethodCollector.o(9871);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        this.f75982b.clear();
        this.f75983c.clear();
        this.f75984d.clear();
        this.f75986f.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (true) {
            i6 = 8;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            l.b(childAt, "");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (measuredWidth + i9 > (width - getPaddingLeft()) - getPaddingRight()) {
                    i10++;
                    int i12 = this.f75989i;
                    if (i12 > 0 && i10 > i12) {
                        break;
                    }
                    this.f75983c.add(Integer.valueOf(i11));
                    this.f75982b.add(this.f75986f);
                    this.f75984d.add(Integer.valueOf(i9));
                    this.f75986f = new ArrayList();
                    i11 = measuredHeight;
                    i9 = 0;
                }
                i9 += measuredWidth + this.f75988h;
                i11 = Math.max(i11, measuredHeight);
                this.f75986f.add(childAt);
            }
            i8++;
        }
        this.f75983c.add(Integer.valueOf(i11));
        this.f75984d.add(Integer.valueOf(i9));
        this.f75982b.add(this.f75986f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f75982b.size();
        int i13 = 0;
        while (i13 < size) {
            List<View> list = this.f75982b.get(i13);
            this.f75986f = list;
            int size2 = list.size();
            int intValue = this.f75983c.get(i13).intValue() + this.f75987g;
            int intValue2 = this.f75984d.get(i13).intValue();
            int i14 = this.f75985e;
            if (i14 == -1) {
                paddingLeft = getPaddingLeft();
            } else if (i14 == 0) {
                paddingLeft = ((width - intValue2) / 2) + getPaddingLeft();
            } else if (i14 == i7) {
                paddingLeft = (width - (intValue2 + getPaddingLeft())) - getPaddingRight();
                n.f((List) this.f75986f);
            }
            int i15 = 0;
            while (i15 < size2) {
                View view = this.f75986f.get(i15);
                if (view.getVisibility() != i6) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int i16 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i17 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i16, i17, i16 + view.getMeasuredWidth(), view.getMeasuredHeight() + i17);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.f75988h;
                }
                i15++;
                i6 = 8;
            }
            paddingTop += intValue;
            i13++;
            i7 = 1;
            i6 = 8;
        }
    }
}
