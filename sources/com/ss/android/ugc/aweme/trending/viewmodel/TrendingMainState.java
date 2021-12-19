package com.ss.android.ugc.aweme.trending.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.l;
import h.f.b.g;
import java.util.ArrayList;

public final class TrendingMainState implements ICommonListState<Aweme> {
    private final l curTrending;
    private final ArrayList<Aweme> initAwemeList;
    private final l loadingTrending;
    private final boolean showTrendExpiredToast;
    private final ListState<Aweme, o> substate;
    private final String trendingIdList;
    private final ArrayList<l> trendingList;

    static {
        Covode.recordClassIndex(92173);
    }

    public TrendingMainState() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendingMainState copy$default(TrendingMainState trendingMainState, ListState listState, l lVar, l lVar2, ArrayList arrayList, ArrayList arrayList2, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            listState = trendingMainState.getSubstate();
        }
        if ((i2 & 2) != 0) {
            lVar = trendingMainState.curTrending;
        }
        if ((i2 & 4) != 0) {
            lVar2 = trendingMainState.loadingTrending;
        }
        if ((i2 & 8) != 0) {
            arrayList = trendingMainState.initAwemeList;
        }
        if ((i2 & 16) != 0) {
            arrayList2 = trendingMainState.trendingList;
        }
        if ((i2 & 32) != 0) {
            str = trendingMainState.trendingIdList;
        }
        if ((i2 & 64) != 0) {
            z = trendingMainState.showTrendExpiredToast;
        }
        return trendingMainState.copy(listState, lVar, lVar2, arrayList, arrayList2, str, z);
    }

    public final ListState<Aweme, o> component1() {
        return getSubstate();
    }

    public final l component2() {
        return this.curTrending;
    }

    public final l component3() {
        return this.loadingTrending;
    }

    public final ArrayList<Aweme> component4() {
        return this.initAwemeList;
    }

    public final ArrayList<l> component5() {
        return this.trendingList;
    }

    public final String component6() {
        return this.trendingIdList;
    }

    public final boolean component7() {
        return this.showTrendExpiredToast;
    }

    public final TrendingMainState copy(ListState<Aweme, o> listState, l lVar, l lVar2, ArrayList<Aweme> arrayList, ArrayList<l> arrayList2, String str, boolean z) {
        h.f.b.l.d(listState, "");
        h.f.b.l.d(arrayList, "");
        return new TrendingMainState(listState, lVar, lVar2, arrayList, arrayList2, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingMainState)) {
            return false;
        }
        TrendingMainState trendingMainState = (TrendingMainState) obj;
        return h.f.b.l.a(getSubstate(), trendingMainState.getSubstate()) && h.f.b.l.a(this.curTrending, trendingMainState.curTrending) && h.f.b.l.a(this.loadingTrending, trendingMainState.loadingTrending) && h.f.b.l.a(this.initAwemeList, trendingMainState.initAwemeList) && h.f.b.l.a(this.trendingList, trendingMainState.trendingList) && h.f.b.l.a(this.trendingIdList, trendingMainState.trendingIdList) && this.showTrendExpiredToast == trendingMainState.showTrendExpiredToast;
    }

    public final int hashCode() {
        ListState<Aweme, o> substate2 = getSubstate();
        int i2 = 0;
        int hashCode = (substate2 != null ? substate2.hashCode() : 0) * 31;
        l lVar = this.curTrending;
        int hashCode2 = (hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        l lVar2 = this.loadingTrending;
        int hashCode3 = (hashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        ArrayList<Aweme> arrayList = this.initAwemeList;
        int hashCode4 = (hashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList<l> arrayList2 = this.trendingList;
        int hashCode5 = (hashCode4 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        String str = this.trendingIdList;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = (hashCode5 + i2) * 31;
        boolean z = this.showTrendExpiredToast;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "TrendingMainState(substate=" + getSubstate() + ", curTrending=" + this.curTrending + ", loadingTrending=" + this.loadingTrending + ", initAwemeList=" + this.initAwemeList + ", trendingList=" + this.trendingList + ", trendingIdList=" + this.trendingIdList + ", showTrendExpiredToast=" + this.showTrendExpiredToast + ")";
    }

    public final l getCurTrending() {
        return this.curTrending;
    }

    public final ArrayList<Aweme> getInitAwemeList() {
        return this.initAwemeList;
    }

    public final l getLoadingTrending() {
        return this.loadingTrending;
    }

    public final boolean getShowTrendExpiredToast() {
        return this.showTrendExpiredToast;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<Aweme, o> getSubstate() {
        return this.substate;
    }

    public final String getTrendingIdList() {
        return this.trendingIdList;
    }

    public final ArrayList<l> getTrendingList() {
        return this.trendingList;
    }

    public final NestedState<ListState<Aweme, o>> newSubstate(ListState<Aweme, o> listState) {
        h.f.b.l.d(listState, "");
        return copy$default(this, listState, null, null, null, null, null, false, 126, null);
    }

    public TrendingMainState(ListState<Aweme, o> listState, l lVar, l lVar2, ArrayList<Aweme> arrayList, ArrayList<l> arrayList2, String str, boolean z) {
        h.f.b.l.d(listState, "");
        h.f.b.l.d(arrayList, "");
        this.substate = listState;
        this.curTrending = lVar;
        this.loadingTrending = lVar2;
        this.initAwemeList = arrayList;
        this.trendingList = arrayList2;
        this.trendingIdList = str;
        this.showTrendExpiredToast = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrendingMainState(ListState listState, l lVar, l lVar2, ArrayList arrayList, ArrayList arrayList2, String str, boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ListState(new o(false, 2, (byte) 0), null, null, null, null, 30, null) : listState, (i2 & 2) != 0 ? null : lVar, (i2 & 4) != 0 ? null : lVar2, (i2 & 8) != 0 ? new ArrayList() : arrayList, (i2 & 16) == 0 ? arrayList2 : null, (i2 & 32) != 0 ? "" : str, (i2 & 64) == 0 ? z : false);
    }
}
