package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class PollResponse extends BaseResponse {
    @c(a = "option_id")
    private int optionId = -1;

    static {
        Covode.recordClassIndex(85485);
    }

    public final int getOptionId() {
        return this.optionId;
    }

    public final void setOptionId(int i2) {
        this.optionId = i2;
    }
}
