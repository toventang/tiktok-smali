package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.api.WishListBulletApi;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73862a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45496);
    }

    public static IAdLandPagePreloadService b() {
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        l.b(f2, "");
        return f2;
    }

    public static WishListBulletApi a() {
        Object a2 = RetrofitFactory.a().b(b.f59141e).d().a(WishListBulletApi.class);
        l.b(a2, "");
        return (WishListBulletApi) a2;
    }

    public static com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b a(WishListBulletApi wishListBulletApi, IAdLandPagePreloadService iAdLandPagePreloadService) {
        l.d(wishListBulletApi, "");
        l.d(iAdLandPagePreloadService, "");
        return new com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b(wishListBulletApi, iAdLandPagePreloadService);
    }
}
