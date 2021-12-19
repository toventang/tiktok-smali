package com.ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;

public final class SearchEffectResponseV2 extends BaseNetResponse {
    private SearchEffectModel data;

    static {
        Covode.recordClassIndex(95437);
    }

    public final SearchEffectModel getData() {
        return this.data;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public final boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final void setData(SearchEffectModel searchEffectModel) {
        this.data = searchEffectModel;
    }
}
