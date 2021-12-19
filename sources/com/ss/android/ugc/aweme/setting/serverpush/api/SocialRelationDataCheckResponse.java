package com.ss.android.ugc.aweme.setting.serverpush.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class SocialRelationDataCheckResponse extends BaseResponse {
    @c(a = "has_remaining_data")
    private boolean hasRemainingData;

    static {
        Covode.recordClassIndex(80419);
    }

    public final boolean getHasRemainingData() {
        return this.hasRemainingData;
    }

    public final void setHasRemainingData(boolean z) {
        this.hasRemainingData = z;
    }
}
