package com.bytedance.ies.bullet.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.d;
import com.bytedance.ies.bullet.c.c.l;
import com.bytedance.ies.bullet.service.f.a.b.q;
import h.f.a.b;
import java.util.List;

public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d<?, ?, ?, ?> f32083a;

    /* renamed from: b  reason: collision with root package name */
    private final l<?, ?> f32084b;

    /* renamed from: c  reason: collision with root package name */
    private final List<l<?, ?>> f32085c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.ies.bullet.c.c.a.l f32086d;

    /* renamed from: e  reason: collision with root package name */
    private final List<com.bytedance.ies.bullet.c.c.a.l> f32087e;

    /* renamed from: f  reason: collision with root package name */
    private final List<b<com.bytedance.ies.bullet.c.e.a.b, List<q>>> f32088f;

    static {
        Covode.recordClassIndex(18820);
    }

    @Override // com.bytedance.ies.bullet.c.f
    public final l<?, ?> a() {
        return this.f32084b;
    }

    @Override // com.bytedance.ies.bullet.c.f
    public final List<l<?, ?>> b() {
        return this.f32085c;
    }

    @Override // com.bytedance.ies.bullet.c.f
    public final com.bytedance.ies.bullet.c.c.a.l c() {
        return this.f32086d;
    }

    @Override // com.bytedance.ies.bullet.c.f
    public final List<com.bytedance.ies.bullet.c.c.a.l> d() {
        return this.f32087e;
    }

    @Override // com.bytedance.ies.bullet.c.f
    public final List<b<com.bytedance.ies.bullet.c.e.a.b, List<q>>> e() {
        return this.f32088f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.bytedance.ies.bullet.c.c.l<?, ?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.bytedance.ies.bullet.c.c.a.l> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends h.f.a.b<? super com.bytedance.ies.bullet.c.e.a.b, ? extends java.util.List<? extends com.bytedance.ies.bullet.service.f.a.b.q>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(d<?, ?, ?, ?> dVar, l<?, ?> lVar, List<? extends l<?, ?>> list, com.bytedance.ies.bullet.c.c.a.l lVar2, List<? extends com.bytedance.ies.bullet.c.c.a.l> list2, List<? extends b<? super com.bytedance.ies.bullet.c.e.a.b, ? extends List<? extends q>>> list3) {
        h.f.b.l.c(dVar, "");
        h.f.b.l.c(list, "");
        h.f.b.l.c(list2, "");
        h.f.b.l.c(list3, "");
        this.f32083a = dVar;
        this.f32084b = lVar;
        this.f32085c = list;
        this.f32086d = lVar2;
        this.f32087e = list2;
        this.f32088f = list3;
    }
}
