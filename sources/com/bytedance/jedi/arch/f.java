package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import java.util.Arrays;

public final class f<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f39461a;

    static {
        Covode.recordClassIndex(24268);
    }

    public final String toString() {
        return "Fail(error=" + this.f39461a + ")";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{ab.a(this.f39461a.getClass()), this.f39461a.getMessage(), this.f39461a.getStackTrace()[0]});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Throwable th) {
        super((byte) 0);
        l.c(th, "");
        this.f39461a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        Throwable th = ((f) obj).f39461a;
        if (!l.a(ab.a(this.f39461a.getClass()), ab.a(th.getClass())) || !l.a((Object) this.f39461a.getMessage(), (Object) th.getMessage()) || !l.a(this.f39461a.getStackTrace()[0], th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
