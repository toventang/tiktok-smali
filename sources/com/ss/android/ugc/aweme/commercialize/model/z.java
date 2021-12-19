package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class z implements Serializable {
    @c(a = "easter_egg_id")
    String id;
    @c(a = "is_h5")
    boolean isH5;
    @c(a = "easter_egg_name")
    String name;
    @c(a = "open_url")
    String openUrl;
    @c(a = "source_type")
    String sourceType;
    @c(a = "source_url")
    UrlModel sourceUrl;
    @c(a = "web_title")
    String webTitle;
    @c(a = "web_url")
    String webUrl;

    static {
        Covode.recordClassIndex(46195);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public UrlModel getSourceUrl() {
        return this.sourceUrl;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isH5() {
        return this.isH5;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setSourceUrl(UrlModel urlModel) {
        this.sourceUrl = urlModel;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
