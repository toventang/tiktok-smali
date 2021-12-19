package com.ss.android.ugc.aweme.ml.infra;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class FeatureFeedTypeConfig extends FeatureTypeConfig {
    @c(a = "feed_range_type")
    private String feedRangeType = "all";
    private List<String> feedRangeTypeList;
    @c(a = "range")
    private int range;

    static {
        Covode.recordClassIndex(70956);
    }

    public final String getFeedRangeType() {
        return this.feedRangeType;
    }

    public final int getRange() {
        return this.range;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.FeatureTypeConfig
    public final String toString() {
        return "FeedType{super=" + super.toString() + ", range=" + this.range + ", feedRangeType=" + this.feedRangeType + '}';
    }

    public final void setRange(int i2) {
        this.range = i2;
    }

    public final void setFeedRangeType(String str) {
        l.d(str, "");
        this.feedRangeType = str;
    }

    public final boolean containFeedRangeType(String str) {
        l.d(str, "");
        if (TextUtils.isEmpty(this.feedRangeType)) {
            return false;
        }
        if (TextUtils.equals(this.feedRangeType, "all")) {
            return true;
        }
        if (this.feedRangeTypeList == null) {
            this.feedRangeTypeList = p.b(this.feedRangeType, new String[]{"|"});
        }
        List<String> list = this.feedRangeTypeList;
        if (list != null) {
            return list.contains(str);
        }
        return false;
    }
}
