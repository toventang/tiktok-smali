package com.ss.android.ugc.aweme.search.n;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class f implements Serializable {
    private final a searchCommonModel;
    private final g searchInputModel;
    private final i searchVideoModel;

    static {
        Covode.recordClassIndex(79173);
    }

    public f() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ f copy$default(f fVar, a aVar, g gVar, i iVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = fVar.searchCommonModel;
        }
        if ((i2 & 2) != 0) {
            gVar = fVar.searchInputModel;
        }
        if ((i2 & 4) != 0) {
            iVar = fVar.searchVideoModel;
        }
        return fVar.copy(aVar, gVar, iVar);
    }

    public final a component1() {
        return this.searchCommonModel;
    }

    public final g component2() {
        return this.searchInputModel;
    }

    public final i component3() {
        return this.searchVideoModel;
    }

    public final f copy(a aVar, g gVar, i iVar) {
        l.d(aVar, "");
        l.d(gVar, "");
        l.d(iVar, "");
        return new f(aVar, gVar, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.searchCommonModel, fVar.searchCommonModel) && l.a(this.searchInputModel, fVar.searchInputModel) && l.a(this.searchVideoModel, fVar.searchVideoModel);
    }

    public final int hashCode() {
        a aVar = this.searchCommonModel;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        g gVar = this.searchInputModel;
        int hashCode2 = (hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31;
        i iVar = this.searchVideoModel;
        if (iVar != null) {
            i2 = iVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SearchImmutableData(searchCommonModel=" + this.searchCommonModel + ", searchInputModel=" + this.searchInputModel + ", searchVideoModel=" + this.searchVideoModel + ")";
    }

    public final a getSearchCommonModel() {
        return this.searchCommonModel;
    }

    public final g getSearchInputModel() {
        return this.searchInputModel;
    }

    public final i getSearchVideoModel() {
        return this.searchVideoModel;
    }

    public f(a aVar, g gVar, i iVar) {
        l.d(aVar, "");
        l.d(gVar, "");
        l.d(iVar, "");
        this.searchCommonModel = aVar;
        this.searchInputModel = gVar;
        this.searchVideoModel = iVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(a aVar, g gVar, i iVar, int i2, g gVar2) {
        this((i2 & 1) != 0 ? new a(null, null, false, false, 15, null) : aVar, (i2 & 2) != 0 ? new g(null, null, null, 7, null) : gVar, (i2 & 4) != 0 ? new i(null, null, 3, null) : iVar);
    }
}
