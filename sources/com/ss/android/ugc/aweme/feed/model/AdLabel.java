package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class AdLabel implements Serializable {
    @c(a = "ad_label_name")
    private String adLabelName;
    @c(a = "ad_label_position")
    private Integer adLabelPosition;

    static {
        Covode.recordClassIndex(59290);
    }

    public final String getAdLabelName() {
        return this.adLabelName;
    }

    public final Integer getAdLabelPosition() {
        return this.adLabelPosition;
    }

    public final String toString() {
        return "AdLabel(adLabelName=" + this.adLabelName + ", adLabelPosition=" + this.adLabelPosition + ')';
    }

    public final void setAdLabelName(String str) {
        this.adLabelName = str;
    }

    public final void setAdLabelPosition(Integer num) {
        this.adLabelPosition = num;
    }
}
