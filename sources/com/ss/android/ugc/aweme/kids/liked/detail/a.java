package com.ss.android.ugc.aweme.kids.liked.detail;

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

public final class a implements com.ss.android.ugc.aweme.kids.commonfeed.c.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C2732a f106721c = new C2732a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    long f106722a;

    /* renamed from: b  reason: collision with root package name */
    boolean f106723b;

    /* renamed from: d  reason: collision with root package name */
    private final FavoriteApi f106724d = FavoriteApi.a.a();

    /* renamed from: e  reason: collision with root package name */
    private final List<Aweme> f106725e;

    static {
        Covode.recordClassIndex(68217);
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final boolean a() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final boolean b() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.detail.a$a  reason: collision with other inner class name */
    public static final class C2732a {
        static {
            Covode.recordClassIndex(68218);
        }

        private C2732a() {
        }

        public /* synthetic */ C2732a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final boolean c() {
        return this.f106723b;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final t<p<List<Aweme>, Integer>> d() {
        t<p<List<Aweme>, Integer>> b2 = t.b(v.a(this.f106725e, 0));
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final t<p<List<Aweme>, Integer>> e() {
        t<p<List<Aweme>, Integer>> b2 = t.b(v.a(z.INSTANCE, -1));
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final t<p<List<Aweme>, Integer>> f() {
        long currentTimeMillis = System.currentTimeMillis();
        t<R> d2 = this.f106724d.getFavoriteList(this.f106722a, 0, 10).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new b(currentTimeMillis)).d(new c(this, currentTimeMillis));
        l.b(d2, "");
        return d2;
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106726a;

        static {
            Covode.recordClassIndex(68219);
        }

        b(long j2) {
            this.f106726a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            e.a("kids_api_like", 2, -1, this.f106726a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends Aweme> list) {
        l.d(list, "");
        this.f106725e = list;
        this.f106722a = (long) list.size();
        this.f106723b = true;
    }

    static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106728b;

        static {
            Covode.recordClassIndex(68220);
        }

        c(a aVar, long j2) {
            this.f106727a = aVar;
            this.f106728b = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            KidFeedItemList kidFeedItemList = (KidFeedItemList) obj;
            l.d(kidFeedItemList, "");
            e.a("kids_api_like", 2, 0, this.f106728b);
            a aVar = this.f106727a;
            boolean z = true;
            if (kidFeedItemList.getHasMore() != 1) {
                z = false;
            }
            aVar.f106723b = z;
            if (aVar.f106722a >= kidFeedItemList.getMaxCursor()) {
                return v.a(z.INSTANCE, -1);
            }
            aVar.f106722a = kidFeedItemList.getMaxCursor();
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
}
