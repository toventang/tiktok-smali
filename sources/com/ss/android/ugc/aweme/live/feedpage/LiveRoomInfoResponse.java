package com.ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;

public final class LiveRoomInfoResponse extends BaseResponse {
    @c(a = "data")
    private NewLiveRoomStruct roomStruct;

    static {
        Covode.recordClassIndex(69439);
    }

    public final NewLiveRoomStruct getRoomStruct() {
        return this.roomStruct;
    }

    public final void setRoomStruct(NewLiveRoomStruct newLiveRoomStruct) {
        this.roomStruct = newLiveRoomStruct;
    }
}
