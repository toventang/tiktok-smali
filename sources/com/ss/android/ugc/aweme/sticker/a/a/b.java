package com.ss.android.ugc.aweme.sticker.a.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "path")

    /* renamed from: a  reason: collision with root package name */
    public String f134698a;
    @c(a = "success")

    /* renamed from: b  reason: collision with root package name */
    public int f134699b;

    static {
        Covode.recordClassIndex(88038);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f134698a, bVar.f134698a) && this.f134699b == bVar.f134699b;
    }

    public final int hashCode() {
        String str = this.f134698a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f134699b;
    }

    public final String toString() {
        return "DownloadResult(path=" + this.f134698a + ", success=" + this.f134699b + ")";
    }

    public b(String str, int i2) {
        l.d(str, "");
        this.f134698a = str;
        this.f134699b = i2;
    }
}
