package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class FansStruct implements Serializable {
    @c(a = "fans_level")
    public int fansLevel;
    @c(a = "fans_name")
    public String fansName;
    @c(a = "is_fan")
    public boolean isFan;
    @c(a = "light_up")
    public boolean lightUp;

    static {
        Covode.recordClassIndex(59487);
    }

    public int getFansLevel() {
        return this.fansLevel;
    }

    public String getFansName() {
        return this.fansName;
    }

    public boolean isFan() {
        return this.isFan;
    }

    public boolean isLightUp() {
        return this.lightUp;
    }

    public void setFan(boolean z) {
        this.isFan = z;
    }

    public void setFansLevel(int i2) {
        this.fansLevel = i2;
    }

    public void setFansName(String str) {
        this.fansName = str;
    }

    public void setLightUp(boolean z) {
        this.lightUp = z;
    }
}
