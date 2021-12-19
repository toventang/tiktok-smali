package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class FollowerDetail implements Serializable {
    @c(a = "app_name")
    public String appName;
    @c(a = "apple_id")
    public String appleId;
    @c(a = "download_url")
    public String downloadUrl;
    @c(a = "fans_count")
    public int fansCount;
    @c(a = "icon")
    public String icon;
    @c(a = StringSet.name)
    public String name;
    @c(a = "open_url")
    public String openUrl;
    @c(a = "package_name")
    public String packageName;

    static {
        Covode.recordClassIndex(75223);
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAppleId() {
        return this.appleId;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public int getFansCount() {
        return this.fansCount;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppleId(String str) {
        this.appleId = str;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setFansCount(int i2) {
        this.fansCount = i2;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}
