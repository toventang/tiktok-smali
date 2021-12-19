package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class ExposeSharerData extends BaseResponse {
    public String aid;
    @c(a = "sharer_info")
    public ExposeSharer exposeSharer;

    static {
        Covode.recordClassIndex(59376);
    }
}
