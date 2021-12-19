package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base;

import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.assem.arch.extensions.a<Integer> f117598a;

    static {
        Covode.recordClassIndex(76028);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f117598a, ((b) obj).f117598a);
        }
        return true;
    }

    public final int hashCode() {
        com.bytedance.assem.arch.extensions.a<Integer> aVar = this.f117598a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProfileAdvancedFeatureData(mobShowFeatureId=" + this.f117598a + ")";
    }

    public /* synthetic */ b() {
        this(null);
    }

    public b(com.bytedance.assem.arch.extensions.a<Integer> aVar) {
        this.f117598a = aVar;
    }
}
