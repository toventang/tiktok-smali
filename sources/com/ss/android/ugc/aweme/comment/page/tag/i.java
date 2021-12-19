package com.ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.model.e;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f72262a;

    /* renamed from: b  reason: collision with root package name */
    public final e f72263b;

    static {
        Covode.recordClassIndex(44547);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f72262a, iVar.f72262a) && l.a(this.f72263b, iVar.f72263b);
    }

    public final int hashCode() {
        String str = this.f72262a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        e eVar = this.f72263b;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchMobParam(requestId=" + this.f72262a + ", searchSugEntity=" + this.f72263b + ")";
    }

    public i(String str, e eVar) {
        l.d(eVar, "");
        this.f72262a = str;
        this.f72263b = eVar;
    }
}
