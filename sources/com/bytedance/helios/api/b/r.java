package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class r implements f {

    /* renamed from: a  reason: collision with root package name */
    public final String f30703a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30704b;

    static {
        Covode.recordClassIndex(17825);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.a(this.f30703a, rVar.f30703a) && l.a(this.f30704b, rVar.f30704b);
    }

    public final int hashCode() {
        String str = this.f30703a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30704b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UploadALogEvent(code=" + this.f30703a + ", message=" + this.f30704b + ")";
    }

    private /* synthetic */ r() {
        this(null, null);
    }

    public r(String str, String str2) {
        this.f30703a = str;
        this.f30704b = str2;
    }
}
