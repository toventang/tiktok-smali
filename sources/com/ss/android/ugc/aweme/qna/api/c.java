package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c implements com.bytedance.assem.arch.extensions.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f119226a;

    /* renamed from: b  reason: collision with root package name */
    public final String f119227b;

    /* renamed from: c  reason: collision with root package name */
    public final String f119228c;

    static {
        Covode.recordClassIndex(77456);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f119226a, cVar.f119226a) && l.a(this.f119227b, cVar.f119227b) && l.a(this.f119228c, cVar.f119228c);
    }

    public final int hashCode() {
        String str = this.f119226a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f119227b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f119228c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "QnaProfileDetail(enterFrom=" + this.f119226a + ", enterMethod=" + this.f119227b + ", authorId=" + this.f119228c + ")";
    }

    public c(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f119226a = str;
        this.f119227b = str2;
        this.f119228c = str3;
    }
}
