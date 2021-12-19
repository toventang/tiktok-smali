package com.bytedance.ies.xelement.alphavideo.a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class c<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f36634a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f36635b;

    static {
        Covode.recordClassIndex(22005);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36634a, this.f36635b});
    }

    public c(V v) {
        this.f36634a = v;
    }

    public c(Throwable th) {
        this.f36635b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        V v = this.f36634a;
        if (v != null && v.equals(cVar.f36634a)) {
            return true;
        }
        Throwable th = this.f36635b;
        if (th == null || cVar.f36635b == null) {
            return false;
        }
        return th.toString().equals(this.f36635b.toString());
    }
}
