package com.bytedance.android.live.broadcast.api.blockword.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f7521a;

    static {
        Covode.recordClassIndex(3698);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f7521a, ((b) obj).f7521a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f7521a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BlockWordAddResponse(id=" + this.f7521a + ")";
    }
}
