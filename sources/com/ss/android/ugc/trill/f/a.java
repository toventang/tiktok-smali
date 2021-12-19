package com.ss.android.ugc.trill.f;

import com.bytedance.covode.number.Covode;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f150482a;

    static {
        Covode.recordClassIndex(98963);
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T b() {
        T t;
        synchronized (this) {
            if (this.f150482a == null) {
                this.f150482a = a();
            }
            t = this.f150482a;
        }
        return t;
    }
}
