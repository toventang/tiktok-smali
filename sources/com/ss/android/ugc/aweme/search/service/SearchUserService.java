package com.ss.android.ugc.aweme.search.service;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.api.SearchSugApi;
import com.ss.android.ugc.aweme.discover.helper.ah;
import com.ss.android.ugc.aweme.search.b.a;
import com.ss.android.ugc.aweme.search.model.g;
import com.ss.android.ugc.aweme.search.model.h;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.List;

public final class SearchUserService implements ISearchUserService {
    static {
        Covode.recordClassIndex(79209);
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final boolean a() {
        return a.a();
    }

    public static ISearchUserService b() {
        MethodCollector.i(451);
        Object a2 = b.a(ISearchUserService.class, false);
        if (a2 != null) {
            ISearchUserService iSearchUserService = (ISearchUserService) a2;
            MethodCollector.o(451);
            return iSearchUserService;
        }
        if (b.di == null) {
            synchronized (ISearchUserService.class) {
                try {
                    if (b.di == null) {
                        b.di = new SearchUserService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(451);
                    throw th;
                }
            }
        }
        SearchUserService searchUserService = (SearchUserService) b.di;
        MethodCollector.o(451);
        return searchUserService;
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final i<h> a(g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
        List<String> list = gVar.f121535f;
        if (list != null) {
            Integer.valueOf(list.size());
        }
        return SearchSugApi.a().fetchUserSugAsync(gVar.f121530a, gVar.f121531b, gVar.f121532c, gVar.f121533d, gVar.f121534e, SearchSugApi.a(gVar.f121535f));
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final h b(g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
        List<String> list = gVar.f121535f;
        if (list != null) {
            Integer.valueOf(list.size());
        }
        T t = SearchSugApi.a().fetchUserSug(gVar.f121530a, gVar.f121531b, gVar.f121532c, gVar.f121533d, gVar.f121534e, SearchSugApi.a(gVar.f121535f)).execute().f42630b;
        l.b(t, "");
        return t;
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final String a(Context context, Integer num) {
        return ah.a(context, num);
    }

    @Override // com.ss.android.ugc.aweme.search.service.ISearchUserService
    public final String a(Context context, String str) {
        return ah.a(context, str);
    }
}
