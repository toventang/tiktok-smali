package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class ShortTouchItem implements Serializable {
    @c(a = "fc_second")
    public long fcSecond;
    @c(a = "height")
    public long height;
    @c(a = "left_margin")
    public long leftMargin;
    @c(a = StringSet.name)
    public String name;
    @c(a = "preview_setting")
    public aw previewSetting;
    @c(a = "schema")
    public String schema;
    @c(a = "top_margin")
    public long topMargin;
    @c(a = "width")
    public long width;

    static {
        Covode.recordClassIndex(11291);
    }

    public long getFcSecond() {
        return this.fcSecond;
    }

    public long getHeight() {
        return this.height;
    }

    public long getLeftMargin() {
        return this.leftMargin;
    }

    public String getName() {
        return this.name;
    }

    public aw getPreviewSetting() {
        return this.previewSetting;
    }

    public String getSchema() {
        return this.schema;
    }

    public long getTopMargin() {
        return this.topMargin;
    }

    public long getWidth() {
        return this.width;
    }

    public void setFcSecond(long j2) {
        this.fcSecond = j2;
    }

    public void setHeight(long j2) {
        this.height = j2;
    }

    public void setLeftMargin(long j2) {
        this.leftMargin = j2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPreviewSetting(aw awVar) {
        this.previewSetting = awVar;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTopMargin(long j2) {
        this.topMargin = j2;
    }

    public void setWidth(long j2) {
        this.width = j2;
    }
}
