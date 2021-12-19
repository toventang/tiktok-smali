package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.search.l;
import h.f.b.g;
import java.util.ArrayList;

public final class TrendingData extends BaseResponse {
    @c(a = "billboard_info")
    public ArrayList<l> billboardInfo;
    @c(a = "billboard_type")
    public int billboardType;
    @c(a = "item_related_event_id")
    public String trendingId;

    static {
        Covode.recordClassIndex(50978);
    }

    public TrendingData() {
        this(null, null, 0, 7, null);
    }

    public final void setTrendingId(String str) {
        h.f.b.l.d(str, "");
        this.trendingId = str;
    }

    public TrendingData(ArrayList<l> arrayList, String str, int i2) {
        h.f.b.l.d(str, "");
        this.billboardInfo = arrayList;
        this.trendingId = str;
        this.billboardType = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrendingData(ArrayList arrayList, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : arrayList, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
