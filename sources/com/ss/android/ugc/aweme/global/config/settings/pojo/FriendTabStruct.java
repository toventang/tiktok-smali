package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class FriendTabStruct {
    @c(a = "default_follow_tab")
    private Boolean defaultFollowTab;
    @c(a = "friend_tab_desc")
    private String friendTabDesc;

    static {
        Covode.recordClassIndex(63040);
    }

    public Boolean getDefaultFollowTab() {
        Boolean bool = this.defaultFollowTab;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public String getFriendTabDesc() {
        String str = this.friendTabDesc;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
