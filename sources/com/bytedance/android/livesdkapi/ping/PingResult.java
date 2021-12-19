package com.bytedance.android.livesdkapi.ping;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class PingResult {
    @c(a = "mosaic_status")
    private int mosaicStatus;
    @c(a = "next_ping")
    private long nextPingInterval;
    @c(a = "room_id")
    private long roomId;
    @c(a = "room_status")
    private int roomStatus;

    static {
        Covode.recordClassIndex(13848);
    }

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public long getNextPingInterval() {
        return this.nextPingInterval;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public int getRoomStatus() {
        return this.roomStatus;
    }

    public void setMosaicStatus(int i2) {
        this.mosaicStatus = i2;
    }

    public void setRoomId(long j2) {
        this.roomId = j2;
    }

    public void setRoomStatus(int i2) {
        this.roomStatus = i2;
    }
}
