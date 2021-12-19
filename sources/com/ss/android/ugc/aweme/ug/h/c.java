package com.ss.android.ugc.aweme.ug.h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "desc")

    /* renamed from: a  reason: collision with root package name */
    public final String f141950a;
    @com.google.gson.a.c(a = "url")

    /* renamed from: b  reason: collision with root package name */
    public final String f141951b;

    static {
        Covode.recordClassIndex(92752);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f141950a, cVar.f141950a) && l.a(this.f141951b, cVar.f141951b);
    }

    public final int hashCode() {
        String str = this.f141950a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f141951b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UgcPermission(desc=" + this.f141950a + ", url=" + this.f141951b + ")";
    }
}
