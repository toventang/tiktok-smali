package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class RelationDynamicLabel implements Serializable {
    @c(a = "count")
    int count;
    @c(a = "label_info")
    String labelInfo;
    @c(a = "nickname")
    String nickname;
    @c(a = "show_type")
    int showType;
    @c(a = "tab_label_info")
    String tabText;
    @c(a = StringSet.type)
    int type;
    @c(a = "user_id")
    String userId;

    static {
        Covode.recordClassIndex(59446);
    }

    public int getCount() {
        return this.count;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getShowType() {
        return this.showType;
    }

    public String getTabText() {
        return this.tabText;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.labelInfo)) {
            return true;
        }
        return false;
    }

    public void setCount(int i2) {
        this.count = i2;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setShowType(int i2) {
        this.showType = i2;
    }

    public void setTabText(String str) {
        this.tabText = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public RelationDynamicLabel setUserId(String str) {
        this.userId = str;
        return this;
    }
}
