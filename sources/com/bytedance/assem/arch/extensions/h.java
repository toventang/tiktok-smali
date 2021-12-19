package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import java.util.Arrays;

public final class h<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f25642a;

    static {
        Covode.recordClassIndex(14919);
    }

    public final String toString() {
        return "Fail(error=" + this.f25642a + ")";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{ab.a(this.f25642a.getClass()), this.f25642a.getMessage(), this.f25642a.getStackTrace()[0]});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Throwable th) {
        super((byte) 0);
        l.c(th, "");
        this.f25642a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        Throwable th = ((h) obj).f25642a;
        if (!l.a(ab.a(this.f25642a.getClass()), ab.a(th.getClass())) || !l.a((Object) this.f25642a.getMessage(), (Object) th.getMessage()) || !l.a(this.f25642a.getStackTrace()[0], th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
