package com.ss.android.ugc.aweme.favorites.service;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.favorites.api.VideoCollectionApi;
import com.ss.android.ugc.aweme.favorites.ui.g;
import com.ss.android.ugc.aweme.favorites.viewmodel.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.g.a;
import h.u;
import java.util.List;

public final class FavoriteServiceImpl implements IFavoriteService {
    static {
        Covode.recordClassIndex(56982);
    }

    public static IFavoriteService a() {
        MethodCollector.i(9825);
        Object a2 = b.a(IFavoriteService.class, false);
        if (a2 != null) {
            IFavoriteService iFavoriteService = (IFavoriteService) a2;
            MethodCollector.o(9825);
            return iFavoriteService;
        }
        if (b.bm == null) {
            synchronized (IFavoriteService.class) {
                try {
                    if (b.bm == null) {
                        b.bm = new FavoriteServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9825);
                    throw th;
                }
            }
        }
        FavoriteServiceImpl favoriteServiceImpl = (FavoriteServiceImpl) b.bm;
        MethodCollector.o(9825);
        return favoriteServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void a(String str) {
        l.d(str, "");
        f.a("COLLECTION_CONTENT", new com.ss.android.ugc.aweme.favorites.api.f(3, null, null, null, null, null, null, null, 254));
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final u<List<Aweme>, Boolean, Long> a(String str, long j2) {
        int i2;
        Object obj;
        boolean z;
        Long l2;
        Boolean bool;
        l.d(str, "");
        VideoCollectionApi a2 = VideoCollectionApi.a.a();
        long j3 = 0;
        if (j2 == 0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        T t = a2.syncCollectionContent(str, j2, 30, i2).execute().f42630b;
        if (t == null || (obj = t.f90446a) == null) {
            obj = z.INSTANCE;
        }
        if (t == null || (bool = t.f90448c) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!(t == null || (l2 = t.f90447b) == null)) {
            j3 = l2.longValue();
        }
        return new u<>(obj, valueOf, Long.valueOf(j3));
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void a(e eVar, String str, String str2) {
        l.d(eVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(eVar, "");
        l.d(str, "");
        l.d(str2, "");
        Window window = eVar.getWindow();
        l.b(window, "");
        View decorView = window.getDecorView();
        l.b(decorView, "");
        Window window2 = eVar.getWindow();
        l.b(window2, "");
        View findViewById = window2.getDecorView().findViewById(R.id.fk_);
        if (findViewById != null) {
            Rect rect = new Rect();
            decorView.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            findViewById.getGlobalVisibleRect(rect2);
            g gVar = new g(eVar, str, str2);
            int i2 = rect.bottom - rect2.bottom;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            gVar.showAtLocation(decorView, 80, 0, i2 + a.a(TypedValue.applyDimension(1, 60.0f, system.getDisplayMetrics())));
        }
    }
}
