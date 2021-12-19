package com.ss.android.ugc.aweme.discover.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.music.model.Music;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class f extends SearchMusic {
    private final List<Music> clusterList;
    private boolean isMobShowSent;

    static {
        Covode.recordClassIndex(50109);
    }

    public f() {
        this(false, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.adapter.f */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f copy$default(f fVar, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = fVar.isMobShowSent;
        }
        if ((i2 & 2) != 0) {
            list = fVar.clusterList;
        }
        return fVar.copy(z, list);
    }

    public final boolean component1() {
        return this.isMobShowSent;
    }

    public final List<Music> component2() {
        return this.clusterList;
    }

    public final f copy(boolean z, List<Music> list) {
        l.d(list, "");
        return new f(z, list);
    }

    @Override // com.ss.android.ugc.aweme.discover.model.SearchMusic
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.isMobShowSent == fVar.isMobShowSent && l.a(this.clusterList, fVar.clusterList);
    }

    @Override // com.ss.android.ugc.aweme.discover.model.SearchMusic
    public final int hashCode() {
        boolean z = this.isMobShowSent;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        List<Music> list = this.clusterList;
        return i5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ClusterButtonData(isMobShowSent=" + this.isMobShowSent + ", clusterList=" + this.clusterList + ")";
    }

    public final List<Music> getClusterList() {
        return this.clusterList;
    }

    public final boolean isMobShowSent() {
        return this.isMobShowSent;
    }

    public final void setMobShowSent(boolean z) {
        this.isMobShowSent = z;
    }

    public f(boolean z, List<Music> list) {
        l.d(list, "");
        this.isMobShowSent = z;
        this.clusterList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(boolean z, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
