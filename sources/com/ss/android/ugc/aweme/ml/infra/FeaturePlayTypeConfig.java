package com.ss.android.ugc.aweme.ml.infra;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class FeaturePlayTypeConfig extends FeatureTypeConfig {
    @c(a = "feed_range_type")
    private String feedRangeType = "all";
    private List<String> feedRangeTypeList;
    @c(a = "play_range_type")
    private String playRangeType = "all";
    private List<String> playRangeTypeList;
    @c(a = "range")
    private int range;
    @c(a = "exclude_this")
    private boolean rangeExcludeThis;

    static {
        Covode.recordClassIndex(70958);
    }

    public final String getFeedRangeType() {
        return this.feedRangeType;
    }

    public final String getPlayRangeType() {
        return this.playRangeType;
    }

    public final int getRange() {
        return this.range;
    }

    public final boolean getRangeExcludeThis() {
        return this.rangeExcludeThis;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.FeatureTypeConfig
    public final String toString() {
        return "PlayType{super=" + super.toString() + ", range=" + this.range + ", playRangeType=" + this.playRangeType + ", feedRangeType=" + this.feedRangeType + ", rangeExcludeThis=" + this.rangeExcludeThis + '}';
    }

    public final void setRange(int i2) {
        this.range = i2;
    }

    public final void setRangeExcludeThis(boolean z) {
        this.rangeExcludeThis = z;
    }

    public final void setFeedRangeType(String str) {
        l.d(str, "");
        this.feedRangeType = str;
    }

    public final void setPlayRangeType(String str) {
        l.d(str, "");
        this.playRangeType = str;
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

    public final boolean containPlayRangeType(String str) {
        l.d(str, "");
        if (TextUtils.isEmpty(this.playRangeType)) {
            return false;
        }
        if (TextUtils.equals(this.playRangeType, "all")) {
            return true;
        }
        if (this.playRangeTypeList == null) {
            this.playRangeTypeList = p.b(this.playRangeType, new String[]{"|"});
        }
        List<String> list = this.playRangeTypeList;
        if (list != null) {
            return list.contains(str);
        }
        return false;
    }
}
