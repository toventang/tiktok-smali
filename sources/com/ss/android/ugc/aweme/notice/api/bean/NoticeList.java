package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public final class NoticeList extends BaseResponse {
    @c(a = "follow_tab_channel_count")
    private List<Object> followTabChannelCounts;
    @c(a = "groups_in_filters")
    private List<k> groups;
    @c(a = "notice_count")
    private List<NoticeCount> items;
    @c(a = "log_pb")
    private LogPbBean logPb;
    @c(a = "user_id")
    private Long userId;

    static {
        Covode.recordClassIndex(72413);
    }

    public final List<Object> getFollowTabChannelCounts() {
        return this.followTabChannelCounts;
    }

    public final List<k> getGroups() {
        return this.groups;
    }

    public final List<NoticeCount> getItems() {
        return this.items;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final void setFollowTabChannelCounts(List<Object> list) {
        this.followTabChannelCounts = list;
    }

    public final void setGroups(List<k> list) {
        this.groups = list;
    }

    public final void setItems(List<NoticeCount> list) {
        this.items = list;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setUserId(Long l2) {
        this.userId = l2;
    }

    public NoticeList(Long l2, List<NoticeCount> list, LogPbBean logPbBean, List<k> list2, List<Object> list3) {
        this.userId = l2;
        this.items = list;
        this.logPb = logPbBean;
        this.groups = list2;
        this.followTabChannelCounts = list3;
    }
}
