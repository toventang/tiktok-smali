package com.bytedance.android.live.base.model.share;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ShareSourceInfo {
    @c(a = "app_name")
    private String appName;
    @c(a = "img_title")
    private String imgTitle;
    @c(a = "img_url")
    private ImageModel imgUrl;
    @c(a = "pkg_name")
    private String pkgName;
    @c(a = "schema_url")
    private String schemaUrl;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(3623);
    }

    public String getAppName() {
        return this.appName;
    }

    public String getImgTitle() {
        return this.imgTitle;
    }

    public ImageModel getImgUrl() {
        return this.imgUrl;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setImgTitle(String str) {
        this.imgTitle = str;
    }

    public void setImgUrl(ImageModel imageModel) {
        this.imgUrl = imageModel;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
