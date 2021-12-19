package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class AwemeTextLabelModel implements Serializable {
    @c(a = b.f37372a)
    public String bgColor;
    @c(a = "by_source")
    public String bySource;
    @c(a = "by_text")
    public String byText;
    @c(a = "by_uid")
    public long byUid;
    @c(a = "text")
    public String labelName;
    @c(a = StringSet.type)
    public int labelType;
    @c(a = "show_seconds")
    public float showSeconds;
    @c(a = "color_text")
    public String textColor;
    @c(a = "white_color")
    public String whiteBgColor;
    @c(a = "white_color_text")
    public String whiteTextColor;

    static {
        Covode.recordClassIndex(59340);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public float getShowSeconds() {
        return this.showSeconds;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String getWhiteBgColor() {
        return this.whiteBgColor;
    }

    public String getWhiteTextColor() {
        return this.whiteTextColor;
    }

    public boolean isAdHollowText() {
        if (TextUtils.isEmpty(this.textColor) || !this.textColor.endsWith("00000000")) {
            return false;
        }
        return true;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setLabelName(String str) {
        this.labelName = str;
    }

    public void setLabelType(int i2) {
        this.labelType = i2;
    }

    public void setShowSeconds(float f2) {
        this.showSeconds = f2;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
