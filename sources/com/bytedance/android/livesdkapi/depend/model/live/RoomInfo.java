package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class RoomInfo {
    @c(a = "anchorId", b = {"anchor_id"})
    private String anchorId;
    @c(a = "roomId", b = {"room_id"})
    private long roomId;

    static {
        Covode.recordClassIndex(13657);
    }

    public RoomInfo() {
    }

    public String getAnchorId() {
        return this.anchorId;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public void setAnchorId(String str) {
        this.anchorId = str;
    }

    public void setRoomId(long j2) {
        this.roomId = j2;
    }

    public RoomInfo(long j2) {
        this.roomId = j2;
    }

    public RoomInfo(long j2, String str) {
        this.roomId = j2;
        this.anchorId = str;
    }
}
