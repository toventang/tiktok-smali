package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

public class FriendList<T extends User> extends BaseResponse implements Serializable {
    @c(a = "cursor")
    int cursor;
    @c(a = "social_users", b = {"user_list"})
    List<T> friends;
    @c(a = "has_more")
    boolean hasMore;
    @c(a = "log_pb")
    LogPbBean logPbBean;
    @c(a = "register_count")
    int registerCount;
    @c(a = "total_count")
    int total;
    @c(a = StringSet.type)
    int type;
    @c(a = "unregistered_user")
    List<UnRegisteredUser> unregisteredUser;

    static {
        Covode.recordClassIndex(61574);
    }

    public int getCursor() {
        return this.cursor;
    }

    public List<T> getFriends() {
        return this.friends;
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public int getRegisterCount() {
        return this.registerCount;
    }

    public int getTotalCount() {
        return this.total;
    }

    public int getType() {
        return this.type;
    }

    public List<UnRegisteredUser> getUnregisteredUser() {
        return this.unregisteredUser;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setCursor(int i2) {
        this.cursor = i2;
    }

    public void setFriends(List<T> list) {
        this.friends = list;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    public void setRegisterCount(int i2) {
        this.registerCount = i2;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setUnregisteredUser(List<UnRegisteredUser> list) {
        this.unregisteredUser = list;
    }
}
