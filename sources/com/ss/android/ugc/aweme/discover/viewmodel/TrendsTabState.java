package com.ss.android.ugc.aweme.discover.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import h.f.b.g;
import h.f.b.l;

public final class TrendsTabState implements ICommonListState<DiscoverSectionItem> {
    private final boolean cacheThenFetch;
    private final boolean canScrollVertically;
    private final String categoryIdBeingViewed;
    private final boolean isFromSuggestSearch;
    private final boolean isTabHidden;
    private final ListState<DiscoverSectionItem, o> substate;

    static {
        Covode.recordClassIndex(51596);
    }

    public TrendsTabState() {
        this(false, null, false, null, false, false, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendsTabState copy$default(TrendsTabState trendsTabState, boolean z, ListState listState, boolean z2, String str, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = trendsTabState.cacheThenFetch;
        }
        if ((i2 & 2) != 0) {
            listState = trendsTabState.getSubstate();
        }
        if ((i2 & 4) != 0) {
            z2 = trendsTabState.isTabHidden;
        }
        if ((i2 & 8) != 0) {
            str = trendsTabState.categoryIdBeingViewed;
        }
        if ((i2 & 16) != 0) {
            z3 = trendsTabState.canScrollVertically;
        }
        if ((i2 & 32) != 0) {
            z4 = trendsTabState.isFromSuggestSearch;
        }
        return trendsTabState.copy(z, listState, z2, str, z3, z4);
    }

    public final boolean component1() {
        return this.cacheThenFetch;
    }

    public final ListState<DiscoverSectionItem, o> component2() {
        return getSubstate();
    }

    public final boolean component3() {
        return this.isTabHidden;
    }

    public final String component4() {
        return this.categoryIdBeingViewed;
    }

    public final boolean component5() {
        return this.canScrollVertically;
    }

    public final boolean component6() {
        return this.isFromSuggestSearch;
    }

    public final TrendsTabState copy(boolean z, ListState<DiscoverSectionItem, o> listState, boolean z2, String str, boolean z3, boolean z4) {
        l.d(listState, "");
        l.d(str, "");
        return new TrendsTabState(z, listState, z2, str, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendsTabState)) {
            return false;
        }
        TrendsTabState trendsTabState = (TrendsTabState) obj;
        return this.cacheThenFetch == trendsTabState.cacheThenFetch && l.a(getSubstate(), trendsTabState.getSubstate()) && this.isTabHidden == trendsTabState.isTabHidden && l.a(this.categoryIdBeingViewed, trendsTabState.categoryIdBeingViewed) && this.canScrollVertically == trendsTabState.canScrollVertically && this.isFromSuggestSearch == trendsTabState.isFromSuggestSearch;
    }

    public final int hashCode() {
        boolean z = this.cacheThenFetch;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        ListState<DiscoverSectionItem, o> substate2 = getSubstate();
        int i7 = 0;
        int hashCode = (i6 + (substate2 != null ? substate2.hashCode() : 0)) * 31;
        boolean z2 = this.isTabHidden;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode + i8) * 31;
        String str = this.categoryIdBeingViewed;
        if (str != null) {
            i7 = str.hashCode();
        }
        int i12 = (i11 + i7) * 31;
        boolean z3 = this.canScrollVertically;
        if (z3) {
            z3 = true;
        }
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = z3 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        if (!this.isFromSuggestSearch) {
            i2 = 0;
        }
        return i16 + i2;
    }

    public final String toString() {
        return "TrendsTabState(cacheThenFetch=" + this.cacheThenFetch + ", substate=" + getSubstate() + ", isTabHidden=" + this.isTabHidden + ", categoryIdBeingViewed=" + this.categoryIdBeingViewed + ", canScrollVertically=" + this.canScrollVertically + ", isFromSuggestSearch=" + this.isFromSuggestSearch + ")";
    }

    public final boolean getCacheThenFetch() {
        return this.cacheThenFetch;
    }

    public final boolean getCanScrollVertically() {
        return this.canScrollVertically;
    }

    public final String getCategoryIdBeingViewed() {
        return this.categoryIdBeingViewed;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<DiscoverSectionItem, o> getSubstate() {
        return this.substate;
    }

    public final boolean isFromSuggestSearch() {
        return this.isFromSuggestSearch;
    }

    public final boolean isTabHidden() {
        return this.isTabHidden;
    }

    public final NestedState<ListState<DiscoverSectionItem, o>> newSubstate(ListState<DiscoverSectionItem, o> listState) {
        l.d(listState, "");
        return copy$default(this, false, listState, false, null, false, false, 61, null);
    }

    public TrendsTabState(boolean z, ListState<DiscoverSectionItem, o> listState, boolean z2, String str, boolean z3, boolean z4) {
        l.d(listState, "");
        l.d(str, "");
        this.cacheThenFetch = z;
        this.substate = listState;
        this.isTabHidden = z2;
        this.categoryIdBeingViewed = str;
        this.canScrollVertically = z3;
        this.isFromSuggestSearch = z4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrendsTabState(boolean z, ListState listState, boolean z2, String str, boolean z3, boolean z4, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? new ListState(new o(false, 2, (byte) 0), null, null, null, null, 30, null) : listState, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? false : z3, (i2 & 32) == 0 ? z4 : false);
    }
}
