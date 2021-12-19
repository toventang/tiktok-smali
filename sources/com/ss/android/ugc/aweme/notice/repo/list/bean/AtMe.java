package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.emoji.g.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;

public class AtMe {
    @c(a = "aweme")
    Aweme aweme;
    @c(a = "reply_comment")
    Comment comment;
    @c(a = "comment_status")
    int commentStatus = -1;
    @c(a = "content")
    String content;
    @c(a = "sticker")
    a emoji;
    @c(a = "image_url")
    UrlModel imageUrl;
    @c(a = "item_status")
    int itemStatus;
    @c(a = "level1_comment")
    Comment level1Comment;
    @c(a = "label_text")
    private String mLabelText;
    @c(a = "label_type")
    private int mLabelType;
    @c(a = "relation_label")
    RelationDynamicLabel relationLabel;
    @c(a = "schema_url")
    String schemaUrl;
    @c(a = "sub_type")
    int subType;
    @c(a = "title")
    String title;
    @c(a = "user_info")
    User user;

    static {
        Covode.recordClassIndex(72514);
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentStatus() {
        return this.commentStatus;
    }

    public String getContent() {
        return this.content;
    }

    public a getEmoji() {
        return this.emoji;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public int getItemStatus() {
        return this.itemStatus;
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

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getSubType() {
        return this.subType;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setCommentStatus(int i2) {
        this.commentStatus = i2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setEmoji(a aVar) {
        this.emoji = aVar;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setItemStatus(int i2) {
        this.itemStatus = i2;
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

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSubType(int i2) {
        this.subType = i2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
