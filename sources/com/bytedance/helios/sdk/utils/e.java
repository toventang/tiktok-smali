package com.bytedance.helios.sdk.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f31003a;

    /* renamed from: b  reason: collision with root package name */
    public String f31004b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31005c;

    /* renamed from: d  reason: collision with root package name */
    public final Throwable f31006d;

    /* renamed from: e  reason: collision with root package name */
    public final long f31007e;

    static {
        Covode.recordClassIndex(18008);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f31003a, eVar.f31003a) && l.a(this.f31004b, eVar.f31004b) && l.a(this.f31005c, eVar.f31005c) && l.a(this.f31006d, eVar.f31006d) && this.f31007e == eVar.f31007e;
    }

    public final int hashCode() {
        String str = this.f31003a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31004b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f31005c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Throwable th = this.f31006d;
        if (th != null) {
            i2 = th.hashCode();
        }
        long j2 = this.f31007e;
        return ((hashCode3 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "LogModel(tag=" + this.f31003a + ", msg=" + this.f31004b + ", level=" + this.f31005c + ", throwable=" + this.f31006d + ", timestamp=" + this.f31007e + ")";
    }

    public /* synthetic */ e(String str, String str2, String str3, Throwable th) {
        this(str, str2, str3, th, System.currentTimeMillis());
    }

    private e(String str, String str2, String str3, Throwable th, long j2) {
        l.c(str, "");
        l.c(str3, "");
        this.f31003a = str;
        this.f31004b = str2;
        this.f31005c = str3;
        this.f31006d = th;
        this.f31007e = j2;
    }
}
