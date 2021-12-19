package com.ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class FriendTabStruct {
    @c(a = "default_follow_tab")
    public boolean defaultFollowTab;
    @c(a = "friend_tab_desc")
    public String friendTabDesc;

    static {
        Covode.recordClassIndex(80201);
    }

    public FriendTabStruct setDefaultFollowTab(boolean z) {
        this.defaultFollowTab = z;
        return this;
    }

    public FriendTabStruct setFriendTabDesc(String str) {
        this.friendTabDesc = str;
        return this;
    }
}
