package com.ss.android.ugc.aweme.feed.adapter;

import androidx.lifecycle.af;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.b;
import com.bytedance.tiktok.proxy.c;
import com.bytedance.tiktok.proxy.d;
import h.h;

public final class ap<R extends d, ITEM> implements com.bytedance.tiktok.proxy.a<R, ITEM> {

    /* renamed from: a  reason: collision with root package name */
    public c<R, ITEM, com.bytedance.tiktok.proxy.a<R, ITEM>> f91596a;

    /* renamed from: b  reason: collision with root package name */
    public final b<R, ITEM> f91597b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f91598c;

    /* renamed from: d  reason: collision with root package name */
    private final af f91599d;

    /* renamed from: e  reason: collision with root package name */
    private final h f91600e;

    static {
        Covode.recordClassIndex(57688);
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final m getActualLifecycleOwner() {
        return this;
    }

    @Override // androidx.lifecycle.ag
    public final af getViewModelStore() {
        return this.f91599d;
    }

    @Override // com.bytedance.tiktok.proxy.g
    public final boolean h() {
        return this.f91598c;
    }

    static final class a extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(57689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ap apVar) {
            super(0);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0);
        }
    }

    private /* synthetic */ ap() {
        this(null);
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final R getActualReceiver() {
        c<R, ITEM, com.bytedance.tiktok.proxy.a<R, ITEM>> cVar = this.f91596a;
        if (cVar != null) {
            return cVar.aG_();
        }
        return null;
    }

    @Override // androidx.lifecycle.m
    public final /* synthetic */ i getLifecycle() {
        return (n) this.f91600e.getValue();
    }

    public final void a() {
        c<R, ITEM, com.bytedance.tiktok.proxy.a<R, ITEM>> cVar = this.f91596a;
        if (cVar != null) {
            cVar.a(null);
        }
        this.f91596a = null;
        b<R, ITEM> bVar = this.f91597b;
        if (bVar != null) {
            bVar.a();
        }
    }

    public ap(b<R, ITEM> bVar) {
        this.f91597b = bVar;
        this.f91599d = new af();
        this.f91600e = h.i.a((h.f.a.a) new a(this));
    }
}
