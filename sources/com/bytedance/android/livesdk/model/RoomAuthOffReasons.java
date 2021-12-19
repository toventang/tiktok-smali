package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class RoomAuthOffReasons {
    @c(a = "gift")
    String gift;
    @c(a = "gift_off_reason")
    int unAvailableClickReason;

    static {
        Covode.recordClassIndex(11288);
    }

    public String getGift() {
        return this.gift;
    }

    public az getUnAvailableClickReason() {
        return az.parseEnum(this.unAvailableClickReason);
    }
}
