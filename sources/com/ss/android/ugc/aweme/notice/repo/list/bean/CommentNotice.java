package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class CommentNotice implements Serializable {
    @c(a = "aweme")
    Aweme aweme;
    @c(a = UGCMonitor.EVENT_COMMENT)
    Comment comment;
    @c(a = "comment_type")
    int commentType;
    @c(a = "content")
    String content;
    @c(a = "forward_id")
    String forwardId;
    @c(a = "level1_comment")
    Comment level1Comment;
    @c(a = "label_text")
    private String mLabelText;
    @c(a = "label_type")
    private int mLabelType;
    @c(a = "parent_id")
    String parentId;
    @c(a = "relation_label")
    RelationDynamicLabel relationLabel;
    @c(a = "reply_comment")
    Comment replyComment;

    static {
        Covode.recordClassIndex(72519);
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentType() {
        return this.commentType;
    }

    public String getContent() {
        return this.content;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getLabelType() {
        return this.mLabelType;
    }

    public Comment getLevel1Comment() {
        return this.level1Comment;
    }

    public String getParentId() {
        return this.parentId;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public Comment getReplyComment() {
        return this.replyComment;
    }

    public boolean isReplyWithVideo() {
        int i2 = this.commentType;
        if (i2 == 17 || i2 == 18 || i2 == 19) {
            return true;
        }
        return false;
    }

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final List<Integer> f112829a = Arrays.asList(23, 24, 25, 26, 27);

        static {
            Covode.recordClassIndex(72520);
        }
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setCommentType(int i2) {
        this.commentType = i2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setLabelType(int i2) {
        this.mLabelType = i2;
    }

    public void setLevel1Comment(Comment comment2) {
        this.level1Comment = comment2;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyComment(Comment comment2) {
        this.replyComment = comment2;
    }
}
