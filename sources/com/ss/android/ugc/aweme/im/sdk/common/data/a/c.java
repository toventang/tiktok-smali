package com.ss.android.ugc.aweme.im.sdk.common.data.a;

import com.bytedance.covode.number.Covode;

public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f102467a;

    /* renamed from: b  reason: collision with root package name */
    public final T f102468b;

    static {
        Covode.recordClassIndex(65608);
    }

    public final T a() {
        if (this.f102467a) {
            return null;
        }
        this.f102467a = true;
        return this.f102468b;
    }

    public c(T t) {
        this.f102468b = t;
    }
}
