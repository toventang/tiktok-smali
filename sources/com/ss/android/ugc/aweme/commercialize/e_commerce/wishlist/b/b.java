package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import dagger.a.c;
import dagger.a.f;

public final class b implements c<IAdLandPagePreloadService> {
    static {
        Covode.recordClassIndex(45497);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a();
    }

    public static IAdLandPagePreloadService a() {
        return (IAdLandPagePreloadService) f.a(a.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
