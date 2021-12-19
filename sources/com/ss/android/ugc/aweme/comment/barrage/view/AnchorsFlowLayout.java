package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class AnchorsFlowLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71648b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f71649a;

    /* renamed from: c  reason: collision with root package name */
    private final List<List<View>> f71650c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Integer> f71651d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Integer> f71652e;

    /* renamed from: f  reason: collision with root package name */
    private List<View> f71653f;

    /* renamed from: g  reason: collision with root package name */
    private final List<View> f71654g;

    /* renamed from: h  reason: collision with root package name */
    private int f71655h;

    /* renamed from: i  reason: collision with root package name */
    private int f71656i;

    /* renamed from: j  reason: collision with root package name */
    private int f71657j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f71658k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f71659l;

    /* renamed from: m  reason: collision with root package name */
    private View f71660m;
    private boolean n;
    private int o;
    private int p;

    static {
        Covode.recordClassIndex(44076);
    }

    public AnchorsFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44077);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getFinalLines() {
        return this.o;
    }

    public final int getFirstLineCount() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final void setFinalLines(int i2) {
        this.o = i2;
    }

    public final void setFirstLineCount(int i2) {
        this.p = i2;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public final void setGravity(int i2) {
        this.f71655h = i2;
        invalidate();
    }

    public final void setMaxTagLines(int i2) {
        this.f71657j = i2;
        requestLayout();
    }

    public final void setShowEndItem(boolean z) {
        this.f71658k = z;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setShowMore(boolean z) {
        if (this.f71649a != z) {
            this.f71649a = z;
            requestLayout();
        }
    }

    private final void setUpLineInfo(boolean z) {
        int size;
        boolean z2 = z;
        while (true) {
            this.f71650c.clear();
            this.f71651d.clear();
            this.f71652e.clear();
            this.f71653f.clear();
            int measuredWidth = getMeasuredWidth();
            int childCount = getChildCount();
            this.n = z2;
            int i2 = 0;
            int i3 = 0;
            int i4 = 1;
            int i5 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                l.b(childAt, "");
                if (!(childAt.getVisibility() == 8 || childAt == this.f71660m)) {
                    int i6 = this.f71656i;
                    if (1 <= i6 && i2 >= i6) {
                        break;
                    }
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (measuredWidth2 + i3 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (measuredWidth - getPaddingLeft()) - getPaddingRight()) {
                        i4++;
                        int i7 = this.f71657j;
                        if (1 <= i7 && i4 > i7) {
                            View view = this.f71660m;
                            if (!z2 || view == null) {
                                this.n = true;
                            } else {
                                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                i3 += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                                i5 = Math.max(i5, view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
                                this.f71653f.add(view);
                                if (i3 > (measuredWidth - getPaddingLeft()) - getPaddingRight() && (size = this.f71653f.size()) > 1) {
                                    int i8 = size - 2;
                                    View view2 = this.f71653f.get(i8);
                                    if (view2 != null) {
                                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                                        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                        i3 -= (view2.getMeasuredWidth() + marginLayoutParams3.leftMargin) + marginLayoutParams3.rightMargin;
                                    }
                                    this.f71653f.remove(i8);
                                }
                            }
                        } else {
                            this.f71651d.add(Integer.valueOf(i5));
                            this.f71650c.add(this.f71653f);
                            this.f71652e.add(Integer.valueOf(i3));
                            i5 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                            this.f71653f = new ArrayList();
                            if (z2 && i4 == this.f71657j && this.f71660m != null) {
                                int width = getWidth();
                                View view3 = this.f71660m;
                                if (view3 == null) {
                                    l.b();
                                }
                                measuredWidth = width - view3.getMeasuredWidth();
                            }
                            i3 = 0;
                        }
                    }
                    i3 += measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    i5 = Math.max(i5, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                    this.f71653f.add(childAt);
                }
                i2++;
            }
            this.f71651d.add(Integer.valueOf(i5));
            this.f71652e.add(Integer.valueOf(i3));
            this.f71650c.add(this.f71653f);
            if (!z2 && this.f71649a && this.n && this.f71660m != null) {
                z2 = true;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int i4 = i3;
        int size2 = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            l.b(childAt, "");
            if (childAt.getVisibility() != 8 && childAt != this.f71660m) {
                int i12 = this.f71656i;
                if (1 <= i12 && i5 >= i12) {
                    i6 = Math.max(i8, i6);
                    i7 += i9;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i4 = i4;
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, View.MeasureSpec.getMode(i2)), i4);
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i13 = i8 + measuredWidth;
                if (i13 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i10++;
                    this.o = i10;
                    int i14 = this.f71657j;
                    if (1 <= i14 && i10 > i14) {
                        i6 = Math.max(i8, i6);
                        i7 += i9;
                        break;
                    }
                    i6 = Math.max(i6, i8);
                    i7 += i9;
                    i8 = measuredWidth;
                    i9 = measuredHeight;
                } else {
                    if (i10 == 1) {
                        i11++;
                        this.p = i11;
                    }
                    i9 = Math.max(i9, measuredHeight);
                    i8 = i13;
                }
                if (i5 == childCount - 1) {
                    i6 = Math.max(i8, i6);
                    i7 += i9;
                }
            } else if (i5 == childCount - 1) {
                i6 = Math.max(i8, i6);
                i7 += i9;
            }
            i5++;
        }
        View view = this.f71660m;
        if (view != null) {
            measureChild(view, i2, i4);
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + i6 + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i7 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    private /* synthetic */ AnchorsFlowLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AnchorsFlowLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(1295);
        this.f71650c = new ArrayList();
        this.f71651d = new ArrayList();
        this.f71652e = new ArrayList();
        this.f71653f = new ArrayList();
        this.f71654g = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ub, R.attr.uc, R.attr.ud, R.attr.ue, R.attr.uf, R.attr.y5, R.attr.a2i});
        l.b(obtainStyledAttributes, "");
        this.f71655h = obtainStyledAttributes.getInt(0, 0);
        this.f71656i = obtainStyledAttributes.getInt(1, -1);
        this.f71657j = obtainStyledAttributes.getInt(2, -1);
        this.f71658k = obtainStyledAttributes.getBoolean(3, false);
        this.f71659l = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        MethodCollector.o(1295);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        int paddingRight;
        setUpLineInfo(false);
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f71650c.size();
        this.f71654g.clear();
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = this.f71657j;
            int i8 = 1;
            if (1 <= i7 && i6 >= i7) {
                break;
            }
            this.f71653f = this.f71650c.get(i6);
            int intValue = this.f71651d.get(i6).intValue();
            int intValue2 = this.f71652e.get(i6).intValue();
            int i9 = this.f71655h;
            if (i.a(this)) {
                i9 = this.f71655h * -1;
            }
            if (i9 == -1) {
                paddingLeft = getPaddingLeft();
            } else if (i9 == 0) {
                paddingLeft = ((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - intValue2) / 2) + getPaddingLeft();
            } else if (i9 == 1) {
                int i10 = measuredWidth - intValue2;
                if (i.a(this)) {
                    paddingRight = getPaddingLeft();
                } else {
                    paddingRight = getPaddingRight();
                }
                paddingLeft = i10 - paddingRight;
            }
            int size2 = this.f71653f.size();
            int i11 = 0;
            while (i11 < size2) {
                if (i.a(this)) {
                    List<View> list = this.f71653f;
                    view = list.get((list.size() - i11) - i8);
                } else {
                    view = this.f71653f.get(i11);
                }
                if (!(view == null || view.getVisibility() == 8)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i12 = marginLayoutParams.leftMargin + paddingLeft;
                    int i13 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth2 = view.getMeasuredWidth() + i12;
                    if (measuredWidth2 > (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin) {
                        measuredWidth2 = (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin;
                    }
                    view.layout(i12, i13, measuredWidth2, view.getMeasuredHeight() + i13);
                    this.f71654g.add(view);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                i11++;
                i8 = 1;
            }
            paddingTop += intValue;
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            l.b(childAt, "");
            if (!this.f71654g.contains(childAt)) {
                childAt.layout(0, 0, 0, 0);
            }
        }
    }
}
