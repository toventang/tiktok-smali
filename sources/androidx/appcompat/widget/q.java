package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final class q extends m {

    /* renamed from: b  reason: collision with root package name */
    final SeekBar f1659b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f1660c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f1661d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f1662e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1663f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1664g;

    static {
        Covode.recordClassIndex(507);
    }

    private void a() {
        Drawable drawable = this.f1660c;
        if (drawable == null) {
            return;
        }
        if (this.f1663f || this.f1664g) {
            Drawable e2 = a.e(drawable.mutate());
            this.f1660c = e2;
            if (this.f1663f) {
                a.a(e2, this.f1661d);
            }
            if (this.f1664g) {
                a.a(this.f1660c, this.f1662e);
            }
            if (this.f1660c.isStateful()) {
                this.f1660c.setState(this.f1659b.getDrawableState());
            }
        }
    }

    q(SeekBar seekBar) {
        super(seekBar);
        this.f1659b = seekBar;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.m
    public final void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        al a2 = al.a(this.f1659b.getContext(), attributeSet, new int[]{16843074, R.attr.ait, R.attr.aiu, R.attr.aiv}, i2, 0);
        Drawable b2 = a2.b(0);
        if (b2 != null) {
            this.f1659b.setThumb(b2);
        }
        Drawable a3 = a2.a(1);
        Drawable drawable = this.f1660c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1660c = a3;
        if (a3 != null) {
            a3.setCallback(this.f1659b);
            a.b(a3, v.e(this.f1659b));
            if (a3.isStateful()) {
                a3.setState(this.f1659b.getDrawableState());
            }
            a();
        }
        this.f1659b.invalidate();
        if (a2.f(3)) {
            this.f1662e = w.a(a2.a(3, -1), this.f1662e);
            this.f1664g = true;
        }
        if (a2.f(2)) {
            this.f1661d = a2.e(2);
            this.f1663f = true;
        }
        a2.f1549a.recycle();
        a();
    }
}
