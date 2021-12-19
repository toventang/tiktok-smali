package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.y;
import com.ss.android.ugc.aweme.discover.mixfeed.h;
import h.f.b.l;
import h.f.b.m;

public final class SearchJediViewModelMiddlewareBinding implements y<SearchState, SearchJediViewModel> {
    static {
        Covode.recordClassIndex(50576);
    }

    private final void bind0(SearchJediViewModel searchJediViewModel) {
        ListMiddleware<SearchState, h, e> listMiddleware = searchJediViewModel.f81366c;
        listMiddleware.a(b.f81383a, a.f81380a);
        searchJediViewModel.a(listMiddleware);
    }

    public final void binding(SearchJediViewModel searchJediViewModel) {
        l.d(searchJediViewModel, "");
        bind0(searchJediViewModel);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.m<SearchState, ListState<h, e>, SearchState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81380a = new a();

        static {
            Covode.recordClassIndex(50577);
        }

        a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ SearchState invoke(SearchState searchState, ListState<h, e> listState) {
            SearchState searchState2 = searchState;
            ListState<h, e> listState2 = listState;
            l.d(searchState2, "");
            l.d(listState2, "");
            return SearchState.copy$default(searchState2, listState2, null, 2, null);
        }
    }
}
