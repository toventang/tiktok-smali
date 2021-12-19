package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.g;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Arrays;

public class BaseNotice {
    public static final int RECOMMEND_LIVE = 50;
    @c(a = "ad")
    public b adHelperNotice;
    @c(a = "announcement")
    public AnnouncementNotice announcement;
    @c(a = "at")
    public AtMe atMe;
    @c(a = "biz_notice")
    public c businessAccountNotice;
    @c(a = "check_profile")
    public CheckProfileNotice checkProfileNotice;
    public transient int clientOrder = -1;
    @c(a = UGCMonitor.EVENT_COMMENT)
    public CommentNotice commentNotice;
    @c(a = "create_time")
    public long createTime;
    @c(a = "digg")
    public DiggNotice diggNotice;
    @c(a = "donation")
    public d donationNotice;
    @c(a = "duet")
    public DuetNotice duetNotice;
    @c(a = "follow_request_approve")
    public FollowApproveNotice followApproveNotice;
    @c(a = "follow")
    public FollowNotice followNotice;
    @c(a = "follow_request")
    public FollowRequestNotice followRequestNotice;
    @c(a = "friend")
    public FriendNotice friendNotice;
    @c(a = "has_read")
    public boolean hasRead;
    public transient long lastReadTime;
    public transient LogPbBean logPbBean;
    @c(a = "lowest_position")
    public int lowestPosition;
    public transient boolean needCollapse;
    @c(a = "nid")
    public String nid;
    public transient int noticeListType;
    @c(a = "create_aweme")
    public PostNotice postNotice;
    public transient int priority;
    @c(a = "promote_notice")
    public j promoteNotice;
    @c(a = "task_id")
    public long taskId;
    @c(a = "tcm_notice")
    public l tcmNotice;
    @c(a = "template_id")
    public String templateId;
    @c(a = "template_notice")
    public e templateNotice;
    @c(a = "text")
    public UserTextNotice textNotice;
    public transient int timeLineType = -1;
    @c(a = StringSet.type)
    public int type;
    public transient int unreadCount;
    @c(a = "user_id")
    public String userId;
    @c(a = "vote_notice")
    public m voteNotice;

    static {
        Covode.recordClassIndex(72515);
    }

    public String getLabelText() {
        DiggNotice diggNotice2 = this.diggNotice;
        if (diggNotice2 != null) {
            return diggNotice2.getLabelText();
        }
        AtMe atMe2 = this.atMe;
        if (atMe2 != null) {
            return atMe2.getLabelText();
        }
        CommentNotice commentNotice2 = this.commentNotice;
        if (commentNotice2 != null) {
            return commentNotice2.getLabelText();
        }
        return "";
    }

    public boolean needForceInsert() {
        int i2 = this.type;
        if ((i2 == 1 || i2 == 2 || i2 == 1002) && this.lowestPosition > 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.type), this.nid, Long.valueOf(this.createTime), Boolean.valueOf(this.hasRead), this.followNotice});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseNotice baseNotice = (BaseNotice) obj;
            if (this.type == baseNotice.type && g.a(this.nid, baseNotice.nid) && this.createTime == baseNotice.createTime && this.hasRead == baseNotice.hasRead && g.a(this.followNotice, baseNotice.followNotice)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
