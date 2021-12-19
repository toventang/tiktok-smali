package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class EventDetailData extends BaseResponse {
    @c(a = "event")
    public EventStruct event;
    @c(a = "room_id")
    public String roomId;

    static {
        Covode.recordClassIndex(59371);
    }
}
