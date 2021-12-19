package com.bytedance.push.k;

import com.bytedance.covode.number.Covode;

public abstract class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private volatile T f42238a;

    static {
        Covode.recordClassIndex(25804);
    }

    /* access modifiers changed from: protected */
    public abstract T e();

    public final T f() {
        if (this.f42238a == null) {
            synchronized (this) {
                if (this.f42238a == null) {
                    this.f42238a = e();
                }
            }
        }
        return this.f42238a;
    }
}
