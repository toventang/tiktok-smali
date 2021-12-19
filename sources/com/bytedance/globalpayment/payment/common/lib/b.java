package com.bytedance.globalpayment.payment.common.lib;

import com.bytedance.covode.number.Covode;

public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private volatile T f30505a;

    static {
        Covode.recordClassIndex(17710);
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T b() {
        if (this.f30505a == null) {
            synchronized (this) {
                if (this.f30505a == null) {
                    this.f30505a = a();
                }
            }
        }
        return this.f30505a;
    }
}
