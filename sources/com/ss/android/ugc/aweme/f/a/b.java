package com.ss.android.ugc.aweme.f.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f90413a;

    /* renamed from: b  reason: collision with root package name */
    public String f90414b;

    /* renamed from: c  reason: collision with root package name */
    public List<com.bytedance.retrofit2.client.b> f90415c;

    static {
        Covode.recordClassIndex(56759);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f90413a, bVar.f90413a) && l.a(this.f90414b, bVar.f90414b) && l.a(this.f90415c, bVar.f90415c);
    }

    public final int hashCode() {
        String str = this.f90413a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f90414b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<com.bytedance.retrofit2.client.b> list = this.f90415c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("URL:         ").append(this.f90413a).append("\r\n\r\nHEADERS:          ");
        List<com.bytedance.retrofit2.client.b> list = this.f90415c;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        return append.append(str).append("\r\n\r\nRESPONSE:         ").append(this.f90414b).append("\r\n\r\n").toString();
    }
}
