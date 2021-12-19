package com.bytedance.android.live.core.paging.c;

import com.bytedance.android.live.core.paging.b.c;
import com.bytedance.covode.number.Covode;
import f.a.t;

public final class a<CacheKey, V> extends c<Long, V, CacheKey> {
    private final b<V> n;

    static {
        Covode.recordClassIndex(4699);
    }

    public a(c<CacheKey, V> cVar) {
        super(cVar);
        this.n = cVar.o;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.core.paging.c.c
    public final /* synthetic */ Long a(com.bytedance.android.live.base.model.c.a aVar) {
        if (aVar == null || !aVar.hasMore) {
            return null;
        }
        return Long.valueOf(aVar.f7381d);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.core.paging.c.c
    public final /* bridge */ /* synthetic */ t a(boolean z, Long l2) {
        return this.n.a(z, l2);
    }
}
