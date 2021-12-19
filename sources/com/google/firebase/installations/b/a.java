package com.google.firebase.installations.b;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.b.d;

final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f54539a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54540b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54541c;

    /* renamed from: d  reason: collision with root package name */
    private final e f54542d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f54543e;

    static {
        Covode.recordClassIndex(33841);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.b.a$a  reason: collision with other inner class name */
    public static final class C1244a extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f54544a;

        /* renamed from: b  reason: collision with root package name */
        private String f54545b;

        /* renamed from: c  reason: collision with root package name */
        private String f54546c;

        /* renamed from: d  reason: collision with root package name */
        private e f54547d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f54548e;

        static {
            Covode.recordClassIndex(33842);
        }

        C1244a() {
        }

        @Override // com.google.firebase.installations.b.d.a
        public final d a() {
            return new a(this.f54544a, this.f54545b, this.f54546c, this.f54547d, this.f54548e, (byte) 0);
        }

        @Override // com.google.firebase.installations.b.d.a
        public final d.a a(d.b bVar) {
            this.f54548e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.b.d.a
        public final d.a b(String str) {
            this.f54545b = str;
            return this;
        }

        @Override // com.google.firebase.installations.b.d.a
        public final d.a c(String str) {
            this.f54546c = str;
            return this;
        }

        @Override // com.google.firebase.installations.b.d.a
        public final d.a a(e eVar) {
            this.f54547d = eVar;
            return this;
        }

        @Override // com.google.firebase.installations.b.d.a
        public final d.a a(String str) {
            this.f54544a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.b.d
    public final String a() {
        return this.f54539a;
    }

    @Override // com.google.firebase.installations.b.d
    public final String b() {
        return this.f54540b;
    }

    @Override // com.google.firebase.installations.b.d
    public final String c() {
        return this.f54541c;
    }

    @Override // com.google.firebase.installations.b.d
    public final e d() {
        return this.f54542d;
    }

    @Override // com.google.firebase.installations.b.d
    public final d.b e() {
        return this.f54543e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f54539a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f54540b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str3 = this.f54541c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        e eVar = this.f54542d;
        if (eVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = eVar.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        d.b bVar = this.f54543e;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i6 ^ i2;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f54539a + ", fid=" + this.f54540b + ", refreshToken=" + this.f54541c + ", authToken=" + this.f54542d + ", responseCode=" + this.f54543e + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f54539a;
            if (str != null ? str.equals(dVar.a()) : dVar.a() == null) {
                String str2 = this.f54540b;
                if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                    String str3 = this.f54541c;
                    if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                        e eVar = this.f54542d;
                        if (eVar != null ? eVar.equals(dVar.d()) : dVar.d() == null) {
                            d.b bVar = this.f54543e;
                            if (bVar != null ? !bVar.equals(dVar.e()) : dVar.e() != null) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private a(String str, String str2, String str3, e eVar, d.b bVar) {
        this.f54539a = str;
        this.f54540b = str2;
        this.f54541c = str3;
        this.f54542d = eVar;
        this.f54543e = bVar;
    }

    /* synthetic */ a(String str, String str2, String str3, e eVar, d.b bVar, byte b2) {
        this(str, str2, str3, eVar, bVar);
    }
}
