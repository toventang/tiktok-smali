package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class EventRegisterData extends BaseResponse {
    public String aid;
    @c(a = "sharer_info")
    public EventRegister eventRegister;

    static {
        Covode.recordClassIndex(59486);
    }
}
