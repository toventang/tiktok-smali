package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;

public class RoomStats implements ad {
    final int INT_31 = 31;
    final int INT_32 = 32;
    @c(a = "enter_count")
    int enterCount;
    @c(a = "follow_count")
    int followCount;
    @c(a = "gift_uv_count")
    int giftUVCount;
    @c(a = "id")
    long id;
    @c(a = "id_str")
    String idStr;
    @c(a = "replay_viewers")
    public int replayViewers;
    @c(a = "share_count")
    int shareCount;
    @c(a = "fan_ticket")
    long ticket;
    @c(a = "total_user")
    int totalUser;
    @c(a = "watermelon")
    int watermelon;

    static {
        Covode.recordClassIndex(11290);
    }

    public int getEnterCount() {
        return this.enterCount;
    }

    @Override // com.bytedance.android.livesdk.model.ad
    public int getFollowCount() {
        return this.followCount;
    }

    @Override // com.bytedance.android.livesdk.model.ad
    public int getGiftUVCount() {
        return this.giftUVCount;
    }

    @Override // com.bytedance.android.livesdk.model.ad
    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    @Override // com.bytedance.android.livesdk.model.ad
    public long getTicket() {
        return this.ticket;
    }

    @Override // com.bytedance.android.livesdk.model.ad
    public int getTotalUser() {
        return this.totalUser;
    }

    public int getWatermelon() {
        return this.watermelon;
    }

    public int hashCode() {
        int i2;
        long j2 = this.id;
        long j3 = this.ticket;
        int i3 = ((((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.totalUser) * 31) + this.followCount) * 31) + this.giftUVCount) * 31;
        String str = this.idStr;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return i3 + i2;
    }

    public void setEnterCount(int i2) {
        this.enterCount = i2;
    }

    public void setFollowCount(int i2) {
        this.followCount = i2;
    }

    public void setGiftUVCount(int i2) {
        this.giftUVCount = i2;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setShareCount(int i2) {
        this.shareCount = i2;
    }

    public void setTicket(long j2) {
        this.ticket = j2;
    }

    public void setTotalUser(int i2) {
        this.totalUser = i2;
    }

    public void setWatermelon(int i2) {
        this.watermelon = i2;
    }

    public static RoomStats from(ad adVar) {
        if (adVar == null) {
            return null;
        }
        if (adVar instanceof RoomStats) {
            f fVar = e.a.f9628b;
            return (RoomStats) fVar.a(fVar.b(adVar), RoomStats.class);
        }
        RoomStats roomStats = new RoomStats();
        roomStats.initWith(adVar);
        return roomStats;
    }

    private void initWith(ad adVar) {
        this.id = adVar.getId();
        this.ticket = adVar.getTicket();
        this.totalUser = adVar.getTotalUser();
        this.followCount = adVar.getFollowCount();
        this.giftUVCount = adVar.getGiftUVCount();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RoomStats roomStats = (RoomStats) obj;
            if (this.id != roomStats.id || this.ticket != roomStats.ticket || this.followCount != roomStats.followCount || this.giftUVCount != roomStats.giftUVCount) {
                return false;
            }
            String str = this.idStr;
            if (str == null ? roomStats.idStr != null : !str.equals(roomStats.idStr)) {
                return false;
            }
            if (this.totalUser == roomStats.totalUser) {
                return true;
            }
        }
        return false;
    }
}
