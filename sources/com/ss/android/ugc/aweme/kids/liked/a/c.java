package com.ss.android.ugc.aweme.kids.liked.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.c.e;
import com.ss.android.ugc.aweme.kids.liked.api.FavoriteApi;
import com.ss.android.ugc.aweme.kids.liked.model.KidFeedItemList;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import h.a.z;
import h.f.b.l;
import h.p;
import h.v;
import java.util.List;

public final class c implements com.ss.android.ugc.aweme.kids.common.ui.awemegrid.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f106706a = true;

    /* renamed from: b  reason: collision with root package name */
    private long f106707b;

    /* renamed from: c  reason: collision with root package name */
    private final FavoriteApi f106708c = FavoriteApi.a.a();

    static {
        Covode.recordClassIndex(68205);
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.a
    public final boolean a() {
        return this.f106706a;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.a
    public final t<p<List<Aweme>, Integer>> b() {
        long currentTimeMillis = System.currentTimeMillis();
        t<R> d2 = this.f106708c.getFavoriteList(0, 0, 20).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new C2730c(currentTimeMillis)).d(new d(this, currentTimeMillis));
        l.b(d2, "");
        return d2;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.a
    public final t<p<List<Aweme>, Integer>> c() {
        if (!this.f106706a) {
            t<p<List<Aweme>, Integer>> b2 = t.b(v.a(z.INSTANCE, -1));
            l.b(b2, "");
            return b2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        t<R> d2 = this.f106708c.getFavoriteList(this.f106707b, 0, 10).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new a(currentTimeMillis)).d(new b(this, currentTimeMillis));
        l.b(d2, "");
        return d2;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106709a;

        static {
            Covode.recordClassIndex(68206);
        }

        a(long j2) {
            this.f106709a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            e.a("kids_api_like", 2, -1, this.f106709a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.c$c  reason: collision with other inner class name */
    static final class C2730c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106712a;

        static {
            Covode.recordClassIndex(68208);
        }

        C2730c(long j2) {
            this.f106712a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            e.a("kids_api_like", 1, -1, this.f106712a);
        }
    }

    static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106710a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106711b;

        static {
            Covode.recordClassIndex(68207);
        }

        b(c cVar, long j2) {
            this.f106710a = cVar;
            this.f106711b = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            KidFeedItemList kidFeedItemList = (KidFeedItemList) obj;
            l.d(kidFeedItemList, "");
            e.a("kids_api_like", 2, 0, this.f106711b);
            return this.f106710a.a(kidFeedItemList);
        }
    }

    static final class d<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106714b;

        static {
            Covode.recordClassIndex(68209);
        }

        d(c cVar, long j2) {
            this.f106713a = cVar;
            this.f106714b = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            KidFeedItemList kidFeedItemList = (KidFeedItemList) obj;
            l.d(kidFeedItemList, "");
            e.a("kids_api_like", 1, 0, this.f106714b);
            return this.f106713a.a(kidFeedItemList);
        }
    }

    public final p<List<Aweme>, Integer> a(KidFeedItemList kidFeedItemList) {
        boolean z = true;
        if (kidFeedItemList.getHasMore() != 1) {
            z = false;
        }
        this.f106706a = z;
        if (this.f106707b == kidFeedItemList.getMaxCursor()) {
            return v.a(z.INSTANCE, -1);
        }
        this.f106707b = kidFeedItemList.getMaxCursor();
        List<Aweme> items = kidFeedItemList.getItems();
        if (items == null) {
            return v.a(z.INSTANCE, -1);
        }
        if (items.get(0).getLogPbBean() == null) {
            for (Aweme aweme : items) {
                aweme.setLogPbBean(kidFeedItemList.getLogPb());
            }
        }
        if (items.isEmpty()) {
            return v.a(z.INSTANCE, -1);
        }
        return v.a(items, 0);
    }
}
