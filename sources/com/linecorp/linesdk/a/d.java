package com.linecorp.linesdk.a;

import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f54973a;

    /* renamed from: b  reason: collision with root package name */
    public final long f54974b;

    /* renamed from: c  reason: collision with root package name */
    public final long f54975c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54976d;

    static {
        Covode.recordClassIndex(34526);
    }

    public final int hashCode() {
        long j2 = this.f54974b;
        long j3 = this.f54975c;
        return (((((this.f54973a.hashCode() * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f54976d.hashCode();
    }

    public final String toString() {
        return "InternalAccessToken{accessToken='#####', expiresInMillis=" + this.f54974b + ", issuedClientTimeMillis=" + this.f54975c + ", refreshToken='" + this.f54976d + '\'' + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f54974b == dVar.f54974b && this.f54975c == dVar.f54975c && this.f54973a.equals(dVar.f54973a)) {
            return this.f54976d.equals(dVar.f54976d);
        }
        return false;
    }

    public d(String str, long j2, long j3, String str2) {
        this.f54973a = str;
        this.f54974b = j2;
        this.f54975c = j3;
        this.f54976d = str2;
    }
}
