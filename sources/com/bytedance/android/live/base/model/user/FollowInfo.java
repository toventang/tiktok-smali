package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class FollowInfo {
    @c(a = "follow_status")
    long followStatus;
    @c(a = "follower_count")
    long followerCount;
    @c(a = "following_count")
    long followingCount;
    @c(a = "push_status")
    long pushStatus;

    static {
        Covode.recordClassIndex(3624);
    }

    public long getFollowStatus() {
        return this.followStatus;
    }

    public long getFollowerCount() {
        return this.followerCount;
    }

    public long getFollowingCount() {
        return this.followingCount;
    }

    public long getPushStatus() {
        return this.pushStatus;
    }

    public int hashCode() {
        long j2 = this.followingCount;
        long j3 = this.followerCount;
        long j4 = this.followStatus;
        return (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public void setFollowStatus(long j2) {
        this.followStatus = j2;
    }

    public void setFollowerCount(long j2) {
        this.followerCount = j2;
    }

    public void setFollowingCount(long j2) {
        this.followingCount = j2;
    }

    public void setPushStatus(long j2) {
        this.pushStatus = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FollowInfo followInfo = (FollowInfo) obj;
            if (this.followingCount == followInfo.followingCount && this.followerCount == followInfo.followerCount && this.followStatus == followInfo.followStatus) {
                return true;
            }
        }
        return false;
    }
}
