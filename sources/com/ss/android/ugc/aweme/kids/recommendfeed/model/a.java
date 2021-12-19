package com.ss.android.ugc.aweme.kids.recommendfeed.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.c.e;
import com.ss.android.ugc.aweme.kids.recommendfeed.fetchlist.FeedApi;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import h.a.z;
import h.f.b.l;
import h.p;
import h.v;
import java.util.List;

public final class a implements com.ss.android.ugc.aweme.kids.commonfeed.c.a {
    static {
        Covode.recordClassIndex(68287);
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final boolean a() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final boolean b() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final boolean c() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final t<p<List<Aweme>, Integer>> d() {
        return e();
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final t<p<List<Aweme>, Integer>> e() {
        long currentTimeMillis = System.currentTimeMillis();
        t<R> d2 = FeedApi.a(1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new c(currentTimeMillis)).d(new d(this, currentTimeMillis));
        l.b(d2, "");
        return d2;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.a
    public final t<p<List<Aweme>, Integer>> f() {
        long currentTimeMillis = System.currentTimeMillis();
        t<R> d2 = FeedApi.a(2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new C2740a(currentTimeMillis)).d(new b(this, currentTimeMillis));
        l.b(d2, "");
        return d2;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.model.a$a  reason: collision with other inner class name */
    static final class C2740a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106804a;

        static {
            Covode.recordClassIndex(68288);
        }

        C2740a(long j2) {
            this.f106804a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            e.a("kids_api_feed", 2, -1, this.f106804a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106807a;

        static {
            Covode.recordClassIndex(68290);
        }

        c(long j2) {
            this.f106807a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            e.a("kids_api_feed", 1, -1, this.f106807a);
        }
    }

    static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106805a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106806b;

        static {
            Covode.recordClassIndex(68289);
        }

        b(a aVar, long j2) {
            this.f106805a = aVar;
            this.f106806b = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            KFeedItemList kFeedItemList = (KFeedItemList) obj;
            l.d(kFeedItemList, "");
            e.a("kids_api_feed", 2, 0, this.f106806b);
            return a.a(kFeedItemList);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106808a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106809b;

        static {
            Covode.recordClassIndex(68291);
        }

        d(a aVar, long j2) {
            this.f106808a = aVar;
            this.f106809b = j2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            KFeedItemList kFeedItemList = (KFeedItemList) obj;
            l.d(kFeedItemList, "");
            e.a("kids_api_feed", 1, 0, this.f106809b);
            return a.a(kFeedItemList);
        }
    }

    public static p<List<Aweme>, Integer> a(KFeedItemList kFeedItemList) {
        Aweme aweme = kFeedItemList.items.get(0);
        l.b(aweme, "");
        if (aweme.getLogPbBean() == null) {
            for (Aweme aweme2 : kFeedItemList.items) {
                l.b(aweme2, "");
                aweme2.setLogPbBean(kFeedItemList.getLogPb());
            }
        }
        if (kFeedItemList.items.isEmpty()) {
            return v.a(z.INSTANCE, -1);
        }
        return v.a(kFeedItemList.items, 0);
    }
}
