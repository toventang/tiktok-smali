package com.bytedance.android.livesdk.ab.a;

import com.bytedance.covode.number.Covode;

public enum b {
    Room("ttlive_room"),
    Gift("ttlive_gift"),
    PushStream("ttlive_pushstream"),
    PullStream("ttlive_pullstream"),
    Net("ttlive_net"),
    Click("ttlive_click"),
    Feed("ttlive_feed"),
    Msg("ttlive_msg"),
    Exception("ttlive_exception"),
    Page("ttlive_page"),
    Recharge("ttlive_recharge"),
    Pk("ttlive_pk"),
    Screen_Shot("ttlive_screenshot");
    
    public String info;

    static {
        Covode.recordClassIndex(7469);
    }

    private b(String str) {
        this.info = str;
    }
}
