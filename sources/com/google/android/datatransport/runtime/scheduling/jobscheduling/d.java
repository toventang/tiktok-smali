package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Objects;
import java.util.Set;

final class d extends g.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f49560a;

    /* renamed from: b  reason: collision with root package name */
    private final long f49561b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<g.c> f49562c;

    static {
        Covode.recordClassIndex(31007);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends g.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f49563a;

        /* renamed from: b  reason: collision with root package name */
        private Long f49564b;

        /* renamed from: c  reason: collision with root package name */
        private Set<g.c> f49565c;

        static {
            Covode.recordClassIndex(31008);
        }

        a() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public final g.b.a a() {
            this.f49564b = 86400000L;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public final g.b b() {
            String str = "";
            if (this.f49563a == null) {
                str = str + " delta";
            }
            if (this.f49564b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f49565c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f49563a.longValue(), this.f49564b.longValue(), this.f49565c, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public final g.b.a a(long j2) {
            this.f49563a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public final g.b.a a(Set<g.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f49565c = set;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    public final long a() {
        return this.f49560a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    public final long b() {
        return this.f49561b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    public final Set<g.c> c() {
        return this.f49562c;
    }

    public final int hashCode() {
        long j2 = this.f49560a;
        long j3 = this.f49561b;
        return this.f49562c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f49560a + ", maxAllowedDelay=" + this.f49561b + ", flags=" + this.f49562c + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g.b) {
            g.b bVar = (g.b) obj;
            if (this.f49560a == bVar.a() && this.f49561b == bVar.b() && this.f49562c.equals(bVar.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private d(long j2, long j3, Set<g.c> set) {
        this.f49560a = j2;
        this.f49561b = j3;
        this.f49562c = set;
    }

    /* synthetic */ d(long j2, long j3, Set set, byte b2) {
        this(j2, j3, set);
    }
}
