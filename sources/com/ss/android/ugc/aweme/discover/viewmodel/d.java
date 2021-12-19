package com.ss.android.ugc.aweme.discover.viewmodel;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.SearchLiveList;
import h.f.b.l;

public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f<SearchLiveList> f82819a;

    static {
        Covode.recordClassIndex(51613);
    }

    public static d a(f<? extends SearchLiveList> fVar) {
        l.d(fVar, "");
        return new d(fVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f82819a, ((d) obj).f82819a);
        }
        return true;
    }

    public final int hashCode() {
        f<SearchLiveList> fVar = this.f82819a;
        if (fVar != null) {
            return fVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SearchLiveState(request=" + this.f82819a + ")";
    }

    public /* synthetic */ d() {
        this(t.f25669a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.discover.model.SearchLiveList> */
    /* JADX WARN: Multi-variable type inference failed */
    private d(f<? extends SearchLiveList> fVar) {
        l.d(fVar, "");
        this.f82819a = fVar;
    }
}
