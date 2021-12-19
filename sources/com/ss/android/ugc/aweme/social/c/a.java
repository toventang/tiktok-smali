package com.ss.android.ugc.aweme.social.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public final class a extends IMUser {
    @c(a = "friend_type_str")
    private String friendTypeStr;
    @c(a = "is_private_account")
    private boolean isPrivateAccount;
    @c(a = "mutual_relation")
    private MutualStruct mMutualStruct;
    @c(a = "rid")
    private String requestId;
    @c(a = "social_info")
    private String socialInfo;
    private int sortIndex;

    static {
        Covode.recordClassIndex(87444);
    }

    public final String getFriendTypeStr() {
        return this.friendTypeStr;
    }

    public final MutualStruct getMMutualStruct() {
        return this.mMutualStruct;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSocialInfo() {
        return this.socialInfo;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final void setFriendTypeStr(String str) {
        this.friendTypeStr = str;
    }

    public final void setMMutualStruct(MutualStruct mutualStruct) {
        this.mMutualStruct = mutualStruct;
    }

    public final void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setSocialInfo(String str) {
        this.socialInfo = str;
    }

    public final void setSortIndex(int i2) {
        this.sortIndex = i2;
    }
}
