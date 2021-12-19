package com.ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class CommerceSmartUIStrategyConfig implements Serializable {
    @c(a = "default")
    private int defaultIndex;
    @c(a = "lable_index_mapping")
    private List<String> lableIndexMapping;
    @c(a = "plan")
    private PlanConfig[] plans;

    static {
        Covode.recordClassIndex(59479);
    }

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final List<String> getLableIndexMapping() {
        return this.lableIndexMapping;
    }

    public final PlanConfig[] getPlans() {
        return this.plans;
    }

    public final void setDefaultIndex(int i2) {
        this.defaultIndex = i2;
    }

    public final void setLableIndexMapping(List<String> list) {
        this.lableIndexMapping = list;
    }

    public final void setPlans(PlanConfig[] planConfigArr) {
        this.plans = planConfigArr;
    }
}
