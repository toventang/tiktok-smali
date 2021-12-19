package com.ss.android.ugc.aweme.i18n.a;

import com.bytedance.covode.number.Covode;

public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f99765a;

    static {
        Covode.recordClassIndex(63608);
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T b() {
        T t;
        synchronized (this) {
            t = this.f99765a;
            if (t == null) {
                t = a();
                this.f99765a = t;
            }
        }
        return t;
    }
}
