package com.bytedance.android.live.core.paging.c;

import android.os.SystemClock;
import android.util.Pair;
import androidx.h.d;
import androidx.h.g;
import androidx.lifecycle.t;
import com.bytedance.android.live.core.a.a;
import com.bytedance.android.live.core.a.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public abstract class c<DataKey, V, CacheKey> extends g<DataKey, V> implements d.b {

    /* renamed from: e  reason: collision with root package name */
    protected CacheKey f9176e;

    /* renamed from: f  reason: collision with root package name */
    protected b<CacheKey, V> f9177f;

    /* renamed from: g  reason: collision with root package name */
    protected a<CacheKey, com.bytedance.android.live.base.model.c.a> f9178g;

    /* renamed from: h  reason: collision with root package name */
    protected t<com.bytedance.android.live.core.e.b> f9179h;

    /* renamed from: i  reason: collision with root package name */
    protected t<com.bytedance.android.live.core.e.b> f9180i;

    /* renamed from: j  reason: collision with root package name */
    protected t<Boolean> f9181j;

    /* renamed from: k  reason: collision with root package name */
    protected t<Boolean> f9182k;

    /* renamed from: l  reason: collision with root package name */
    final com.bytedance.android.live.core.paging.b.c<CacheKey, V> f9183l;

    /* renamed from: m  reason: collision with root package name */
    Runnable f9184m;
    private long n;
    private final f.a.b.a o = new f.a.b.a();

    static {
        Covode.recordClassIndex(4701);
    }

    /* access modifiers changed from: protected */
    public abstract f.a.t<Pair<List<V>, com.bytedance.android.live.base.model.c.a>> a(boolean z, DataKey datakey);

    /* access modifiers changed from: protected */
    public abstract DataKey a(com.bytedance.android.live.base.model.c.a aVar);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(g.f fVar, g.a aVar, Throwable th) {
        this.f9179h.postValue(com.bytedance.android.live.core.e.b.a(th));
        this.f9184m = new o(this, fVar, aVar);
    }

    private void c() {
        if (this.f9183l.f9167h) {
            d();
            this.f9183l.f9167h = false;
        }
    }

    private void d() {
        this.f9177f.d(this.f9176e);
        this.f9178g.b(this.f9176e);
    }

    private boolean e() {
        boolean z;
        synchronized (this.f9183l) {
            if (this.n == this.f9183l.f9169j.get()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        if (this.f9179h.getValue() == null || this.f9179h.getValue() != com.bytedance.android.live.core.e.b.f9010c) {
            f_();
        }
    }

    @Override // androidx.h.d.b
    public final void a() {
        this.o.a();
        b(this);
    }

    private void a(f.a.b.b bVar) {
        this.o.a(bVar);
    }

    public c(com.bytedance.android.live.core.paging.b.c<CacheKey, V> cVar) {
        this.f9176e = cVar.f9170k;
        this.f9177f = cVar.f9171l;
        this.f9178g = cVar.f9172m;
        this.f9180i = cVar.f9161b;
        this.f9179h = cVar.f9160a;
        this.f9181j = cVar.f9162c;
        this.f9182k = cVar.f9163d;
        this.f9183l = cVar;
        this.n = cVar.f9169j.incrementAndGet();
        a(cVar.f9165f.a(new d(this), e.f9186a));
        a(cVar.f9164e.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this, cVar), i.f9193a));
        a(cVar.f9166g.d(new j(this)));
        a((d.b) this);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(g.e eVar, g.c cVar) {
        a(eVar, cVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(g.f fVar, g.a aVar) {
        a(fVar, aVar);
    }

    private List<V> a(List<V> list, com.bytedance.android.live.base.model.c.a aVar) {
        this.f9178g.a(this.f9176e, aVar);
        return this.f9177f.a(this.f9176e, (List) new ArrayList(list));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(g.a aVar, Pair pair) {
        boolean z;
        DataKey a2 = a((com.bytedance.android.live.base.model.c.a) pair.second);
        t<Boolean> tVar = this.f9181j;
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        tVar.postValue(Boolean.valueOf(z));
        aVar.a(a((List) pair.first, (com.bytedance.android.live.base.model.c.a) pair.second), a2);
        this.f9179h.postValue(com.bytedance.android.live.core.e.b.f9011d);
    }

    @Override // androidx.h.g
    public final void a(g.e<DataKey> eVar, g.c<DataKey, V> cVar) {
        if (!e()) {
            com.bytedance.android.live.core.c.a.a(3, "RxCacheDataSource", "load initial not my generation ");
            return;
        }
        boolean z = false;
        if (this.f9183l.f9168i) {
            this.f9183l.f9168i = false;
            this.f9183l.f9167h = true;
        }
        this.f9180i.postValue(com.bytedance.android.live.core.e.b.f9010c);
        this.f9179h.postValue(com.bytedance.android.live.core.e.b.f9010c);
        this.f9181j.postValue(true);
        this.f9184m = null;
        List<V> b2 = this.f9177f.b(this.f9176e);
        if (!h.a(b2)) {
            com.bytedance.android.live.base.model.c.a c2 = this.f9178g.c(this.f9176e);
            cVar.a(new ArrayList(b2), a(c2));
            if (!this.f9183l.f9167h) {
                this.f9182k.postValue(false);
                t<Boolean> tVar = this.f9181j;
                if (a(c2) != null) {
                    z = true;
                }
                tVar.postValue(Boolean.valueOf(z));
                this.f9180i.postValue(com.bytedance.android.live.core.e.b.f9011d);
                this.f9179h.postValue(com.bytedance.android.live.core.e.b.f9011d);
                return;
            }
        }
        f.a.t<Pair<List<V>, com.bytedance.android.live.base.model.c.a>> a2 = a(true, (Object) null);
        if (a2 == null) {
            this.f9180i.postValue(com.bytedance.android.live.core.e.b.f9011d);
            this.f9179h.postValue(com.bytedance.android.live.core.e.b.f9011d);
            return;
        }
        a(a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new k(this, SystemClock.elapsedRealtime(), cVar), new l(this, eVar, cVar)));
    }

    @Override // androidx.h.g
    public final void a(g.f<DataKey> fVar, g.a<DataKey, V> aVar) {
        if (!this.f9183l.f9167h) {
            this.f9179h.postValue(com.bytedance.android.live.core.e.b.f9010c);
            this.f9184m = null;
            a(a(false, (Object) fVar.f3129a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new m(this, aVar), new n(this, fVar, aVar)));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(long j2, g.c cVar, Pair pair) {
        boolean z;
        b.a.a("livesdk_live_request_response").f("click").a("enter_from_merge", "live_merge").a("enter_method", "live_cover").a("duration", SystemClock.elapsedRealtime() - j2).a("request_api", "webcast/feed").a("room_num", ((List) pair.first).size()).b();
        this.f9180i.postValue(com.bytedance.android.live.core.e.b.f9011d);
        this.f9179h.postValue(com.bytedance.android.live.core.e.b.f9011d);
        if (!e()) {
            com.bytedance.android.live.core.c.a.a(3, "RxCacheDataSource", "on data not my generation ");
            if (this.f9183l.f9167h) {
                this.f9183l.f9167h = false;
                return;
            }
            return;
        }
        DataKey a2 = a((com.bytedance.android.live.base.model.c.a) pair.second);
        t<Boolean> tVar = this.f9181j;
        boolean z2 = true;
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        tVar.postValue(Boolean.valueOf(z));
        if (!h.a(this.f9177f.b(this.f9176e)) || !h.a((List) pair.first)) {
            z2 = false;
        }
        if (!this.f9183l.f9167h || z2) {
            if (!h.a((List) pair.first)) {
                d();
            }
            List<V> a3 = a((List) pair.first, (com.bytedance.android.live.base.model.c.a) pair.second);
            this.f9182k.postValue(Boolean.valueOf(h.a(a3)));
            cVar.a(a3, a2);
            this.f9183l.f9167h = false;
            return;
        }
        c();
        a((List) pair.first, (com.bytedance.android.live.base.model.c.a) pair.second);
        f_();
        this.f9182k.postValue(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(g.e eVar, g.c cVar, Throwable th) {
        this.f9183l.f9167h = false;
        this.f9180i.postValue(com.bytedance.android.live.core.e.b.a(th));
        this.f9179h.postValue(com.bytedance.android.live.core.e.b.a(th));
        if (!e()) {
            com.bytedance.android.live.core.c.a.a(3, "RxCacheDataSource", "exception not my generation " + th.getMessage());
        } else if (this.f9183l.f9167h) {
            c();
            this.f9184m = new f(this);
        } else {
            this.f9184m = new g(this, eVar, cVar);
        }
    }
}
