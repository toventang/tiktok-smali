package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.api.WishListBulletApi;
import dagger.a.f;

public final class c implements dagger.a.c<WishListBulletApi> {
    static {
        Covode.recordClassIndex(45498);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a();
    }

    public static WishListBulletApi a() {
        return (WishListBulletApi) f.a(a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
