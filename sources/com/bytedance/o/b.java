package com.bytedance.o;

import com.bytedance.covode.number.Covode;

public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private volatile T f41671a;

    static {
        Covode.recordClassIndex(25505);
    }

    /* access modifiers changed from: protected */
    public abstract T b();

    public final T a() {
        if (this.f41671a == null) {
            synchronized (this) {
                if (this.f41671a == null) {
                    this.f41671a = b();
                }
            }
        }
        return this.f41671a;
    }
}
