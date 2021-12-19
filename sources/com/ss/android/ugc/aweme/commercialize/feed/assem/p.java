package com.ss.android.ugc.aweme.commercialize.feed.assem;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class p implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<z> f74118a;

    static {
        Covode.recordClassIndex(45695);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof p) && l.a(this.f74118a, ((p) obj).f74118a);
        }
        return true;
    }

    public final int hashCode() {
        a<z> aVar = this.f74118a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AdInteractiveState(showEvent=" + this.f74118a + ")";
    }

    public /* synthetic */ p() {
        this(null);
    }

    public p(a<z> aVar) {
        this.f74118a = aVar;
    }
}
