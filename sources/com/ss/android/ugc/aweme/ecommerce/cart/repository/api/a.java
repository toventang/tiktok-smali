package com.ss.android.ugc.aweme.ecommerce.cart.repository.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b;
import com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c;
import com.ss.android.ugc.aweme.ecommerce.cart.repository.api.CartApi;
import f.a.t;
import h.f.b.l;

public final class a extends com.bytedance.jedi.a.f.a<b, c, b, c> {
    static {
        Covode.recordClassIndex(52889);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<c> a(b bVar) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        l.d(bVar2, "");
        t<c> b2 = ((CartApi) CartApi.a.f84712a.a(CartApi.class)).addToCart(bVar2).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj2;
    }
}
