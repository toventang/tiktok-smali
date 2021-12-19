package com.bytedance.tux.widget;

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
import h.w;
import java.util.ArrayList;
import java.util.List;

public final class FlowLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public static final a f45626b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f45627a;

    /* renamed from: c  reason: collision with root package name */
    private final List<List<View>> f45628c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Integer> f45629d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Integer> f45630e;

    /* renamed from: f  reason: collision with root package name */
    private List<View> f45631f;

    /* renamed from: g  reason: collision with root package name */
    private final List<View> f45632g;

    /* renamed from: h  reason: collision with root package name */
    private int f45633h;

    /* renamed from: i  reason: collision with root package name */
    private int f45634i;

    /* renamed from: j  reason: collision with root package name */
    private int f45635j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f45636k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f45637l;

    /* renamed from: m  reason: collision with root package name */
    private View f45638m;
    private boolean n;

    static {
        Covode.recordClassIndex(27782);
    }

    public FlowLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27783);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public final void setGravity(int i2) {
        this.f45633h = i2;
        invalidate();
    }

    public final void setMaxTagLines(int i2) {
        this.f45635j = i2;
        requestLayout();
    }

    public final void setShowEndItem(boolean z) {
        this.f45636k = z;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setShowMore(boolean z) {
        if (this.f45627a != z) {
            this.f45627a = z;
            requestLayout();
        }
    }

    private final void setUpLineInfo(boolean z) {
        int size;
        boolean z2 = z;
        while (true) {
            this.f45628c.clear();
            this.f45629d.clear();
            this.f45630e.clear();
            this.f45631f.clear();
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
                l.a((Object) childAt, "");
                if (!(childAt.getVisibility() == 8 || childAt == this.f45638m)) {
                    int i6 = this.f45634i;
                    if (1 <= i6 && i2 >= i6) {
                        break;
                    }
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (measuredWidth2 + i3 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (measuredWidth - getPaddingLeft()) - getPaddingRight()) {
                            i4++;
                            int i7 = this.f45635j;
                            if (1 <= i7 && i4 > i7) {
                                View view = this.f45638m;
                                if (!z2 || view == null) {
                                    this.n = true;
                                } else {
                                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                    if (layoutParams2 != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                        i3 += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                                        i5 = Math.max(i5, view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
                                        this.f45631f.add(view);
                                        if (i3 > (measuredWidth - getPaddingLeft()) - getPaddingRight() && (size = this.f45631f.size()) > 1) {
                                            int i8 = size - 2;
                                            View view2 = this.f45631f.get(i8);
                                            if (view2 != null) {
                                                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                                                if (layoutParams3 != null) {
                                                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                                    i3 -= (view2.getMeasuredWidth() + marginLayoutParams3.leftMargin) + marginLayoutParams3.rightMargin;
                                                } else {
                                                    throw new w("null cannot be cast to non-null type");
                                                }
                                            }
                                            this.f45631f.remove(i8);
                                        }
                                    } else {
                                        throw new w("null cannot be cast to non-null type");
                                    }
                                }
                            } else {
                                this.f45629d.add(Integer.valueOf(i5));
                                this.f45628c.add(this.f45631f);
                                this.f45630e.add(Integer.valueOf(i3));
                                i5 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                                this.f45631f = new ArrayList();
                                if (z2 && i4 == this.f45635j && this.f45638m != null) {
                                    int width = getWidth();
                                    View view3 = this.f45638m;
                                    if (view3 == null) {
                                        l.a();
                                    }
                                    measuredWidth = width - view3.getMeasuredWidth();
                                }
                                i3 = 0;
                            }
                        }
                        i3 += measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                        i5 = Math.max(i5, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                        this.f45631f.add(childAt);
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
                i2++;
            }
            this.f45629d.add(Integer.valueOf(i5));
            this.f45630e.add(Integer.valueOf(i3));
            this.f45628c.add(this.f45631f);
            if (!z2 && this.f45627a && this.n && this.f45638m != null) {
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
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            l.a((Object) childAt, "");
            if (childAt.getVisibility() != 8 && childAt != this.f45638m) {
                int i10 = this.f45634i;
                if (1 <= i10 && i4 >= i10) {
                    i5 = Math.max(i7, i5);
                    i6 += i8;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measureChild(childAt, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, View.MeasureSpec.getMode(i2)), i3);
                    int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    int i11 = i7 + measuredWidth;
                    if (i11 > (size - getPaddingLeft()) - getPaddingRight()) {
                        i9++;
                        int i12 = this.f45635j;
                        if (1 <= i12 && i9 > i12) {
                            i5 = Math.max(i7, i5);
                            i6 += i8;
                            break;
                        }
                        i5 = Math.max(i5, i7);
                        i6 += i8;
                        i7 = measuredWidth;
                        i8 = measuredHeight;
                    } else {
                        i8 = Math.max(i8, measuredHeight);
                        i7 = i11;
                    }
                    if (i4 == childCount - 1) {
                        i5 = Math.max(i7, i5);
                        i6 += i8;
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else if (i4 == childCount - 1) {
                i5 = Math.max(i7, i5);
                i6 += i8;
            }
            i4++;
        }
        View view = this.f45638m;
        if (view != null) {
            measureChild(view, i2, i3);
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + i5 + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i6 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FlowLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(8067);
        this.f45628c = new ArrayList();
        this.f45629d = new ArrayList();
        this.f45630e = new ArrayList();
        this.f45631f = new ArrayList();
        this.f45632g = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ub, R.attr.uc, R.attr.ud, R.attr.ue, R.attr.uf, R.attr.y5, R.attr.a2i});
        l.a((Object) obtainStyledAttributes, "");
        this.f45633h = obtainStyledAttributes.getInt(0, 0);
        this.f45634i = obtainStyledAttributes.getInt(1, -1);
        this.f45635j = obtainStyledAttributes.getInt(2, -1);
        this.f45636k = obtainStyledAttributes.getBoolean(3, false);
        this.f45637l = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        MethodCollector.o(8067);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        int paddingRight;
        setUpLineInfo(false);
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f45628c.size();
        this.f45632g.clear();
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = this.f45635j;
            int i8 = 1;
            if (1 <= i7 && i6 >= i7) {
                break;
            }
            this.f45631f = this.f45628c.get(i6);
            int intValue = this.f45629d.get(i6).intValue();
            int intValue2 = this.f45630e.get(i6).intValue();
            int i9 = this.f45633h;
            if (i.a(this)) {
                i9 = this.f45633h * -1;
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
            int size2 = this.f45631f.size();
            int i11 = 0;
            while (i11 < size2) {
                if (i.a(this)) {
                    List<View> list = this.f45631f;
                    view = list.get((list.size() - i11) - i8);
                } else {
                    view = this.f45631f.get(i11);
                }
                if (!(view == null || view.getVisibility() == 8)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int i12 = marginLayoutParams.leftMargin + paddingLeft;
                        int i13 = marginLayoutParams.topMargin + paddingTop;
                        int measuredWidth2 = view.getMeasuredWidth() + i12;
                        if (measuredWidth2 > (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin) {
                            measuredWidth2 = (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin;
                        }
                        view.layout(i12, i13, measuredWidth2, view.getMeasuredHeight() + i13);
                        this.f45632g.add(view);
                        paddingLeft += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
                i11++;
                i8 = 1;
            }
            paddingTop += intValue;
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            l.a((Object) childAt, "");
            if (!this.f45632g.contains(childAt)) {
                childAt.layout(0, 0, 0, 0);
            }
        }
    }
}
