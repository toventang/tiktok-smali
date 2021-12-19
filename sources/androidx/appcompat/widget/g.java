package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public ColorStateList f1624a;

    /* renamed from: b  reason: collision with root package name */
    public PorterDuff.Mode f1625b;

    /* renamed from: c  reason: collision with root package name */
    private final CompoundButton f1626c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1627d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1628e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1629f;

    static {
        Covode.recordClassIndex(492);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f1629f) {
            this.f1629f = false;
            return;
        }
        this.f1629f = true;
        b();
    }

    private void b() {
        Drawable a2 = c.a(this.f1626c);
        if (a2 == null) {
            return;
        }
        if (this.f1627d || this.f1628e) {
            Drawable mutate = a.e(a2).mutate();
            if (this.f1627d) {
                a.a(mutate, this.f1624a);
            }
            if (this.f1628e) {
                a.a(mutate, this.f1625b);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1626c.getDrawableState());
            }
            this.f1626c.setButtonDrawable(mutate);
        }
    }

    g(CompoundButton compoundButton) {
        this.f1626c = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        this.f1624a = colorStateList;
        this.f1627d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public final void a(PorterDuff.Mode mode) {
        this.f1625b = mode;
        this.f1628e = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public final void a(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1626c.getContext().obtainStyledAttributes(attributeSet, new int[]{16843015, R.attr.m1, R.attr.m2}, i2, 0);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                CompoundButton compoundButton = this.f1626c;
                compoundButton.setButtonDrawable(androidx.appcompat.a.a.a.b(compoundButton.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                c.a(this.f1626c, obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                c.a(this.f1626c, w.a(obtainStyledAttributes.getInt(2, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
