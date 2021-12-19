package com.google.android.datatransport.runtime.scheduling.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.h;
import com.google.android.datatransport.runtime.k;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final long f49495a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49496b;

    /* renamed from: c  reason: collision with root package name */
    private final h f49497c;

    static {
        Covode.recordClassIndex(30967);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.g
    public final long a() {
        return this.f49495a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.g
    public final k b() {
        return this.f49496b;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.g
    public final h c() {
        return this.f49497c;
    }

    public final int hashCode() {
        long j2 = this.f49495a;
        return this.f49497c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f49496b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f49495a + ", transportContext=" + this.f49496b + ", event=" + this.f49497c + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f49495a != gVar.a() || !this.f49496b.equals(gVar.b()) || !this.f49497c.equals(gVar.c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    b(long j2, k kVar, h hVar) {
        this.f49495a = j2;
        Objects.requireNonNull(kVar, "Null transportContext");
        this.f49496b = kVar;
        Objects.requireNonNull(hVar, "Null event");
        this.f49497c = hVar;
    }
}
