package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.discover.mixfeed.h;
import h.f.b.g;
import h.f.b.l;

public final class SearchState implements af {
    private final ListState<h, e> listState;
    private final f searchParam;

    static {
        Covode.recordClassIndex(50580);
    }

    public SearchState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchState copy$default(SearchState searchState, ListState listState2, f fVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            listState2 = searchState.listState;
        }
        if ((i2 & 2) != 0) {
            fVar = searchState.searchParam;
        }
        return searchState.copy(listState2, fVar);
    }

    public final ListState<h, e> component1() {
        return this.listState;
    }

    public final f component2() {
        return this.searchParam;
    }

    public final SearchState copy(ListState<h, e> listState2, f fVar) {
        l.d(listState2, "");
        l.d(fVar, "");
        return new SearchState(listState2, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchState)) {
            return false;
        }
        SearchState searchState = (SearchState) obj;
        return l.a(this.listState, searchState.listState) && l.a(this.searchParam, searchState.searchParam);
    }

    public final int hashCode() {
        ListState<h, e> listState2 = this.listState;
        int i2 = 0;
        int hashCode = (listState2 != null ? listState2.hashCode() : 0) * 31;
        f fVar = this.searchParam;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchState(listState=" + this.listState + ", searchParam=" + this.searchParam + ")";
    }

    public final ListState<h, e> getListState() {
        return this.listState;
    }

    public final f getSearchParam() {
        return this.searchParam;
    }

    public SearchState(ListState<h, e> listState2, f fVar) {
        l.d(listState2, "");
        l.d(fVar, "");
        this.listState = listState2;
        this.searchParam = fVar;
    }

    public /* synthetic */ SearchState(ListState listState2, f fVar, int i2, g gVar) {
        SearchState searchState;
        f fVar2 = fVar;
        ListState listState3 = (i2 & 1) != 0 ? new ListState(new e(), null, null, null, null, 30, null) : listState2;
        if ((i2 & 2) != 0) {
            fVar2 = new f("", 0, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, 0, null, null, 1048574);
            searchState = this;
        } else {
            searchState = this;
        }
        new SearchState(listState3, fVar2);
    }
}
