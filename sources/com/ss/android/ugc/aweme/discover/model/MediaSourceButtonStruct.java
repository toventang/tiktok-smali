package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class MediaSourceButtonStruct implements Serializable {
    @c(a = "aid")
    private String aid;
    @c(a = "button_type")
    private int buttonType = 1;
    @c(a = "eid")
    private String eid;
    @c(a = "icon")
    private final UrlModel icon;
    @c(a = "has_perchase_url")
    private boolean isBuy;
    @c(a = StringSet.name)
    private final String name = "";
    @c(a = "schema")
    private String schema = "";

    static {
        Covode.recordClassIndex(50913);
    }

    public final String getAid() {
        return this.aid;
    }

    public final int getButtonType() {
        return this.buttonType;
    }

    public final String getEid() {
        return this.eid;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final boolean isBuy() {
        return this.isBuy;
    }

    public final boolean isOrigin() {
        if (this.buttonType == 1) {
            return true;
        }
        return false;
    }

    public final boolean isMiniApp() {
        if (this.buttonType == 2) {
            return true;
        }
        return false;
    }

    public final boolean isMix() {
        if (this.buttonType == 3) {
            return true;
        }
        return false;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setButtonType(int i2) {
        this.buttonType = i2;
    }

    public final void setBuy(boolean z) {
        this.isBuy = z;
    }

    public final void setEid(String str) {
        this.eid = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }
}
