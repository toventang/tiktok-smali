package com.ss.android.ugc.aweme.ecommercelive.business.common.b;

import com.bytedance.covode.number.Covode;

public enum g {
    Audience("audience"),
    RoomOwner("roomOwner");
    
    private final String roleStr;

    public final String getRoleStr() {
        return this.roleStr;
    }

    static {
        Covode.recordClassIndex(55315);
    }

    private g(String str) {
        this.roleStr = str;
    }
}
