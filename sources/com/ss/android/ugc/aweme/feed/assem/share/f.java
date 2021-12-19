package com.ss.android.ugc.aweme.feed.assem.share;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f92451a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup.LayoutParams f92452b;

    static {
        Covode.recordClassIndex(58525);
    }

    public static f a(Drawable drawable, ViewGroup.LayoutParams layoutParams) {
        return new f(drawable, layoutParams);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f92451a, fVar.f92451a) && l.a(this.f92452b, fVar.f92452b);
    }

    public final int hashCode() {
        Drawable drawable = this.f92451a;
        int i2 = 0;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        ViewGroup.LayoutParams layoutParams = this.f92452b;
        if (layoutParams != null) {
            i2 = layoutParams.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShareIconState(drawable=" + this.f92451a + ", layoutParams=" + this.f92452b + ")";
    }

    public /* synthetic */ f() {
        this(null, null);
    }

    private f(Drawable drawable, ViewGroup.LayoutParams layoutParams) {
        this.f92451a = drawable;
        this.f92452b = layoutParams;
    }
}
