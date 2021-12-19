package com.ss.android.ugc.aweme.api.request;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.api.resp.EnterContext;
import h.f.b.g;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class GetItemProductInfoRequest implements Serializable {
    @c(a = "kol_id")
    private final String kolId;
    @c(a = "product_enter_context")
    private final Map<String, EnterContext> productEnterContext;
    @c(a = "product_id")
    private final List<String> productIds;

    static {
        Covode.recordClassIndex(40849);
    }

    public GetItemProductInfoRequest() {
        this(null, null, null, 7, null);
    }

    public final String getKolId() {
        return this.kolId;
    }

    public final Map<String, EnterContext> getProductEnterContext() {
        return this.productEnterContext;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public GetItemProductInfoRequest(List<String> list, String str, Map<String, EnterContext> map) {
        this.productIds = list;
        this.kolId = str;
        this.productEnterContext = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetItemProductInfoRequest(List list, String str, Map map, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : map);
    }
}
