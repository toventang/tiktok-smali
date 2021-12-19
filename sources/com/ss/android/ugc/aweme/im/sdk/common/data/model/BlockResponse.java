package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class BlockResponse extends BaseResponse {
    @c(a = "block_status")
    int blockStaus;

    static {
        Covode.recordClassIndex(65626);
    }

    public int getBlockStaus() {
        return this.blockStaus;
    }

    public void setBlockStaus(int i2) {
        this.blockStaus = i2;
    }
}
