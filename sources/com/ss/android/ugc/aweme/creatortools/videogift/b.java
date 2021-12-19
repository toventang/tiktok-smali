package com.ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class b {
    @c(a = "uri")

    /* renamed from: a  reason: collision with root package name */
    public final String f78475a;
    @c(a = "url_list")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f78476b;

    static {
        Covode.recordClassIndex(48738);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f78475a, bVar.f78475a) && l.a(this.f78476b, bVar.f78476b);
    }

    public final int hashCode() {
        String str = this.f78475a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f78476b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Image(uri=" + this.f78475a + ", urlList=" + this.f78476b + ")";
    }
}
