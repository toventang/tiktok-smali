package com.ss.android.ugc.aweme.mix.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f109809a;

    /* renamed from: b  reason: collision with root package name */
    public final String f109810b;

    static {
        Covode.recordClassIndex(70322);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f109809a, cVar.f109809a) && l.a(this.f109810b, cVar.f109810b);
    }

    public final int hashCode() {
        String str = this.f109809a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f109810b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ChangePlayListNameEvent(name=" + this.f109809a + ", mixId=" + this.f109810b + ")";
    }

    public c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f109809a = str;
        this.f109810b = str2;
    }
}
