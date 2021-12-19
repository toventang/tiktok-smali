package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class VideoUpdateTipsContent extends BaseContent {
    @c(a = "tip_aid")
    String aid;
    @c(a = "tip_content")
    String content;
    @c(a = "tip_cover")
    UrlModel cover;
    @c(a = "is_photo")
    boolean isPhoto;
    @c(a = "tip_title")
    String title;
    @c(a = "tip_uid")
    String uid;

    static {
        Covode.recordClassIndex(64095);
    }

    public String getAid() {
        return this.aid;
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isPhoto() {
        return this.isPhoto;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setPhoto(boolean z) {
        this.isPhoto = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
