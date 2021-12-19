package com.vk.api.sdk.b;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.c.b;
import h.f.b.l;

public final class d<T> extends b<T> {

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f156253b;

    static {
        Covode.recordClassIndex(103768);
    }

    @Override // com.vk.api.sdk.b.b
    public final T a(a aVar) {
        l.c(aVar, "");
        try {
            return this.f156253b.a(aVar);
        } catch (b e2) {
            if (e2.isInvalidCredentialsError() && this.f156250a.f156268b != null) {
                e2.getApiMethod();
                e2.getUserBanInfo();
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.vk.api.sdk.b.b<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(com.vk.api.sdk.d dVar, b<? extends T> bVar) {
        super(dVar);
        l.c(dVar, "");
        l.c(bVar, "");
        this.f156253b = bVar;
    }
}
