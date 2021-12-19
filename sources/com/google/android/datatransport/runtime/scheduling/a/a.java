package com.google.android.datatransport.runtime.scheduling.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.a.d;

final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final long f49475b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49476c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49477d;

    /* renamed from: e  reason: collision with root package name */
    private final long f49478e;

    static {
        Covode.recordClassIndex(30959);
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.a$a  reason: collision with other inner class name */
    static final class C1200a extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f49479a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f49480b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f49481c;

        /* renamed from: d  reason: collision with root package name */
        private Long f49482d;

        static {
            Covode.recordClassIndex(30960);
        }

        C1200a() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.a.d.a
        public final d.a a() {
            this.f49479a = 10485760L;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.a.d.a
        public final d.a b() {
            this.f49480b = 200;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.a.d.a
        public final d.a c() {
            this.f49481c = 10000;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.a.d.a
        public final d.a d() {
            this.f49482d = 604800000L;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.a.d.a
        public final d e() {
            String str = "";
            if (this.f49479a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f49480b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f49481c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f49482d == null) {
                str = str + " eventCleanUpAge";
            }
            if (str.isEmpty()) {
                return new a(this.f49479a.longValue(), this.f49480b.intValue(), this.f49481c.intValue(), this.f49482d.longValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.a.d
    public final long a() {
        return this.f49475b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.a.d
    public final int b() {
        return this.f49476c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.a.d
    public final int c() {
        return this.f49477d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.a.d
    public final long d() {
        return this.f49478e;
    }

    public final int hashCode() {
        long j2 = this.f49475b;
        long j3 = this.f49478e;
        return ((int) (j3 ^ (j3 >>> 32))) ^ ((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f49476c) * 1000003) ^ this.f49477d) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f49475b + ", loadBatchSize=" + this.f49476c + ", criticalSectionEnterTimeoutMs=" + this.f49477d + ", eventCleanUpAge=" + this.f49478e + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f49475b == dVar.a() && this.f49476c == dVar.b() && this.f49477d == dVar.c() && this.f49478e == dVar.d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private a(long j2, int i2, int i3, long j3) {
        this.f49475b = j2;
        this.f49476c = i2;
        this.f49477d = i3;
        this.f49478e = j3;
    }

    /* synthetic */ a(long j2, int i2, int i3, long j3, byte b2) {
        this(j2, i2, i3, j3);
    }
}
