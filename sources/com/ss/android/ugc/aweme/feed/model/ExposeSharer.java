package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class ExposeSharer implements Serializable {
    @c(a = "avatar")
    private UrlModel avatar;
    @c(a = "follow_status")
    private int followStatus;
    @c(a = "follower_status")
    private int followerStatus;
    @c(a = "is_private_account")
    private int isPrivateAccount;
    private boolean isShowed;
    @c(a = "nickname")
    private String nickname;
    @c(a = "sec_uid")
    private String secUid;
    @c(a = "uid")
    private String uid;

    static {
        Covode.recordClassIndex(59375);
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final int getFollowerStatus() {
        return this.followerStatus;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final int isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setFollowStatus(int i2) {
        this.followStatus = i2;
    }

    public final void setFollowerStatus(int i2) {
        this.followerStatus = i2;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setPrivateAccount(int i2) {
        this.isPrivateAccount = i2;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
