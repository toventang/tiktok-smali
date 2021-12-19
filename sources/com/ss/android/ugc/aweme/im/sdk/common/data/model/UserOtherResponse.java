package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;

public final class UserOtherResponse extends BaseResponse {
    @c(a = "user")
    private final User user;

    static {
        Covode.recordClassIndex(65629);
    }

    public UserOtherResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ UserOtherResponse copy$default(UserOtherResponse userOtherResponse, User user2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user2 = userOtherResponse.user;
        }
        return userOtherResponse.copy(user2);
    }

    public final User component1() {
        return this.user;
    }

    public final UserOtherResponse copy(User user2) {
        return new UserOtherResponse(user2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UserOtherResponse) && l.a(this.user, ((UserOtherResponse) obj).user);
        }
        return true;
    }

    public final int hashCode() {
        User user2 = this.user;
        if (user2 != null) {
            return user2.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserOtherResponse(user=" + this.user + ")";
    }

    public final User getUser() {
        return this.user;
    }

    public UserOtherResponse(User user2) {
        this.user = user2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserOtherResponse(User user2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : user2);
    }
}
