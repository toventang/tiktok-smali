package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.api.WishListBulletApi;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class d implements c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final a<WishListBulletApi> f73863a;

    /* renamed from: b  reason: collision with root package name */
    private final a<IAdLandPagePreloadService> f73864b;

    static {
        Covode.recordClassIndex(45499);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a(this.f73863a.get(), this.f73864b.get());
    }

    public static b a(WishListBulletApi wishListBulletApi, IAdLandPagePreloadService iAdLandPagePreloadService) {
        return (b) f.a(a.a(wishListBulletApi, iAdLandPagePreloadService), "Cannot return null from a non-@Nullable @Provides method");
    }
}
