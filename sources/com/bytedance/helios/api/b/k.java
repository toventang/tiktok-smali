package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    public String f30666a;

    /* renamed from: b  reason: collision with root package name */
    public String f30667b;

    /* renamed from: c  reason: collision with root package name */
    public String f30668c;

    /* renamed from: d  reason: collision with root package name */
    public long f30669d;

    static {
        Covode.recordClassIndex(17815);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f30666a, kVar.f30666a) && l.a(this.f30667b, kVar.f30667b) && l.a(this.f30668c, kVar.f30668c) && this.f30669d == kVar.f30669d;
    }

    public final int hashCode() {
        String str = this.f30666a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30667b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30668c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        long j2 = this.f30669d;
        return ((hashCode2 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "JsbEvent(url=" + this.f30666a + ", moduleName=" + this.f30667b + ", methodName=" + this.f30668c + ", timestamp=" + this.f30669d + ")";
    }

    public /* synthetic */ k() {
        this("", "", "", System.currentTimeMillis());
    }

    private k(String str, String str2, String str3, long j2) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        this.f30666a = str;
        this.f30667b = str2;
        this.f30668c = str3;
        this.f30669d = j2;
    }
}
