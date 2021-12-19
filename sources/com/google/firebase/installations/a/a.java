package com.google.firebase.installations.a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.a.c;
import com.google.firebase.installations.a.d;
import java.util.Objects;

final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final String f54516b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f54517c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54518d;

    /* renamed from: e  reason: collision with root package name */
    private final String f54519e;

    /* renamed from: f  reason: collision with root package name */
    private final long f54520f;

    /* renamed from: g  reason: collision with root package name */
    private final long f54521g;

    /* renamed from: h  reason: collision with root package name */
    private final String f54522h;

    static {
        Covode.recordClassIndex(33833);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.a.a$a  reason: collision with other inner class name */
    public static final class C1243a extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f54523a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f54524b;

        /* renamed from: c  reason: collision with root package name */
        private String f54525c;

        /* renamed from: d  reason: collision with root package name */
        private String f54526d;

        /* renamed from: e  reason: collision with root package name */
        private Long f54527e;

        /* renamed from: f  reason: collision with root package name */
        private Long f54528f;

        /* renamed from: g  reason: collision with root package name */
        private String f54529g;

        static {
            Covode.recordClassIndex(33834);
        }

        C1243a() {
        }

        @Override // com.google.firebase.installations.a.d.a
        public final d a() {
            String str = "";
            if (this.f54524b == null) {
                str = str + " registrationStatus";
            }
            if (this.f54527e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f54528f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f54523a, this.f54524b, this.f54525c, this.f54526d, this.f54527e.longValue(), this.f54528f.longValue(), this.f54529g, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.firebase.installations.a.d.a
        public final d.a a(String str) {
            this.f54523a = str;
            return this;
        }

        @Override // com.google.firebase.installations.a.d.a
        public final d.a b(String str) {
            this.f54525c = str;
            return this;
        }

        @Override // com.google.firebase.installations.a.d.a
        public final d.a c(String str) {
            this.f54526d = str;
            return this;
        }

        @Override // com.google.firebase.installations.a.d.a
        public final d.a d(String str) {
            this.f54529g = str;
            return this;
        }

        @Override // com.google.firebase.installations.a.d.a
        public final d.a a(long j2) {
            this.f54527e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.a.d.a
        public final d.a b(long j2) {
            this.f54528f = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.a.d.a
        public final d.a a(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f54524b = aVar;
            return this;
        }

        private C1243a(d dVar) {
            this.f54523a = dVar.a();
            this.f54524b = dVar.b();
            this.f54525c = dVar.c();
            this.f54526d = dVar.d();
            this.f54527e = Long.valueOf(dVar.e());
            this.f54528f = Long.valueOf(dVar.f());
            this.f54529g = dVar.g();
        }

        /* synthetic */ C1243a(d dVar, byte b2) {
            this(dVar);
        }
    }

    @Override // com.google.firebase.installations.a.d
    public final String a() {
        return this.f54516b;
    }

    @Override // com.google.firebase.installations.a.d
    public final c.a b() {
        return this.f54517c;
    }

    @Override // com.google.firebase.installations.a.d
    public final String c() {
        return this.f54518d;
    }

    @Override // com.google.firebase.installations.a.d
    public final String d() {
        return this.f54519e;
    }

    @Override // com.google.firebase.installations.a.d
    public final long e() {
        return this.f54520f;
    }

    @Override // com.google.firebase.installations.a.d
    public final long f() {
        return this.f54521g;
    }

    @Override // com.google.firebase.installations.a.d
    public final String g() {
        return this.f54522h;
    }

    @Override // com.google.firebase.installations.a.d
    public final d.a h() {
        return new C1243a(this, (byte) 0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f54516b;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f54517c.hashCode()) * 1000003;
        String str2 = this.f54518d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f54519e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j2 = this.f54520f;
        long j3 = this.f54521g;
        int i4 = (((((i3 ^ hashCode3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f54522h;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i4 ^ i2;
    }

    public final String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f54516b + ", registrationStatus=" + this.f54517c + ", authToken=" + this.f54518d + ", refreshToken=" + this.f54519e + ", expiresInSecs=" + this.f54520f + ", tokenCreationEpochInSecs=" + this.f54521g + ", fisError=" + this.f54522h + "}";
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f54516b;
            if (str4 != null ? str4.equals(dVar.a()) : dVar.a() == null) {
                if (!this.f54517c.equals(dVar.b()) || ((str = this.f54518d) != null ? !str.equals(dVar.c()) : dVar.c() != null) || ((str2 = this.f54519e) != null ? !str2.equals(dVar.d()) : dVar.d() != null) || this.f54520f != dVar.e() || this.f54521g != dVar.f() || ((str3 = this.f54522h) != null ? !str3.equals(dVar.g()) : dVar.g() != null)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4) {
        this.f54516b = str;
        this.f54517c = aVar;
        this.f54518d = str2;
        this.f54519e = str3;
        this.f54520f = j2;
        this.f54521g = j3;
        this.f54522h = str4;
    }

    /* synthetic */ a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4, byte b2) {
        this(str, aVar, str2, str3, j2, j3, str4);
    }
}
