package com.bytedance.android.livesdk.model;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public class FraternityInfo {
    @c(a = "background")
    ImageModel background;
    @c(a = "font_color")
    String fontColor;
    @c(a = "level")
    long level;
    @c(a = StringSet.name)
    String name;

    static {
        Covode.recordClassIndex(11275);
    }

    public ImageModel getBackground() {
        return this.background;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public long getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.name) || this.level <= 0 || this.background == null) {
            return false;
        }
        return true;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setFontColor(String str) {
        this.fontColor = str;
    }

    public void setLevel(long j2) {
        this.level = j2;
    }

    public void setName(String str) {
        this.name = str;
    }
}
