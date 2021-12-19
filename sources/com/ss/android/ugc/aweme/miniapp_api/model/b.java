package com.ss.android.ugc.aweme.miniapp_api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class b implements Serializable {
    @c(a = "app_id")
    public String appId;
    @c(a = "description")
    public String desc;
    @c(a = "icon")
    public String icon;
    @c(a = "card")
    public c miniAppCard;
    @c(a = "app_name")
    public String name;
    @c(a = "orientation")
    public int orientation;
    @c(a = "schema")
    public String schema;
    @c(a = "state")
    public int state;
    @c(a = "summary")
    public String summary;
    @c(a = "title")
    public String title;
    @c(a = StringSet.type)
    public int type;
    @c(a = "web_url")
    public String webUrl;

    static {
        Covode.recordClassIndex(70219);
    }

    public String getAppId() {
        return this.appId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public c getMiniAppCard() {
        return this.miniAppCard;
    }

    public String getName() {
        return this.name;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getState() {
        return this.state;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isApp() {
        int i2 = this.type;
        if (i2 == 1 || i2 == 3) {
            return true;
        }
        return false;
    }

    public boolean isGame() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setMiniAppCard(c cVar) {
        this.miniAppCard = cVar;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOrientation(int i2) {
        this.orientation = i2;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setState(int i2) {
        this.state = i2;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
