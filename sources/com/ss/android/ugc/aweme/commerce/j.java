package com.ss.android.ugc.aweme.commerce;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class j implements Serializable {
    @c(a = "action")
    public String action;
    @c(a = "link_type")
    public String linkType;
    @c(a = "offline_info_type")
    public int offlineInfoType;
    @c(a = "offline_subtype")
    public int offlineSubtype;
    @c(a = "text")
    public String text;

    static {
        Covode.recordClassIndex(45200);
    }

    public String getAction() {
        return this.action;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public int getOfflineInfoType() {
        return this.offlineInfoType;
    }

    public int getOfflineSubtype() {
        return this.offlineSubtype;
    }

    public String getText() {
        return this.text;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setLinkType(String str) {
        this.linkType = str;
    }

    public void setOfflineInfoType(int i2) {
        this.offlineInfoType = i2;
    }

    public void setOfflineSubtype(int i2) {
        this.offlineSubtype = i2;
    }

    public void setText(String str) {
        this.text = str;
    }
}
