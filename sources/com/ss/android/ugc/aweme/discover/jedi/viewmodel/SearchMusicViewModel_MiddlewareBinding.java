package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.y;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import h.f.b.l;
import h.f.b.m;

public final class SearchMusicViewModel_MiddlewareBinding implements y<SearchMusicListState, SearchMusicViewModel> {
    static {
        Covode.recordClassIndex(50578);
    }

    private final void bind_0(SearchMusicViewModel searchMusicViewModel) {
        ListMiddleware<SearchMusicListState, SearchMusic, e> listMiddleware = searchMusicViewModel.f82798a;
        listMiddleware.a(c.f81384a, a.f81381a);
        searchMusicViewModel.a(listMiddleware);
    }

    public final void binding(SearchMusicViewModel searchMusicViewModel) {
        l.d(searchMusicViewModel, "");
        bind_0(searchMusicViewModel);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.m<SearchMusicListState, ListState<SearchMusic, e>, SearchMusicListState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81381a = new a();

        static {
            Covode.recordClassIndex(50579);
        }

        a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ SearchMusicListState invoke(SearchMusicListState searchMusicListState, ListState<SearchMusic, e> listState) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            ListState<SearchMusic, e> listState2 = listState;
            l.d(searchMusicListState2, "");
            l.d(listState2, "");
            return SearchMusicListState.copy$default(searchMusicListState2, listState2, null, 2, null);
        }
    }
}
