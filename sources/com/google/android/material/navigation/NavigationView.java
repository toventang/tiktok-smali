package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.view.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.al;
import androidx.core.content.b;
import androidx.core.h.ad;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.e;
import com.google.android.material.internal.f;
import com.google.android.material.internal.h;
import com.google.android.material.internal.k;
import com.zhiliaoapp.musically.R;

public class NavigationView extends h {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f52569d = {16842912};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f52570e = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    a f52571c;

    /* renamed from: f  reason: collision with root package name */
    private final e f52572f;

    /* renamed from: g  reason: collision with root package name */
    private final f f52573g;

    /* renamed from: h  reason: collision with root package name */
    private final int f52574h;

    /* renamed from: i  reason: collision with root package name */
    private MenuInflater f52575i;

    public interface a {
        static {
            Covode.recordClassIndex(32572);
        }

        boolean a();
    }

    public Menu getMenu() {
        return this.f52572f;
    }

    public MenuItem getCheckedItem() {
        return this.f52573g.f52535e.f52546b;
    }

    public Drawable getItemBackground() {
        return this.f52573g.f52541k;
    }

    public int getItemHorizontalPadding() {
        return this.f52573g.f52542l;
    }

    public int getItemIconPadding() {
        return this.f52573g.f52543m;
    }

    public ColorStateList getItemIconTintList() {
        return this.f52573g.f52540j;
    }

    public ColorStateList getItemTextColor() {
        return this.f52573g.f52539i;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.navigation.NavigationView.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32571);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public Bundle f52577a;

        static {
            Covode.recordClassIndex(32570);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f52577a = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.f52577a);
        }
    }

    public int getHeaderCount() {
        return this.f52573g.f52532b.getChildCount();
    }

    static {
        Covode.recordClassIndex(32568);
    }

    private MenuInflater getMenuInflater() {
        if (this.f52575i == null) {
            this.f52575i = new g(getContext());
        }
        return this.f52575i;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f52577a = new Bundle();
        this.f52572f.a(savedState.f52577a);
        return savedState;
    }

    public void setNavigationItemSelectedListener(a aVar) {
        this.f52571c = aVar;
    }

    public void setItemBackground(Drawable drawable) {
        this.f52573g.a(drawable);
    }

    public void setItemHorizontalPadding(int i2) {
        this.f52573g.b(i2);
    }

    public void setItemIconPadding(int i2) {
        this.f52573g.c(i2);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f52573g.a(colorStateList);
    }

    public void setItemTextAppearance(int i2) {
        this.f52573g.a(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f52573g.b(colorStateList);
    }

    public void setCheckedItem(int i2) {
        MenuItem findItem = this.f52572f.findItem(i2);
        if (findItem != null) {
            this.f52573g.a((j) findItem);
        }
    }

    public void setItemBackgroundResource(int i2) {
        setItemBackground(b.a(getContext(), i2));
    }

    public void setItemHorizontalPaddingResource(int i2) {
        this.f52573g.b(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconPaddingResource(int i2) {
        this.f52573g.c(getResources().getDimensionPixelSize(i2));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2667d);
        this.f52572f.b(savedState.f52577a);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f52572f.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f52573g.a((j) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    @Override // com.google.android.material.internal.h
    public final void a(ad adVar) {
        f fVar = this.f52573g;
        int b2 = adVar.b();
        if (fVar.n != b2) {
            fVar.n = b2;
            if (fVar.f52532b.getChildCount() == 0) {
                fVar.f52531a.setPadding(0, fVar.n, 0, fVar.f52531a.getPaddingBottom());
            }
        }
        v.b(fVar.f52532b, adVar);
    }

    private ColorStateList a(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = androidx.appcompat.a.a.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.ol, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        int[] iArr = f52570e;
        return new ColorStateList(new int[][]{iArr, f52569d, EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.f52574h), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f52574h, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    private NavigationView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.a6_);
        ColorStateList a2;
        int i2;
        boolean z;
        MethodCollector.i(4890);
        f fVar = new f();
        this.f52573g = fVar;
        e eVar = new e(context);
        this.f52572f = eVar;
        al b3 = k.b(context, attributeSet, new int[]{16842964, 16842973, 16843039, R.attr.sh, R.attr.va, R.attr.xt, R.attr.xv, R.attr.xx, R.attr.xz, R.attr.y7, R.attr.y_, R.attr.a5f}, R.attr.a6_, R.style.r1, new int[0]);
        v.a(this, b3.a(0));
        if (b3.f(3)) {
            v.a(this, (float) b3.e(3, 0));
        }
        setFitsSystemWindows(b3.a(1, false));
        this.f52574h = b3.e(2, 0);
        if (b3.f(8)) {
            a2 = b3.e(8);
        } else {
            a2 = a(16842808);
        }
        if (b3.f(9)) {
            i2 = b3.g(9, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        ColorStateList colorStateList = b3.f(10) ? b3.e(10) : null;
        if (!z && colorStateList == null) {
            colorStateList = a(16842806);
        }
        Drawable a3 = b3.a(5);
        if (b3.f(6)) {
            fVar.b(b3.e(6, 0));
        }
        int e2 = b3.e(7, 0);
        eVar.a(new h.a() {
            /* class com.google.android.material.navigation.NavigationView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32569);
            }

            @Override // androidx.appcompat.view.menu.h.a
            public final void a(androidx.appcompat.view.menu.h hVar) {
            }

            @Override // androidx.appcompat.view.menu.h.a
            public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
                if (NavigationView.this.f52571c == null || !NavigationView.this.f52571c.a()) {
                    return false;
                }
                return true;
            }
        });
        fVar.f52534d = 1;
        fVar.a(context, eVar);
        fVar.a(a2);
        if (z) {
            fVar.a(i2);
        }
        fVar.b(colorStateList);
        fVar.a(a3);
        fVar.c(e2);
        eVar.a(fVar);
        if (fVar.f52531a == null) {
            fVar.f52531a = (NavigationMenuView) com.a.a(fVar.f52536f, R.layout.vv, this, false);
            if (fVar.f52535e == null) {
                fVar.f52535e = new f.b();
            }
            fVar.f52532b = (LinearLayout) com.a.a(fVar.f52536f, R.layout.vs, fVar.f52531a, false);
            fVar.f52531a.setAdapter(fVar.f52535e);
        }
        addView(fVar.f52531a);
        if (b3.f(11)) {
            int g2 = b3.g(11, 0);
            fVar.b(true);
            getMenuInflater().inflate(g2, eVar);
            fVar.b(false);
            fVar.a(false);
        }
        if (b3.f(4)) {
            fVar.f52532b.addView(com.a.a(fVar.f52536f, b3.g(4, 0), fVar.f52532b, false));
            fVar.f52531a.setPadding(0, 0, 0, fVar.f52531a.getPaddingBottom());
        }
        b3.f1549a.recycle();
        MethodCollector.o(4890);
    }
}
