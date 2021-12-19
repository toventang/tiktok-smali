package com.ss.android.ugc.aweme.kids.liked;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.kids.liked.a.a;
import com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService;
import com.ss.android.ugc.b;

public final class FavoriteServiceImpl implements IFavoriteService {
    static {
        Covode.recordClassIndex(68197);
    }

    @Override // com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService
    public final Fragment a() {
        return new a();
    }

    public static IFavoriteService b() {
        MethodCollector.i(131);
        Object a2 = b.a(IFavoriteService.class, false);
        if (a2 != null) {
            IFavoriteService iFavoriteService = (IFavoriteService) a2;
            MethodCollector.o(131);
            return iFavoriteService;
        }
        if (b.bV == null) {
            synchronized (IFavoriteService.class) {
                try {
                    if (b.bV == null) {
                        b.bV = new FavoriteServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(131);
                    throw th;
                }
            }
        }
        FavoriteServiceImpl favoriteServiceImpl = (FavoriteServiceImpl) b.bV;
        MethodCollector.o(131);
        return favoriteServiceImpl;
    }
}
