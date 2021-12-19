package com.bytedance.android.live.core.paging.b;

import androidx.h.i;
import androidx.lifecycle.t;
import com.bytedance.android.live.core.a.a;
import com.bytedance.android.live.core.e.b;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;

public final class c<CacheKey, V> implements a<V> {
    private static final i.d p;

    /* renamed from: a  reason: collision with root package name */
    public t<b> f9160a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public t<b> f9161b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public t<Boolean> f9162c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public t<Boolean> f9163d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public f.a.l.c<Object> f9164e = new f.a.l.c<>();

    /* renamed from: f  reason: collision with root package name */
    public f.a.l.c<Object> f9165f = new f.a.l.c<>();

    /* renamed from: g  reason: collision with root package name */
    public f.a.l.c<Object> f9166g = new f.a.l.c<>();

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f9167h = false;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f9168i = false;

    /* renamed from: j  reason: collision with root package name */
    public AtomicLong f9169j = new AtomicLong(0);

    /* renamed from: k  reason: collision with root package name */
    public CacheKey f9170k;

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.android.live.core.a.b<CacheKey, V> f9171l;

    /* renamed from: m  reason: collision with root package name */
    public a<CacheKey, com.bytedance.android.live.base.model.c.a> f9172m;
    public i.d n = p;
    public com.bytedance.android.live.core.paging.c.b<V> o;
    private t<Integer> q = new t<>();

    @Override // com.bytedance.android.live.core.paging.b.a
    public final t<b> a() {
        return this.f9160a;
    }

    @Override // com.bytedance.android.live.core.paging.b.a
    public final t<b> b() {
        return this.f9161b;
    }

    @Override // com.bytedance.android.live.core.paging.b.a
    public final t<Boolean> c() {
        return this.f9162c;
    }

    @Override // com.bytedance.android.live.core.paging.b.a
    public final t<Boolean> d() {
        return this.f9163d;
    }

    @Override // com.bytedance.android.live.core.paging.b.a
    public final f.a.l.c<Object> e() {
        return this.f9164e;
    }

    @Override // com.bytedance.android.live.core.paging.b.a
    public final f.a.l.c<Object> f() {
        return this.f9165f;
    }

    @Override // com.bytedance.android.live.core.paging.b.a
    public final f.a.l.c<Object> g() {
        return this.f9166g;
    }

    @Override // com.bytedance.android.live.core.paging.b.a
    public final t<Integer> h() {
        return this.q;
    }

    static {
        Covode.recordClassIndex(4696);
        i.d.a aVar = new i.d.a();
        aVar.f3170d = false;
        aVar.f3167a = 12;
        aVar.f3168b = 12;
        p = aVar.a();
    }
}
