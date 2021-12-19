package com.ss.android.ugc.aweme.ax.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f67709a;

    /* renamed from: b  reason: collision with root package name */
    public final String f67710b;

    /* renamed from: c  reason: collision with root package name */
    public final String f67711c;

    static {
        Covode.recordClassIndex(41676);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f67709a, bVar.f67709a) && l.a(this.f67710b, bVar.f67710b) && l.a(this.f67711c, bVar.f67711c);
    }

    public final int hashCode() {
        String str = this.f67709a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f67710b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67711c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "DefinedTimingInfo(preTrigger=" + this.f67709a + ", curTrigger=" + this.f67710b + ", intervalName=" + this.f67711c + ")";
    }

    public b(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f67709a = str;
        this.f67710b = str2;
        this.f67711c = str3;
    }
}
