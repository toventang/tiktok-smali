package com.ss.android.ugc.aweme.discover.ui.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.ss.android.ugc.aweme.discover.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class f extends com.ss.android.ugc.aweme.discover.j.f<SearchLiveStruct, SearchLiveList> {

    /* renamed from: c  reason: collision with root package name */
    private static final a f82526c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f82527a;

    /* renamed from: b  reason: collision with root package name */
    public String f82528b;

    static {
        Covode.recordClassIndex(51376);
    }

    @Override // com.ss.android.ugc.aweme.discover.j.f
    public final int c() {
        return 7;
    }

    static final class a {
        static {
            Covode.recordClassIndex(51377);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final class c extends com.ss.android.ugc.aweme.discover.j.b {

        /* renamed from: b  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.discover.jedi.viewmodel.f f82529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f82530c;

        static {
            Covode.recordClassIndex(51379);
        }

        @Override // com.ss.android.ugc.aweme.discover.j.b
        public final Object a() {
            return SearchApi.c(this.f82529b);
        }

        public c(f fVar, com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar2) {
            l.d(fVar2, "");
            this.f82530c = fVar;
            this.f82529b = fVar2;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        l.b(obj, "");
        if (((SearchLiveList) obj).hasMore) {
            return true;
        }
        return false;
    }

    private final void a(com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar) {
        c cVar = new c(this, fVar);
        cVar.f81229a = fVar.r;
        this.f81247k = cVar;
        n.a().a(this.mHandler, cVar, 0);
    }

    public final void a(SearchLiveList searchLiveList) {
        boolean z;
        l.d(searchLiveList, "");
        getItems().size();
        b(searchLiveList.liveList);
        getItems().size();
        l.b(this.mData, "");
        Object obj = this.mData;
        l.b(obj, "");
        SearchLiveList searchLiveList2 = (SearchLiveList) obj;
        if (searchLiveList.hasMore) {
            Object obj2 = this.mData;
            l.b(obj2, "");
            if (((SearchLiveList) obj2).hasMore) {
                z = true;
                searchLiveList2.hasMore = z;
                Object obj3 = this.mData;
                l.b(obj3, "");
                ((SearchLiveList) obj3).cursor = searchLiveList.cursor;
            }
        }
        z = false;
        searchLiveList2.hasMore = z;
        Object obj32 = this.mData;
        l.b(obj32, "");
        ((SearchLiveList) obj32).cursor = searchLiveList.cursor;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        long j2;
        l.d(objArr, "");
        String a2 = a(objArr);
        if (isDataEmpty()) {
            j2 = 0;
        } else {
            Object obj = this.mData;
            l.b(obj, "");
            j2 = ((SearchLiveList) obj).cursor;
        }
        String str = this.q;
        if (str == null) {
            str = "";
        }
        String str2 = this.f82528b;
        if (str2 == null) {
            str2 = "";
        }
        a(new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f(a2, 0, e(), null, this.o, 0, str, this.r, j2, 20, str2, null, null, null, null, null, 0, null, null, 1046570));
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        String a2 = a(objArr);
        String str = this.f82528b;
        if (str == null) {
            str = "";
        }
        a(new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f(a2, 0, e(), null, this.o, 0, "", this.r, 0, 20, str, null, null, null, null, null, 0, this.f82527a, null, 784426));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void handleData(SearchLiveList searchLiveList) {
        boolean z;
        super.handleData((SearchApiResult) searchLiveList);
        List<SearchLiveStruct> list = searchLiveList != null ? searchLiveList.liveList : null;
        if (searchLiveList == null || com.bytedance.common.utility.collection.b.a((Collection) list)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (list == null) {
                l.b();
            }
            for (SearchLiveStruct searchLiveStruct : list) {
                l.b(searchLiveStruct, "");
                if (searchLiveStruct.getLiveAweme() != null) {
                    Aweme liveAweme = searchLiveStruct.getLiveAweme();
                    l.b(liveAweme, "");
                    liveAweme.setRequestId(this.p);
                    searchLiveStruct.setLogPbBean(searchLiveList != null ? searchLiveList.logPb : null);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                list.size();
                this.mData = searchLiveList;
                Object obj = this.mData;
                l.b(obj, "");
                ((SearchLiveList) obj).liveList = new ArrayList();
                a_(list);
                Object obj2 = this.mData;
                l.b(obj2, "");
                ((SearchLiveList) obj2).hasMore = com.ss.android.ugc.aweme.discover.a.n.a();
            } else if (i2 == 4) {
                a(searchLiveList);
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchLiveList;
                d();
            }
            if (this.mData != null) {
                Object obj3 = this.mData;
                l.b(obj3, "");
                ((SearchLiveList) obj3).hasMore = false;
            }
        }
    }

    public final class b extends RuntimeException {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(51378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar, Throwable th) {
            super(th);
            l.d(th, "");
            this.this$0 = fVar;
        }
    }
}
