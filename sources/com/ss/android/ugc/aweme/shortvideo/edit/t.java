package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class t implements Serializable {
    @c(a = "appId", b = {"a"})
    String appId;
    @c(a = "appTitle", b = {"b"})
    private String appTitle;
    @c(a = "appUrl", b = {"d"})
    private String appUrl;
    @c(a = "cardCode", b = {"h"})
    private String cardCode;
    @c(a = "cardImage", b = {"g"})
    private String cardImage;
    @c(a = "description", b = {"c"})
    private String description;
    @c(a = "extra", b = {"e"})
    private String extra;
    @c(a = "schema", b = {"f"})
    private String schema;

    static {
        Covode.recordClassIndex(83910);
    }

    public String getAnchorTitle() {
        return this.appTitle;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppTitle() {
        return this.appTitle;
    }

    public String getAppUrl() {
        return this.appUrl;
    }

    public String getCardCode() {
        return this.cardCode;
    }

    public String getCardImage() {
        return this.cardImage;
    }

    public String getDescription() {
        return this.description;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getSchema() {
        return this.schema;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppTitle(String str) {
        this.appTitle = str;
    }

    public void setAppUrl(String str) {
        this.appUrl = str;
    }

    public void setCardCode(String str) {
        this.cardCode = str;
    }

    public void setCardImage(String str) {
        this.cardImage = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }
}
