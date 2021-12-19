package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class HotListStruct implements Serializable {
    @c(a = "footer")
    public String footer;
    @c(a = "header")
    public String header;
    @c(a = "image_url")
    public String imageUrl;
    @c(a = "schema")
    public String schema;
    @c(a = "title")
    public String titile;
    @c(a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(75229);
    }

    public String getFooter() {
        return this.footer;
    }

    public String getHeader() {
        return this.header;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitile() {
        return this.titile;
    }

    public int getType() {
        return this.type;
    }

    public boolean isLocalHot() {
        if (this.type == 9) {
            return true;
        }
        return false;
    }

    public void setFooter(String str) {
        this.footer = str;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitile(String str) {
        this.titile = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }
}
