package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.profile.model.User;

public class FriendNotice {
    @c(a = "content")
    private String content;
    @c(a = "schema_url")
    private String openUrl;
    @c(a = StringSet.type)
    private int type;
    @c(a = "from_user")
    private User user;

    static {
        Covode.recordClassIndex(72530);
    }

    public String getContent() {
        return this.content;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public int getType() {
        return this.type;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
