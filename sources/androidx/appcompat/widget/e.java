package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f1616a;

    /* renamed from: b  reason: collision with root package name */
    private final h f1617b;

    /* renamed from: c  reason: collision with root package name */
    private int f1618c = -1;

    /* renamed from: d  reason: collision with root package name */
    private aj f1619d;

    /* renamed from: e  reason: collision with root package name */
    private aj f1620e;

    /* renamed from: f  reason: collision with root package name */
    private aj f1621f;

    static {
        Covode.recordClassIndex(490);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f1618c = -1;
        b(null);
        d();
    }

    /* access modifiers changed from: package-private */
    public final ColorStateList b() {
        aj ajVar = this.f1620e;
        if (ajVar != null) {
            return ajVar.f1544a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final PorterDuff.Mode c() {
        aj ajVar = this.f1620e;
        if (ajVar != null) {
            return ajVar.f1545b;
        }
        return null;
    }

    private boolean e() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 21) {
            if (this.f1619d != null) {
                return true;
            }
            return false;
        } else if (i2 == 21) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        Drawable background = this.f1616a.getBackground();
        if (background == null) {
            return;
        }
        if (!e() || !a(background)) {
            aj ajVar = this.f1620e;
            if (ajVar != null) {
                h.a(background, ajVar, this.f1616a.getDrawableState());
                return;
            }
            aj ajVar2 = this.f1619d;
            if (ajVar2 != null) {
                h.a(background, ajVar2, this.f1616a.getDrawableState());
            }
        }
    }

    e(View view) {
        this.f1616a = view;
        this.f1617b = h.a();
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1619d == null) {
                this.f1619d = new aj();
            }
            this.f1619d.f1544a = colorStateList;
            this.f1619d.f1547d = true;
        } else {
            this.f1619d = null;
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        ColorStateList colorStateList;
        this.f1618c = i2;
        h hVar = this.f1617b;
        if (hVar != null) {
            colorStateList = hVar.b(this.f1616a.getContext(), i2);
        } else {
            colorStateList = null;
        }
        b(colorStateList);
        d();
    }

    private boolean a(Drawable drawable) {
        if (this.f1621f == null) {
            this.f1621f = new aj();
        }
        aj ajVar = this.f1621f;
        ajVar.a();
        ColorStateList r = v.r(this.f1616a);
        if (r != null) {
            ajVar.f1547d = true;
            ajVar.f1544a = r;
        }
        PorterDuff.Mode s = v.s(this.f1616a);
        if (s != null) {
            ajVar.f1546c = true;
            ajVar.f1545b = s;
        }
        if (!ajVar.f1547d && !ajVar.f1546c) {
            return false;
        }
        h.a(drawable, ajVar, this.f1616a.getDrawableState());
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (this.f1620e == null) {
            this.f1620e = new aj();
        }
        this.f1620e.f1544a = colorStateList;
        this.f1620e.f1547d = true;
        d();
    }

    /* access modifiers changed from: package-private */
    public final void a(PorterDuff.Mode mode) {
        if (this.f1620e == null) {
            this.f1620e = new aj();
        }
        this.f1620e.f1545b = mode;
        this.f1620e.f1546c = true;
        d();
    }

    /* access modifiers changed from: package-private */
    public final void a(AttributeSet attributeSet, int i2) {
        al a2 = al.a(this.f1616a.getContext(), attributeSet, new int[]{16842964, R.attr.jh, R.attr.ji}, i2, 0);
        try {
            if (a2.f(0)) {
                this.f1618c = a2.g(0, -1);
                ColorStateList b2 = this.f1617b.b(this.f1616a.getContext(), this.f1618c);
                if (b2 != null) {
                    b(b2);
                }
            }
            if (a2.f(1)) {
                v.a(this.f1616a, a2.e(1));
            }
            if (a2.f(2)) {
                v.a(this.f1616a, w.a(a2.a(2, -1), null));
            }
        } finally {
            a2.f1549a.recycle();
        }
    }
}
