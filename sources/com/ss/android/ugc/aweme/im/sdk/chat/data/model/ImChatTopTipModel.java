package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class ImChatTopTipModel extends BaseResponse {
    @c(a = "data")
    private IMNoticeMsgStruct noticeMsgStruct;

    static {
        Covode.recordClassIndex(64046);
    }

    public final IMNoticeMsgStruct getNoticeMsgStruct() {
        return this.noticeMsgStruct;
    }

    public final void setNoticeMsgStruct(IMNoticeMsgStruct iMNoticeMsgStruct) {
        this.noticeMsgStruct = iMNoticeMsgStruct;
    }
}
