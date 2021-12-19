package com.bytedance.android.live.broadcast.api.blockword.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public int f7519a = -1;
    @c(a = "content")

    /* renamed from: b  reason: collision with root package name */
    public String f7520b;

    static {
        Covode.recordClassIndex(3697);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7519a == aVar.f7519a && l.a(this.f7520b, aVar.f7520b);
    }

    public final int hashCode() {
        int i2 = this.f7519a * 31;
        String str = this.f7520b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BlockWord(id=" + this.f7519a + ", content=" + this.f7520b + ")";
    }

    public a(String str) {
        l.d(str, "");
        this.f7520b = str;
    }
}
