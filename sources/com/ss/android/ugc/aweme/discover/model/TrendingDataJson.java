package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class TrendingDataJson {
    @c(a = "trendingBillboardData")
    public TrendingData trendingData;

    static {
        Covode.recordClassIndex(50979);
    }

    public static /* synthetic */ TrendingDataJson copy$default(TrendingDataJson trendingDataJson, TrendingData trendingData2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            trendingData2 = trendingDataJson.trendingData;
        }
        return trendingDataJson.copy(trendingData2);
    }

    public final TrendingDataJson copy(TrendingData trendingData2) {
        return new TrendingDataJson(trendingData2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TrendingDataJson) && l.a(this.trendingData, ((TrendingDataJson) obj).trendingData);
        }
        return true;
    }

    public final int hashCode() {
        TrendingData trendingData2 = this.trendingData;
        if (trendingData2 != null) {
            return trendingData2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TrendingDataJson(trendingData=" + this.trendingData + ")";
    }

    public TrendingDataJson(TrendingData trendingData2) {
        this.trendingData = trendingData2;
    }
}
