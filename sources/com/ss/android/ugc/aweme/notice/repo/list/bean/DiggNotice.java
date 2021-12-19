package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

public class DiggNotice implements Serializable {
    @c(a = "aweme")
    Aweme aweme;
    @c(a = "cid")
    String cid;
    @c(a = UGCMonitor.EVENT_COMMENT)
    Comment comment;
    @c(a = "content")
    String content;
    @c(a = "digg_type")
    int diggType;
    @c(a = "forward_id")
    String forwardId;
    @c(a = "has_digg_list")
    Boolean hasDiggList;
    @c(a = "label_text")
    private String mLabelText;
    @c(a = "merge_count")
    int mergeCount;
    @c(a = "relation_label")
    RelationDynamicLabel relationLabel;
    @c(a = "from_user")
    List<User> users;

    static {
        Covode.recordClassIndex(72521);
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getCid() {
        return this.cid;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getContent() {
        return this.content;
    }

    public int getDiggType() {
        return this.diggType;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public Boolean getHasDiggList() {
        return this.hasDiggList;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getMergeCount() {
        return this.mergeCount;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDiggType(int i2) {
        this.diggType = i2;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setMergeCount(int i2) {
        this.mergeCount = i2;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setUsers(List<User> list) {
        this.users = list;
    }

    public DiggNotice(DiggNotice diggNotice) {
        this.aweme = diggNotice.aweme;
        this.users = diggNotice.users;
        this.content = diggNotice.content;
        this.mergeCount = diggNotice.mergeCount;
        this.diggType = diggNotice.diggType;
        this.cid = diggNotice.cid;
        this.relationLabel = diggNotice.relationLabel;
        this.forwardId = diggNotice.forwardId;
        this.mLabelText = diggNotice.mLabelText;
    }
}
