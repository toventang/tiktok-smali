package com.ss.android.f;

import com.bytedance.covode.number.Covode;

public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private volatile T f59518a;

    static {
        Covode.recordClassIndex(36746);
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T b() {
        if (this.f59518a == null) {
            synchronized (this) {
                if (this.f59518a == null) {
                    this.f59518a = a();
                }
            }
        }
        return this.f59518a;
    }
}
