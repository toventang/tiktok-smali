package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class RoomExtra implements Serializable {
    @c(a = "config")
    public RoomConfig config;
    @c(a = "with_promotion")
    public boolean withPromotion;

    static {
        Covode.recordClassIndex(59510);
    }

    public RoomConfig getConfig() {
        return this.config;
    }

    public void setConfig(RoomConfig roomConfig) {
        this.config = roomConfig;
    }
}
