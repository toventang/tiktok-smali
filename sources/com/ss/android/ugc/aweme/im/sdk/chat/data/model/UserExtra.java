package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class UserExtra {
    @c(a = "is_disable_show_follow_bar")
    private boolean isDisableShowFollowBar;
    private boolean isSayHelloLogger;
    @c(a = "uid")
    String uid;

    static {
        Covode.recordClassIndex(64093);
    }

    public UserExtra() {
    }

    public boolean getIsDisableShowFollowBar() {
        return this.isDisableShowFollowBar;
    }

    public boolean getIsSayHelloLogger() {
        return this.isSayHelloLogger;
    }

    public String getUid() {
        return this.uid;
    }

    public void setIsDisableShowFollowBar(boolean z) {
        this.isDisableShowFollowBar = z;
    }

    public void setIsSayHelloLogger(boolean z) {
        this.isSayHelloLogger = z;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public UserExtra(String str, boolean z, boolean z2) {
        this.uid = str;
        this.isDisableShowFollowBar = z;
        this.isSayHelloLogger = z2;
    }
}
