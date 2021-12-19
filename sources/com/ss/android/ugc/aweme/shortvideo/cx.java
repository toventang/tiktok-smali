package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class cx {

    /* renamed from: a  reason: collision with root package name */
    public final String f126413a;

    /* renamed from: b  reason: collision with root package name */
    public final String f126414b;

    /* renamed from: c  reason: collision with root package name */
    public final String f126415c;

    static {
        Covode.recordClassIndex(82938);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return l.a(this.f126413a, cxVar.f126413a) && l.a(this.f126414b, cxVar.f126414b) && l.a(this.f126415c, cxVar.f126415c);
    }

    public final int hashCode() {
        String str = this.f126413a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f126414b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f126415c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "RecordCommonParameter(shootWay=" + this.f126413a + ", creationId=" + this.f126414b + ", enterForm=" + this.f126415c + ")";
    }

    public /* synthetic */ cx() {
        this("", "", "");
    }

    public cx(String str, String str2, String str3) {
        this.f126413a = str;
        this.f126414b = str2;
        this.f126415c = str3;
    }
}
