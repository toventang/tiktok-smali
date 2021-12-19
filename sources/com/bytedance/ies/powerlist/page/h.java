package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.i;
import h.f.b.l;

public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final h f34395c = new h(new i.e(e.Refresh, (byte) 0), new a());

    /* renamed from: d  reason: collision with root package name */
    public static final a f34396d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final i f34397a;

    /* renamed from: b  reason: collision with root package name */
    public final a f34398b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f34397a, hVar.f34397a) && l.a(this.f34398b, hVar.f34398b);
    }

    public final int hashCode() {
        i iVar = this.f34397a;
        int i2 = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        a aVar = this.f34398b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PowerPageData(event=" + this.f34397a + ", state=" + this.f34398b + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20550);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(20549);
    }

    public h(i iVar, a aVar) {
        l.c(iVar, "");
        l.c(aVar, "");
        this.f34397a = iVar;
        this.f34398b = aVar;
    }
}
