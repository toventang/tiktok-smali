package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class DiscoverSectionList implements Serializable {
    private final int cursor;
    private final boolean hasMore;
    private boolean isCache;
    private final List<DiscoverSectionItem> sections;

    static {
        Covode.recordClassIndex(50895);
    }

    public DiscoverSectionList() {
        this(null, 0, false, false, 15, null);
    }

    public static int com_ss_android_ugc_aweme_discover_model_DiscoverSectionList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.DiscoverSectionList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscoverSectionList copy$default(DiscoverSectionList discoverSectionList, List list, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = discoverSectionList.sections;
        }
        if ((i3 & 2) != 0) {
            i2 = discoverSectionList.cursor;
        }
        if ((i3 & 4) != 0) {
            z = discoverSectionList.hasMore;
        }
        if ((i3 & 8) != 0) {
            z2 = discoverSectionList.isCache;
        }
        return discoverSectionList.copy(list, i2, z, z2);
    }

    public final List<DiscoverSectionItem> component1() {
        return this.sections;
    }

    public final int component2() {
        return this.cursor;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final boolean component4() {
        return this.isCache;
    }

    public final DiscoverSectionList copy(List<? extends DiscoverSectionItem> list, int i2, boolean z, boolean z2) {
        l.d(list, "");
        return new DiscoverSectionList(list, i2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverSectionList)) {
            return false;
        }
        DiscoverSectionList discoverSectionList = (DiscoverSectionList) obj;
        return l.a(this.sections, discoverSectionList.sections) && this.cursor == discoverSectionList.cursor && this.hasMore == discoverSectionList.hasMore && this.isCache == discoverSectionList.isCache;
    }

    public final int hashCode() {
        List<DiscoverSectionItem> list = this.sections;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_discover_model_DiscoverSectionList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cursor)) * 31;
        boolean z = this.hasMore;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        if (!this.isCache) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "DiscoverSectionList(sections=" + this.sections + ", cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", isCache=" + this.isCache + ")";
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<DiscoverSectionItem> getSections() {
        return this.sections;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem> */
    /* JADX WARN: Multi-variable type inference failed */
    public DiscoverSectionList(List<? extends DiscoverSectionItem> list, int i2, boolean z, boolean z2) {
        l.d(list, "");
        this.sections = list;
        this.cursor = i2;
        this.hasMore = z;
        this.isCache = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscoverSectionList(List list, int i2, boolean z, boolean z2, int i3, g gVar) {
        this((i3 & 1) != 0 ? z.INSTANCE : list, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2);
    }
}
