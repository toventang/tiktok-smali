package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.a.a.f;
import h.f.b.l;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class n implements f {
    public static final a G = new a((byte) 0);
    public a A;
    public b B;
    public String C;
    public List<? extends Object> D;
    public String E;
    public Set<String> F;

    /* renamed from: a  reason: collision with root package name */
    public String f30672a;

    /* renamed from: b  reason: collision with root package name */
    public int f30673b;

    /* renamed from: c  reason: collision with root package name */
    public String f30674c;

    /* renamed from: d  reason: collision with root package name */
    public String f30675d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f30676e;

    /* renamed from: f  reason: collision with root package name */
    public String f30677f;

    /* renamed from: g  reason: collision with root package name */
    public String f30678g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f30679h;

    /* renamed from: i  reason: collision with root package name */
    public String f30680i;

    /* renamed from: j  reason: collision with root package name */
    public String f30681j;

    /* renamed from: k  reason: collision with root package name */
    public int f30682k;

    /* renamed from: l  reason: collision with root package name */
    public long f30683l;

    /* renamed from: m  reason: collision with root package name */
    public long f30684m;
    public Map<String, Object> n;
    public String o;
    public String p;
    public long q;
    public boolean r;
    public String s;
    public int t;
    public Set<String> u;
    public String v;
    public boolean w;
    public boolean x;
    public d y;
    public i z;

    static {
        Covode.recordClassIndex(17819);
    }

    public n() {
        this(null, 0, null, null, null, null, null, null, 0, 0, null, null, null, null, 0, null, null, null, null, null, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f30672a, nVar.f30672a) && this.f30673b == nVar.f30673b && l.a(this.f30674c, nVar.f30674c) && l.a(this.f30675d, nVar.f30675d) && l.a(this.f30676e, nVar.f30676e) && l.a(this.f30677f, nVar.f30677f) && l.a(this.f30678g, nVar.f30678g) && this.f30679h == nVar.f30679h && l.a(this.f30680i, nVar.f30680i) && l.a(this.f30681j, nVar.f30681j) && this.f30682k == nVar.f30682k && this.f30683l == nVar.f30683l && this.f30684m == nVar.f30684m && l.a(this.n, nVar.n) && l.a(this.o, nVar.o) && l.a(this.p, nVar.p) && this.q == nVar.q && this.r == nVar.r && l.a(this.s, nVar.s) && this.t == nVar.t && l.a(this.u, nVar.u) && l.a(this.v, nVar.v) && this.w == nVar.w && this.x == nVar.x && l.a(this.y, nVar.y) && l.a(this.z, nVar.z) && l.a(this.A, nVar.A) && l.a(this.B, nVar.B) && l.a(this.C, nVar.C) && l.a(this.D, nVar.D) && l.a(this.E, nVar.E) && l.a(this.F, nVar.F);
    }

    public final int hashCode() {
        String str = this.f30672a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f30673b) * 31;
        String str2 = this.f30674c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30675d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Throwable th = this.f30676e;
        int hashCode4 = (hashCode3 + (th != null ? th.hashCode() : 0)) * 31;
        String str4 = this.f30677f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f30678g;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z2 = this.f30679h;
        int i3 = 1;
        if (z2) {
            z2 = true;
        }
        int i4 = z2 ? 1 : 0;
        int i5 = z2 ? 1 : 0;
        int i6 = z2 ? 1 : 0;
        int i7 = (hashCode6 + i4) * 31;
        String str6 = this.f30680i;
        int hashCode7 = (i7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f30681j;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        long j2 = this.f30683l;
        long j3 = this.f30684m;
        int i8 = (((((((hashCode7 + hashCode8) * 31) + this.f30682k) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Map<String, Object> map = this.n;
        int hashCode9 = (i8 + (map != null ? map.hashCode() : 0)) * 31;
        String str8 = this.o;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.p;
        int hashCode11 = str9 != null ? str9.hashCode() : 0;
        long j4 = this.q;
        int i9 = (((hashCode10 + hashCode11) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        boolean z3 = this.r;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        String str10 = this.s;
        int hashCode12 = (((i13 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.t) * 31;
        Set<String> set = this.u;
        int hashCode13 = (hashCode12 + (set != null ? set.hashCode() : 0)) * 31;
        String str11 = this.v;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        boolean z4 = this.w;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (hashCode14 + i14) * 31;
        if (!this.x) {
            i3 = 0;
        }
        int i18 = (i17 + i3) * 31;
        d dVar = this.y;
        int hashCode15 = (i18 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        i iVar = this.z;
        int hashCode16 = (hashCode15 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        a aVar = this.A;
        int hashCode17 = (hashCode16 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.B;
        int hashCode18 = (hashCode17 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str12 = this.C;
        int hashCode19 = (hashCode18 + (str12 != null ? str12.hashCode() : 0)) * 31;
        List<? extends Object> list = this.D;
        int hashCode20 = (hashCode19 + (list != null ? list.hashCode() : 0)) * 31;
        String str13 = this.E;
        int hashCode21 = (hashCode20 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Set<String> set2 = this.F;
        if (set2 != null) {
            i2 = set2.hashCode();
        }
        return hashCode21 + i2;
    }

    public final String toString() {
        return "PrivacyEvent(resourceId=" + this.f30672a + ", eventId=" + this.f30673b + ", eventName=" + this.f30674c + ", eventSubType=" + this.f30675d + ", eventCallThrowable=" + this.f30676e + ", eventCallStackStr=" + this.f30677f + ", eventPageStackStr=" + this.f30678g + ", isBackStarted=" + this.f30679h + ", eventTriggerScene=" + this.f30680i + ", eventCurrentPage=" + this.f30681j + ", eventProcessId=" + this.f30682k + ", startedTime=" + this.f30683l + ", hostAppVersionCode=" + this.f30684m + ", startedExtraInfo=" + this.n + ", eventLogType=" + this.o + ", eventType=" + this.p + ", targetObjectHashcode=" + this.q + ", isReflection=" + this.r + ", eventThreadName=" + this.s + ", actionType=" + this.t + ", warningTypes=" + this.u + ", userRegion=" + this.v + ", needUploadALog=" + this.w + ", filterEventExtraInfo=" + this.x + ", controlExtra=" + this.y + ", frequencyExtra=" + this.z + ", anchorExtra=" + this.A + ", closureExtra=" + this.B + ", crpCallingType=" + this.C + ", crpCallingEvents=" + this.D + ", permissionType=" + this.E + ", monitorScene=" + this.F + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17820);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(String str) {
        l.c(str, "");
        this.f30672a = str;
    }

    public final void b(String str) {
        l.c(str, "");
        this.f30674c = str;
    }

    public final void c(String str) {
        l.c(str, "");
        this.f30675d = str;
    }

    public final void d(String str) {
        l.c(str, "");
        this.f30677f = str;
    }

    public final void e(String str) {
        l.c(str, "");
        this.f30678g = str;
    }

    public final void f(String str) {
        l.c(str, "");
        this.f30680i = str;
    }

    public final void g(String str) {
        l.c(str, "");
        this.f30681j = str;
    }

    public final void h(String str) {
        l.c(str, "");
        this.o = str;
    }

    public final void i(String str) {
        l.c(str, "");
        this.p = str;
    }

    public final void j(String str) {
        l.c(str, "");
        this.s = str;
    }

    public final void k(String str) {
        l.c(str, "");
        this.E = str;
    }

    public final void a(Throwable th) {
        if (th != null) {
            this.f30677f = f.a(th);
            this.f30676e = th;
        }
    }

    private n(String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, int i3, long j2, Map<String, Object> map, String str8, String str9, String str10, int i4, Set<String> set, String str11, d dVar, String str12, Set<String> set2) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        l.c(str4, "");
        l.c(str5, "");
        l.c(str6, "");
        l.c(str7, "");
        l.c(map, "");
        l.c(str8, "");
        l.c(str9, "");
        l.c(str10, "");
        l.c(set, "");
        l.c(str11, "");
        l.c(dVar, "");
        l.c(str12, "");
        l.c(set2, "");
        this.f30672a = str;
        this.f30673b = i2;
        this.f30674c = str2;
        this.f30675d = str3;
        this.f30676e = null;
        this.f30677f = str4;
        this.f30678g = str5;
        this.f30679h = false;
        this.f30680i = str6;
        this.f30681j = str7;
        this.f30682k = i3;
        this.f30683l = j2;
        this.f30684m = 0;
        this.n = map;
        this.o = str8;
        this.p = str9;
        this.q = 0;
        this.r = false;
        this.s = str10;
        this.t = i4;
        this.u = set;
        this.v = str11;
        this.w = false;
        this.x = false;
        this.y = dVar;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = str12;
        this.F = set2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ n(java.lang.String r30, int r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, int r38, long r39, java.util.Map r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, int r45, java.util.Set r46, java.lang.String r47, com.bytedance.helios.api.b.d r48, java.lang.String r49, java.util.Set r50, int r51) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.b.n.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, java.util.Map, java.lang.String, java.lang.String, java.lang.String, int, java.util.Set, java.lang.String, com.bytedance.helios.api.b.d, java.lang.String, java.util.Set, int):void");
    }
}
