package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class GeneralPermission implements Serializable {
    @c(a = "following_follower_list_toast")
    public int followingFollowerListToast;
    @c(a = "follow_toast")
    public int mFollowToast;
    @c(a = "follow_toast_type")
    public int mFollowToastType;
    @c(a = "original_list")
    public int mOriginalList;
    @c(a = "profile_toast")
    public String mProfileToast;
    @c(a = "share_profile_toast")
    public String mShareProfileToast;
    @c(a = "share_toast")
    public int mShareToast;
    @c(a = "shop_toast")
    public int mShopToast;

    static {
        Covode.recordClassIndex(75225);
    }

    public int getFollowToast() {
        return this.mFollowToast;
    }

    public int getFollowToastType() {
        return this.mFollowToastType;
    }

    public int getFollowingFollowerListToast() {
        return this.followingFollowerListToast;
    }

    public int getOriginalList() {
        return this.mOriginalList;
    }

    public String getProfileToast() {
        return this.mProfileToast;
    }

    public String getShareProfileToast() {
        return this.mShareProfileToast;
    }

    public int getShareToast() {
        return this.mShareToast;
    }

    public int getShopToast() {
        return this.mShopToast;
    }
}
