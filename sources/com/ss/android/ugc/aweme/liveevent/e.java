package com.ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class e {
    @c(a = "operation")

    /* renamed from: a  reason: collision with root package name */
    public String f108664a;
    @c(a = "event")

    /* renamed from: b  reason: collision with root package name */
    public b f108665b;

    static {
        Covode.recordClassIndex(69637);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f108664a, eVar.f108664a) && l.a(this.f108665b, eVar.f108665b);
    }

    public final int hashCode() {
        String str = this.f108664a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        b bVar = this.f108665b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EventParams(operation=" + this.f108664a + ", event=" + this.f108665b + ")";
    }
}
