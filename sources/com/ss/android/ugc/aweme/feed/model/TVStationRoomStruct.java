package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class TVStationRoomStruct implements Serializable {
    @c(a = "is_idle")
    public boolean isIdle;
    @c(a = "state_desc")
    public String statesDesc;

    static {
        Covode.recordClassIndex(59457);
    }
}
