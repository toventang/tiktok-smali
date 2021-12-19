package com.bytedance.android.live.broadcast.api.blockword.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class c {
    @com.google.gson.a.c(a = "word")

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f7522a;

    static {
        Covode.recordClassIndex(3699);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f7522a, ((c) obj).f7522a);
        }
        return true;
    }

    public final int hashCode() {
        List<a> list = this.f7522a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BlockWordGetResponse(words=" + this.f7522a + ")";
    }
}
