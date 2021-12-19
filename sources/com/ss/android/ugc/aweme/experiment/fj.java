package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class fj {
    @c(a = "rules")

    /* renamed from: a  reason: collision with root package name */
    public final List<ge> f90047a = null;
    @c(a = "interval")

    /* renamed from: b  reason: collision with root package name */
    public final int f90048b = 0;
    @c(a = "frequency")

    /* renamed from: c  reason: collision with root package name */
    public final int f90049c = 0;
    @c(a = "group")

    /* renamed from: d  reason: collision with root package name */
    public final int f90050d = 4;

    static {
        Covode.recordClassIndex(56511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj)) {
            return false;
        }
        fj fjVar = (fj) obj;
        return l.a(this.f90047a, fjVar.f90047a) && this.f90048b == fjVar.f90048b && this.f90049c == fjVar.f90049c && this.f90050d == fjVar.f90050d;
    }

    public final int hashCode() {
        List<ge> list = this.f90047a;
        return ((((((list != null ? list.hashCode() : 0) * 31) + this.f90048b) * 31) + this.f90049c) * 31) + this.f90050d;
    }

    public final String toString() {
        return "PopupRules(rules=" + this.f90047a + ", interval=" + this.f90048b + ", freq=" + this.f90049c + ", group=" + this.f90050d + ")";
    }

    private fj() {
    }
}
