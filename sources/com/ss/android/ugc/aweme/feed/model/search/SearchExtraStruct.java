package com.ss.android.ugc.aweme.feed.model.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class SearchExtraStruct implements Serializable {
    @c(a = "liveProductStruct")
    private SearchLiveCommdityStruct searchLiveStruct;
    @c(a = "searchShopStruct")
    private SearchShopStruct searchShopStruct;

    static {
        Covode.recordClassIndex(59522);
    }

    public final SearchLiveCommdityStruct getSearchLiveStruct() {
        return this.searchLiveStruct;
    }

    public final SearchShopStruct getSearchShopStruct() {
        return this.searchShopStruct;
    }

    public final void setSearchLiveStruct(SearchLiveCommdityStruct searchLiveCommdityStruct) {
        this.searchLiveStruct = searchLiveCommdityStruct;
    }

    public final void setSearchShopStruct(SearchShopStruct searchShopStruct2) {
        this.searchShopStruct = searchShopStruct2;
    }
}
