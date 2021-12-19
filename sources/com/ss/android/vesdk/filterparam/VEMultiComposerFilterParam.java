package com.ss.android.vesdk.filterparam;

import com.bytedance.covode.number.Covode;

public class VEMultiComposerFilterParam extends VEComposerFilterParam {
    static {
        Covode.recordClassIndex(99491);
    }

    @Override // com.ss.android.vesdk.filterparam.VEComposerFilterParam
    public boolean isOverallComposer() {
        return false;
    }

    public VEMultiComposerFilterParam() {
        this.filterName = "multi composer filter";
    }
}
