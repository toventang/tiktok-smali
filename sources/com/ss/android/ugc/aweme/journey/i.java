package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class i {
    @c(a = "code")

    /* renamed from: a  reason: collision with root package name */
    public final String f104861a;
    @c(a = "en_name")

    /* renamed from: b  reason: collision with root package name */
    public final String f104862b;
    @c(a = "local_name")

    /* renamed from: c  reason: collision with root package name */
    public final String f104863c;

    static {
        Covode.recordClassIndex(67248);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f104861a, iVar.f104861a) && l.a(this.f104862b, iVar.f104862b) && l.a(this.f104863c, iVar.f104863c);
    }

    public final int hashCode() {
        String str = this.f104861a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104862b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104863c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "JourneyContentLanguage(code=" + this.f104861a + ", en_name=" + this.f104862b + ", local_name=" + this.f104863c + ")";
    }
}
