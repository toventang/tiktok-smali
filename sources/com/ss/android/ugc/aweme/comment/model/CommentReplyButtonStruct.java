package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class CommentReplyButtonStruct extends Comment {
    private String mCommentId;
    private long mCursor;
    private int mExpandSize;
    private boolean mHasMore = true;
    private int mStatus;
    private String mTopIds = "";
    private int mTopSize;

    static {
        Covode.recordClassIndex(44303);
    }

    public int getButtonStatus() {
        return this.mStatus;
    }

    public String getCommentId() {
        return this.mCommentId;
    }

    public long getCursor() {
        return this.mCursor;
    }

    public int getExpandSize() {
        return this.mExpandSize;
    }

    public String getTopIds() {
        return this.mTopIds;
    }

    public int getTopSize() {
        return this.mTopSize;
    }

    public boolean isHasMore() {
        return this.mHasMore;
    }

    public void setButtonStatus(int i2) {
        this.mStatus = i2;
    }

    public void setCursor(long j2) {
        this.mCursor = j2;
    }

    public void setHasMore(boolean z) {
        this.mHasMore = z;
    }

    @Override // com.ss.android.ugc.aweme.comment.model.Comment
    public void setReplyCommentTotal(long j2) {
        this.replyCommentTotal = j2;
    }

    public void addExpandSize(int i2) {
        this.mExpandSize += i2;
    }

    public void setExpandSize(int i2) {
        this.mExpandSize = Math.max(i2, 0);
    }

    public void setTopSize(int i2) {
        this.mTopSize = Math.max(i2, 0);
    }

    @Override // com.ss.android.ugc.aweme.comment.model.Comment
    public void setReplyComments(List<Comment> list) {
        if (this.replyComments == null) {
            this.replyComments = new ArrayList();
        } else {
            this.replyComments.clear();
        }
        this.replyComments.addAll(list);
    }

    public CommentReplyButtonStruct(Comment comment, int i2) {
        setCommentType(11);
        this.mCommentId = comment.getCid();
        this.cid = String.valueOf(i2);
        if (comment.getReplyComments() != null) {
            int size = comment.getReplyComments().size();
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 > 0) {
                    sb.append(",");
                }
                sb.append(comment.getReplyComments().get(i3).getCid());
            }
            this.mTopIds = sb.toString();
            Integer topCount = comment.getTopCount();
            if (topCount != null) {
                this.mTopSize = topCount.intValue();
            } else {
                this.mTopSize = size;
            }
            this.mCursor = (long) Math.max(0, size - 1);
            this.mExpandSize = size;
        }
        setReplyCommentTotal(comment.getReplyCommentTotal());
    }
}
