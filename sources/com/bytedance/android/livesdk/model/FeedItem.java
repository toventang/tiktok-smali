package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.l;
import com.google.gson.o;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public class FeedItem {
    public transient JSONObject adJSONObject;
    @c(a = "banner")
    public o bannerContainer;
    public transient List<n> banners;
    @c(a = "data")
    o data;
    @c(a = "debug_info")
    public String debugInfo;
    @c(a = "is_recommend_card")
    public boolean isRecommendCard;
    public transient ag item;
    @c(a = "live_reason")
    public String liveReason;
    public transient String logPb;
    public transient Object object;
    public transient boolean repeatDisable;
    @c(a = "rid")
    public String resId;
    transient Room room;
    public transient String searchId = "";
    public transient String searchReqId = "";
    @c(a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(11274);
    }

    public ag item() {
        return this.item;
    }

    public String logPb() {
        return this.logPb;
    }

    public String requestId() {
        return this.resId;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.item});
    }

    public String toString() {
        ag agVar = this.item;
        if (agVar == null) {
            return "null";
        }
        return agVar.toString();
    }

    public Room getRoom() {
        Room room2 = this.room;
        if (room2 != null) {
            return room2;
        }
        Room room3 = (Room) e.a.f9628b.a((l) this.data, Room.class);
        this.room = room3;
        return room3;
    }

    public void init() {
        int i2 = this.type;
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5) {
            this.item = getRoom();
        }
    }

    public void setRoom(Room room2) {
        this.room = room2;
    }

    public void setRoomFrom(FeedItem feedItem) {
        this.data = feedItem.data;
        this.room = feedItem.room;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ag agVar = this.item;
        ag agVar2 = ((FeedItem) obj).item;
        if (agVar == agVar2 || (agVar != null && agVar.equals(agVar2))) {
            return true;
        }
        return false;
    }

    public static FeedItem create(int i2, ag agVar) {
        FeedItem feedItem = new FeedItem();
        feedItem.type = i2;
        feedItem.item = agVar;
        return feedItem;
    }

    public static FeedItem create(int i2, ag agVar, String str, String str2) {
        FeedItem feedItem = new FeedItem();
        feedItem.type = i2;
        feedItem.item = agVar;
        feedItem.logPb = str;
        feedItem.resId = str2;
        return feedItem;
    }
}
