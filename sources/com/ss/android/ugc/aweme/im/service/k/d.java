package com.ss.android.ugc.aweme.im.service.k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a */
    public final e f103875a;

    /* renamed from: b */
    public final c f103876b;

    /* renamed from: c */
    public final boolean f103877c;

    static {
        Covode.recordClassIndex(66550);
    }

    public d() {
        this(null, null, false, 7);
    }

    public static d a(e eVar, c cVar, boolean z) {
        l.d(eVar, "");
        l.d(cVar, "");
        return new d(eVar, cVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f103875a, dVar.f103875a) && l.a(this.f103876b, dVar.f103876b) && this.f103877c == dVar.f103877c;
    }

    public final int hashCode() {
        e eVar = this.f103875a;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        c cVar = this.f103876b;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f103877c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "SessionUnreadViewState(unreadViewType=" + this.f103875a + ", backgroundColor=" + this.f103876b + ", isContentBoldFont=" + this.f103877c + ")";
    }

    public d(e eVar, c cVar, boolean z) {
        l.d(eVar, "");
        l.d(cVar, "");
        this.f103875a = eVar;
        this.f103876b = cVar;
        this.f103877c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, c cVar, boolean z, int i2) {
        this((i2 & 1) != 0 ? e.RIGHT_NUMBER : eVar, (i2 & 2) != 0 ? c.RED : cVar, (i2 & 4) != 0 ? false : z);
    }
}
