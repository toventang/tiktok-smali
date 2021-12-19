package com.ss.android.ugc.aweme.shortvideo.g;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f128523e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f128524a;

    /* renamed from: b  reason: collision with root package name */
    public final int f128525b;

    /* renamed from: c  reason: collision with root package name */
    public final int f128526c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<z> f128527d;

    static {
        Covode.recordClassIndex(84268);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f128524a, bVar.f128524a) && this.f128525b == bVar.f128525b && this.f128526c == bVar.f128526c && l.a(this.f128527d, bVar.f128527d);
    }

    public final int hashCode() {
        String str = this.f128524a;
        int i2 = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f128525b) * 31) + this.f128526c) * 31;
        h.f.a.a<z> aVar = this.f128527d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BubbleViewData(key=" + this.f128524a + ", times=" + this.f128525b + ", priority=" + this.f128526c + ", show=" + this.f128527d + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84269);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private b(String str, int i2, h.f.a.a<z> aVar) {
        l.d(str, "");
        l.d(aVar, "");
        this.f128524a = str;
        this.f128525b = 1;
        this.f128526c = i2;
        this.f128527d = aVar;
    }

    public /* synthetic */ b(String str, int i2, h.f.a.a aVar, byte b2) {
        this(str, i2, aVar);
    }
}
