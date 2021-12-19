package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class ItemCommentEggData implements Serializable {
    @c(a = "egg_id")
    String eggId;
    @c(a = "file_type")
    String fileType;
    @c(a = "material_url")
    String materialUrl;
    @c(a = "open_url")
    String openUrl;
    @c(a = "regex")
    String regex;
    @c(a = "web_url")
    String webUrl;

    static {
        Covode.recordClassIndex(59411);
    }

    public String getEggId() {
        return this.eggId;
    }

    public String getFileType() {
        return this.fileType;
    }

    public String getMaterialUrl() {
        return this.materialUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getRegex() {
        return this.regex;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public String toString() {
        return "ItemCommentEggData{regex='" + this.regex + '\'' + ", fileType='" + this.fileType + '\'' + ", webUrl='" + this.webUrl + '\'' + ", openUrl='" + this.openUrl + '\'' + ", materialUrl='" + this.materialUrl + '\'' + ", eggId='" + this.eggId + '\'' + '}';
    }

    public void setEggId(String str) {
        this.eggId = str;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setMaterialUrl(String str) {
        this.materialUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setRegex(String str) {
        this.regex = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
