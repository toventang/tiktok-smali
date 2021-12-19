package com.ss.android.ugc.aweme.i18n.language.i18n;

import com.bytedance.covode.number.Covode;

public abstract class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f99814a;

    static {
        Covode.recordClassIndex(63634);
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T b() {
        T t;
        synchronized (this) {
            if (this.f99814a == null) {
                this.f99814a = a();
            }
            t = this.f99814a;
        }
        return t;
    }
}
