package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class ge {
    @c(a = "stage")

    /* renamed from: a  reason: collision with root package name */
    public final List<Integer> f90135a = null;
    @c(a = "duration")

    /* renamed from: b  reason: collision with root package name */
    public final List<Integer> f90136b = null;

    static {
        Covode.recordClassIndex(56546);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return l.a(this.f90135a, geVar.f90135a) && l.a(this.f90136b, geVar.f90136b);
    }

    public final int hashCode() {
        List<Integer> list = this.f90135a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Integer> list2 = this.f90136b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Rules(stage=" + this.f90135a + ", duration=" + this.f90136b + ")";
    }

    private ge() {
    }
}
