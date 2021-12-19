package com.google.firebase.installations.b;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.b.e;

final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private final String f54549a;

    /* renamed from: b  reason: collision with root package name */
    private final long f54550b;

    /* renamed from: c  reason: collision with root package name */
    private final e.b f54551c;

    static {
        Covode.recordClassIndex(33843);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private String f54552a;

        /* renamed from: b  reason: collision with root package name */
        private Long f54553b;

        /* renamed from: c  reason: collision with root package name */
        private e.b f54554c;

        static {
            Covode.recordClassIndex(33844);
        }

        a() {
        }

        @Override // com.google.firebase.installations.b.e.a
        public final e a() {
            String str = "";
            if (this.f54553b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f54552a, this.f54553b.longValue(), this.f54554c, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.firebase.installations.b.e.a
        public final e.a a(e.b bVar) {
            this.f54554c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.b.e.a
        public final e.a a(long j2) {
            this.f54553b = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.b.e.a
        public final e.a a(String str) {
            this.f54552a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.b.e
    public final String a() {
        return this.f54549a;
    }

    @Override // com.google.firebase.installations.b.e
    public final long b() {
        return this.f54550b;
    }

    @Override // com.google.firebase.installations.b.e
    public final e.b c() {
        return this.f54551c;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f54549a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j2 = this.f54550b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        e.b bVar = this.f54551c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f54549a + ", tokenExpirationTimestamp=" + this.f54550b + ", responseCode=" + this.f54551c + "}";
    }

    public final boolean equals(Object obj) {
        e.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            String str = this.f54549a;
            if (str != null ? str.equals(eVar.a()) : eVar.a() == null) {
                if (this.f54550b != eVar.b() || ((bVar = this.f54551c) != null ? !bVar.equals(eVar.c()) : eVar.c() != null)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private b(String str, long j2, e.b bVar) {
        this.f54549a = str;
        this.f54550b = j2;
        this.f54551c = bVar;
    }

    /* synthetic */ b(String str, long j2, e.b bVar, byte b2) {
        this(str, j2, bVar);
    }
}
