package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.l;
import java.util.Objects;

final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f54510a;

    /* renamed from: b  reason: collision with root package name */
    private final long f54511b;

    /* renamed from: c  reason: collision with root package name */
    private final long f54512c;

    static {
        Covode.recordClassIndex(33831);
    }

    /* renamed from: com.google.firebase.installations.a$a  reason: collision with other inner class name */
    static final class C1242a extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private String f54513a;

        /* renamed from: b  reason: collision with root package name */
        private Long f54514b;

        /* renamed from: c  reason: collision with root package name */
        private Long f54515c;

        static {
            Covode.recordClassIndex(33832);
        }

        C1242a() {
        }

        @Override // com.google.firebase.installations.l.a
        public final l a() {
            String str = "";
            if (this.f54513a == null) {
                str = str + " token";
            }
            if (this.f54514b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f54515c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f54513a, this.f54514b.longValue(), this.f54515c.longValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.firebase.installations.l.a
        public final l.a a(long j2) {
            this.f54514b = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.l.a
        public final l.a b(long j2) {
            this.f54515c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.l.a
        public final l.a a(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f54513a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.l
    public final String a() {
        return this.f54510a;
    }

    @Override // com.google.firebase.installations.l
    public final long b() {
        return this.f54511b;
    }

    @Override // com.google.firebase.installations.l
    public final long c() {
        return this.f54512c;
    }

    public final int hashCode() {
        long j2 = this.f54511b;
        long j3 = this.f54512c;
        return ((((this.f54510a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f54510a + ", tokenExpirationTimestamp=" + this.f54511b + ", tokenCreationTimestamp=" + this.f54512c + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f54510a.equals(lVar.a()) && this.f54511b == lVar.b() && this.f54512c == lVar.c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private a(String str, long j2, long j3) {
        this.f54510a = str;
        this.f54511b = j2;
        this.f54512c = j3;
    }

    /* synthetic */ a(String str, long j2, long j3, byte b2) {
        this(str, j2, j3);
    }
}
