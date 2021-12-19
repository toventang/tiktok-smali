package com.ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.b;

public class SearchServiceImpl extends a {
    static {
        Covode.recordClassIndex(78790);
    }

    public static ISearchService t() {
        Object a2 = b.a(ISearchService.class, false);
        if (a2 != null) {
            return (ISearchService) a2;
        }
        return new SearchServiceImpl();
    }
}
