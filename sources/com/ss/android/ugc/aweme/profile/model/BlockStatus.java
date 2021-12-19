package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class BlockStatus extends BaseResponse {
    public int blockStatus = -1;
    public String userId;

    static {
        Covode.recordClassIndex(75207);
    }

    public BlockStatus(String str, int i2) {
        this.userId = str;
        this.blockStatus = i2;
    }
}
