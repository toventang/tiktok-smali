package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class CommentItemList extends BaseCommentResponse {
    @c(a = "alias_comment_deleted")
    public boolean aliasCommentDeleted;
    @c(a = "comment_prompt")
    public CommentPrompt commentPrompt = new CommentPrompt();
    @c(a = "cursor")
    public long cursor;
    @c(a = "has_filtered_comments")
    public int hasFilteredComments;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "comments")
    public List<Comment> items;
    @c(a = "new_insert_ids")
    public String newInsertIds;
    @c(a = "reply_style")
    public int replyStyle;
    @c(a = "top_gifts")
    public List<CommentGiftStruct> topGiftList;
    @c(a = "total")
    public long total;

    static {
        Covode.recordClassIndex(44298);
    }

    public boolean hasFilteredComments() {
        if (this.hasFilteredComments == 1) {
            return true;
        }
        return false;
    }
}
