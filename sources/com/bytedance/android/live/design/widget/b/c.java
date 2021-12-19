package com.bytedance.android.live.design.widget.b;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class c<T extends View> {

    /* renamed from: h  reason: collision with root package name */
    protected final T f9590h;

    static {
        Covode.recordClassIndex(4861);
    }

    public abstract void a(TypedArray typedArray);

    /* access modifiers changed from: protected */
    public abstract int[] a();

    public c(T t) {
        this.f9590h = t;
    }

    /* access modifiers changed from: protected */
    public final void f(int i2) {
        TypedArray obtainStyledAttributes = this.f9590h.getContext().obtainStyledAttributes(i2, a());
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public void a(AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = this.f9590h.getContext().obtainStyledAttributes(attributeSet, a(), i2, i3);
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
