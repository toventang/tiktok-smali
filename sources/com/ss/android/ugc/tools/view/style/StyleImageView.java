package com.ss.android.ugc.tools.view.style;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class StyleImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private boolean f150125a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f150126b;

    /* renamed from: c  reason: collision with root package name */
    private int f150127c;

    /* renamed from: d  reason: collision with root package name */
    private int f150128d;

    /* renamed from: e  reason: collision with root package name */
    private int f150129e;

    /* renamed from: f  reason: collision with root package name */
    private int f150130f;

    static {
        Covode.recordClassIndex(98815);
    }

    public StyleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public final void setDefaultTintColor(int i2) {
        this.f150127c = i2;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        a(drawable);
    }

    public final void setSelectTintColor(int i2) {
        this.f150128d = i2;
    }

    public final void setUnSelectTintColor(int i2) {
        this.f150129e = i2;
    }

    public final void setEnableSelectionTint(boolean z) {
        this.f150126b = z;
        if (!z) {
            this.f150130f = this.f150127c;
        }
    }

    public final void setEnableTint(boolean z) {
        boolean z2 = this.f150125a;
        this.f150125a = z;
        if (!z2 && z) {
            a(getDrawable());
        }
    }

    private final void a(Drawable drawable) {
        if (this.f150125a) {
            super.setImageDrawable(g.a(drawable, this.f150130f));
        } else {
            super.setImageDrawable(drawable);
        }
    }

    public void setSelected(boolean z) {
        int i2;
        super.setSelected(z);
        if (this.f150126b) {
            if (z) {
                i2 = this.f150128d;
            } else {
                i2 = this.f150129e;
            }
            this.f150130f = i2;
            a(getDrawable());
        }
    }

    private /* synthetic */ StyleImageView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StyleImageView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv, R.attr.akw, R.attr.akx});
            l.b(obtainStyledAttributes, "");
            this.f150125a = obtainStyledAttributes.getBoolean(5, true);
            this.f150126b = obtainStyledAttributes.getBoolean(3, true);
            this.f150127c = obtainStyledAttributes.getColor(22, context.getResources().getColor(R.color.ub));
            this.f150128d = obtainStyledAttributes.getColor(23, context.getResources().getColor(R.color.ub));
            this.f150129e = obtainStyledAttributes.getColor(24, context.getResources().getColor(R.color.uc));
            obtainStyledAttributes.recycle();
        } else {
            this.f150125a = true;
            this.f150126b = true;
            this.f150127c = context.getResources().getColor(R.color.ub);
            this.f150128d = context.getResources().getColor(R.color.ub);
            this.f150129e = context.getResources().getColor(R.color.uc);
        }
        this.f150130f = this.f150127c;
        if (this.f150125a) {
            a(getDrawable());
        }
    }
}
