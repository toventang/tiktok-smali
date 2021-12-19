package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public abstract class AbsShareWebContent extends BaseContent {
    @c(a = "desc")
    protected String desc;
    @c(a = "cover_url")
    protected String image;
    @c(a = "push_detail")
    protected String pushDetail;
    @c(a = "title")
    protected String title;
    @c(a = "link_url")
    protected String url;

    static {
        Covode.recordClassIndex(64017);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public abstract String getMsgHint();

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public abstract String wrapMsgHint(boolean z, boolean z2, String str);

    public String getDesc() {
        return this.desc;
    }

    public String getImage() {
        return this.image;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
