package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class UrgeStruct implements Serializable {
    @c(a = "block_urge_setting")
    private int blockUrgeSetting;
    @c(a = "latest_aweme_time")
    private long latestAwemeTime;
    @c(a = "latest_room_time")
    private long latestRoomTime;
    @c(a = "urge_unread_count")
    private long urgeUnreadCount;
    @c(a = "user_urged")
    private int userUrged;

    static {
        Covode.recordClassIndex(75268);
    }

    public int getBlockUrgeSetting() {
        return this.blockUrgeSetting;
    }

    public long getLatestAwemeTime() {
        return this.latestAwemeTime;
    }

    public long getLatestRoomTime() {
        return this.latestRoomTime;
    }

    public long getUrgeUnreadCount() {
        return this.urgeUnreadCount;
    }

    public int getUserUrged() {
        return this.userUrged;
    }

    public boolean shouldHostShowTip() {
        if (this.blockUrgeSetting != 0 || this.urgeUnreadCount <= 0) {
            return false;
        }
        return true;
    }

    public void setBlockUrgeSetting(int i2) {
        this.blockUrgeSetting = i2;
    }

    public void setLatestAwemeTime(long j2) {
        this.latestAwemeTime = j2;
    }

    public void setLatestRoomTime(long j2) {
        this.latestRoomTime = j2;
    }

    public void setUrgeUnreadCount(long j2) {
        this.urgeUnreadCount = j2;
    }

    public void setUserUrged(int i2) {
        this.userUrged = i2;
    }
}
