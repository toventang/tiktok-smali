package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.a.a.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.p;
import androidx.core.g.f;
import androidx.core.h.v;
import androidx.k.b;
import androidx.k.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class c extends ViewGroup implements p {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f52311i = {16842912};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f52312j = {-16842910};

    /* renamed from: a  reason: collision with root package name */
    final q f52313a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f52314b;

    /* renamed from: c  reason: collision with root package name */
    int f52315c;

    /* renamed from: d  reason: collision with root package name */
    a[] f52316d;

    /* renamed from: e  reason: collision with root package name */
    int f52317e;

    /* renamed from: f  reason: collision with root package name */
    int f52318f;

    /* renamed from: g  reason: collision with root package name */
    public BottomNavigationPresenter f52319g;

    /* renamed from: h  reason: collision with root package name */
    public h f52320h;

    /* renamed from: k  reason: collision with root package name */
    private final int f52321k;

    /* renamed from: l  reason: collision with root package name */
    private final int f52322l;

    /* renamed from: m  reason: collision with root package name */
    private final int f52323m;
    private final int n;
    private final int o;
    private final View.OnClickListener p;
    private final f.a<a> q;
    private ColorStateList r;
    private int s;
    private ColorStateList t;
    private final ColorStateList u;
    private int v;
    private int w;
    private Drawable x;
    private int y;
    private int[] z;

    static boolean a(int i2, int i3) {
        return i2 == -1 ? i3 > 3 : i2 == 0;
    }

    public final int getWindowAnimations() {
        return 0;
    }

    public final ColorStateList getIconTintList() {
        return this.r;
    }

    public final int getItemBackgroundRes() {
        return this.y;
    }

    public final int getItemIconSize() {
        return this.s;
    }

    public final int getItemTextAppearanceActive() {
        return this.w;
    }

    public final int getItemTextAppearanceInactive() {
        return this.v;
    }

    public final ColorStateList getItemTextColor() {
        return this.t;
    }

    public final int getLabelVisibilityMode() {
        return this.f52315c;
    }

    public final int getSelectedItemId() {
        return this.f52317e;
    }

    static {
        Covode.recordClassIndex(32472);
    }

    private a getNewItem() {
        a acquire = this.q.acquire();
        if (acquire == null) {
            return new a(getContext());
        }
        return acquire;
    }

    public final Drawable getItemBackground() {
        a[] aVarArr = this.f52316d;
        if (aVarArr == null || aVarArr.length <= 0) {
            return this.x;
        }
        return aVarArr[0].getBackground();
    }

    public final ColorStateList a() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.ol, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        int[] iArr = f52312j;
        return new ColorStateList(new int[][]{iArr, f52311i, EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public final void b() {
        removeAllViews();
        a[] aVarArr = this.f52316d;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    this.q.release(aVar);
                }
            }
        }
        if (this.f52320h.size() == 0) {
            this.f52317e = 0;
            this.f52318f = 0;
            this.f52316d = null;
            return;
        }
        this.f52316d = new a[this.f52320h.size()];
        boolean a2 = a(this.f52315c, this.f52320h.i().size());
        for (int i2 = 0; i2 < this.f52320h.size(); i2++) {
            this.f52319g.f52286b = true;
            this.f52320h.getItem(i2).setCheckable(true);
            this.f52319g.f52286b = false;
            a newItem = getNewItem();
            this.f52316d[i2] = newItem;
            newItem.setIconTintList(this.r);
            newItem.setIconSize(this.s);
            newItem.setTextColor(this.u);
            newItem.setTextAppearanceInactive(this.v);
            newItem.setTextAppearanceActive(this.w);
            newItem.setTextColor(this.t);
            Drawable drawable = this.x;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.y);
            }
            newItem.setShifting(a2);
            newItem.setLabelVisibilityMode(this.f52315c);
            newItem.a((j) this.f52320h.getItem(i2));
            newItem.setItemPosition(i2);
            newItem.setOnClickListener(this.p);
            addView(newItem);
        }
        int min = Math.min(this.f52320h.size() - 1, this.f52318f);
        this.f52318f = min;
        this.f52320h.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.p
    public final void a(h hVar) {
        this.f52320h = hVar;
    }

    public final void setItemHorizontalTranslationEnabled(boolean z2) {
        this.f52314b = z2;
    }

    public final void setLabelVisibilityMode(int i2) {
        this.f52315c = i2;
    }

    public final void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f52319g = bottomNavigationPresenter;
    }

    public c(Context context) {
        this(context, (byte) 0);
    }

    public final void setIconTintList(ColorStateList colorStateList) {
        this.r = colorStateList;
        a[] aVarArr = this.f52316d;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public final void setItemBackground(Drawable drawable) {
        this.x = drawable;
        a[] aVarArr = this.f52316d;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public final void setItemBackgroundRes(int i2) {
        this.y = i2;
        a[] aVarArr = this.f52316d;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setItemBackground(i2);
            }
        }
    }

    public final void setItemIconSize(int i2) {
        this.s = i2;
        a[] aVarArr = this.f52316d;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setIconSize(i2);
            }
        }
    }

    public final void setItemTextAppearanceActive(int i2) {
        this.w = i2;
        a[] aVarArr = this.f52316d;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i2);
                ColorStateList colorStateList = this.t;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public final void setItemTextAppearanceInactive(int i2) {
        this.v = i2;
        a[] aVarArr = this.f52316d;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i2);
                ColorStateList colorStateList = this.t;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public final void setItemTextColor(ColorStateList colorStateList) {
        this.t = colorStateList;
        a[] aVarArr = this.f52316d;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    private c(Context context, byte b2) {
        super(context, null);
        MethodCollector.i(3035);
        this.q = new f.c(5);
        this.f52317e = 0;
        this.f52318f = 0;
        Resources resources = getResources();
        this.f52321k = resources.getDimensionPixelSize(R.dimen.hd);
        this.f52322l = resources.getDimensionPixelSize(R.dimen.he);
        this.f52323m = resources.getDimensionPixelSize(R.dimen.h8);
        this.n = resources.getDimensionPixelSize(R.dimen.h9);
        this.o = resources.getDimensionPixelSize(R.dimen.hb);
        this.u = a();
        b bVar = new b();
        this.f52313a = bVar;
        bVar.a(0);
        bVar.a(115L);
        bVar.a(new androidx.g.a.a.b());
        bVar.a(new com.google.android.material.internal.j());
        this.p = new View.OnClickListener() {
            /* class com.google.android.material.bottomnavigation.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32473);
            }

            public final void onClick(View view) {
                j itemData = ((a) view).getItemData();
                if (!c.this.f52320h.a(itemData, c.this.f52319g, 0)) {
                    itemData.setChecked(true);
                }
            }
        };
        this.z = new int[5];
        MethodCollector.o(3035);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f52320h.i().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.o, 1073741824);
        if (!a(this.f52315c, size2) || !this.f52314b) {
            if (size2 == 0) {
                i4 = 1;
            } else {
                i4 = size2;
            }
            int min = Math.min(size / i4, this.f52323m);
            int i8 = size - (size2 * min);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr = this.z;
                    iArr[i9] = min;
                    if (i8 > 0) {
                        iArr[i9] = iArr[i9] + 1;
                        i8--;
                    }
                } else {
                    this.z[i9] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f52318f);
            int i10 = this.n;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f52323m, Integer.MIN_VALUE), makeMeasureSpec);
                i10 = Math.max(i10, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            int i11 = size2 - i5;
            int min2 = Math.min(size - (this.f52322l * i11), Math.min(i10, this.f52323m));
            int i12 = size - min2;
            if (i11 == 0) {
                i6 = 1;
            } else {
                i6 = i11;
            }
            int min3 = Math.min(i12 / i6, this.f52321k);
            int i13 = i12 - (i11 * min3);
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).getVisibility() != 8) {
                    int[] iArr2 = this.z;
                    if (i14 == this.f52318f) {
                        i7 = min2;
                    } else {
                        i7 = min3;
                    }
                    iArr2[i14] = i7;
                    if (i13 > 0) {
                        iArr2[i14] = iArr2[i14] + 1;
                        i13--;
                    }
                } else {
                    this.z[i14] = 0;
                }
            }
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.z[i16], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i15 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i15, View.MeasureSpec.makeMeasureSpec(i15, 1073741824), 0), View.resolveSizeAndState(this.o, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (v.e(this) == 1) {
                    int i10 = i6 - i8;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i7);
                } else {
                    childAt.layout(i8, 0, childAt.getMeasuredWidth() + i8, i7);
                }
                i8 += childAt.getMeasuredWidth();
            }
        }
    }
}
