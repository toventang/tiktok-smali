package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;

public class AnnouncementNotice {
    @c(a = "challenge")
    Challenge challenge;
    @c(a = "content")
    String content;
    @c(a = "image_url")
    UrlModel imageUrl;
    @c(a = "object_id")
    String objectId;
    @c(a = "schema_url")
    String schemaUrl;
    @c(a = "search")
    Search search;
    @c(a = "task_id")
    long taskId;
    @c(a = "title")
    String title;
    @c(a = StringSet.type)
    int type;

    static {
        Covode.recordClassIndex(72513);
    }

    public Challenge getChallenge() {
        return this.challenge;
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

    public Search getSearch() {
        return this.search;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
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

    public void setSearch(Search search2) {
        this.search = search2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }
}
