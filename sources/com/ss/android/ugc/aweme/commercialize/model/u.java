package com.ss.android.ugc.aweme.commercialize.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class u implements Serializable {
    @c(a = "commerce_sticker_id")
    public long commerceStickerId;
    @c(a = "icon_url")
    public UrlModel iconUrl;
    @c(a = "letters")
    public String letters;
    @c(a = "open_url")
    public String openUrl;
    @c(a = "web_url")
    public String webUrl;
    @c(a = "web_url_title")
    public String webUrlTitle;

    static {
        Covode.recordClassIndex(46190);
    }

    public long getCommerceStickerId() {
        return this.commerceStickerId;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLetters() {
        return this.letters;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public String getWebUrlTitle() {
        return this.webUrlTitle;
    }

    public boolean enable() {
        if (this.iconUrl == null || TextUtils.isEmpty(this.letters)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.webUrl) || !TextUtils.isEmpty(this.openUrl)) {
            return true;
        }
        return false;
    }

    public void setCommerceStickerId(long j2) {
        this.commerceStickerId = j2;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLetters(String str) {
        this.letters = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebUrlTitle(String str) {
        this.webUrlTitle = str;
    }
}
