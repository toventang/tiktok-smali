package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b;

import com.bytedance.covode.number.Covode;

public enum f {
    Audience("audience"),
    RoomOwner("roomOwner");
    
    private final String roleStr;

    public final String getRoleStr() {
        return this.roleStr;
    }

    static {
        Covode.recordClassIndex(66985);
    }

    private f(String str) {
        this.roleStr = str;
    }
}
