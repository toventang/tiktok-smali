package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;

public abstract class l<T extends n> {

    /* renamed from: a  reason: collision with root package name */
    public final T f62492a;

    /* renamed from: b  reason: collision with root package name */
    public final m<T> f62493b;

    static {
        Covode.recordClassIndex(38457);
    }

    public abstract boolean a();

    public l(T t, m<T> mVar) {
        h.f.b.l.d(t, "");
        h.f.b.l.d(mVar, "");
        this.f62492a = t;
        this.f62493b = mVar;
    }
}
