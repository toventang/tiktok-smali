package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class ab implements Serializable {
    @c(a = "appleid")
    private String appleId;
    @c(a = "enable")
    private boolean enable;
    @c(a = "open_url")
    private String openUrl;
    @c(a = "package")
    private String packageName;
    @c(a = "web_title")
    private String webTitle;
    @c(a = "web_url")
    private String webUrl;

    static {
        Covode.recordClassIndex(46146);
    }

    public final String getAppleId() {
        return this.appleId;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getWebTitle() {
        return this.webTitle;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setAppleId(String str) {
        this.appleId = str;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setPackageName(String str) {
        this.packageName = str;
    }

    public final void setWebTitle(String str) {
        this.webTitle = str;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
