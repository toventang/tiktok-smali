package com.ss.android.ugc.aweme.filter.view.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f95753a;

    /* renamed from: b  reason: collision with root package name */
    public final b f95754b;

    static {
        Covode.recordClassIndex(60675);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f95753a, aVar.f95753a) && l.a(this.f95754b, aVar.f95754b);
    }

    public final int hashCode() {
        b bVar = this.f95753a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        b bVar2 = this.f95754b;
        if (bVar2 != null) {
            i2 = bVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FilterBoxActionEvent(type=" + this.f95753a + ", data=" + this.f95754b + ")";
    }

    public a(b bVar, b bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f95753a = bVar;
        this.f95754b = bVar2;
    }
}
