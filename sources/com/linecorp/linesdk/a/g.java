package com.linecorp.linesdk.a;

import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f54981a;

    /* renamed from: b  reason: collision with root package name */
    public final long f54982b;

    /* renamed from: c  reason: collision with root package name */
    public final String f54983c;

    static {
        Covode.recordClassIndex(34529);
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f54982b;
        int hashCode = ((this.f54981a.hashCode() * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f54983c;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RefreshTokenResult{accessToken='#####', expiresInMillis=" + this.f54982b + ", refreshToken='#####'}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f54982b != gVar.f54982b || !this.f54981a.equals(gVar.f54981a)) {
                return false;
            }
            String str = this.f54983c;
            String str2 = gVar.f54983c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public g(String str, long j2, String str2) {
        this.f54981a = str;
        this.f54982b = j2;
        this.f54983c = str2;
    }
}
