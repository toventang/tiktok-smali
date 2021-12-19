package com.ss.android.ugc.aweme.crossplatform.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f78715a;

    /* renamed from: b  reason: collision with root package name */
    public final String f78716b;

    /* renamed from: c  reason: collision with root package name */
    public final String f78717c;

    static {
        Covode.recordClassIndex(48866);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f78715a, eVar.f78715a) && l.a(this.f78716b, eVar.f78716b) && l.a(this.f78717c, eVar.f78717c);
    }

    public final int hashCode() {
        String str = this.f78715a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f78716b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f78717c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SessionInfo(projectName=" + this.f78715a + ", enterFrom=" + this.f78716b + ", type=" + this.f78717c + ")";
    }

    public e(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f78715a = str;
        this.f78716b = str2;
        this.f78717c = str3;
    }
}
