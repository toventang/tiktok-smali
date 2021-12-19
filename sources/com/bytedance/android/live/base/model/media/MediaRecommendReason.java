package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public class MediaRecommendReason {
    @c(a = "city")
    private String city;
    @c(a = "friend_name")
    private String friendName;
    @c(a = "reason")
    private String reason;
    @c(a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(3611);
    }

    public String getCity() {
        return this.city;
    }

    public String getFriendName() {
        return this.friendName;
    }

    public String getReason() {
        return this.reason;
    }

    public int getType() {
        return this.type;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setFriendName(String str) {
        this.friendName = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }
}
