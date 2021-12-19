package com.ss.android.ugc.aweme.commercialize.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "dislike_url")
    private String adxUrl;
    @com.google.gson.a.c(a = "label_clickable")
    private boolean labelClickable;
    @com.google.gson.a.c(a = StringSet.name)
    private String name;

    static {
        Covode.recordClassIndex(46165);
    }

    public final String getAdxUrl() {
        return this.adxUrl;
    }

    public final boolean getLabelClickable() {
        return this.labelClickable;
    }

    public final String getName() {
        return this.name;
    }

    public final void setAdxUrl(String str) {
        this.adxUrl = str;
    }

    public final void setLabelClickable(boolean z) {
        this.labelClickable = z;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getDislikeUrl(int i2) {
        if (!TextUtils.isEmpty(this.adxUrl)) {
            return this.adxUrl + "&is_long_press=" + i2;
        }
        return null;
    }
}
