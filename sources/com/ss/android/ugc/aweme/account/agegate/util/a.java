package com.ss.android.ugc.aweme.account.agegate.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import h.f.b.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f62798a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.account.login.f.c f62799b;

    /* renamed from: c  reason: collision with root package name */
    private final AgeGateResponse f62800c;

    /* renamed from: d  reason: collision with root package name */
    private final String f62801d;

    /* renamed from: e  reason: collision with root package name */
    private final String f62802e;

    /* renamed from: f  reason: collision with root package name */
    private final String f62803f;

    /* renamed from: g  reason: collision with root package name */
    private final long f62804g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f62805h;

    static {
        Covode.recordClassIndex(38693);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.util.a$a  reason: collision with other inner class name */
    public static final class C1382a extends a {

        /* renamed from: b  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.account.login.f.c f62806b;

        /* renamed from: c  reason: collision with root package name */
        private final AgeGateResponse f62807c;

        /* renamed from: d  reason: collision with root package name */
        private final String f62808d;

        /* renamed from: e  reason: collision with root package name */
        private final String f62809e;

        /* renamed from: f  reason: collision with root package name */
        private final String f62810f;

        /* renamed from: g  reason: collision with root package name */
        private final long f62811g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f62812h;

        static {
            Covode.recordClassIndex(38694);
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final com.ss.android.ugc.aweme.account.login.f.c a() {
            return this.f62806b;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final AgeGateResponse b() {
            return this.f62807c;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final String c() {
            return this.f62808d;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final String d() {
            return this.f62809e;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final String e() {
            return this.f62810f;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final long f() {
            return this.f62811g;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final boolean g() {
            return this.f62812h;
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            com.ss.android.ugc.aweme.account.login.f.c cVar = this.f62806b;
            int i6 = 0;
            if (cVar != null) {
                i2 = cVar.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = i2 * 31;
            AgeGateResponse ageGateResponse = this.f62807c;
            if (ageGateResponse != null) {
                i3 = ageGateResponse.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str = this.f62808d;
            if (str != null) {
                i4 = str.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            String str2 = this.f62809e;
            if (str2 != null) {
                i5 = str2.hashCode();
            } else {
                i5 = 0;
            }
            int i10 = (i9 + i5) * 31;
            String str3 = this.f62810f;
            if (str3 != null) {
                i6 = str3.hashCode();
            }
            long j2 = this.f62811g;
            int i11 = (((i10 + i6) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            boolean z = this.f62812h;
            if (z) {
                z = true;
            }
            int i12 = z ? 1 : 0;
            int i13 = z ? 1 : 0;
            int i14 = z ? 1 : 0;
            return i11 + i12;
        }

        public final String toString() {
            return "AgeGateResponseEvent(userRetentionType=" + this.f62806b + ", ageGateResponseNetworkEntity=" + this.f62807c + ", enterFrom=" + this.f62808d + ", enterMethod=" + this.f62809e + ", platform=" + this.f62810f + ", pageStayTime=" + this.f62811g + ", nicknameProvided=" + this.f62812h + ")";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1382a)) {
                return false;
            }
            C1382a aVar = (C1382a) obj;
            if (!l.a(this.f62806b, aVar.f62806b) || !l.a(this.f62807c, aVar.f62807c) || !l.a((Object) this.f62808d, (Object) aVar.f62808d) || !l.a((Object) this.f62809e, (Object) aVar.f62809e) || !l.a((Object) this.f62810f, (Object) aVar.f62810f) || this.f62811g != aVar.f62811g || this.f62812h != aVar.f62812h) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C1382a(com.ss.android.ugc.aweme.account.login.f.c cVar, AgeGateResponse ageGateResponse, String str, String str2, String str3, long j2) {
            this(cVar, ageGateResponse, str, str2, str3, j2, false);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1382a(com.ss.android.ugc.aweme.account.login.f.c cVar, AgeGateResponse ageGateResponse, String str, String str2, String str3, long j2, boolean z) {
            super("age_gate_response", cVar, ageGateResponse, str, str2, str3, j2, z, (byte) 0);
            l.d(cVar, "");
            l.d(ageGateResponse, "");
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            this.f62806b = cVar;
            this.f62807c = ageGateResponse;
            this.f62808d = str;
            this.f62809e = str2;
            this.f62810f = str3;
            this.f62811g = j2;
            this.f62812h = z;
        }
    }

    public static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final int f62813b;

        /* renamed from: c  reason: collision with root package name */
        private final AgeGateResponse f62814c;

        /* renamed from: d  reason: collision with root package name */
        private final String f62815d;

        /* renamed from: e  reason: collision with root package name */
        private final String f62816e;

        /* renamed from: f  reason: collision with root package name */
        private final long f62817f;

        static {
            Covode.recordClassIndex(38695);
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final AgeGateResponse b() {
            return this.f62814c;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final String c() {
            return this.f62815d;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final String d() {
            return this.f62816e;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final long f() {
            return this.f62817f;
        }

        public final int hashCode() {
            int i2;
            int i3;
            AgeGateResponse ageGateResponse = this.f62814c;
            int i4 = 0;
            if (ageGateResponse != null) {
                i2 = ageGateResponse.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = i2 * 31;
            String str = this.f62815d;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            int i6 = (i5 + i3) * 31;
            String str2 = this.f62816e;
            if (str2 != null) {
                i4 = str2.hashCode();
            }
            long j2 = this.f62817f;
            return ((((i6 + i4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f62813b;
        }

        public final String toString() {
            return "EditAgeGateResponseEvent(ageGateResponseNetworkEntity=" + this.f62814c + ", enterFrom=" + this.f62815d + ", enterMethod=" + this.f62816e + ", pageStayTime=" + this.f62817f + ", userAgeStatus=" + this.f62813b + ")";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!l.a(this.f62814c, bVar.f62814c) || !l.a((Object) this.f62815d, (Object) bVar.f62815d) || !l.a((Object) this.f62816e, (Object) bVar.f62816e) || this.f62817f != bVar.f62817f || this.f62813b != bVar.f62813b) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(AgeGateResponse ageGateResponse, String str, String str2, long j2, int i2) {
            super("age_edit_response", com.ss.android.ugc.aweme.account.login.f.c.EXISTING_USER, ageGateResponse, str, str2, "", j2);
            l.d(ageGateResponse, "");
            l.d(str, "");
            l.d(str2, "");
            this.f62814c = ageGateResponse;
            this.f62815d = str;
            this.f62816e = str2;
            this.f62817f = j2;
            this.f62813b = i2;
        }
    }

    public static final class c extends a {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f62818b;

        /* renamed from: c  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.account.login.f.c f62819c;

        /* renamed from: d  reason: collision with root package name */
        private final AgeGateResponse f62820d;

        /* renamed from: e  reason: collision with root package name */
        private final String f62821e;

        /* renamed from: f  reason: collision with root package name */
        private final String f62822f;

        /* renamed from: g  reason: collision with root package name */
        private final String f62823g;

        /* renamed from: h  reason: collision with root package name */
        private final long f62824h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f62825i;

        static {
            Covode.recordClassIndex(38696);
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final com.ss.android.ugc.aweme.account.login.f.c a() {
            return this.f62819c;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final AgeGateResponse b() {
            return this.f62820d;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final String c() {
            return this.f62822f;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final String d() {
            return this.f62821e;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final String e() {
            return this.f62823g;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final long f() {
            return this.f62824h;
        }

        @Override // com.ss.android.ugc.aweme.account.agegate.util.a
        public final boolean g() {
            return this.f62825i;
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            com.ss.android.ugc.aweme.account.login.f.c cVar = this.f62819c;
            int i6 = 0;
            if (cVar != null) {
                i2 = cVar.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = i2 * 31;
            AgeGateResponse ageGateResponse = this.f62820d;
            if (ageGateResponse != null) {
                i3 = ageGateResponse.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str = this.f62821e;
            if (str != null) {
                i4 = str.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            String str2 = this.f62822f;
            if (str2 != null) {
                i5 = str2.hashCode();
            } else {
                i5 = 0;
            }
            int i10 = (i9 + i5) * 31;
            String str3 = this.f62823g;
            if (str3 != null) {
                i6 = str3.hashCode();
            }
            long j2 = this.f62824h;
            int i11 = (((i10 + i6) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            boolean z = this.f62818b;
            int i12 = 1;
            if (z) {
                z = true;
            }
            int i13 = z ? 1 : 0;
            int i14 = z ? 1 : 0;
            int i15 = z ? 1 : 0;
            int i16 = (i11 + i13) * 31;
            if (!this.f62825i) {
                i12 = 0;
            }
            return i16 + i12;
        }

        public final String toString() {
            return "FTCAgeGateResponseEvent(userRetentionType=" + this.f62819c + ", ageGateResponseNetworkEntity=" + this.f62820d + ", enterMethod=" + this.f62821e + ", enterFrom=" + this.f62822f + ", platform=" + this.f62823g + ", pageStayTime=" + this.f62824h + ", isWeb=" + this.f62818b + ", nicknameProvided=" + this.f62825i + ")";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!l.a(this.f62819c, cVar.f62819c) || !l.a(this.f62820d, cVar.f62820d) || !l.a((Object) this.f62821e, (Object) cVar.f62821e) || !l.a((Object) this.f62822f, (Object) cVar.f62822f) || !l.a((Object) this.f62823g, (Object) cVar.f62823g) || this.f62824h != cVar.f62824h || this.f62818b != cVar.f62818b || this.f62825i != cVar.f62825i) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private c(com.ss.android.ugc.aweme.account.login.f.c cVar, AgeGateResponse ageGateResponse, String str, String str2, String str3, long j2, boolean z) {
            super("f_age_gate_response", cVar, ageGateResponse, "", str, str3, j2);
            l.d(cVar, "");
            l.d(ageGateResponse, "");
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            this.f62819c = cVar;
            this.f62820d = ageGateResponse;
            this.f62821e = str;
            this.f62822f = str2;
            this.f62823g = str3;
            this.f62824h = j2;
            this.f62818b = false;
            this.f62825i = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(com.ss.android.ugc.aweme.account.login.f.c cVar, AgeGateResponse ageGateResponse, String str, String str2, String str3, long j2, boolean z, int i2) {
            this(cVar, ageGateResponse, str, str2, str3, j2, (i2 & 128) != 0 ? false : z);
        }
    }

    public com.ss.android.ugc.aweme.account.login.f.c a() {
        return this.f62799b;
    }

    public AgeGateResponse b() {
        return this.f62800c;
    }

    public String c() {
        return this.f62801d;
    }

    public String d() {
        return this.f62802e;
    }

    public String e() {
        return this.f62803f;
    }

    public long f() {
        return this.f62804g;
    }

    public boolean g() {
        return this.f62805h;
    }

    public static final class d extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final d f62826b = new d();

        static {
            Covode.recordClassIndex(38697);
        }

        private d() {
            super("", com.ss.android.ugc.aweme.account.login.f.c.NEW_USER, new AgeGateResponse(-1, null, false, 0, 0, null, 56, null), "", "", "", 0);
        }
    }

    public /* synthetic */ a(String str, com.ss.android.ugc.aweme.account.login.f.c cVar, AgeGateResponse ageGateResponse, String str2, String str3, String str4, long j2) {
        this(str, cVar, ageGateResponse, str2, str3, str4, j2, false);
    }

    private a(String str, com.ss.android.ugc.aweme.account.login.f.c cVar, AgeGateResponse ageGateResponse, String str2, String str3, String str4, long j2, boolean z) {
        this.f62798a = str;
        this.f62799b = cVar;
        this.f62800c = ageGateResponse;
        this.f62801d = str2;
        this.f62802e = str3;
        this.f62803f = str4;
        this.f62804g = j2;
        this.f62805h = z;
    }

    public /* synthetic */ a(String str, com.ss.android.ugc.aweme.account.login.f.c cVar, AgeGateResponse ageGateResponse, String str2, String str3, String str4, long j2, boolean z, byte b2) {
        this(str, cVar, ageGateResponse, str2, str3, str4, j2, z);
    }
}
