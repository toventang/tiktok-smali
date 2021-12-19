package com.bytedance.android.livesdkapi.depend.model.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f23027a;

    /* renamed from: b  reason: collision with root package name */
    public String f23028b;

    /* renamed from: c  reason: collision with root package name */
    public String f23029c;

    static {
        Covode.recordClassIndex(13643);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f23027a, aVar.f23027a) && l.a(this.f23028b, aVar.f23028b) && l.a(this.f23029c, aVar.f23029c);
    }

    public final int hashCode() {
        String str = this.f23027a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23028b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23029c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "LivePlayerEntranceParam(enterFromMerge=" + this.f23027a + ", enterMethod=" + this.f23028b + ", enterAction=" + this.f23029c + ")";
    }

    public a(String str, String str2, String str3) {
        this.f23027a = str;
        this.f23028b = str2;
        this.f23029c = str3;
    }
}
