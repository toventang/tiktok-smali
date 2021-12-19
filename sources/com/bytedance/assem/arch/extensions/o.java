package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class o<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f25658a;

    static {
        Covode.recordClassIndex(14928);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof o) && l.a(this.f25658a, ((o) obj).f25658a);
        }
        return true;
    }

    public final int hashCode() {
        T t = this.f25658a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Success(value=" + ((Object) this.f25658a) + ")";
    }

    @Override // com.bytedance.assem.arch.extensions.f
    public final T a() {
        return this.f25658a;
    }

    public o(T t) {
        super((byte) 0);
        this.f25658a = t;
    }
}
