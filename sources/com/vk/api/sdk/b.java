package com.vk.api.sdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.f.a.c;
import com.vk.api.sdk.j;
import h.f.b.l;
import h.h;
import h.i;
import java.util.concurrent.TimeUnit;

public final class b {
    public static final a r = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f156228a;

    /* renamed from: b  reason: collision with root package name */
    public final int f156229b;

    /* renamed from: c  reason: collision with root package name */
    public final f f156230c;

    /* renamed from: d  reason: collision with root package name */
    public final h<String> f156231d;

    /* renamed from: e  reason: collision with root package name */
    public final String f156232e;

    /* renamed from: f  reason: collision with root package name */
    public final j f156233f;

    /* renamed from: g  reason: collision with root package name */
    public final long f156234g;

    /* renamed from: h  reason: collision with root package name */
    public final long f156235h;

    /* renamed from: i  reason: collision with root package name */
    public final c f156236i;

    /* renamed from: j  reason: collision with root package name */
    public final h<String> f156237j;

    /* renamed from: k  reason: collision with root package name */
    public final h<String> f156238k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f156239l;

    /* renamed from: m  reason: collision with root package name */
    public final h<Boolean> f156240m;
    public final int n;
    public final h<String> o;
    public final String p;
    public final h q;

    static {
        Covode.recordClassIndex(103757);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f156228a, bVar.f156228a) && this.f156229b == bVar.f156229b && l.a(this.f156230c, bVar.f156230c) && l.a(this.f156231d, bVar.f156231d) && l.a(this.f156232e, bVar.f156232e) && l.a(this.f156233f, bVar.f156233f) && this.f156234g == bVar.f156234g && this.f156235h == bVar.f156235h && l.a(this.f156236i, bVar.f156236i) && l.a(this.f156237j, bVar.f156237j) && l.a(this.f156238k, bVar.f156238k) && this.f156239l == bVar.f156239l && l.a(this.f156240m, bVar.f156240m) && this.n == bVar.n && l.a(this.o, bVar.o) && l.a(this.p, bVar.p) && l.a(this.q, bVar.q);
    }

    public final int hashCode() {
        Context context = this.f156228a;
        int i2 = 0;
        int hashCode = (((context != null ? context.hashCode() : 0) * 31) + this.f156229b) * 31;
        f fVar = this.f156230c;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        h<String> hVar = this.f156231d;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        String str = this.f156232e;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        j jVar = this.f156233f;
        int hashCode5 = jVar != null ? jVar.hashCode() : 0;
        long j2 = this.f156234g;
        long j3 = this.f156235h;
        int i3 = (((((hashCode4 + hashCode5) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        c cVar = this.f156236i;
        int hashCode6 = (i3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        h<String> hVar2 = this.f156237j;
        int hashCode7 = (hashCode6 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        h<String> hVar3 = this.f156238k;
        int hashCode8 = (hashCode7 + (hVar3 != null ? hVar3.hashCode() : 0)) * 31;
        boolean z = this.f156239l;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode8 + i4) * 31;
        h<Boolean> hVar4 = this.f156240m;
        int hashCode9 = (((i7 + (hVar4 != null ? hVar4.hashCode() : 0)) * 31) + this.n) * 31;
        h<String> hVar5 = this.o;
        int hashCode10 = (hashCode9 + (hVar5 != null ? hVar5.hashCode() : 0)) * 31;
        String str2 = this.p;
        int hashCode11 = (hashCode10 + (str2 != null ? str2.hashCode() : 0)) * 31;
        h hVar6 = this.q;
        if (hVar6 != null) {
            i2 = hVar6.hashCode();
        }
        return hashCode11 + i2;
    }

    public final String toString() {
        return "VKApiConfig(context=" + this.f156228a + ", appId=" + this.f156229b + ", validationHandler=" + this.f156230c + ", deviceId=" + this.f156231d + ", version=" + this.f156232e + ", okHttpProvider=" + this.f156233f + ", defaultTimeoutMs=" + this.f156234g + ", postRequestsTimeout=" + this.f156235h + ", logger=" + this.f156236i + ", accessToken=" + this.f156237j + ", secret=" + this.f156238k + ", logFilterCredentials=" + this.f156239l + ", debugCycleCalls=" + this.f156240m + ", callsPerSecondLimit=" + this.n + ", httpApiHost=" + this.o + ", lang=" + this.p + ", keyValueStorage=" + this.q + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103764);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ b(Context context, int i2, f fVar) {
        this(context, i2, fVar, i.a((h.f.a.a) AnonymousClass1.f156241a), "5.90", new j.b(), TimeUnit.SECONDS.toMillis(10), TimeUnit.MINUTES.toMillis(5), new com.vk.api.sdk.f.a.a(i.a((h.f.a.a) AnonymousClass2.f156242a), "VKSdkApi"), i.a((h.f.a.a) AnonymousClass3.f156243a), i.a((h.f.a.a) AnonymousClass4.f156244a), i.a((h.f.a.a) AnonymousClass5.f156245a), i.a((h.f.a.a) AnonymousClass6.f156246a), "en", new k(context));
    }

    private b(Context context, int i2, f fVar, h<String> hVar, String str, j jVar, long j2, long j3, c cVar, h<String> hVar2, h<String> hVar3, h<Boolean> hVar4, h<String> hVar5, String str2, h hVar6) {
        l.c(context, "");
        l.c(hVar, "");
        l.c(str, "");
        l.c(jVar, "");
        l.c(cVar, "");
        l.c(hVar2, "");
        l.c(hVar3, "");
        l.c(hVar4, "");
        l.c(hVar5, "");
        l.c(str2, "");
        l.c(hVar6, "");
        this.f156228a = context;
        this.f156229b = i2;
        this.f156230c = fVar;
        this.f156231d = hVar;
        this.f156232e = str;
        this.f156233f = jVar;
        this.f156234g = j2;
        this.f156235h = j3;
        this.f156236i = cVar;
        this.f156237j = hVar2;
        this.f156238k = hVar3;
        this.f156239l = true;
        this.f156240m = hVar4;
        this.n = 3;
        this.o = hVar5;
        this.p = str2;
        this.q = hVar6;
    }
}
