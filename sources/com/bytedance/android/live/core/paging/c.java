package com.bytedance.android.live.core.paging;

import androidx.h.i;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.core.a.b;
import com.bytedance.covode.number.Covode;

public final class c<CacheKey, T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    private b<CacheKey, T> f9174a;

    /* renamed from: b  reason: collision with root package name */
    private CacheKey f9175b;

    static {
        Covode.recordClassIndex(4698);
    }

    @Override // com.bytedance.android.live.core.paging.b, com.bytedance.android.live.core.paging.a
    public final void j() {
        this.f9174a.a(this.f9175b);
        h();
    }

    @Override // com.bytedance.android.live.core.paging.b, com.bytedance.android.live.core.paging.a
    public final int k() {
        return this.f9174a.c(this.f9175b);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.bytedance.android.live.core.a.b<CacheKey, V>, com.bytedance.android.live.core.a.b<CacheKey, T> */
    public c(com.bytedance.android.live.core.paging.b.c<CacheKey, T> cVar, LiveData<i<T>> liveData) {
        super(cVar, liveData);
        this.f9175b = cVar.f9170k;
        this.f9174a = (b<CacheKey, V>) cVar.f9171l;
    }
}
