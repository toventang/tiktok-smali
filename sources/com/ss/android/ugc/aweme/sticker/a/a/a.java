package com.ss.android.ugc.aweme.sticker.a.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "needUpzip")

    /* renamed from: a  reason: collision with root package name */
    public int f134696a;
    @c(a = "url")

    /* renamed from: b  reason: collision with root package name */
    public List<String> f134697b;

    static {
        Covode.recordClassIndex(88037);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f134696a == aVar.f134696a && l.a(this.f134697b, aVar.f134697b);
    }

    public final int hashCode() {
        int i2 = this.f134696a * 31;
        List<String> list = this.f134697b;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DownloadRequest(needUpzip=" + this.f134696a + ", url=" + this.f134697b + ")";
    }
}
