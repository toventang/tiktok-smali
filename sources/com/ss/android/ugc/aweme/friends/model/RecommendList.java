package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.follow.c.a.a.a;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RecommendList extends BaseResponse implements Serializable {
    @c(a = "cursor")
    int cursor;
    @c(a = "has_more")
    boolean hasMore;
    @c(a = "inviters")
    List<User> inviterList;
    @c(a = "log_pb")
    LogPbBean logPb;
    @c(a = "new_user_count")
    int newUserCount;
    @c(a = "user_extra_list")
    List<a> recommendFollowList;
    @c(a = "rid")
    private String rid;
    @c(a = "total")
    int totalCount;
    @c(a = "user_list")
    List<User> userList;

    static {
        Covode.recordClassIndex(61597);
    }

    public int getCursor() {
        return this.cursor;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public int getNewUserCount() {
        return this.newUserCount;
    }

    public List<a> getRecommendFollowList() {
        return this.recommendFollowList;
    }

    public String getRid() {
        return this.rid;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public List<User> getInviterList() {
        if (this.inviterList == null) {
            this.inviterList = new ArrayList(0);
        }
        return this.inviterList;
    }

    public List<User> getUserList() {
        if (this.userList == null) {
            this.userList = new ArrayList(0);
        }
        return this.userList;
    }

    @Override // java.lang.Object
    public RecommendList clone() {
        RecommendList recommendList = new RecommendList();
        ArrayList arrayList = new ArrayList();
        if (!b.a((Collection) this.userList)) {
            for (User user : this.userList) {
                if (user != null) {
                    arrayList.add(user.clone());
                }
            }
        }
        recommendList.userList = arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (!b.a((Collection) this.recommendFollowList)) {
            for (a aVar : this.recommendFollowList) {
                if (aVar != null) {
                    arrayList2.add(aVar.clone());
                }
            }
        }
        recommendList.recommendFollowList = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        if (!b.a((Collection) this.inviterList)) {
            for (User user2 : this.inviterList) {
                if (user2 != null) {
                    arrayList3.add(user2.clone());
                }
            }
        }
        recommendList.inviterList = arrayList3;
        recommendList.rid = this.rid;
        recommendList.cursor = this.cursor;
        recommendList.hasMore = this.hasMore;
        recommendList.totalCount = this.totalCount;
        recommendList.newUserCount = this.newUserCount;
        recommendList.extra = this.extra;
        recommendList.status_code = this.status_code;
        recommendList.status_msg = this.status_msg;
        recommendList.error_code = this.error_code;
        recommendList.logPb = this.logPb;
        return recommendList;
    }

    public void setCursor(int i2) {
        this.cursor = i2;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setInviterList(List<User> list) {
        this.inviterList = list;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setRecommendFollowList(List<a> list) {
        this.recommendFollowList = list;
    }

    public void setRid(String str) {
        this.rid = str;
    }

    public void setTotalCount(int i2) {
        this.totalCount = i2;
    }

    public void setUserList(List<User> list) {
        this.userList = list;
    }
}
