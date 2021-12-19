package com.ss.android.ugc.aweme.discover.api.a;

import com.bytedance.covode.number.Covode;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f80829a;

    /* renamed from: b  reason: collision with root package name */
    public T f80830b;

    /* renamed from: c  reason: collision with root package name */
    public Throwable f80831c;

    static {
        Covode.recordClassIndex(50254);
    }

    public a(Throwable th) {
        this.f80831c = th;
    }

    public a(T t) {
        this.f80829a = true;
        this.f80830b = t;
    }
}
