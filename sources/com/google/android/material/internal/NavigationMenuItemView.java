package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.an;
import androidx.core.content.a.f;
import androidx.core.h.a;
import androidx.core.h.a.d;
import androidx.core.h.v;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class NavigationMenuItemView extends d implements p.a {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f52486h = {16842912};

    /* renamed from: c  reason: collision with root package name */
    boolean f52487c;

    /* renamed from: d  reason: collision with root package name */
    final CheckedTextView f52488d;

    /* renamed from: e  reason: collision with root package name */
    FrameLayout f52489e;

    /* renamed from: i  reason: collision with root package name */
    private final int f52490i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f52491j;

    /* renamed from: k  reason: collision with root package name */
    private j f52492k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f52493l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f52494m;
    private Drawable n;
    private final a o;

    @Override // androidx.appcompat.view.menu.p.a
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public j getItemData() {
        return this.f52492k;
    }

    static {
        Covode.recordClassIndex(32534);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f52491j = z;
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, 0, i2, 0);
    }

    public void setIconPadding(int i2) {
        this.f52488d.setCompoundDrawablePadding(i2);
    }

    public void setTextAppearance(int i2) {
        h.a(this.f52488d, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f52488d.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f52488d.setText(charSequence);
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f52488d.setChecked(z);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        j jVar = this.f52492k;
        if (jVar != null && jVar.isCheckable() && this.f52492k.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f52486h);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f52487c != z) {
            this.f52487c = z;
            this.o.a(this.f52488d, 2048);
        }
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f52493l = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f52494m = z;
        j jVar = this.f52492k;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    private void setActionView(View view) {
        MethodCollector.i(3536);
        if (view != null) {
            if (this.f52489e == null) {
                this.f52489e = (FrameLayout) ((ViewStub) findViewById(R.id.aks)).inflate();
            }
            this.f52489e.removeAllViews();
            this.f52489e.addView(view);
        }
        MethodCollector.o(3536);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f52494m) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.e(drawable).mutate();
                androidx.core.graphics.drawable.a.a(drawable, this.f52493l);
            }
            int i2 = this.f52490i;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f52491j) {
            if (this.n == null) {
                Drawable a2 = f.a(getResources(), R.drawable.b4y, getContext().getTheme());
                this.n = a2;
                if (a2 != null) {
                    int i3 = this.f52490i;
                    a2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.n;
        }
        h.a(this.f52488d, drawable);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public final void a(j jVar) {
        int i2;
        StateListDrawable stateListDrawable;
        this.f52492k = jVar;
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.oi, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f52486h, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            v.a(this, stateListDrawable);
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        an.a(this, jVar.getTooltipText());
        if (this.f52492k.getTitle() == null && this.f52492k.getIcon() == null && this.f52492k.getActionView() != null) {
            this.f52488d.setVisibility(8);
            FrameLayout frameLayout = this.f52489e;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f52489e.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f52488d.setVisibility(0);
        FrameLayout frameLayout2 = this.f52489e;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f52489e.setLayoutParams(aVar2);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NavigationMenuItemView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        AnonymousClass1 r3 = new a() {
            /* class com.google.android.material.internal.NavigationMenuItemView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32535);
            }

            @Override // androidx.core.h.a
            public final void a(View view, d dVar) {
                super.a(view, dVar);
                dVar.a(NavigationMenuItemView.this.f52487c);
            }
        };
        this.o = r3;
        setOrientation(0);
        com.a.a(LayoutInflater.from(context), R.layout.vw, this, true);
        this.f52490i = context.getResources().getDimensionPixelSize(R.dimen.ht);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.akt);
        this.f52488d = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        v.a(checkedTextView, r3);
    }
}
