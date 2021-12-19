package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class SpecialSticker implements Serializable {
    @c(a = "icon_url")
    public UrlModel iconUrl;
    @c(a = "link")
    public String linkUrl;
    @c(a = "open_url")
    public String openUrl;
    @c(a = "sticker_id")
    public String stickerId;
    @c(a = "sticker_type")
    public int stickerType;
    @c(a = "title")
    public String title;

    static {
        Covode.recordClassIndex(59453);
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerType(int i2) {
        this.stickerType = i2;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
