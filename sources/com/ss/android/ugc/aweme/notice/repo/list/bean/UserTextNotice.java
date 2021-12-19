package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

public class UserTextNotice {
    @c(a = "content")
    String content;
    @c(a = "image_url")
    UrlModel imageUrl;
    @c(a = "object_id")
    String objectId;
    @c(a = "schema_url")
    String schemaUrl;
    @c(a = "sub_type")
    int subType;
    @c(a = "task_id")
    long taskId;
    @c(a = "title")
    String title;
    @c(a = "user_info")
    User user;

    static {
        Covode.recordClassIndex(72544);
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getSubType() {
        return this.subType;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setObjectId(String str) {
        this.objectId = str;
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
