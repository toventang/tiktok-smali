package com.bytedance.assem.arch.core;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import h.v;

public final class i<T extends c> {

    /* renamed from: a  reason: collision with root package name */
    public T f25572a;

    /* renamed from: b  reason: collision with root package name */
    public String f25573b;

    static {
        Covode.recordClassIndex(14889);
    }

    public final p<String, T> a() {
        String str = this.f25573b;
        T t = this.f25572a;
        if (t == null) {
            l.a("data");
        }
        return v.a(str, t);
    }

    public final void a(T t) {
        l.c(t, "");
        this.f25572a = t;
    }
}
