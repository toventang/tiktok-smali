package com.ss.android.ugc.aweme.share.improve.pkg;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final h f124042a;

    /* renamed from: b  reason: collision with root package name */
    public final int f124043b;

    static {
        Covode.recordClassIndex(81443);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f124042a, jVar.f124042a) && this.f124043b == jVar.f124043b;
    }

    public final int hashCode() {
        h hVar = this.f124042a;
        return ((hVar != null ? hVar.hashCode() : 0) * 31) + this.f124043b;
    }

    public final String toString() {
        return "LivePrioritySheetAction(sheetAction=" + this.f124042a + ", priority=" + this.f124043b + ")";
    }

    public j(h hVar, int i2) {
        l.d(hVar, "");
        this.f124042a = hVar;
        this.f124043b = i2;
    }
}
