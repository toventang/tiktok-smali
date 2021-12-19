package com.bytedance.android.live.liveinteract.multilive.e;

import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.platform.common.e.a.b;
import com.bytedance.android.live.liveinteract.platform.common.e.a.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f11850f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f11851a;

    /* renamed from: b  reason: collision with root package name */
    public b f11852b;

    /* renamed from: c  reason: collision with root package name */
    public int f11853c;

    /* renamed from: d  reason: collision with root package name */
    public int f11854d;

    /* renamed from: e  reason: collision with root package name */
    public n f11855e;

    static {
        Covode.recordClassIndex(6465);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f11851a, gVar.f11851a) && l.a(this.f11852b, gVar.f11852b) && this.f11853c == gVar.f11853c && this.f11854d == gVar.f11854d && l.a(this.f11855e, gVar.f11855e);
    }

    public final int hashCode() {
        c cVar = this.f11851a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        b bVar = this.f11852b;
        int hashCode2 = (((((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f11853c) * 31) + this.f11854d) * 31;
        n nVar = this.f11855e;
        if (nVar != null) {
            i2 = nVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MultiLiveGuestWindowParam(seiRegion=" + this.f11851a + ", seiCanvas=" + this.f11852b + ", surfaceViewWidth=" + this.f11853c + ", surfaceViewHeight=" + this.f11854d + ", layoutType=" + this.f11855e + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6466);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public g(c cVar, b bVar, int i2, int i3, n nVar) {
        l.d(nVar, "");
        this.f11851a = cVar;
        this.f11852b = bVar;
        this.f11853c = i2;
        this.f11854d = i3;
        this.f11855e = nVar;
    }
}
