package com.ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

public class EffectCheckUpdateResponse extends BaseNetResponse {
    private boolean updated;

    static {
        Covode.recordClassIndex(95427);
    }

    public boolean isUpdated() {
        return this.updated;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        return super.checkValue();
    }

    public void setUpdated(boolean z) {
        this.updated = z;
    }
}
