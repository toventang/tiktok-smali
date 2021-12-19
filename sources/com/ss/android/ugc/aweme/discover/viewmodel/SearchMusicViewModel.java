package com.ss.android.ugc.aweme.discover.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.e;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import f.a.d.g;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import java.util.List;

public final class SearchMusicViewModel extends JediViewModel<SearchMusicListState> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82797b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ListMiddleware<SearchMusicListState, SearchMusic, e> f82798a = new ListMiddleware<>(new b(this), new c(this), null, null, 12);

    static {
        Covode.recordClassIndex(51582);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51583);
        }

        private a() {
        }

        public static final class b extends m implements h.f.a.b<SearchMusicListState, SearchMusicListState> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f82799a = new b();

            static {
                Covode.recordClassIndex(51585);
            }

            b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ SearchMusicListState invoke(SearchMusicListState searchMusicListState) {
                l.d(searchMusicListState, "");
                return searchMusicListState;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$a$a  reason: collision with other inner class name */
        public static final class C1946a implements ad.b {
            static {
                Covode.recordClassIndex(51584);
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                return new SearchMusicViewModel();
            }
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ SearchMusicListState d() {
        return new SearchMusicListState(null, null, 3, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        new SearchMusicViewModel_MiddlewareBinding().binding(this);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<SearchMusicListState, SearchMusicListState> {
        final /* synthetic */ f $param;

        static {
            Covode.recordClassIndex(51590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.$param = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SearchMusicListState invoke(SearchMusicListState searchMusicListState) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            l.d(searchMusicListState2, "");
            return SearchMusicListState.copy$default(searchMusicListState2, null, this.$param, 1, null);
        }
    }

    public final void a(f fVar) {
        l.d(fVar, "");
        c(new d(fVar));
    }

    static final class b extends m implements h.f.a.b<SearchMusicListState, t<p<? extends List<? extends SearchMusic>, ? extends e>>> {
        final /* synthetic */ SearchMusicViewModel this$0;

        static {
            Covode.recordClassIndex(51586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchMusicViewModel searchMusicViewModel) {
            super(1);
            this.this$0 = searchMusicViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends SearchMusic>, ? extends e>> invoke(SearchMusicListState searchMusicListState) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            l.d(searchMusicListState2, "");
            t<R> d2 = SearchMusicViewModel.a(searchMusicListState2.getSearchParam(), searchMusicListState2.getListState().getPayload().f81385c, 0).d(new g(this) {
                /* class com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f82800a;

                static {
                    Covode.recordClassIndex(51587);
                }

                {
                    this.f82800a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    String imprId;
                    SearchMusicList searchMusicList = (SearchMusicList) obj;
                    String str = "";
                    l.d(searchMusicList, str);
                    SearchMusicViewModel.a(searchMusicList);
                    List<SearchMusic> list = searchMusicList.searchMusicList;
                    LogPbBean logPbBean = searchMusicList.logPb;
                    if (!(logPbBean == null || (imprId = logPbBean.getImprId()) == null)) {
                        str = imprId;
                    }
                    return v.a(list, new e(str, searchMusicList.hasMore, searchMusicList.cursor, searchMusicList));
                }
            });
            l.b(d2, "");
            return d2;
        }
    }

    static final class c extends m implements h.f.a.b<SearchMusicListState, t<p<? extends List<? extends SearchMusic>, ? extends e>>> {
        final /* synthetic */ SearchMusicViewModel this$0;

        static {
            Covode.recordClassIndex(51588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchMusicViewModel searchMusicViewModel) {
            super(1);
            this.this$0 = searchMusicViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends SearchMusic>, ? extends e>> invoke(SearchMusicListState searchMusicListState) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            l.d(searchMusicListState2, "");
            t<R> d2 = SearchMusicViewModel.a(searchMusicListState2.getSearchParam(), searchMusicListState2.getListState().getPayload().f81385c, searchMusicListState2.getListState().getPayload().f39460b).d(new g(this) {
                /* class com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f82801a;

                static {
                    Covode.recordClassIndex(51589);
                }

                {
                    this.f82801a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    String imprId;
                    SearchMusicList searchMusicList = (SearchMusicList) obj;
                    String str = "";
                    l.d(searchMusicList, str);
                    SearchMusicViewModel.a(searchMusicList);
                    List<SearchMusic> list = searchMusicList.searchMusicList;
                    LogPbBean logPbBean = searchMusicList.logPb;
                    if (!(logPbBean == null || (imprId = logPbBean.getImprId()) == null)) {
                        str = imprId;
                    }
                    return v.a(list, new e(str, searchMusicList.hasMore, searchMusicList.cursor, searchMusicList));
                }
            });
            l.b(d2, "");
            return d2;
        }
    }

    public static void a(SearchMusicList searchMusicList) {
        List<SearchMusic> list;
        String str;
        if (!(searchMusicList == null || (list = searchMusicList.searchMusicList) == null)) {
            for (T t : list) {
                if (!TextUtils.isEmpty(searchMusicList.getRequestId())) {
                    str = searchMusicList.getRequestId();
                } else {
                    LogPbBean logPbBean = searchMusicList.logPb;
                    if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
                        str = "";
                    }
                }
                t.setRequestId(str);
            }
        }
    }

    public static t<SearchMusicList> a(f fVar, String str, int i2) {
        t<SearchMusicList> b2 = SearchApiNew.a(new f(fVar.f81387a, 0, null, null, fVar.f81391e, fVar.f81392f, str, null, (long) i2, 20, null, fVar.f81398l, null, null, null, null, SearchApiNew.f80777c, null, null, 980110)).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }
}
