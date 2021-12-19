package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class aj<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f39383a;

    static {
        Covode.recordClassIndex(24165);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof aj) && l.a(this.f39383a, ((aj) obj).f39383a);
        }
        return true;
    }

    public final int hashCode() {
        T t = this.f39383a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Success(value=" + ((Object) this.f39383a) + ")";
    }

    @Override // com.bytedance.jedi.arch.a
    public final T a() {
        return this.f39383a;
    }

    public aj(T t) {
        super((byte) 0);
        this.f39383a = t;
    }
}
