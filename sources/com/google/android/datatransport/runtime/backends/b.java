package com.google.android.datatransport.runtime.backends;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.g;
import java.util.Objects;

public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f49404a;

    /* renamed from: b  reason: collision with root package name */
    private final long f49405b;

    static {
        Covode.recordClassIndex(30912);
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public final g.a a() {
        return this.f49404a;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public final long b() {
        return this.f49405b;
    }

    public final int hashCode() {
        long j2 = this.f49405b;
        return ((this.f49404a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "BackendResponse{status=" + this.f49404a + ", nextRequestWaitMillis=" + this.f49405b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (!this.f49404a.equals(gVar.a()) || this.f49405b != gVar.b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public b(g.a aVar, long j2) {
        Objects.requireNonNull(aVar, "Null status");
        this.f49404a = aVar;
        this.f49405b = j2;
    }
}
