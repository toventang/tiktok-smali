package com.ss.android.deviceregister.d;

import com.bytedance.covode.number.Covode;

public abstract class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private volatile T f59469a;

    static {
        Covode.recordClassIndex(36718);
    }

    /* access modifiers changed from: protected */
    public abstract T a(Object... objArr);

    public final T b(Object... objArr) {
        if (this.f59469a == null) {
            synchronized (this) {
                if (this.f59469a == null) {
                    this.f59469a = a(objArr);
                }
            }
        }
        return this.f59469a;
    }
}
