package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class SmartFeedLoadMoreStrategyConfig {
    @c(a = "default")
    private int defaultIndex;
    @c(a = "label_index_mapping")
    private List<String> labelIndexMapping;
    @c(a = "plan")
    private final List<FeedLoadMorePlan> plans;

    static {
        Covode.recordClassIndex(70830);
    }

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final List<String> getLabelIndexMapping() {
        return this.labelIndexMapping;
    }

    public final void setDefaultIndex(int i2) {
        this.defaultIndex = i2;
    }

    public final void setLabelIndexMapping(List<String> list) {
        this.labelIndexMapping = list;
    }

    public final FeedLoadMorePlan getPlan(String str) {
        List<String> list;
        int indexOf;
        l.d(str, "");
        if (this.plans == null || (list = this.labelIndexMapping) == null || (indexOf = list.indexOf(str)) < 0 || indexOf >= this.plans.size()) {
            return null;
        }
        return this.plans.get(indexOf);
    }
}
