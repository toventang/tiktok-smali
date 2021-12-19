package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.core.f.v;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.feed.e;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import f.a.l.b;
import f.a.l.c;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    Map<FeedDataKey, a> f17340a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    b<Boolean> f17341b = b.a((Object) false);

    /* renamed from: c  reason: collision with root package name */
    c<FeedDataKey> f17342c = new c<>();

    /* renamed from: d  reason: collision with root package name */
    c<Boolean> f17343d = new c<>();

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.android.live.core.a.b<FeedDataKey, FeedItem> f17344e;

    /* renamed from: f  reason: collision with root package name */
    private List<e> f17345f = new LinkedList();

    /* renamed from: g  reason: collision with root package name */
    private List<h.a> f17346g = new v();

    /* renamed from: h  reason: collision with root package name */
    private boolean f17347h;

    static {
        Covode.recordClassIndex(9617);
    }

    @Override // com.bytedance.android.livesdk.feed.h
    public final void a() {
        if (!this.f17347h) {
            this.f17347h = true;
            this.f17341b.onNext(true);
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public r f17348a;

        /* renamed from: b  reason: collision with root package name */
        public int f17349b;

        static {
            Covode.recordClassIndex(9618);
        }

        private a(r rVar) {
            this.f17348a = rVar;
        }

        /* synthetic */ a(r rVar, byte b2) {
            this(rVar);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.h
    public final void a(e eVar) {
        this.f17345f.add(eVar);
    }

    @Override // com.bytedance.android.livesdk.feed.h
    public final void b(e eVar) {
        this.f17345f.remove(eVar);
    }

    @Override // com.bytedance.android.livesdk.feed.h
    public final void a(h.a aVar) {
        this.f17346g.add(aVar);
    }

    @Override // com.bytedance.android.livesdk.feed.h
    public final void b(h.a aVar) {
        this.f17346g.remove(aVar);
    }

    public d(com.bytedance.android.live.core.a.b<FeedDataKey, FeedItem> bVar) {
        this.f17344e = bVar;
    }

    @Override // com.bytedance.android.livesdk.feed.h
    public final boolean a(FeedDataKey feedDataKey) {
        if (feedDataKey == null) {
            return false;
        }
        a aVar = this.f17340a.get(feedDataKey);
        if (aVar != null) {
            aVar.f17349b--;
            if (aVar.f17349b <= 0) {
                this.f17340a.remove(feedDataKey);
            }
            if (aVar.f17349b == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.feed.j
    public final FeedItem b(FeedDataKey feedDataKey, String str) {
        a aVar = this.f17340a.get(feedDataKey);
        if (aVar != null) {
            return aVar.f17348a.d(str);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.feed.h
    public final void a(FeedDataKey feedDataKey, r rVar) {
        if (feedDataKey != null) {
            a aVar = this.f17340a.get(feedDataKey);
            if (aVar == null) {
                aVar = new a(rVar, (byte) 0);
                this.f17340a.put(feedDataKey, aVar);
                this.f17342c.onNext(feedDataKey);
            }
            if (aVar.f17348a != rVar) {
                aVar.f17348a = rVar;
            }
            aVar.f17349b++;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.h
    public final void a(FeedDataKey feedDataKey, String str) {
        a aVar = this.f17340a.get(feedDataKey);
        if (aVar != null) {
            aVar.f17348a.c(str);
        }
        for (h.a aVar2 : this.f17346g) {
            if (aVar2 != null) {
                aVar2.a();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.feed.h
    public final void a(String str, List<FeedItem> list, com.bytedance.android.live.base.model.c.a aVar, boolean z) {
        if (com.bytedance.common.utility.h.b(this.f17345f)) {
            for (e eVar : this.f17345f) {
                eVar.a(str, list, aVar, z);
            }
        }
    }
}
