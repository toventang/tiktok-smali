package com.google.android.material.appbar;

import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f52212a;

    /* renamed from: b  reason: collision with root package name */
    public int f52213b;

    /* renamed from: c  reason: collision with root package name */
    public int f52214c;

    /* renamed from: d  reason: collision with root package name */
    public int f52215d;

    /* renamed from: e  reason: collision with root package name */
    private final View f52216e;

    static {
        Covode.recordClassIndex(32441);
    }

    public final void a() {
        this.f52212a = this.f52216e.getTop();
        this.f52213b = this.f52216e.getLeft();
        b();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        View view = this.f52216e;
        v.d(view, this.f52214c - (view.getTop() - this.f52212a));
        View view2 = this.f52216e;
        v.e(view2, this.f52215d - (view2.getLeft() - this.f52213b));
    }

    public d(View view) {
        this.f52216e = view;
    }

    public final boolean a(int i2) {
        if (this.f52214c == i2) {
            return false;
        }
        this.f52214c = i2;
        b();
        return true;
    }
}
