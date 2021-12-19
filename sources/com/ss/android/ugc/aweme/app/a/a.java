package com.ss.android.ugc.aweme.app.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f66519a;

    /* renamed from: b  reason: collision with root package name */
    public long f66520b;

    /* renamed from: c  reason: collision with root package name */
    public String f66521c;

    static {
        Covode.recordClassIndex(40888);
    }

    public a() {
        this(0, (String) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f66519a == aVar.f66519a && this.f66520b == aVar.f66520b && l.a(this.f66521c, aVar.f66521c);
    }

    public final String toString() {
        return "ApiConfig(isBanned=" + this.f66519a + ", delayTime=" + this.f66520b + ", apiName=" + this.f66521c + ")";
    }

    public final int hashCode() {
        int i2;
        boolean z = this.f66519a;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        long j2 = this.f66520b;
        int i6 = ((i3 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f66521c;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return i6 + i2;
    }

    public a(boolean z, long j2, String str) {
        l.d(str, "");
        this.f66519a = z;
        this.f66520b = j2;
        this.f66521c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(long j2, String str, int i2) {
        this(false, (i2 & 2) != 0 ? 45000 : j2, (i2 & 4) != 0 ? "default" : str);
    }
}
