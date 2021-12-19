package com.ss.android.ugc.aweme.detail.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi;
import com.ss.android.ugc.aweme.discover.c.e;
import com.ss.android.ugc.aweme.discover.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.discover.model.IAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class d extends com.ss.android.ugc.aweme.discover.mixfeed.a<ContinuousLoadingAwemeList> {

    /* renamed from: a  reason: collision with root package name */
    private final h f79639a = i.a((h.f.a.a) b.f79644a);

    /* renamed from: b  reason: collision with root package name */
    private int f79640b;

    /* renamed from: c  reason: collision with root package name */
    private final h f79641c = i.a((h.f.a.a) a.f79643a);

    /* renamed from: d  reason: collision with root package name */
    private final h f79642d = i.a((h.f.a.a) c.f79645a);

    static {
        Covode.recordClassIndex(49480);
    }

    private final IAwemeService c() {
        return (IAwemeService) this.f79639a.getValue();
    }

    public final SearchContinuousLoadingApi.b a() {
        return (SearchContinuousLoadingApi.b) this.f79642d.getValue();
    }

    static final class b extends m implements h.f.a.a<IAwemeService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f79644a = new b();

        static {
            Covode.recordClassIndex(49482);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAwemeService invoke() {
            return AwemeService.b();
        }
    }

    static final class c extends m implements h.f.a.a<SearchContinuousLoadingApi.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f79645a = new c();

        static {
            Covode.recordClassIndex(49483);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchContinuousLoadingApi.b invoke() {
            return new SearchContinuousLoadingApi.b();
        }
    }

    static final class a extends m implements h.f.a.a<SearchContinuousLoadingApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f79643a = new a();

        static {
            Covode.recordClassIndex(49481);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchContinuousLoadingApi invoke() {
            return RetrofitFactory.a().b(SearchApiNew.f80775a).d().a(SearchContinuousLoadingApi.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.mixfeed.a
    public final t<ContinuousLoadingAwemeList> b() {
        return ((SearchContinuousLoadingApi) this.f79641c.getValue()).getAwemeList(a().f80793a, a().f80794b, a().f80795c, a().f80796d, a().f80797e, a().f80798f);
    }

    public final void a(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        int i2;
        l.d(continuousLoadingAwemeList, "");
        this.mData = continuousLoadingAwemeList;
        List<Aweme> list = ((ContinuousLoadingAwemeList) this.mData).awemeList;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        this.f79640b = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void handleData(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        long j2;
        super.handleData((IAwemeList) continuousLoadingAwemeList);
        if (continuousLoadingAwemeList != null) {
            a().f80796d = continuousLoadingAwemeList.cursor;
            SearchContinuousLoadingApi.b a2 = a();
            Aweme aweme = (Aweme) n.j(getItems());
            if (aweme != null) {
                j2 = aweme.getCreateTime();
            } else {
                j2 = 0;
            }
            a2.f80798f = j2;
            boolean z = true;
            if (this.mListQueryType != 1) {
                z = false;
            }
            this.f79640b = e.a(z, continuousLoadingAwemeList.awemeList, this.f79640b);
            List<Aweme> list = continuousLoadingAwemeList.awemeList;
            if (list != null) {
                for (T t : list) {
                    IAwemeService c2 = c();
                    String aid = t.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    Aweme b2 = c2.b(aid);
                    if (b2 != null) {
                        t.setUserDigg(b2.getUserDigg());
                        AwemeStatistics statistics = b2.getStatistics();
                        if (statistics != null) {
                            long diggCount = statistics.getDiggCount();
                            AwemeStatistics statistics2 = t.getStatistics();
                            l.b(statistics2, "");
                            statistics2.setDiggCount(diggCount);
                        }
                    }
                    c().a((Aweme) t);
                }
            }
        }
    }
}
