package com.ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class m {
    @c(a = "text")

    /* renamed from: a  reason: collision with root package name */
    public final String f84348a;

    static {
        Covode.recordClassIndex(52589);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m) && l.a(this.f84348a, ((m) obj).f84348a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f84348a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ViewItem(text=" + this.f84348a + ")";
    }

    public m(String str) {
        this.f84348a = str;
    }
}
