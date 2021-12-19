package com.linecorp.linesdk.a;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f54967a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f54968b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54969c;

    static {
        Covode.recordClassIndex(34523);
    }

    public final int hashCode() {
        long j2 = this.f54967a;
        return (((Integer.valueOf(this.f54969c).intValue() * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f54968b.hashCode();
    }

    public final String toString() {
        return "AccessTokenVerificationResult{expiresInMillis=" + this.f54967a + ", channelId=" + this.f54969c + ", permissions=" + this.f54968b + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f54969c.equals(bVar.f54969c) && this.f54967a == bVar.f54967a) {
            return this.f54968b.equals(bVar.f54968b);
        }
        return false;
    }

    public b(String str, long j2, List<String> list) {
        this.f54969c = str;
        this.f54967a = j2;
        this.f54968b = Collections.unmodifiableList(list);
    }
}
