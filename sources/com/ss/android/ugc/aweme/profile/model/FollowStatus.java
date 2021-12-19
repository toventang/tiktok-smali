package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class FollowStatus extends BaseResponse {
    @c(a = "contact_name")
    public String contactName;
    public int followFrom;
    @c(a = "follow_status")
    public int followStatus;
    public int followerStatus = -1;
    @c(a = "is_enterprise")
    int isEnterprise;
    public boolean isFollowChange = true;
    public boolean isFollowSucess = true;
    public String secUserId;
    public String userId;
    @c(a = "watch_status")
    public int watchStatus;

    static {
        Covode.recordClassIndex(75221);
    }

    public final boolean getIsEnterprise() {
        if (this.isEnterprise == 1) {
            return true;
        }
        return false;
    }

    public FollowStatus() {
    }

    public final boolean isCheating() {
        if (this.status_code == 2149) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "FollowStatus{watchStatus=" + this.watchStatus + ", followStatus=" + this.followStatus + ", userId='" + this.userId + '\'' + ", isFollowSucess=" + this.isFollowSucess + ", contactName=" + this.contactName + ", isEnterprise=" + this.isEnterprise + ", followFrom" + this.followFrom + '}';
    }

    public FollowStatus(String str, int i2) {
        this.userId = str;
        this.followStatus = i2;
    }

    public FollowStatus(String str, int i2, int i3) {
        this.userId = str;
        this.followStatus = i2;
        this.status_code = i3;
    }
}
