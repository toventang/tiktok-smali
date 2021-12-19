package com.ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class SpecialPlusLabels {
    @c(a = "effect_ids")
    private String[] effectIds = new String[0];
    @c(a = "eligible_effect_ids")
    private String[] eligibleEffectIds = new String[0];

    static {
        Covode.recordClassIndex(87968);
    }

    public final String[] getEffectIds() {
        return this.effectIds;
    }

    public final String[] getEligibleEffectIds() {
        return this.eligibleEffectIds;
    }

    public final void setEffectIds(String[] strArr) {
        l.d(strArr, "");
        this.effectIds = strArr;
    }

    public final void setEligibleEffectIds(String[] strArr) {
        l.d(strArr, "");
        this.eligibleEffectIds = strArr;
    }
}
