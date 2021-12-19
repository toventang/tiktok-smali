package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.an;
import androidx.core.content.b;
import androidx.core.h.s;
import androidx.core.h.v;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class a extends FrameLayout implements p.a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f52298a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private final int f52299b;

    /* renamed from: c  reason: collision with root package name */
    private float f52300c;

    /* renamed from: d  reason: collision with root package name */
    private float f52301d;

    /* renamed from: e  reason: collision with root package name */
    private float f52302e;

    /* renamed from: f  reason: collision with root package name */
    private int f52303f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f52304g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f52305h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f52306i;

    /* renamed from: j  reason: collision with root package name */
    private final TextView f52307j;

    /* renamed from: k  reason: collision with root package name */
    private int f52308k;

    /* renamed from: l  reason: collision with root package name */
    private j f52309l;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f52310m;

    @Override // androidx.appcompat.view.menu.p.a
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public j getItemData() {
        return this.f52309l;
    }

    public int getItemPosition() {
        return this.f52308k;
    }

    static {
        Covode.recordClassIndex(32470);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setItemBackground(Drawable drawable) {
        v.a(this, drawable);
    }

    public void setItemPosition(int i2) {
        this.f52308k = i2;
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f52310m = colorStateList;
        j jVar = this.f52309l;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setItemBackground(int i2) {
        Drawable a2;
        if (i2 == 0) {
            a2 = null;
        } else {
            a2 = b.a(getContext(), i2);
        }
        setItemBackground(a2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f52306i.setTextColor(colorStateList);
            this.f52307j.setTextColor(colorStateList);
        }
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        j jVar = this.f52309l;
        if (jVar != null && jVar.isCheckable() && this.f52309l.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f52298a);
        }
        return onCreateDrawableState;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = androidx.core.graphics.drawable.a.e(drawable).mutate();
            androidx.core.graphics.drawable.a.a(drawable, this.f52310m);
        }
        this.f52305h.setImageDrawable(drawable);
    }

    public void setIconSize(int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52305h.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f52305h.setLayoutParams(layoutParams);
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f52303f != i2) {
            this.f52303f = i2;
            j jVar = this.f52309l;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f52304g != z) {
            this.f52304g = z;
            j jVar = this.f52309l;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i2) {
        h.a(this.f52307j, i2);
        a(this.f52306i.getTextSize(), this.f52307j.getTextSize());
    }

    public void setTextAppearanceInactive(int i2) {
        h.a(this.f52306i, i2);
        a(this.f52306i.getTextSize(), this.f52307j.getTextSize());
    }

    public void setTitle(CharSequence charSequence) {
        this.f52306i.setText(charSequence);
        this.f52307j.setText(charSequence);
        j jVar = this.f52309l;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f52306i.setEnabled(z);
        this.f52307j.setEnabled(z);
        this.f52305h.setEnabled(z);
        if (z) {
            v.a(this, s.a(getContext()));
        } else {
            v.a(this, (s) null);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public final void a(j jVar) {
        int i2;
        this.f52309l = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        an.a(this, jVar.getTooltipText());
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
    }

    public void setChecked(boolean z) {
        TextView textView = this.f52307j;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f52307j;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f52306i;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f52306i;
        textView4.setPivotY((float) textView4.getBaseline());
        int i2 = this.f52303f;
        if (i2 != -1) {
            if (i2 == 0) {
                if (z) {
                    a(this.f52305h, this.f52299b, 49);
                    a(this.f52307j, 1.0f, 1.0f, 0);
                } else {
                    a(this.f52305h, this.f52299b, 17);
                    a(this.f52307j, 0.5f, 0.5f, 4);
                }
                this.f52306i.setVisibility(4);
            } else if (i2 != 1) {
                if (i2 == 2) {
                    a(this.f52305h, this.f52299b, 17);
                    this.f52307j.setVisibility(8);
                    this.f52306i.setVisibility(8);
                }
            } else if (z) {
                a(this.f52305h, (int) (((float) this.f52299b) + this.f52300c), 49);
                a(this.f52307j, 1.0f, 1.0f, 0);
                TextView textView5 = this.f52306i;
                float f2 = this.f52301d;
                a(textView5, f2, f2, 4);
            } else {
                a(this.f52305h, this.f52299b, 49);
                TextView textView6 = this.f52307j;
                float f3 = this.f52302e;
                a(textView6, f3, f3, 4);
                a(this.f52306i, 1.0f, 1.0f, 0);
            }
        } else if (this.f52304g) {
            if (z) {
                a(this.f52305h, this.f52299b, 49);
                a(this.f52307j, 1.0f, 1.0f, 0);
            } else {
                a(this.f52305h, this.f52299b, 17);
                a(this.f52307j, 0.5f, 0.5f, 4);
            }
            this.f52306i.setVisibility(4);
        } else if (z) {
            a(this.f52305h, (int) (((float) this.f52299b) + this.f52300c), 49);
            a(this.f52307j, 1.0f, 1.0f, 0);
            TextView textView7 = this.f52306i;
            float f4 = this.f52301d;
            a(textView7, f4, f4, 4);
        } else {
            a(this.f52305h, this.f52299b, 49);
            TextView textView8 = this.f52307j;
            float f5 = this.f52302e;
            a(textView8, f5, f5, 4);
            a(this.f52306i, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    private a(Context context, byte b2) {
        this(context, (char) 0);
    }

    private void a(float f2, float f3) {
        this.f52300c = f2 - f3;
        this.f52301d = (f3 * 1.0f) / f2;
        this.f52302e = (f2 * 1.0f) / f3;
    }

    private a(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(3075);
        this.f52308k = -1;
        Resources resources = getResources();
        com.a.a(LayoutInflater.from(context), R.layout.vk, this, true);
        setBackgroundResource(R.drawable.a4b);
        this.f52299b = resources.getDimensionPixelSize(R.dimen.hf);
        this.f52305h = (ImageView) findViewById(R.id.bi7);
        TextView textView = (TextView) findViewById(R.id.e68);
        this.f52306i = textView;
        TextView textView2 = (TextView) findViewById(R.id.c4c);
        this.f52307j = textView2;
        v.a((View) textView, 2);
        v.a((View) textView2, 2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        MethodCollector.o(3075);
    }

    private static void a(View view, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private static void a(View view, float f2, float f3, int i2) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i2);
    }
}
