package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class i extends s {

    /* renamed from: a  reason: collision with root package name */
    private final long f49356a;

    static {
        Covode.recordClassIndex(30869);
    }

    @Override // com.google.android.datatransport.cct.a.s
    public final long a() {
        return this.f49356a;
    }

    public final int hashCode() {
        long j2 = this.f49356a;
        return 1000003 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f49356a + "}";
    }

    i(long j2) {
        this.f49356a = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || this.f49356a != ((s) obj).a()) {
            return false;
        }
        return true;
    }
}
