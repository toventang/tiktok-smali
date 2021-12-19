package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class RoomStruct implements Serializable {
    @c(a = "height")
    public int height;
    @c(a = "live_type_audio")
    public boolean liveTypeAudio;
    @c(a = "room_id")
    public long roomId;
    @c(a = "tv_station_room")
    public TVStationRoomStruct tvStationRoomStruct;
    @c(a = "user_count")
    private int userCount;
    @c(a = "width")
    public int width;
    @c(a = "with_linkmic")
    public boolean withLinkmic;

    static {
        Covode.recordClassIndex(59451);
    }

    public int getUserCount() {
        return this.userCount;
    }

    public void setUserCount(int i2) {
        this.userCount = i2;
    }
}
