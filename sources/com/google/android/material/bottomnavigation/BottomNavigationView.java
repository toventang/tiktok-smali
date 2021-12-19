package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.al;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.internal.k;
import com.zhiliaoapp.musically.R;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public b f52290a;

    /* renamed from: b  reason: collision with root package name */
    public a f52291b;

    /* renamed from: c  reason: collision with root package name */
    private final h f52292c;

    /* renamed from: d  reason: collision with root package name */
    private final c f52293d;

    /* renamed from: e  reason: collision with root package name */
    private final BottomNavigationPresenter f52294e;

    /* renamed from: f  reason: collision with root package name */
    private MenuInflater f52295f;

    public interface a {
        static {
            Covode.recordClassIndex(32468);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(32469);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(32464);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f52292c;
    }

    public Drawable getItemBackground() {
        return this.f52293d.getItemBackground();
    }

    public int getItemBackgroundResource() {
        return this.f52293d.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f52293d.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f52293d.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.f52293d.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f52293d.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f52293d.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f52293d.getLabelVisibilityMode();
    }

    public int getSelectedItemId() {
        return this.f52293d.getSelectedItemId();
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationView.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32467);
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
        Bundle f52297a;

        static {
            Covode.recordClassIndex(32466);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f52297a = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.f52297a);
        }
    }

    private MenuInflater getMenuInflater() {
        if (this.f52295f == null) {
            this.f52295f = new g(getContext());
        }
        return this.f52295f;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f52297a = new Bundle();
        this.f52292c.a(savedState.f52297a);
        return savedState;
    }

    public void setOnNavigationItemReselectedListener(a aVar) {
        this.f52291b = aVar;
    }

    public void setOnNavigationItemSelectedListener(b bVar) {
        this.f52290a = bVar;
    }

    public void setItemBackground(Drawable drawable) {
        this.f52293d.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i2) {
        this.f52293d.setItemBackgroundRes(i2);
    }

    public void setItemIconSize(int i2) {
        this.f52293d.setItemIconSize(i2);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f52293d.setIconTintList(colorStateList);
    }

    public void setItemTextAppearanceActive(int i2) {
        this.f52293d.setItemTextAppearanceActive(i2);
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.f52293d.setItemTextAppearanceInactive(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f52293d.setItemTextColor(colorStateList);
    }

    public void setItemIconSizeRes(int i2) {
        setItemIconSize(getResources().getDimensionPixelSize(i2));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2667d);
        this.f52292c.b(savedState.f52297a);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f52293d.f52314b != z) {
            this.f52293d.setItemHorizontalTranslationEnabled(z);
            this.f52294e.a(false);
        }
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f52293d.getLabelVisibilityMode() != i2) {
            this.f52293d.setLabelVisibilityMode(i2);
            this.f52294e.a(false);
        }
    }

    public void setSelectedItemId(int i2) {
        MenuItem findItem = this.f52292c.findItem(i2);
        if (findItem != null && !this.f52292c.a(findItem, this.f52294e, 0)) {
            findItem.setChecked(true);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private BottomNavigationView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.ku);
        MethodCollector.i(6019);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.f52294e = bottomNavigationPresenter;
        h bVar = new b(context);
        this.f52292c = bVar;
        c cVar = new c(context);
        this.f52293d = cVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        cVar.setLayoutParams(layoutParams);
        bottomNavigationPresenter.f52285a = cVar;
        bottomNavigationPresenter.f52287c = 1;
        cVar.setPresenter(bottomNavigationPresenter);
        bVar.a(bottomNavigationPresenter);
        bottomNavigationPresenter.a(getContext(), bVar);
        al b3 = k.b(context, attributeSet, new int[]{R.attr.sh, R.attr.xt, R.attr.xw, R.attr.xy, R.attr.xz, R.attr.y8, R.attr.y9, R.attr.y_, R.attr.z8, R.attr.a5f}, R.attr.ku, R.style.qx, 6, 5);
        if (b3.f(4)) {
            cVar.setIconTintList(b3.e(4));
        } else {
            cVar.setIconTintList(cVar.a());
        }
        setItemIconSize(b3.e(3, getResources().getDimensionPixelSize(R.dimen.hc)));
        if (b3.f(6)) {
            setItemTextAppearanceInactive(b3.g(6, 0));
        }
        if (b3.f(5)) {
            setItemTextAppearanceActive(b3.g(5, 0));
        }
        if (b3.f(7)) {
            setItemTextColor(b3.e(7));
        }
        if (b3.f(0)) {
            v.a(this, (float) b3.e(0, 0));
        }
        setLabelVisibilityMode(b3.c(8, -1));
        setItemHorizontalTranslationEnabled(b3.a(2, true));
        cVar.setItemBackgroundRes(b3.g(1, 0));
        if (b3.f(9)) {
            int g2 = b3.g(9, 0);
            bottomNavigationPresenter.f52286b = true;
            getMenuInflater().inflate(g2, bVar);
            bottomNavigationPresenter.f52286b = false;
            bottomNavigationPresenter.a(true);
        }
        b3.f1549a.recycle();
        addView(cVar, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            View view = new View(context);
            view.setBackgroundColor(androidx.core.content.b.c(context, R.color.gx));
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.hg)));
            addView(view);
        }
        bVar.a(new h.a() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32465);
            }

            @Override // androidx.appcompat.view.menu.h.a
            public final void a(h hVar) {
            }

            @Override // androidx.appcompat.view.menu.h.a
            public final boolean a(h hVar, MenuItem menuItem) {
                if (BottomNavigationView.this.f52291b != null && menuItem.getItemId() == BottomNavigationView.this.getSelectedItemId()) {
                    return true;
                }
                if (BottomNavigationView.this.f52290a == null || BottomNavigationView.this.f52290a.a()) {
                    return false;
                }
                return true;
            }
        });
        MethodCollector.o(6019);
    }
}
