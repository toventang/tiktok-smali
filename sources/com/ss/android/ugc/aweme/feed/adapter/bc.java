package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class bc implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<z> f91685a;

    static {
        Covode.recordClassIndex(57732);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bc) && l.a(this.f91685a, ((bc) obj).f91685a);
        }
        return true;
    }

    public final int hashCode() {
        a<z> aVar = this.f91685a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "VideoPlaySearchState(onPausePlay=" + this.f91685a + ")";
    }

    public /* synthetic */ bc() {
        this(null);
    }

    public bc(a<z> aVar) {
        this.f91685a = aVar;
    }
}
