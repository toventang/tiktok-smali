package com.ss.android.ugc.aweme.setting.unit.privacy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ufr.d;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f122966a;

    /* renamed from: b  reason: collision with root package name */
    public final String f122967b;

    static {
        Covode.recordClassIndex(80749);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f122966a, cVar.f122966a) && l.a(this.f122967b, cVar.f122967b);
    }

    public final int hashCode() {
        d dVar = this.f122966a;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        String str = this.f122967b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PlatformResponse(response=" + this.f122966a + ", platform=" + this.f122967b + ")";
    }

    public c(d dVar, String str) {
        l.d(dVar, "");
        l.d(str, "");
        this.f122966a = dVar;
        this.f122967b = str;
    }
}
