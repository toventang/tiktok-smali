package com.bytedance.lynx.hybrid.webkit;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f41287a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f41288b;

    static {
        Covode.recordClassIndex(25306);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f41287a, cVar.f41287a) && l.a(this.f41288b, cVar.f41288b);
    }

    public final int hashCode() {
        String str = this.f41287a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, String> map = this.f41288b;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UrlAndHeaders(url=" + this.f41287a + ", headers=" + this.f41288b + ")";
    }

    public c(String str, Map<String, String> map) {
        this.f41287a = str;
        this.f41288b = map;
    }
}
