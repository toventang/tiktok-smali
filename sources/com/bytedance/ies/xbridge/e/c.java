package com.bytedance.ies.xbridge.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f35926a;

    /* renamed from: b  reason: collision with root package name */
    public final n f35927b;

    static {
        Covode.recordClassIndex(21478);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f35926a, cVar.f35926a) && l.a(this.f35927b, cVar.f35927b);
    }

    public final int hashCode() {
        String str = this.f35926a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        n nVar = this.f35927b;
        if (nVar != null) {
            i2 = nVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Js2NativeEvent(eventName=" + this.f35926a + ", params=" + this.f35927b + ")";
    }

    public c(String str, n nVar) {
        l.c(str, "");
        this.f35926a = str;
        this.f35927b = nVar;
    }
}
