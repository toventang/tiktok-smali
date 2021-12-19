package com.ss.android.ugc.aweme.discover.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.e;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import h.f.b.g;
import h.f.b.l;

public final class SearchMusicListState implements af {
    private final ListState<SearchMusic, e> listState;
    private final f searchParam;

    static {
        Covode.recordClassIndex(51581);
    }

    public SearchMusicListState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMusicListState copy$default(SearchMusicListState searchMusicListState, ListState listState2, f fVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            listState2 = searchMusicListState.listState;
        }
        if ((i2 & 2) != 0) {
            fVar = searchMusicListState.searchParam;
        }
        return searchMusicListState.copy(listState2, fVar);
    }

    public final ListState<SearchMusic, e> component1() {
        return this.listState;
    }

    public final f component2() {
        return this.searchParam;
    }

    public final SearchMusicListState copy(ListState<SearchMusic, e> listState2, f fVar) {
        l.d(listState2, "");
        l.d(fVar, "");
        return new SearchMusicListState(listState2, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMusicListState)) {
            return false;
        }
        SearchMusicListState searchMusicListState = (SearchMusicListState) obj;
        return l.a(this.listState, searchMusicListState.listState) && l.a(this.searchParam, searchMusicListState.searchParam);
    }

    public final int hashCode() {
        ListState<SearchMusic, e> listState2 = this.listState;
        int i2 = 0;
        int hashCode = (listState2 != null ? listState2.hashCode() : 0) * 31;
        f fVar = this.searchParam;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchMusicListState(listState=" + this.listState + ", searchParam=" + this.searchParam + ")";
    }

    public final ListState<SearchMusic, e> getListState() {
        return this.listState;
    }

    public final f getSearchParam() {
        return this.searchParam;
    }

    public SearchMusicListState(ListState<SearchMusic, e> listState2, f fVar) {
        l.d(listState2, "");
        l.d(fVar, "");
        this.listState = listState2;
        this.searchParam = fVar;
    }

    public /* synthetic */ SearchMusicListState(ListState listState2, f fVar, int i2, g gVar) {
        SearchMusicListState searchMusicListState;
        f fVar2 = fVar;
        ListState listState3 = (i2 & 1) != 0 ? new ListState(new e(), null, null, null, null, 30, null) : listState2;
        if ((i2 & 2) != 0) {
            fVar2 = new f("", 0, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, 0, null, null, 1048574);
            searchMusicListState = this;
        } else {
            searchMusicListState = this;
        }
        new SearchMusicListState(listState3, fVar2);
    }
}
