package com.bytedance.ies.bullet.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.d;
import com.bytedance.ies.bullet.c.c.e;
import com.bytedance.ies.bullet.c.c.g;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.l;
import com.bytedance.ies.bullet.c.c.m;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.service.f.a.b.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class j implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<d<?, ?, ?, ?>>, l<?, ?>> f32098a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.ies.bullet.c.c.a.l f32099b;

    /* renamed from: c  reason: collision with root package name */
    private final b f32100c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.b<b, List<q>> f32101d;

    static {
        Covode.recordClassIndex(18822);
    }

    @Override // com.bytedance.ies.bullet.c.g
    public final com.bytedance.ies.bullet.c.c.a.l a() {
        return this.f32099b;
    }

    @Override // com.bytedance.ies.bullet.c.g
    public final h.f.a.b<b, List<q>> b() {
        return this.f32101d;
    }

    @Override // com.bytedance.ies.bullet.c.g
    public final b c() {
        return this.f32100c;
    }

    @Override // com.bytedance.ies.bullet.c.g
    public final <S extends d<? extends T, ? extends U, ? extends V, ? extends X>, T extends m, U extends e, V extends i, X extends g> l<T, U> a(Class<? extends S> cls) {
        h.f.b.l.c(cls, "");
        l<T, U> lVar = (l<T, U>) this.f32098a.get(cls);
        if (lVar != null) {
            return lVar;
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.g
    public final <S extends d<? extends T, ? extends U, ? extends V, ? extends X>, T extends m, U extends e, V extends i, X extends g> void a(Class<? extends S> cls, l<? extends T, ? extends U> lVar) {
        h.f.b.l.c(cls, "");
        h.f.b.l.c(lVar, "");
        this.f32098a.put(cls, lVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.bytedance.ies.bullet.c.e.a.b, ? extends java.util.List<? extends com.bytedance.ies.bullet.service.f.a.b.q>> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(com.bytedance.ies.bullet.c.c.a.l lVar, b bVar, h.f.a.b<? super b, ? extends List<? extends q>> bVar2) {
        h.f.b.l.c(lVar, "");
        h.f.b.l.c(bVar, "");
        h.f.b.l.c(bVar2, "");
        this.f32099b = lVar;
        this.f32100c = bVar;
        this.f32101d = bVar2;
    }
}
